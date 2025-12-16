package yh;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uZ.d;

/* compiled from: BblConfigureState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lyh/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C50251c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f443456m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final C50251c f443457n = new C50251c(null, null, null, null, null, null, C42784z0.f406748b, null, false, false, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final d f443458b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final MnzFloatingFooter f443459c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final MnzFloatingFooterContact f443460d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final MnzFloatingFooterContact f443461e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Long f443462f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f443463g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f443464h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ApiError f443465i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f443466j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f443467k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Integer f443468l;

    /* compiled from: BblConfigureState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyh/c$a;", "", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yh.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C50251c(@l d dVar, @l MnzFloatingFooter mnzFloatingFooter, @l MnzFloatingFooterContact mnzFloatingFooterContact, @l MnzFloatingFooterContact mnzFloatingFooterContact2, @l Long l12, @l UniversalImage universalImage, @k List<? extends com.avito.conveyor_item.a> list, @l ApiError apiError, boolean z12, boolean z13, @l Integer num) {
        this.f443458b = dVar;
        this.f443459c = mnzFloatingFooter;
        this.f443460d = mnzFloatingFooterContact;
        this.f443461e = mnzFloatingFooterContact2;
        this.f443462f = l12;
        this.f443463g = universalImage;
        this.f443464h = list;
        this.f443465i = apiError;
        this.f443466j = z12;
        this.f443467k = z13;
        this.f443468l = num;
    }

    public static C50251c a(C50251c c50251c, MnzFloatingFooterContact mnzFloatingFooterContact, Long l12, ArrayList arrayList, ApiError apiError, boolean z12, boolean z13, Integer num, int i12) {
        d dVar = c50251c.f443458b;
        MnzFloatingFooter mnzFloatingFooter = c50251c.f443459c;
        MnzFloatingFooterContact mnzFloatingFooterContact2 = c50251c.f443460d;
        MnzFloatingFooterContact mnzFloatingFooterContact3 = (i12 & 8) != 0 ? c50251c.f443461e : mnzFloatingFooterContact;
        Long l13 = (i12 & 16) != 0 ? c50251c.f443462f : l12;
        UniversalImage universalImage = c50251c.f443463g;
        List<com.avito.conveyor_item.a> list = (i12 & 64) != 0 ? c50251c.f443464h : arrayList;
        ApiError apiError2 = (i12 & 128) != 0 ? c50251c.f443465i : apiError;
        boolean z14 = (i12 & 256) != 0 ? c50251c.f443466j : z12;
        boolean z15 = (i12 & 512) != 0 ? c50251c.f443467k : z13;
        Integer num2 = (i12 & 1024) != 0 ? c50251c.f443468l : num;
        c50251c.getClass();
        return new C50251c(dVar, mnzFloatingFooter, mnzFloatingFooterContact2, mnzFloatingFooterContact3, l13, universalImage, list, apiError2, z14, z15, num2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50251c)) {
            return false;
        }
        C50251c c50251c = (C50251c) obj;
        return L.f(this.f443458b, c50251c.f443458b) && L.f(this.f443459c, c50251c.f443459c) && L.f(this.f443460d, c50251c.f443460d) && L.f(this.f443461e, c50251c.f443461e) && L.f(this.f443462f, c50251c.f443462f) && L.f(this.f443463g, c50251c.f443463g) && L.f(this.f443464h, c50251c.f443464h) && L.f(this.f443465i, c50251c.f443465i) && this.f443466j == c50251c.f443466j && this.f443467k == c50251c.f443467k && L.f(this.f443468l, c50251c.f443468l);
    }

    public final int hashCode() {
        d dVar = this.f443458b;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        MnzFloatingFooter mnzFloatingFooter = this.f443459c;
        int iHashCode2 = (iHashCode + (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode())) * 31;
        MnzFloatingFooterContact mnzFloatingFooterContact = this.f443460d;
        int iHashCode3 = (iHashCode2 + (mnzFloatingFooterContact == null ? 0 : mnzFloatingFooterContact.hashCode())) * 31;
        MnzFloatingFooterContact mnzFloatingFooterContact2 = this.f443461e;
        int iHashCode4 = (iHashCode3 + (mnzFloatingFooterContact2 == null ? 0 : mnzFloatingFooterContact2.hashCode())) * 31;
        Long l12 = this.f443462f;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        UniversalImage universalImage = this.f443463g;
        int iE2 = H.e((iHashCode5 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f443464h);
        ApiError apiError = this.f443465i;
        int i12 = r.i(r.i((iE2 + (apiError == null ? 0 : apiError.hashCode())) * 31, 31, this.f443466j), 31, this.f443467k);
        Integer num = this.f443468l;
        return i12 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BblConfigureState(navbar=");
        sb2.append(this.f443458b);
        sb2.append(", footer=");
        sb2.append(this.f443459c);
        sb2.append(", initialContact=");
        sb2.append(this.f443460d);
        sb2.append(", currentContact=");
        sb2.append(this.f443461e);
        sb2.append(", configId=");
        sb2.append(this.f443462f);
        sb2.append(", image=");
        sb2.append(this.f443463g);
        sb2.append(", items=");
        sb2.append(this.f443464h);
        sb2.append(", error=");
        sb2.append(this.f443465i);
        sb2.append(", isLoading=");
        sb2.append(this.f443466j);
        sb2.append(", isOnScreenLoading=");
        sb2.append(this.f443467k);
        sb2.append(", clickedButtonId=");
        return s.j(sb2, this.f443468l, ')');
    }
}
