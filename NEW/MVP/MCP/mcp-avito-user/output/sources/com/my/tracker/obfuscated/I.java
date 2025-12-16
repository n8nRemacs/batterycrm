package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.target.AbstractC37822y0;
import e11.C39901r0;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class I implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365285b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f365286c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f365287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f365288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f365289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f365290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f365291h;

    public /* synthetic */ I(AbstractC37822y0.a aVar, String str, C39901r0 c39901r0, Map map, Context context, e11.A0 a02) {
        this.f365288e = aVar;
        this.f365286c = str;
        this.f365289f = c39901r0;
        this.f365287d = map;
        this.f365290g = context;
        this.f365291h = a02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365285b) {
            case 0:
                ((C37830d) this.f365288e).a(this.f365289f, this.f365286c, (String) this.f365290g, (String) this.f365291h, this.f365287d);
                break;
            default:
                ((AbstractC37822y0.a) this.f365288e).b(this.f365286c, (C39901r0) this.f365289f, this.f365287d, (Context) this.f365290g, (e11.A0) this.f365291h);
                break;
        }
    }

    public /* synthetic */ I(C37830d c37830d, Object obj, String str, String str2, String str3, Map map) {
        this.f365288e = c37830d;
        this.f365289f = obj;
        this.f365286c = str;
        this.f365290g = str2;
        this.f365291h = str3;
        this.f365287d = map;
    }
}
