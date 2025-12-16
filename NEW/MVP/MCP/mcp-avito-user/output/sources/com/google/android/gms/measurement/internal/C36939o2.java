package com.google.android.gms.measurement.internal;

import aY0.C19842b;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.o2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36939o2 {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f355291a;

    public C36939o2(C36997w5 c36997w5) {
        this.f355291a = c36997w5.f355449l;
    }

    @j.k0
    public final boolean a() {
        I2 i22 = this.f355291a;
        try {
            C19842b c19842bA = aY0.c.a(i22.f354709a);
            if (c19842bA != null) {
                return c19842bA.b("com.android.vending", 128).versionCode >= 80837300;
            }
            S1 s12 = i22.f354717i;
            I2.c(s12);
            s12.f354897n.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e12) {
            S1 s13 = i22.f354717i;
            I2.c(s13);
            s13.f354897n.c("Failed to retrieve Play Store version for Install Referrer", e12);
            return false;
        }
    }
}
