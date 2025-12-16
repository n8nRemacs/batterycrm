package com.avito.android.messenger_icebreakers_dialog;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessengerIcebreakerBottomSheetData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/MessengerIcebreakerBottomSheetData;", "Landroid/os/Parcelable;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MessengerIcebreakerBottomSheetData implements Parcelable {

    @k
    public static final Parcelable.Creator<MessengerIcebreakerBottomSheetData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f197521b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f197522c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f197523d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f197524e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f197525f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f197526g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f197527h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<MessageSuggest> f197528i;

    /* compiled from: MessengerIcebreakerBottomSheetData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MessengerIcebreakerBottomSheetData> {
        @Override // android.os.Parcelable.Creator
        public final MessengerIcebreakerBottomSheetData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(MessengerIcebreakerBottomSheetData.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(MessengerIcebreakerBottomSheetData.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(MessengerIcebreakerBottomSheetData.class.getClassLoader());
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(MessengerIcebreakerBottomSheetData.class, parcel, arrayList, iL2, 1);
            }
            return new MessengerIcebreakerBottomSheetData(string, image, image2, string2, string3, deepLink, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessengerIcebreakerBottomSheetData[] newArray(int i12) {
            return new MessengerIcebreakerBottomSheetData[i12];
        }
    }

    public MessengerIcebreakerBottomSheetData(@k String str, @l Image image, @l Image image2, @k String str2, @l String str3, @l DeepLink deepLink, @k String str4, @k List<MessageSuggest> list) {
        this.f197521b = str;
        this.f197522c = image;
        this.f197523d = image2;
        this.f197524e = str2;
        this.f197525f = str3;
        this.f197526g = deepLink;
        this.f197527h = str4;
        this.f197528i = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerIcebreakerBottomSheetData)) {
            return false;
        }
        MessengerIcebreakerBottomSheetData messengerIcebreakerBottomSheetData = (MessengerIcebreakerBottomSheetData) obj;
        return L.f(this.f197521b, messengerIcebreakerBottomSheetData.f197521b) && L.f(this.f197522c, messengerIcebreakerBottomSheetData.f197522c) && L.f(this.f197523d, messengerIcebreakerBottomSheetData.f197523d) && L.f(this.f197524e, messengerIcebreakerBottomSheetData.f197524e) && L.f(this.f197525f, messengerIcebreakerBottomSheetData.f197525f) && L.f(this.f197526g, messengerIcebreakerBottomSheetData.f197526g) && L.f(this.f197527h, messengerIcebreakerBottomSheetData.f197527h) && L.f(this.f197528i, messengerIcebreakerBottomSheetData.f197528i);
    }

    public final int hashCode() {
        int iHashCode = this.f197521b.hashCode() * 31;
        Image image = this.f197522c;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f197523d;
        int iD2 = H.d((iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.f197524e);
        String str = this.f197525f;
        int iHashCode3 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f197526g;
        return this.f197528i.hashCode() + H.d((iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f197527h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessengerIcebreakerBottomSheetData(channelId=");
        sb2.append(this.f197521b);
        sb2.append(", itemAvatar=");
        sb2.append(this.f197522c);
        sb2.append(", sellerAvatar=");
        sb2.append(this.f197523d);
        sb2.append(", itemName=");
        sb2.append(this.f197524e);
        sb2.append(", sellerName=");
        sb2.append(this.f197525f);
        sb2.append(", phoneDeeplink=");
        sb2.append(this.f197526g);
        sb2.append(", price=");
        sb2.append(this.f197527h);
        sb2.append(", suggestList=");
        return H.p(sb2, this.f197528i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f197521b);
        parcel.writeParcelable(this.f197522c, i12);
        parcel.writeParcelable(this.f197523d, i12);
        parcel.writeString(this.f197524e);
        parcel.writeString(this.f197525f);
        parcel.writeParcelable(this.f197526g, i12);
        parcel.writeString(this.f197527h);
        Iterator itJ = C0.j(this.f197528i, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
