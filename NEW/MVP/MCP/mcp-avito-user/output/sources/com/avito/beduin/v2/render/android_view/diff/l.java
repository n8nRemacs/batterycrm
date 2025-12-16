package com.avito.beduin.v2.render.android_view.diff;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Diff.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/diff/l;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f337983a;

    /* renamed from: b, reason: collision with root package name */
    public final int f337984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f337985c;

    /* renamed from: d, reason: collision with root package name */
    public final int f337986d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f337987e;

    public l(int i12, int i13, int i14, int i15, boolean z12) {
        this.f337983a = i12;
        this.f337984b = i13;
        this.f337985c = i14;
        this.f337986d = i15;
        this.f337987e = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f337983a == lVar.f337983a && this.f337984b == lVar.f337984b && this.f337985c == lVar.f337985c && this.f337986d == lVar.f337986d && this.f337987e == lVar.f337987e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f337987e) + r.e(this.f337986d, r.e(this.f337985c, r.e(this.f337984b, Integer.hashCode(this.f337983a) * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Snake(startX=");
        sb2.append(this.f337983a);
        sb2.append(", startY=");
        sb2.append(this.f337984b);
        sb2.append(", endX=");
        sb2.append(this.f337985c);
        sb2.append(", endY=");
        sb2.append(this.f337986d);
        sb2.append(", reverse=");
        return r.x(sb2, this.f337987e, ')');
    }

    public /* synthetic */ l(int i12, int i13, int i14, int i15, boolean z12, int i16, C42822w c42822w) {
        this(i12, i13, i14, i15, (i16 & 16) != 0 ? false : z12);
    }
}
