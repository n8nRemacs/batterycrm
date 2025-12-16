package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LegalRequirements.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/mortgage/api/model/CheckboxMeta;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "isRequired", "isChecked", "hasError", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;ZZZ)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "d", "()Z", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CheckboxMeta implements Parcelable {

    @k
    public static final Parcelable.Creator<CheckboxMeta> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f198210b;

    @c("isChecked")
    private final boolean isChecked;

    @c("isRequired")
    private final boolean isRequired;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: LegalRequirements.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckboxMeta> {
        @Override // android.os.Parcelable.Creator
        public final CheckboxMeta createFromParcel(Parcel parcel) {
            return new CheckboxMeta((AttributedText) parcel.readParcelable(CheckboxMeta.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckboxMeta[] newArray(int i12) {
            return new CheckboxMeta[i12];
        }
    }

    public CheckboxMeta(@k AttributedText attributedText, boolean z12, boolean z13, boolean z14) {
        this.title = attributedText;
        this.isRequired = z12;
        this.isChecked = z13;
        this.f198210b = z14;
    }

    public static CheckboxMeta a(CheckboxMeta checkboxMeta, boolean z12, boolean z13, int i12) {
        AttributedText attributedText = checkboxMeta.title;
        boolean z14 = checkboxMeta.isRequired;
        if ((i12 & 4) != 0) {
            z12 = checkboxMeta.isChecked;
        }
        checkboxMeta.getClass();
        return new CheckboxMeta(attributedText, z14, z12, z13);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckboxMeta)) {
            return false;
        }
        CheckboxMeta checkboxMeta = (CheckboxMeta) obj;
        return L.f(this.title, checkboxMeta.title) && this.isRequired == checkboxMeta.isRequired && this.isChecked == checkboxMeta.isChecked && this.f198210b == checkboxMeta.f198210b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198210b) + r.i(r.i(this.title.hashCode() * 31, 31, this.isRequired), 31, this.isChecked);
    }

    /* renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckboxMeta(title=");
        sb2.append(this.title);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", isChecked=");
        sb2.append(this.isChecked);
        sb2.append(", hasError=");
        return r.x(sb2, this.f198210b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeInt(this.isRequired ? 1 : 0);
        parcel.writeInt(this.isChecked ? 1 : 0);
        parcel.writeInt(this.f198210b ? 1 : 0);
    }

    public /* synthetic */ CheckboxMeta(AttributedText attributedText, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(attributedText, z12, z13, (i12 & 8) != 0 ? false : z14);
    }
}
