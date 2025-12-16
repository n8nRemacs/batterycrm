package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsBusiness360.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsBusiness360;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast;", "toast", "<init>", "(Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast;)V", "component1", "()Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast;", "copy", "(Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast;)Lcom/avito/android/remote/model/AdvertDetailsBusiness360;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast;", "getToast", "Toast", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsBusiness360 implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsBusiness360> CREATOR = new Creator();

    @c("toast")
    @l
    private final Toast toast;

    /* compiled from: AdvertDetailsBusiness360.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsBusiness360> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsBusiness360 createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsBusiness360(parcel.readInt() == 0 ? null : Toast.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsBusiness360[] newArray(int i12) {
            return new AdvertDetailsBusiness360[i12];
        }
    }

    /* compiled from: AdvertDetailsBusiness360.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0012¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast$ToastButton;", "button", "showId", "", "showCount", "showDelayMs", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast$ToastButton;Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast$ToastButton;", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast$ToastButton;Ljava/lang/String;II)Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast$ToastButton;", "getButton", "getShowId", "I", "getShowCount", "getShowDelayMs", "ToastButton", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Toast implements Parcelable {

        @k
        public static final Parcelable.Creator<Toast> CREATOR = new Creator();

        @c("button")
        @k
        private final ToastButton button;

        @c("showCount")
        private final int showCount;

        @c("showDelayMs")
        private final int showDelayMs;

        @c("showId")
        @k
        private final String showId;

        @c("text")
        @k
        private final String text;

        /* compiled from: AdvertDetailsBusiness360.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Toast> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Toast createFromParcel(@k Parcel parcel) {
                return new Toast(parcel.readString(), ToastButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Toast[] newArray(int i12) {
                return new Toast[i12];
            }
        }

        /* compiled from: AdvertDetailsBusiness360.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast$ToastButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "onClick", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AdvertDetailsBusiness360$Toast$ToastButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnClick", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ToastButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ToastButton> CREATOR = new Creator();

            @c("onClick")
            @k
            private final DeepLink onClick;

            @c("title")
            @k
            private final String title;

            /* compiled from: AdvertDetailsBusiness360.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ToastButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ToastButton createFromParcel(@k Parcel parcel) {
                    return new ToastButton(parcel.readString(), (DeepLink) parcel.readParcelable(ToastButton.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ToastButton[] newArray(int i12) {
                    return new ToastButton[i12];
                }
            }

            public ToastButton(@k String str, @k DeepLink deepLink) {
                this.title = str;
                this.onClick = deepLink;
            }

            public static /* synthetic */ ToastButton copy$default(ToastButton toastButton, String str, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = toastButton.title;
                }
                if ((i12 & 2) != 0) {
                    deepLink = toastButton.onClick;
                }
                return toastButton.copy(str, deepLink);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final DeepLink getOnClick() {
                return this.onClick;
            }

            @k
            public final ToastButton copy(@k String title, @k DeepLink onClick) {
                return new ToastButton(title, onClick);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToastButton)) {
                    return false;
                }
                ToastButton toastButton = (ToastButton) other;
                return L.f(this.title, toastButton.title) && L.f(this.onClick, toastButton.onClick);
            }

            @k
            public final DeepLink getOnClick() {
                return this.onClick;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.onClick.hashCode() + (this.title.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ToastButton(title=");
                sb2.append(this.title);
                sb2.append(", onClick=");
                return a.v(sb2, this.onClick, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.onClick, flags);
            }
        }

        public Toast(@k String str, @k ToastButton toastButton, @k String str2, int i12, int i13) {
            this.text = str;
            this.button = toastButton;
            this.showId = str2;
            this.showCount = i12;
            this.showDelayMs = i13;
        }

        public static /* synthetic */ Toast copy$default(Toast toast, String str, ToastButton toastButton, String str2, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = toast.text;
            }
            if ((i14 & 2) != 0) {
                toastButton = toast.button;
            }
            ToastButton toastButton2 = toastButton;
            if ((i14 & 4) != 0) {
                str2 = toast.showId;
            }
            String str3 = str2;
            if ((i14 & 8) != 0) {
                i12 = toast.showCount;
            }
            int i15 = i12;
            if ((i14 & 16) != 0) {
                i13 = toast.showDelayMs;
            }
            return toast.copy(str, toastButton2, str3, i15, i13);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final ToastButton getButton() {
            return this.button;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getShowId() {
            return this.showId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getShowCount() {
            return this.showCount;
        }

        /* renamed from: component5, reason: from getter */
        public final int getShowDelayMs() {
            return this.showDelayMs;
        }

        @k
        public final Toast copy(@k String text, @k ToastButton button, @k String showId, int showCount, int showDelayMs) {
            return new Toast(text, button, showId, showCount, showDelayMs);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toast)) {
                return false;
            }
            Toast toast = (Toast) other;
            return L.f(this.text, toast.text) && L.f(this.button, toast.button) && L.f(this.showId, toast.showId) && this.showCount == toast.showCount && this.showDelayMs == toast.showDelayMs;
        }

        @k
        public final ToastButton getButton() {
            return this.button;
        }

        public final int getShowCount() {
            return this.showCount;
        }

        public final int getShowDelayMs() {
            return this.showDelayMs;
        }

        @k
        public final String getShowId() {
            return this.showId;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Integer.hashCode(this.showDelayMs) + r.e(this.showCount, H.d((this.button.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.showId), 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Toast(text=");
            sb2.append(this.text);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", showId=");
            sb2.append(this.showId);
            sb2.append(", showCount=");
            sb2.append(this.showCount);
            sb2.append(", showDelayMs=");
            return r.t(sb2, this.showDelayMs, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            this.button.writeToParcel(parcel, flags);
            parcel.writeString(this.showId);
            parcel.writeInt(this.showCount);
            parcel.writeInt(this.showDelayMs);
        }
    }

    public AdvertDetailsBusiness360(@l Toast toast) {
        this.toast = toast;
    }

    public static /* synthetic */ AdvertDetailsBusiness360 copy$default(AdvertDetailsBusiness360 advertDetailsBusiness360, Toast toast, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            toast = advertDetailsBusiness360.toast;
        }
        return advertDetailsBusiness360.copy(toast);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Toast getToast() {
        return this.toast;
    }

    @k
    public final AdvertDetailsBusiness360 copy(@l Toast toast) {
        return new AdvertDetailsBusiness360(toast);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdvertDetailsBusiness360) && L.f(this.toast, ((AdvertDetailsBusiness360) other).toast);
    }

    @l
    public final Toast getToast() {
        return this.toast;
    }

    public int hashCode() {
        Toast toast = this.toast;
        if (toast == null) {
            return 0;
        }
        return toast.hashCode();
    }

    @k
    public String toString() {
        return "AdvertDetailsBusiness360(toast=" + this.toast + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Toast toast = this.toast;
        if (toast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toast.writeToParcel(parcel, flags);
        }
    }
}
