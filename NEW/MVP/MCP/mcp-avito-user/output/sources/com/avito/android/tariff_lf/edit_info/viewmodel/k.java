package com.avito.android.tariff_lf.edit_info.viewmodel;

import androidx.view.C23038g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/k;", "", "a", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface k {

    /* compiled from: EditInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/viewmodel/k$a;", "", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f299100a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f299101b;

        public a(@Y61.k ApiError apiError, @Y61.k String str) {
            this.f299100a = str;
            this.f299101b = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f299100a, aVar.f299100a) && L.f(this.f299101b, aVar.f299101b);
        }

        public final int hashCode() {
            return this.f299101b.hashCode() + (this.f299100a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(message=");
            sb2.append(this.f299100a);
            sb2.append(", typedError=");
            return AK.c.n(sb2, this.f299101b, ')');
        }
    }

    @Y61.k
    /* renamed from: Aa */
    C23038g0 getF299144k0();

    @Y61.k
    /* renamed from: Ib */
    C23038g0 getF299140g0();

    void O();

    void W7(int i12);

    @Y61.k
    /* renamed from: Y */
    C23038g0 getF299139f0();

    @Y61.k
    /* renamed from: Z4 */
    C23038g0 getF299142i0();

    void a(@Y61.k Set<TV0.d<?, ?>> set);

    @Y61.k
    /* renamed from: g0 */
    C23038g0 getF299136c0();

    void h0();

    @Y61.k
    /* renamed from: j0 */
    C23038g0 getF299141h0();

    @Y61.k
    com.avito.android.util.architecture_components.D<DeepLink> k0();

    @Y61.k
    /* renamed from: n0 */
    C23038g0 getF299137d0();

    void n3(@Y61.k aD0.d dVar);

    @Y61.k
    /* renamed from: w4 */
    C23038g0 getF299143j0();
}
