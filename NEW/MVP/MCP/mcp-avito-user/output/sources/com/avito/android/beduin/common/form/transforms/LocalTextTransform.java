package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModelTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LocalTextTransform.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/LocalTextTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LocalTextTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<LocalTextTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f103387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103388c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f103389d;

    /* compiled from: LocalTextTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocalTextTransform> {
        @Override // android.os.Parcelable.Creator
        public final LocalTextTransform createFromParcel(Parcel parcel) {
            return new LocalTextTransform(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LocalTextTransform[] newArray(int i12) {
            return new LocalTextTransform[i12];
        }
    }

    public LocalTextTransform(@k String str, int i12, @l String str2) {
        this.f103387b = str;
        this.f103388c = i12;
        this.f103389d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTextTransform)) {
            return false;
        }
        LocalTextTransform localTextTransform = (LocalTextTransform) obj;
        return L.f(this.f103387b, localTextTransform.f103387b) && this.f103388c == localTextTransform.f103388c && L.f(this.f103389d, localTextTransform.f103389d);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f103388c, this.f103387b.hashCode() * 31, 31);
        String str = this.f103389d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalTextTransform(text=");
        sb2.append(this.f103387b);
        sb2.append(", textVersion=");
        sb2.append(this.f103388c);
        sb2.append(", deformattedText=");
        return C22026a.c(sb2, this.f103389d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f103387b);
        parcel.writeInt(this.f103388c);
        parcel.writeString(this.f103389d);
    }

    public /* synthetic */ LocalTextTransform(String str, int i12, String str2, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? null : str2);
    }
}
