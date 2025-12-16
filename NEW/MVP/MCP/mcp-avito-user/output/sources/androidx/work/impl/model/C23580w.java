package androidx.work.impl.model;

import kotlin.Metadata;

/* compiled from: WorkSpec.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/model/w;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.model.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C23580w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f55889a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55890b;

    public C23580w(@Y61.k String str, int i12) {
        this.f55889a = str;
        this.f55890b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23580w)) {
            return false;
        }
        C23580w c23580w = (C23580w) obj;
        return kotlin.jvm.internal.L.f(this.f55889a, c23580w.f55889a) && this.f55890b == c23580w.f55890b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55890b) + (this.f55889a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f55889a);
        sb2.append(", generation=");
        return androidx.appcompat.app.r.t(sb2, this.f55890b, ')');
    }
}
