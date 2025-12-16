package com.avito.android.rating_form.step.validations;

import androidx.compose.foundation.H;
import com.avito.android.rating_form.FieldIdentifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ValidationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/step/validations/u;", "", "a", "b", "Lcom/avito/android/rating_form/step/validations/u$a;", "Lcom/avito/android/rating_form/step/validations/u$b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface u {

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/validations/u$b;", "Lcom/avito/android/rating_form/step/validations/u;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements u {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f249761a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -241057042;
        }

        @Y61.k
        public final String toString() {
            return "Success";
        }
    }

    /* compiled from: ValidationResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/validations/u$a;", "Lcom/avito/android/rating_form/step/validations/u;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements u {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FieldIdentifier f249757a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f249758b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f249759c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<FieldIdentifier> f249760d;

        public a(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k String str, boolean z12, @Y61.k List<FieldIdentifier> list) {
            this.f249757a = fieldIdentifier;
            this.f249758b = str;
            this.f249759c = z12;
            this.f249760d = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f249757a, aVar.f249757a) && L.f(this.f249758b, aVar.f249758b) && this.f249759c == aVar.f249759c && L.f(this.f249760d, aVar.f249760d);
        }

        public final int hashCode() {
            return this.f249760d.hashCode() + androidx.appcompat.app.r.i(H.d(this.f249757a.hashCode() * 31, 31, this.f249758b), 31, this.f249759c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(fieldIdentifier=");
            sb2.append(this.f249757a);
            sb2.append(", message=");
            sb2.append(this.f249758b);
            sb2.append(", showAsToast=");
            sb2.append(this.f249759c);
            sb2.append(", dependentFieldsIdentifiers=");
            return H.p(sb2, this.f249760d, ')');
        }

        public a(FieldIdentifier fieldIdentifier, String str, boolean z12, List list, int i12, C42822w c42822w) {
            this(fieldIdentifier, str, z12, (i12 & 8) != 0 ? C42784z0.f406748b : list);
        }
    }
}
