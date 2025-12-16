package com.avito.android.rating.details.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.rating_details_mvi.RatingAspectsEntry;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final C7422b f247417n = new C7422b(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final b f247418o;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f247419b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f247420c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Uri f247421d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final d f247422e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f247423f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final RatingAspectsEntry f247424g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<SearchParametersEntry.SearchParametersBlock> f247425h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<String> f247426i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final c f247427j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Action f247428k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final e f247429l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f247430m;

    /* compiled from: RatingDetailsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b$a;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f247431a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Action f247432b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f247433c;

        public a(@k PrintableText printableText, @l Action action, boolean z12) {
            this.f247431a = printableText;
            this.f247432b = action;
            this.f247433c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f247431a, aVar.f247431a) && L.f(this.f247432b, aVar.f247432b) && this.f247433c == aVar.f247433c;
        }

        public final int hashCode() {
            int iHashCode = this.f247431a.hashCode() * 31;
            Action action = this.f247432b;
            return Boolean.hashCode(this.f247433c) + ((iHashCode + (action == null ? 0 : action.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CommentButton(title=");
            sb2.append(this.f247431a);
            sb2.append(", action=");
            sb2.append(this.f247432b);
            sb2.append(", isVisible=");
            return r.x(sb2, this.f247433c, ')');
        }
    }

    /* compiled from: RatingDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b$b;", "", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.details.mvi.entity.b$b, reason: collision with other inner class name */
    public static final class C7422b {
        public /* synthetic */ C7422b(C42822w c42822w) {
            this();
        }

        public C7422b() {
        }
    }

    /* compiled from: RatingDetailsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b$c;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.conveyor_item.a f247434a;

        /* renamed from: b, reason: collision with root package name */
        public final int f247435b;

        public c(@k com.avito.conveyor_item.a aVar, int i12) {
            this.f247434a = aVar;
            this.f247435b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f247434a, cVar.f247434a) && this.f247435b == cVar.f247435b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f247435b) + (this.f247434a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeletedReview(item=");
            sb2.append(this.f247434a);
            sb2.append(", position=");
            return r.t(sb2, this.f247435b, ')');
        }
    }

    /* compiled from: RatingDetailsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b$d;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f247436a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f247437b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f247438c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a.i f247439d;

        public d(@k PrintableText printableText, @k PrintableText printableText2, @l String str, @l a.i iVar) {
            this.f247436a = printableText;
            this.f247437b = printableText2;
            this.f247438c = str;
            this.f247439d = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f247436a.equals(dVar.f247436a) && this.f247437b.equals(dVar.f247437b) && L.f(this.f247438c, dVar.f247438c) && L.f(this.f247439d, dVar.f247439d);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f247437b, this.f247436a.hashCode() * 31, 31);
            String str = this.f247438c;
            int iHashCode = (iF2 + (str == null ? 0 : str.hashCode())) * 31;
            a.i iVar = this.f247439d;
            return iHashCode + (iVar != null ? iVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "EmptyState(title=" + this.f247436a + ", text=" + this.f247437b + ", buttonTitle=" + this.f247438c + ", buttonAction=" + this.f247439d + ')';
        }
    }

    /* compiled from: RatingDetailsState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b$e;", "", "a", "b", "Lcom/avito/android/rating/details/mvi/entity/b$e$a;", "Lcom/avito/android/rating/details/mvi/entity/b$e$b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* compiled from: RatingDetailsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b$e$a;", "Lcom/avito/android/rating/details/mvi/entity/b$e;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f247440a = new a();
        }

        /* compiled from: RatingDetailsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/b$e$b;", "Lcom/avito/android/rating/details/mvi/entity/b$e;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating.details.mvi.entity.b$e$b, reason: collision with other inner class name */
        public static final class C7423b implements e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C7423b f247441a = new C7423b();
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f247418o = new b(c42784z0, c42784z0, null, null, new a(com.avito.android.printable_text.b.c(R.string.comment_button, new Serializable[0]), null, false), null, null, null, null, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k List<? extends com.avito.conveyor_item.a> list, @k List<? extends com.avito.conveyor_item.a> list2, @l Uri uri, @l d dVar, @k a aVar, @l RatingAspectsEntry ratingAspectsEntry, @l List<? extends SearchParametersEntry.SearchParametersBlock> list3, @l List<String> list4, @l c cVar, @l Action action, @l e eVar, boolean z12) {
        this.f247419b = list;
        this.f247420c = list2;
        this.f247421d = uri;
        this.f247422e = dVar;
        this.f247423f = aVar;
        this.f247424g = ratingAspectsEntry;
        this.f247425h = list3;
        this.f247426i = list4;
        this.f247427j = cVar;
        this.f247428k = action;
        this.f247429l = eVar;
        this.f247430m = z12;
    }

    public static b a(b bVar, List list, List list2, Uri uri, d dVar, a aVar, RatingAspectsEntry ratingAspectsEntry, List list3, List list4, c cVar, Action action, e eVar, boolean z12, int i12) {
        List list5 = (i12 & 1) != 0 ? bVar.f247419b : list;
        List list6 = (i12 & 2) != 0 ? bVar.f247420c : list2;
        Uri uri2 = (i12 & 4) != 0 ? bVar.f247421d : uri;
        d dVar2 = (i12 & 8) != 0 ? bVar.f247422e : dVar;
        a aVar2 = (i12 & 16) != 0 ? bVar.f247423f : aVar;
        RatingAspectsEntry ratingAspectsEntry2 = (i12 & 32) != 0 ? bVar.f247424g : ratingAspectsEntry;
        List list7 = (i12 & 64) != 0 ? bVar.f247425h : list3;
        List list8 = (i12 & 128) != 0 ? bVar.f247426i : list4;
        c cVar2 = (i12 & 256) != 0 ? bVar.f247427j : cVar;
        Action action2 = (i12 & 512) != 0 ? bVar.f247428k : action;
        e eVar2 = (i12 & 1024) != 0 ? bVar.f247429l : eVar;
        boolean z13 = (i12 & 2048) != 0 ? bVar.f247430m : z12;
        bVar.getClass();
        return new b(list5, list6, uri2, dVar2, aVar2, ratingAspectsEntry2, list7, list8, cVar2, action2, eVar2, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f247419b, bVar.f247419b) && L.f(this.f247420c, bVar.f247420c) && L.f(this.f247421d, bVar.f247421d) && L.f(this.f247422e, bVar.f247422e) && L.f(this.f247423f, bVar.f247423f) && L.f(this.f247424g, bVar.f247424g) && L.f(this.f247425h, bVar.f247425h) && L.f(this.f247426i, bVar.f247426i) && L.f(this.f247427j, bVar.f247427j) && L.f(this.f247428k, bVar.f247428k) && L.f(this.f247429l, bVar.f247429l) && this.f247430m == bVar.f247430m;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f247419b.hashCode() * 31, 31, this.f247420c);
        Uri uri = this.f247421d;
        int iHashCode = (iE2 + (uri == null ? 0 : uri.hashCode())) * 31;
        d dVar = this.f247422e;
        int iHashCode2 = (this.f247423f.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        RatingAspectsEntry ratingAspectsEntry = this.f247424g;
        int iHashCode3 = (iHashCode2 + (ratingAspectsEntry == null ? 0 : ratingAspectsEntry.hashCode())) * 31;
        List<SearchParametersEntry.SearchParametersBlock> list = this.f247425h;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f247426i;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        c cVar = this.f247427j;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Action action = this.f247428k;
        int iHashCode7 = (iHashCode6 + (action == null ? 0 : action.hashCode())) * 31;
        e eVar = this.f247429l;
        return Boolean.hashCode(this.f247430m) + ((iHashCode7 + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingDetailsState(items=");
        sb2.append(this.f247419b);
        sb2.append(", fallbackItems=");
        sb2.append(this.f247420c);
        sb2.append(", nextPage=");
        sb2.append(this.f247421d);
        sb2.append(", emptyState=");
        sb2.append(this.f247422e);
        sb2.append(", commentButton=");
        sb2.append(this.f247423f);
        sb2.append(", aspects=");
        sb2.append(this.f247424g);
        sb2.append(", sort=");
        sb2.append(this.f247425h);
        sb2.append(", requiredFilters=");
        sb2.append(this.f247426i);
        sb2.append(", deletedReview=");
        sb2.append(this.f247427j);
        sb2.append(", requestReviewAction=");
        sb2.append(this.f247428k);
        sb2.append(", loading=");
        sb2.append(this.f247429l);
        sb2.append(", isError=");
        return r.x(sb2, this.f247430m, ')');
    }
}
