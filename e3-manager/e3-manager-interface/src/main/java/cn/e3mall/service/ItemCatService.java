package cn.e3mall.service;

import java.util.List;

import cn.e3mall.common.EasyUITreeNode;

public interface ItemCatService {

	List<EasyUITreeNode> getItemCat(long parentId);
}
