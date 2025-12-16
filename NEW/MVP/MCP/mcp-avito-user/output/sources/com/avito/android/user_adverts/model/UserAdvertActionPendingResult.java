package com.avito.android.user_adverts.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.common.C23088b;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertActionPendingResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult;", "Landroid/os/Parcelable;", "Advert", "Block", "Failure", "Info", "Ok", "Redirect", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Failure;", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Info;", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Ok;", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Redirect;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertActionPendingResult extends Parcelable {

    /* compiled from: UserAdvertActionPendingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Advert;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Advert implements Parcelable {

        @k
        public static final Parcelable.Creator<Advert> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312151b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f312152c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f312153d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f312154e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final AttributedText f312155f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final AdvertImage f312156g;

        /* compiled from: UserAdvertActionPendingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Advert> {
            @Override // android.os.Parcelable.Creator
            public final Advert createFromParcel(Parcel parcel) {
                return new Advert(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Advert.class.getClassLoader()), (AdvertImage) parcel.readParcelable(Advert.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Advert[] newArray(int i12) {
                return new Advert[i12];
            }
        }

        public Advert(@k String str, @l String str2, @k String str3, @l String str4, @k AttributedText attributedText, @l AdvertImage advertImage) {
            this.f312151b = str;
            this.f312152c = str2;
            this.f312153d = str3;
            this.f312154e = str4;
            this.f312155f = attributedText;
            this.f312156g = advertImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Advert)) {
                return false;
            }
            Advert advert = (Advert) obj;
            return L.f(this.f312151b, advert.f312151b) && L.f(this.f312152c, advert.f312152c) && L.f(this.f312153d, advert.f312153d) && L.f(this.f312154e, advert.f312154e) && L.f(this.f312155f, advert.f312155f) && L.f(this.f312156g, advert.f312156g);
        }

        public final int hashCode() {
            int iHashCode = this.f312151b.hashCode() * 31;
            String str = this.f312152c;
            int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f312153d);
            String str2 = this.f312154e;
            int iB2 = com.avito.android.actions_sheet.a.b((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f312155f);
            AdvertImage advertImage = this.f312156g;
            return iB2 + (advertImage != null ? advertImage.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Advert(id=" + this.f312151b + ", shortcut=" + this.f312152c + ", title=" + this.f312153d + ", price=" + this.f312154e + ", failureReason=" + this.f312155f + ", images=" + this.f312156g + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312151b);
            parcel.writeString(this.f312152c);
            parcel.writeString(this.f312153d);
            parcel.writeString(this.f312154e);
            parcel.writeParcelable(this.f312155f, i12);
            parcel.writeParcelable(this.f312156g, i12);
        }
    }

    /* compiled from: UserAdvertActionPendingResult.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Block;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Block implements Parcelable {

        @k
        public static final Parcelable.Creator<Block> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312157b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f312158c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f312159d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Object f312160e;

        /* compiled from: UserAdvertActionPendingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Block> {
            @Override // android.os.Parcelable.Creator
            public final Block createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Block.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Advert.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Block(attributedText, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Block[] newArray(int i12) {
                return new Block[i12];
            }
        }

        public Block(@l AttributedText attributedText, @k String str, @l ArrayList arrayList) {
            Collection linkedHashSet;
            this.f312157b = str;
            this.f312158c = attributedText;
            this.f312159d = arrayList;
            if (arrayList != null) {
                linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((Advert) it.next()).f312151b);
                }
            } else {
                linkedHashSet = null;
            }
            this.f312160e = linkedHashSet == null ? B0.f406639b : linkedHashSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Block)) {
                return false;
            }
            Block block = (Block) obj;
            return L.f(this.f312157b, block.f312157b) && L.f(this.f312158c, block.f312158c) && L.f(this.f312159d, block.f312159d);
        }

        public final int hashCode() {
            int iHashCode = this.f312157b.hashCode() * 31;
            AttributedText attributedText = this.f312158c;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            ArrayList arrayList = this.f312159d;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Block(title=");
            sb2.append(this.f312157b);
            sb2.append(", description=");
            sb2.append(this.f312158c);
            sb2.append(", adverts=");
            return e.p(sb2, this.f312159d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312157b);
            parcel.writeParcelable(this.f312158c, i12);
            ArrayList arrayList = this.f312159d;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((Advert) itY.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertActionPendingResult.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Failure;", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Failure implements UserAdvertActionPendingResult {

        @k
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312161b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f312162c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Object f312163d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Set<String> f312164e;

        /* compiled from: UserAdvertActionPendingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failure> {
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(parcel.readParcelable(Failure.class.getClassLoader()), UserAdvertsGroupInfo.CREATOR.createFromParcel(parcel));
                }
                return new Failure(string, string2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i12) {
                return new Failure[i12];
            }
        }

        public Failure(@k String str, @k String str2, @k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map) {
            this.f312161b = str;
            this.f312162c = str2;
            this.f312163d = map;
            Collection<UserAdvertsGroupInfo> collectionValues = map.values();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                C42745f0.h(((UserAdvertsGroupInfo) it.next()).f312184b, arrayList);
            }
            this.f312164e = C42745f0.P0(arrayList);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return L.f(this.f312161b, failure.f312161b) && L.f(this.f312162c, failure.f312162c) && this.f312163d.equals(failure.f312163d);
        }

        public final int hashCode() {
            return this.f312163d.hashCode() + H.d(this.f312161b.hashCode() * 31, 31, this.f312162c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Failure(currentShortcut=");
            sb2.append(this.f312161b);
            sb2.append(", message=");
            sb2.append(this.f312162c);
            sb2.append(", failedAdvertsGroupInfo=");
            return H.n(sb2, this.f312163d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312161b);
            parcel.writeString(this.f312162c);
            Iterator itO = f.o(this.f312163d, parcel);
            while (itO.hasNext()) {
                Map.Entry entry = (Map.Entry) itO.next();
                parcel.writeParcelable((Parcelable) entry.getKey(), i12);
                ((UserAdvertsGroupInfo) entry.getValue()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertActionPendingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Info;", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Info implements UserAdvertActionPendingResult {

        @k
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312165b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f312166c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Block f312167d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Block f312168e;

        /* compiled from: UserAdvertActionPendingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Info> {
            @Override // android.os.Parcelable.Creator
            public final Info createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(parcel.readParcelable(Info.class.getClassLoader()), UserAdvertsGroupInfo.CREATOR.createFromParcel(parcel));
                }
                return new Info(string, linkedHashMap, parcel.readInt() == 0 ? null : Block.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Block.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Info[] newArray(int i12) {
                return new Info[i12];
            }
        }

        public Info(@k String str, @k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map, @l Block block, @l Block block2) {
            this.f312165b = str;
            this.f312166c = map;
            this.f312167d = block;
            this.f312168e = block2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return L.f(this.f312165b, info.f312165b) && this.f312166c.equals(info.f312166c) && L.f(this.f312167d, info.f312167d) && L.f(this.f312168e, info.f312168e);
        }

        public final int hashCode() {
            int iA2 = C23088b.a(this.f312165b.hashCode() * 31, 31, this.f312166c);
            Block block = this.f312167d;
            int iHashCode = (iA2 + (block == null ? 0 : block.hashCode())) * 31;
            Block block2 = this.f312168e;
            return iHashCode + (block2 != null ? block2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Info(currentShortcut=" + this.f312165b + ", failedAdvertsGroupInfo=" + this.f312166c + ", successBlock=" + this.f312167d + ", failureBlock=" + this.f312168e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312165b);
            Iterator itO = f.o(this.f312166c, parcel);
            while (itO.hasNext()) {
                Map.Entry entry = (Map.Entry) itO.next();
                parcel.writeParcelable((Parcelable) entry.getKey(), i12);
                ((UserAdvertsGroupInfo) entry.getValue()).writeToParcel(parcel, i12);
            }
            Block block = this.f312167d;
            if (block == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                block.writeToParcel(parcel, i12);
            }
            Block block2 = this.f312168e;
            if (block2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                block2.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertActionPendingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Ok;", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ok implements UserAdvertActionPendingResult {

        @k
        public static final Parcelable.Creator<Ok> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312169b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f312170c;

        /* compiled from: UserAdvertActionPendingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Ok> {
            @Override // android.os.Parcelable.Creator
            public final Ok createFromParcel(Parcel parcel) {
                return new Ok(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Ok[] newArray(int i12) {
                return new Ok[i12];
            }
        }

        public Ok(@k String str, @k String str2) {
            this.f312169b = str;
            this.f312170c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ok)) {
                return false;
            }
            Ok ok2 = (Ok) obj;
            return L.f(this.f312169b, ok2.f312169b) && L.f(this.f312170c, ok2.f312170c);
        }

        public final int hashCode() {
            return this.f312170c.hashCode() + (this.f312169b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Ok(currentShortcut=");
            sb2.append(this.f312169b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f312170c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312169b);
            parcel.writeString(this.f312170c);
        }
    }

    /* compiled from: UserAdvertActionPendingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult$Redirect;", "Lcom/avito/android/user_adverts/model/UserAdvertActionPendingResult;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Redirect implements UserAdvertActionPendingResult {

        @k
        public static final Parcelable.Creator<Redirect> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f312171b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f312172c;

        /* compiled from: UserAdvertActionPendingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Redirect> {
            @Override // android.os.Parcelable.Creator
            public final Redirect createFromParcel(Parcel parcel) {
                return new Redirect(parcel.readString(), (DeepLink) parcel.readParcelable(Redirect.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Redirect[] newArray(int i12) {
                return new Redirect[i12];
            }
        }

        public Redirect(@k String str, @k DeepLink deepLink) {
            this.f312171b = str;
            this.f312172c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return L.f(this.f312171b, redirect.f312171b) && L.f(this.f312172c, redirect.f312172c);
        }

        public final int hashCode() {
            return this.f312172c.hashCode() + (this.f312171b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Redirect(currentShortcut=");
            sb2.append(this.f312171b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f312172c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f312171b);
            parcel.writeParcelable(this.f312172c, i12);
        }
    }
}
