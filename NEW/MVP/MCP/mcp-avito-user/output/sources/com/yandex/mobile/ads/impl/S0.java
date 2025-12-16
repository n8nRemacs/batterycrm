package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.lp0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class S0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f383299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f383300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f383301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f383302g;

    public /* synthetic */ S0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i12) {
        this.f383297b = i12;
        this.f383298c = obj;
        this.f383299d = obj2;
        this.f383300e = obj3;
        this.f383301f = obj4;
        this.f383302g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, InterruptedException {
        switch (this.f383297b) {
            case 0:
                ((lp0) this.f383298c).a((CountDownLatch) this.f383299d, (ArrayList) this.f383300e, (qf) this.f383301f, (lp0.b) this.f383302g);
                break;
            default:
                fj1.b((ViewGroup) this.f383298c, (View) this.f383299d, (Context) this.f383300e, (SizeInfo) this.f383301f, (ViewTreeObserver.OnPreDrawListener) this.f383302g);
                break;
        }
    }
}
