package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.common.items.VerificationListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerificationStatusListResult.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b'\u0010 R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b\u000f\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/VerificationStatusListResult;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "Lcom/avito/android/remote/model/common/items/VerificationListItem;", "items", "Lcom/avito/android/remote/model/common/VerificationAction;", "action", "footer", "", Constants.REFERRER_API_META, "", "isClosable", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/remote/model/common/VerificationAction;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/Map;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/remote/model/common/VerificationAction;", "getAction", "()Lcom/avito/android/remote/model/common/VerificationAction;", "getFooter", "Ljava/util/Map;", "getMeta", "()Ljava/util/Map;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationStatusListResult implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationStatusListResult> CREATOR = new Creator();

    @c("action")
    @l
    private final VerificationAction action;

    @c("footer")
    @l
    private final AttributedText footer;

    @c("isClosable")
    @l
    private final Boolean isClosable;

    @c("items")
    @l
    private final List<VerificationListItem> items;

    @c(Constants.REFERRER_API_META)
    @l
    private final Map<String, String> meta;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: VerificationStatusListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationStatusListResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStatusListResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(VerificationStatusListResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(VerificationStatusListResult.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            VerificationAction verificationActionCreateFromParcel = parcel.readInt() == 0 ? null : VerificationAction.CREATOR.createFromParcel(parcel);
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(VerificationStatusListResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                int iA2 = 0;
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VerificationStatusListResult(string, attributedText, arrayList, verificationActionCreateFromParcel, attributedText2, linkedHashMap, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationStatusListResult[] newArray(int i12) {
            return new VerificationStatusListResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerificationStatusListResult(@l String str, @l AttributedText attributedText, @l List<? extends VerificationListItem> list, @l VerificationAction verificationAction, @l AttributedText attributedText2, @l Map<String, String> map, @l Boolean bool) {
        this.title = str;
        this.subtitle = attributedText;
        this.items = list;
        this.action = verificationAction;
        this.footer = attributedText2;
        this.meta = map;
        this.isClosable = bool;
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
    public final AttributedText getFooter() {
        return this.footer;
    }

    @l
    public final List<VerificationListItem> getItems() {
        return this.items;
    }

    @l
    public final Map<String, String> getMeta() {
        return this.meta;
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
        VerificationAction verificationAction = this.action;
        if (verificationAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.footer, flags);
        Map<String, String> map = this.meta;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Boolean bool = this.isClosable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ VerificationStatusListResult(String str, AttributedText attributedText, List list, VerificationAction verificationAction, AttributedText attributedText2, Map map, Boolean bool, int i12, C42822w c42822w) {
        this(str, attributedText, list, verificationAction, attributedText2, map, (i12 & 64) != 0 ? null : bool);
    }
}
