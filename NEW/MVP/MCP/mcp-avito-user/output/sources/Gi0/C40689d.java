package gi0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pi0.C47094a;

/* compiled from: DeveloperSuggestFilterState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgi0/d;", "", "a", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gi0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40689d {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f396744f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C40689d f396745g = new C40689d(null, null, C42784z0.f406748b, "", null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final DevelopmentSuggestV1Suggest f396746a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f396747b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<i> f396748c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f396749d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C47094a f396750e;

    /* compiled from: DeveloperSuggestFilterState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgi0/d$a;", "", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gi0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40689d(@l DevelopmentSuggestV1Suggest developmentSuggestV1Suggest, @l String str, @k List<i> list, @k String str2, @l C47094a c47094a) {
        this.f396746a = developmentSuggestV1Suggest;
        this.f396747b = str;
        this.f396748c = list;
        this.f396749d = str2;
        this.f396750e = c47094a;
    }

    public static C40689d a(C40689d c40689d, DevelopmentSuggestV1Suggest developmentSuggestV1Suggest, String str, List list, String str2, C47094a c47094a, int i12) {
        if ((i12 & 1) != 0) {
            developmentSuggestV1Suggest = c40689d.f396746a;
        }
        DevelopmentSuggestV1Suggest developmentSuggestV1Suggest2 = developmentSuggestV1Suggest;
        if ((i12 & 2) != 0) {
            str = c40689d.f396747b;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            list = c40689d.f396748c;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            str2 = c40689d.f396749d;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            c47094a = c40689d.f396750e;
        }
        c40689d.getClass();
        return new C40689d(developmentSuggestV1Suggest2, str3, list2, str4, c47094a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40689d)) {
            return false;
        }
        C40689d c40689d = (C40689d) obj;
        return L.f(this.f396746a, c40689d.f396746a) && L.f(this.f396747b, c40689d.f396747b) && L.f(this.f396748c, c40689d.f396748c) && L.f(this.f396749d, c40689d.f396749d) && L.f(this.f396750e, c40689d.f396750e);
    }

    public final int hashCode() {
        DevelopmentSuggestV1Suggest developmentSuggestV1Suggest = this.f396746a;
        int iHashCode = (developmentSuggestV1Suggest == null ? 0 : developmentSuggestV1Suggest.hashCode()) * 31;
        String str = this.f396747b;
        int iD2 = H.d(H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f396748c), 31, this.f396749d);
        C47094a c47094a = this.f396750e;
        return iD2 + (c47094a != null ? c47094a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DeveloperSuggestFilterState(initialSelectedValue=" + this.f396746a + ", locationId=" + this.f396747b + ", suggestDialogItems=" + this.f396748c + ", lastSuggestQuery=" + this.f396749d + ", lastSuggestResponse=" + this.f396750e + ')';
    }
}
