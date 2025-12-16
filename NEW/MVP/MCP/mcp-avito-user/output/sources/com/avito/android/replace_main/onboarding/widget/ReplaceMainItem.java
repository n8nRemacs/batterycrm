package com.avito.android.replace_main.onboarding.widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReplaceMainItem.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem;", "Landroid/os/Parcelable;", "()V", "ReplaceMain", "ShowAvito", "Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem$ReplaceMain;", "Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem$ShowAvito;", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ReplaceMainItem implements Parcelable {

    /* compiled from: ReplaceMainItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem$ReplaceMain;", "Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem;", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReplaceMain extends ReplaceMainItem {

        @k
        public static final Parcelable.Creator<ReplaceMain> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f254590b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f254591c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f254592d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f254593e;

        /* compiled from: ReplaceMainItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReplaceMain> {
            @Override // android.os.Parcelable.Creator
            public final ReplaceMain createFromParcel(Parcel parcel) {
                return new ReplaceMain(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ReplaceMain[] newArray(int i12) {
                return new ReplaceMain[i12];
            }
        }

        public /* synthetic */ ReplaceMain(String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, str3, (i12 & 8) != 0 ? false : z12);
        }

        public static ReplaceMain a(ReplaceMain replaceMain, boolean z12) {
            String str = replaceMain.f254590b;
            String str2 = replaceMain.f254591c;
            String str3 = replaceMain.f254592d;
            replaceMain.getClass();
            return new ReplaceMain(str, str2, str3, z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReplaceMain)) {
                return false;
            }
            ReplaceMain replaceMain = (ReplaceMain) obj;
            return L.f(this.f254590b, replaceMain.f254590b) && L.f(this.f254591c, replaceMain.f254591c) && L.f(this.f254592d, replaceMain.f254592d) && this.f254593e == replaceMain.f254593e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f254593e) + H.d(H.d(this.f254590b.hashCode() * 31, 31, this.f254591c), 31, this.f254592d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReplaceMain(text=");
            sb2.append(this.f254590b);
            sb2.append(", buttonTitle=");
            sb2.append(this.f254591c);
            sb2.append(", clearShowId=");
            sb2.append(this.f254592d);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f254593e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f254590b);
            parcel.writeString(this.f254591c);
            parcel.writeString(this.f254592d);
            parcel.writeInt(this.f254593e ? 1 : 0);
        }

        public ReplaceMain(@k String str, @k String str2, @k String str3, boolean z12) {
            super(null);
            this.f254590b = str;
            this.f254591c = str2;
            this.f254592d = str3;
            this.f254593e = z12;
        }
    }

    /* compiled from: ReplaceMainItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem$ShowAvito;", "Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem;", "_avito_replace-main_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAvito extends ReplaceMainItem {

        @k
        public static final Parcelable.Creator<ShowAvito> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f254594b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f254595c;

        /* compiled from: ReplaceMainItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowAvito> {
            @Override // android.os.Parcelable.Creator
            public final ShowAvito createFromParcel(Parcel parcel) {
                return new ShowAvito(parcel.readString(), (DeepLink) parcel.readParcelable(ShowAvito.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ShowAvito[] newArray(int i12) {
                return new ShowAvito[i12];
            }
        }

        public ShowAvito(@k String str, @k DeepLink deepLink) {
            super(null);
            this.f254594b = str;
            this.f254595c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowAvito)) {
                return false;
            }
            ShowAvito showAvito = (ShowAvito) obj;
            return L.f(this.f254594b, showAvito.f254594b) && L.f(this.f254595c, showAvito.f254595c);
        }

        public final int hashCode() {
            return this.f254595c.hashCode() + (this.f254594b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAvito(text=");
            sb2.append(this.f254594b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f254595c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f254594b);
            parcel.writeParcelable(this.f254595c, i12);
        }
    }

    public /* synthetic */ ReplaceMainItem(C42822w c42822w) {
        this();
    }

    public ReplaceMainItem() {
    }
}
