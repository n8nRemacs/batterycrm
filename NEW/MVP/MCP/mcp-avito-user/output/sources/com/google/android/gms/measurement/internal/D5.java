package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class D5 implements M5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36997w5 f354559a;

    public D5(C36997w5 c36997w5) {
        this.f354559a = c36997w5;
    }

    @Override // com.google.android.gms.measurement.internal.M5
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C36997w5 c36997w5 = this.f354559a;
        if (!zIsEmpty) {
            c36997w5.zzl().n(new C5(this, str, str2, bundle));
            return;
        }
        I2 i22 = c36997w5.f355449l;
        if (i22 != null) {
            S1 s12 = i22.f354717i;
            I2.c(s12);
            s12.f354889f.c("AppId not known when logging event", str2);
        }
    }
}
