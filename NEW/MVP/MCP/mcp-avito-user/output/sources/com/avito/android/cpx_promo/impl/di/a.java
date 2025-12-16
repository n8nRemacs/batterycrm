package com.avito.android.cpx_promo.impl.di;

import Y61.k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo.impl.CpxPromoFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;
import kotlin.Metadata;

/* compiled from: CpxPromoComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/impl/di/a;", "", "a", "b", "c", "d", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CpxPromoComponent.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/di/a$a;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.avito.android.cpx_promo.impl.di.a$a, reason: collision with other inner class name */
    public @interface InterfaceC3782a {
    }

    /* compiled from: CpxPromoComponent.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/di/a$b;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
    }

    /* compiled from: CpxPromoComponent.kt */
    @Qualifier
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/di/a$c;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    /* compiled from: CpxPromoComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/di/a$d;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        @k
        a a(@k com.avito.android.cpx_promo.impl.di.d dVar, @h31.b @k r rVar, @k InterfaceC39417a interfaceC39417a, @InterfaceC3782a @h31.b @k String str, @h31.b @c @k String str2, @h31.b @k @b String str3);
    }

    void a(@k CpxPromoFragment cpxPromoFragment);
}
