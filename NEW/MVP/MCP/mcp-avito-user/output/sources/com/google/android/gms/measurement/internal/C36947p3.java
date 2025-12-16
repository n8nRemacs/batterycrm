package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36947p3 implements Q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I2 f355307a;

    public C36947p3(I2 i22) {
        this.f355307a = i22;
    }

    @Override // com.google.android.gms.measurement.internal.Q1
    public final boolean zza() {
        I2 i22 = this.f355307a;
        if (!TextUtils.isEmpty(i22.f354710b)) {
            return false;
        }
        S1 s12 = i22.f354717i;
        I2.c(s12);
        return s12.m(3);
    }
}
