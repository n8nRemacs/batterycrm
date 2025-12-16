package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ColoredIcon;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: LoanTerms.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms;", "Landroid/os/Parcelable;", "", "default", "", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$Term;", "terms", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getDefault", "()Ljava/lang/Integer;", "Ljava/util/List;", "getTerms", "()Ljava/util/List;", "ChipBadge", "PriceInfo", "Term", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoanTerms implements Parcelable {

    @k
    public static final Parcelable.Creator<LoanTerms> CREATOR = new Creator();

    @c("default")
    @l
    private final Integer default;

    @c("terms")
    @l
    private final List<Term> terms;

    /* compiled from: LoanTerms.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge$Type;", "type", "", "payload", "<init>", "(Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge$Type;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge$Type;", "getType", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge$Type;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ChipBadge implements Parcelable {

        @k
        public static final Parcelable.Creator<ChipBadge> CREATOR = new Creator();

        @c("payload")
        @l
        private final String payload;

        @c("type")
        @l
        private final Type type;

        /* compiled from: LoanTerms.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChipBadge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ChipBadge createFromParcel(@k Parcel parcel) {
                return new ChipBadge(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ChipBadge[] newArray(int i12) {
                return new ChipBadge[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: LoanTerms.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge$Type;", "", "(Ljava/lang/String;I)V", "TEXT", "ELLIPSE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("text")
            public static final Type TEXT = new Type("TEXT", 0);

            @c("ellipse")
            public static final Type ELLIPSE = new Type("ELLIPSE", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TEXT, ELLIPSE};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12) {
            }

            @k
            public static a<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public ChipBadge(@l Type type, @l String str) {
            this.type = type;
            this.payload = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getPayload() {
            return this.payload;
        }

        @l
        public final Type getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Type type = this.type;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            parcel.writeString(this.payload);
        }
    }

    /* compiled from: LoanTerms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoanTerms> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LoanTerms createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Term.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new LoanTerms(numValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LoanTerms[] newArray(int i12) {
            return new LoanTerms[i12];
        }
    }

    /* compiled from: LoanTerms.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;", "Landroid/os/Parcelable;", "", "price", "Lcom/avito/android/remote/model/text/AttributedText;", "priceDescription", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge;", "badge", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getPriceDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge;", "getBadge", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge;", "PriceBadge", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class PriceInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<PriceInfo> CREATOR = new Creator();

        @c("badge")
        @l
        private final PriceBadge badge;

        @c("price")
        @l
        private final String price;

        @c("priceDescription")
        @l
        private final AttributedText priceDescription;

        /* compiled from: LoanTerms.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PriceInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceInfo createFromParcel(@k Parcel parcel) {
                return new PriceInfo(parcel.readString(), (AttributedText) parcel.readParcelable(PriceInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : PriceBadge.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceInfo[] newArray(int i12) {
                return new PriceInfo[i12];
            }
        }

        /* compiled from: LoanTerms.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge$Type;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "text", "<init>", "(Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge$Type;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge$Type;", "getType", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge$Type;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class PriceBadge implements Parcelable {

            @k
            public static final Parcelable.Creator<PriceBadge> CREATOR = new Creator();

            @c(Constants.DEEPLINK)
            @l
            private final DeepLink deeplink;

            @c("text")
            @l
            private final String text;

            @c("type")
            @l
            private final Type type;

            /* compiled from: LoanTerms.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PriceBadge> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PriceBadge createFromParcel(@k Parcel parcel) {
                    return new PriceBadge(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(PriceBadge.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PriceBadge[] newArray(int i12) {
                    return new PriceBadge[i12];
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: LoanTerms.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo$PriceBadge$Type;", "", "(Ljava/lang/String;I)V", "RED_BADGE", "QUESTION_BUTTON", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Type {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;

                @c("redBadge")
                public static final Type RED_BADGE = new Type("RED_BADGE", 0);

                @c("questionButton")
                public static final Type QUESTION_BUTTON = new Type("QUESTION_BUTTON", 1);

                private static final /* synthetic */ Type[] $values() {
                    return new Type[]{RED_BADGE, QUESTION_BUTTON};
                }

                static {
                    Type[] typeArr$values = $values();
                    $VALUES = typeArr$values;
                    $ENTRIES = kotlin.enums.c.a(typeArr$values);
                }

                private Type(String str, int i12) {
                }

                @k
                public static a<Type> getEntries() {
                    return $ENTRIES;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public PriceBadge(@l Type type, @l DeepLink deepLink, @l String str) {
                this.type = type;
                this.deeplink = deepLink;
                this.text = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @l
            public final String getText() {
                return this.text;
            }

            @l
            public final Type getType() {
                return this.type;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Type type = this.type;
                if (type == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(type.name());
                }
                parcel.writeParcelable(this.deeplink, flags);
                parcel.writeString(this.text);
            }
        }

        public PriceInfo(@l String str, @l AttributedText attributedText, @l PriceBadge priceBadge) {
            this.price = str;
            this.priceDescription = attributedText;
            this.badge = priceBadge;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final PriceBadge getBadge() {
            return this.badge;
        }

        @l
        public final String getPrice() {
            return this.price;
        }

        @l
        public final AttributedText getPriceDescription() {
            return this.priceDescription;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.price);
            parcel.writeParcelable(this.priceDescription, flags);
            PriceBadge priceBadge = this.badge;
            if (priceBadge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                priceBadge.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: LoanTerms.kt */
    @d
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b0\u0010,R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b1\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\bG\u0010,R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bH\u0010=R$\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms$Term;", "Landroid/os/Parcelable;", "", "planId", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;", "badge", "termTitle", "creditInfoTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "creditInfoSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/remote/model/ColoredIcon;", "localIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "iconDeepLink", "Lcom/avito/android/remote/model/credit_broker/Size;", "iconSize", "Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "progress", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;", "priceInfo", "buttonTitle", ContextActionHandler.Link.DEEPLINK, "", "Lcom/avito/android/remote/model/credit_broker/OfferDetailsItem;", "creditOfferDetailsItems", "Lcom/avito/android/remote/model/credit_broker/InstallmentsFloatingView;", "floatingView", "Lcom/avito/android/remote/model/credit_broker/CreditButton;", "additionalTopButton", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/ColoredIcon;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/credit_broker/Size;Lcom/avito/android/remote/model/credit_broker/CreditProgress;Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Lcom/avito/android/remote/model/credit_broker/InstallmentsFloatingView;Lcom/avito/android/remote/model/credit_broker/CreditButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPlanId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;", "getBadge", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;", "getTermTitle", "getCreditInfoTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getCreditInfoSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/ColoredIcon;", "getLocalIcon", "()Lcom/avito/android/remote/model/ColoredIcon;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getIconDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/credit_broker/Size;", "getIconSize", "()Lcom/avito/android/remote/model/credit_broker/Size;", "Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "getProgress", "()Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;", "getPriceInfo", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms$PriceInfo;", "getButtonTitle", "getDeepLink", "Ljava/util/List;", "getCreditOfferDetailsItems", "()Ljava/util/List;", "Lcom/avito/android/remote/model/credit_broker/InstallmentsFloatingView;", "getFloatingView", "()Lcom/avito/android/remote/model/credit_broker/InstallmentsFloatingView;", "Lcom/avito/android/remote/model/credit_broker/CreditButton;", "getAdditionalTopButton", "()Lcom/avito/android/remote/model/credit_broker/CreditButton;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Term implements Parcelable {

        @k
        public static final Parcelable.Creator<Term> CREATOR = new Creator();

        @c("additionalTopButton")
        @l
        private final CreditButton additionalTopButton;

        @c("badge")
        @l
        private final ChipBadge badge;

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("creditInfoSubtitle")
        @l
        private final AttributedText creditInfoSubtitle;

        @c("creditInfoTitle")
        @l
        private final String creditInfoTitle;

        @c("offerDetailsItems")
        @l
        private final List<OfferDetailsItem> creditOfferDetailsItems;

        @c(ContextActionHandler.Link.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @c("floatingView")
        @l
        private final InstallmentsFloatingView floatingView;

        @c("icon")
        @l
        private final UniversalImage icon;

        @c("iconDeepLink")
        @l
        private final DeepLink iconDeepLink;

        @c("iconSize")
        @l
        private final Size iconSize;

        @c("localIcon")
        @l
        private final ColoredIcon localIcon;

        @c("planId")
        @l
        private final String planId;

        @c("priceInfo")
        @l
        private final PriceInfo priceInfo;

        @c("progress")
        @l
        private final CreditProgress progress;

        @c("termTitle")
        @l
        private final String termTitle;

        /* compiled from: LoanTerms.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Term> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Term createFromParcel(@k Parcel parcel) {
                DeepLink deepLink;
                String str;
                ArrayList arrayList;
                int i12;
                OfferDetailsItem offerDetailsItemCreateFromParcel;
                String string = parcel.readString();
                ChipBadge chipBadgeCreateFromParcel = parcel.readInt() == 0 ? null : ChipBadge.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Term.class.getClassLoader());
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Term.class.getClassLoader());
                ColoredIcon coloredIcon = (ColoredIcon) parcel.readParcelable(Term.class.getClassLoader());
                DeepLink deepLink2 = (DeepLink) parcel.readParcelable(Term.class.getClassLoader());
                Size sizeCreateFromParcel = parcel.readInt() == 0 ? null : Size.CREATOR.createFromParcel(parcel);
                CreditProgress creditProgressCreateFromParcel = parcel.readInt() == 0 ? null : CreditProgress.CREATOR.createFromParcel(parcel);
                PriceInfo priceInfoCreateFromParcel = parcel.readInt() == 0 ? null : PriceInfo.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                DeepLink deepLink3 = (DeepLink) parcel.readParcelable(Term.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    str = string4;
                    deepLink = deepLink3;
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    deepLink = deepLink3;
                    ArrayList arrayList2 = new ArrayList(i13);
                    str = string4;
                    int i14 = 0;
                    while (i14 != i13) {
                        if (parcel.readInt() == 0) {
                            i12 = i13;
                            offerDetailsItemCreateFromParcel = null;
                        } else {
                            i12 = i13;
                            offerDetailsItemCreateFromParcel = OfferDetailsItem.CREATOR.createFromParcel(parcel);
                        }
                        arrayList2.add(offerDetailsItemCreateFromParcel);
                        i14++;
                        i13 = i12;
                    }
                    arrayList = arrayList2;
                }
                return new Term(string, chipBadgeCreateFromParcel, string2, string3, attributedText, universalImage, coloredIcon, deepLink2, sizeCreateFromParcel, creditProgressCreateFromParcel, priceInfoCreateFromParcel, str, deepLink, arrayList, (InstallmentsFloatingView) parcel.readParcelable(Term.class.getClassLoader()), parcel.readInt() == 0 ? null : CreditButton.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Term[] newArray(int i12) {
                return new Term[i12];
            }
        }

        public Term(@l String str, @l ChipBadge chipBadge, @l String str2, @l String str3, @l AttributedText attributedText, @l UniversalImage universalImage, @l ColoredIcon coloredIcon, @l DeepLink deepLink, @l Size size, @l CreditProgress creditProgress, @l PriceInfo priceInfo, @l String str4, @l DeepLink deepLink2, @l List<OfferDetailsItem> list, @l InstallmentsFloatingView installmentsFloatingView, @l CreditButton creditButton) {
            this.planId = str;
            this.badge = chipBadge;
            this.termTitle = str2;
            this.creditInfoTitle = str3;
            this.creditInfoSubtitle = attributedText;
            this.icon = universalImage;
            this.localIcon = coloredIcon;
            this.iconDeepLink = deepLink;
            this.iconSize = size;
            this.progress = creditProgress;
            this.priceInfo = priceInfo;
            this.buttonTitle = str4;
            this.deepLink = deepLink2;
            this.creditOfferDetailsItems = list;
            this.floatingView = installmentsFloatingView;
            this.additionalTopButton = creditButton;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final CreditButton getAdditionalTopButton() {
            return this.additionalTopButton;
        }

        @l
        public final ChipBadge getBadge() {
            return this.badge;
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final AttributedText getCreditInfoSubtitle() {
            return this.creditInfoSubtitle;
        }

        @l
        public final String getCreditInfoTitle() {
            return this.creditInfoTitle;
        }

        @l
        public final List<OfferDetailsItem> getCreditOfferDetailsItems() {
            return this.creditOfferDetailsItems;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final InstallmentsFloatingView getFloatingView() {
            return this.floatingView;
        }

        @l
        public final UniversalImage getIcon() {
            return this.icon;
        }

        @l
        public final DeepLink getIconDeepLink() {
            return this.iconDeepLink;
        }

        @l
        public final Size getIconSize() {
            return this.iconSize;
        }

        @l
        public final ColoredIcon getLocalIcon() {
            return this.localIcon;
        }

        @l
        public final String getPlanId() {
            return this.planId;
        }

        @l
        public final PriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        @l
        public final CreditProgress getProgress() {
            return this.progress;
        }

        @l
        public final String getTermTitle() {
            return this.termTitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.planId);
            ChipBadge chipBadge = this.badge;
            if (chipBadge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                chipBadge.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.termTitle);
            parcel.writeString(this.creditInfoTitle);
            parcel.writeParcelable(this.creditInfoSubtitle, flags);
            parcel.writeParcelable(this.icon, flags);
            parcel.writeParcelable(this.localIcon, flags);
            parcel.writeParcelable(this.iconDeepLink, flags);
            Size size = this.iconSize;
            if (size == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                size.writeToParcel(parcel, flags);
            }
            CreditProgress creditProgress = this.progress;
            if (creditProgress == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                creditProgress.writeToParcel(parcel, flags);
            }
            PriceInfo priceInfo = this.priceInfo;
            if (priceInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                priceInfo.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.buttonTitle);
            parcel.writeParcelable(this.deepLink, flags);
            List<OfferDetailsItem> list = this.creditOfferDetailsItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    OfferDetailsItem offerDetailsItem = (OfferDetailsItem) itA.next();
                    if (offerDetailsItem == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        offerDetailsItem.writeToParcel(parcel, flags);
                    }
                }
            }
            parcel.writeParcelable(this.floatingView, flags);
            CreditButton creditButton = this.additionalTopButton;
            if (creditButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                creditButton.writeToParcel(parcel, flags);
            }
        }
    }

    public LoanTerms(@l Integer num, @l List<Term> list) {
        this.default = num;
        this.terms = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Integer getDefault() {
        return this.default;
    }

    @l
    public final List<Term> getTerms() {
        return this.terms;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.default;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<Term> list = this.terms;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Term) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
