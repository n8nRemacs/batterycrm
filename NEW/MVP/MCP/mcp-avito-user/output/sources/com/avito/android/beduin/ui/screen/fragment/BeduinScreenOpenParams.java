package com.avito.android.beduin.ui.screen.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinScreenOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/BeduinScreenOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinScreenOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<BeduinScreenOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f104142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f104143c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ScreenStyle f104144d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenTransfer f104145e;

    /* compiled from: BeduinScreenOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinScreenOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final BeduinScreenOpenParams createFromParcel(Parcel parcel) {
            return new BeduinScreenOpenParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString()), (ScreenTransfer) parcel.readParcelable(BeduinScreenOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinScreenOpenParams[] newArray(int i12) {
            return new BeduinScreenOpenParams[i12];
        }
    }

    public BeduinScreenOpenParams(@Y61.k String str, @Y61.k String str2, @Y61.l ScreenStyle screenStyle, @Y61.k ScreenTransfer screenTransfer) {
        this.f104142b = str;
        this.f104143c = str2;
        this.f104144d = screenStyle;
        this.f104145e = screenTransfer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinScreenOpenParams)) {
            return false;
        }
        BeduinScreenOpenParams beduinScreenOpenParams = (BeduinScreenOpenParams) obj;
        return L.f(this.f104142b, beduinScreenOpenParams.f104142b) && L.f(this.f104143c, beduinScreenOpenParams.f104143c) && this.f104144d == beduinScreenOpenParams.f104144d && L.f(this.f104145e, beduinScreenOpenParams.f104145e);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f104142b.hashCode() * 31, 31, this.f104143c);
        ScreenStyle screenStyle = this.f104144d;
        return this.f104145e.hashCode() + ((iD2 + (screenStyle == null ? 0 : screenStyle.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "BeduinScreenOpenParams(screenId=" + this.f104142b + ", screenName=" + this.f104143c + ", presentationStyle=" + this.f104144d + ", preloadMetrics=" + this.f104145e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f104142b);
        parcel.writeString(this.f104143c);
        ScreenStyle screenStyle = this.f104144d;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
        parcel.writeParcelable(this.f104145e, i12);
    }
}
