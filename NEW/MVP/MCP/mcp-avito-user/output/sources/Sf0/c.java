package SF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.lib.design.chips.h;
import com.avito.android.lib.design.picker.m;
import com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateRangePickerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LSF0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f14861n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final c f14862o;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f14863b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LocalDate f14864c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LocalDate f14865d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<TrxPromoDateValidator> f14866e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<TrxPromoDateValidator> f14867f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f14868g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f14869h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f14870i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f14871j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f14872k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f14873l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f14874m;

    /* compiled from: TrxPromoDateRangePickerState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LSF0/c$a;", "", "<init>", "()V", "", "TAB_ID_FROM", "I", "TAB_ID_TO", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoDateRangePickerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSF0/c$b;", "", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: i, reason: collision with root package name */
        @k
        public static final a f14875i = new a(null);

        /* renamed from: j, reason: collision with root package name */
        @k
        public static final b f14876j;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14877a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<h> f14878b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14879c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<Q<List<com.avito.android.lib.design.picker.k<?>>, m>> f14880d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<Q<List<com.avito.android.lib.design.picker.k<?>>, m>> f14881e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final C42829l0<com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>> f14882f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final C42829l0<com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>> f14883g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final RF0.h f14884h;

        /* compiled from: TrxPromoDateRangePickerState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSF0/c$b$a;", "", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            C42784z0 c42784z0 = C42784z0.f406748b;
            f14876j = new b("", c42784z0, 2, c42784z0, c42784z0, null, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k String str, @k List<? extends h> list, int i12, @k List<? extends Q<? extends List<? extends com.avito.android.lib.design.picker.k<?>>, m>> list2, @k List<? extends Q<? extends List<? extends com.avito.android.lib.design.picker.k<?>>, m>> list3, @l C42829l0<? extends com.avito.android.lib.design.picker.k<?>, ? extends com.avito.android.lib.design.picker.k<?>, ? extends com.avito.android.lib.design.picker.k<?>> c42829l0, @l C42829l0<? extends com.avito.android.lib.design.picker.k<?>, ? extends com.avito.android.lib.design.picker.k<?>, ? extends com.avito.android.lib.design.picker.k<?>> c42829l02, @l RF0.h hVar) {
            this.f14877a = str;
            this.f14878b = list;
            this.f14879c = i12;
            this.f14880d = list2;
            this.f14881e = list3;
            this.f14882f = c42829l0;
            this.f14883g = c42829l02;
            this.f14884h = hVar;
        }

        public static b a(b bVar, ArrayList arrayList, int i12, C42829l0 c42829l0, C42829l0 c42829l02, int i13) {
            String str = bVar.f14877a;
            if ((i13 & 4) != 0) {
                i12 = bVar.f14879c;
            }
            int i14 = i12;
            List<Q<List<com.avito.android.lib.design.picker.k<?>>, m>> list = bVar.f14880d;
            List<Q<List<com.avito.android.lib.design.picker.k<?>>, m>> list2 = bVar.f14881e;
            if ((i13 & 32) != 0) {
                c42829l0 = bVar.f14882f;
            }
            C42829l0 c42829l03 = c42829l0;
            if ((i13 & 64) != 0) {
                c42829l02 = bVar.f14883g;
            }
            RF0.h hVar = bVar.f14884h;
            bVar.getClass();
            return new b(str, arrayList, i14, list, list2, c42829l03, c42829l02, hVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14877a == bVar.f14877a && L.f(this.f14878b, bVar.f14878b) && this.f14879c == bVar.f14879c && L.f(this.f14880d, bVar.f14880d) && L.f(this.f14881e, bVar.f14881e) && L.f(this.f14884h, bVar.f14884h);
        }

        public final int hashCode() {
            int iE2 = H.e(H.e((H.e(this.f14877a.hashCode() * 31, 31, this.f14878b) + this.f14879c) * 31, 31, this.f14880d), 31, this.f14881e);
            RF0.h hVar = this.f14884h;
            return iE2 + (hVar != null ? hVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ViewState(title=" + this.f14877a + ", tabs=" + this.f14878b + ", selectedTabId=" + this.f14879c + ", pickerFromWheels=" + this.f14880d + ", pickerToWheels=" + this.f14881e + ", initialFromValues=" + this.f14882f + ", initialToValues=" + this.f14883g + ", button=" + this.f14884h + ')';
        }
    }

    static {
        b.f14875i.getClass();
        b bVar = b.f14876j;
        com.avito.android.trx_promo_impl.b bVar2 = com.avito.android.trx_promo_impl.b.f303905a;
        bVar2.getClass();
        LocalDate localDate = com.avito.android.trx_promo_impl.b.f303906b;
        bVar2.getClass();
        C42784z0 c42784z0 = C42784z0.f406748b;
        f14862o = new c(bVar, localDate, localDate, c42784z0, c42784z0, "", "", "", "", "", "", "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k b bVar, @k LocalDate localDate, @k LocalDate localDate2, @k List<? extends TrxPromoDateValidator> list, @k List<? extends TrxPromoDateValidator> list2, @k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @k String str7) {
        this.f14863b = bVar;
        this.f14864c = localDate;
        this.f14865d = localDate2;
        this.f14866e = list;
        this.f14867f = list2;
        this.f14868g = str;
        this.f14869h = str2;
        this.f14870i = str3;
        this.f14871j = str4;
        this.f14872k = str5;
        this.f14873l = str6;
        this.f14874m = str7;
    }

    public static c a(c cVar, b bVar, LocalDate localDate, LocalDate localDate2, int i12) {
        LocalDate localDate3 = (i12 & 2) != 0 ? cVar.f14864c : localDate;
        LocalDate localDate4 = (i12 & 4) != 0 ? cVar.f14865d : localDate2;
        List<TrxPromoDateValidator> list = cVar.f14866e;
        List<TrxPromoDateValidator> list2 = cVar.f14867f;
        String str = cVar.f14868g;
        String str2 = cVar.f14869h;
        String str3 = cVar.f14870i;
        String str4 = cVar.f14871j;
        String str5 = cVar.f14872k;
        String str6 = cVar.f14873l;
        String str7 = cVar.f14874m;
        cVar.getClass();
        return new c(bVar, localDate3, localDate4, list, list2, str, str2, str3, str4, str5, str6, str7);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14863b, cVar.f14863b) && L.f(this.f14864c, cVar.f14864c) && L.f(this.f14865d, cVar.f14865d) && L.f(this.f14866e, cVar.f14866e) && L.f(this.f14867f, cVar.f14867f) && L.f(this.f14868g, cVar.f14868g) && L.f(this.f14869h, cVar.f14869h) && L.f(this.f14870i, cVar.f14870i) && L.f(this.f14871j, cVar.f14871j) && L.f(this.f14872k, cVar.f14872k) && L.f(this.f14873l, cVar.f14873l) && L.f(this.f14874m, cVar.f14874m);
    }

    public final int hashCode() {
        return this.f14874m.hashCode() + H.d(H.d(H.d(H.d(H.d(H.d(H.e(H.e((this.f14865d.hashCode() + ((this.f14864c.hashCode() + (this.f14863b.hashCode() * 31)) * 31)) * 31, 31, this.f14866e), 31, this.f14867f), 31, this.f14868g), 31, this.f14869h), 31, this.f14870i), 31, this.f14871j), 31, this.f14872k), 31, this.f14873l);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoDateRangePickerState(viewState=");
        sb2.append(this.f14863b);
        sb2.append(", dateFrom=");
        sb2.append(this.f14864c);
        sb2.append(", dateTo=");
        sb2.append(this.f14865d);
        sb2.append(", validatorsFrom=");
        sb2.append(this.f14866e);
        sb2.append(", validatorsTo=");
        sb2.append(this.f14867f);
        sb2.append(", tabFromTitle=");
        sb2.append(this.f14868g);
        sb2.append(", tabFromErrorTitle=");
        sb2.append(this.f14869h);
        sb2.append(", tabFromDateFormat=");
        sb2.append(this.f14870i);
        sb2.append(", tabToTitle=");
        sb2.append(this.f14871j);
        sb2.append(", tabToErrorTitle=");
        sb2.append(this.f14872k);
        sb2.append(", tabToDateFormat=");
        sb2.append(this.f14873l);
        sb2.append(", incorrectDateRangeMessage=");
        return C22026a.c(sb2, this.f14874m, ')');
    }
}
