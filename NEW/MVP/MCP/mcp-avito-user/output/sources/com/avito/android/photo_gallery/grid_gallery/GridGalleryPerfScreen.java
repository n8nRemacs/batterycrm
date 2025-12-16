package com.avito.android.photo_gallery.grid_gallery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: GridGalleryPerfScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/GridGalleryPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes14.dex */
public final class GridGalleryPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final GridGalleryPerfScreen f217147d = new GridGalleryPerfScreen();

    @Y61.k
    public static final Parcelable.Creator<GridGalleryPerfScreen> CREATOR = new a();

    /* compiled from: GridGalleryPerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GridGalleryPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final GridGalleryPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return GridGalleryPerfScreen.f217147d;
        }

        @Override // android.os.Parcelable.Creator
        public final GridGalleryPerfScreen[] newArray(int i12) {
            return new GridGalleryPerfScreen[i12];
        }
    }

    public GridGalleryPerfScreen() {
        super("GridGallery", false, 2, null);
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
