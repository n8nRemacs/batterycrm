package com.google.android.material.resources;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import j.N;

/* compiled from: TextAppearance.java */
/* loaded from: classes6.dex */
class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f357003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f357004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f357005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f357006d;

    public e(d dVar, Context context, TextPaint textPaint, g gVar) {
        this.f357006d = dVar;
        this.f357003a = context;
        this.f357004b = textPaint;
        this.f357005c = gVar;
    }

    @Override // com.google.android.material.resources.g
    public final void a(int i12) {
        this.f357005c.a(i12);
    }

    @Override // com.google.android.material.resources.g
    public final void b(@N Typeface typeface, boolean z12) {
        this.f357006d.g(this.f357003a, this.f357004b, typeface);
        this.f357005c.b(typeface, z12);
    }
}
