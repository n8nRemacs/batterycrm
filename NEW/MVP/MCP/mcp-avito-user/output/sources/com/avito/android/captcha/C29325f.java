package com.avito.android.captcha;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoCaptchaHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.captcha.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29325f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29327h f115038l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29325f(C29327h c29327h) {
        super(0);
        this.f115038l = c29327h;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Activity activity = this.f115038l.f115040b.get();
        if (activity == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Theme_DesignSystem_Re23);
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, contextThemeWrapper, new C29324e(LayoutInflater.from(contextThemeWrapper).inflate(R.layout.avito_libs_captcha_success_dialog, (ViewGroup) null)));
        com.avito.android.lib.util.g.a(aVarC);
        new Handler(Looper.getMainLooper()).postDelayed(new com.avito.android.app.coldstart.d(aVarC, 11), 1000L);
        return G0.f406611a;
    }
}
