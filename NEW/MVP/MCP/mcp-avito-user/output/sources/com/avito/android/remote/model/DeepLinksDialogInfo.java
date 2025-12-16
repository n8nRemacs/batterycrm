package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeepLinksDialogInfo.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003<=>Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J|\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b)\u0010$J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b\u000b\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b9\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b:\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b;\u0010\u0013¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "Landroid/os/Parcelable;", "", "title", "description", "", "Lcom/avito/android/remote/model/DeepLinksDialogInfo$Action;", "items", "Lcom/avito/android/remote/model/DeepLinksDialogInfo$ControlsDirection;", "controlsDirection", "", "isCancellable", "shouldShowCloseControl", "imageName", "lightThemeImageUrl", "darkThemeImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/DeepLinksDialogInfo$ControlsDirection;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/DeepLinksDialogInfo$ControlsDirection;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/DeepLinksDialogInfo$ControlsDirection;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/DeepLinksDialogInfo$ControlsDirection;", "getControlsDirection", "Ljava/lang/Boolean;", "getShouldShowCloseControl", "getImageName", "getLightThemeImageUrl", "getDarkThemeImageUrl", "Action", "ActionType", "ControlsDirection", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeepLinksDialogInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<DeepLinksDialogInfo> CREATOR = new Creator();

    @c("controlsDirection")
    @l
    private final ControlsDirection controlsDirection;

    @c("darkThemeImageUrl")
    @l
    private final String darkThemeImageUrl;

    @c("description")
    @k
    private final String description;

    @c("imageName")
    @l
    private final String imageName;

    @c("isCancellable")
    @l
    private final Boolean isCancellable;

    @c("actions")
    @k
    private final List<Action> items;

    @c("lightThemeImageUrl")
    @l
    private final String lightThemeImageUrl;

    @c("shouldShowCloseControl")
    @l
    private final Boolean shouldShowCloseControl;

    @c("title")
    @k
    private final String title;

    /* compiled from: DeepLinksDialogInfo.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/DeepLinksDialogInfo$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "uriLink", "Lcom/avito/android/remote/model/DeepLinksDialogInfo$ActionType;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/DeepLinksDialogInfo$ActionType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/DeepLinksDialogInfo$ActionType;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/DeepLinksDialogInfo$ActionType;)Lcom/avito/android/remote/model/DeepLinksDialogInfo$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUriLink", "Lcom/avito/android/remote/model/DeepLinksDialogInfo$ActionType;", "getType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final ActionType type;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uriLink;

        /* compiled from: DeepLinksDialogInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()), ActionType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @l DeepLink deepLink, @k ActionType actionType) {
            this.title = str;
            this.uriLink = deepLink;
            this.type = actionType;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, DeepLink deepLink, ActionType actionType, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = action.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = action.uriLink;
            }
            if ((i12 & 4) != 0) {
                actionType = action.type;
            }
            return action.copy(str, deepLink, actionType);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUriLink() {
            return this.uriLink;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @k
        public final Action copy(@k String title, @l DeepLink uriLink, @k ActionType type) {
            return new Action(title, uriLink, type);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return L.f(this.title, action.title) && L.f(this.uriLink, action.uriLink) && this.type == action.type;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final ActionType getType() {
            return this.type;
        }

        @l
        public final DeepLink getUriLink() {
            return this.uriLink;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.uriLink;
            return this.type.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
        }

        @k
        public String toString() {
            return "Action(title=" + this.title + ", uriLink=" + this.uriLink + ", type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uriLink, flags);
            parcel.writeString(this.type.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeepLinksDialogInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/DeepLinksDialogInfo$ActionType;", "", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @c("default")
        public static final ActionType POSITIVE = new ActionType("POSITIVE", 0);

        @c("destructive")
        public static final ActionType NEGATIVE = new ActionType("NEGATIVE", 1);

        @c("secondary")
        public static final ActionType NEUTRAL = new ActionType("NEUTRAL", 2);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{POSITIVE, NEGATIVE, NEUTRAL};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(actionTypeArr$values);
        }

        private ActionType(String str, int i12) {
        }

        @k
        public static a<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeepLinksDialogInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/DeepLinksDialogInfo$ControlsDirection;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ControlsDirection {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ControlsDirection[] $VALUES;

        @c("horizontal")
        public static final ControlsDirection HORIZONTAL = new ControlsDirection("HORIZONTAL", 0);

        @c("vertical")
        public static final ControlsDirection VERTICAL = new ControlsDirection("VERTICAL", 1);

        private static final /* synthetic */ ControlsDirection[] $values() {
            return new ControlsDirection[]{HORIZONTAL, VERTICAL};
        }

        static {
            ControlsDirection[] controlsDirectionArr$values = $values();
            $VALUES = controlsDirectionArr$values;
            $ENTRIES = kotlin.enums.c.a(controlsDirectionArr$values);
        }

        private ControlsDirection(String str, int i12) {
        }

        @k
        public static a<ControlsDirection> getEntries() {
            return $ENTRIES;
        }

        public static ControlsDirection valueOf(String str) {
            return (ControlsDirection) Enum.valueOf(ControlsDirection.class, str);
        }

        public static ControlsDirection[] values() {
            return (ControlsDirection[]) $VALUES.clone();
        }
    }

    /* compiled from: DeepLinksDialogInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeepLinksDialogInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeepLinksDialogInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList, iC2, 1);
            }
            ControlsDirection controlsDirectionValueOf = parcel.readInt() == 0 ? null : ControlsDirection.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DeepLinksDialogInfo(string, string2, arrayList, controlsDirectionValueOf, boolValueOf, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeepLinksDialogInfo[] newArray(int i12) {
            return new DeepLinksDialogInfo[i12];
        }
    }

    public DeepLinksDialogInfo(@k String str, @k String str2, @k List<Action> list, @l ControlsDirection controlsDirection, @l Boolean bool, @l Boolean bool2, @l String str3, @l String str4, @l String str5) {
        this.title = str;
        this.description = str2;
        this.items = list;
        this.controlsDirection = controlsDirection;
        this.isCancellable = bool;
        this.shouldShowCloseControl = bool2;
        this.imageName = str3;
        this.lightThemeImageUrl = str4;
        this.darkThemeImageUrl = str5;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<Action> component3() {
        return this.items;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ControlsDirection getControlsDirection() {
        return this.controlsDirection;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsCancellable() {
        return this.isCancellable;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getShouldShowCloseControl() {
        return this.shouldShowCloseControl;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getLightThemeImageUrl() {
        return this.lightThemeImageUrl;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getDarkThemeImageUrl() {
        return this.darkThemeImageUrl;
    }

    @k
    public final DeepLinksDialogInfo copy(@k String title, @k String description, @k List<Action> items, @l ControlsDirection controlsDirection, @l Boolean isCancellable, @l Boolean shouldShowCloseControl, @l String imageName, @l String lightThemeImageUrl, @l String darkThemeImageUrl) {
        return new DeepLinksDialogInfo(title, description, items, controlsDirection, isCancellable, shouldShowCloseControl, imageName, lightThemeImageUrl, darkThemeImageUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepLinksDialogInfo)) {
            return false;
        }
        DeepLinksDialogInfo deepLinksDialogInfo = (DeepLinksDialogInfo) other;
        return L.f(this.title, deepLinksDialogInfo.title) && L.f(this.description, deepLinksDialogInfo.description) && L.f(this.items, deepLinksDialogInfo.items) && this.controlsDirection == deepLinksDialogInfo.controlsDirection && L.f(this.isCancellable, deepLinksDialogInfo.isCancellable) && L.f(this.shouldShowCloseControl, deepLinksDialogInfo.shouldShowCloseControl) && L.f(this.imageName, deepLinksDialogInfo.imageName) && L.f(this.lightThemeImageUrl, deepLinksDialogInfo.lightThemeImageUrl) && L.f(this.darkThemeImageUrl, deepLinksDialogInfo.darkThemeImageUrl);
    }

    @l
    public final ControlsDirection getControlsDirection() {
        return this.controlsDirection;
    }

    @l
    public final String getDarkThemeImageUrl() {
        return this.darkThemeImageUrl;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getImageName() {
        return this.imageName;
    }

    @k
    public final List<Action> getItems() {
        return this.items;
    }

    @l
    public final String getLightThemeImageUrl() {
        return this.lightThemeImageUrl;
    }

    @l
    public final Boolean getShouldShowCloseControl() {
        return this.shouldShowCloseControl;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = H.e(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.items);
        ControlsDirection controlsDirection = this.controlsDirection;
        int iHashCode = (iE2 + (controlsDirection == null ? 0 : controlsDirection.hashCode())) * 31;
        Boolean bool = this.isCancellable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldShowCloseControl;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.imageName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lightThemeImageUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkThemeImageUrl;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @l
    public final Boolean isCancellable() {
        return this.isCancellable;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeepLinksDialogInfo(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", controlsDirection=");
        sb2.append(this.controlsDirection);
        sb2.append(", isCancellable=");
        sb2.append(this.isCancellable);
        sb2.append(", shouldShowCloseControl=");
        sb2.append(this.shouldShowCloseControl);
        sb2.append(", imageName=");
        sb2.append(this.imageName);
        sb2.append(", lightThemeImageUrl=");
        sb2.append(this.lightThemeImageUrl);
        sb2.append(", darkThemeImageUrl=");
        return C22026a.c(sb2, this.darkThemeImageUrl, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((Action) itJ.next()).writeToParcel(parcel, flags);
        }
        ControlsDirection controlsDirection = this.controlsDirection;
        if (controlsDirection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(controlsDirection.name());
        }
        Boolean bool = this.isCancellable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.shouldShowCloseControl;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.imageName);
        parcel.writeString(this.lightThemeImageUrl);
        parcel.writeString(this.darkThemeImageUrl);
    }

    public /* synthetic */ DeepLinksDialogInfo(String str, String str2, List list, ControlsDirection controlsDirection, Boolean bool, Boolean bool2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? null : controlsDirection, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : bool2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5);
    }
}
