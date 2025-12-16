package com.avito.android.vas_planning_checkout;

import androidx.view.C23038g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlanCheckoutViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/A;", "Lcom/avito/android/vas_planning_checkout/item/checkout/a;", "Lcom/avito/android/deep_linking/links/w;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface A extends com.avito.android.vas_planning_checkout.item.checkout.a, com.avito.android.deep_linking.links.w {

    /* compiled from: VasPlanCheckoutViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/A$a;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f322744a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f322745b;

        public a(@Y61.k ApiError apiError, @Y61.k String str) {
            this.f322744a = str;
            this.f322745b = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f322744a, aVar.f322744a) && L.f(this.f322745b, aVar.f322745b);
        }

        public final int hashCode() {
            return this.f322745b.hashCode() + (this.f322744a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(message=");
            sb2.append(this.f322744a);
            sb2.append(", typedError=");
            return AK.c.n(sb2, this.f322745b, ')');
        }
    }

    @Y61.k
    com.avito.android.util.architecture_components.D<G0> Fc();

    @Y61.k
    /* renamed from: I7 */
    C23038g0 getF322784Z();

    void L8();

    @Y61.k
    /* renamed from: N5 */
    com.avito.android.util.architecture_components.D getF322783Y();

    @Y61.k
    com.avito.android.util.architecture_components.D<G0> O4();

    void S6();

    @Y61.k
    /* renamed from: g0 */
    C23038g0 getF322777S();

    void h0();

    @Y61.k
    com.avito.android.util.architecture_components.D<DeepLink> k0();

    @Y61.k
    /* renamed from: n0 */
    C23038g0 getF322780V();

    @Y61.k
    /* renamed from: q0 */
    C23038g0 getF322778T();

    @Y61.k
    com.avito.android.util.architecture_components.D<a> x1();

    @Y61.k
    /* renamed from: xc */
    C23038g0 getF322779U();
}
