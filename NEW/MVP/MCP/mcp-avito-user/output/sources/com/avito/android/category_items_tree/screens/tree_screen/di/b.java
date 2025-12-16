package com.avito.android.category_items_tree.screens.tree_screen.di;

import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.category_items_tree.screens.tree_screen.TreeActivity;
import com.avito.android.category_items_tree.screens.tree_screen.TreeArguments;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.di.module.InterfaceC30106l7;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: TreeComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/di/b;", "", "a", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: TreeComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/di/b$a;", "", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k c cVar, @k InterfaceC39417a interfaceC39417a, @k InterfaceC30106l7 interfaceC30106l7, @h31.b @k C28478k c28478k, @h31.b @k TreeArguments treeArguments);
    }

    void a(@k TreeActivity treeActivity);
}
