package com.avito.android.rating_ui.aspects;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAspectsItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/aspects/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f249855b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f249856c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<C7491a> f249857d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final b f249858e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f249859f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f249860g;

    /* compiled from: RatingAspectsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/a$a;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_ui.aspects.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7491a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f249861a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f249862b;

        /* renamed from: c, reason: collision with root package name */
        public final long f249863c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f249864d;

        public C7491a(long j12, boolean z12, @k String str, @l String str2) {
            this.f249861a = str;
            this.f249862b = str2;
            this.f249863c = j12;
            this.f249864d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7491a)) {
                return false;
            }
            C7491a c7491a = (C7491a) obj;
            return L.f(this.f249861a, c7491a.f249861a) && L.f(this.f249862b, c7491a.f249862b) && this.f249863c == c7491a.f249863c && this.f249864d == c7491a.f249864d;
        }

        public final int hashCode() {
            int iHashCode = this.f249861a.hashCode() * 31;
            String str = this.f249862b;
            return Boolean.hashCode(this.f249864d) + r.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f249863c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Aspect(title=");
            sb2.append(this.f249861a);
            sb2.append(", description=");
            sb2.append(this.f249862b);
            sb2.append(", value=");
            sb2.append(this.f249863c);
            sb2.append(", selected=");
            return r.x(sb2, this.f249864d, ')');
        }
    }

    /* compiled from: RatingAspectsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/a$b;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f249865a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f249866b;

        public b(@k String str, @l String str2) {
            this.f249865a = str;
            this.f249866b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f249865a, bVar.f249865a) && L.f(this.f249866b, bVar.f249866b);
        }

        public final int hashCode() {
            int iHashCode = this.f249865a.hashCode() * 31;
            String str = this.f249866b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(text=");
            sb2.append(this.f249865a);
            sb2.append(", actionText=");
            return C22026a.c(sb2, this.f249866b, ')');
        }
    }

    public a(@k String str, @k String str2, @k List<C7491a> list, @l b bVar, boolean z12, boolean z13) {
        this.f249855b = str;
        this.f249856c = str2;
        this.f249857d = list;
        this.f249858e = bVar;
        this.f249859f = z12;
        this.f249860g = z13;
    }

    public static a a(a aVar, List list, int i12) {
        if ((i12 & 4) != 0) {
            list = aVar.f249857d;
        }
        boolean z12 = aVar.f249859f;
        return new a(aVar.f249855b, aVar.f249856c, list, aVar.f249858e, z12, true);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f249855b, aVar.f249855b) && L.f(this.f249856c, aVar.f249856c) && L.f(this.f249857d, aVar.f249857d) && L.f(this.f249858e, aVar.f249858e) && this.f249859f == aVar.f249859f && this.f249860g == aVar.f249860g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF245163b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF245163b() {
        return this.f249855b;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.f249855b.hashCode() * 31, 31, this.f249856c), 31, this.f249857d);
        b bVar = this.f249858e;
        return Boolean.hashCode(this.f249860g) + r.i((iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f249859f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAspectsItem(stringId=");
        sb2.append(this.f249855b);
        sb2.append(", paramName=");
        sb2.append(this.f249856c);
        sb2.append(", aspects=");
        sb2.append(this.f249857d);
        sb2.append(", tooltip=");
        sb2.append(this.f249858e);
        sb2.append(", shouldShowTooltip=");
        sb2.append(this.f249859f);
        sb2.append(", disabled=");
        return r.x(sb2, this.f249860g, ')');
    }

    public /* synthetic */ a(String str, String str2, List list, b bVar, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, list, bVar, z12, (i12 & 32) != 0 ? false : z13);
    }
}
