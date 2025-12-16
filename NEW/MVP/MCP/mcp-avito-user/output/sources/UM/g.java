package um;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSearchState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lum/g;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lum/g$a;", "Lum/g$b;", "Lum/g$c;", "Lum/g$d;", "Lum/g$e;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class g {

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/g$a;", "Lum/g;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f440270a;

        public a(@k ApiError apiError) {
            super(null);
            this.f440270a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f440270a, ((a) obj).f440270a);
        }

        public final int hashCode() {
            return this.f440270a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f440270a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/g$b;", "Lum/g;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440271a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/g$c;", "Lum/g;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f440272a = new c();

        public c() {
            super(null);
        }
    }

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/g$d;", "Lum/g;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f440273a;

        public d(@k ArrayList arrayList) {
            super(null);
            this.f440273a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f440273a, ((d) obj).f440273a);
        }

        public final int hashCode() {
            return this.f440273a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("PreviousSearchesContent(items="), this.f440273a, ')');
        }
    }

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/g$e;", "Lum/g;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends g {

        /* renamed from: a, reason: collision with root package name */
        public final int f440274a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f440275b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f440276c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AbstractC49075a f440277d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i12, boolean z12, @k List<? extends com.avito.conveyor_item.a> list, @k AbstractC49075a abstractC49075a) {
            super(null);
            this.f440274a = i12;
            this.f440275b = z12;
            this.f440276c = list;
            this.f440277d = abstractC49075a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static e a(e eVar, ArrayList arrayList, AbstractC49075a abstractC49075a, int i12) {
            int i13 = eVar.f440274a;
            boolean z12 = (i12 & 2) != 0 ? eVar.f440275b : false;
            List list = arrayList;
            if ((i12 & 4) != 0) {
                list = eVar.f440276c;
            }
            if ((i12 & 8) != 0) {
                abstractC49075a = eVar.f440277d;
            }
            eVar.getClass();
            return new e(i13, z12, list, abstractC49075a);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f440274a == eVar.f440274a && this.f440275b == eVar.f440275b && L.f(this.f440276c, eVar.f440276c) && L.f(this.f440277d, eVar.f440277d);
        }

        public final int hashCode() {
            return this.f440277d.hashCode() + H.e(r.i(Integer.hashCode(this.f440274a) * 31, 31, this.f440275b), 31, this.f440276c);
        }

        @k
        public final String toString() {
            return "SearchResultContent(page=" + this.f440274a + ", shouldLoadNextPage=" + this.f440275b + ", items=" + this.f440276c + ", bottomSheetState=" + this.f440277d + ')';
        }
    }

    public /* synthetic */ g(C42822w c42822w) {
        this();
    }

    public g() {
    }
}
