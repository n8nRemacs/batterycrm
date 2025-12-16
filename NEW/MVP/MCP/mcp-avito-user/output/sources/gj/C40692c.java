package gj;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinContextConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgj/c;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gj.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C40692c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f396753a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f396754b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C40692c() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40692c)) {
            return false;
        }
        C40692c c40692c = (C40692c) obj;
        return this.f396753a == c40692c.f396753a && this.f396754b == c40692c.f396754b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f396754b) + (Boolean.hashCode(this.f396753a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinContextConfig(disableFormAggregator=");
        sb2.append(this.f396753a);
        sb2.append(", disableAdvertManagers=");
        return r.x(sb2, this.f396754b, ')');
    }

    public C40692c(boolean z12, boolean z13) {
        this.f396753a = z12;
        this.f396754b = z13;
    }

    public /* synthetic */ C40692c(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }
}
