package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SellerVerification.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/SellerVerification;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SellerVerification$VerificationItem;", "internal", "external", "Lcom/avito/android/remote/model/SellerVerification$AwardsItem;", "awards", "<init>", "(Lcom/avito/android/remote/model/SellerVerification$VerificationItem;Lcom/avito/android/remote/model/SellerVerification$VerificationItem;Lcom/avito/android/remote/model/SellerVerification$AwardsItem;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/SellerVerification$VerificationItem;", "getInternal", "()Lcom/avito/android/remote/model/SellerVerification$VerificationItem;", "getExternal", "Lcom/avito/android/remote/model/SellerVerification$AwardsItem;", "getAwards", "()Lcom/avito/android/remote/model/SellerVerification$AwardsItem;", "AwardsItem", "BaseVerificationItem", "VerificationItem", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SellerVerification implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerVerification> CREATOR = new Creator();

    @c("autoDealerOfTheYear")
    @l
    private final AwardsItem awards;

    @c("external")
    @l
    private final VerificationItem external;

    @c("internal")
    @l
    private final VerificationItem internal;

    /* compiled from: SellerVerification.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/SellerVerification$AwardsItem;", "Lcom/avito/android/remote/model/SellerVerification$BaseVerificationItem;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/Action;", "action", "", "", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AwardsItem implements BaseVerificationItem, Parcelable {

        @k
        public static final Parcelable.Creator<AwardsItem> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("data")
        @l
        private final Map<String, List<String>> data;

        @c("description")
        @l
        private final String description;

        @c("title")
        @k
        private final String title;

        /* compiled from: SellerVerification.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AwardsItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AwardsItem createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
                String string2 = parcel.readString();
                Action action = (Action) parcel.readParcelable(AwardsItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new AwardsItem(string, string2, action, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AwardsItem[] newArray(int i12) {
                return new AwardsItem[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AwardsItem(@k String str, @l String str2, @l Action action, @l Map<String, ? extends List<String>> map) {
            this.title = str;
            this.description = str2;
            this.action = action;
            this.data = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.SellerVerification.BaseVerificationItem
        @l
        public Action getAction() {
            return this.action;
        }

        @l
        public final Map<String, List<String>> getData() {
            return this.data;
        }

        @Override // com.avito.android.remote.model.SellerVerification.BaseVerificationItem
        @l
        public String getDescription() {
            return this.description;
        }

        @Override // com.avito.android.remote.model.SellerVerification.BaseVerificationItem
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeParcelable(this.action, flags);
            Map<String, List<String>> map = this.data;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeStringList((List) entry.getValue());
            }
        }
    }

    /* compiled from: SellerVerification.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/SellerVerification$BaseVerificationItem;", "", "action", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "description", "", "getDescription", "()Ljava/lang/String;", "title", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface BaseVerificationItem {
        @l
        Action getAction();

        @l
        String getDescription();

        @k
        String getTitle();
    }

    /* compiled from: SellerVerification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerVerification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerVerification createFromParcel(@k Parcel parcel) {
            return new SellerVerification(parcel.readInt() == 0 ? null : VerificationItem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VerificationItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AwardsItem.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerVerification[] newArray(int i12) {
            return new SellerVerification[i12];
        }
    }

    /* compiled from: SellerVerification.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/SellerVerification$VerificationItem;", "Lcom/avito/android/remote/model/SellerVerification$BaseVerificationItem;", "Landroid/os/Parcelable;", "", "title", "description", "descriptionTitle", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "getDescriptionTitle", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerificationItem implements BaseVerificationItem, Parcelable {

        @k
        public static final Parcelable.Creator<VerificationItem> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("description")
        @l
        private final String description;

        @c("descriptionTitle")
        @l
        private final String descriptionTitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: SellerVerification.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VerificationItem createFromParcel(@k Parcel parcel) {
                return new VerificationItem(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(VerificationItem.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VerificationItem[] newArray(int i12) {
                return new VerificationItem[i12];
            }
        }

        public VerificationItem(@k String str, @l String str2, @l String str3, @l Action action) {
            this.title = str;
            this.description = str2;
            this.descriptionTitle = str3;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.SellerVerification.BaseVerificationItem
        @l
        public Action getAction() {
            return this.action;
        }

        @Override // com.avito.android.remote.model.SellerVerification.BaseVerificationItem
        @l
        public String getDescription() {
            return this.description;
        }

        @l
        public final String getDescriptionTitle() {
            return this.descriptionTitle;
        }

        @Override // com.avito.android.remote.model.SellerVerification.BaseVerificationItem
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.descriptionTitle);
            parcel.writeParcelable(this.action, flags);
        }
    }

    public SellerVerification(@l VerificationItem verificationItem, @l VerificationItem verificationItem2, @l AwardsItem awardsItem) {
        this.internal = verificationItem;
        this.external = verificationItem2;
        this.awards = awardsItem;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AwardsItem getAwards() {
        return this.awards;
    }

    @l
    public final VerificationItem getExternal() {
        return this.external;
    }

    @l
    public final VerificationItem getInternal() {
        return this.internal;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        VerificationItem verificationItem = this.internal;
        if (verificationItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationItem.writeToParcel(parcel, flags);
        }
        VerificationItem verificationItem2 = this.external;
        if (verificationItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationItem2.writeToParcel(parcel, flags);
        }
        AwardsItem awardsItem = this.awards;
        if (awardsItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            awardsItem.writeToParcel(parcel, flags);
        }
    }
}
