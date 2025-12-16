package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class U3 implements M5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354936a;

    public U3(C36967s3 c36967s3) {
        this.f354936a = c36967s3;
    }

    @Override // com.google.android.gms.measurement.internal.M5
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C36967s3 c36967s3 = this.f354936a;
        if (zIsEmpty) {
            c36967s3.b0("auto", "_err", bundle);
        } else {
            c36967s3.f355183a.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }
}
