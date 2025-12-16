package com.avito.android.service_order_widget.domain;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderRequestResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/domain/f;", "", "a", "b", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final DeepLink f278835a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f278836b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f278837c;

    /* compiled from: ServiceOrderRequestResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_widget/domain/f$a;", "", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f278838a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final b f278839b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f278840c;

        public a(@k String str, @l b bVar, @k DeepLink deepLink) {
            this.f278838a = str;
            this.f278839b = bVar;
            this.f278840c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f278838a, aVar.f278838a) && L.f(this.f278839b, aVar.f278839b) && L.f(this.f278840c, aVar.f278840c);
        }

        public final int hashCode() {
            int iHashCode = this.f278838a.hashCode() * 31;
            b bVar = this.f278839b;
            return this.f278840c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f278838a);
            sb2.append(", style=");
            sb2.append(this.f278839b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f278840c, ')');
        }
    }

    /* compiled from: ServiceOrderRequestResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_widget/domain/f$b;", "", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f278841a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278842b;

        public b(@k String str, @k String str2) {
            this.f278841a = str;
            this.f278842b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f278841a, bVar.f278841a) && L.f(this.f278842b, bVar.f278842b);
        }

        public final int hashCode() {
            return this.f278842b.hashCode() + (this.f278841a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionStyle(avito=");
            sb2.append(this.f278841a);
            sb2.append(", avitoRe23=");
            return C22026a.c(sb2, this.f278842b, ')');
        }
    }

    public f(@l DeepLink deepLink, @k String str, @k a aVar) {
        this.f278835a = deepLink;
        this.f278836b = str;
        this.f278837c = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f278835a, fVar.f278835a) && L.f(this.f278836b, fVar.f278836b) && L.f(this.f278837c, fVar.f278837c);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f278835a;
        return this.f278837c.hashCode() + H.d((deepLink == null ? 0 : deepLink.hashCode()) * 31, 31, this.f278836b);
    }

    @k
    public final String toString() {
        return "ServiceOrderRequestResult(redirectDeeplink=" + this.f278835a + ", message=" + this.f278836b + ", newAction=" + this.f278837c + ')';
    }
}
