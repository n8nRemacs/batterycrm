package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.model.Path;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OpenOptionSelectorAction.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u001b\u001c\u001d\u001e\u001f B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ResultReceiver;", "resultReceiver", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings;", "screenSettings", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$PreselectedOptionIdProvider;", "preselectedOptionIdProvider", "", "onOptionSelectedActions", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$Option;", "options", "<init>", "(Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ResultReceiver;Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings;Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$PreselectedOptionIdProvider;Ljava/util/List;Ljava/util/List;)V", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ResultReceiver;", "f", "()Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ResultReceiver;", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings;", "g", "()Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings;", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$PreselectedOptionIdProvider;", "e", "()Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$PreselectedOptionIdProvider;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "ClearSelected", "a", "Option", "PreselectedOptionIdProvider", "ResultReceiver", "ScreenSettings", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OpenOptionSelectorAction implements BeduinAction {

    @com.google.gson.annotations.c("onOptionSelectedActions")
    @l
    private final List<BeduinAction> onOptionSelectedActions;

    @com.google.gson.annotations.c("options")
    @Y61.k
    private final List<Option> options;

    @com.google.gson.annotations.c("preselectedOptionIdProvider")
    @l
    private final PreselectedOptionIdProvider preselectedOptionIdProvider;

    @com.google.gson.annotations.c("resultReceiver")
    @Y61.k
    private final ResultReceiver resultReceiver;

    @com.google.gson.annotations.c("screenSettings")
    @Y61.k
    private final ScreenSettings screenSettings;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f100035b = new a(null);

    @Y61.k
    public static final Parcelable.Creator<OpenOptionSelectorAction> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f100036c = "openOptionSelector";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Class<OpenOptionSelectorAction> f100037d = OpenOptionSelectorAction.class;

    /* compiled from: OpenOptionSelectorAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ClearSelected;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onClearedActions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearSelected implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ClearSelected> CREATOR = new a();

        @com.google.gson.annotations.c("onClearedActions")
        @l
        private final List<BeduinAction> onClearedActions;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* compiled from: OpenOptionSelectorAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClearSelected> {
            @Override // android.os.Parcelable.Creator
            public final ClearSelected createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(ClearSelected.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ClearSelected(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ClearSelected[] newArray(int i12) {
                return new ClearSelected[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ClearSelected(@Y61.k String str, @l List<? extends BeduinAction> list) {
            this.title = str;
            this.onClearedActions = list;
        }

        @l
        public final List<BeduinAction> c() {
            return this.onClearedActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClearSelected)) {
                return false;
            }
            ClearSelected clearSelected = (ClearSelected) obj;
            return L.f(this.title, clearSelected.title) && L.f(this.onClearedActions, clearSelected.onClearedActions);
        }

        @Y61.k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            List<BeduinAction> list = this.onClearedActions;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClearSelected(title=");
            sb2.append(this.title);
            sb2.append(", onClearedActions=");
            return H.p(sb2, this.onClearedActions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            List<BeduinAction> list = this.onClearedActions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: OpenOptionSelectorAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R-\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$Option;", "Landroid/os/Parcelable;", "", "id", "title", "callerTitle", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectedActions", "", "", "LK51/e;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        @com.google.gson.annotations.c("callerTitle")
        @l
        private final String callerTitle;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("onSelectedActions")
        @l
        private final List<BeduinAction> onSelectedActions;

        @com.google.gson.annotations.c("params")
        @l
        private final Map<String, Object> params;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* compiled from: OpenOptionSelectorAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Option.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                if (parcel.readInt() != 0) {
                    int i13 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                    int iC2 = 0;
                    while (iC2 != i13) {
                        iC2 = org.webrtc.h.c(Option.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Option(string, string2, string3, arrayList, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Option(@Y61.k String str, @Y61.k String str2, @l String str3, @l List<? extends BeduinAction> list, @l Map<String, ? extends Object> map) {
            this.id = str;
            this.title = str2;
            this.callerTitle = str3;
            this.onSelectedActions = list;
            this.params = map;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getCallerTitle() {
            return this.callerTitle;
        }

        @l
        public final List<BeduinAction> d() {
            return this.onSelectedActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.id, option.id) && L.f(this.title, option.title) && L.f(this.callerTitle, option.callerTitle) && L.f(this.onSelectedActions, option.onSelectedActions) && L.f(this.params, option.params);
        }

        @Y61.k
        public final String getId() {
            return this.id;
        }

        @l
        public final Map<String, Object> getParams() {
            return this.params;
        }

        @Y61.k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
            String str = this.callerTitle;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            List<BeduinAction> list = this.onSelectedActions;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Map<String, Object> map = this.params;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", callerTitle=");
            sb2.append(this.callerTitle);
            sb2.append(", onSelectedActions=");
            sb2.append(this.onSelectedActions);
            sb2.append(", params=");
            return r.w(sb2, this.params, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.callerTitle);
            List<BeduinAction> list = this.onSelectedActions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            Map<String, Object> map = this.params;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
    }

    /* compiled from: OpenOptionSelectorAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$PreselectedOptionIdProvider;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/model/Path;", "path", "<init>", "(Ljava/util/List;Lkotlin/jvm/internal/w;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PreselectedOptionIdProvider implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PreselectedOptionIdProvider> CREATOR = new a();

        @com.google.gson.annotations.c("path")
        @l
        private final List<? extends String> path;

        /* compiled from: OpenOptionSelectorAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PreselectedOptionIdProvider> {
            @Override // android.os.Parcelable.Creator
            public final PreselectedOptionIdProvider createFromParcel(Parcel parcel) {
                C42822w c42822w = null;
                Path pathCreateFromParcel = parcel.readInt() == 0 ? null : Path.CREATOR.createFromParcel(parcel);
                return new PreselectedOptionIdProvider(pathCreateFromParcel != null ? pathCreateFromParcel.f101776b : null, c42822w);
            }

            @Override // android.os.Parcelable.Creator
            public final PreselectedOptionIdProvider[] newArray(int i12) {
                return new PreselectedOptionIdProvider[i12];
            }
        }

        public /* synthetic */ PreselectedOptionIdProvider(List list, C42822w c42822w) {
            this(list);
        }

        @l
        public final List<? extends String> c() {
            return this.path;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(@Y61.l java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.avito.android.beduin.common.action.OpenOptionSelectorAction.PreselectedOptionIdProvider
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.avito.android.beduin.common.action.OpenOptionSelectorAction$PreselectedOptionIdProvider r5 = (com.avito.android.beduin.common.action.OpenOptionSelectorAction.PreselectedOptionIdProvider) r5
                java.util.List<? extends java.lang.String> r1 = r4.path
                java.util.List<? extends java.lang.String> r5 = r5.path
                if (r1 != 0) goto L18
                if (r5 != 0) goto L16
                r5 = r0
                goto L21
            L16:
                r5 = r2
                goto L21
            L18:
                if (r5 != 0) goto L1b
                goto L16
            L1b:
                android.os.Parcelable$Creator<com.avito.android.beduin.common.component.model.Path> r3 = com.avito.android.beduin.common.component.model.Path.CREATOR
                boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
            L21:
                if (r5 != 0) goto L24
                return r2
            L24:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.action.OpenOptionSelectorAction.PreselectedOptionIdProvider.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            List<? extends String> list = this.path;
            if (list == null) {
                return 0;
            }
            Parcelable.Creator<Path> creator = Path.CREATOR;
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PreselectedOptionIdProvider(path=");
            List<? extends String> list = this.path;
            sb2.append((Object) (list == null ? "null" : Path.b(list)));
            sb2.append(')');
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            List<? extends String> list = this.path;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            Parcelable.Creator<Path> creator = Path.CREATOR;
            parcel.writeStringList(list);
        }

        private PreselectedOptionIdProvider(List<? extends String> list) {
            this.path = list;
        }
    }

    /* compiled from: OpenOptionSelectorAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ResultReceiver;", "Landroid/os/Parcelable;", "", "", "modelIds", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResultReceiver implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

        @com.google.gson.annotations.c("modelIds")
        @Y61.k
        private final List<String> modelIds;

        /* compiled from: OpenOptionSelectorAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ResultReceiver> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiver createFromParcel(Parcel parcel) {
                return new ResultReceiver(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiver[] newArray(int i12) {
                return new ResultReceiver[i12];
            }
        }

        public ResultReceiver(@Y61.k List<String> list) {
            this.modelIds = list;
        }

        @Y61.k
        public final List<String> c() {
            return this.modelIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResultReceiver) && L.f(this.modelIds, ((ResultReceiver) obj).modelIds);
        }

        public final int hashCode() {
            return this.modelIds.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("ResultReceiver(modelIds="), this.modelIds, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeStringList(this.modelIds);
        }
    }

    /* compiled from: OpenOptionSelectorAction.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings$SelectorStyle;", "selectorStyle", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ClearSelected;", "clearSelected", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings$SelectorStyle;Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ClearSelected;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "e", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings$SelectorStyle;", "d", "()Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings$SelectorStyle;", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ClearSelected;", "c", "()Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ClearSelected;", "SelectorStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ScreenSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ScreenSettings> CREATOR = new a();

        @com.google.gson.annotations.c("clearSelected")
        @l
        private final ClearSelected clearSelected;

        @com.google.gson.annotations.c("selectorStyle")
        @Y61.k
        private final SelectorStyle selectorStyle;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
        @l
        private final BeduinComponentTheme theme;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OpenOptionSelectorAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$ScreenSettings$SelectorStyle;", "", "(Ljava/lang/String;I)V", "LARGE_TITLE", "COMPACT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SelectorStyle {

            @com.google.gson.annotations.c("bottomSheetCompact")
            public static final SelectorStyle COMPACT;

            @com.google.gson.annotations.c("bottomSheetLargeTitle")
            public static final SelectorStyle LARGE_TITLE;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SelectorStyle[] f100039b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f100040c;

            static {
                SelectorStyle selectorStyle = new SelectorStyle("LARGE_TITLE", 0);
                LARGE_TITLE = selectorStyle;
                SelectorStyle selectorStyle2 = new SelectorStyle("COMPACT", 1);
                COMPACT = selectorStyle2;
                SelectorStyle[] selectorStyleArr = {selectorStyle, selectorStyle2};
                f100039b = selectorStyleArr;
                f100040c = kotlin.enums.c.a(selectorStyleArr);
            }

            private SelectorStyle(String str, int i12) {
            }

            public static SelectorStyle valueOf(String str) {
                return (SelectorStyle) Enum.valueOf(SelectorStyle.class, str);
            }

            public static SelectorStyle[] values() {
                return (SelectorStyle[]) f100039b.clone();
            }
        }

        /* compiled from: OpenOptionSelectorAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ScreenSettings> {
            @Override // android.os.Parcelable.Creator
            public final ScreenSettings createFromParcel(Parcel parcel) {
                return new ScreenSettings(parcel.readString(), parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), SelectorStyle.valueOf(parcel.readString()), parcel.readInt() != 0 ? ClearSelected.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final ScreenSettings[] newArray(int i12) {
                return new ScreenSettings[i12];
            }
        }

        public ScreenSettings(@Y61.k String str, @l BeduinComponentTheme beduinComponentTheme, @Y61.k SelectorStyle selectorStyle, @l ClearSelected clearSelected) {
            this.title = str;
            this.theme = beduinComponentTheme;
            this.selectorStyle = selectorStyle;
            this.clearSelected = clearSelected;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final ClearSelected getClearSelected() {
            return this.clearSelected;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final SelectorStyle getSelectorStyle() {
            return this.selectorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final BeduinComponentTheme getTheme() {
            return this.theme;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenSettings)) {
                return false;
            }
            ScreenSettings screenSettings = (ScreenSettings) obj;
            return L.f(this.title, screenSettings.title) && this.theme == screenSettings.theme && this.selectorStyle == screenSettings.selectorStyle && L.f(this.clearSelected, screenSettings.clearSelected);
        }

        @Y61.k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            BeduinComponentTheme beduinComponentTheme = this.theme;
            int iHashCode2 = (this.selectorStyle.hashCode() + ((iHashCode + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31)) * 31;
            ClearSelected clearSelected = this.clearSelected;
            return iHashCode2 + (clearSelected != null ? clearSelected.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ScreenSettings(title=" + this.title + ", theme=" + this.theme + ", selectorStyle=" + this.selectorStyle + ", clearSelected=" + this.clearSelected + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            BeduinComponentTheme beduinComponentTheme = this.theme;
            if (beduinComponentTheme == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                beduinComponentTheme.writeToParcel(parcel, i12);
            }
            parcel.writeString(this.selectorStyle.name());
            ClearSelected clearSelected = this.clearSelected;
            if (clearSelected == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clearSelected.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: OpenOptionSelectorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15524c {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<OpenOptionSelectorAction> getAction() {
            return OpenOptionSelectorAction.f100037d;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF100007c() {
            return OpenOptionSelectorAction.f100036c;
        }

        public a() {
        }
    }

    /* compiled from: OpenOptionSelectorAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<OpenOptionSelectorAction> {
        @Override // android.os.Parcelable.Creator
        public final OpenOptionSelectorAction createFromParcel(Parcel parcel) {
            ResultReceiver resultReceiverCreateFromParcel = ResultReceiver.CREATOR.createFromParcel(parcel);
            ScreenSettings screenSettingsCreateFromParcel = ScreenSettings.CREATOR.createFromParcel(parcel);
            ArrayList arrayList = null;
            PreselectedOptionIdProvider preselectedOptionIdProviderCreateFromParcel = parcel.readInt() == 0 ? null : PreselectedOptionIdProvider.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(OpenOptionSelectorAction.class, parcel, arrayList, iL2, 1);
                }
            }
            ArrayList arrayList2 = arrayList;
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList3, iC2, 1);
            }
            return new OpenOptionSelectorAction(resultReceiverCreateFromParcel, screenSettingsCreateFromParcel, preselectedOptionIdProviderCreateFromParcel, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final OpenOptionSelectorAction[] newArray(int i12) {
            return new OpenOptionSelectorAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenOptionSelectorAction(@Y61.k ResultReceiver resultReceiver, @Y61.k ScreenSettings screenSettings, @l PreselectedOptionIdProvider preselectedOptionIdProvider, @l List<? extends BeduinAction> list, @Y61.k List<Option> list2) {
        this.resultReceiver = resultReceiver;
        this.screenSettings = screenSettings;
        this.preselectedOptionIdProvider = preselectedOptionIdProvider;
        this.onOptionSelectedActions = list;
        this.options = list2;
    }

    @l
    public final List<BeduinAction> c() {
        return this.onOptionSelectedActions;
    }

    @Y61.k
    public final List<Option> d() {
        return this.options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final PreselectedOptionIdProvider getPreselectedOptionIdProvider() {
        return this.preselectedOptionIdProvider;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOptionSelectorAction)) {
            return false;
        }
        OpenOptionSelectorAction openOptionSelectorAction = (OpenOptionSelectorAction) obj;
        return L.f(this.resultReceiver, openOptionSelectorAction.resultReceiver) && L.f(this.screenSettings, openOptionSelectorAction.screenSettings) && L.f(this.preselectedOptionIdProvider, openOptionSelectorAction.preselectedOptionIdProvider) && L.f(this.onOptionSelectedActions, openOptionSelectorAction.onOptionSelectedActions) && L.f(this.options, openOptionSelectorAction.options);
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final ResultReceiver getResultReceiver() {
        return this.resultReceiver;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final ScreenSettings getScreenSettings() {
        return this.screenSettings;
    }

    public final int hashCode() {
        int iHashCode = (this.screenSettings.hashCode() + (this.resultReceiver.hashCode() * 31)) * 31;
        PreselectedOptionIdProvider preselectedOptionIdProvider = this.preselectedOptionIdProvider;
        int iHashCode2 = (iHashCode + (preselectedOptionIdProvider == null ? 0 : preselectedOptionIdProvider.hashCode())) * 31;
        List<BeduinAction> list = this.onOptionSelectedActions;
        return this.options.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenOptionSelectorAction(resultReceiver=");
        sb2.append(this.resultReceiver);
        sb2.append(", screenSettings=");
        sb2.append(this.screenSettings);
        sb2.append(", preselectedOptionIdProvider=");
        sb2.append(this.preselectedOptionIdProvider);
        sb2.append(", onOptionSelectedActions=");
        sb2.append(this.onOptionSelectedActions);
        sb2.append(", options=");
        return H.p(sb2, this.options, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.resultReceiver.writeToParcel(parcel, i12);
        this.screenSettings.writeToParcel(parcel, i12);
        PreselectedOptionIdProvider preselectedOptionIdProvider = this.preselectedOptionIdProvider;
        if (preselectedOptionIdProvider == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preselectedOptionIdProvider.writeToParcel(parcel, i12);
        }
        List<BeduinAction> list = this.onOptionSelectedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
