package com.avito.android.captcha;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.captcha.s;
import com.avito.android.captcha.z;
import com.avito.android.lib.design.modal.a;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import id.C41383a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;

/* compiled from: AvitoCaptchaHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/captcha/h;", "Lcom/avito/android/captcha/r;", "Lkotlinx/coroutines/T;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.captcha.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29327h implements r, T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41383a f115040b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f115041c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f115042d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f115043e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N0 f115044f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public ComponentCallbacksC29323d f115045g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Context f115046h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f115047i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public N f115048j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N f115049k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public N f115050l;

    public C29327h(@Y61.k C41383a c41383a, @Y61.l String str, @Y61.l String str2, @Y61.k R0 r02) {
        this.f115040b = c41383a;
        this.f115041c = str;
        this.f115042d = str2;
        this.f115043e = r02.b().plus(new C29326g(kotlinx.coroutines.N.f410714t2, this));
    }

    @Override // com.avito.android.captcha.r
    @Y61.k
    public final s b() {
        Context context;
        Context context2;
        try {
            Activity activity = this.f115040b.get();
            if (activity == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Activity activity2 = activity;
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity2, R.style.Theme_DesignSystem_Re23);
            this.f115047i = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, contextThemeWrapper, new C29322c(LayoutInflater.from(contextThemeWrapper).inflate(R.layout.avito_libs_captcha_dialog, (ViewGroup) null), this, activity2));
            ComponentCallbacksC29323d componentCallbacksC29323d = this.f115045g;
            if (componentCallbacksC29323d != null && (context2 = this.f115046h) != null) {
                context2.unregisterComponentCallbacks(componentCallbacksC29323d);
            }
            this.f115045g = null;
            this.f115046h = null;
            Context applicationContext = activity2.getApplicationContext();
            this.f115046h = applicationContext;
            ComponentCallbacksC29323d componentCallbacksC29323d2 = new ComponentCallbacksC29323d(this, activity2);
            this.f115045g = componentCallbacksC29323d2;
            if (applicationContext != null) {
                applicationContext.registerComponentCallbacks(componentCallbacksC29323d2);
            }
            return s.c.f115135a;
        } catch (Exception e12) {
            V2.f318762a.a("DEFAULT_TAG", "Avito captcha init failed", e12);
            ComponentCallbacksC29323d componentCallbacksC29323d3 = this.f115045g;
            if (componentCallbacksC29323d3 != null && (context = this.f115046h) != null) {
                context.unregisterComponentCallbacks(componentCallbacksC29323d3);
            }
            this.f115045g = null;
            this.f115046h = null;
            Q0.d(this.f115043e);
            this.f115048j = null;
            this.f115049k = null;
            this.f115050l = null;
            this.f115047i = null;
            this.f115044f = null;
            return s.b.f115134a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.captcha.r
    public final void c(@Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        this.f115048j = (N) lVar;
        this.f115049k = (N) lVar2;
        this.f115050l = (N) aVar;
        com.avito.android.lib.design.modal.a aVar2 = this.f115047i;
        if (aVar2 != null) {
            com.avito.android.lib.util.g.a(aVar2);
        } else {
            lVar2.invoke(z.a.f115150a);
        }
    }

    @Override // com.avito.android.captcha.r
    public final void destroy() {
        Context context;
        com.avito.android.lib.design.modal.a aVar = this.f115047i;
        if (aVar != null) {
            aVar.dismiss();
        }
        ComponentCallbacksC29323d componentCallbacksC29323d = this.f115045g;
        if (componentCallbacksC29323d != null && (context = this.f115046h) != null) {
            context.unregisterComponentCallbacks(componentCallbacksC29323d);
        }
        this.f115045g = null;
        this.f115046h = null;
        Q0.d(this.f115043e);
        this.f115048j = null;
        this.f115049k = null;
        this.f115050l = null;
        this.f115047i = null;
        this.f115044f = null;
    }

    @Override // com.avito.android.captcha.r
    public final void e() {
        destroy();
        try {
            com.avito.android.util.concurrent.b.a(new C29325f(this));
        } catch (Exception unused) {
        }
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF399283g() {
        return this.f115043e;
    }
}
