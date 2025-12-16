package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: CvCreationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/CvCreationItemAction;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CvCreationItemAction implements Parcelable {

    @k
    public static final Parcelable.Creator<CvCreationItemAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272746b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f272747c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f272748d;

    /* compiled from: CvCreationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvCreationItemAction> {
        @Override // android.os.Parcelable.Creator
        public final CvCreationItemAction createFromParcel(Parcel parcel) {
            return new CvCreationItemAction((DeepLink) parcel.readParcelable(CvCreationItemAction.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvCreationItemAction[] newArray(int i12) {
            return new CvCreationItemAction[i12];
        }
    }

    public CvCreationItemAction(@k DeepLink deepLink, @InterfaceC42150f @l Integer num, @k String str) {
        this.f272746b = str;
        this.f272747c = deepLink;
        this.f272748d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272746b);
        parcel.writeParcelable(this.f272747c, i12);
        Integer num = this.f272748d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
