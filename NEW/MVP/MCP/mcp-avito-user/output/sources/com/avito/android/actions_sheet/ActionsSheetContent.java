package com.avito.android.actions_sheet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionsSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/actions_sheet/ActionsSheetContent;", "Landroid/os/Parcelable;", "", "title", "", "isClosable", "", "Lcom/avito/android/actions_sheet/ActionsSheetContent$Action;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Action", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActionsSheetContent implements Parcelable {

    @k
    public static final Parcelable.Creator<ActionsSheetContent> CREATOR = new a();

    @com.google.gson.annotations.c("actions")
    @k
    private final List<Action> actions;

    @com.google.gson.annotations.c("isClosable")
    @l
    private final Boolean isClosable;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* compiled from: ActionsSheetLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/actions_sheet/ActionsSheetContent$Action;", "Landroid/os/Parcelable;", "", "title", "subtitle", "icon", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        @com.google.gson.annotations.c("icon")
        @l
        private final String icon;

        @com.google.gson.annotations.c("subtitle")
        @l
        private final String subtitle;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: ActionsSheetLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @l String str2, @l String str3, @k DeepLink deepLink) {
            this.title = str;
            this.subtitle = str2;
            this.icon = str3;
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.title, action.title) && L.f(this.subtitle, action.subtitle) && L.f(this.icon, action.icon) && L.f(this.uri, action.uri);
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.icon;
            return this.uri.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.icon);
            parcel.writeParcelable(this.uri, i12);
        }
    }

    /* compiled from: ActionsSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionsSheetContent> {
        @Override // android.os.Parcelable.Creator
        public final ActionsSheetContent createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ActionsSheetContent(string, boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionsSheetContent[] newArray(int i12) {
            return new ActionsSheetContent[i12];
        }
    }

    public ActionsSheetContent(@l String str, @l Boolean bool, @k List<Action> list) {
        this.title = str;
        this.isClosable = bool;
        this.actions = list;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsClosable() {
        return this.isClosable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionsSheetContent)) {
            return false;
        }
        ActionsSheetContent actionsSheetContent = (ActionsSheetContent) obj;
        return L.f(this.title, actionsSheetContent.title) && L.f(this.isClosable, actionsSheetContent.isClosable) && L.f(this.actions, actionsSheetContent.actions);
    }

    @k
    public final List<Action> getActions() {
        return this.actions;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isClosable;
        return this.actions.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionsSheetContent(title=");
        sb2.append(this.title);
        sb2.append(", isClosable=");
        sb2.append(this.isClosable);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Boolean bool = this.isClosable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            ((Action) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
