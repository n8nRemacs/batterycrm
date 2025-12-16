package com.avito.android.rubricator.list.category.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.rubricator.list.category.CategoryListFragment;
import com.avito.android.rubricator.list.category.model.CategoryListArguments;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: CategoryListComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rubricator/list/category/di/a;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: CategoryListComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/list/category/di/a$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rubricator.list.category.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC7661a {
        @k
        a a(@k b bVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k CategoryListArguments categoryListArguments, @h31.b @k CategoryListFragment categoryListFragment, @h31.b @k Resources resources, @h31.b @k C28478k c28478k);
    }

    void a(@k CategoryListFragment categoryListFragment);
}
