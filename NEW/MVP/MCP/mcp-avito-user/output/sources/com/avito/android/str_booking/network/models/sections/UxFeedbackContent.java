package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UxFeedbackSection.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/UxFeedbackContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "eventName", "", "Lcom/avito/android/str_booking/network/models/sections/UxFeedbackAttribute;", Navigation.ATTRIBUTES, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "Ljava/util/List;", "getAttributes", "()Ljava/util/List;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UxFeedbackContent implements Parcelable {

    @k
    public static final Parcelable.Creator<UxFeedbackContent> CREATOR = new a();

    @c(Navigation.ATTRIBUTES)
    @l
    private final List<UxFeedbackAttribute> attributes;

    @c("eventName")
    @l
    private final String eventName;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: UxFeedbackSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UxFeedbackContent> {
        @Override // android.os.Parcelable.Creator
        public final UxFeedbackContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(UxFeedbackContent.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(UxFeedbackAttribute.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new UxFeedbackContent(deepLink, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UxFeedbackContent[] newArray(int i12) {
            return new UxFeedbackContent[i12];
        }
    }

    public UxFeedbackContent(@l DeepLink deepLink, @l String str, @l List<UxFeedbackAttribute> list) {
        this.uri = deepLink;
        this.eventName = str;
        this.attributes = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxFeedbackContent)) {
            return false;
        }
        UxFeedbackContent uxFeedbackContent = (UxFeedbackContent) obj;
        return L.f(this.uri, uxFeedbackContent.uri) && L.f(this.eventName, uxFeedbackContent.eventName) && L.f(this.attributes, uxFeedbackContent.attributes);
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public final int hashCode() {
        DeepLink deepLink = this.uri;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        String str = this.eventName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UxFeedbackAttribute> list = this.attributes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UxFeedbackContent(uri=");
        sb2.append(this.uri);
        sb2.append(", eventName=");
        sb2.append(this.eventName);
        sb2.append(", attributes=");
        return H.p(sb2, this.attributes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.uri, i12);
        parcel.writeString(this.eventName);
        List<UxFeedbackAttribute> list = this.attributes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((UxFeedbackAttribute) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
