package com.avito.android.inline_filters.dialog.category_nodes;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_tree.CategoryTreeNode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryTreeConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/v;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class v {
    @Y61.l
    public static TreeNode a(@Y61.k CategoryTreeNode categoryTreeNode) {
        DeepLink deeplink;
        Integer id2 = categoryTreeNode.getId();
        if (id2 == null) {
            return null;
        }
        int iIntValue = id2.intValue();
        String title = categoryTreeNode.getTitle();
        if (title == null || (deeplink = categoryTreeNode.getDeeplink()) == null) {
            return null;
        }
        Integer categoryId = categoryTreeNode.getCategoryId();
        Boolean bool = categoryTreeNode.getDefault();
        return new TreeNode(categoryId, deeplink, bool != null ? bool.booleanValue() : false, iIntValue, categoryTreeNode.getMicroCategoryId(), title, categoryTreeNode.getParentId(), categoryTreeNode.getIconUrl(), categoryTreeNode.getCategoryImage(), categoryTreeNode.getCategoryImageBackgroundColor());
    }
}
