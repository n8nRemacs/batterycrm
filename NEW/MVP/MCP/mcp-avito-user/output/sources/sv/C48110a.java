package sV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import j.InterfaceC42156l;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DotStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsV/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48110a {

    /* renamed from: a, reason: collision with root package name */
    public final int f437670a;

    /* renamed from: b, reason: collision with root package name */
    public final int f437671b;

    /* renamed from: c, reason: collision with root package name */
    public final int f437672c;

    /* renamed from: d, reason: collision with root package name */
    public final int f437673d;

    public C48110a() {
        this(0, 0, 0, 0, 15, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48110a)) {
            return false;
        }
        C48110a c48110a = (C48110a) obj;
        return this.f437670a == c48110a.f437670a && this.f437671b == c48110a.f437671b && this.f437672c == c48110a.f437672c && this.f437673d == c48110a.f437673d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f437673d) + r.e(this.f437672c, r.e(this.f437671b, Integer.hashCode(this.f437670a) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DotStyle(width=");
        sb2.append(this.f437670a);
        sb2.append(", height=");
        sb2.append(this.f437671b);
        sb2.append(", color=");
        sb2.append(this.f437672c);
        sb2.append(", cornerRadius=");
        return r.t(sb2, this.f437673d, ')');
    }

    public C48110a(@U int i12, @U int i13, @InterfaceC42156l int i14, @U int i15) {
        this.f437670a = i12;
        this.f437671b = i13;
        this.f437672c = i14;
        this.f437673d = i15;
    }

    public /* synthetic */ C48110a(int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? 0 : i12, (i16 & 2) != 0 ? 0 : i13, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
