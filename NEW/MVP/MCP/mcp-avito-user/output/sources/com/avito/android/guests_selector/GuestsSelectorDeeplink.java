package com.avito.android.guests_selector;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.guests_selector.io.GuestsSelectorInput;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: GuestsSelectorDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/guests_selector/GuestsSelectorDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class GuestsSelectorDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<GuestsSelectorDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final GuestsSelectorInput f161337b;

    /* compiled from: GuestsSelectorDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsSelectorDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorDeeplink createFromParcel(Parcel parcel) {
            return new GuestsSelectorDeeplink(parcel.readInt() == 0 ? null : GuestsSelectorInput.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorDeeplink[] newArray(int i12) {
            return new GuestsSelectorDeeplink[i12];
        }
    }

    /* compiled from: GuestsSelectorDeeplink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/guests_selector/GuestsSelectorDeeplink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/guests_selector/GuestsSelectorDeeplink$b$a;", "Lcom/avito/android/guests_selector/GuestsSelectorDeeplink$b$b;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: GuestsSelectorDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/guests_selector/GuestsSelectorDeeplink$b$a;", "Lcom/avito/android/guests_selector/GuestsSelectorDeeplink$b;", "<init>", "()V", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f161338b = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1996139597;
            }

            @Y61.k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: GuestsSelectorDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/GuestsSelectorDeeplink$b$b;", "Lcom/avito/android/guests_selector/GuestsSelectorDeeplink$b;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.guests_selector.GuestsSelectorDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4722b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final GuestsSelectorOutput f161339b;

            public C4722b(@Y61.k GuestsSelectorOutput guestsSelectorOutput) {
                this.f161339b = guestsSelectorOutput;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4722b) && L.f(this.f161339b, ((C4722b) obj).f161339b);
            }

            public final int hashCode() {
                return this.f161339b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "SuccessWithData(data=" + this.f161339b + ')';
            }
        }
    }

    public GuestsSelectorDeeplink(@Y61.l GuestsSelectorInput guestsSelectorInput) {
        this.f161337b = guestsSelectorInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GuestsSelectorDeeplink) && L.f(this.f161337b, ((GuestsSelectorDeeplink) obj).f161337b);
    }

    public final int hashCode() {
        GuestsSelectorInput guestsSelectorInput = this.f161337b;
        if (guestsSelectorInput == null) {
            return 0;
        }
        return guestsSelectorInput.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "GuestsSelectorDeeplink(input=" + this.f161337b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        GuestsSelectorInput guestsSelectorInput = this.f161337b;
        if (guestsSelectorInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guestsSelectorInput.writeToParcel(parcel, i12);
        }
    }
}
