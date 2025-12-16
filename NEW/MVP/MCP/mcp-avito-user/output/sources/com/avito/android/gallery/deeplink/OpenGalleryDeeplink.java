package com.avito.android.gallery.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: OpenGalleryDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class OpenGalleryDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<OpenGalleryDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f159207b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f159208c;

    /* compiled from: OpenGalleryDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OpenGalleryDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final OpenGalleryDeeplink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(OpenGalleryDeeplink.class, parcel, arrayList, iL2, 1);
            }
            return new OpenGalleryDeeplink(i12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OpenGalleryDeeplink[] newArray(int i12) {
            return new OpenGalleryDeeplink[i12];
        }
    }

    /* compiled from: OpenGalleryDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink$b$a;", "Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink$b$b;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: OpenGalleryDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink$b$a;", "Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink$b;", "<init>", "()V", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f159209b = new a();
        }

        /* compiled from: OpenGalleryDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink$b$b;", "Lcom/avito/android/gallery/deeplink/OpenGalleryDeeplink$b;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.gallery.deeplink.OpenGalleryDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4653b implements b {

            /* renamed from: b, reason: collision with root package name */
            public final int f159210b;

            public C4653b(int i12) {
                this.f159210b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4653b) && this.f159210b == ((C4653b) obj).f159210b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f159210b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Success(index="), this.f159210b, ')');
            }
        }
    }

    public OpenGalleryDeeplink(int i12, @k ArrayList arrayList) {
        this.f159207b = i12;
        this.f159208c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenGalleryDeeplink)) {
            return false;
        }
        OpenGalleryDeeplink openGalleryDeeplink = (OpenGalleryDeeplink) obj;
        return this.f159207b == openGalleryDeeplink.f159207b && L.f(this.f159208c, openGalleryDeeplink.f159208c);
    }

    public final int hashCode() {
        return this.f159208c.hashCode() + (Integer.hashCode(this.f159207b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenGalleryDeeplink(currentIndex=");
        sb2.append(this.f159207b);
        sb2.append(", images=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f159208c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f159207b);
        ArrayList arrayList = this.f159208c;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i12);
        }
    }
}
