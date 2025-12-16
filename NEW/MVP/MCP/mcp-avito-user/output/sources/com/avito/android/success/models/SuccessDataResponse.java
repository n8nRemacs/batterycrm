package com.avito.android.success.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessDataResponse.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/avito/android/success/models/SuccessDataResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/success/models/AnimationUrl;", "animationUrl", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "items", "Lcom/avito/android/remote/model/ButtonAction;", "buttons", "Lcom/avito/android/success/models/CharitySignBlock;", "charityBlock", "Lcom/avito/android/deep_linking/links/DeepLink;", "onLoadedActions", "<init>", "(Lcom/avito/android/success/models/AnimationUrl;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/util/List;Lcom/avito/android/success/models/CharitySignBlock;Ljava/util/List;)V", "Lcom/avito/android/success/models/AnimationUrl;", "c", "()Lcom/avito/android/success/models/AnimationUrl;", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "d", "Lcom/avito/android/success/models/CharitySignBlock;", "e", "()Lcom/avito/android/success/models/CharitySignBlock;", "f", "_avito_success_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuccessDataResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<SuccessDataResponse> CREATOR = new a();

    @c("animationUrl")
    @k
    private final AnimationUrl animationUrl;

    @c("buttons")
    @k
    private final List<ButtonAction> buttons;

    @c("charityBlock")
    @l
    private final CharitySignBlock charityBlock;

    @c("items")
    @l
    private final List<AttributedText> items;

    @c("onLoadedActions")
    @l
    private final List<DeepLink> onLoadedActions;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: SuccessDataResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuccessDataResponse> {
        @Override // android.os.Parcelable.Creator
        public final SuccessDataResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AnimationUrl animationUrlCreateFromParcel = AnimationUrl.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SuccessDataResponse.class.getClassLoader());
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(SuccessDataResponse.class, parcel, arrayList, iL3, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int iL4 = 0;
            while (iL4 != i13) {
                iL4 = com.avito.android.actions_sheet.a.l(SuccessDataResponse.class, parcel, arrayList3, iL4, 1);
            }
            CharitySignBlock charitySignBlockCreateFromParcel = parcel.readInt() == 0 ? null : CharitySignBlock.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(SuccessDataResponse.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new SuccessDataResponse(animationUrlCreateFromParcel, attributedText, arrayList, arrayList3, charitySignBlockCreateFromParcel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SuccessDataResponse[] newArray(int i12) {
            return new SuccessDataResponse[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuccessDataResponse(@k AnimationUrl animationUrl, @k AttributedText attributedText, @l List<AttributedText> list, @k List<ButtonAction> list2, @l CharitySignBlock charitySignBlock, @l List<? extends DeepLink> list3) {
        this.animationUrl = animationUrl;
        this.title = attributedText;
        this.items = list;
        this.buttons = list2;
        this.charityBlock = charitySignBlock;
        this.onLoadedActions = list3;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AnimationUrl getAnimationUrl() {
        return this.animationUrl;
    }

    @k
    public final List<ButtonAction> d() {
        return this.buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final CharitySignBlock getCharityBlock() {
        return this.charityBlock;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessDataResponse)) {
            return false;
        }
        SuccessDataResponse successDataResponse = (SuccessDataResponse) obj;
        return L.f(this.animationUrl, successDataResponse.animationUrl) && L.f(this.title, successDataResponse.title) && L.f(this.items, successDataResponse.items) && L.f(this.buttons, successDataResponse.buttons) && L.f(this.charityBlock, successDataResponse.charityBlock) && L.f(this.onLoadedActions, successDataResponse.onLoadedActions);
    }

    @l
    public final List<DeepLink> f() {
        return this.onLoadedActions;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final List<AttributedText> getItems() {
        return this.items;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.animationUrl.hashCode() * 31, 31, this.title);
        List<AttributedText> list = this.items;
        int iE2 = H.e((iB2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.buttons);
        CharitySignBlock charitySignBlock = this.charityBlock;
        int iHashCode = (iE2 + (charitySignBlock == null ? 0 : charitySignBlock.hashCode())) * 31;
        List<DeepLink> list2 = this.onLoadedActions;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessDataResponse(animationUrl=");
        sb2.append(this.animationUrl);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", charityBlock=");
        sb2.append(this.charityBlock);
        sb2.append(", onLoadedActions=");
        return H.p(sb2, this.onLoadedActions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.animationUrl.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.title, i12);
        List<AttributedText> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Iterator itJ = C0.j(this.buttons, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        CharitySignBlock charitySignBlock = this.charityBlock;
        if (charitySignBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            charitySignBlock.writeToParcel(parcel, i12);
        }
        List<DeepLink> list2 = this.onLoadedActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }
}
