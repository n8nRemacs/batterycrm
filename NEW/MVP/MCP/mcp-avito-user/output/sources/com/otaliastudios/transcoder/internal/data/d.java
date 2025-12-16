package com.otaliastudios.transcoder.internal.data;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import x11.d;

/* compiled from: Reader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/data/d;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d.a f366105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366106b;

    public d(@k d.a aVar, int i12) {
        this.f366105a = aVar;
        this.f366106b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f366105a, dVar.f366105a) && this.f366106b == dVar.f366106b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f366106b) + (this.f366105a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReaderData(chunk=");
        sb2.append(this.f366105a);
        sb2.append(", id=");
        return r.t(sb2, this.f366106b, ')');
    }
}
