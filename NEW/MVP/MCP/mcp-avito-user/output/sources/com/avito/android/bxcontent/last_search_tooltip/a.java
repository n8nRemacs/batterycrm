package com.avito.android.bxcontent.last_search_tooltip;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LastSearchTooltip.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/last_search_tooltip/a;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f111146a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f111147b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C3279a f111148c;

    /* compiled from: LastSearchTooltip.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/last_search_tooltip/a$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.last_search_tooltip.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3279a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f111149a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f111150b;

        public C3279a(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f111149a = str;
            this.f111150b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3279a)) {
                return false;
            }
            C3279a c3279a = (C3279a) obj;
            return L.f(this.f111149a, c3279a.f111149a) && L.f(this.f111150b, c3279a.f111150b);
        }

        public final int hashCode() {
            return this.f111150b.hashCode() + (this.f111149a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f111149a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f111150b, ')');
        }
    }

    public a(@Y61.k String str, @Y61.k String str2, @Y61.k C3279a c3279a) {
        this.f111146a = str;
        this.f111147b = str2;
        this.f111148c = c3279a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f111146a, aVar.f111146a) && L.f(this.f111147b, aVar.f111147b) && L.f(this.f111148c, aVar.f111148c);
    }

    public final int hashCode() {
        return this.f111148c.hashCode() + H.d(this.f111146a.hashCode() * 31, 31, this.f111147b);
    }

    @Y61.k
    public final String toString() {
        return "LastSearchTooltip(title=" + this.f111146a + ", description=" + this.f111147b + ", button=" + this.f111148c + ')';
    }
}
