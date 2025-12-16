package com.avito.android.comfortable_deal.commission_details.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommissionDetailsDialogArguments.kt */
@F3
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/commission_details/model/CommissionDetailsDialogArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommissionDetailsDialogArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<CommissionDetailsDialogArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f120586b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f120587c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f120588d;

    /* compiled from: CommissionDetailsDialogArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommissionDetailsDialogArguments> {
        @Override // android.os.Parcelable.Creator
        public final CommissionDetailsDialogArguments createFromParcel(Parcel parcel) {
            return new CommissionDetailsDialogArguments((AttributedText) parcel.readParcelable(CommissionDetailsDialogArguments.class.getClassLoader()), (AttributedText) parcel.readParcelable(CommissionDetailsDialogArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommissionDetailsDialogArguments[] newArray(int i12) {
            return new CommissionDetailsDialogArguments[i12];
        }
    }

    public CommissionDetailsDialogArguments(@k AttributedText attributedText, @k AttributedText attributedText2, @k String str) {
        this.f120586b = attributedText;
        this.f120587c = attributedText2;
        this.f120588d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommissionDetailsDialogArguments)) {
            return false;
        }
        CommissionDetailsDialogArguments commissionDetailsDialogArguments = (CommissionDetailsDialogArguments) obj;
        return L.f(this.f120586b, commissionDetailsDialogArguments.f120586b) && L.f(this.f120587c, commissionDetailsDialogArguments.f120587c) && L.f(this.f120588d, commissionDetailsDialogArguments.f120588d);
    }

    public final int hashCode() {
        return this.f120588d.hashCode() + com.avito.android.actions_sheet.a.b(this.f120586b.hashCode() * 31, 31, this.f120587c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommissionDetailsDialogArguments(title=");
        sb2.append(this.f120586b);
        sb2.append(", description=");
        sb2.append(this.f120587c);
        sb2.append(", buttonTitle=");
        return C22026a.c(sb2, this.f120588d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f120586b, i12);
        parcel.writeParcelable(this.f120587c, i12);
        parcel.writeString(this.f120588d);
    }
}
