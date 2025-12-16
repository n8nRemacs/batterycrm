package com.avito.android.comfortable_deal_info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.comfortable_deal_info.dto.Action;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealInfoFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoParams;", "Lcom/avito/android/util/OpenParams;", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class ComfortableDealInfoParams implements OpenParams {

    @k
    public static final Parcelable.Creator<ComfortableDealInfoParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f123458b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f123459c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Action f123460d;

    /* renamed from: e, reason: collision with root package name */
    public final int f123461e;

    /* compiled from: ComfortableDealInfoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealInfoParams> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoParams createFromParcel(Parcel parcel) {
            return new ComfortableDealInfoParams((UniversalImage) parcel.readParcelable(ComfortableDealInfoParams.class.getClassLoader()), (AttributedText) parcel.readParcelable(ComfortableDealInfoParams.class.getClassLoader()), (Action) parcel.readParcelable(ComfortableDealInfoParams.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoParams[] newArray(int i12) {
            return new ComfortableDealInfoParams[i12];
        }
    }

    public ComfortableDealInfoParams(@k UniversalImage universalImage, @k AttributedText attributedText, @k Action action, int i12) {
        this.f123458b = universalImage;
        this.f123459c = attributedText;
        this.f123460d = action;
        this.f123461e = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComfortableDealInfoParams)) {
            return false;
        }
        ComfortableDealInfoParams comfortableDealInfoParams = (ComfortableDealInfoParams) obj;
        return L.f(this.f123458b, comfortableDealInfoParams.f123458b) && L.f(this.f123459c, comfortableDealInfoParams.f123459c) && L.f(this.f123460d, comfortableDealInfoParams.f123460d) && this.f123461e == comfortableDealInfoParams.f123461e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123461e) + ((this.f123460d.hashCode() + com.avito.android.actions_sheet.a.b(this.f123458b.hashCode() * 31, 31, this.f123459c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealInfoParams(image=");
        sb2.append(this.f123458b);
        sb2.append(", content=");
        sb2.append(this.f123459c);
        sb2.append(", action=");
        sb2.append(this.f123460d);
        sb2.append(", index=");
        return r.t(sb2, this.f123461e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f123458b, i12);
        parcel.writeParcelable(this.f123459c, i12);
        parcel.writeParcelable(this.f123460d, i12);
        parcel.writeInt(this.f123461e);
    }
}
