package com.avito.android.sbc.create.mvi.entity;

import To0.C15385b;
import To0.C15386c;
import Uo0.C15545b;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: CreateDiscountDispatchState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "", "a", "DiscountDispatchDataLoaded", "b", "c", "d", "e", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$d;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$e;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CreateDiscountDispatchState {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f259615a = a.f259758a;

    /* compiled from: CreateDiscountDispatchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$a;", "", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f259758a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f259759b = b.f259760b;
    }

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements CreateDiscountDispatchState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f259760b = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2052646387;
        }

        @k
        public final String toString() {
            return "DiscountDispatchDataLoading";
        }
    }

    /* compiled from: CreateDiscountDispatchState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$c;", "", "a", "b", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$c$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$c$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$c$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f259761a;

            /* renamed from: b, reason: collision with root package name */
            public final long f259762b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f259763c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f259764d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f259765e;

            /* renamed from: f, reason: collision with root package name */
            public final float f259766f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f259767g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final To0.e f259768h;

            public a(long j12, long j13, @k String str, @k String str2, boolean z12, float f12, boolean z13, @l To0.e eVar) {
                this.f259761a = j12;
                this.f259762b = j13;
                this.f259763c = str;
                this.f259764d = str2;
                this.f259765e = z12;
                this.f259766f = f12;
                this.f259767g = z13;
                this.f259768h = eVar;
            }

            @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.c
            @l
            /* renamed from: a, reason: from getter */
            public final To0.e getF259779k() {
                return this.f259768h;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f259761a == aVar.f259761a && this.f259762b == aVar.f259762b && L.f(this.f259763c, aVar.f259763c) && L.f(this.f259764d, aVar.f259764d) && this.f259765e == aVar.f259765e && Float.compare(this.f259766f, aVar.f259766f) == 0 && this.f259767g == aVar.f259767g && L.f(this.f259768h, aVar.f259768h);
            }

            public final int hashCode() {
                int i12 = r.i(r.d(this.f259766f, r.i(H.d(H.d(r.g(Long.hashCode(this.f259761a) * 31, 31, this.f259762b), 31, this.f259763c), 31, this.f259764d), 31, this.f259765e), 31), 31, this.f259767g);
                To0.e eVar = this.f259768h;
                return i12 + (eVar == null ? 0 : eVar.hashCode());
            }

            @k
            public final String toString() {
                return "TariffData(messageLeft=" + this.f259761a + ", messageTotal=" + this.f259762b + ", messageTariffTitle=" + this.f259763c + ", daysLeftTitle=" + this.f259764d + ", isTariffProgressValid=" + this.f259765e + ", tariffBalanceProgress=" + this.f259766f + ", isDaysLeftValid=" + this.f259767g + ", forecastedRecipients=" + this.f259768h + ')';
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$c$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f259769a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f259770b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f259771c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f259772d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f259773e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final com.avito.android.sbc.create.mvi.util.d f259774f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final String f259775g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f259776h;

            /* renamed from: i, reason: collision with root package name */
            @l
            public final Q<String, String> f259777i;

            /* renamed from: j, reason: collision with root package name */
            public final boolean f259778j;

            /* renamed from: k, reason: collision with root package name */
            @l
            public final To0.e f259779k;

            public b(long j12, @k String str, @k String str2, @k String str3, @k String str4, @l com.avito.android.sbc.create.mvi.util.d dVar, @l String str5, boolean z12, @l Q q12, boolean z13, @l To0.e eVar) {
                this.f259769a = j12;
                this.f259770b = str;
                this.f259771c = str2;
                this.f259772d = str3;
                this.f259773e = str4;
                this.f259774f = dVar;
                this.f259775g = str5;
                this.f259776h = z12;
                this.f259777i = q12;
                this.f259778j = z13;
                this.f259779k = eVar;
            }

            @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.c
            @l
            /* renamed from: a, reason: from getter */
            public final To0.e getF259779k() {
                return this.f259779k;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f259769a == bVar.f259769a && this.f259770b.equals(bVar.f259770b) && L.f(this.f259771c, bVar.f259771c) && L.f(this.f259772d, bVar.f259772d) && this.f259773e.equals(bVar.f259773e) && L.f(this.f259774f, bVar.f259774f) && L.f(this.f259775g, bVar.f259775g) && this.f259776h == bVar.f259776h && L.f(this.f259777i, bVar.f259777i) && L.f(null, null) && this.f259778j == bVar.f259778j && L.f(this.f259779k, bVar.f259779k);
            }

            public final int hashCode() {
                int iD2 = H.d(H.d(H.d(H.d(Long.hashCode(this.f259769a) * 31, 31, this.f259770b), 31, this.f259771c), 31, this.f259772d), 31, this.f259773e);
                com.avito.android.sbc.create.mvi.util.d dVar = this.f259774f;
                int iHashCode = (iD2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
                String str = this.f259775g;
                int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f259776h);
                Q<String, String> q12 = this.f259777i;
                int i13 = r.i((i12 + (q12 == null ? 0 : q12.hashCode())) * 961, 31, this.f259778j);
                To0.e eVar = this.f259779k;
                return i13 + (eVar != null ? eVar.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "VasData(messagePrice=" + this.f259769a + ", messagePriceTitle=" + this.f259770b + ", messagePriceFormatted=" + this.f259771c + ", totalPrice=" + this.f259772d + ", totalMessages=" + this.f259773e + ", offerTitle=" + this.f259774f + ", offerLink=" + this.f259775g + ", isPriceVisible=" + this.f259776h + ", dispatchTotalRecipients=" + this.f259777i + ", daysOfAutoDispatch=null, showPriceExplanationIcon=" + this.f259778j + ", forecastedRecipients=" + this.f259779k + ')';
            }
        }

        @l
        /* renamed from: a */
        To0.e getF259779k();
    }

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$d;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements CreateDiscountDispatchState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f259780b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.sbc.create.mvi.util.d f259781c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f259782d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Uo0.e f259783e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f259784f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f259785g;

        public d(@k String str, @k com.avito.android.sbc.create.mvi.util.d dVar, @k String str2, @k Uo0.e eVar, boolean z12, @k String str3) {
            this.f259780b = str;
            this.f259781c = dVar;
            this.f259782d = str2;
            this.f259783e = eVar;
            this.f259784f = z12;
            this.f259785g = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f259780b, dVar.f259780b) && L.f(this.f259781c, dVar.f259781c) && L.f(this.f259782d, dVar.f259782d) && L.f(this.f259783e, dVar.f259783e) && this.f259784f == dVar.f259784f && L.f(this.f259785g, dVar.f259785g);
        }

        public final int hashCode() {
            return this.f259785g.hashCode() + r.i((this.f259783e.hashCode() + H.d((this.f259781c.hashCode() + (this.f259780b.hashCode() * 31)) * 31, 31, this.f259782d)) * 31, 31, this.f259784f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalErrorState(title=");
            sb2.append(this.f259780b);
            sb2.append(", description=");
            sb2.append(this.f259781c);
            sb2.append(", actionTitle=");
            sb2.append(this.f259782d);
            sb2.append(", action=");
            sb2.append(this.f259783e);
            sb2.append(", isPrimary=");
            sb2.append(this.f259784f);
            sb2.append(", errorType=");
            return C22026a.c(sb2, this.f259785g, ')');
        }
    }

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$e;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements CreateDiscountDispatchState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MnzFloatingFooter f259786b;

        static {
            Parcelable.Creator<MnzFloatingFooter> creator = MnzFloatingFooter.CREATOR;
        }

        public e(@k MnzFloatingFooter mnzFloatingFooter) {
            this.f259786b = mnzFloatingFooter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f259786b, ((e) obj).f259786b);
        }

        public final int hashCode() {
            return this.f259786b.hashCode();
        }

        @k
        public final String toString() {
            return "VasFlowUnknownError(footer=" + this.f259786b + ')';
        }
    }

    /* compiled from: CreateDiscountDispatchState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "a", "b", "c", "AutoDispatchToggleState", "d", "e", "f", "g", "h", "i", "j", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DiscountDispatchDataLoaded implements CreateDiscountDispatchState {

        /* renamed from: A, reason: collision with root package name */
        @l
        public final MnzFloatingFooter f259616A;

        /* renamed from: B, reason: collision with root package name */
        @l
        public final Integer f259617B;

        /* renamed from: C, reason: collision with root package name */
        @l
        public final d f259618C;

        /* renamed from: D, reason: collision with root package name */
        @k
        public final h f259619D;

        /* renamed from: E, reason: collision with root package name */
        @l
        public final e f259620E;

        /* renamed from: F, reason: collision with root package name */
        @k
        public final f f259621F;

        /* renamed from: b, reason: collision with root package name */
        public final long f259622b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final i f259623c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final com.avito.android.sbc.create.mvi.util.d f259624d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f259625e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f259626f;

        /* renamed from: g, reason: collision with root package name */
        public final long f259627g;

        /* renamed from: h, reason: collision with root package name */
        public final long f259628h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final com.avito.android.sbc.create.mvi.util.d f259629i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f259630j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final String f259631k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final String f259632l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final String f259633m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final Image f259634n;

        /* renamed from: o, reason: collision with root package name */
        @k
        public final String f259635o;

        /* renamed from: p, reason: collision with root package name */
        @k
        public final String f259636p;

        /* renamed from: q, reason: collision with root package name */
        @k
        public final CharSequence f259637q;

        /* renamed from: r, reason: collision with root package name */
        @k
        public final c f259638r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f259639s;

        /* renamed from: t, reason: collision with root package name */
        @k
        public final String f259640t;

        /* renamed from: u, reason: collision with root package name */
        @k
        public final String f259641u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f259642v;

        /* renamed from: w, reason: collision with root package name */
        public final boolean f259643w;

        /* renamed from: x, reason: collision with root package name */
        @k
        public final j f259644x;

        /* renamed from: y, reason: collision with root package name */
        @k
        public final CharSequence f259645y;

        /* renamed from: z, reason: collision with root package name */
        @k
        public final CharSequence f259646z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CreateDiscountDispatchState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$AutoDispatchToggleState;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AutoDispatchToggleState {

            /* renamed from: b, reason: collision with root package name */
            public static final AutoDispatchToggleState f259647b;

            /* renamed from: c, reason: collision with root package name */
            public static final AutoDispatchToggleState f259648c;

            /* renamed from: d, reason: collision with root package name */
            public static final AutoDispatchToggleState f259649d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ AutoDispatchToggleState[] f259650e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f259651f;

            static {
                AutoDispatchToggleState autoDispatchToggleState = new AutoDispatchToggleState("SwitchedOn", 0);
                f259647b = autoDispatchToggleState;
                AutoDispatchToggleState autoDispatchToggleState2 = new AutoDispatchToggleState("SwitchedOff", 1);
                f259648c = autoDispatchToggleState2;
                AutoDispatchToggleState autoDispatchToggleState3 = new AutoDispatchToggleState("SwitchedOnDisabled", 2);
                f259649d = autoDispatchToggleState3;
                AutoDispatchToggleState[] autoDispatchToggleStateArr = {autoDispatchToggleState, autoDispatchToggleState2, autoDispatchToggleState3};
                f259650e = autoDispatchToggleStateArr;
                f259651f = kotlin.enums.c.a(autoDispatchToggleStateArr);
            }

            public AutoDispatchToggleState() {
                throw null;
            }

            public static AutoDispatchToggleState valueOf(String str) {
                return (AutoDispatchToggleState) Enum.valueOf(AutoDispatchToggleState.class, str);
            }

            public static AutoDispatchToggleState[] values() {
                return (AutoDispatchToggleState[]) f259650e.clone();
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$a;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f259652a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f259653b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f259654c;

            /* renamed from: d, reason: collision with root package name */
            public final long f259655d;

            /* renamed from: e, reason: collision with root package name */
            public final long f259656e;

            /* renamed from: f, reason: collision with root package name */
            public final long f259657f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f259658g;

            /* renamed from: h, reason: collision with root package name */
            @k
            public final String f259659h;

            /* renamed from: i, reason: collision with root package name */
            public final long f259660i;

            public a(boolean z12, @k String str, boolean z13, long j12, long j13, long j14, boolean z14, @k String str2, long j15) {
                this.f259652a = z12;
                this.f259653b = str;
                this.f259654c = z13;
                this.f259655d = j12;
                this.f259656e = j13;
                this.f259657f = j14;
                this.f259658g = z14;
                this.f259659h = str2;
                this.f259660i = j15;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f259652a == aVar.f259652a && L.f(this.f259653b, aVar.f259653b) && this.f259654c == aVar.f259654c && this.f259655d == aVar.f259655d && this.f259656e == aVar.f259656e && this.f259657f == aVar.f259657f && this.f259658g == aVar.f259658g && L.f(this.f259659h, aVar.f259659h) && this.f259660i == aVar.f259660i;
            }

            public final int hashCode() {
                return Long.hashCode(this.f259660i) + H.d(r.i(r.g(r.g(r.g(r.i(H.d(Boolean.hashCode(this.f259652a) * 31, 31, this.f259653b), 31, this.f259654c), 31, this.f259655d), 31, this.f259656e), 31, this.f259657f), 31, this.f259658g), 31, this.f259659h);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AutoDispatchBudgetViewState(isVisible=");
                sb2.append(this.f259652a);
                sb2.append(", budgetTitle=");
                sb2.append(this.f259653b);
                sb2.append(", needToShowInitialBudget=");
                sb2.append(this.f259654c);
                sb2.append(", initialBudget=");
                sb2.append(this.f259655d);
                sb2.append(", enteredBudget=");
                sb2.append(this.f259656e);
                sb2.append(", recommendedBudget=");
                sb2.append(this.f259657f);
                sb2.append(", invalidEnteredBudget=");
                sb2.append(this.f259658g);
                sb2.append(", budgetMessage=");
                sb2.append(this.f259659h);
                sb2.append(", minBudgetValue=");
                return r.u(sb2, this.f259660i, ')');
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$b;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f259661a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<C15545b> f259662b;

            public b(boolean z12, @k List<C15545b> list) {
                this.f259661a = z12;
                this.f259662b = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f259661a == bVar.f259661a && L.f(this.f259662b, bVar.f259662b);
            }

            public final int hashCode() {
                return this.f259662b.hashCode() + (Boolean.hashCode(this.f259661a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AutoDispatchDurationChipsState(isVisible=");
                sb2.append(this.f259661a);
                sb2.append(", durationChips=");
                return H.p(sb2, this.f259662b, ')');
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$c;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f259663a;

            public c(@k ArrayList arrayList) {
                this.f259663a = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f259663a.equals(((c) obj).f259663a);
            }

            public final int hashCode() {
                return this.f259663a.hashCode();
            }

            @k
            public final String toString() {
                return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("AutoDispatchPresetState(presets="), this.f259663a, ')');
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$d;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final AutoDispatchToggleState f259664a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final c f259665b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final b f259666c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final a f259667d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final CharSequence f259668e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final String f259669f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final String f259670g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final CharSequence f259671h;

            public d(@k AutoDispatchToggleState autoDispatchToggleState, @k c cVar, @k b bVar, @k a aVar, @l CharSequence charSequence, @l String str, @l String str2, @l CharSequence charSequence2) {
                this.f259664a = autoDispatchToggleState;
                this.f259665b = cVar;
                this.f259666c = bVar;
                this.f259667d = aVar;
                this.f259668e = charSequence;
                this.f259669f = str;
                this.f259670g = str2;
                this.f259671h = charSequence2;
            }

            public static d a(d dVar, AutoDispatchToggleState autoDispatchToggleState, c cVar, b bVar, a aVar, int i12) {
                if ((i12 & 1) != 0) {
                    autoDispatchToggleState = dVar.f259664a;
                }
                AutoDispatchToggleState autoDispatchToggleState2 = autoDispatchToggleState;
                if ((i12 & 2) != 0) {
                    cVar = dVar.f259665b;
                }
                c cVar2 = cVar;
                if ((i12 & 4) != 0) {
                    bVar = dVar.f259666c;
                }
                b bVar2 = bVar;
                if ((i12 & 8) != 0) {
                    aVar = dVar.f259667d;
                }
                CharSequence charSequence = dVar.f259668e;
                String str = dVar.f259669f;
                String str2 = dVar.f259670g;
                CharSequence charSequence2 = dVar.f259671h;
                dVar.getClass();
                return new d(autoDispatchToggleState2, cVar2, bVar2, aVar, charSequence, str, str2, charSequence2);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f259664a == dVar.f259664a && L.f(this.f259665b, dVar.f259665b) && L.f(this.f259666c, dVar.f259666c) && L.f(this.f259667d, dVar.f259667d) && L.f(this.f259668e, dVar.f259668e) && L.f(this.f259669f, dVar.f259669f) && L.f(this.f259670g, dVar.f259670g) && L.f(this.f259671h, dVar.f259671h);
            }

            public final int hashCode() {
                int iHashCode = (this.f259667d.hashCode() + ((this.f259666c.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f259665b.f259663a, this.f259664a.hashCode() * 31, 31)) * 31)) * 31;
                CharSequence charSequence = this.f259668e;
                int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                String str = this.f259669f;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f259670g;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                CharSequence charSequence2 = this.f259671h;
                return iHashCode4 + (charSequence2 != null ? charSequence2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AutoDispatchViewState(toggleState=");
                sb2.append(this.f259664a);
                sb2.append(", presetChipsState=");
                sb2.append(this.f259665b);
                sb2.append(", durationChipsState=");
                sb2.append(this.f259666c);
                sb2.append(", budgetViewState=");
                sb2.append(this.f259667d);
                sb2.append(", autoDispatchSummaryExplained=");
                sb2.append((Object) this.f259668e);
                sb2.append(", autoDispatchRequired=");
                sb2.append((Object) this.f259669f);
                sb2.append(", autoDispatchSubTitle=");
                sb2.append((Object) this.f259670g);
                sb2.append(", autoDispatchExplained=");
                return AK.c.r(sb2, this.f259671h, ')');
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$e;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f259672a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f259673b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f259674c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f259675d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final String f259676e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final String f259677f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f259678g;

            public e(@k ArrayList arrayList, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, boolean z12) {
                this.f259672a = arrayList;
                this.f259673b = str;
                this.f259674c = str2;
                this.f259675d = str3;
                this.f259676e = str4;
                this.f259677f = str5;
                this.f259678g = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f259672a.equals(eVar.f259672a) && L.f(this.f259673b, eVar.f259673b) && L.f(this.f259674c, eVar.f259674c) && L.f(this.f259675d, eVar.f259675d) && L.f(this.f259676e, eVar.f259676e) && L.f(this.f259677f, eVar.f259677f) && this.f259678g == eVar.f259678g;
            }

            public final int hashCode() {
                int iHashCode = this.f259672a.hashCode() * 31;
                String str = this.f259673b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f259674c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f259675d;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f259676e;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f259677f;
                return Boolean.hashCode(this.f259678g) + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FastChipsViewState(fastChips=");
                sb2.append(this.f259672a);
                sb2.append(", fastChipsRecommendationSubtitle=");
                sb2.append(this.f259673b);
                sb2.append(", fastChipsRecommendationTitle=");
                sb2.append(this.f259674c);
                sb2.append(", fastChipsSubtitle=");
                sb2.append(this.f259675d);
                sb2.append(", fastChipsTitle=");
                sb2.append(this.f259676e);
                sb2.append(", fastChipsMessage=");
                sb2.append(this.f259677f);
                sb2.append(", scrollToOfferTypeSelector=");
                return r.x(sb2, this.f259678g, ')');
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$f;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f259679a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f259680b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f259681c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f259682d;

            public f(boolean z12, boolean z13, boolean z14, boolean z15) {
                this.f259679a = z12;
                this.f259680b = z13;
                this.f259681c = z14;
                this.f259682d = z15;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f259679a == fVar.f259679a && this.f259680b == fVar.f259680b && this.f259681c == fVar.f259681c && this.f259682d == fVar.f259682d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f259682d) + r.i(r.i(Boolean.hashCode(this.f259679a) * 31, 31, this.f259680b), 31, this.f259681c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FieldsVisibilityState(offerTypeSelectorVisibility=");
                sb2.append(this.f259679a);
                sb2.append(", discountInputFieldVisibility=");
                sb2.append(this.f259680b);
                sb2.append(", validityDateVisibility=");
                sb2.append(this.f259681c);
                sb2.append(", audienceInputFieldVisibility=");
                return r.x(sb2, this.f259682d, ')');
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$g;", "", "a", "b", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$g$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$g$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface g {

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$g$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements g {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final To0.h f259683a;

                public a(@k To0.h hVar) {
                    this.f259683a = hVar;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && L.f(this.f259683a, ((a) obj).f259683a);
                }

                public final int hashCode() {
                    return this.f259683a.hashCode();
                }

                @k
                public final String toString() {
                    return "TariffInternal(tariff=" + this.f259683a + ')';
                }
            }

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$g$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b implements g {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final To0.i f259684a;

                public b(@k To0.i iVar) {
                    this.f259684a = iVar;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && L.f(this.f259684a, ((b) obj).f259684a);
                }

                public final int hashCode() {
                    return this.f259684a.f15921a.hashCode();
                }

                @k
                public final String toString() {
                    return "VasInternal(vas=" + this.f259684a + ')';
                }
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$h;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class h {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final g f259685a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final C15385b f259686b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f259687c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f259688d;

            /* renamed from: e, reason: collision with root package name */
            public final long f259689e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Long f259690f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final String f259691g;

            /* renamed from: h, reason: collision with root package name */
            @k
            public final ArrayList f259692h;

            /* renamed from: i, reason: collision with root package name */
            @l
            public final List<C15386c> f259693i;

            /* renamed from: j, reason: collision with root package name */
            public final int f259694j;

            /* renamed from: k, reason: collision with root package name */
            public final boolean f259695k;

            /* renamed from: l, reason: collision with root package name */
            @l
            public final List<To0.d> f259696l;

            /* renamed from: m, reason: collision with root package name */
            public final boolean f259697m;

            public h(@k g gVar, @l C15385b c15385b, boolean z12, boolean z13, long j12, @l Long l12, @k String str, @k ArrayList arrayList, @l List list, int i12, boolean z14, @l List list2, boolean z15) {
                this.f259685a = gVar;
                this.f259686b = c15385b;
                this.f259687c = z12;
                this.f259688d = z13;
                this.f259689e = j12;
                this.f259690f = l12;
                this.f259691g = str;
                this.f259692h = arrayList;
                this.f259693i = list;
                this.f259694j = i12;
                this.f259695k = z14;
                this.f259696l = list2;
                this.f259697m = z15;
            }

            public static h a(h hVar, int i12, boolean z12, int i13) {
                g gVar = hVar.f259685a;
                C15385b c15385b = hVar.f259686b;
                boolean z13 = hVar.f259687c;
                boolean z14 = hVar.f259688d;
                long j12 = hVar.f259689e;
                Long l12 = hVar.f259690f;
                String str = hVar.f259691g;
                ArrayList arrayList = hVar.f259692h;
                List<C15386c> list = hVar.f259693i;
                boolean z15 = (i13 & 1024) != 0 ? hVar.f259695k : z12;
                List<To0.d> list2 = hVar.f259696l;
                boolean z16 = hVar.f259697m;
                hVar.getClass();
                return new h(gVar, c15385b, z13, z14, j12, l12, str, arrayList, list, i12, z15, list2, z16);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.f259685a.equals(hVar.f259685a) && this.f259686b.equals(hVar.f259686b) && this.f259687c == hVar.f259687c && this.f259688d == hVar.f259688d && this.f259689e == hVar.f259689e && this.f259690f.equals(hVar.f259690f) && L.f(this.f259691g, hVar.f259691g) && this.f259692h.equals(hVar.f259692h) && L.f(this.f259693i, hVar.f259693i) && this.f259694j == hVar.f259694j && this.f259695k == hVar.f259695k && L.f(this.f259696l, hVar.f259696l) && this.f259697m == hVar.f259697m;
            }

            public final int hashCode() {
                int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f259692h, H.d((this.f259690f.hashCode() + r.g(r.i(r.i((this.f259686b.hashCode() + (this.f259685a.hashCode() * 31)) * 31, 31, this.f259687c), 31, this.f259688d), 31, this.f259689e)) * 31, 31, this.f259691g), 31);
                List<C15386c> list = this.f259693i;
                int i12 = r.i(r.e(this.f259694j, (iG2 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.f259695k);
                List<To0.d> list2 = this.f259696l;
                return Boolean.hashCode(this.f259697m) + ((i12 + (list2 != null ? list2.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InternalState(paymentData=");
                sb2.append(this.f259685a);
                sb2.append(", descriptions=");
                sb2.append(this.f259686b);
                sb2.append(", autoDispatchFeatureSupported=");
                sb2.append(this.f259687c);
                sb2.append(", autoDispatchEnabledByDefault=");
                sb2.append(this.f259688d);
                sb2.append(", availableAudienceCount=");
                sb2.append(this.f259689e);
                sb2.append(", price=");
                sb2.append(this.f259690f);
                sb2.append(", itemOldPriceString=");
                sb2.append(this.f259691g);
                sb2.append(", offerList=");
                sb2.append(this.f259692h);
                sb2.append(", fastChips=");
                sb2.append(this.f259693i);
                sb2.append(", selectedFastChipId=");
                sb2.append(this.f259694j);
                sb2.append(", customFastChipWasClicked=");
                sb2.append(this.f259695k);
                sb2.append(", forecastPresets=");
                sb2.append(this.f259696l);
                sb2.append(", forecastPresetsFeatureSupported=");
                return r.x(sb2, this.f259697m, ')');
            }
        }

        public DiscountDispatchDataLoaded(long j12, @k i iVar, @k com.avito.android.sbc.create.mvi.util.d dVar, @k String str, boolean z12, long j13, long j14, @k com.avito.android.sbc.create.mvi.util.d dVar2, boolean z13, @k String str2, @k String str3, @k String str4, @l Image image, @k String str5, @k String str6, @k CharSequence charSequence, @k c cVar, boolean z14, @k String str7, @k String str8, boolean z15, boolean z16, @k j jVar, @k CharSequence charSequence2, @k CharSequence charSequence3, @l MnzFloatingFooter mnzFloatingFooter, @l Integer num, @l d dVar3, @k h hVar, @l e eVar, @k f fVar) {
            this.f259622b = j12;
            this.f259623c = iVar;
            this.f259624d = dVar;
            this.f259625e = str;
            this.f259626f = z12;
            this.f259627g = j13;
            this.f259628h = j14;
            this.f259629i = dVar2;
            this.f259630j = z13;
            this.f259631k = str2;
            this.f259632l = str3;
            this.f259633m = str4;
            this.f259634n = image;
            this.f259635o = str5;
            this.f259636p = str6;
            this.f259637q = charSequence;
            this.f259638r = cVar;
            this.f259639s = z14;
            this.f259640t = str7;
            this.f259641u = str8;
            this.f259642v = z15;
            this.f259643w = z16;
            this.f259644x = jVar;
            this.f259645y = charSequence2;
            this.f259646z = charSequence3;
            this.f259616A = mnzFloatingFooter;
            this.f259617B = num;
            this.f259618C = dVar3;
            this.f259619D = hVar;
            this.f259620E = eVar;
            this.f259621F = fVar;
        }

        public static DiscountDispatchDataLoaded a(DiscountDispatchDataLoaded discountDispatchDataLoaded, i iVar, long j12, boolean z12, String str, String str2, c cVar, boolean z13, String str3, String str4, boolean z14, boolean z15, j jVar, Integer num, d dVar, h hVar, e eVar, f fVar, int i12) {
            CharSequence charSequence;
            c cVar2;
            MnzFloatingFooter mnzFloatingFooter;
            Integer num2;
            long j13 = discountDispatchDataLoaded.f259622b;
            i iVar2 = (i12 & 2) != 0 ? discountDispatchDataLoaded.f259623c : iVar;
            com.avito.android.sbc.create.mvi.util.d dVar2 = discountDispatchDataLoaded.f259624d;
            String str5 = discountDispatchDataLoaded.f259625e;
            boolean z16 = (i12 & 16) != 0 ? discountDispatchDataLoaded.f259626f : false;
            long j14 = discountDispatchDataLoaded.f259627g;
            long j15 = (i12 & 64) != 0 ? discountDispatchDataLoaded.f259628h : j12;
            com.avito.android.sbc.create.mvi.util.d dVar3 = discountDispatchDataLoaded.f259629i;
            boolean z17 = (i12 & 256) != 0 ? discountDispatchDataLoaded.f259630j : z12;
            String str6 = (i12 & 512) != 0 ? discountDispatchDataLoaded.f259631k : str;
            String str7 = discountDispatchDataLoaded.f259632l;
            String str8 = discountDispatchDataLoaded.f259633m;
            Image image = discountDispatchDataLoaded.f259634n;
            String str9 = discountDispatchDataLoaded.f259635o;
            String str10 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? discountDispatchDataLoaded.f259636p : str2;
            CharSequence charSequence2 = discountDispatchDataLoaded.f259637q;
            if ((i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
                charSequence = charSequence2;
                cVar2 = discountDispatchDataLoaded.f259638r;
            } else {
                charSequence = charSequence2;
                cVar2 = cVar;
            }
            boolean z18 = (131072 & i12) != 0 ? discountDispatchDataLoaded.f259639s : z13;
            String str11 = (262144 & i12) != 0 ? discountDispatchDataLoaded.f259640t : str3;
            String str12 = (524288 & i12) != 0 ? discountDispatchDataLoaded.f259641u : str4;
            boolean z19 = (1048576 & i12) != 0 ? discountDispatchDataLoaded.f259642v : z14;
            boolean z22 = (2097152 & i12) != 0 ? discountDispatchDataLoaded.f259643w : z15;
            j jVar2 = (4194304 & i12) != 0 ? discountDispatchDataLoaded.f259644x : jVar;
            CharSequence charSequence3 = discountDispatchDataLoaded.f259645y;
            CharSequence charSequence4 = discountDispatchDataLoaded.f259646z;
            MnzFloatingFooter mnzFloatingFooter2 = discountDispatchDataLoaded.f259616A;
            if ((i12 & 67108864) != 0) {
                mnzFloatingFooter = mnzFloatingFooter2;
                num2 = discountDispatchDataLoaded.f259617B;
            } else {
                mnzFloatingFooter = mnzFloatingFooter2;
                num2 = num;
            }
            d dVar4 = (134217728 & i12) != 0 ? discountDispatchDataLoaded.f259618C : dVar;
            h hVar2 = (268435456 & i12) != 0 ? discountDispatchDataLoaded.f259619D : hVar;
            e eVar2 = (536870912 & i12) != 0 ? discountDispatchDataLoaded.f259620E : eVar;
            f fVar2 = (i12 & 1073741824) != 0 ? discountDispatchDataLoaded.f259621F : fVar;
            discountDispatchDataLoaded.getClass();
            return new DiscountDispatchDataLoaded(j13, iVar2, dVar2, str5, z16, j14, j15, dVar3, z17, str6, str7, str8, image, str9, str10, charSequence, cVar2, z18, str11, str12, z19, z22, jVar2, charSequence3, charSequence4, mnzFloatingFooter, num2, dVar4, hVar2, eVar2, fVar2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscountDispatchDataLoaded)) {
                return false;
            }
            DiscountDispatchDataLoaded discountDispatchDataLoaded = (DiscountDispatchDataLoaded) obj;
            return this.f259622b == discountDispatchDataLoaded.f259622b && L.f(this.f259623c, discountDispatchDataLoaded.f259623c) && L.f(this.f259624d, discountDispatchDataLoaded.f259624d) && L.f(this.f259625e, discountDispatchDataLoaded.f259625e) && this.f259626f == discountDispatchDataLoaded.f259626f && this.f259627g == discountDispatchDataLoaded.f259627g && this.f259628h == discountDispatchDataLoaded.f259628h && L.f(this.f259629i, discountDispatchDataLoaded.f259629i) && this.f259630j == discountDispatchDataLoaded.f259630j && L.f(this.f259631k, discountDispatchDataLoaded.f259631k) && L.f(this.f259632l, discountDispatchDataLoaded.f259632l) && L.f(this.f259633m, discountDispatchDataLoaded.f259633m) && L.f(this.f259634n, discountDispatchDataLoaded.f259634n) && L.f(this.f259635o, discountDispatchDataLoaded.f259635o) && L.f(this.f259636p, discountDispatchDataLoaded.f259636p) && L.f(this.f259637q, discountDispatchDataLoaded.f259637q) && L.f(this.f259638r, discountDispatchDataLoaded.f259638r) && this.f259639s == discountDispatchDataLoaded.f259639s && L.f(this.f259640t, discountDispatchDataLoaded.f259640t) && L.f(this.f259641u, discountDispatchDataLoaded.f259641u) && this.f259642v == discountDispatchDataLoaded.f259642v && this.f259643w == discountDispatchDataLoaded.f259643w && L.f(this.f259644x, discountDispatchDataLoaded.f259644x) && L.f(this.f259645y, discountDispatchDataLoaded.f259645y) && L.f(this.f259646z, discountDispatchDataLoaded.f259646z) && L.f(this.f259616A, discountDispatchDataLoaded.f259616A) && L.f(this.f259617B, discountDispatchDataLoaded.f259617B) && L.f(this.f259618C, discountDispatchDataLoaded.f259618C) && L.f(this.f259619D, discountDispatchDataLoaded.f259619D) && L.f(this.f259620E, discountDispatchDataLoaded.f259620E) && L.f(this.f259621F, discountDispatchDataLoaded.f259621F);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(H.d(r.i((this.f259629i.hashCode() + r.g(r.g(r.i(H.d((this.f259624d.hashCode() + ((this.f259623c.hashCode() + (Long.hashCode(this.f259622b) * 31)) * 31)) * 31, 31, this.f259625e), 31, this.f259626f), 31, this.f259627g), 31, this.f259628h)) * 31, 31, this.f259630j), 31, this.f259631k), 31, this.f259632l), 31, this.f259633m);
            Image image = this.f259634n;
            int iC2 = com.avito.android.advert.item.delivery_suggests.l.c(com.avito.android.advert.item.delivery_suggests.l.c((this.f259644x.hashCode() + r.i(r.i(H.d(H.d(r.i((this.f259638r.hashCode() + com.avito.android.advert.item.delivery_suggests.l.c(H.d(H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f259635o), 31, this.f259636p), 31, this.f259637q)) * 31, 31, this.f259639s), 31, this.f259640t), 31, this.f259641u), 31, this.f259642v), 31, this.f259643w)) * 31, 31, this.f259645y), 31, this.f259646z);
            MnzFloatingFooter mnzFloatingFooter = this.f259616A;
            int iHashCode = (iC2 + (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode())) * 31;
            Integer num = this.f259617B;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            d dVar = this.f259618C;
            int iHashCode3 = (this.f259619D.hashCode() + ((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
            e eVar = this.f259620E;
            return this.f259621F.hashCode() + ((iHashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "DiscountDispatchDataLoaded(id=" + this.f259622b + ", selectedOffer=" + this.f259623c + ", discountDescription=" + this.f259624d + ", initialAudienceCountValue=" + this.f259625e + ", needToShowInitialAudienceCount=" + this.f259626f + ", availableAudienceCount=" + this.f259627g + ", enteredAudienceCount=" + this.f259628h + ", audienceSubtitle=" + this.f259629i + ", invalidAudienceValue=" + this.f259630j + ", invalidAudienceErrorText=" + this.f259631k + ", itemTitle=" + this.f259632l + ", itemLocation=" + this.f259633m + ", itemImage=" + this.f259634n + ", previewMessagePattern=" + this.f259635o + ", previewMessage=" + this.f259636p + ", previewTitle=" + ((Object) this.f259637q) + ", paymentTypeData=" + this.f259638r + ", inputBlocked=" + this.f259639s + ", enteredRoublesDiscount=" + this.f259640t + ", enteredPercentDiscount=" + this.f259641u + ", needToShowEnteredRoublesDiscount=" + this.f259642v + ", needToShowEnteredPercentDiscount=" + this.f259643w + ", validityDate=" + this.f259644x + ", title=" + ((Object) this.f259645y) + ", offerTypeSubTitle=" + ((Object) this.f259646z) + ", footer=" + this.f259616A + ", mnzFooterClickedButtonId=" + this.f259617B + ", autoDispatchViewState=" + this.f259618C + ", internalState=" + this.f259619D + ", fastChipsViewState=" + this.f259620E + ", basicFieldsVisibilityState=" + this.f259621F + ')';
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$c;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$e;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface i {

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements i {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f259698a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f259699b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f259700c;

                /* renamed from: d, reason: collision with root package name */
                public final long f259701d;

                /* renamed from: e, reason: collision with root package name */
                @l
                public final d f259702e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f259703f;

                /* renamed from: g, reason: collision with root package name */
                @l
                public final String f259704g;

                /* renamed from: h, reason: collision with root package name */
                public final long f259705h;

                /* renamed from: i, reason: collision with root package name */
                public final long f259706i;

                /* renamed from: j, reason: collision with root package name */
                @k
                public final String f259707j;

                /* renamed from: k, reason: collision with root package name */
                public final long f259708k;

                /* renamed from: l, reason: collision with root package name */
                public final long f259709l;

                public a(@k String str, @k String str2, @k String str3, long j12, @l d dVar, boolean z12, @l String str4, long j13, long j14, @k String str5, long j15, long j16) {
                    this.f259698a = str;
                    this.f259699b = str2;
                    this.f259700c = str3;
                    this.f259701d = j12;
                    this.f259702e = dVar;
                    this.f259703f = z12;
                    this.f259704g = str4;
                    this.f259705h = j13;
                    this.f259706i = j14;
                    this.f259707j = str5;
                    this.f259708k = j15;
                    this.f259709l = j16;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: a, reason: from getter */
                public final String getF259735c() {
                    return this.f259700c;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                /* renamed from: b, reason: from getter */
                public final long getF259736d() {
                    return this.f259701d;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @l
                /* renamed from: c, reason: from getter */
                public final d getF259737e() {
                    return this.f259702e;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return L.f(this.f259698a, aVar.f259698a) && L.f(this.f259699b, aVar.f259699b) && L.f(this.f259700c, aVar.f259700c) && this.f259701d == aVar.f259701d && L.f(this.f259702e, aVar.f259702e) && this.f259703f == aVar.f259703f && L.f(this.f259704g, aVar.f259704g) && this.f259705h == aVar.f259705h && this.f259706i == aVar.f259706i && L.f(this.f259707j, aVar.f259707j) && this.f259708k == aVar.f259708k && this.f259709l == aVar.f259709l;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: getSlug, reason: from getter */
                public final String getF259734b() {
                    return this.f259699b;
                }

                public final int hashCode() {
                    int iG2 = r.g(H.d(H.d(this.f259698a.hashCode() * 31, 31, this.f259699b), 31, this.f259700c), 31, this.f259701d);
                    d dVar = this.f259702e;
                    int i12 = r.i((iG2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f259703f);
                    String str = this.f259704g;
                    return Long.hashCode(this.f259709l) + r.g(H.d(r.g(r.g((i12 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f259705h), 31, this.f259706i), 31, this.f259707j), 31, this.f259708k);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("DiscountPercent(name=");
                    sb2.append(this.f259698a);
                    sb2.append(", slug=");
                    sb2.append(this.f259699b);
                    sb2.append(", offerText=");
                    sb2.append(this.f259700c);
                    sb2.append(", messagePrice=");
                    sb2.append(this.f259701d);
                    sb2.append(", expiresAt=");
                    sb2.append(this.f259702e);
                    sb2.append(", invalidDiscountValue=");
                    sb2.append(this.f259703f);
                    sb2.append(", invalidDiscountMessage=");
                    sb2.append(this.f259704g);
                    sb2.append(", minDiscountPercent=");
                    sb2.append(this.f259705h);
                    sb2.append(", maxDiscountPercent=");
                    sb2.append(this.f259706i);
                    sb2.append(", discountSubtitle=");
                    sb2.append(this.f259707j);
                    sb2.append(", itemOldPrice=");
                    sb2.append(this.f259708k);
                    sb2.append(", itemNewPrice=");
                    return r.u(sb2, this.f259709l, ')');
                }
            }

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b implements i {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f259710a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f259711b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f259712c;

                /* renamed from: d, reason: collision with root package name */
                public final long f259713d;

                /* renamed from: e, reason: collision with root package name */
                @l
                public final d f259714e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f259715f;

                /* renamed from: g, reason: collision with root package name */
                @l
                public final String f259716g;

                /* renamed from: h, reason: collision with root package name */
                public final long f259717h;

                /* renamed from: i, reason: collision with root package name */
                public final long f259718i;

                /* renamed from: j, reason: collision with root package name */
                @k
                public final String f259719j;

                /* renamed from: k, reason: collision with root package name */
                public final long f259720k;

                /* renamed from: l, reason: collision with root package name */
                public final long f259721l;

                public b(@k String str, @k String str2, @k String str3, long j12, @l d dVar, boolean z12, @l String str4, long j13, long j14, @k String str5, long j15, long j16) {
                    this.f259710a = str;
                    this.f259711b = str2;
                    this.f259712c = str3;
                    this.f259713d = j12;
                    this.f259714e = dVar;
                    this.f259715f = z12;
                    this.f259716g = str4;
                    this.f259717h = j13;
                    this.f259718i = j14;
                    this.f259719j = str5;
                    this.f259720k = j15;
                    this.f259721l = j16;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: a, reason: from getter */
                public final String getF259735c() {
                    return this.f259712c;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                /* renamed from: b, reason: from getter */
                public final long getF259736d() {
                    return this.f259713d;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @l
                /* renamed from: c, reason: from getter */
                public final d getF259737e() {
                    return this.f259714e;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return L.f(this.f259710a, bVar.f259710a) && L.f(this.f259711b, bVar.f259711b) && L.f(this.f259712c, bVar.f259712c) && this.f259713d == bVar.f259713d && L.f(this.f259714e, bVar.f259714e) && this.f259715f == bVar.f259715f && L.f(this.f259716g, bVar.f259716g) && this.f259717h == bVar.f259717h && this.f259718i == bVar.f259718i && L.f(this.f259719j, bVar.f259719j) && this.f259720k == bVar.f259720k && this.f259721l == bVar.f259721l;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: getSlug, reason: from getter */
                public final String getF259734b() {
                    return this.f259711b;
                }

                public final int hashCode() {
                    int iG2 = r.g(H.d(H.d(this.f259710a.hashCode() * 31, 31, this.f259711b), 31, this.f259712c), 31, this.f259713d);
                    d dVar = this.f259714e;
                    int i12 = r.i((iG2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f259715f);
                    String str = this.f259716g;
                    return Long.hashCode(this.f259721l) + r.g(H.d(r.g(r.g((i12 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f259717h), 31, this.f259718i), 31, this.f259719j), 31, this.f259720k);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("DiscountRoubles(name=");
                    sb2.append(this.f259710a);
                    sb2.append(", slug=");
                    sb2.append(this.f259711b);
                    sb2.append(", offerText=");
                    sb2.append(this.f259712c);
                    sb2.append(", messagePrice=");
                    sb2.append(this.f259713d);
                    sb2.append(", expiresAt=");
                    sb2.append(this.f259714e);
                    sb2.append(", invalidDiscountValue=");
                    sb2.append(this.f259715f);
                    sb2.append(", invalidDiscountMessage=");
                    sb2.append(this.f259716g);
                    sb2.append(", minDiscount=");
                    sb2.append(this.f259717h);
                    sb2.append(", maxDiscount=");
                    sb2.append(this.f259718i);
                    sb2.append(", discountSubtitle=");
                    sb2.append(this.f259719j);
                    sb2.append(", itemOldPrice=");
                    sb2.append(this.f259720k);
                    sb2.append(", itemNewPrice=");
                    return r.u(sb2, this.f259721l, ')');
                }
            }

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$d;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class d {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final LocalDate f259729a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final LocalDate f259730b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final LocalDate f259731c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f259732d;

                public d(@k LocalDate localDate, @k LocalDate localDate2, @k LocalDate localDate3, boolean z12) {
                    this.f259729a = localDate;
                    this.f259730b = localDate2;
                    this.f259731c = localDate3;
                    this.f259732d = z12;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return L.f(this.f259729a, dVar.f259729a) && L.f(this.f259730b, dVar.f259730b) && L.f(this.f259731c, dVar.f259731c) && this.f259732d == dVar.f259732d;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f259732d) + ((this.f259731c.hashCode() + ((this.f259730b.hashCode() + (this.f259729a.hashCode() * 31)) * 31)) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ExpiresAt(default=");
                    sb2.append(this.f259729a);
                    sb2.append(", max=");
                    sb2.append(this.f259730b);
                    sb2.append(", min=");
                    sb2.append(this.f259731c);
                    sb2.append(", readOnly=");
                    return r.x(sb2, this.f259732d, ')');
                }
            }

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$e;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class e implements i {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f259733a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f259734b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f259735c;

                /* renamed from: d, reason: collision with root package name */
                public final long f259736d;

                /* renamed from: e, reason: collision with root package name */
                @l
                public final d f259737e;

                /* renamed from: f, reason: collision with root package name */
                @k
                public final String f259738f;

                public e(@k String str, @k String str2, @k String str3, long j12, @l d dVar, @k String str4) {
                    this.f259733a = str;
                    this.f259734b = str2;
                    this.f259735c = str3;
                    this.f259736d = j12;
                    this.f259737e = dVar;
                    this.f259738f = str4;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: a, reason: from getter */
                public final String getF259735c() {
                    return this.f259735c;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                /* renamed from: b, reason: from getter */
                public final long getF259736d() {
                    return this.f259736d;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @l
                /* renamed from: c, reason: from getter */
                public final d getF259737e() {
                    return this.f259737e;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return L.f(this.f259733a, eVar.f259733a) && L.f(this.f259734b, eVar.f259734b) && L.f(this.f259735c, eVar.f259735c) && this.f259736d == eVar.f259736d && L.f(this.f259737e, eVar.f259737e) && L.f(this.f259738f, eVar.f259738f);
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: getSlug, reason: from getter */
                public final String getF259734b() {
                    return this.f259734b;
                }

                public final int hashCode() {
                    int iG2 = r.g(H.d(H.d(this.f259733a.hashCode() * 31, 31, this.f259734b), 31, this.f259735c), 31, this.f259736d);
                    d dVar = this.f259737e;
                    return this.f259738f.hashCode() + ((iG2 + (dVar == null ? 0 : dVar.hashCode())) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Text(name=");
                    sb2.append(this.f259733a);
                    sb2.append(", slug=");
                    sb2.append(this.f259734b);
                    sb2.append(", offerText=");
                    sb2.append(this.f259735c);
                    sb2.append(", messagePrice=");
                    sb2.append(this.f259736d);
                    sb2.append(", expiresAt=");
                    sb2.append(this.f259737e);
                    sb2.append(", itemPrice=");
                    return C22026a.c(sb2, this.f259738f, ')');
                }
            }

            @k
            /* renamed from: a */
            String getF259735c();

            /* renamed from: b */
            long getF259736d();

            @l
            /* renamed from: c */
            d getF259737e();

            @k
            /* renamed from: getSlug */
            String getF259734b();

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i$c;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$i;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c implements i {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f259722a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f259723b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f259724c;

                /* renamed from: d, reason: collision with root package name */
                public final long f259725d;

                /* renamed from: e, reason: collision with root package name */
                @l
                public final d f259726e;

                /* renamed from: f, reason: collision with root package name */
                @k
                public final String f259727f;

                /* renamed from: g, reason: collision with root package name */
                @l
                public final String f259728g;

                public c(@k String str, @k String str2, @k String str3, long j12, @l d dVar, @k String str4, @l String str5) {
                    this.f259722a = str;
                    this.f259723b = str2;
                    this.f259724c = str3;
                    this.f259725d = j12;
                    this.f259726e = dVar;
                    this.f259727f = str4;
                    this.f259728g = str5;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: a, reason: from getter */
                public final String getF259735c() {
                    return this.f259724c;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                /* renamed from: b, reason: from getter */
                public final long getF259736d() {
                    return this.f259725d;
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @l
                /* renamed from: c, reason: from getter */
                public final d getF259737e() {
                    return this.f259726e;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return L.f(this.f259722a, cVar.f259722a) && L.f(this.f259723b, cVar.f259723b) && L.f(this.f259724c, cVar.f259724c) && this.f259725d == cVar.f259725d && L.f(this.f259726e, cVar.f259726e) && L.f(this.f259727f, cVar.f259727f) && L.f(this.f259728g, cVar.f259728g);
                }

                @Override // com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState.DiscountDispatchDataLoaded.i
                @k
                /* renamed from: getSlug, reason: from getter */
                public final String getF259734b() {
                    return this.f259723b;
                }

                public final int hashCode() {
                    int iG2 = r.g(H.d(H.d(this.f259722a.hashCode() * 31, 31, this.f259723b), 31, this.f259724c), 31, this.f259725d);
                    d dVar = this.f259726e;
                    int iD2 = H.d((iG2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f259727f);
                    String str = this.f259728g;
                    return iD2 + (str != null ? str.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Empty(name=");
                    sb2.append(this.f259722a);
                    sb2.append(", slug=");
                    sb2.append(this.f259723b);
                    sb2.append(", offerText=");
                    sb2.append(this.f259724c);
                    sb2.append(", messagePrice=");
                    sb2.append(this.f259725d);
                    sb2.append(", expiresAt=");
                    sb2.append(this.f259726e);
                    sb2.append(", itemPrice=");
                    sb2.append(this.f259727f);
                    sb2.append(", errorText=");
                    return C22026a.c(sb2, this.f259728g, ')');
                }

                public /* synthetic */ c(String str, String str2, String str3, long j12, d dVar, String str4, String str5, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "empty_offer_slug" : str2, (i12 & 4) != 0 ? "[...]" : str3, (i12 & 8) != 0 ? 0L : j12, (i12 & 16) != 0 ? null : dVar, str4, (i12 & 64) != 0 ? null : str5);
                }
            }
        }

        /* compiled from: CreateDiscountDispatchState.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j;", "", "a", "b", "c", "d", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$c;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface j {

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$a;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements j {

                /* renamed from: a, reason: collision with root package name */
                @k
                public static final a f259739a = new a();

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 176809311;
                }

                @k
                public final String toString() {
                    return "Empty";
                }
            }

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$b;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b implements j {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final LocalDate f259740a;

                /* renamed from: b, reason: collision with root package name */
                @l
                public final String f259741b;

                public b(@k LocalDate localDate, @l String str) {
                    this.f259740a = localDate;
                    this.f259741b = str;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return L.f(this.f259740a, bVar.f259740a) && L.f(this.f259741b, bVar.f259741b);
                }

                public final int hashCode() {
                    int iHashCode = this.f259740a.hashCode() * 31;
                    String str = this.f259741b;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Fixed(selectedDate=");
                    sb2.append(this.f259740a);
                    sb2.append(", validityDateOfferTypeMessage=");
                    return C22026a.c(sb2, this.f259741b, ')');
                }
            }

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$c;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c implements j {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final LocalDate f259742a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f259743b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final LocalDate f259744c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final LocalDate f259745d;

                /* renamed from: e, reason: collision with root package name */
                @k
                public final LocalDate f259746e;

                /* renamed from: f, reason: collision with root package name */
                @k
                public final String f259747f;

                public c(@k LocalDate localDate, @k String str, @k LocalDate localDate2, @k LocalDate localDate3, @k LocalDate localDate4, @k String str2) {
                    this.f259742a = localDate;
                    this.f259743b = str;
                    this.f259744c = localDate2;
                    this.f259745d = localDate3;
                    this.f259746e = localDate4;
                    this.f259747f = str2;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return L.f(this.f259742a, cVar.f259742a) && L.f(this.f259743b, cVar.f259743b) && L.f(this.f259744c, cVar.f259744c) && L.f(this.f259745d, cVar.f259745d) && L.f(this.f259746e, cVar.f259746e) && L.f(this.f259747f, cVar.f259747f);
                }

                public final int hashCode() {
                    return this.f259747f.hashCode() + ((this.f259746e.hashCode() + ((this.f259745d.hashCode() + ((this.f259744c.hashCode() + H.d(this.f259742a.hashCode() * 31, 31, this.f259743b)) * 31)) * 31)) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Range(selectedDate=");
                    sb2.append(this.f259742a);
                    sb2.append(", selectedDateString=");
                    sb2.append(this.f259743b);
                    sb2.append(", defaultDate=");
                    sb2.append(this.f259744c);
                    sb2.append(", minDate=");
                    sb2.append(this.f259745d);
                    sb2.append(", maxDate=");
                    sb2.append(this.f259746e);
                    sb2.append(", daysLeftSubtitle=");
                    return C22026a.c(sb2, this.f259747f, ')');
                }
            }

            /* compiled from: CreateDiscountDispatchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j$d;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState$DiscountDispatchDataLoaded$j;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class d implements j {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final LocalDate f259748a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f259749b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final LocalDate f259750c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final LocalDate f259751d;

                /* renamed from: e, reason: collision with root package name */
                @k
                public final LocalDate f259752e;

                /* renamed from: f, reason: collision with root package name */
                @k
                public final String f259753f;

                /* renamed from: g, reason: collision with root package name */
                public final int f259754g;

                /* renamed from: h, reason: collision with root package name */
                public final int f259755h;

                /* renamed from: i, reason: collision with root package name */
                @l
                public final String f259756i;

                /* renamed from: j, reason: collision with root package name */
                public final boolean f259757j;

                public d(@k LocalDate localDate, @k String str, @k LocalDate localDate2, @k LocalDate localDate3, @k LocalDate localDate4, @k String str2, int i12, int i13, @l String str3, boolean z12) {
                    this.f259748a = localDate;
                    this.f259749b = str;
                    this.f259750c = localDate2;
                    this.f259751d = localDate3;
                    this.f259752e = localDate4;
                    this.f259753f = str2;
                    this.f259754g = i12;
                    this.f259755h = i13;
                    this.f259756i = str3;
                    this.f259757j = z12;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return L.f(this.f259748a, dVar.f259748a) && L.f(this.f259749b, dVar.f259749b) && L.f(this.f259750c, dVar.f259750c) && L.f(this.f259751d, dVar.f259751d) && L.f(this.f259752e, dVar.f259752e) && L.f(this.f259753f, dVar.f259753f) && this.f259754g == dVar.f259754g && this.f259755h == dVar.f259755h && L.f(this.f259756i, dVar.f259756i) && this.f259757j == dVar.f259757j;
                }

                public final int hashCode() {
                    int iE2 = r.e(this.f259755h, r.e(this.f259754g, H.d((this.f259752e.hashCode() + ((this.f259751d.hashCode() + ((this.f259750c.hashCode() + H.d(this.f259748a.hashCode() * 31, 31, this.f259749b)) * 31)) * 31)) * 31, 31, this.f259753f), 31), 31);
                    String str = this.f259756i;
                    return Boolean.hashCode(this.f259757j) + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("RangeDays(selectedDate=");
                    sb2.append(this.f259748a);
                    sb2.append(", selectedDateString=");
                    sb2.append(this.f259749b);
                    sb2.append(", defaultDate=");
                    sb2.append(this.f259750c);
                    sb2.append(", minDate=");
                    sb2.append(this.f259751d);
                    sb2.append(", maxDate=");
                    sb2.append(this.f259752e);
                    sb2.append(", daysLeftSubtitle=");
                    sb2.append(this.f259753f);
                    sb2.append(", initialOfferTtlDay=");
                    sb2.append(this.f259754g);
                    sb2.append(", enteredOfferTtlDays=");
                    sb2.append(this.f259755h);
                    sb2.append(", invalidOfferTtlDaysMessage=");
                    sb2.append(this.f259756i);
                    sb2.append(", needToShowInitialOfferTtlDay=");
                    return r.x(sb2, this.f259757j, ')');
                }

                public /* synthetic */ d(LocalDate localDate, String str, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, String str2, int i12, int i13, String str3, boolean z12, int i14, C42822w c42822w) {
                    this(localDate, str, localDate2, localDate3, localDate4, str2, i12, i13, (i14 & 256) != 0 ? null : str3, z12);
                }
            }
        }

        public /* synthetic */ DiscountDispatchDataLoaded(long j12, i iVar, com.avito.android.sbc.create.mvi.util.d dVar, String str, boolean z12, long j13, long j14, com.avito.android.sbc.create.mvi.util.d dVar2, boolean z13, String str2, String str3, String str4, Image image, String str5, String str6, CharSequence charSequence, c cVar, boolean z14, String str7, String str8, boolean z15, boolean z16, j jVar, CharSequence charSequence2, CharSequence charSequence3, MnzFloatingFooter mnzFloatingFooter, Integer num, d dVar3, h hVar, e eVar, f fVar, int i12, C42822w c42822w) {
            this(j12, iVar, dVar, str, z12, j13, j14, dVar2, z13, str2, str3, str4, image, str5, str6, charSequence, cVar, z14, str7, str8, z15, z16, jVar, charSequence2, charSequence3, mnzFloatingFooter, (i12 & 67108864) != 0 ? null : num, dVar3, hVar, eVar, fVar);
        }
    }
}
