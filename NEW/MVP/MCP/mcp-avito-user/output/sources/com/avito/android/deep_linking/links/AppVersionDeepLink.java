package com.avito.android.deep_linking.links;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AppVersionDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AppVersionDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLinkContainer;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class AppVersionDeepLink extends DeepLinkContainer {

    @Y61.k
    public static final Parcelable.Creator<AppVersionDeepLink> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f133011d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Uri f133012e;

    /* compiled from: AppVersionDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppVersionDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final AppVersionDeepLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AppVersionDeepLink.class, parcel, arrayList, iL2, 1);
            }
            return new AppVersionDeepLink(arrayList, (Uri) parcel.readParcelable(AppVersionDeepLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppVersionDeepLink[] newArray(int i12) {
            return new AppVersionDeepLink[i12];
        }
    }

    public AppVersionDeepLink(@Y61.k ArrayList arrayList, @Y61.k Uri uri) {
        super(arrayList, uri);
        this.f133011d = arrayList;
        this.f133012e = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f133011d, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeParcelable(this.f133012e, i12);
    }
}
