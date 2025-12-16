package com.avito.android.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: PhotoPickerDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink/PhotoPickerDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PhotoPickerDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PhotoPickerDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f134089b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134090c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134091d;

    /* compiled from: PhotoPickerDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoPickerDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final PhotoPickerDeepLink createFromParcel(Parcel parcel) {
            return new PhotoPickerDeepLink(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoPickerDeepLink[] newArray(int i12) {
            return new PhotoPickerDeepLink[i12];
        }
    }

    /* compiled from: PhotoPickerDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deeplink/PhotoPickerDeepLink$b;", "", "a", "b", "Lcom/avito/android/deeplink/PhotoPickerDeepLink$b$a;", "Lcom/avito/android/deeplink/PhotoPickerDeepLink$b$b;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PhotoPickerDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink/PhotoPickerDeepLink$b$a;", "Lcom/avito/android/deeplink/PhotoPickerDeepLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f134092b = new a();
        }

        /* compiled from: PhotoPickerDeepLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink/PhotoPickerDeepLink$b$b;", "Lcom/avito/android/deeplink/PhotoPickerDeepLink$b;", "LJu/c$b;", "_avito_photo-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink.PhotoPickerDeepLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4033b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<Uri> f134093b;

            /* JADX WARN: Multi-variable type inference failed */
            public C4033b(@k List<? extends Uri> list) {
                this.f134093b = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4033b) && L.f(this.f134093b, ((C4033b) obj).f134093b);
            }

            public final int hashCode() {
                return this.f134093b.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Success(images="), this.f134093b, ')');
            }
        }
    }

    public PhotoPickerDeepLink(int i12, int i13, boolean z12) {
        this.f134089b = i12;
        this.f134090c = i13;
        this.f134091d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f134089b);
        parcel.writeInt(this.f134090c);
        parcel.writeInt(this.f134091d ? 1 : 0);
    }
}
