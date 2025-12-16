package SF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.chips.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateRangePickerAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LSF0/a;", "", "a", "b", "c", "d", "LSF0/a$a;", "LSF0/a$b;", "LSF0/a$c;", "LSF0/a$d;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TrxPromoDateRangePickerAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSF0/a$a;", "LSF0/a;", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SF0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1003a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1003a f14848a = new C1003a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1003a);
        }

        public final int hashCode() {
            return 1602777963;
        }

        @k
        public final String toString() {
            return "OnMainButtonClicked";
        }
    }

    /* compiled from: TrxPromoDateRangePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSF0/a$b;", "LSF0/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f14849a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f14850b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f14851c;

        public b(@l com.avito.android.lib.design.picker.k<?> kVar, @l com.avito.android.lib.design.picker.k<?> kVar2, @l com.avito.android.lib.design.picker.k<?> kVar3) {
            this.f14849a = kVar;
            this.f14850b = kVar2;
            this.f14851c = kVar3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f14849a, bVar.f14849a) && L.f(this.f14850b, bVar.f14850b) && L.f(this.f14851c, bVar.f14851c);
        }

        public final int hashCode() {
            com.avito.android.lib.design.picker.k<?> kVar = this.f14849a;
            int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
            com.avito.android.lib.design.picker.k<?> kVar2 = this.f14850b;
            int iHashCode2 = (iHashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
            com.avito.android.lib.design.picker.k<?> kVar3 = this.f14851c;
            return iHashCode2 + (kVar3 != null ? kVar3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OnPickerFromChanged(dayWheelValue=" + this.f14849a + ", monthWheelValue=" + this.f14850b + ", yearWheelValue=" + this.f14851c + ')';
        }
    }

    /* compiled from: TrxPromoDateRangePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSF0/a$c;", "LSF0/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f14852a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f14853b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final com.avito.android.lib.design.picker.k<?> f14854c;

        public c(@l com.avito.android.lib.design.picker.k<?> kVar, @l com.avito.android.lib.design.picker.k<?> kVar2, @l com.avito.android.lib.design.picker.k<?> kVar3) {
            this.f14852a = kVar;
            this.f14853b = kVar2;
            this.f14854c = kVar3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f14852a, cVar.f14852a) && L.f(this.f14853b, cVar.f14853b) && L.f(this.f14854c, cVar.f14854c);
        }

        public final int hashCode() {
            com.avito.android.lib.design.picker.k<?> kVar = this.f14852a;
            int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
            com.avito.android.lib.design.picker.k<?> kVar2 = this.f14853b;
            int iHashCode2 = (iHashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
            com.avito.android.lib.design.picker.k<?> kVar3 = this.f14854c;
            return iHashCode2 + (kVar3 != null ? kVar3.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OnPickerToChanged(dayWheelValue=" + this.f14852a + ", monthWheelValue=" + this.f14853b + ", yearWheelValue=" + this.f14854c + ')';
        }
    }

    /* compiled from: TrxPromoDateRangePickerAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSF0/a$d;", "LSF0/a;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final h f14855a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14856b;

        public d(@k h hVar, boolean z12) {
            this.f14855a = hVar;
            this.f14856b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f14855a, dVar.f14855a) && this.f14856b == dVar.f14856b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14856b) + (this.f14855a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnTabSelected(chipable=");
            sb2.append(this.f14855a);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f14856b, ')');
        }
    }
}
