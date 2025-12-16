package com.google.android.gms.internal.auth;

import I41.g;
import PX0.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzbv implements b.InterfaceC0849b {

    /* renamed from: b, reason: collision with root package name */
    public final Status f350021b;

    /* renamed from: c, reason: collision with root package name */
    public final String f350022c;

    public zzbv(@g Status status) {
        C36729v.j(status);
        this.f350021b = status;
        this.f350022c = "";
    }

    public final String getSpatulaHeader() {
        return this.f350022c;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f350021b;
    }

    public zzbv(@g String str) {
        C36729v.j(str);
        this.f350022c = str;
        this.f350021b = Status.f348900f;
    }
}
