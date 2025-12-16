package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.api.internal.InterfaceC36652k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class BinderC36677x extends InterfaceC36652k.a {

    /* renamed from: a, reason: collision with root package name */
    @RX0.a
    public final C36634e.b<Status> f349249a;

    @RX0.a
    public BinderC36677x(@j.N C36634e.b<Status> bVar) {
        this.f349249a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36652k
    @RX0.a
    public final void onResult(@j.N Status status) {
        this.f349249a.setResult(status);
    }
}
