package com.avito.android.remote.model.adverts.multi_item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiItemModification.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification;", "Landroid/os/Parcelable;", "modificationId", "", "getModificationId", "()Ljava/lang/String;", VoiceInfo.STATE, "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "getState", "()Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "BackgroundColor", "Chips", "Images", "ModificationState", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Chips;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Images;", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MultiItemModification extends Parcelable {

    /* compiled from: MultiItemModification.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$BackgroundColor;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "Lcom/avito/android/remote/model/UniversalColor;", "colors", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/Image;Ljava/util/List;)Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$BackgroundColor;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/util/List;", "getColors", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackgroundColor implements Parcelable {

        @k
        public static final Parcelable.Creator<BackgroundColor> CREATOR = new Creator();

        @c("colors")
        @k
        private final List<UniversalColor> colors;

        @c("image")
        @l
        private final Image image;

        /* compiled from: MultiItemModification.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BackgroundColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackgroundColor createFromParcel(@k Parcel parcel) {
                Image image = (Image) parcel.readParcelable(BackgroundColor.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(BackgroundColor.class, parcel, arrayList, iL2, 1);
                }
                return new BackgroundColor(image, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackgroundColor[] newArray(int i12) {
                return new BackgroundColor[i12];
            }
        }

        public BackgroundColor(@l Image image, @k List<UniversalColor> list) {
            this.image = image;
            this.colors = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BackgroundColor copy$default(BackgroundColor backgroundColor, Image image, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = backgroundColor.image;
            }
            if ((i12 & 2) != 0) {
                list = backgroundColor.colors;
            }
            return backgroundColor.copy(image, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final List<UniversalColor> component2() {
            return this.colors;
        }

        @k
        public final BackgroundColor copy(@l Image image, @k List<UniversalColor> colors) {
            return new BackgroundColor(image, colors);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundColor)) {
                return false;
            }
            BackgroundColor backgroundColor = (BackgroundColor) other;
            return L.f(this.image, backgroundColor.image) && L.f(this.colors, backgroundColor.colors);
        }

        @k
        public final List<UniversalColor> getColors() {
            return this.colors;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        public int hashCode() {
            Image image = this.image;
            return this.colors.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BackgroundColor(image=");
            sb2.append(this.image);
            sb2.append(", colors=");
            return H.p(sb2, this.colors, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            Iterator itJ = C0.j(this.colors, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }

    /* compiled from: MultiItemModification.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010%\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\n¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Chips;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification;", "", "title", "modificationId", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "_state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;)V", "component3", "()Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;)Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Chips;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getModificationId", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "getState", VoiceInfo.STATE, "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Chips implements MultiItemModification {

        @k
        public static final Parcelable.Creator<Chips> CREATOR = new Creator();

        @c(VoiceInfo.STATE)
        @l
        private final ModificationState _state;

        @c("modificationId")
        @k
        private final String modificationId;

        @c("title")
        @k
        private final String title;

        /* compiled from: MultiItemModification.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Chips> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Chips createFromParcel(@k Parcel parcel) {
                return new Chips(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ModificationState.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Chips[] newArray(int i12) {
                return new Chips[i12];
            }
        }

        public Chips(@k String str, @k String str2, @l ModificationState modificationState) {
            this.title = str;
            this.modificationId = str2;
            this._state = modificationState;
        }

        /* renamed from: component3, reason: from getter */
        private final ModificationState get_state() {
            return this._state;
        }

        public static /* synthetic */ Chips copy$default(Chips chips, String str, String str2, ModificationState modificationState, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = chips.title;
            }
            if ((i12 & 2) != 0) {
                str2 = chips.modificationId;
            }
            if ((i12 & 4) != 0) {
                modificationState = chips._state;
            }
            return chips.copy(str, str2, modificationState);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getModificationId() {
            return this.modificationId;
        }

        @k
        public final Chips copy(@k String title, @k String modificationId, @l ModificationState _state) {
            return new Chips(title, modificationId, _state);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Chips)) {
                return false;
            }
            Chips chips = (Chips) other;
            return L.f(this.title, chips.title) && L.f(this.modificationId, chips.modificationId) && this._state == chips._state;
        }

        @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemModification
        @k
        public String getModificationId() {
            return this.modificationId;
        }

        @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemModification
        @k
        public ModificationState getState() {
            ModificationState modificationState = this._state;
            return modificationState == null ? ModificationState.Default : modificationState;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.modificationId);
            ModificationState modificationState = this._state;
            return iD2 + (modificationState == null ? 0 : modificationState.hashCode());
        }

        @k
        public String toString() {
            return "Chips(title=" + this.title + ", modificationId=" + this.modificationId + ", _state=" + this._state + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.modificationId);
            ModificationState modificationState = this._state;
            if (modificationState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(modificationState.name());
            }
        }
    }

    /* compiled from: MultiItemModification.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010.\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\r¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Images;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification;", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$BackgroundColor;", "backgroundColor", "Lcom/avito/android/remote/model/Image;", "image", "", "modificationId", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "_state", "<init>", "(Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$BackgroundColor;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;)V", "component4", "()Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "component1", "()Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$BackgroundColor;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$BackgroundColor;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;)Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$Images;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$BackgroundColor;", "getBackgroundColor", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/lang/String;", "getModificationId", "Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "getState", VoiceInfo.STATE, "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Images implements MultiItemModification {

        @k
        public static final Parcelable.Creator<Images> CREATOR = new Creator();

        @c(VoiceInfo.STATE)
        @l
        private final ModificationState _state;

        @c("backgroundColor")
        @k
        private final BackgroundColor backgroundColor;

        @c("image")
        @k
        private final Image image;

        @c("modificationId")
        @k
        private final String modificationId;

        /* compiled from: MultiItemModification.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Images> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Images createFromParcel(@k Parcel parcel) {
                return new Images(BackgroundColor.CREATOR.createFromParcel(parcel), (Image) parcel.readParcelable(Images.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ModificationState.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Images[] newArray(int i12) {
                return new Images[i12];
            }
        }

        public Images(@k BackgroundColor backgroundColor, @k Image image, @k String str, @l ModificationState modificationState) {
            this.backgroundColor = backgroundColor;
            this.image = image;
            this.modificationId = str;
            this._state = modificationState;
        }

        /* renamed from: component4, reason: from getter */
        private final ModificationState get_state() {
            return this._state;
        }

        public static /* synthetic */ Images copy$default(Images images, BackgroundColor backgroundColor, Image image, String str, ModificationState modificationState, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                backgroundColor = images.backgroundColor;
            }
            if ((i12 & 2) != 0) {
                image = images.image;
            }
            if ((i12 & 4) != 0) {
                str = images.modificationId;
            }
            if ((i12 & 8) != 0) {
                modificationState = images._state;
            }
            return images.copy(backgroundColor, image, str, modificationState);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getModificationId() {
            return this.modificationId;
        }

        @k
        public final Images copy(@k BackgroundColor backgroundColor, @k Image image, @k String modificationId, @l ModificationState _state) {
            return new Images(backgroundColor, image, modificationId, _state);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Images)) {
                return false;
            }
            Images images = (Images) other;
            return L.f(this.backgroundColor, images.backgroundColor) && L.f(this.image, images.image) && L.f(this.modificationId, images.modificationId) && this._state == images._state;
        }

        @k
        public final BackgroundColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemModification
        @k
        public String getModificationId() {
            return this.modificationId;
        }

        @Override // com.avito.android.remote.model.adverts.multi_item.MultiItemModification
        @k
        public ModificationState getState() {
            ModificationState modificationState = this._state;
            return modificationState == null ? ModificationState.Default : modificationState;
        }

        public int hashCode() {
            int iD2 = H.d(a.g(this.image, this.backgroundColor.hashCode() * 31, 31), 31, this.modificationId);
            ModificationState modificationState = this._state;
            return iD2 + (modificationState == null ? 0 : modificationState.hashCode());
        }

        @k
        public String toString() {
            return "Images(backgroundColor=" + this.backgroundColor + ", image=" + this.image + ", modificationId=" + this.modificationId + ", _state=" + this._state + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.backgroundColor.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.modificationId);
            ModificationState modificationState = this._state;
            if (modificationState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(modificationState.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultiItemModification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/adverts/multi_item/MultiItemModification$ModificationState;", "", "(Ljava/lang/String;I)V", "Default", "Selected", "Disabled", "OutOfStocks", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ModificationState {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ModificationState[] $VALUES;

        @c("default")
        public static final ModificationState Default = new ModificationState("Default", 0);

        @c("selected")
        public static final ModificationState Selected = new ModificationState("Selected", 1);

        @c(BeduinCartItemModel.DISABLED_STRING)
        public static final ModificationState Disabled = new ModificationState("Disabled", 2);

        @c("outOfStocks")
        public static final ModificationState OutOfStocks = new ModificationState("OutOfStocks", 3);

        private static final /* synthetic */ ModificationState[] $values() {
            return new ModificationState[]{Default, Selected, Disabled, OutOfStocks};
        }

        static {
            ModificationState[] modificationStateArr$values = $values();
            $VALUES = modificationStateArr$values;
            $ENTRIES = kotlin.enums.c.a(modificationStateArr$values);
        }

        private ModificationState(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ModificationState> getEntries() {
            return $ENTRIES;
        }

        public static ModificationState valueOf(String str) {
            return (ModificationState) Enum.valueOf(ModificationState.class, str);
        }

        public static ModificationState[] values() {
            return (ModificationState[]) $VALUES.clone();
        }
    }

    @k
    String getModificationId();

    @k
    ModificationState getState();
}
