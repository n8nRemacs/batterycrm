package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC36652k;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzx extends InterfaceC36652k.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f350192a;

    public zzx(C37028k c37028k) {
        this.f350192a = c37028k;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36652k
    public final void onResult(Status status) {
        zzab.d(status, null, this.f350192a);
    }
}
