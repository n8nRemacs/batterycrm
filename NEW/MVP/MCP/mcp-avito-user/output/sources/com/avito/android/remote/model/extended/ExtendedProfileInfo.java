package com.avito.android.remote.model.extended;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileInfo;", "", "title", "", "value", "buttons", "", "Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$Button;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Button", "DeeplinkAction", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileInfo {

    @c("buttons")
    @l
    private final List<Button> buttons;

    @c("title")
    @k
    private final String title;

    @c("value")
    @l
    private final String value;

    /* compiled from: ExtendedProfileInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$Button;", "", "title", "", "iconType", "Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$Button$Type;", "action", "Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$Button$Type;Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction;)V", "getAction", "()Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction;", "getIconType", "()Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$Button$Type;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Type", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button {

        @c("action")
        @k
        private final DeeplinkAction action;

        @c("iconType")
        @l
        private final Type iconType;

        @c("title")
        @l
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExtendedProfileInfo.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$Button$Type;", "", "(Ljava/lang/String;I)V", "EDIT", "DELETE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("edit")
            public static final Type EDIT = new Type("EDIT", 0);

            @c("delete")
            public static final Type DELETE = new Type("DELETE", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{EDIT, DELETE};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12) {
            }

            @k
            public static a<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Button(@l String str, @l Type type, @k DeeplinkAction deeplinkAction) {
            this.title = str;
            this.iconType = type;
            this.action = deeplinkAction;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, Type type, DeeplinkAction deeplinkAction, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.title;
            }
            if ((i12 & 2) != 0) {
                type = button.iconType;
            }
            if ((i12 & 4) != 0) {
                deeplinkAction = button.action;
            }
            return button.copy(str, type, deeplinkAction);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Type getIconType() {
            return this.iconType;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final DeeplinkAction getAction() {
            return this.action;
        }

        @k
        public final Button copy(@l String title, @l Type iconType, @k DeeplinkAction action) {
            return new Button(title, iconType, action);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.title, button.title) && this.iconType == button.iconType && L.f(this.action, button.action);
        }

        @k
        public final DeeplinkAction getAction() {
            return this.action;
        }

        @l
        public final Type getIconType() {
            return this.iconType;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Type type = this.iconType;
            return this.action.hashCode() + ((iHashCode + (type != null ? type.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            return "Button(title=" + this.title + ", iconType=" + this.iconType + ", action=" + this.action + ')';
        }
    }

    /* compiled from: ExtendedProfileInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction$Type;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction$Type;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction$Type;", "getType", "()Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction$Type;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Type", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class DeeplinkAction implements Parcelable {

        @k
        public static final Parcelable.Creator<DeeplinkAction> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("type")
        @l
        private final Type type;

        /* compiled from: ExtendedProfileInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeeplinkAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeeplinkAction createFromParcel(@k Parcel parcel) {
                return new DeeplinkAction(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(DeeplinkAction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeeplinkAction[] newArray(int i12) {
                return new DeeplinkAction[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExtendedProfileInfo.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileInfo$DeeplinkAction$Type;", "", "(Ljava/lang/String;I)V", "LINK", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("link")
            public static final Type LINK = new Type("LINK", 0);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{LINK};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12) {
            }

            @k
            public static a<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public DeeplinkAction(@l Type type, @l DeepLink deepLink) {
            this.type = type;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final Type getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Type type = this.type;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    public ExtendedProfileInfo(@k String str, @l String str2, @l List<Button> list) {
        this.title = str;
        this.value = str2;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfileInfo copy$default(ExtendedProfileInfo extendedProfileInfo, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileInfo.title;
        }
        if ((i12 & 2) != 0) {
            str2 = extendedProfileInfo.value;
        }
        if ((i12 & 4) != 0) {
            list = extendedProfileInfo.buttons;
        }
        return extendedProfileInfo.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    public final List<Button> component3() {
        return this.buttons;
    }

    @k
    public final ExtendedProfileInfo copy(@k String title, @l String value, @l List<Button> buttons) {
        return new ExtendedProfileInfo(title, value, buttons);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileInfo)) {
            return false;
        }
        ExtendedProfileInfo extendedProfileInfo = (ExtendedProfileInfo) other;
        return L.f(this.title, extendedProfileInfo.title) && L.f(this.value, extendedProfileInfo.value) && L.f(this.buttons, extendedProfileInfo.buttons);
    }

    @l
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Button> list = this.buttons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileInfo(title=");
        sb2.append(this.title);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", buttons=");
        return H.p(sb2, this.buttons, ')');
    }
}
