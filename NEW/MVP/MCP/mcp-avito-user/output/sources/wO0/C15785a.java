package Wo0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcDispatchEditState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWo0/a;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15785a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f18045a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18046b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f18047c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f18048d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f18049e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18050f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f18051g;

    public C15785a(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, boolean z12, boolean z13) {
        this.f18045a = str;
        this.f18046b = z12;
        this.f18047c = str2;
        this.f18048d = str3;
        this.f18049e = str4;
        this.f18050f = z13;
        this.f18051g = str5;
    }

    public static C15785a a(C15785a c15785a, boolean z12) {
        return new C15785a(c15785a.f18045a, c15785a.f18047c, c15785a.f18048d, c15785a.f18049e, c15785a.f18051g, z12, c15785a.f18050f);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15785a)) {
            return false;
        }
        C15785a c15785a = (C15785a) obj;
        return L.f(this.f18045a, c15785a.f18045a) && this.f18046b == c15785a.f18046b && L.f(this.f18047c, c15785a.f18047c) && L.f(this.f18048d, c15785a.f18048d) && L.f(this.f18049e, c15785a.f18049e) && this.f18050f == c15785a.f18050f && L.f(this.f18051g, c15785a.f18051g);
    }

    public final int hashCode() {
        return this.f18051g.hashCode() + r.i(H.d(H.d(H.d(r.i(this.f18045a.hashCode() * 31, 31, this.f18046b), 31, this.f18047c), 31, this.f18048d), 31, this.f18049e), 31, this.f18050f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DispatchAdvertItem(id=");
        sb2.append(this.f18045a);
        sb2.append(", isChecked=");
        sb2.append(this.f18046b);
        sb2.append(", imageUrl=");
        sb2.append(this.f18047c);
        sb2.append(", title=");
        sb2.append(this.f18048d);
        sb2.append(", price=");
        sb2.append(this.f18049e);
        sb2.append(", isActive=");
        sb2.append(this.f18050f);
        sb2.append(", createdChats=");
        return C22026a.c(sb2, this.f18051g, ')');
    }
}
