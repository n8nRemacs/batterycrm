package com.avito.android.cpx_promo.v2.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo.v2.CpxPromoV2Fragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;
import kotlin.Metadata;

/* compiled from: CpxPromoV2Component.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/v2/di/a;", "", "a", "b", "c", "d", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CpxPromoV2Component.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/di/a$a;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.avito.android.cpx_promo.v2.di.a$a, reason: collision with other inner class name */
    public @interface InterfaceC3791a {
    }

    /* compiled from: CpxPromoV2Component.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/di/a$b;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
    }

    /* compiled from: CpxPromoV2Component.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/di/a$c;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    /* compiled from: CpxPromoV2Component.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/di/a$d;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        @Y61.k
        a a(@Y61.k f fVar, @h31.b @Y61.k r rVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k @InterfaceC3791a String str, @c @h31.b @Y61.k String str2, @b @h31.b @Y61.k String str3);
    }

    void a(@Y61.k CpxPromoV2Fragment cpxPromoV2Fragment);
}
