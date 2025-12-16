package com.avito.avcalls.network_test;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkTestResultFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/network_test/l;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f333020a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f333021b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f333022c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f333023d;

    public l(@Y61.k String str, @Y61.k i iVar, @Y61.k a aVar, @Y61.k String str2) {
        this.f333020a = str;
        this.f333021b = iVar;
        this.f333022c = aVar;
        this.f333023d = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f333020a, lVar.f333020a) && L.f(this.f333021b, lVar.f333021b) && L.f(this.f333022c, lVar.f333022c) && L.f(this.f333023d, lVar.f333023d);
    }

    public final int hashCode() {
        return this.f333023d.hashCode() + ((this.f333022c.hashCode() + ((this.f333021b.hashCode() + (this.f333020a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkTestResult(id=");
        sb2.append(this.f333020a);
        sb2.append(", data=");
        sb2.append(this.f333021b);
        sb2.append(", config=");
        sb2.append(this.f333022c);
        sb2.append(", report=");
        return C22026a.c(sb2, this.f333023d, ')');
    }
}
