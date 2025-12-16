package com.avito.android.cpx_promo.impl.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.cpx_promo.impl.interactor.model.AttributedTextWithIcon;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromo;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoButton;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoInputSheet;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "BudgetChip", "BudgetState", "ButtonState", "a", "ExpenseLimitState", "SegmentedControlState", "SliderState", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CpxPromoState extends q implements Parcelable {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final CpxPromoState f127108n;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f127109b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f127110c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CpxPromo f127111d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f127112e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f127113f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f127114g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SegmentedControlState f127115h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final BudgetState f127116i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SliderState f127117j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ExpenseLimitState f127118k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ButtonState f127119l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f127107m = new a(null);

    @k
    public static final Parcelable.Creator<CpxPromoState> CREATOR = new b();

    /* compiled from: CpxPromoState.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$BudgetChip;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class BudgetChip implements h, Parcelable {

        @k
        public static final Parcelable.Creator<BudgetChip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f127120b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f127121c;

        /* compiled from: CpxPromoState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BudgetChip> {
            @Override // android.os.Parcelable.Creator
            public final BudgetChip createFromParcel(Parcel parcel) {
                return new BudgetChip(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BudgetChip[] newArray(int i12) {
                return new BudgetChip[i12];
            }
        }

        public BudgetChip(@k String str, @k String str2) {
            this.f127120b = str;
            this.f127121c = str2;
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
        public final g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            BudgetChip budgetChip = obj instanceof BudgetChip ? (BudgetChip) obj : null;
            return L.f(this.f127120b, budgetChip != null ? budgetChip.f127120b : null);
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF114848c() {
            return this.f127121c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final e e2() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BudgetChip)) {
                return false;
            }
            BudgetChip budgetChip = (BudgetChip) obj;
            return L.f(this.f127120b, budgetChip.f127120b) && L.f(this.f127121c, budgetChip.f127121c);
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
        public final e getImage() {
            return null;
        }

        public final int hashCode() {
            return this.f127121c.hashCode() + (this.f127120b.hashCode() * 31);
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
        public final e q1() {
            return null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BudgetChip(id=");
            sb2.append(this.f127120b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f127121c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f127120b);
            parcel.writeString(this.f127121c);
        }
    }

    /* compiled from: CpxPromoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$BudgetState;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class BudgetState implements Parcelable {

        @k
        public static final Parcelable.Creator<BudgetState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127122b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127123c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f127124d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final BudgetChip f127125e;

        /* compiled from: CpxPromoState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BudgetState> {
            @Override // android.os.Parcelable.Creator
            public final BudgetState createFromParcel(Parcel parcel) {
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                AttributedTextWithIcon attributedTextWithIconCreateFromParcel = parcel.readInt() == 0 ? null : AttributedTextWithIcon.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(BudgetChip.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new BudgetState(z12, attributedTextWithIconCreateFromParcel, arrayList, parcel.readInt() != 0 ? BudgetChip.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final BudgetState[] newArray(int i12) {
                return new BudgetState[i12];
            }
        }

        public BudgetState(boolean z12, @l AttributedTextWithIcon attributedTextWithIcon, @k List<BudgetChip> list, @l BudgetChip budgetChip) {
            this.f127122b = z12;
            this.f127123c = attributedTextWithIcon;
            this.f127124d = list;
            this.f127125e = budgetChip;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BudgetState)) {
                return false;
            }
            BudgetState budgetState = (BudgetState) obj;
            return this.f127122b == budgetState.f127122b && L.f(this.f127123c, budgetState.f127123c) && L.f(this.f127124d, budgetState.f127124d) && L.f(this.f127125e, budgetState.f127125e);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127122b) * 31;
            AttributedTextWithIcon attributedTextWithIcon = this.f127123c;
            int iA2 = C23088b.a((iHashCode + (attributedTextWithIcon == null ? 0 : attributedTextWithIcon.hashCode())) * 31, 31, this.f127124d);
            BudgetChip budgetChip = this.f127125e;
            return iA2 + (budgetChip != null ? budgetChip.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "BudgetState(isBudgetVisible=" + this.f127122b + ", budgetTitle=" + this.f127123c + ", budgets=" + this.f127124d + ", selectedBudget=" + this.f127125e + ')';
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f127122b ? 1 : 0);
            AttributedTextWithIcon attributedTextWithIcon = this.f127123c;
            if (attributedTextWithIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributedTextWithIcon.writeToParcel(parcel, i12);
            }
            ?? r22 = this.f127124d;
            parcel.writeInt(r22.size());
            Iterator it = r22.iterator();
            while (it.hasNext()) {
                ((BudgetChip) it.next()).writeToParcel(parcel, i12);
            }
            BudgetChip budgetChip = this.f127125e;
            if (budgetChip == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                budgetChip.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CpxPromoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$ButtonState;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ButtonState implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CpxPromoButton f127126b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f127127c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final CpxPromoButton f127128d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f127129e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f127130f;

        /* compiled from: CpxPromoState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ButtonState> {
            @Override // android.os.Parcelable.Creator
            public final ButtonState createFromParcel(Parcel parcel) {
                return new ButtonState(parcel.readInt() == 0 ? null : CpxPromoButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? CpxPromoButton.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonState[] newArray(int i12) {
                return new ButtonState[i12];
            }
        }

        public ButtonState(@l CpxPromoButton cpxPromoButton, boolean z12, @l CpxPromoButton cpxPromoButton2, boolean z13, boolean z14) {
            this.f127126b = cpxPromoButton;
            this.f127127c = z12;
            this.f127128d = cpxPromoButton2;
            this.f127129e = z13;
            this.f127130f = z14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) obj;
            return L.f(this.f127126b, buttonState.f127126b) && this.f127127c == buttonState.f127127c && L.f(this.f127128d, buttonState.f127128d) && this.f127129e == buttonState.f127129e && this.f127130f == buttonState.f127130f;
        }

        public final int hashCode() {
            CpxPromoButton cpxPromoButton = this.f127126b;
            int i12 = r.i((cpxPromoButton == null ? 0 : cpxPromoButton.hashCode()) * 31, 31, this.f127127c);
            CpxPromoButton cpxPromoButton2 = this.f127128d;
            return Boolean.hashCode(this.f127130f) + r.i((i12 + (cpxPromoButton2 != null ? cpxPromoButton2.hashCode() : 0)) * 31, 31, this.f127129e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonState(secondaryButton=");
            sb2.append(this.f127126b);
            sb2.append(", secondaryButtonVisible=");
            sb2.append(this.f127127c);
            sb2.append(", primaryButton=");
            sb2.append(this.f127128d);
            sb2.append(", primaryButtonVisible=");
            sb2.append(this.f127129e);
            sb2.append(", primaryButtonEnabled=");
            return r.x(sb2, this.f127130f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            CpxPromoButton cpxPromoButton = this.f127126b;
            if (cpxPromoButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cpxPromoButton.writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f127127c ? 1 : 0);
            CpxPromoButton cpxPromoButton2 = this.f127128d;
            if (cpxPromoButton2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cpxPromoButton2.writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f127129e ? 1 : 0);
            parcel.writeInt(this.f127130f ? 1 : 0);
        }
    }

    /* compiled from: CpxPromoState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$ExpenseLimitState;", "Landroid/os/Parcelable;", "InputSheetParams", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ExpenseLimitState implements Parcelable {

        @k
        public static final Parcelable.Creator<ExpenseLimitState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f127131b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127132c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f127133d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Long f127134e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f127135f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<Integer> f127136g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f127137h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final InputSheetParams f127138i;

        /* compiled from: CpxPromoState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$ExpenseLimitState$InputSheetParams;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class InputSheetParams implements Parcelable {

            @k
            public static final Parcelable.Creator<InputSheetParams> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final long f127139b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f127140c;

            /* compiled from: CpxPromoState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<InputSheetParams> {
                @Override // android.os.Parcelable.Creator
                public final InputSheetParams createFromParcel(Parcel parcel) {
                    return new InputSheetParams(parcel.readLong(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InputSheetParams[] newArray(int i12) {
                    return new InputSheetParams[i12];
                }
            }

            public InputSheetParams(long j12, @l String str) {
                this.f127139b = j12;
                this.f127140c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InputSheetParams)) {
                    return false;
                }
                InputSheetParams inputSheetParams = (InputSheetParams) obj;
                return this.f127139b == inputSheetParams.f127139b && L.f(this.f127140c, inputSheetParams.f127140c);
            }

            public final int hashCode() {
                int iHashCode = Long.hashCode(this.f127139b) * 31;
                String str = this.f127140c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("InputSheetParams(minValueConstraint=");
                sb2.append(this.f127139b);
                sb2.append(", minErrorText=");
                return C22026a.c(sb2, this.f127140c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeLong(this.f127139b);
                parcel.writeString(this.f127140c);
            }
        }

        /* compiled from: CpxPromoState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExpenseLimitState> {
            @Override // android.os.Parcelable.Creator
            public final ExpenseLimitState createFromParcel(Parcel parcel) {
                int iD2 = 0;
                boolean z12 = parcel.readInt() != 0;
                AttributedTextWithIcon attributedTextWithIconCreateFromParcel = parcel.readInt() == 0 ? null : AttributedTextWithIcon.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iD2 != i12) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
                return new ExpenseLimitState(z12, attributedTextWithIconCreateFromParcel, string, lValueOf, string2, arrayList, parcel.readString(), parcel.readInt() != 0 ? InputSheetParams.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final ExpenseLimitState[] newArray(int i12) {
                return new ExpenseLimitState[i12];
            }
        }

        public ExpenseLimitState(boolean z12, @l AttributedTextWithIcon attributedTextWithIcon, @l String str, @l Long l12, @l String str2, @k List<Integer> list, @l String str3, @l InputSheetParams inputSheetParams) {
            this.f127131b = z12;
            this.f127132c = attributedTextWithIcon;
            this.f127133d = str;
            this.f127134e = l12;
            this.f127135f = str2;
            this.f127136g = list;
            this.f127137h = str3;
            this.f127138i = inputSheetParams;
        }

        public static ExpenseLimitState a(ExpenseLimitState expenseLimitState, boolean z12, AttributedTextWithIcon attributedTextWithIcon, String str, Long l12, String str2, List list, String str3, InputSheetParams inputSheetParams, int i12) {
            boolean z13 = (i12 & 1) != 0 ? expenseLimitState.f127131b : z12;
            AttributedTextWithIcon attributedTextWithIcon2 = (i12 & 2) != 0 ? expenseLimitState.f127132c : attributedTextWithIcon;
            String str4 = (i12 & 4) != 0 ? expenseLimitState.f127133d : str;
            Long l13 = (i12 & 8) != 0 ? expenseLimitState.f127134e : l12;
            String str5 = (i12 & 16) != 0 ? expenseLimitState.f127135f : str2;
            List list2 = (i12 & 32) != 0 ? expenseLimitState.f127136g : list;
            String str6 = (i12 & 64) != 0 ? expenseLimitState.f127137h : str3;
            InputSheetParams inputSheetParams2 = (i12 & 128) != 0 ? expenseLimitState.f127138i : inputSheetParams;
            expenseLimitState.getClass();
            return new ExpenseLimitState(z13, attributedTextWithIcon2, str4, l13, str5, list2, str6, inputSheetParams2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpenseLimitState)) {
                return false;
            }
            ExpenseLimitState expenseLimitState = (ExpenseLimitState) obj;
            return this.f127131b == expenseLimitState.f127131b && L.f(this.f127132c, expenseLimitState.f127132c) && L.f(this.f127133d, expenseLimitState.f127133d) && L.f(this.f127134e, expenseLimitState.f127134e) && L.f(this.f127135f, expenseLimitState.f127135f) && L.f(this.f127136g, expenseLimitState.f127136g) && L.f(this.f127137h, expenseLimitState.f127137h) && L.f(this.f127138i, expenseLimitState.f127138i);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f127131b) * 31;
            AttributedTextWithIcon attributedTextWithIcon = this.f127132c;
            int iHashCode2 = (iHashCode + (attributedTextWithIcon == null ? 0 : attributedTextWithIcon.hashCode())) * 31;
            String str = this.f127133d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l12 = this.f127134e;
            int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str2 = this.f127135f;
            int iE2 = H.e((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f127136g);
            String str3 = this.f127137h;
            int iHashCode5 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            InputSheetParams inputSheetParams = this.f127138i;
            return iHashCode5 + (inputSheetParams != null ? inputSheetParams.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ExpenseLimitState(isLimitVisible=" + this.f127131b + ", title=" + this.f127132c + ", stringValue=" + this.f127133d + ", value=" + this.f127134e + ", placeholder=" + this.f127135f + ", inputState=" + this.f127136g + ", errorText=" + this.f127137h + ", inputSheetParams=" + this.f127138i + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f127131b ? 1 : 0);
            AttributedTextWithIcon attributedTextWithIcon = this.f127132c;
            if (attributedTextWithIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributedTextWithIcon.writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f127133d);
            Long l12 = this.f127134e;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f127135f);
            Iterator itJ = C0.j(this.f127136g, parcel);
            while (itJ.hasNext()) {
                parcel.writeInt(((Number) itJ.next()).intValue());
            }
            parcel.writeString(this.f127137h);
            InputSheetParams inputSheetParams = this.f127138i;
            if (inputSheetParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                inputSheetParams.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CpxPromoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$SegmentedControlState;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SegmentedControlState implements Parcelable {

        @k
        public static final Parcelable.Creator<SegmentedControlState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127141b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ArrayList f127142c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f127143d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f127144e;

        /* compiled from: CpxPromoState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SegmentedControlState> {
            @Override // android.os.Parcelable.Creator
            public final SegmentedControlState createFromParcel(Parcel parcel) {
                return new SegmentedControlState(parcel.readInt() == 0 ? null : AttributedTextWithIcon.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SegmentedControlState[] newArray(int i12) {
                return new SegmentedControlState[i12];
            }
        }

        public SegmentedControlState(@l AttributedTextWithIcon attributedTextWithIcon, @l ArrayList arrayList, boolean z12, boolean z13) {
            this.f127141b = attributedTextWithIcon;
            this.f127142c = arrayList;
            this.f127143d = z12;
            this.f127144e = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SegmentedControlState)) {
                return false;
            }
            SegmentedControlState segmentedControlState = (SegmentedControlState) obj;
            return L.f(this.f127141b, segmentedControlState.f127141b) && L.f(this.f127142c, segmentedControlState.f127142c) && this.f127143d == segmentedControlState.f127143d && this.f127144e == segmentedControlState.f127144e;
        }

        public final int hashCode() {
            AttributedTextWithIcon attributedTextWithIcon = this.f127141b;
            int iHashCode = (attributedTextWithIcon == null ? 0 : attributedTextWithIcon.hashCode()) * 31;
            ArrayList arrayList = this.f127142c;
            return Boolean.hashCode(this.f127144e) + r.i((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.f127143d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SegmentedControlState(title=");
            sb2.append(this.f127141b);
            sb2.append(", segments=");
            sb2.append(this.f127142c);
            sb2.append(", isAutoSelected=");
            sb2.append(this.f127143d);
            sb2.append(", isVisible=");
            return r.x(sb2, this.f127144e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            AttributedTextWithIcon attributedTextWithIcon = this.f127141b;
            if (attributedTextWithIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributedTextWithIcon.writeToParcel(parcel, i12);
            }
            parcel.writeStringList(this.f127142c);
            parcel.writeInt(this.f127143d ? 1 : 0);
            parcel.writeInt(this.f127144e ? 1 : 0);
        }
    }

    /* compiled from: CpxPromoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$SliderState;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SliderState implements Parcelable {

        @k
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedTextWithIcon f127145b;

        /* renamed from: c, reason: collision with root package name */
        public final long f127146c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f127147d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f127148e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f127149f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f127150g;

        /* renamed from: h, reason: collision with root package name */
        public final int f127151h;

        /* renamed from: i, reason: collision with root package name */
        public final int f127152i;

        /* renamed from: j, reason: collision with root package name */
        public final int f127153j;

        /* renamed from: k, reason: collision with root package name */
        public final long f127154k;

        /* renamed from: l, reason: collision with root package name */
        public final long f127155l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final CpxPromoInputSheet f127156m;

        /* compiled from: CpxPromoState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            public final SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel.readInt() == 0 ? null : AttributedTextWithIcon.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0 ? CpxPromoInputSheet.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final SliderState[] newArray(int i12) {
                return new SliderState[i12];
            }
        }

        public SliderState(@l AttributedTextWithIcon attributedTextWithIcon, long j12, @l String str, @l String str2, @l String str3, boolean z12, @InterfaceC42150f int i12, int i13, int i14, long j13, long j14, @l CpxPromoInputSheet cpxPromoInputSheet) {
            this.f127145b = attributedTextWithIcon;
            this.f127146c = j12;
            this.f127147d = str;
            this.f127148e = str2;
            this.f127149f = str3;
            this.f127150g = z12;
            this.f127151h = i12;
            this.f127152i = i13;
            this.f127153j = i14;
            this.f127154k = j13;
            this.f127155l = j14;
            this.f127156m = cpxPromoInputSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SliderState)) {
                return false;
            }
            SliderState sliderState = (SliderState) obj;
            return L.f(this.f127145b, sliderState.f127145b) && this.f127146c == sliderState.f127146c && L.f(this.f127147d, sliderState.f127147d) && L.f(this.f127148e, sliderState.f127148e) && L.f(this.f127149f, sliderState.f127149f) && this.f127150g == sliderState.f127150g && this.f127151h == sliderState.f127151h && this.f127152i == sliderState.f127152i && this.f127153j == sliderState.f127153j && this.f127154k == sliderState.f127154k && this.f127155l == sliderState.f127155l && L.f(this.f127156m, sliderState.f127156m);
        }

        public final int hashCode() {
            AttributedTextWithIcon attributedTextWithIcon = this.f127145b;
            int iG2 = r.g((attributedTextWithIcon == null ? 0 : attributedTextWithIcon.hashCode()) * 31, 31, this.f127146c);
            String str = this.f127147d;
            int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f127148e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f127149f;
            int iG3 = r.g(r.g(r.e(this.f127153j, r.e(this.f127152i, r.e(this.f127151h, r.i((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f127150g), 31), 31), 31), 31, this.f127154k), 31, this.f127155l);
            CpxPromoInputSheet cpxPromoInputSheet = this.f127156m;
            return iG3 + (cpxPromoInputSheet != null ? cpxPromoInputSheet.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "SliderState(title=" + this.f127145b + ", inputValue=" + this.f127146c + ", inputString=" + this.f127147d + ", description=" + this.f127148e + ", info=" + this.f127149f + ", infoClosed=" + this.f127150g + ", color=" + this.f127151h + ", sliderValueTo=" + this.f127152i + ", sliderValue=" + this.f127153j + ", minInput=" + this.f127154k + ", maxInput=" + this.f127155l + ", inputSheet=" + this.f127156m + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            AttributedTextWithIcon attributedTextWithIcon = this.f127145b;
            if (attributedTextWithIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributedTextWithIcon.writeToParcel(parcel, i12);
            }
            parcel.writeLong(this.f127146c);
            parcel.writeString(this.f127147d);
            parcel.writeString(this.f127148e);
            parcel.writeString(this.f127149f);
            parcel.writeInt(this.f127150g ? 1 : 0);
            parcel.writeInt(this.f127151h);
            parcel.writeInt(this.f127152i);
            parcel.writeInt(this.f127153j);
            parcel.writeLong(this.f127154k);
            parcel.writeLong(this.f127155l);
            CpxPromoInputSheet cpxPromoInputSheet = this.f127156m;
            if (cpxPromoInputSheet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cpxPromoInputSheet.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CpxPromoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState$a;", "", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CpxPromoState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CpxPromoState> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoState createFromParcel(Parcel parcel) {
            return new CpxPromoState(parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : CpxPromo.CREATOR.createFromParcel(parcel), parcel.readString(), (AttributedText) parcel.readParcelable(CpxPromoState.class.getClassLoader()), (AttributedText) parcel.readParcelable(CpxPromoState.class.getClassLoader()), SegmentedControlState.CREATOR.createFromParcel(parcel), BudgetState.CREATOR.createFromParcel(parcel), SliderState.CREATOR.createFromParcel(parcel), ExpenseLimitState.CREATOR.createFromParcel(parcel), ButtonState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoState[] newArray(int i12) {
            return new CpxPromoState[i12];
        }
    }

    static {
        SegmentedControlState segmentedControlState = new SegmentedControlState(null, null, false, true);
        BudgetState budgetState = new BudgetState(false, null, C42784z0.f406748b, null);
        SliderState sliderState = new SliderState(null, 0L, null, null, null, false, R.attr.green600, 1, 0, 0L, Long.MAX_VALUE, null);
        Input.f179303W.getClass();
        f127108n = new CpxPromoState(false, null, null, null, null, null, segmentedControlState, budgetState, sliderState, new ExpenseLimitState(false, null, null, null, null, C42756l.e0(Input.f179304a0), null, null), new ButtonState(null, false, null, false, true));
    }

    public CpxPromoState(boolean z12, @l String str, @l CpxPromo cpxPromo, @l String str2, @l AttributedText attributedText, @l AttributedText attributedText2, @k SegmentedControlState segmentedControlState, @k BudgetState budgetState, @k SliderState sliderState, @k ExpenseLimitState expenseLimitState, @k ButtonState buttonState) {
        this.f127109b = z12;
        this.f127110c = str;
        this.f127111d = cpxPromo;
        this.f127112e = str2;
        this.f127113f = attributedText;
        this.f127114g = attributedText2;
        this.f127115h = segmentedControlState;
        this.f127116i = budgetState;
        this.f127117j = sliderState;
        this.f127118k = expenseLimitState;
        this.f127119l = buttonState;
    }

    public static CpxPromoState a(CpxPromoState cpxPromoState, boolean z12, String str, CpxPromo cpxPromo, String str2, AttributedText attributedText, AttributedText attributedText2, SegmentedControlState segmentedControlState, BudgetState budgetState, SliderState sliderState, ExpenseLimitState expenseLimitState, ButtonState buttonState, int i12) {
        boolean z13 = (i12 & 1) != 0 ? cpxPromoState.f127109b : z12;
        String str3 = (i12 & 2) != 0 ? cpxPromoState.f127110c : str;
        CpxPromo cpxPromo2 = (i12 & 4) != 0 ? cpxPromoState.f127111d : cpxPromo;
        String str4 = (i12 & 8) != 0 ? cpxPromoState.f127112e : str2;
        AttributedText attributedText3 = (i12 & 16) != 0 ? cpxPromoState.f127113f : attributedText;
        AttributedText attributedText4 = (i12 & 32) != 0 ? cpxPromoState.f127114g : attributedText2;
        SegmentedControlState segmentedControlState2 = (i12 & 64) != 0 ? cpxPromoState.f127115h : segmentedControlState;
        BudgetState budgetState2 = (i12 & 128) != 0 ? cpxPromoState.f127116i : budgetState;
        SliderState sliderState2 = (i12 & 256) != 0 ? cpxPromoState.f127117j : sliderState;
        ExpenseLimitState expenseLimitState2 = (i12 & 512) != 0 ? cpxPromoState.f127118k : expenseLimitState;
        ButtonState buttonState2 = (i12 & 1024) != 0 ? cpxPromoState.f127119l : buttonState;
        cpxPromoState.getClass();
        return new CpxPromoState(z13, str3, cpxPromo2, str4, attributedText3, attributedText4, segmentedControlState2, budgetState2, sliderState2, expenseLimitState2, buttonState2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpxPromoState)) {
            return false;
        }
        CpxPromoState cpxPromoState = (CpxPromoState) obj;
        return this.f127109b == cpxPromoState.f127109b && L.f(this.f127110c, cpxPromoState.f127110c) && L.f(this.f127111d, cpxPromoState.f127111d) && L.f(this.f127112e, cpxPromoState.f127112e) && L.f(this.f127113f, cpxPromoState.f127113f) && L.f(this.f127114g, cpxPromoState.f127114g) && L.f(this.f127115h, cpxPromoState.f127115h) && L.f(this.f127116i, cpxPromoState.f127116i) && L.f(this.f127117j, cpxPromoState.f127117j) && L.f(this.f127118k, cpxPromoState.f127118k) && L.f(this.f127119l, cpxPromoState.f127119l);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f127109b) * 31;
        String str = this.f127110c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CpxPromo cpxPromo = this.f127111d;
        int iHashCode3 = (iHashCode2 + (cpxPromo == null ? 0 : cpxPromo.hashCode())) * 31;
        String str2 = this.f127112e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f127113f;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f127114g;
        return this.f127119l.hashCode() + ((this.f127118k.hashCode() + ((this.f127117j.hashCode() + ((this.f127116i.hashCode() + ((this.f127115h.hashCode() + ((iHashCode5 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "CpxPromoState(isLoading=" + this.f127109b + ", error=" + this.f127110c + ", cpxPromo=" + this.f127111d + ", help=" + this.f127112e + ", title=" + this.f127113f + ", subtitle=" + this.f127114g + ", segmentedControlState=" + this.f127115h + ", budgetState=" + this.f127116i + ", sliderState=" + this.f127117j + ", expenseLimitState=" + this.f127118k + ", buttonState=" + this.f127119l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f127109b ? 1 : 0);
        parcel.writeString(this.f127110c);
        CpxPromo cpxPromo = this.f127111d;
        if (cpxPromo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cpxPromo.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f127112e);
        parcel.writeParcelable(this.f127113f, i12);
        parcel.writeParcelable(this.f127114g, i12);
        this.f127115h.writeToParcel(parcel, i12);
        this.f127116i.writeToParcel(parcel, i12);
        this.f127117j.writeToParcel(parcel, i12);
        this.f127118k.writeToParcel(parcel, i12);
        this.f127119l.writeToParcel(parcel, i12);
    }
}
