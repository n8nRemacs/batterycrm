package com.avito.android.str_core.toggle_booking;

import Ju.InterfaceC14249c;
import K51.d;
import Ku.AbstractC14350a;
import Ku.i;
import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ToggleOnlineBookingDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "c", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class ToggleOnlineBookingDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ToggleOnlineBookingDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288535b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f288536c;

    /* compiled from: ToggleOnlineBookingDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToggleOnlineBookingDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final ToggleOnlineBookingDeepLink createFromParcel(Parcel parcel) {
            return new ToggleOnlineBookingDeepLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ToggleOnlineBookingDeepLink[] newArray(int i12) {
            return new ToggleOnlineBookingDeepLink[i12];
        }
    }

    /* compiled from: ToggleOnlineBookingDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$b;", "LKu/a;", "Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink;", "<init>", "()V", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ToggleOnlineBookingDeepLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            return new ToggleOnlineBookingDeepLink(i.p(uri, "itemId"), Boolean.parseBoolean(i.p(uri, "enabled")));
        }
    }

    /* compiled from: ToggleOnlineBookingDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$c;", "LJu/c$b;", "a", "b", "Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$c$a;", "Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$c$b;", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends InterfaceC14249c.b {

        /* compiled from: ToggleOnlineBookingDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$c$a;", "Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$c;", "<init>", "()V", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f288537b = new a();
        }

        /* compiled from: ToggleOnlineBookingDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$c$b;", "Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink$c;", "<init>", "()V", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f288538b = new b();
        }
    }

    public ToggleOnlineBookingDeepLink(@k String str, boolean z12) {
        this.f288535b = str;
        this.f288536c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288535b);
        parcel.writeInt(this.f288536c ? 1 : 0);
    }
}
