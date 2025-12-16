package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryTrustFactors.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/DeliveryTrustFactors;", "Landroid/os/Parcelable;", "", "title", "footerText", "", "Lcom/avito/android/remote/model/DeliveryTrustFactors$TrustFactor;", "trustFactors", "Lcom/avito/android/deep_linking/links/DeepLink;", "bottomSheetDeeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/DeliveryTrustFactors;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getFooterText", "Ljava/util/List;", "getTrustFactors", "Lcom/avito/android/deep_linking/links/DeepLink;", "getBottomSheetDeeplink", "TrustFactor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryTrustFactors implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryTrustFactors> CREATOR = new Creator();

    @c("bottomSheetDeeplink")
    @k
    private final DeepLink bottomSheetDeeplink;

    @c("footerText")
    @k
    private final String footerText;

    @c("title")
    @k
    private final String title;

    @c("trustFactors")
    @k
    private final List<TrustFactor> trustFactors;

    /* compiled from: DeliveryTrustFactors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryTrustFactors> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryTrustFactors createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(TrustFactor.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DeliveryTrustFactors(string, string2, arrayList, (DeepLink) parcel.readParcelable(DeliveryTrustFactors.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryTrustFactors[] newArray(int i12) {
            return new DeliveryTrustFactors[i12];
        }
    }

    /* compiled from: DeliveryTrustFactors.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/DeliveryTrustFactors$TrustFactor;", "Landroid/os/Parcelable;", "", "title", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/DeliveryTrustFactors$TrustFactor;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrustFactor implements Parcelable {

        @k
        public static final Parcelable.Creator<TrustFactor> CREATOR = new Creator();

        @c("icon")
        @k
        private final String icon;

        @c("title")
        @k
        private final String title;

        /* compiled from: DeliveryTrustFactors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TrustFactor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TrustFactor createFromParcel(@k Parcel parcel) {
                return new TrustFactor(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TrustFactor[] newArray(int i12) {
                return new TrustFactor[i12];
            }
        }

        public TrustFactor(@k String str, @k String str2) {
            this.title = str;
            this.icon = str2;
        }

        public static /* synthetic */ TrustFactor copy$default(TrustFactor trustFactor, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = trustFactor.title;
            }
            if ((i12 & 2) != 0) {
                str2 = trustFactor.icon;
            }
            return trustFactor.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @k
        public final TrustFactor copy(@k String title, @k String icon) {
            return new TrustFactor(title, icon);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustFactor)) {
                return false;
            }
            TrustFactor trustFactor = (TrustFactor) other;
            return L.f(this.title, trustFactor.title) && L.f(this.icon, trustFactor.icon);
        }

        @k
        public final String getIcon() {
            return this.icon;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.icon.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TrustFactor(title=");
            sb2.append(this.title);
            sb2.append(", icon=");
            return C22026a.c(sb2, this.icon, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.icon);
        }
    }

    public DeliveryTrustFactors(@k String str, @k String str2, @k List<TrustFactor> list, @k DeepLink deepLink) {
        this.title = str;
        this.footerText = str2;
        this.trustFactors = list;
        this.bottomSheetDeeplink = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryTrustFactors copy$default(DeliveryTrustFactors deliveryTrustFactors, String str, String str2, List list, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliveryTrustFactors.title;
        }
        if ((i12 & 2) != 0) {
            str2 = deliveryTrustFactors.footerText;
        }
        if ((i12 & 4) != 0) {
            list = deliveryTrustFactors.trustFactors;
        }
        if ((i12 & 8) != 0) {
            deepLink = deliveryTrustFactors.bottomSheetDeeplink;
        }
        return deliveryTrustFactors.copy(str, str2, list, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    @k
    public final List<TrustFactor> component3() {
        return this.trustFactors;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final DeepLink getBottomSheetDeeplink() {
        return this.bottomSheetDeeplink;
    }

    @k
    public final DeliveryTrustFactors copy(@k String title, @k String footerText, @k List<TrustFactor> trustFactors, @k DeepLink bottomSheetDeeplink) {
        return new DeliveryTrustFactors(title, footerText, trustFactors, bottomSheetDeeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTrustFactors)) {
            return false;
        }
        DeliveryTrustFactors deliveryTrustFactors = (DeliveryTrustFactors) other;
        return L.f(this.title, deliveryTrustFactors.title) && L.f(this.footerText, deliveryTrustFactors.footerText) && L.f(this.trustFactors, deliveryTrustFactors.trustFactors) && L.f(this.bottomSheetDeeplink, deliveryTrustFactors.bottomSheetDeeplink);
    }

    @k
    public final DeepLink getBottomSheetDeeplink() {
        return this.bottomSheetDeeplink;
    }

    @k
    public final String getFooterText() {
        return this.footerText;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<TrustFactor> getTrustFactors() {
        return this.trustFactors;
    }

    public int hashCode() {
        return this.bottomSheetDeeplink.hashCode() + H.e(H.d(this.title.hashCode() * 31, 31, this.footerText), 31, this.trustFactors);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryTrustFactors(title=");
        sb2.append(this.title);
        sb2.append(", footerText=");
        sb2.append(this.footerText);
        sb2.append(", trustFactors=");
        sb2.append(this.trustFactors);
        sb2.append(", bottomSheetDeeplink=");
        return a.v(sb2, this.bottomSheetDeeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.footerText);
        Iterator itJ = C0.j(this.trustFactors, parcel);
        while (itJ.hasNext()) {
            ((TrustFactor) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.bottomSheetDeeplink, flags);
    }
}
