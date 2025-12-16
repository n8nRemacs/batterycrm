package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.lp0;
import java.util.List;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class T0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f383309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f383310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f383311f;

    public /* synthetic */ T0(Object obj, Object obj2, Object obj3, Object obj4, int i12) {
        this.f383307b = i12;
        this.f383308c = obj;
        this.f383309d = obj2;
        this.f383310e = obj3;
        this.f383311f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383307b) {
            case 0:
                ((lp0) this.f383308c).a((Context) this.f383309d, (List) this.f383310e, (lp0.b) this.f383311f);
                break;
            case 1:
                n70.a((n70) this.f383308c, (oj1) this.f383309d, (jj1) this.f383310e, (n2) this.f383311f);
                break;
            case 2:
                oq.a((l0.h) this.f383308c, (oq) this.f383309d, (String) this.f383310e, (v21.b) this.f383311f);
                break;
            default:
                oq.a((l0.h) this.f383308c, (oq) this.f383309d, (String) this.f383310e, (ImageView) this.f383311f);
                break;
        }
    }
}
