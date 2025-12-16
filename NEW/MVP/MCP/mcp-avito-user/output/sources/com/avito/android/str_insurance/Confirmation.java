package com.avito.android.str_insurance;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceLink.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_insurance/Confirmation;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Confirmation implements Parcelable {

    @k
    public static final Parcelable.Creator<Confirmation> CREATOR = new a();

    @c("description")
    @k
    private final AttributedText description;

    /* compiled from: StrInsuranceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Confirmation> {
        @Override // android.os.Parcelable.Creator
        public final Confirmation createFromParcel(Parcel parcel) {
            return new Confirmation((AttributedText) parcel.readParcelable(Confirmation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Confirmation[] newArray(int i12) {
            return new Confirmation[i12];
        }
    }

    public Confirmation(@k AttributedText attributedText) {
        this.description = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Confirmation) && L.f(this.description, ((Confirmation) obj).description);
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        return this.description.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("Confirmation(description="), this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.description, i12);
    }
}
