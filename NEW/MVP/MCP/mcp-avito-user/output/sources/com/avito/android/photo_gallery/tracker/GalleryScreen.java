package com.avito.android.photo_gallery.tracker;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: GalleryScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/tracker/GalleryScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes14.dex */
public final class GalleryScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final GalleryScreen f217664d = new GalleryScreen();

    @k
    public static final Parcelable.Creator<GalleryScreen> CREATOR = new a();

    /* compiled from: GalleryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryScreen> {
        @Override // android.os.Parcelable.Creator
        public final GalleryScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return GalleryScreen.f217664d;
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryScreen[] newArray(int i12) {
            return new GalleryScreen[i12];
        }
    }

    public GalleryScreen() {
        super("Gallery", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
