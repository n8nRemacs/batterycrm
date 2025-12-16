package com.avito.android.rating_ui.sort;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingSortItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/sort/a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250429b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<AbstractC7507a> f250430c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f250431d;

    /* compiled from: RatingSortItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_ui/sort/a$a;", "", "a", "b", "Lcom/avito/android/rating_ui/sort/a$a$a;", "Lcom/avito/android/rating_ui/sort/a$a$b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_ui.sort.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC7507a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f250432a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f250433b;

        /* compiled from: RatingSortItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/sort/a$a$a;", "Lcom/avito/android/rating_ui/sort/a$a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_ui.sort.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7508a extends AbstractC7507a {

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f250434c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f250435d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f250436e;

            public C7508a(@l String str, @k String str2, boolean z12) {
                super(str, str2, null);
                this.f250434c = str;
                this.f250435d = str2;
                this.f250436e = z12;
            }

            @Override // com.avito.android.rating_ui.sort.a.AbstractC7507a
            @k
            /* renamed from: a, reason: from getter */
            public final String getF250433b() {
                return this.f250435d;
            }

            @Override // com.avito.android.rating_ui.sort.a.AbstractC7507a
            @l
            /* renamed from: b, reason: from getter */
            public final String getF250432a() {
                return this.f250434c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7508a)) {
                    return false;
                }
                C7508a c7508a = (C7508a) obj;
                return L.f(this.f250434c, c7508a.f250434c) && L.f(this.f250435d, c7508a.f250435d) && this.f250436e == c7508a.f250436e;
            }

            public final int hashCode() {
                String str = this.f250434c;
                return Boolean.hashCode(this.f250436e) + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f250435d);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InlineBoolFilter(title=");
                sb2.append(this.f250434c);
                sb2.append(", paramName=");
                sb2.append(this.f250435d);
                sb2.append(", selected=");
                return r.x(sb2, this.f250436e, ')');
            }
        }

        /* compiled from: RatingSortItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/sort/a$a$b;", "Lcom/avito/android/rating_ui/sort/a$a;", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_ui.sort.a$a$b */
        public static final /* data */ class b extends AbstractC7507a {

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f250437c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f250438d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final C7509a f250439e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f250440f;

            /* compiled from: RatingSortItem.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/sort/a$a$b$a;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_ui.sort.a$a$b$a, reason: collision with other inner class name */
            public static final /* data */ class C7509a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f250441a;

                /* renamed from: b, reason: collision with root package name */
                @l
                public final String f250442b;

                public C7509a(@k String str, @l String str2) {
                    this.f250441a = str;
                    this.f250442b = str2;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7509a)) {
                        return false;
                    }
                    C7509a c7509a = (C7509a) obj;
                    return L.f(this.f250441a, c7509a.f250441a) && L.f(this.f250442b, c7509a.f250442b);
                }

                public final int hashCode() {
                    int iHashCode = this.f250441a.hashCode() * 31;
                    String str = this.f250442b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Tooltip(text=");
                    sb2.append(this.f250441a);
                    sb2.append(", actionText=");
                    return C22026a.c(sb2, this.f250442b, ')');
                }
            }

            public b(@l String str, @k String str2, @l C7509a c7509a, boolean z12) {
                super(str, str2, null);
                this.f250437c = str;
                this.f250438d = str2;
                this.f250439e = c7509a;
                this.f250440f = z12;
            }

            @Override // com.avito.android.rating_ui.sort.a.AbstractC7507a
            @k
            /* renamed from: a, reason: from getter */
            public final String getF250433b() {
                return this.f250438d;
            }

            @Override // com.avito.android.rating_ui.sort.a.AbstractC7507a
            @l
            /* renamed from: b, reason: from getter */
            public final String getF250432a() {
                return this.f250437c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f250437c, bVar.f250437c) && L.f(this.f250438d, bVar.f250438d) && L.f(this.f250439e, bVar.f250439e) && this.f250440f == bVar.f250440f;
            }

            public final int hashCode() {
                String str = this.f250437c;
                int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f250438d);
                C7509a c7509a = this.f250439e;
                return Boolean.hashCode(this.f250440f) + ((iD2 + (c7509a != null ? c7509a.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Sort(title=");
                sb2.append(this.f250437c);
                sb2.append(", paramName=");
                sb2.append(this.f250438d);
                sb2.append(", tooltip=");
                sb2.append(this.f250439e);
                sb2.append(", shouldShowTooltip=");
                return r.x(sb2, this.f250440f, ')');
            }
        }

        public AbstractC7507a(String str, String str2, C42822w c42822w) {
            this.f250432a = str;
            this.f250433b = str2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public String getF250433b() {
            return this.f250433b;
        }

        @l
        /* renamed from: b, reason: from getter */
        public String getF250432a() {
            return this.f250432a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k List<? extends AbstractC7507a> list, boolean z12) {
        this.f250429b = str;
        this.f250430c = list;
        this.f250431d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a a(a aVar, ArrayList arrayList, int i12) {
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = aVar.f250430c;
        }
        return new a(aVar.f250429b, list, true);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f250429b, aVar.f250429b) && L.f(this.f250430c, aVar.f250430c) && this.f250431d == aVar.f250431d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF249855b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF249855b() {
        return this.f250429b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250431d) + H.e(this.f250429b.hashCode() * 31, 31, this.f250430c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingSortItem(stringId=");
        sb2.append(this.f250429b);
        sb2.append(", blocks=");
        sb2.append(this.f250430c);
        sb2.append(", disabled=");
        return r.x(sb2, this.f250431d, ')');
    }

    public /* synthetic */ a(String str, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? false : z12);
    }
}
