package com.google.android.datatransport.cct.internal;

import j.N;
import java.util.ArrayList;
import java.util.List;
import rZ0.InterfaceC47620a;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes10.dex */
final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f343013a;

    public d(ArrayList arrayList) {
        this.f343013a = arrayList;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    @N
    @InterfaceC47620a.InterfaceC12382a
    public final List<l> b() {
        return this.f343013a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f343013a.equals(((j) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f343013a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f343013a + "}";
    }
}
