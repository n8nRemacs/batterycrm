package com.avito.android.beduin.common.component.cart_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RightIcons.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/RightIcons;", "Landroid/os/Parcelable;", "Default", "Favorite", "Lcom/avito/android/beduin/common/component/cart_item/RightIcons$Default;", "Lcom/avito/android/beduin/common/component/cart_item/RightIcons$Favorite;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface RightIcons extends Parcelable {

    /* compiled from: RightIcons.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/RightIcons$Default;", "Lcom/avito/android/beduin/common/component/cart_item/RightIcons;", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "icon", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Ljava/util/List;)V", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "c", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "Ljava/util/List;", "d", "()Ljava/util/List;", "ButtonIcon", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Default implements RightIcons {

        @Y61.k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        @com.google.gson.annotations.c("icon")
        @Y61.k
        private final LocalIcon icon;

        @com.google.gson.annotations.c("onTapActions")
        @Y61.k
        private final List<BeduinAction> onTapActions;

        /* compiled from: RightIcons.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/RightIcons$Default$ButtonIcon;", "Landroid/os/Parcelable;", "", "color", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getColor", "()Ljava/lang/String;", "getName", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ButtonIcon implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<ButtonIcon> CREATOR = new a();

            @com.google.gson.annotations.c("color")
            @Y61.k
            private final String color;

            @com.google.gson.annotations.c("name")
            @Y61.k
            private final String name;

            /* compiled from: RightIcons.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ButtonIcon> {
                @Override // android.os.Parcelable.Creator
                public final ButtonIcon createFromParcel(Parcel parcel) {
                    return new ButtonIcon(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ButtonIcon[] newArray(int i12) {
                    return new ButtonIcon[i12];
                }
            }

            public ButtonIcon(@Y61.k String str, @Y61.k String str2) {
                this.color = str;
                this.name = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonIcon)) {
                    return false;
                }
                ButtonIcon buttonIcon = (ButtonIcon) obj;
                return L.f(this.color, buttonIcon.color) && L.f(this.name, buttonIcon.name);
            }

            public final int hashCode() {
                return this.name.hashCode() + (this.color.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ButtonIcon(color=");
                sb2.append(this.color);
                sb2.append(", name=");
                return C22026a.c(sb2, this.name, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.color);
                parcel.writeString(this.name);
            }
        }

        /* compiled from: RightIcons.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                LocalIcon localIconCreateFromParcel = LocalIcon.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Default.class, parcel, arrayList, iL2, 1);
                }
                return new Default(localIconCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Default(@Y61.k LocalIcon localIcon, @Y61.k List<? extends BeduinAction> list) {
            this.icon = localIcon;
            this.onTapActions = list;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final LocalIcon getIcon() {
            return this.icon;
        }

        @Y61.k
        public final List<BeduinAction> d() {
            return this.onTapActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r52 = (Default) obj;
            return L.f(this.icon, r52.icon) && L.f(this.onTapActions, r52.onTapActions);
        }

        public final int hashCode() {
            return this.onTapActions.hashCode() + (this.icon.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Default(icon=");
            sb2.append(this.icon);
            sb2.append(", onTapActions=");
            return H.p(sb2, this.onTapActions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.icon.writeToParcel(parcel, i12);
            Iterator itJ = C0.j(this.onTapActions, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }
    }

    /* compiled from: RightIcons.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u0003\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/RightIcons$Favorite;", "Lcom/avito/android/beduin/common/component/cart_item/RightIcons;", "", "isFavorite", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onFavoriteTapActions", "onNotFavoriteTapActions", "<init>", "(ZLjava/util/List;Ljava/util/List;)V", "Z", "()Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Favorite implements RightIcons {

        @Y61.k
        public static final Parcelable.Creator<Favorite> CREATOR = new a();

        @com.google.gson.annotations.c("isFavorite")
        private final boolean isFavorite;

        @com.google.gson.annotations.c("onFavoriteTapActions")
        @Y61.k
        private final List<BeduinAction> onFavoriteTapActions;

        @com.google.gson.annotations.c("onNotFavoriteTapActions")
        @Y61.k
        private final List<BeduinAction> onNotFavoriteTapActions;

        /* compiled from: RightIcons.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Favorite> {
            @Override // android.os.Parcelable.Creator
            public final Favorite createFromParcel(Parcel parcel) {
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(Favorite.class, parcel, arrayList, iL3, 1);
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(Favorite.class, parcel, arrayList2, iL2, 1);
                }
                return new Favorite(z12, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Favorite[] newArray(int i12) {
                return new Favorite[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Favorite(boolean z12, @Y61.k List<? extends BeduinAction> list, @Y61.k List<? extends BeduinAction> list2) {
            this.isFavorite = z12;
            this.onFavoriteTapActions = list;
            this.onNotFavoriteTapActions = list2;
        }

        public static Favorite a(Favorite favorite, boolean z12) {
            List<BeduinAction> list = favorite.onFavoriteTapActions;
            List<BeduinAction> list2 = favorite.onNotFavoriteTapActions;
            favorite.getClass();
            return new Favorite(z12, list, list2);
        }

        @Y61.k
        public final List<BeduinAction> c() {
            return this.onFavoriteTapActions;
        }

        @Y61.k
        public final List<BeduinAction> d() {
            return this.onNotFavoriteTapActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Favorite)) {
                return false;
            }
            Favorite favorite = (Favorite) obj;
            return this.isFavorite == favorite.isFavorite && L.f(this.onFavoriteTapActions, favorite.onFavoriteTapActions) && L.f(this.onNotFavoriteTapActions, favorite.onNotFavoriteTapActions);
        }

        public final int hashCode() {
            return this.onNotFavoriteTapActions.hashCode() + H.e(Boolean.hashCode(this.isFavorite) * 31, 31, this.onFavoriteTapActions);
        }

        /* renamed from: isFavorite, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Favorite(isFavorite=");
            sb2.append(this.isFavorite);
            sb2.append(", onFavoriteTapActions=");
            sb2.append(this.onFavoriteTapActions);
            sb2.append(", onNotFavoriteTapActions=");
            return H.p(sb2, this.onNotFavoriteTapActions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.isFavorite ? 1 : 0);
            Iterator itJ = C0.j(this.onFavoriteTapActions, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            Iterator itJ2 = C0.j(this.onNotFavoriteTapActions, parcel);
            while (itJ2.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ2.next(), i12);
            }
        }
    }
}
