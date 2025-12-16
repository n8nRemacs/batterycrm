package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC36656m;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class O extends P {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f349364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f349365c;

    public O(Intent intent, InterfaceC36656m interfaceC36656m) {
        this.f349364b = intent;
        this.f349365c = interfaceC36656m;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.common.api.internal.m, java.lang.Object] */
    @Override // com.google.android.gms.common.internal.P
    public final void a() {
        Intent intent = this.f349364b;
        if (intent != null) {
            this.f349365c.startActivityForResult(intent, 2);
        }
    }
}
