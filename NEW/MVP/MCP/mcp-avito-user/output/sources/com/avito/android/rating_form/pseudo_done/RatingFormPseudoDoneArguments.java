package com.avito.android.rating_form.pseudo_done;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormPseudoDoneArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/pseudo_done/RatingFormPseudoDoneArguments;", "Landroid/os/Parcelable;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormPseudoDoneArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingFormPseudoDoneArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f248824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f248825c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<RatingFormAddValueType.DoneButton> f248826d;

    /* compiled from: RatingFormPseudoDoneArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormPseudoDoneArguments> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormPseudoDoneArguments createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(RatingFormPseudoDoneArguments.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(RatingFormAddValueType.DoneButton.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new RatingFormPseudoDoneArguments(arrayList, z12, attributedText);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormPseudoDoneArguments[] newArray(int i12) {
            return new RatingFormPseudoDoneArguments[i12];
        }
    }

    public RatingFormPseudoDoneArguments(@l List list, boolean z12, @k AttributedText attributedText) {
        this.f248824b = z12;
        this.f248825c = attributedText;
        this.f248826d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormPseudoDoneArguments)) {
            return false;
        }
        RatingFormPseudoDoneArguments ratingFormPseudoDoneArguments = (RatingFormPseudoDoneArguments) obj;
        return this.f248824b == ratingFormPseudoDoneArguments.f248824b && L.f(this.f248825c, ratingFormPseudoDoneArguments.f248825c) && L.f(this.f248826d, ratingFormPseudoDoneArguments.f248826d);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(Boolean.hashCode(this.f248824b) * 31, 31, this.f248825c);
        List<RatingFormAddValueType.DoneButton> list = this.f248826d;
        return iB2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormPseudoDoneArguments(isModal=");
        sb2.append(this.f248824b);
        sb2.append(", content=");
        sb2.append(this.f248825c);
        sb2.append(", buttons=");
        return H.p(sb2, this.f248826d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f248824b ? 1 : 0);
        parcel.writeParcelable(this.f248825c, i12);
        List<RatingFormAddValueType.DoneButton> list = this.f248826d;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((RatingFormAddValueType.DoneButton) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
