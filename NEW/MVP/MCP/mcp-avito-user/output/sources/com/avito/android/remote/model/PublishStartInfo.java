package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishStartInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/PublishStartInfo;", "", "()V", "MultiProfile", "Publish", "UserDraft", "Lcom/avito/android/remote/model/PublishStartInfo$MultiProfile;", "Lcom/avito/android/remote/model/PublishStartInfo$Publish;", "Lcom/avito/android/remote/model/PublishStartInfo$UserDraft;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PublishStartInfo {

    /* compiled from: PublishStartInfo.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/PublishStartInfo$MultiProfile;", "Lcom/avito/android/remote/model/PublishStartInfo;", "title", "", "profile", "Lcom/avito/android/remote/model/PublishStartInfo$MultiProfile$Profile;", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "actions", "", "Lcom/avito/android/remote/model/Action;", "(Ljava/lang/String;Lcom/avito/android/remote/model/PublishStartInfo$MultiProfile$Profile;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getProfile", "()Lcom/avito/android/remote/model/PublishStartInfo$MultiProfile$Profile;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Profile", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MultiProfile extends PublishStartInfo {

        @c("actions")
        @k
        private final List<Action> actions;

        @c("description")
        @l
        private final AttributedText description;

        @c("profile")
        @l
        private final Profile profile;

        @c("title")
        @k
        private final String title;

        /* compiled from: PublishStartInfo.kt */
        @d
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/PublishStartInfo$MultiProfile$Profile;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/PublishStartInfo$MultiProfile$Profile;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Profile implements Parcelable {

            @k
            public static final Parcelable.Creator<Profile> CREATOR = new Creator();

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink action;

            @c("image")
            @l
            private final Image image;

            @c("name")
            @k
            private final String name;

            /* compiled from: PublishStartInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Profile> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Profile createFromParcel(@k Parcel parcel) {
                    return new Profile(parcel.readString(), (Image) parcel.readParcelable(Profile.class.getClassLoader()), (DeepLink) parcel.readParcelable(Profile.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Profile[] newArray(int i12) {
                    return new Profile[i12];
                }
            }

            public Profile(@k String str, @l Image image, @k DeepLink deepLink) {
                this.name = str;
                this.image = image;
                this.action = deepLink;
            }

            public static /* synthetic */ Profile copy$default(Profile profile, String str, Image image, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = profile.name;
                }
                if ((i12 & 2) != 0) {
                    image = profile.image;
                }
                if ((i12 & 4) != 0) {
                    deepLink = profile.action;
                }
                return profile.copy(str, image, deepLink);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Image getImage() {
                return this.image;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final DeepLink getAction() {
                return this.action;
            }

            @k
            public final Profile copy(@k String name, @l Image image, @k DeepLink action) {
                return new Profile(name, image, action);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Profile)) {
                    return false;
                }
                Profile profile = (Profile) other;
                return L.f(this.name, profile.name) && L.f(this.image, profile.image) && L.f(this.action, profile.action);
            }

            @k
            public final DeepLink getAction() {
                return this.action;
            }

            @l
            public final Image getImage() {
                return this.image;
            }

            @k
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                Image image = this.image;
                return this.action.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Profile(name=");
                sb2.append(this.name);
                sb2.append(", image=");
                sb2.append(this.image);
                sb2.append(", action=");
                return a.v(sb2, this.action, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.name);
                parcel.writeParcelable(this.image, flags);
                parcel.writeParcelable(this.action, flags);
            }
        }

        public MultiProfile(@k String str, @l Profile profile, @l AttributedText attributedText, @k List<Action> list) {
            super(null);
            this.title = str;
            this.profile = profile;
            this.description = attributedText;
            this.actions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultiProfile copy$default(MultiProfile multiProfile, String str, Profile profile, AttributedText attributedText, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = multiProfile.title;
            }
            if ((i12 & 2) != 0) {
                profile = multiProfile.profile;
            }
            if ((i12 & 4) != 0) {
                attributedText = multiProfile.description;
            }
            if ((i12 & 8) != 0) {
                list = multiProfile.actions;
            }
            return multiProfile.copy(str, profile, attributedText, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Profile getProfile() {
            return this.profile;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final List<Action> component4() {
            return this.actions;
        }

        @k
        public final MultiProfile copy(@k String title, @l Profile profile, @l AttributedText description, @k List<Action> actions) {
            return new MultiProfile(title, profile, description, actions);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiProfile)) {
                return false;
            }
            MultiProfile multiProfile = (MultiProfile) other;
            return L.f(this.title, multiProfile.title) && L.f(this.profile, multiProfile.profile) && L.f(this.description, multiProfile.description) && L.f(this.actions, multiProfile.actions);
        }

        @k
        public final List<Action> getActions() {
            return this.actions;
        }

        @l
        public final AttributedText getDescription() {
            return this.description;
        }

        @l
        public final Profile getProfile() {
            return this.profile;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Profile profile = this.profile;
            int iHashCode2 = (iHashCode + (profile == null ? 0 : profile.hashCode())) * 31;
            AttributedText attributedText = this.description;
            return this.actions.hashCode() + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MultiProfile(title=");
            sb2.append(this.title);
            sb2.append(", profile=");
            sb2.append(this.profile);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }
    }

    /* compiled from: PublishStartInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/PublishStartInfo$Publish;", "Lcom/avito/android/remote/model/PublishStartInfo;", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Publish extends PublishStartInfo {

        @k
        public static final Publish INSTANCE = new Publish();

        private Publish() {
            super(null);
        }
    }

    /* compiled from: PublishStartInfo.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/PublishStartInfo$UserDraft;", "Lcom/avito/android/remote/model/PublishStartInfo;", "draft", "Lcom/avito/android/remote/model/PublishStartInfo$UserDraft$Draft;", "dialogInfo", "Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "(Lcom/avito/android/remote/model/PublishStartInfo$UserDraft$Draft;Lcom/avito/android/remote/model/DeepLinksDialogInfo;)V", "getDialogInfo", "()Lcom/avito/android/remote/model/DeepLinksDialogInfo;", "getDraft", "()Lcom/avito/android/remote/model/PublishStartInfo$UserDraft$Draft;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "Draft", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserDraft extends PublishStartInfo {

        @c("dialog")
        @k
        private final DeepLinksDialogInfo dialogInfo;

        @c("draft")
        @k
        private final Draft draft;

        /* compiled from: PublishStartInfo.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/PublishStartInfo$UserDraft$Draft;", "", "sessionId", "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Draft {

            @c("publishSessionId")
            @k
            private final String sessionId;

            public Draft(@k String str) {
                this.sessionId = str;
            }

            public static /* synthetic */ Draft copy$default(Draft draft, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = draft.sessionId;
                }
                return draft.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getSessionId() {
                return this.sessionId;
            }

            @k
            public final Draft copy(@k String sessionId) {
                return new Draft(sessionId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Draft) && L.f(this.sessionId, ((Draft) other).sessionId);
            }

            @k
            public final String getSessionId() {
                return this.sessionId;
            }

            public int hashCode() {
                return this.sessionId.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Draft(sessionId="), this.sessionId, ')');
            }
        }

        public UserDraft(@k Draft draft, @k DeepLinksDialogInfo deepLinksDialogInfo) {
            super(null);
            this.draft = draft;
            this.dialogInfo = deepLinksDialogInfo;
        }

        public static /* synthetic */ UserDraft copy$default(UserDraft userDraft, Draft draft, DeepLinksDialogInfo deepLinksDialogInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                draft = userDraft.draft;
            }
            if ((i12 & 2) != 0) {
                deepLinksDialogInfo = userDraft.dialogInfo;
            }
            return userDraft.copy(draft, deepLinksDialogInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Draft getDraft() {
            return this.draft;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLinksDialogInfo getDialogInfo() {
            return this.dialogInfo;
        }

        @k
        public final UserDraft copy(@k Draft draft, @k DeepLinksDialogInfo dialogInfo) {
            return new UserDraft(draft, dialogInfo);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserDraft)) {
                return false;
            }
            UserDraft userDraft = (UserDraft) other;
            return L.f(this.draft, userDraft.draft) && L.f(this.dialogInfo, userDraft.dialogInfo);
        }

        @k
        public final DeepLinksDialogInfo getDialogInfo() {
            return this.dialogInfo;
        }

        @k
        public final Draft getDraft() {
            return this.draft;
        }

        public int hashCode() {
            return this.dialogInfo.hashCode() + (this.draft.hashCode() * 31);
        }

        @k
        public String toString() {
            return "UserDraft(draft=" + this.draft + ", dialogInfo=" + this.dialogInfo + ')';
        }
    }

    public /* synthetic */ PublishStartInfo(C42822w c42822w) {
        this();
    }

    private PublishStartInfo() {
    }
}
