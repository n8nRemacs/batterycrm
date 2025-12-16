package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SxAddressListLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/SxAddressDeleteLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/T0;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SxAddressDeleteLink extends DeepLink implements T0 {

    @Y61.k
    public static final Parcelable.Creator<SxAddressDeleteLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f67552b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ActionModalDialogContent f67553c;

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressDeleteLink> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressDeleteLink createFromParcel(Parcel parcel) {
            return new SxAddressDeleteLink(parcel.readLong(), (ActionModalDialogContent) parcel.readParcelable(SxAddressDeleteLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressDeleteLink[] newArray(int i12) {
            return new SxAddressDeleteLink[i12];
        }
    }

    public /* synthetic */ SxAddressDeleteLink(long j12, ActionModalDialogContent actionModalDialogContent, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? null : actionModalDialogContent);
    }

    @Override // com.avito.android.T0
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final ActionModalDialogContent getF67553c() {
        return this.f67553c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f67552b);
        parcel.writeParcelable(this.f67553c, i12);
    }

    public SxAddressDeleteLink(long j12, @Y61.l ActionModalDialogContent actionModalDialogContent) {
        this.f67552b = j12;
        this.f67553c = actionModalDialogContent;
    }
}
