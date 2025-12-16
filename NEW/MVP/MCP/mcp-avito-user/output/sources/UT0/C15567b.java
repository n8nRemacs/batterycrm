package Ut0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUt0/b;", "Lcom/avito/conveyor_item/a;", "LUt0/d;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ut0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15567b implements com.avito.conveyor_item.a, InterfaceC15569d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16717c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f16718d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16719e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f16720f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.g f16721g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16722h;

    public C15567b(@Y61.k String str, int i12, @Y61.k String str2, boolean z12, @Y61.k org.threeten.bp.g gVar, @Y61.k org.threeten.bp.g gVar2, boolean z13) {
        this.f16716b = str;
        this.f16717c = i12;
        this.f16718d = str2;
        this.f16719e = z12;
        this.f16720f = gVar;
        this.f16721g = gVar2;
        this.f16722h = z13;
    }

    public static C15567b a(C15567b c15567b, boolean z12, org.threeten.bp.g gVar, org.threeten.bp.g gVar2, boolean z13, int i12) {
        String str = c15567b.f16716b;
        int i13 = c15567b.f16717c;
        String str2 = c15567b.f16718d;
        if ((i12 & 8) != 0) {
            z12 = c15567b.f16719e;
        }
        boolean z14 = z12;
        if ((i12 & 16) != 0) {
            gVar = c15567b.f16720f;
        }
        org.threeten.bp.g gVar3 = gVar;
        if ((i12 & 32) != 0) {
            gVar2 = c15567b.f16721g;
        }
        org.threeten.bp.g gVar4 = gVar2;
        if ((i12 & 64) != 0) {
            z13 = c15567b.f16722h;
        }
        c15567b.getClass();
        return new C15567b(str, i13, str2, z14, gVar3, gVar4, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15567b)) {
            return false;
        }
        C15567b c15567b = (C15567b) obj;
        return L.f(this.f16716b, c15567b.f16716b) && this.f16717c == c15567b.f16717c && L.f(this.f16718d, c15567b.f16718d) && this.f16719e == c15567b.f16719e && L.f(this.f16720f, c15567b.f16720f) && L.f(this.f16721g, c15567b.f16721g) && this.f16722h == c15567b.f16722h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF272378h().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272378h() {
        return this.f16716b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16722h) + ((this.f16721g.hashCode() + ((this.f16720f.hashCode() + r.i(H.d(r.e(this.f16717c, this.f16716b.hashCode() * 31, 31), 31, this.f16718d), 31, this.f16719e)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Day(stringId=");
        sb2.append(this.f16716b);
        sb2.append(", remoteId=");
        sb2.append(this.f16717c);
        sb2.append(", title=");
        sb2.append(this.f16718d);
        sb2.append(", enabled=");
        sb2.append(this.f16719e);
        sb2.append(", from=");
        sb2.append(this.f16720f);
        sb2.append(", to=");
        sb2.append(this.f16721g);
        sb2.append(", viewEnabled=");
        return r.x(sb2, this.f16722h, ')');
    }

    public /* synthetic */ C15567b(String str, int i12, String str2, boolean z12, org.threeten.bp.g gVar, org.threeten.bp.g gVar2, boolean z13, int i13, C42822w c42822w) {
        this(str, i12, str2, z12, gVar, gVar2, (i13 & 64) != 0 ? true : z13);
    }
}
