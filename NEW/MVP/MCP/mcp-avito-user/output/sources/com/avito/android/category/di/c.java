package com.avito.android.category.di;

import Pn.InterfaceC14813a;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.category.CategoryArguments;
import com.avito.android.category.CategoryFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CategoryComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/di/c;", "", "a", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: CategoryComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/di/c$a;", "", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        c build();

        @h31.b
        @Y61.k
        a c(@Y61.k Y41.l<? super InterfaceC14813a, G0> lVar);

        @Y61.k
        a d(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a e(@Y61.k CategoryArguments categoryArguments);

        @h31.b
        @Y61.k
        a f(@Y61.k C28478k c28478k);

        @Y61.k
        a g(@Y61.k d dVar);
    }

    void a(@Y61.k CategoryFragment categoryFragment);
}
