package com.avito.android.onboarding.dialog.view.quiz;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AnswerChipable.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/quiz/AnswerChipable;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AnswerChipable implements com.avito.android.lib.design.chips.h, Parcelable {

    @k
    public static final Parcelable.Creator<AnswerChipable> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f209027b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f209028c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f209029d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f209030e;

    /* compiled from: AnswerChipable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnswerChipable> {
        @Override // android.os.Parcelable.Creator
        public final AnswerChipable createFromParcel(Parcel parcel) {
            return new AnswerChipable(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AnswerChipable[] newArray(int i12) {
            return new AnswerChipable[i12];
        }
    }

    public AnswerChipable(int i12, @l Integer num, @k String str, boolean z12) {
        this.f209027b = i12;
        this.f209028c = num;
        this.f209029d = str;
        this.f209030e = z12;
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
        if (obj instanceof AnswerChipable) {
            return this.f209027b == ((AnswerChipable) obj).f209027b;
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF199741b() {
        return this.f209029d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        if (!(obj instanceof AnswerChipable)) {
            return false;
        }
        AnswerChipable answerChipable = (AnswerChipable) obj;
        return this.f209027b == answerChipable.f209027b && L.f(this.f209028c, answerChipable.f209028c) && L.f(this.f209029d, answerChipable.f209029d) && this.f209030e == answerChipable.f209030e;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF13713d() {
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
        int iHashCode = Integer.hashCode(this.f209027b) * 31;
        Integer num = this.f209028c;
        return Boolean.hashCode(this.f209030e) + H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f209029d);
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
        StringBuilder sb2 = new StringBuilder("AnswerChipable(id=");
        sb2.append(this.f209027b);
        sb2.append(", questionId=");
        sb2.append(this.f209028c);
        sb2.append(", chipTitle=");
        sb2.append(this.f209029d);
        sb2.append(", selected=");
        return r.x(sb2, this.f209030e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f209027b);
        Integer num = this.f209028c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f209029d);
        parcel.writeInt(this.f209030e ? 1 : 0);
    }

    public /* synthetic */ AnswerChipable(int i12, Integer num, String str, boolean z12, int i13, C42822w c42822w) {
        this(i12, num, str, (i13 & 8) != 0 ? false : z12);
    }
}
