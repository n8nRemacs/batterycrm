package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.serp.MiniMenuItemWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Shortcuts.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0002 !B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/Shortcuts;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/Action;", "list", "Lcom/avito/android/remote/model/Shortcuts$ListPresentationType;", "listPresentation", "Lcom/avito/android/remote/model/serp/MiniMenuItemWidget;", "miniMenuItems", "Lcom/avito/android/remote/model/Shortcuts$Header;", "header", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/Shortcuts$ListPresentationType;Ljava/util/List;Lcom/avito/android/remote/model/Shortcuts$Header;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Shortcuts$ListPresentationType;", "getListPresentation", "()Lcom/avito/android/remote/model/Shortcuts$ListPresentationType;", "getMiniMenuItems", "Lcom/avito/android/remote/model/Shortcuts$Header;", "getHeader", "()Lcom/avito/android/remote/model/Shortcuts$Header;", "Header", "ListPresentationType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Shortcuts implements Parcelable {

    @k
    public static final Parcelable.Creator<Shortcuts> CREATOR = new Creator();

    @c("header")
    @l
    private final Header header;

    @c("list")
    @l
    private final List<Action> list;

    @c("listPresentation")
    @l
    private final ListPresentationType listPresentation;

    @c("servicesMenu")
    @l
    private final List<MiniMenuItemWidget> miniMenuItems;

    /* compiled from: Shortcuts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Shortcuts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Shortcuts createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(Shortcuts.class, parcel, arrayList, iL2, 1);
                }
            }
            ListPresentationType listPresentationTypeCreateFromParcel = parcel.readInt() == 0 ? null : ListPresentationType.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(MiniMenuItemWidget.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new Shortcuts(arrayList, listPresentationTypeCreateFromParcel, arrayList2, parcel.readInt() != 0 ? Header.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Shortcuts[] newArray(int i12) {
            return new Shortcuts[i12];
        }
    }

    /* compiled from: Shortcuts.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/Shortcuts$Header;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "resetAction", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getResetAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Header implements Parcelable {

        @k
        public static final Parcelable.Creator<Header> CREATOR = new Creator();

        @c("resetAction")
        @l
        private final DeepLink resetAction;

        @c("title")
        @k
        private final String title;

        /* compiled from: Shortcuts.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Header> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Header createFromParcel(@k Parcel parcel) {
                return new Header(parcel.readString(), (DeepLink) parcel.readParcelable(Header.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Header[] newArray(int i12) {
                return new Header[i12];
            }
        }

        public Header(@k String str, @l DeepLink deepLink) {
            this.title = str;
            this.resetAction = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getResetAction() {
            return this.resetAction;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.resetAction, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Shortcuts.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/Shortcuts$ListPresentationType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "NO_MAIN_RECS_V1", "REDESIGN_V1", "REDESIGN_TINY_BTN", "REDESIGN_SMALL_BTN", "REDESIGN_FIRST_ALL_CAT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ListPresentationType implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ListPresentationType[] $VALUES;

        @k
        public static final Parcelable.Creator<ListPresentationType> CREATOR;

        @c("no_main_recs_v1")
        public static final ListPresentationType NO_MAIN_RECS_V1 = new ListPresentationType("NO_MAIN_RECS_V1", 0);

        @c("redesign_v1")
        public static final ListPresentationType REDESIGN_V1 = new ListPresentationType("REDESIGN_V1", 1);

        @c("redesign_v2_small_btn")
        public static final ListPresentationType REDESIGN_TINY_BTN = new ListPresentationType("REDESIGN_TINY_BTN", 2);

        @c("redesign_v2_small_btn_text")
        public static final ListPresentationType REDESIGN_SMALL_BTN = new ListPresentationType("REDESIGN_SMALL_BTN", 3);

        @c("redesign_v2_scroll")
        public static final ListPresentationType REDESIGN_FIRST_ALL_CAT = new ListPresentationType("REDESIGN_FIRST_ALL_CAT", 4);

        /* compiled from: Shortcuts.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ListPresentationType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ListPresentationType createFromParcel(@k Parcel parcel) {
                return ListPresentationType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ListPresentationType[] newArray(int i12) {
                return new ListPresentationType[i12];
            }
        }

        private static final /* synthetic */ ListPresentationType[] $values() {
            return new ListPresentationType[]{NO_MAIN_RECS_V1, REDESIGN_V1, REDESIGN_TINY_BTN, REDESIGN_SMALL_BTN, REDESIGN_FIRST_ALL_CAT};
        }

        static {
            ListPresentationType[] listPresentationTypeArr$values = $values();
            $VALUES = listPresentationTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(listPresentationTypeArr$values);
            CREATOR = new Creator();
        }

        private ListPresentationType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ListPresentationType> getEntries() {
            return $ENTRIES;
        }

        public static ListPresentationType valueOf(String str) {
            return (ListPresentationType) Enum.valueOf(ListPresentationType.class, str);
        }

        public static ListPresentationType[] values() {
            return (ListPresentationType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    public Shortcuts(@l List<Action> list, @l ListPresentationType listPresentationType, @l List<MiniMenuItemWidget> list2, @l Header header) {
        this.list = list;
        this.listPresentation = listPresentationType;
        this.miniMenuItems = list2;
        this.header = header;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Header getHeader() {
        return this.header;
    }

    @l
    public final List<Action> getList() {
        return this.list;
    }

    @l
    public final ListPresentationType getListPresentation() {
        return this.listPresentation;
    }

    @l
    public final List<MiniMenuItemWidget> getMiniMenuItems() {
        return this.miniMenuItems;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<Action> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ListPresentationType listPresentationType = this.listPresentation;
        if (listPresentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            listPresentationType.writeToParcel(parcel, flags);
        }
        List<MiniMenuItemWidget> list2 = this.miniMenuItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((MiniMenuItemWidget) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        Header header = this.header;
        if (header == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            header.writeToParcel(parcel, flags);
        }
    }
}
