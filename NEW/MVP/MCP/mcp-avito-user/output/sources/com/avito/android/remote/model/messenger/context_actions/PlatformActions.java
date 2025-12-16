package com.avito.android.remote.model.messenger.context_actions;

import K51.d;
import W81.a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: PlatformActions.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0006\u000b\n\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\t\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "LW81/a;", "Landroid/os/Parcelable;", "<init>", "()V", "", "getHideKeyboard", "()Z", PlatformActions.HIDE_KEYBOARD, "isExpandable", "Companion", "Actions", "ExpandableData", "ItemsList", "MultiButtonsData", "None", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$Actions;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ItemsList;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$None;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PlatformActions implements a, Parcelable {

    @k
    public static final String EXPANDABLE = "expandable";

    @k
    public static final String HIDE_KEYBOARD = "hideKeyboard";

    @k
    public static final String MESSAGE_ID = "messageId";

    @k
    public static final String MULTI_BUTTONS = "multiButtons";

    @k
    public static final String PLATFORM_SUPPORT = "platformSupport";

    @k
    public static final String TITLE = "title";

    @k
    public static final String TYPE_KEY = "type";

    @k
    public static final String VALUE = "value";

    @k
    public static final String VERSION = "version";

    /* compiled from: PlatformActions.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "Landroid/os/Parcelable;", "", ExpandableData.TITLE_SHORT, "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;", "cancelHandler", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;)Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitleShort", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;", "getCancelHandler", "Companion", "Provider", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ExpandableData implements Parcelable {

        @k
        public static final String CANCEL_ACTION = "cancelAction";

        @k
        public static final String TITLE_SHORT = "titleShort";

        @l
        private final ContextActionHandler.MethodCall cancelHandler;

        @l
        private final String titleShort;

        @k
        public static final Parcelable.Creator<ExpandableData> CREATOR = new Creator();

        /* compiled from: PlatformActions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExpandableData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ExpandableData createFromParcel(@k Parcel parcel) {
                return new ExpandableData(parcel.readString(), parcel.readInt() == 0 ? null : ContextActionHandler.MethodCall.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ExpandableData[] newArray(int i12) {
                return new ExpandableData[i12];
            }
        }

        /* compiled from: PlatformActions.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData$Provider;", "", "expandableData", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "getExpandableData", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Provider {
            @l
            ExpandableData getExpandableData();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ExpandableData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ExpandableData copy$default(ExpandableData expandableData, String str, ContextActionHandler.MethodCall methodCall, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = expandableData.titleShort;
            }
            if ((i12 & 2) != 0) {
                methodCall = expandableData.cancelHandler;
            }
            return expandableData.copy(str, methodCall);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitleShort() {
            return this.titleShort;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final ContextActionHandler.MethodCall getCancelHandler() {
            return this.cancelHandler;
        }

        @k
        public final ExpandableData copy(@l String titleShort, @l ContextActionHandler.MethodCall cancelHandler) {
            return new ExpandableData(titleShort, cancelHandler);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandableData)) {
                return false;
            }
            ExpandableData expandableData = (ExpandableData) other;
            return L.f(this.titleShort, expandableData.titleShort) && L.f(this.cancelHandler, expandableData.cancelHandler);
        }

        @l
        public final ContextActionHandler.MethodCall getCancelHandler() {
            return this.cancelHandler;
        }

        @l
        public final String getTitleShort() {
            return this.titleShort;
        }

        public int hashCode() {
            String str = this.titleShort;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ContextActionHandler.MethodCall methodCall = this.cancelHandler;
            return iHashCode + (methodCall != null ? methodCall.hashCode() : 0);
        }

        @k
        public String toString() {
            return "ExpandableData(titleShort=" + this.titleShort + ", cancelHandler=" + this.cancelHandler + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.titleShort);
            ContextActionHandler.MethodCall methodCall = this.cancelHandler;
            if (methodCall == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                methodCall.writeToParcel(parcel, flags);
            }
        }

        public ExpandableData(@l String str, @l ContextActionHandler.MethodCall methodCall) {
            this.titleShort = str;
            this.cancelHandler = methodCall;
        }

        public /* synthetic */ ExpandableData(String str, ContextActionHandler.MethodCall methodCall, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : methodCall);
        }
    }

    /* compiled from: PlatformActions.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b4\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001aR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010\u001e¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ItemsList;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData$Provider;", "", "title", "Lcom/avito/android/remote/model/messenger/context_actions/ItemsRequest;", ItemsList.ITEMS_REQUEST, PlatformActions.MESSAGE_ID, "Lcom/avito/android/remote/model/messenger/PlatformSupport;", PlatformActions.PLATFORM_SUPPORT, "", "version", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "expandableData", "", PlatformActions.HIDE_KEYBOARD, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/context_actions/ItemsRequest;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/PlatformSupport;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/messenger/context_actions/ItemsRequest;", "component3", "component4", "()Lcom/avito/android/remote/model/messenger/PlatformSupport;", "component5", "()Ljava/lang/Long;", "component6", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "component7", "()Z", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/messenger/context_actions/ItemsRequest;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/PlatformSupport;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;Z)Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ItemsList;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/messenger/context_actions/ItemsRequest;", "getItemsRequest", "getMessageId", "Lcom/avito/android/remote/model/messenger/PlatformSupport;", "getPlatformSupport", "Ljava/lang/Long;", "getVersion", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "getExpandableData", "Z", "getHideKeyboard", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ItemsList extends PlatformActions implements ExpandableData.Provider {

        @k
        public static final String ITEMS_REQUEST = "itemsRequest";

        @k
        public static final String TYPE = "itemsList";

        @k
        private final ExpandableData expandableData;
        private final boolean hideKeyboard;

        @k
        private final ItemsRequest itemsRequest;

        @l
        private final String messageId;

        @l
        private final PlatformSupport platformSupport;

        @k
        private final String title;

        @l
        private final Long version;

        @k
        public static final Parcelable.Creator<ItemsList> CREATOR = new Creator();

        /* compiled from: PlatformActions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ItemsList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemsList createFromParcel(@k Parcel parcel) {
                return new ItemsList(parcel.readString(), ItemsRequest.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : PlatformSupport.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), ExpandableData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemsList[] newArray(int i12) {
                return new ItemsList[i12];
            }
        }

        public ItemsList(@k String str, @k ItemsRequest itemsRequest, @l String str2, @l PlatformSupport platformSupport, @l Long l12, @k ExpandableData expandableData, boolean z12) {
            super(null);
            this.title = str;
            this.itemsRequest = itemsRequest;
            this.messageId = str2;
            this.platformSupport = platformSupport;
            this.version = l12;
            this.expandableData = expandableData;
            this.hideKeyboard = z12;
        }

        public static /* synthetic */ ItemsList copy$default(ItemsList itemsList, String str, ItemsRequest itemsRequest, String str2, PlatformSupport platformSupport, Long l12, ExpandableData expandableData, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = itemsList.title;
            }
            if ((i12 & 2) != 0) {
                itemsRequest = itemsList.itemsRequest;
            }
            ItemsRequest itemsRequest2 = itemsRequest;
            if ((i12 & 4) != 0) {
                str2 = itemsList.messageId;
            }
            String str3 = str2;
            if ((i12 & 8) != 0) {
                platformSupport = itemsList.platformSupport;
            }
            PlatformSupport platformSupport2 = platformSupport;
            if ((i12 & 16) != 0) {
                l12 = itemsList.version;
            }
            Long l13 = l12;
            if ((i12 & 32) != 0) {
                expandableData = itemsList.expandableData;
            }
            ExpandableData expandableData2 = expandableData;
            if ((i12 & 64) != 0) {
                z12 = itemsList.hideKeyboard;
            }
            return itemsList.copy(str, itemsRequest2, str3, platformSupport2, l13, expandableData2, z12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final ItemsRequest getItemsRequest() {
            return this.itemsRequest;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final PlatformSupport getPlatformSupport() {
            return this.platformSupport;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Long getVersion() {
            return this.version;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final ExpandableData getExpandableData() {
            return this.expandableData;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        @k
        public final ItemsList copy(@k String title, @k ItemsRequest itemsRequest, @l String messageId, @l PlatformSupport platformSupport, @l Long version, @k ExpandableData expandableData, boolean hideKeyboard) {
            return new ItemsList(title, itemsRequest, messageId, platformSupport, version, expandableData, hideKeyboard);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemsList)) {
                return false;
            }
            ItemsList itemsList = (ItemsList) other;
            return L.f(this.title, itemsList.title) && L.f(this.itemsRequest, itemsList.itemsRequest) && L.f(this.messageId, itemsList.messageId) && L.f(this.platformSupport, itemsList.platformSupport) && L.f(this.version, itemsList.version) && L.f(this.expandableData, itemsList.expandableData) && this.hideKeyboard == itemsList.hideKeyboard;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions.ExpandableData.Provider
        @k
        public ExpandableData getExpandableData() {
            return this.expandableData;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        public boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        @k
        public final ItemsRequest getItemsRequest() {
            return this.itemsRequest;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        @l
        public String getMessageId() {
            return this.messageId;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions, W81.a
        @l
        public PlatformSupport getPlatformSupport() {
            return this.platformSupport;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        @l
        public Long getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iHashCode = (this.itemsRequest.hashCode() + (this.title.hashCode() * 31)) * 31;
            String str = this.messageId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PlatformSupport platformSupport = this.platformSupport;
            int iHashCode3 = (iHashCode2 + (platformSupport == null ? 0 : platformSupport.hashCode())) * 31;
            Long l12 = this.version;
            return Boolean.hashCode(this.hideKeyboard) + ((this.expandableData.hashCode() + ((iHashCode3 + (l12 != null ? l12.hashCode() : 0)) * 31)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ItemsList(title=");
            sb2.append(this.title);
            sb2.append(", itemsRequest=");
            sb2.append(this.itemsRequest);
            sb2.append(", messageId=");
            sb2.append(this.messageId);
            sb2.append(", platformSupport=");
            sb2.append(this.platformSupport);
            sb2.append(", version=");
            sb2.append(this.version);
            sb2.append(", expandableData=");
            sb2.append(this.expandableData);
            sb2.append(", hideKeyboard=");
            return r.x(sb2, this.hideKeyboard, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            this.itemsRequest.writeToParcel(parcel, flags);
            parcel.writeString(this.messageId);
            PlatformSupport platformSupport = this.platformSupport;
            if (platformSupport == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                platformSupport.writeToParcel(parcel, flags);
            }
            Long l12 = this.version;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            this.expandableData.writeToParcel(parcel, flags);
            parcel.writeInt(this.hideKeyboard ? 1 : 0);
        }
    }

    /* compiled from: PlatformActions.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Provider", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class MultiButtonsData implements Parcelable {

        @k
        public static final MultiButtonsData INSTANCE = new MultiButtonsData();

        @k
        public static final Parcelable.Creator<MultiButtonsData> CREATOR = new Creator();

        /* compiled from: PlatformActions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiButtonsData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiButtonsData createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return MultiButtonsData.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiButtonsData[] newArray(int i12) {
                return new MultiButtonsData[i12];
            }
        }

        /* compiled from: PlatformActions.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData$Provider;", "", "multiButtonsData", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;", "getMultiButtonsData", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Provider {
            @l
            MultiButtonsData getMultiButtonsData();
        }

        private MultiButtonsData() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PlatformActions.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$None;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "", "version", "<init>", "(Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$None;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getVersion", "getMessageId", PlatformActions.MESSAGE_ID, "Lcom/avito/android/remote/model/messenger/PlatformSupport;", "getPlatformSupport", "()Lcom/avito/android/remote/model/messenger/PlatformSupport;", PlatformActions.PLATFORM_SUPPORT, "getHideKeyboard", "()Z", PlatformActions.HIDE_KEYBOARD, "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class None extends PlatformActions {

        @k
        public static final Parcelable.Creator<None> CREATOR = new Creator();

        @l
        private final Long version;

        /* compiled from: PlatformActions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<None> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final None createFromParcel(@k Parcel parcel) {
                return new None(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final None[] newArray(int i12) {
                return new None[i12];
            }
        }

        public None(@l Long l12) {
            super(null);
            this.version = l12;
        }

        public static /* synthetic */ None copy$default(None none, Long l12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = none.version;
            }
            return none.copy(l12);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getVersion() {
            return this.version;
        }

        @k
        public final None copy(@l Long version) {
            return new None(version);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && L.f(this.version, ((None) other).version);
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        public boolean getHideKeyboard() {
            return false;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        @l
        public String getMessageId() {
            return null;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions, W81.a
        @l
        public PlatformSupport getPlatformSupport() {
            return null;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        @l
        public Long getVersion() {
            return this.version;
        }

        public int hashCode() {
            Long l12 = this.version;
            if (l12 == null) {
                return 0;
            }
            return l12.hashCode();
        }

        @k
        public String toString() {
            return m.m(new StringBuilder("None(version="), this.version, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Long l12 = this.version;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
        }
    }

    public /* synthetic */ PlatformActions(C42822w c42822w) {
        this();
    }

    public abstract boolean getHideKeyboard();

    @l
    public abstract /* synthetic */ String getMessageId();

    @Override // W81.a
    @l
    public abstract /* synthetic */ PlatformSupport getPlatformSupport();

    @l
    public abstract /* synthetic */ Long getVersion();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isExpandable() {
        if (this instanceof ExpandableData.Provider) {
            return (!(this instanceof MultiButtonsData.Provider) || ((MultiButtonsData.Provider) this).getMultiButtonsData() == null) && ((ExpandableData.Provider) this).getExpandableData() != null;
        }
        return false;
    }

    private PlatformActions() {
    }

    /* compiled from: PlatformActions.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HBY\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b#\u0010$Jr\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020(HÖ\u0001¢\u0006\u0004\b/\u0010*J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020(HÖ\u0001¢\u0006\u0004\b4\u00105R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b:\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010 R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010\"R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010$R\u0018\u0010E\u001a\u00020\u00108Æ\u0002¢\u0006\f\u0012\u0004\bF\u0010G\u001a\u0004\bE\u0010\"¨\u0006I"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$Actions;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData$Provider;", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData$Provider;", "", "title", "", "Lcom/avito/android/remote/model/messenger/context_actions/ContextAction;", "actions", PlatformActions.MESSAGE_ID, "Lcom/avito/android/remote/model/messenger/PlatformSupport;", PlatformActions.PLATFORM_SUPPORT, "", "version", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "expandableData", "", PlatformActions.HIDE_KEYBOARD, "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;", "multiButtonsData", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/PlatformSupport;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;ZLcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/remote/model/messenger/PlatformSupport;", "component5", "()Ljava/lang/Long;", "component6", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "component7", "()Z", "component8", "()Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/PlatformSupport;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;ZLcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;)Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$Actions;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getActions", "getMessageId", "Lcom/avito/android/remote/model/messenger/PlatformSupport;", "getPlatformSupport", "Ljava/lang/Long;", "getVersion", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$ExpandableData;", "getExpandableData", "Z", "getHideKeyboard", "Lcom/avito/android/remote/model/messenger/context_actions/PlatformActions$MultiButtonsData;", "getMultiButtonsData", "isEmpty", "isEmpty$annotations", "()V", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Actions extends PlatformActions implements ExpandableData.Provider, MultiButtonsData.Provider {

        @k
        public static final String ACTIONS = "actions";

        @k
        private final List<ContextAction> actions;

        @l
        private final ExpandableData expandableData;
        private final boolean hideKeyboard;

        @l
        private final String messageId;

        @l
        private final MultiButtonsData multiButtonsData;

        @l
        private final PlatformSupport platformSupport;

        @l
        private final String title;

        @l
        private final Long version;

        @k
        public static final Parcelable.Creator<Actions> CREATOR = new Creator();

        /* compiled from: PlatformActions.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Actions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Actions createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ContextAction.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Actions(string, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : PlatformSupport.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : ExpandableData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? MultiButtonsData.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Actions[] newArray(int i12) {
                return new Actions[i12];
            }
        }

        public Actions(@l String str, @k List<ContextAction> list, @l String str2, @l PlatformSupport platformSupport, @l Long l12, @l ExpandableData expandableData, boolean z12, @l MultiButtonsData multiButtonsData) {
            super(null);
            this.title = str;
            this.actions = list;
            this.messageId = str2;
            this.platformSupport = platformSupport;
            this.version = l12;
            this.expandableData = expandableData;
            this.hideKeyboard = z12;
            this.multiButtonsData = multiButtonsData;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<ContextAction> component2() {
            return this.actions;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final PlatformSupport getPlatformSupport() {
            return this.platformSupport;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Long getVersion() {
            return this.version;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final ExpandableData getExpandableData() {
            return this.expandableData;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final MultiButtonsData getMultiButtonsData() {
            return this.multiButtonsData;
        }

        @k
        public final Actions copy(@l String title, @k List<ContextAction> actions, @l String messageId, @l PlatformSupport platformSupport, @l Long version, @l ExpandableData expandableData, boolean hideKeyboard, @l MultiButtonsData multiButtonsData) {
            return new Actions(title, actions, messageId, platformSupport, version, expandableData, hideKeyboard, multiButtonsData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) other;
            return L.f(this.title, actions.title) && L.f(this.actions, actions.actions) && L.f(this.messageId, actions.messageId) && L.f(this.platformSupport, actions.platformSupport) && L.f(this.version, actions.version) && L.f(this.expandableData, actions.expandableData) && this.hideKeyboard == actions.hideKeyboard && L.f(this.multiButtonsData, actions.multiButtonsData);
        }

        @k
        public final List<ContextAction> getActions() {
            return this.actions;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions.ExpandableData.Provider
        @l
        public ExpandableData getExpandableData() {
            return this.expandableData;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        public boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        @l
        public String getMessageId() {
            return this.messageId;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions.MultiButtonsData.Provider
        @l
        public MultiButtonsData getMultiButtonsData() {
            return this.multiButtonsData;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions, W81.a
        @l
        public PlatformSupport getPlatformSupport() {
            return this.platformSupport;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.remote.model.messenger.context_actions.PlatformActions
        @l
        public Long getVersion() {
            return this.version;
        }

        public int hashCode() {
            String str = this.title;
            int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.actions);
            String str2 = this.messageId;
            int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PlatformSupport platformSupport = this.platformSupport;
            int iHashCode2 = (iHashCode + (platformSupport == null ? 0 : platformSupport.hashCode())) * 31;
            Long l12 = this.version;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            ExpandableData expandableData = this.expandableData;
            int i12 = r.i((iHashCode3 + (expandableData == null ? 0 : expandableData.hashCode())) * 31, 31, this.hideKeyboard);
            MultiButtonsData multiButtonsData = this.multiButtonsData;
            return i12 + (multiButtonsData != null ? multiButtonsData.hashCode() : 0);
        }

        public final boolean isEmpty() {
            String title = getTitle();
            return (title == null || C43066x.K(title)) && getActions().isEmpty();
        }

        @k
        public String toString() {
            return "Actions(title=" + this.title + ", actions=" + this.actions + ", messageId=" + this.messageId + ", platformSupport=" + this.platformSupport + ", version=" + this.version + ", expandableData=" + this.expandableData + ", hideKeyboard=" + this.hideKeyboard + ", multiButtonsData=" + this.multiButtonsData + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.actions, parcel);
            while (itJ.hasNext()) {
                ((ContextAction) itJ.next()).writeToParcel(parcel, flags);
            }
            parcel.writeString(this.messageId);
            PlatformSupport platformSupport = this.platformSupport;
            if (platformSupport == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                platformSupport.writeToParcel(parcel, flags);
            }
            Long l12 = this.version;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            ExpandableData expandableData = this.expandableData;
            if (expandableData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expandableData.writeToParcel(parcel, flags);
            }
            parcel.writeInt(this.hideKeyboard ? 1 : 0);
            MultiButtonsData multiButtonsData = this.multiButtonsData;
            if (multiButtonsData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                multiButtonsData.writeToParcel(parcel, flags);
            }
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }
    }
}
