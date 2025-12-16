package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class M extends P {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f349351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f349352c;

    public M(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f349351b = intent;
        this.f349352c = googleApiActivity;
    }

    @Override // com.google.android.gms.common.internal.P
    public final void a() {
        Intent intent = this.f349351b;
        if (intent != null) {
            this.f349352c.startActivityForResult(intent, 2);
        }
    }
}
