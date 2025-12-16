package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.InterfaceC36652k;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcl extends InterfaceC36652k.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f350469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37028k f350470b;

    public zzcl(Boolean bool, C37028k c37028k) {
        this.f350469a = bool;
        this.f350470b = c37028k;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36652k
    public final void onResult(Status status) {
        B.a(status, this.f350469a, this.f350470b);
    }
}
