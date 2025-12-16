package com.avito.android.newcars_mark_model_filter.presentation.recycler.model;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import p30.AbstractC46883b;

/* compiled from: ModelItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/model/b;", "Lp30/b;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b extends AbstractC46883b {

    /* renamed from: c, reason: collision with root package name */
    public final long f207394c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f207395d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f207396e;

    public /* synthetic */ b(long j12, String str, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 4) != 0 ? false : z12, j12);
    }

    public static b a(b bVar, boolean z12) {
        long j12 = bVar.f207394c;
        String str = bVar.f207395d;
        bVar.getClass();
        return new b(str, z12, j12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f207394c == bVar.f207394c && L.f(this.f207395d, bVar.f207395d) && this.f207396e == bVar.f207396e;
    }

    @Override // p30.AbstractC46883b, TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF207394c() {
        return this.f207394c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207396e) + H.d(Long.hashCode(this.f207394c) * 31, 31, this.f207395d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelOptionItem(id=");
        sb2.append(this.f207394c);
        sb2.append(", text=");
        sb2.append(this.f207395d);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f207396e, ')');
    }

    public b(@Y61.k String str, boolean z12, long j12) {
        super(j12);
        this.f207394c = j12;
        this.f207395d = str;
        this.f207396e = z12;
    }
}
