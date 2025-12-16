package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* compiled from: CancelableFontCallback.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f356984a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC10643a f356985b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f356986c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: com.google.android.material.resources.a$a, reason: collision with other inner class name */
    public interface InterfaceC10643a {
        void a(Typeface typeface);
    }

    public a(InterfaceC10643a interfaceC10643a, Typeface typeface) {
        this.f356984a = typeface;
        this.f356985b = interfaceC10643a;
    }

    @Override // com.google.android.material.resources.g
    public final void a(int i12) {
        if (this.f356986c) {
            return;
        }
        this.f356985b.a(this.f356984a);
    }

    @Override // com.google.android.material.resources.g
    public final void b(Typeface typeface, boolean z12) {
        if (this.f356986c) {
            return;
        }
        this.f356985b.a(typeface);
    }
}
