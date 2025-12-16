package com.yandex.metrica.coreutils.services;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UtilityServiceConfiguration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/metrica/coreutils/services/g;", "", "core-utils_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f377657a;

    /* renamed from: b, reason: collision with root package name */
    public final long f377658b;

    public g() {
        this(0L, 0L, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f377657a == gVar.f377657a && this.f377658b == gVar.f377658b;
    }

    public final int hashCode() {
        long j12 = this.f377657a;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        long j13 = this.f377658b;
        return i12 + ((int) ((j13 >>> 32) ^ j13));
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UtilityServiceConfiguration(initialConfigTime=");
        sb2.append(this.f377657a);
        sb2.append(", lastUpdateConfigTime=");
        return AK.c.j(this.f377658b, ")", sb2);
    }

    public g(long j12, long j13) {
        this.f377657a = j12;
        this.f377658b = j13;
    }

    public /* synthetic */ g(long j12, long j13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? 0L : j13);
    }
}
