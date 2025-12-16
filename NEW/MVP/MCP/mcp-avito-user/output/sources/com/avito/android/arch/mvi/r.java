package com.avito.android.arch.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FeatureConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/arch/mvi/r;", "", "a", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class r {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f92017c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final r f92018d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92019a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92020b;

    /* compiled from: FeatureConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/arch/mvi/r$a;", "", "<init>", "()V", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42822w c42822w = null;
        f92017c = new a(c42822w);
        boolean z12 = false;
        f92018d = new r(z12, z12, 3, c42822w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f92019a == rVar.f92019a && this.f92020b == rVar.f92020b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92020b) + (Boolean.hashCode(this.f92019a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureConfig(actionColdBufferEnabled=");
        sb2.append(this.f92019a);
        sb2.append(", eventsColdBufferEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f92020b, ')');
    }

    public r(boolean z12, boolean z13) {
        this.f92019a = z12;
        this.f92020b = z13;
    }

    public /* synthetic */ r(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? false : z13);
    }
}
