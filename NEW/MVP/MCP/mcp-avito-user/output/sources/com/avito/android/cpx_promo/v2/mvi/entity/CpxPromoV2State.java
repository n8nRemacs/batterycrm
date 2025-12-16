package com.avito.android.cpx_promo.v2.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.cpx_promo.v2.compose.a;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.lib.design.chips.h;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.List;
import js.C42419a;
import js.C42420b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoV2State.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "ButtonState", "c", "d", "e", "f", "g", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CpxPromoV2State extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final d f127622n = new d(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final CpxPromoV2State f127623o;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f127624b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f127625c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CpxPromoV2 f127626d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f127627e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f127628f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f127629g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final f f127630h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c f127631i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final b f127632j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final g f127633k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final e f127634l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ButtonState f127635m;

    /* compiled from: CpxPromoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$ButtonState;", "", "ButtonType", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonState {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f127636a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ButtonType f127637b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f127638c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ButtonType f127639d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f127640e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CpxPromoV2State.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$ButtonState$ButtonType;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ButtonType {

            /* renamed from: b, reason: collision with root package name */
            public static final ButtonType f127641b;

            /* renamed from: c, reason: collision with root package name */
            public static final ButtonType f127642c;

            /* renamed from: d, reason: collision with root package name */
            public static final ButtonType f127643d;

            /* renamed from: e, reason: collision with root package name */
            public static final ButtonType f127644e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ ButtonType[] f127645f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f127646g;

            static {
                ButtonType buttonType = new ButtonType("SAVE", 0);
                f127641b = buttonType;
                ButtonType buttonType2 = new ButtonType("SKIP", 1);
                f127642c = buttonType2;
                ButtonType buttonType3 = new ButtonType("CANCEL", 2);
                f127643d = buttonType3;
                ButtonType buttonType4 = new ButtonType("RESET", 3);
                f127644e = buttonType4;
                ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3, buttonType4};
                f127645f = buttonTypeArr;
                f127646g = kotlin.enums.c.a(buttonTypeArr);
            }

            public ButtonType() {
                throw null;
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) f127645f.clone();
            }
        }

        public ButtonState(@l String str, @k ButtonType buttonType, @l String str2, @k ButtonType buttonType2, boolean z12) {
            this.f127636a = str;
            this.f127637b = buttonType;
            this.f127638c = str2;
            this.f127639d = buttonType2;
            this.f127640e = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) obj;
            return L.f(this.f127636a, buttonState.f127636a) && this.f127637b == buttonState.f127637b && L.f(this.f127638c, buttonState.f127638c) && this.f127639d == buttonState.f127639d && this.f127640e == buttonState.f127640e;
        }

        public final int hashCode() {
            String str = this.f127636a;
            int iHashCode = (this.f127637b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            String str2 = this.f127638c;
            return Boolean.hashCode(this.f127640e) + ((this.f127639d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonState(secondaryButtonTitle=");
            sb2.append(this.f127636a);
            sb2.append(", secondaryButtonType=");
            sb2.append(this.f127637b);
            sb2.append(", primaryButtonTitle=");
            sb2.append(this.f127638c);
            sb2.append(", primaryButtonType=");
            sb2.append(this.f127639d);
            sb2.append(", primaryButtonEnabled=");
            return r.x(sb2, this.f127640e, ')');
        }
    }

    /* compiled from: CpxPromoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxPromoV2.Auto.Budget.Value.BudgetId f127647b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f127648c;

        public a(@k CpxPromoV2.Auto.Budget.Value.BudgetId budgetId, @k String str) {
            this.f127647b = budgetId;
            this.f127648c = str;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return this.f127647b == (aVar != null ? aVar.f127647b : null);
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f127648c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f127647b == aVar.f127647b && L.f(this.f127648c, aVar.f127648c);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF281694e() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            return this.f127648c.hashCode() + (this.f127647b.hashCode() * 31);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BudgetChip(id=");
            sb2.append(this.f127647b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f127648c, ')');
        }
    }

    /* compiled from: CpxPromoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$b;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127649a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C42419a f127650b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f127651c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final CpxPromoV2.Auto.Budget.Value.BudgetId f127652d;

        public b(boolean z12, @l C42419a c42419a, @k List<a> list, @k CpxPromoV2.Auto.Budget.Value.BudgetId budgetId) {
            this.f127649a = z12;
            this.f127650b = c42419a;
            this.f127651c = list;
            this.f127652d = budgetId;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f127649a == bVar.f127649a && L.f(this.f127650b, bVar.f127650b) && L.f(this.f127651c, bVar.f127651c) && this.f127652d == bVar.f127652d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127649a) * 31;
            C42419a c42419a = this.f127650b;
            return this.f127652d.hashCode() + C23088b.a((iHashCode + (c42419a == null ? 0 : c42419a.hashCode())) * 31, 31, this.f127651c);
        }

        @k
        public final String toString() {
            return "BudgetState(isBudgetVisible=" + this.f127649a + ", budgetTitle=" + this.f127650b + ", budgets=" + this.f127651c + ", selectedBudgetId=" + this.f127652d + ')';
        }
    }

    /* compiled from: CpxPromoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$c;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127653a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a.b f127654b;

        public c(boolean z12, @l a.b bVar) {
            this.f127653a = z12;
            this.f127654b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f127653a == cVar.f127653a && L.f(this.f127654b, cVar.f127654b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127653a) * 31;
            a.b bVar = this.f127654b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @k
        public final String toString() {
            return "CashbackBannerState(isVisible=" + this.f127653a + ", cashbackBannerData=" + this.f127654b + ')';
        }
    }

    /* compiled from: CpxPromoV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$d;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: CpxPromoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$e;", "", "a", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127655a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127656b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C42419a f127657c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f127658d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Long f127659e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f127660f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<Integer> f127661g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f127662h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f127663i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final a f127664j;

        /* compiled from: CpxPromoV2State.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$e$a;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final long f127665a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f127666b;

            public a(long j12, @l String str) {
                this.f127665a = j12;
                this.f127666b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f127665a == aVar.f127665a && L.f(this.f127666b, aVar.f127666b);
            }

            public final int hashCode() {
                int iHashCode = Long.hashCode(this.f127665a) * 31;
                String str = this.f127666b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InputSheetParams(minValueConstraint=");
                sb2.append(this.f127665a);
                sb2.append(", minErrorText=");
                return C22026a.c(sb2, this.f127666b, ')');
            }
        }

        public e(boolean z12, boolean z13, @l C42419a c42419a, @l String str, @l Long l12, @l String str2, @k List<Integer> list, @l String str3, @InterfaceC42150f @l Integer num, @l a aVar) {
            this.f127655a = z12;
            this.f127656b = z13;
            this.f127657c = c42419a;
            this.f127658d = str;
            this.f127659e = l12;
            this.f127660f = str2;
            this.f127661g = list;
            this.f127662h = str3;
            this.f127663i = num;
            this.f127664j = aVar;
        }

        public static e a(e eVar, boolean z12, boolean z13, C42419a c42419a, String str, Long l12, String str2, List list, String str3, Integer num, a aVar, int i12) {
            boolean z14 = (i12 & 1) != 0 ? eVar.f127655a : z12;
            boolean z15 = (i12 & 2) != 0 ? eVar.f127656b : z13;
            C42419a c42419a2 = (i12 & 4) != 0 ? eVar.f127657c : c42419a;
            String str4 = (i12 & 32) != 0 ? eVar.f127660f : str2;
            List list2 = (i12 & 64) != 0 ? eVar.f127661g : list;
            String str5 = (i12 & 128) != 0 ? eVar.f127662h : str3;
            Integer num2 = (i12 & 256) != 0 ? eVar.f127663i : num;
            a aVar2 = (i12 & 512) != 0 ? eVar.f127664j : aVar;
            eVar.getClass();
            return new e(z14, z15, c42419a2, str, l12, str4, list2, str5, num2, aVar2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f127655a == eVar.f127655a && this.f127656b == eVar.f127656b && L.f(this.f127657c, eVar.f127657c) && L.f(this.f127658d, eVar.f127658d) && L.f(this.f127659e, eVar.f127659e) && L.f(this.f127660f, eVar.f127660f) && L.f(this.f127661g, eVar.f127661g) && L.f(this.f127662h, eVar.f127662h) && L.f(this.f127663i, eVar.f127663i) && L.f(this.f127664j, eVar.f127664j);
        }

        public final int hashCode() {
            int i12 = r.i(Boolean.hashCode(this.f127655a) * 31, 31, this.f127656b);
            C42419a c42419a = this.f127657c;
            int iHashCode = (i12 + (c42419a == null ? 0 : c42419a.hashCode())) * 31;
            String str = this.f127658d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l12 = this.f127659e;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str2 = this.f127660f;
            int iE2 = H.e((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f127661g);
            String str3 = this.f127662h;
            int iHashCode4 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f127663i;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            a aVar = this.f127664j;
            return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ExpenseLimitState(isLimitVisible=" + this.f127655a + ", isClickEnabled=" + this.f127656b + ", title=" + this.f127657c + ", stringValue=" + this.f127658d + ", value=" + this.f127659e + ", placeholder=" + this.f127660f + ", inputState=" + this.f127661g + ", hintText=" + this.f127662h + ", hintTextColorAttr=" + this.f127663i + ", inputSheetParams=" + this.f127664j + ')';
        }
    }

    /* compiled from: CpxPromoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$f;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C42419a f127667a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ArrayList f127668b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f127669c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f127670d;

        public f(@l C42419a c42419a, @l ArrayList arrayList, boolean z12, boolean z13) {
            this.f127667a = c42419a;
            this.f127668b = arrayList;
            this.f127669c = z12;
            this.f127670d = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f127667a, fVar.f127667a) && L.f(this.f127668b, fVar.f127668b) && this.f127669c == fVar.f127669c && this.f127670d == fVar.f127670d;
        }

        public final int hashCode() {
            C42419a c42419a = this.f127667a;
            int iHashCode = (c42419a == null ? 0 : c42419a.hashCode()) * 31;
            ArrayList arrayList = this.f127668b;
            return Boolean.hashCode(this.f127670d) + r.i((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.f127669c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SegmentedControlState(title=");
            sb2.append(this.f127667a);
            sb2.append(", segments=");
            sb2.append(this.f127668b);
            sb2.append(", isAutoSelected=");
            sb2.append(this.f127669c);
            sb2.append(", isVisible=");
            return r.x(sb2, this.f127670d, ')');
        }
    }

    /* compiled from: CpxPromoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State$g;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C42419a f127671a;

        /* renamed from: b, reason: collision with root package name */
        public final long f127672b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f127673c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f127674d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f127675e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f127676f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f127677g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f127678h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f127679i;

        /* renamed from: j, reason: collision with root package name */
        public final int f127680j;

        /* renamed from: k, reason: collision with root package name */
        public final int f127681k;

        /* renamed from: l, reason: collision with root package name */
        public final int f127682l;

        /* renamed from: m, reason: collision with root package name */
        public final long f127683m;

        /* renamed from: n, reason: collision with root package name */
        public final long f127684n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final C42420b f127685o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final String f127686p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final Integer f127687q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final String f127688r;

        public g(@l C42419a c42419a, long j12, @l String str, @l String str2, @l String str3, boolean z12, @l String str4, @l String str5, @InterfaceC42150f @l Integer num, @InterfaceC42150f int i12, int i13, int i14, long j13, long j14, @l C42420b c42420b, @l String str6, @l Integer num2, @l String str7) {
            this.f127671a = c42419a;
            this.f127672b = j12;
            this.f127673c = str;
            this.f127674d = str2;
            this.f127675e = str3;
            this.f127676f = z12;
            this.f127677g = str4;
            this.f127678h = str5;
            this.f127679i = num;
            this.f127680j = i12;
            this.f127681k = i13;
            this.f127682l = i14;
            this.f127683m = j13;
            this.f127684n = j14;
            this.f127685o = c42420b;
            this.f127686p = str6;
            this.f127687q = num2;
            this.f127688r = str7;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f127671a, gVar.f127671a) && this.f127672b == gVar.f127672b && L.f(this.f127673c, gVar.f127673c) && L.f(this.f127674d, gVar.f127674d) && L.f(this.f127675e, gVar.f127675e) && this.f127676f == gVar.f127676f && L.f(this.f127677g, gVar.f127677g) && L.f(this.f127678h, gVar.f127678h) && L.f(this.f127679i, gVar.f127679i) && this.f127680j == gVar.f127680j && this.f127681k == gVar.f127681k && this.f127682l == gVar.f127682l && this.f127683m == gVar.f127683m && this.f127684n == gVar.f127684n && L.f(this.f127685o, gVar.f127685o) && L.f(this.f127686p, gVar.f127686p) && L.f(this.f127687q, gVar.f127687q) && L.f(this.f127688r, gVar.f127688r);
        }

        public final int hashCode() {
            C42419a c42419a = this.f127671a;
            int iG2 = r.g((c42419a == null ? 0 : c42419a.hashCode()) * 31, 31, this.f127672b);
            String str = this.f127673c;
            int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127674d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f127675e;
            int i12 = r.i((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f127676f);
            String str4 = this.f127677g;
            int iHashCode3 = (i12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f127678h;
            int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.f127679i;
            int iG3 = r.g(r.g(r.e(this.f127682l, r.e(this.f127681k, r.e(this.f127680j, (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31, this.f127683m), 31, this.f127684n);
            C42420b c42420b = this.f127685o;
            int iHashCode5 = (iG3 + (c42420b == null ? 0 : c42420b.hashCode())) * 31;
            String str6 = this.f127686p;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num2 = this.f127687q;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str7 = this.f127688r;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SliderState(title=");
            sb2.append(this.f127671a);
            sb2.append(", inputValue=");
            sb2.append(this.f127672b);
            sb2.append(", inputString=");
            sb2.append(this.f127673c);
            sb2.append(", description=");
            sb2.append(this.f127674d);
            sb2.append(", info=");
            sb2.append(this.f127675e);
            sb2.append(", infoClosed=");
            sb2.append(this.f127676f);
            sb2.append(", triggerInfoTitle=");
            sb2.append(this.f127677g);
            sb2.append(", triggerInfoDescription=");
            sb2.append(this.f127678h);
            sb2.append(", triggerInfoColor=");
            sb2.append(this.f127679i);
            sb2.append(", color=");
            sb2.append(this.f127680j);
            sb2.append(", sliderValueTo=");
            sb2.append(this.f127681k);
            sb2.append(", sliderValue=");
            sb2.append(this.f127682l);
            sb2.append(", minInput=");
            sb2.append(this.f127683m);
            sb2.append(", maxInput=");
            sb2.append(this.f127684n);
            sb2.append(", inputSheet=");
            sb2.append(this.f127685o);
            sb2.append(", placeholder=");
            sb2.append(this.f127686p);
            sb2.append(", cashbackSliderValue=");
            sb2.append(this.f127687q);
            sb2.append(", cashbackBonusesValue=");
            return C22026a.c(sb2, this.f127688r, ')');
        }
    }

    static {
        f fVar = new f(null, null, false, true);
        c cVar = new c(false, null);
        b bVar = new b(false, null, C42784z0.f406748b, CpxPromoV2.Auto.Budget.Value.BudgetId.f127498c);
        g gVar = new g(null, 0L, null, null, null, false, null, null, null, R.attr.green600, 1, 0, 0L, Long.MAX_VALUE, null, null, null, null);
        Input.f179303W.getClass();
        f127623o = new CpxPromoV2State(false, null, null, null, null, null, fVar, cVar, bVar, gVar, new e(false, true, null, null, null, null, C42756l.e0(Input.f179304a0), null, null, null), new ButtonState(null, ButtonState.ButtonType.f127644e, null, ButtonState.ButtonType.f127641b, true));
    }

    public CpxPromoV2State(boolean z12, @l String str, @l CpxPromoV2 cpxPromoV2, @l String str2, @l AttributedText attributedText, @l AttributedText attributedText2, @k f fVar, @k c cVar, @k b bVar, @k g gVar, @k e eVar, @k ButtonState buttonState) {
        this.f127624b = z12;
        this.f127625c = str;
        this.f127626d = cpxPromoV2;
        this.f127627e = str2;
        this.f127628f = attributedText;
        this.f127629g = attributedText2;
        this.f127630h = fVar;
        this.f127631i = cVar;
        this.f127632j = bVar;
        this.f127633k = gVar;
        this.f127634l = eVar;
        this.f127635m = buttonState;
    }

    public static CpxPromoV2State a(CpxPromoV2State cpxPromoV2State, boolean z12, String str, CpxPromoV2 cpxPromoV2, String str2, AttributedText attributedText, AttributedText attributedText2, f fVar, c cVar, b bVar, g gVar, e eVar, ButtonState buttonState, int i12) {
        boolean z13 = (i12 & 1) != 0 ? cpxPromoV2State.f127624b : z12;
        String str3 = (i12 & 2) != 0 ? cpxPromoV2State.f127625c : str;
        CpxPromoV2 cpxPromoV22 = (i12 & 4) != 0 ? cpxPromoV2State.f127626d : cpxPromoV2;
        String str4 = (i12 & 8) != 0 ? cpxPromoV2State.f127627e : str2;
        AttributedText attributedText3 = (i12 & 16) != 0 ? cpxPromoV2State.f127628f : attributedText;
        AttributedText attributedText4 = (i12 & 32) != 0 ? cpxPromoV2State.f127629g : attributedText2;
        f fVar2 = (i12 & 64) != 0 ? cpxPromoV2State.f127630h : fVar;
        c cVar2 = (i12 & 128) != 0 ? cpxPromoV2State.f127631i : cVar;
        b bVar2 = (i12 & 256) != 0 ? cpxPromoV2State.f127632j : bVar;
        g gVar2 = (i12 & 512) != 0 ? cpxPromoV2State.f127633k : gVar;
        e eVar2 = (i12 & 1024) != 0 ? cpxPromoV2State.f127634l : eVar;
        ButtonState buttonState2 = (i12 & 2048) != 0 ? cpxPromoV2State.f127635m : buttonState;
        cpxPromoV2State.getClass();
        return new CpxPromoV2State(z13, str3, cpxPromoV22, str4, attributedText3, attributedText4, fVar2, cVar2, bVar2, gVar2, eVar2, buttonState2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpxPromoV2State)) {
            return false;
        }
        CpxPromoV2State cpxPromoV2State = (CpxPromoV2State) obj;
        return this.f127624b == cpxPromoV2State.f127624b && L.f(this.f127625c, cpxPromoV2State.f127625c) && L.f(this.f127626d, cpxPromoV2State.f127626d) && L.f(this.f127627e, cpxPromoV2State.f127627e) && L.f(this.f127628f, cpxPromoV2State.f127628f) && L.f(this.f127629g, cpxPromoV2State.f127629g) && L.f(this.f127630h, cpxPromoV2State.f127630h) && L.f(this.f127631i, cpxPromoV2State.f127631i) && L.f(this.f127632j, cpxPromoV2State.f127632j) && L.f(this.f127633k, cpxPromoV2State.f127633k) && L.f(this.f127634l, cpxPromoV2State.f127634l) && L.f(this.f127635m, cpxPromoV2State.f127635m);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f127624b) * 31;
        String str = this.f127625c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CpxPromoV2 cpxPromoV2 = this.f127626d;
        int iHashCode3 = (iHashCode2 + (cpxPromoV2 == null ? 0 : cpxPromoV2.hashCode())) * 31;
        String str2 = this.f127627e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f127628f;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f127629g;
        return this.f127635m.hashCode() + ((this.f127634l.hashCode() + ((this.f127633k.hashCode() + ((this.f127632j.hashCode() + ((this.f127631i.hashCode() + ((this.f127630h.hashCode() + ((iHashCode5 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "CpxPromoV2State(isLoading=" + this.f127624b + ", error=" + this.f127625c + ", cpxPromo=" + this.f127626d + ", help=" + this.f127627e + ", title=" + this.f127628f + ", subtitle=" + this.f127629g + ", segmentedControlState=" + this.f127630h + ", cashbackBannerState=" + this.f127631i + ", budgetState=" + this.f127632j + ", sliderState=" + this.f127633k + ", expenseLimitState=" + this.f127634l + ", buttonState=" + this.f127635m + ')';
    }
}
