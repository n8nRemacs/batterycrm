package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class zaj extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f350199a;

    /* renamed from: b, reason: collision with root package name */
    public int f350200b;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f350199a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zak(this);
    }
}
