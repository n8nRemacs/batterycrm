package it0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToolbarCalendarTooltip.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lit0/c;", "Lit0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: it0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C42108c implements InterfaceC42106a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f405345a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405346b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f405347c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f405348d;

    /* renamed from: e, reason: collision with root package name */
    public final int f405349e;

    public C42108c(@l String str, int i12, @k String str2, @k String str3, @k String str4) {
        this.f405345a = str;
        this.f405346b = str2;
        this.f405347c = str3;
        this.f405348d = str4;
        this.f405349e = i12;
    }

    @Override // it0.InterfaceC42106a
    @l
    /* renamed from: a, reason: from getter */
    public final String getF405342a() {
        return this.f405345a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42108c)) {
            return false;
        }
        C42108c c42108c = (C42108c) obj;
        return L.f(this.f405345a, c42108c.f405345a) && L.f(this.f405346b, c42108c.f405346b) && L.f(this.f405347c, c42108c.f405347c) && L.f(this.f405348d, c42108c.f405348d) && this.f405349e == c42108c.f405349e;
    }

    @Override // it0.InterfaceC42106a
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF405344c() {
        return this.f405347c;
    }

    @Override // it0.InterfaceC42106a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF405343b() {
        return this.f405346b;
    }

    public final int hashCode() {
        String str = this.f405345a;
        return Integer.hashCode(this.f405349e) + H.d(H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f405346b), 31, this.f405347c), 31, this.f405348d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToolbarCalendarTooltip(actionTitle=");
        sb2.append(this.f405345a);
        sb2.append(", title=");
        sb2.append(this.f405346b);
        sb2.append(", text=");
        sb2.append(this.f405347c);
        sb2.append(", type=");
        sb2.append(this.f405348d);
        sb2.append(", position=");
        return r.t(sb2, this.f405349e, ')');
    }
}
