package com.avito.android.seller_coach.adverts_hint.view;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import androidx.compose.foundation.H;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortAdvicesView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f;", "", "a", "b", "c", "d", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f {

    /* compiled from: ShortAdvicesView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f$a;", "", "a", "b", "c", "Lcom/avito/android/seller_coach/adverts_hint/view/f$a$a;", "Lcom/avito/android/seller_coach/adverts_hint/view/f$a$b;", "Lcom/avito/android/seller_coach/adverts_hint/view/f$a$c;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ShortAdvicesView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f$a$a;", "Lcom/avito/android/seller_coach/adverts_hint/view/f$a;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.seller_coach.adverts_hint.view.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7984a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UserAdvertsHintItem f267334a;

            public C7984a(@k UserAdvertsHintItem userAdvertsHintItem) {
                this.f267334a = userAdvertsHintItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7984a) && L.f(this.f267334a, ((C7984a) obj).f267334a);
            }

            public final int hashCode() {
                return this.f267334a.hashCode();
            }

            @k
            public final String toString() {
                return "HintClick(hint=" + this.f267334a + ')';
            }
        }

        /* compiled from: ShortAdvicesView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f$a$b;", "Lcom/avito/android/seller_coach/adverts_hint/view/f$a;", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UserAdvertsHintItem f267335a;

            public b(@k UserAdvertsHintItem userAdvertsHintItem) {
                this.f267335a = userAdvertsHintItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f267335a, ((b) obj).f267335a);
            }

            public final int hashCode() {
                return this.f267335a.hashCode();
            }

            @k
            public final String toString() {
                return "HintPageChanged(selectedHint=" + this.f267335a + ')';
            }
        }

        /* compiled from: ShortAdvicesView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f$a$c;", "Lcom/avito/android/seller_coach/adverts_hint/view/f$a;", "<init>", "()V", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f267336a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1955523034;
            }

            @k
            public final String toString() {
                return "MoreClick";
            }
        }
    }

    /* compiled from: ShortAdvicesView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f$b;", "", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        com.avito.android.seller_coach.adverts_hint.view.b a(@k ViewGroup viewGroup, @k SI0.b bVar);
    }

    /* compiled from: ShortAdvicesView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f$c;", "", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
    }

    /* compiled from: ShortAdvicesView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/view/f$d;", "", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f267337a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f267338b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<UserAdvertsHintItem> f267339c;

        public d(@l String str, @l String str2, @k List<UserAdvertsHintItem> list) {
            this.f267337a = str;
            this.f267338b = str2;
            this.f267339c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f267337a, dVar.f267337a) && L.f(this.f267338b, dVar.f267338b) && L.f(this.f267339c, dVar.f267339c);
        }

        public final int hashCode() {
            String str = this.f267337a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f267338b;
            return this.f267339c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(titleText=");
            sb2.append(this.f267337a);
            sb2.append(", countText=");
            sb2.append(this.f267338b);
            sb2.append(", hints=");
            return H.p(sb2, this.f267339c, ')');
        }
    }

    void a(@k d dVar);
}
