package com.avito.android.tariff_lf_constructor.configure.creating.standard.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.tariff_lf_constructor.configure.MnzTariffConstructorScreen;
import com.avito.android.tariff_lf_constructor.configure.creating.standard.ConstructorTariffActivity;
import cv.InterfaceC39417a;
import gD0.InterfaceC40574b;
import h31.d;
import kotlin.Metadata;

/* compiled from: ConstructorTariffComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/creating/standard/di/a;", "", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@d
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: ConstructorTariffComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/creating/standard/di/a$a;", "", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC9161a {
        @k
        InterfaceC9161a a(@k InterfaceC39417a interfaceC39417a);

        @h31.b
        @k
        InterfaceC9161a b(@k Resources resources);

        @k
        a build();

        @k
        InterfaceC9161a c(@k InterfaceC40574b interfaceC40574b);

        @h31.b
        @k
        InterfaceC9161a d(@k MnzTariffConstructorScreen mnzTariffConstructorScreen);
    }

    void a(@k ConstructorTariffActivity constructorTariffActivity);
}
