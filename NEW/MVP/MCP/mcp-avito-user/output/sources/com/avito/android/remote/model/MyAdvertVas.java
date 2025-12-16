package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: MyAdvertVas.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertVas;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/MyAdvertVas$Discount;", "discount", "Lcom/avito/android/remote/model/Action;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "discountDescription", "<init>", "(Lcom/avito/android/remote/model/MyAdvertVas$Discount;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/MyAdvertVas$Discount;", "getDiscount", "()Lcom/avito/android/remote/model/MyAdvertVas$Discount;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDiscountDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Discount", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MyAdvertVas implements Parcelable {

    @k
    public static final Parcelable.Creator<MyAdvertVas> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("discount")
    @l
    private final Discount discount;

    @c("discountDescription")
    @l
    private final AttributedText discountDescription;

    /* compiled from: MyAdvertVas.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MyAdvertVas> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertVas createFromParcel(@k Parcel parcel) {
            return new MyAdvertVas(parcel.readInt() == 0 ? null : Discount.CREATOR.createFromParcel(parcel), (Action) parcel.readParcelable(MyAdvertVas.class.getClassLoader()), (AttributedText) parcel.readParcelable(MyAdvertVas.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MyAdvertVas[] newArray(int i12) {
            return new MyAdvertVas[i12];
        }
    }

    /* compiled from: MyAdvertVas.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertVas$Discount;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/Image;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/Image;", "getIcon", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Discount implements Parcelable {

        @k
        public static final Parcelable.Creator<Discount> CREATOR = new Creator();

        @c("description")
        @k
        private final String description;

        @c("icon")
        @l
        private final Image icon;

        @c("title")
        @k
        private final String title;

        /* compiled from: MyAdvertVas.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Discount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Discount createFromParcel(@k Parcel parcel) {
                return new Discount(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Discount.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Discount[] newArray(int i12) {
                return new Discount[i12];
            }
        }

        public Discount(@k String str, @k String str2, @l Image image) {
            this.title = str;
            this.description = str2;
            this.icon = image;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @l
        public final Image getIcon() {
            return this.icon;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeParcelable(this.icon, flags);
        }
    }

    public MyAdvertVas(@l Discount discount, @l Action action, @l AttributedText attributedText) {
        this.discount = discount;
        this.action = action;
        this.discountDescription = attributedText;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final Discount getDiscount() {
        return this.discount;
    }

    @l
    public final AttributedText getDiscountDescription() {
        return this.discountDescription;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Discount discount = this.discount;
        if (discount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discount.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.action, flags);
        parcel.writeParcelable(this.discountDescription, flags);
    }
}
