package it0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScheduleCalendarTooltip.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lit0/b;", "Lit0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: it0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C42107b implements InterfaceC42106a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f405342a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f405344c;

    public C42107b(@l String str, @k String str2, @k String str3) {
        this.f405342a = str;
        this.f405343b = str2;
        this.f405344c = str3;
    }

    @Override // it0.InterfaceC42106a
    @l
    /* renamed from: a, reason: from getter */
    public final String getF405342a() {
        return this.f405342a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42107b)) {
            return false;
        }
        C42107b c42107b = (C42107b) obj;
        return L.f(this.f405342a, c42107b.f405342a) && L.f(this.f405343b, c42107b.f405343b) && L.f(this.f405344c, c42107b.f405344c);
    }

    @Override // it0.InterfaceC42106a
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF405344c() {
        return this.f405344c;
    }

    @Override // it0.InterfaceC42106a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF405343b() {
        return this.f405343b;
    }

    public final int hashCode() {
        String str = this.f405342a;
        return this.f405344c.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f405343b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleCalendarTooltip(actionTitle=");
        sb2.append(this.f405342a);
        sb2.append(", title=");
        sb2.append(this.f405343b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f405344c, ')');
    }
}
