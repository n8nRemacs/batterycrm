package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.common.items.VerificationListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerificationFinishResult.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/VerificationFinishResult;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "Lcom/avito/android/remote/model/common/items/VerificationListItem;", "items", "", "isClosable", "Lcom/avito/android/remote/model/common/VerificationAction;", "action", "secondAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "deeplinkToStart", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/common/VerificationAction;Lcom/avito/android/remote/model/common/VerificationAction;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/common/VerificationAction;", "getAction", "()Lcom/avito/android/remote/model/common/VerificationAction;", "getSecondAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplinkToStart", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationFinishResult implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationFinishResult> CREATOR = new Creator();

    @c("action")
    @l
    private final VerificationAction action;

    @c("deeplinkToStart")
    @l
    private final DeepLink deeplinkToStart;

    @c("isClosable")
    @l
    private final Boolean isClosable;

    @c("items")
    @l
    private final List<VerificationListItem> items;

    @c("additionalAction")
    @l
    private final VerificationAction secondAction;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: VerificationFinishResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationFinishResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationFinishResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(VerificationFinishResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(VerificationFinishResult.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VerificationFinishResult(string, attributedText, arrayList, boolValueOf, parcel.readInt() == 0 ? null : VerificationAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? VerificationAction.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(VerificationFinishResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationFinishResult[] newArray(int i12) {
            return new VerificationFinishResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationFinishResult(@l String str, @l AttributedText attributedText, @l List<? extends VerificationListItem> list, @l Boolean bool, @l VerificationAction verificationAction, @l VerificationAction verificationAction2, @l DeepLink deepLink) {
        this.title = str;
        this.subtitle = attributedText;
        this.items = list;
        this.isClosable = bool;
        this.action = verificationAction;
        this.secondAction = verificationAction2;
        this.deeplinkToStart = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final VerificationAction getAction() {
        return this.action;
    }

    @l
    public final DeepLink getDeeplinkToStart() {
        return this.deeplinkToStart;
    }

    @l
    public final List<VerificationListItem> getItems() {
        return this.items;
    }

    @l
    public final VerificationAction getSecondAction() {
        return this.secondAction;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: isClosable, reason: from getter */
    public final Boolean getIsClosable() {
        return this.isClosable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subtitle, flags);
        List<VerificationListItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Boolean bool = this.isClosable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        VerificationAction verificationAction = this.action;
        if (verificationAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationAction.writeToParcel(parcel, flags);
        }
        VerificationAction verificationAction2 = this.secondAction;
        if (verificationAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationAction2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.deeplinkToStart, flags);
    }

    public /* synthetic */ VerificationFinishResult(String str, AttributedText attributedText, List list, Boolean bool, VerificationAction verificationAction, VerificationAction verificationAction2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, attributedText, list, bool, verificationAction, verificationAction2, (i12 & 64) != 0 ? null : deepLink);
    }
}
