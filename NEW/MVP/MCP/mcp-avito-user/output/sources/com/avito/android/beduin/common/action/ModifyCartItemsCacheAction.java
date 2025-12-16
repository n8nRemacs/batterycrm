package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModifyCartItemsCacheAction.kt */
@K51.d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0016\u0017\u0018B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$Type;", "type", "", "Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$CartItem;", "items", "", "itemsTotalQuantity", "<init>", "(Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$Type;Ljava/util/List;I)V", "type$1", "Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$Type;", "d", "()Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$Type;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "c", "()I", "CartItem", "a", "Type", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ModifyCartItemsCacheAction implements BeduinAction, Ui.e {

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<CartItem> items;

    @com.google.gson.annotations.c("itemsTotalQuantity")
    private final int itemsTotalQuantity;

    /* renamed from: type$1, reason: from kotlin metadata */
    @com.google.gson.annotations.c("type")
    @Y61.k
    private final Type type;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f100030b = new a(null);

    @Y61.k
    public static final Parcelable.Creator<ModifyCartItemsCacheAction> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Class<ModifyCartItemsCacheAction> f100031c = ModifyCartItemsCacheAction.class;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final String f100032d = "modifyCartItemsCache";

    /* compiled from: ModifyCartItemsCacheAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$CartItem;", "Landroid/os/Parcelable;", "", "itemId", "", "quantity", "maxQuantity", "<init>", "(Ljava/lang/String;II)V", "Ljava/lang/String;", "getItemId", "()Ljava/lang/String;", "I", "c", "()I", "getMaxQuantity", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CartItem implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<CartItem> CREATOR = new a();

        @com.google.gson.annotations.c("itemId")
        @Y61.k
        private final String itemId;

        @com.google.gson.annotations.c("maxQuantity")
        private final int maxQuantity;

        @com.google.gson.annotations.c("quantity")
        private final int quantity;

        /* compiled from: ModifyCartItemsCacheAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CartItem> {
            @Override // android.os.Parcelable.Creator
            public final CartItem createFromParcel(Parcel parcel) {
                return new CartItem(parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final CartItem[] newArray(int i12) {
                return new CartItem[i12];
            }
        }

        public CartItem(@Y61.k String str, int i12, int i13) {
            this.itemId = str;
            this.quantity = i12;
            this.maxQuantity = i13;
        }

        /* renamed from: c, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartItem)) {
                return false;
            }
            CartItem cartItem = (CartItem) obj;
            return L.f(this.itemId, cartItem.itemId) && this.quantity == cartItem.quantity && this.maxQuantity == cartItem.maxQuantity;
        }

        @Y61.k
        public final String getItemId() {
            return this.itemId;
        }

        public final int getMaxQuantity() {
            return this.maxQuantity;
        }

        public final int hashCode() {
            return Integer.hashCode(this.maxQuantity) + r.e(this.quantity, this.itemId.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CartItem(itemId=");
            sb2.append(this.itemId);
            sb2.append(", quantity=");
            sb2.append(this.quantity);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.maxQuantity, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.itemId);
            parcel.writeInt(this.quantity);
            parcel.writeInt(this.maxQuantity);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModifyCartItemsCacheAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$Type;", "", "(Ljava/lang/String;I)V", "OVERWRITE", "UPDATE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @com.google.gson.annotations.c("overwrite")
        public static final Type OVERWRITE;

        @com.google.gson.annotations.c("update")
        public static final Type UPDATE;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f100033b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f100034c;

        static {
            Type type = new Type("OVERWRITE", 0);
            OVERWRITE = type;
            Type type2 = new Type("UPDATE", 1);
            UPDATE = type2;
            Type[] typeArr = {type, type2};
            f100033b = typeArr;
            f100034c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f100033b.clone();
        }
    }

    /* compiled from: ModifyCartItemsCacheAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/ModifyCartItemsCacheAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15524c {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<ModifyCartItemsCacheAction> getAction() {
            return ModifyCartItemsCacheAction.f100031c;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return ModifyCartItemsCacheAction.f100032d;
        }

        public a() {
        }
    }

    /* compiled from: ModifyCartItemsCacheAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ModifyCartItemsCacheAction> {
        @Override // android.os.Parcelable.Creator
        public final ModifyCartItemsCacheAction createFromParcel(Parcel parcel) {
            Type typeValueOf = Type.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CartItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ModifyCartItemsCacheAction(typeValueOf, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ModifyCartItemsCacheAction[] newArray(int i12) {
            return new ModifyCartItemsCacheAction[i12];
        }
    }

    public ModifyCartItemsCacheAction(@Y61.k Type type, @Y61.k List<CartItem> list, int i12) {
        this.type = type;
        this.items = list;
        this.itemsTotalQuantity = i12;
    }

    /* renamed from: c, reason: from getter */
    public final int getItemsTotalQuantity() {
        return this.itemsTotalQuantity;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifyCartItemsCacheAction)) {
            return false;
        }
        ModifyCartItemsCacheAction modifyCartItemsCacheAction = (ModifyCartItemsCacheAction) obj;
        return this.type == modifyCartItemsCacheAction.type && L.f(this.items, modifyCartItemsCacheAction.items) && this.itemsTotalQuantity == modifyCartItemsCacheAction.itemsTotalQuantity;
    }

    @Y61.k
    public final List<CartItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        return Integer.hashCode(this.itemsTotalQuantity) + H.e(this.type.hashCode() * 31, 31, this.items);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModifyCartItemsCacheAction(type=");
        sb2.append(this.type);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", itemsTotalQuantity=");
        return r.t(sb2, this.itemsTotalQuantity, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.type.name());
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((CartItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.itemsTotalQuantity);
    }
}
