package com.avito.beduin.v2.render.android_view.diff;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: DiffResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/j;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f337976a;

    /* renamed from: b, reason: collision with root package name */
    public int f337977b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f337978c;

    public j(int i12, int i13, boolean z12) {
        this.f337976a = i12;
        this.f337977b = i13;
        this.f337978c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f337976a == jVar.f337976a && this.f337977b == jVar.f337977b && this.f337978c == jVar.f337978c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f337978c) + r.e(this.f337977b, Integer.hashCode(this.f337976a) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PostponedUpdate(posInOwnerList=");
        sb2.append(this.f337976a);
        sb2.append(", currentPos=");
        sb2.append(this.f337977b);
        sb2.append(", removal=");
        return r.x(sb2, this.f337978c, ')');
    }
}
