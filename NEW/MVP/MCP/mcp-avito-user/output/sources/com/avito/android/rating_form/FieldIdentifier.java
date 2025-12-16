package com.avito.android.rating_form;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Identifiers.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/FieldIdentifier;", "Landroid/os/Parcelable;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FieldIdentifier implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FieldIdentifier> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f247885b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f247886c;

    /* compiled from: Identifiers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FieldIdentifier> {
        @Override // android.os.Parcelable.Creator
        public final FieldIdentifier createFromParcel(Parcel parcel) {
            return new FieldIdentifier(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FieldIdentifier[] newArray(int i12) {
            return new FieldIdentifier[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FieldIdentifier() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean c() {
        return this.f247885b != -1;
    }

    public final boolean d() {
        String str = this.f247886c;
        return true ^ (str == null || C43066x.K(str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldIdentifier)) {
            return false;
        }
        if (d()) {
            FieldIdentifier fieldIdentifier = (FieldIdentifier) obj;
            if (fieldIdentifier.d()) {
                return L.f(this.f247886c, fieldIdentifier.f247886c);
            }
        }
        return this.f247885b == ((FieldIdentifier) obj).f247885b;
    }

    public final int hashCode() {
        if (!d()) {
            return Integer.hashCode(this.f247885b);
        }
        String str = this.f247886c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FieldIdentifier(fieldId=");
        sb2.append(this.f247885b);
        sb2.append(", fieldSlug=");
        return C22026a.c(sb2, this.f247886c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f247885b);
        parcel.writeString(this.f247886c);
    }

    public FieldIdentifier(int i12, @Y61.l String str) {
        this.f247885b = i12;
        this.f247886c = str;
    }

    public /* synthetic */ FieldIdentifier(int i12, String str, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? -1 : i12, (i13 & 2) != 0 ? null : str);
    }
}
