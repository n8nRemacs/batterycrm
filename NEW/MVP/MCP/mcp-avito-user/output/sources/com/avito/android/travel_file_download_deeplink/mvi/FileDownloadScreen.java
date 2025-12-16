package com.avito.android.travel_file_download_deeplink.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: FileDownloadFeatureBuilder.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/FileDownloadScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes4.dex */
public final class FileDownloadScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final FileDownloadScreen f301766d = new FileDownloadScreen();

    @Y61.k
    public static final Parcelable.Creator<FileDownloadScreen> CREATOR = new a();

    /* compiled from: FileDownloadFeatureBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FileDownloadScreen> {
        @Override // android.os.Parcelable.Creator
        public final FileDownloadScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return FileDownloadScreen.f301766d;
        }

        @Override // android.os.Parcelable.Creator
        public final FileDownloadScreen[] newArray(int i12) {
            return new FileDownloadScreen[i12];
        }
    }

    public FileDownloadScreen() {
        super("FileDownload", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
