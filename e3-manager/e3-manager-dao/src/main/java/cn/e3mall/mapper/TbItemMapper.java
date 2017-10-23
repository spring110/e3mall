package cn.e3mall.mapper;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
    int countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemExample example);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    /**
     * 根据TbItem对象更新对象
     * @param record
     * @return
     */
    int updateByPrimaryKey(TbItem record);

    /**
     * 根据id数组及status批量更新商品状态
     * @param array
     * @param status
     */
	void updateItemsStatus(@Param("idsArr") Long[] idsArr, @Param("status") byte status);
}