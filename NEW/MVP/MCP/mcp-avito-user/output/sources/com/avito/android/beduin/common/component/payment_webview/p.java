package com.avito.android.beduin.common.component.payment_webview;

import android.app.Application;
import com.yatatsu.powerwebview.PowerWebView;
import java.util.HashMap;
import javax.inject.Inject;
import ji.InterfaceC42385a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinWebPaymentViewModel.kt */
@com.avito.android.di.B
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/p;", "Lji/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements InterfaceC42385a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f101890a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f101891b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, PowerWebView> f101892c = new HashMap<>();

    @Inject
    public p(@Y61.k Application application) {
        this.f101890a = application;
    }

    @Override // ji.InterfaceC42385a
    public final void onCleared() {
    }
}
