package com.avito.android.cart_snippet_actions.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartItemQuantityChange.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "Landroid/os/Parcelable;", "Default", "WithPosition", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange$Default;", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange$WithPosition;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CartItemQuantityChange extends Parcelable {

    /* compiled from: CartItemQuantityChange.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange$Default;", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Default implements CartItemQuantityChange {

        @k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f116262b;

        /* renamed from: c, reason: collision with root package name */
        public final int f116263c;

        /* renamed from: d, reason: collision with root package name */
        public final int f116264d;

        /* renamed from: e, reason: collision with root package name */
        public final int f116265e;

        /* compiled from: CartItemQuantityChange.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        public Default(@k String str, int i12, int i13, int i14) {
            this.f116262b = str;
            this.f116263c = i12;
            this.f116264d = i13;
            this.f116265e = i14;
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        /* renamed from: Q, reason: from getter */
        public final int getF116267c() {
            return this.f116263c;
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        /* renamed from: R, reason: from getter */
        public final int getF116268d() {
            return this.f116264d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r52 = (Default) obj;
            return L.f(this.f116262b, r52.f116262b) && this.f116263c == r52.f116263c && this.f116264d == r52.f116264d && this.f116265e == r52.f116265e;
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        @k
        /* renamed from: getItemId, reason: from getter */
        public final String getF116266b() {
            return this.f116262b;
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF116269e() {
            return this.f116265e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f116265e) + r.e(this.f116264d, r.e(this.f116263c, this.f116262b.hashCode() * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Default(itemId=");
            sb2.append(this.f116262b);
            sb2.append(", oldQuantity=");
            sb2.append(this.f116263c);
            sb2.append(", newQuantity=");
            sb2.append(this.f116264d);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f116265e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f116262b);
            parcel.writeInt(this.f116263c);
            parcel.writeInt(this.f116264d);
            parcel.writeInt(this.f116265e);
        }
    }

    /* compiled from: CartItemQuantityChange.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange$WithPosition;", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WithPosition implements CartItemQuantityChange {

        @k
        public static final Parcelable.Creator<WithPosition> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f116266b;

        /* renamed from: c, reason: collision with root package name */
        public final int f116267c;

        /* renamed from: d, reason: collision with root package name */
        public final int f116268d;

        /* renamed from: e, reason: collision with root package name */
        public final int f116269e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f116270f;

        /* compiled from: CartItemQuantityChange.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WithPosition> {
            @Override // android.os.Parcelable.Creator
            public final WithPosition createFromParcel(Parcel parcel) {
                return new WithPosition(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final WithPosition[] newArray(int i12) {
                return new WithPosition[i12];
            }
        }

        public WithPosition(@k String str, int i12, int i13, int i14, @l Integer num) {
            this.f116266b = str;
            this.f116267c = i12;
            this.f116268d = i13;
            this.f116269e = i14;
            this.f116270f = num;
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        /* renamed from: Q, reason: from getter */
        public final int getF116267c() {
            return this.f116267c;
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        /* renamed from: R, reason: from getter */
        public final int getF116268d() {
            return this.f116268d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithPosition)) {
                return false;
            }
            WithPosition withPosition = (WithPosition) obj;
            return L.f(this.f116266b, withPosition.f116266b) && this.f116267c == withPosition.f116267c && this.f116268d == withPosition.f116268d && this.f116269e == withPosition.f116269e && L.f(this.f116270f, withPosition.f116270f);
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        @k
        /* renamed from: getItemId, reason: from getter */
        public final String getF116266b() {
            return this.f116266b;
        }

        @Override // com.avito.android.cart_snippet_actions.models.CartItemQuantityChange
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF116269e() {
            return this.f116269e;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f116269e, r.e(this.f116268d, r.e(this.f116267c, this.f116266b.hashCode() * 31, 31), 31), 31);
            Integer num = this.f116270f;
            return iE2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WithPosition(itemId=");
            sb2.append(this.f116266b);
            sb2.append(", oldQuantity=");
            sb2.append(this.f116267c);
            sb2.append(", newQuantity=");
            sb2.append(this.f116268d);
            sb2.append(", maxQuantity=");
            sb2.append(this.f116269e);
            sb2.append(", position=");
            return s.j(sb2, this.f116270f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f116266b);
            parcel.writeInt(this.f116267c);
            parcel.writeInt(this.f116268d);
            parcel.writeInt(this.f116269e);
            Integer num = this.f116270f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    /* renamed from: Q */
    int getF116267c();

    /* renamed from: R */
    int getF116268d();

    @k
    /* renamed from: getItemId */
    String getF116266b();

    /* renamed from: getMaxQuantity */
    int getF116269e();
}
