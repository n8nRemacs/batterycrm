package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
@RestrictTo
/* loaded from: classes6.dex */
public class D {

    /* renamed from: c, reason: collision with root package name */
    public float f356723c;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final WeakReference<b> f356725e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public com.google.android.material.resources.d f356726f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f356721a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.resources.g f356722b = new a();

    /* renamed from: d, reason: collision with root package name */
    public boolean f356724d = true;

    /* compiled from: TextDrawableHelper.java */
    public class a extends com.google.android.material.resources.g {
        public a() {
        }

        @Override // com.google.android.material.resources.g
        public final void a(int i12) {
            D d12 = D.this;
            d12.f356724d = true;
            b bVar = d12.f356725e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.google.android.material.resources.g
        public final void b(@j.N Typeface typeface, boolean z12) {
            if (z12) {
                return;
            }
            D d12 = D.this;
            d12.f356724d = true;
            b bVar = d12.f356725e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        @j.N
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public D(@j.P b bVar) {
        this.f356725e = new WeakReference<>(null);
        this.f356725e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.f356724d) {
            return this.f356723c;
        }
        float fMeasureText = str == null ? 0.0f : this.f356721a.measureText((CharSequence) str, 0, str.length());
        this.f356723c = fMeasureText;
        this.f356724d = false;
        return fMeasureText;
    }

    public final void b(@j.P com.google.android.material.resources.d dVar, Context context) {
        if (this.f356726f != dVar) {
            this.f356726f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f356721a;
                com.google.android.material.resources.g gVar = this.f356722b;
                dVar.f(context, textPaint, gVar);
                b bVar = this.f356725e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, gVar);
                this.f356724d = true;
            }
            b bVar2 = this.f356725e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
