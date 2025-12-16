package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import cX0.C27123f;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.C36374g;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.s0;
import com.facebook.infer.annotation.Nullsafe;
import wW0.InterfaceC49570a;

/* compiled from: ProducerFactory.java */
@Nullsafe
/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f340370a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f340371b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager f340372c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC49570a f340373d;

    /* renamed from: e, reason: collision with root package name */
    public final com.facebook.imagepipeline.decoder.b f340374e;

    /* renamed from: f, reason: collision with root package name */
    public final com.facebook.imagepipeline.decoder.d f340375f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f340376g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f340377h;

    /* renamed from: i, reason: collision with root package name */
    public final f f340378i;

    /* renamed from: j, reason: collision with root package name */
    public final wW0.g f340379j;

    /* renamed from: k, reason: collision with root package name */
    public final C36378k f340380k;

    /* renamed from: l, reason: collision with root package name */
    public final C36378k f340381l;

    /* renamed from: m, reason: collision with root package name */
    public final B f340382m;

    /* renamed from: n, reason: collision with root package name */
    public final B f340383n;

    /* renamed from: o, reason: collision with root package name */
    public final com.facebook.imagepipeline.cache.o f340384o;

    /* renamed from: p, reason: collision with root package name */
    public final com.facebook.imagepipeline.bitmaps.f f340385p;

    /* renamed from: q, reason: collision with root package name */
    public final C36382a f340386q;

    /* renamed from: r, reason: collision with root package name */
    public final int f340387r;

    public z(Context context, InterfaceC49570a interfaceC49570a, com.facebook.imagepipeline.decoder.b bVar, com.facebook.imagepipeline.decoder.d dVar, boolean z12, boolean z13, f fVar, wW0.g gVar, B b12, B b13, C36378k c36378k, C36378k c36378k2, com.facebook.imagepipeline.cache.o oVar, com.facebook.imagepipeline.bitmaps.f fVar2, C36382a c36382a, int i12) {
        this.f340370a = context.getApplicationContext().getContentResolver();
        this.f340371b = context.getApplicationContext().getResources();
        this.f340372c = context.getApplicationContext().getAssets();
        this.f340373d = interfaceC49570a;
        this.f340374e = bVar;
        this.f340375f = dVar;
        this.f340376g = z12;
        this.f340377h = z13;
        this.f340378i = fVar;
        this.f340379j = gVar;
        this.f340383n = b12;
        this.f340382m = b13;
        this.f340380k = c36378k;
        this.f340381l = c36378k2;
        this.f340384o = oVar;
        this.f340385p = fVar2;
        new C36374g(i12);
        new C36374g(i12);
        this.f340387r = 2048;
        this.f340386q = c36382a;
    }

    public final s0 a(i0 i0Var, boolean z12, C27123f c27123f) {
        return new s0(this.f340378i.a(), this.f340379j, i0Var, z12, c27123f);
    }
}
