package com.avito.android.sbc.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchFragmentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/di/c;", "", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: CreateDiscountDispatchFragmentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/di/c$a;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        c a(@Y61.k d dVar, @h31.b @Y61.k CreateDiscountDispatchFragment createDiscountDispatchFragment, @h31.b @Y61.k CreateDiscountDispatchArg createDiscountDispatchArg, @h31.b @Y61.k Resources resources, @h31.b @Y61.k C28478k c28478k, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k CreateDiscountDispatchFragment createDiscountDispatchFragment);
}
