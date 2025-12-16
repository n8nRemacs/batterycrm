package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionListResult.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0003DEFBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jt\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010#¨\u0006G"}, d2 = {"Lcom/avito/android/remote/model/AdvertCollection;", "Landroid/os/Parcelable;", "", "id", "name", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/Image;", MessageSuggest.PREVIEW, "", "size", "description", "Lcom/avito/android/remote/model/AdvertCollection$ModerationStatusInfo;", "moderationStatusInfo", "Lcom/avito/android/remote/model/AdvertCollection$AuthorInfo;", "author", "Lcom/avito/android/remote/model/AdvertCollection$Actions;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;ILjava/lang/String;Lcom/avito/android/remote/model/AdvertCollection$ModerationStatusInfo;Lcom/avito/android/remote/model/AdvertCollection$AuthorInfo;Lcom/avito/android/remote/model/AdvertCollection$Actions;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()I", "component6", "component7", "()Lcom/avito/android/remote/model/AdvertCollection$ModerationStatusInfo;", "component8", "()Lcom/avito/android/remote/model/AdvertCollection$AuthorInfo;", "component9", "()Lcom/avito/android/remote/model/AdvertCollection$Actions;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/Image;ILjava/lang/String;Lcom/avito/android/remote/model/AdvertCollection$ModerationStatusInfo;Lcom/avito/android/remote/model/AdvertCollection$AuthorInfo;Lcom/avito/android/remote/model/AdvertCollection$Actions;)Lcom/avito/android/remote/model/AdvertCollection;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/Image;", "getPreview", "I", "getSize", "getDescription", "Lcom/avito/android/remote/model/AdvertCollection$ModerationStatusInfo;", "getModerationStatusInfo", "Lcom/avito/android/remote/model/AdvertCollection$AuthorInfo;", "getAuthor", "Lcom/avito/android/remote/model/AdvertCollection$Actions;", "getActions", "Actions", "AuthorInfo", "ModerationStatusInfo", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertCollection implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertCollection> CREATOR = new Creator();

    @c("actions")
    @l
    private final Actions actions;

    @c("author")
    @l
    private final AuthorInfo author;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("description")
    @l
    private final String description;

    @c("id")
    @k
    private final String id;

    @c("badge")
    @l
    private final ModerationStatusInfo moderationStatusInfo;

    @c("name")
    @k
    private final String name;

    @c(MessageSuggest.PREVIEW)
    @l
    private final Image preview;

    @c("size")
    private final int size;

    /* compiled from: AdvertCollectionListResult.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\f¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/AdvertCollection$Actions;", "Landroid/os/Parcelable;", "", "canDelete", "canShare", "Lcom/avito/android/deep_linking/links/DeepLink;", "edit", "canPublish", "canUnpublish", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/AdvertCollection$Actions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getCanDelete", "getCanShare", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEdit", "getCanPublish", "getCanUnpublish", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Actions implements Parcelable {

        @k
        public static final Parcelable.Creator<Actions> CREATOR = new Creator();

        @c("delete")
        @l
        private final Boolean canDelete;

        @c("publish")
        @l
        private final Boolean canPublish;

        @c("share")
        @l
        private final Boolean canShare;

        @c("unpublish")
        @l
        private final Boolean canUnpublish;

        @c("edit")
        @l
        private final DeepLink edit;

        /* compiled from: AdvertCollectionListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Actions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Actions createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                Boolean boolValueOf4;
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
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Actions.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Actions(boolValueOf, boolValueOf2, deepLink, boolValueOf3, boolValueOf4);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Actions[] newArray(int i12) {
                return new Actions[i12];
            }
        }

        public Actions(@l Boolean bool, @l Boolean bool2, @l DeepLink deepLink, @l Boolean bool3, @l Boolean bool4) {
            this.canDelete = bool;
            this.canShare = bool2;
            this.edit = deepLink;
            this.canPublish = bool3;
            this.canUnpublish = bool4;
        }

        public static /* synthetic */ Actions copy$default(Actions actions, Boolean bool, Boolean bool2, DeepLink deepLink, Boolean bool3, Boolean bool4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = actions.canDelete;
            }
            if ((i12 & 2) != 0) {
                bool2 = actions.canShare;
            }
            Boolean bool5 = bool2;
            if ((i12 & 4) != 0) {
                deepLink = actions.edit;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 8) != 0) {
                bool3 = actions.canPublish;
            }
            Boolean bool6 = bool3;
            if ((i12 & 16) != 0) {
                bool4 = actions.canUnpublish;
            }
            return actions.copy(bool, bool5, deepLink2, bool6, bool4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getCanDelete() {
            return this.canDelete;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getCanShare() {
            return this.canShare;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getEdit() {
            return this.edit;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getCanPublish() {
            return this.canPublish;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Boolean getCanUnpublish() {
            return this.canUnpublish;
        }

        @k
        public final Actions copy(@l Boolean canDelete, @l Boolean canShare, @l DeepLink edit, @l Boolean canPublish, @l Boolean canUnpublish) {
            return new Actions(canDelete, canShare, edit, canPublish, canUnpublish);
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
            return L.f(this.canDelete, actions.canDelete) && L.f(this.canShare, actions.canShare) && L.f(this.edit, actions.edit) && L.f(this.canPublish, actions.canPublish) && L.f(this.canUnpublish, actions.canUnpublish);
        }

        @l
        public final Boolean getCanDelete() {
            return this.canDelete;
        }

        @l
        public final Boolean getCanPublish() {
            return this.canPublish;
        }

        @l
        public final Boolean getCanShare() {
            return this.canShare;
        }

        @l
        public final Boolean getCanUnpublish() {
            return this.canUnpublish;
        }

        @l
        public final DeepLink getEdit() {
            return this.edit;
        }

        public int hashCode() {
            Boolean bool = this.canDelete;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.canShare;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            DeepLink deepLink = this.edit;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool3 = this.canPublish;
            int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.canUnpublish;
            return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Actions(canDelete=");
            sb2.append(this.canDelete);
            sb2.append(", canShare=");
            sb2.append(this.canShare);
            sb2.append(", edit=");
            sb2.append(this.edit);
            sb2.append(", canPublish=");
            sb2.append(this.canPublish);
            sb2.append(", canUnpublish=");
            return C0.g(sb2, this.canUnpublish, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.canDelete;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.canShare;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.edit, flags);
            Boolean bool3 = this.canPublish;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            Boolean bool4 = this.canUnpublish;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
        }
    }

    /* compiled from: AdvertCollectionListResult.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/AdvertCollection$AuthorInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "avatar", "", "name", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertCollection$AuthorInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getAvatar", "Ljava/lang/String;", "getName", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuthorInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<AuthorInfo> CREATOR = new Creator();

        @c("avatar")
        @l
        private final Image avatar;

        @c("name")
        @l
        private final String name;

        /* compiled from: AdvertCollectionListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AuthorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AuthorInfo createFromParcel(@k Parcel parcel) {
                return new AuthorInfo((Image) parcel.readParcelable(AuthorInfo.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AuthorInfo[] newArray(int i12) {
                return new AuthorInfo[i12];
            }
        }

        public AuthorInfo(@l Image image, @l String str) {
            this.avatar = image;
            this.name = str;
        }

        public static /* synthetic */ AuthorInfo copy$default(AuthorInfo authorInfo, Image image, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = authorInfo.avatar;
            }
            if ((i12 & 2) != 0) {
                str = authorInfo.name;
            }
            return authorInfo.copy(image, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        public final AuthorInfo copy(@l Image avatar, @l String name) {
            return new AuthorInfo(avatar, name);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorInfo)) {
                return false;
            }
            AuthorInfo authorInfo = (AuthorInfo) other;
            return L.f(this.avatar, authorInfo.avatar) && L.f(this.name, authorInfo.name);
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            Image image = this.avatar;
            int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
            String str = this.name;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AuthorInfo(avatar=");
            sb2.append(this.avatar);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.avatar, flags);
            parcel.writeString(this.name);
        }
    }

    /* compiled from: AdvertCollectionListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertCollection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCollection createFromParcel(@k Parcel parcel) {
            return new AdvertCollection(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertCollection.class.getClassLoader()), (Image) parcel.readParcelable(AdvertCollection.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : ModerationStatusInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthorInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Actions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCollection[] newArray(int i12) {
            return new AdvertCollection[i12];
        }
    }

    /* compiled from: AdvertCollectionListResult.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/AdvertCollection$ModerationStatusInfo;", "Landroid/os/Parcelable;", "", "text", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertCollection$ModerationStatusInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getColor", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ModerationStatusInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<ModerationStatusInfo> CREATOR = new Creator();

        @c("color")
        @k
        private final String color;

        @c("text")
        @k
        private final String text;

        /* compiled from: AdvertCollectionListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ModerationStatusInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ModerationStatusInfo createFromParcel(@k Parcel parcel) {
                return new ModerationStatusInfo(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ModerationStatusInfo[] newArray(int i12) {
                return new ModerationStatusInfo[i12];
            }
        }

        public ModerationStatusInfo(@k String str, @k String str2) {
            this.text = str;
            this.color = str2;
        }

        public static /* synthetic */ ModerationStatusInfo copy$default(ModerationStatusInfo moderationStatusInfo, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = moderationStatusInfo.text;
            }
            if ((i12 & 2) != 0) {
                str2 = moderationStatusInfo.color;
            }
            return moderationStatusInfo.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        public final ModerationStatusInfo copy(@k String text, @k String color) {
            return new ModerationStatusInfo(text, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ModerationStatusInfo)) {
                return false;
            }
            ModerationStatusInfo moderationStatusInfo = (ModerationStatusInfo) other;
            return L.f(this.text, moderationStatusInfo.text) && L.f(this.color, moderationStatusInfo.color);
        }

        @k
        public final String getColor() {
            return this.color;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.color.hashCode() + (this.text.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ModerationStatusInfo(text=");
            sb2.append(this.text);
            sb2.append(", color=");
            return C22026a.c(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.color);
        }
    }

    public AdvertCollection(@k String str, @k String str2, @k DeepLink deepLink, @l Image image, int i12, @l String str3, @l ModerationStatusInfo moderationStatusInfo, @l AuthorInfo authorInfo, @l Actions actions) {
        this.id = str;
        this.name = str2;
        this.deepLink = deepLink;
        this.preview = image;
        this.size = i12;
        this.description = str3;
        this.moderationStatusInfo = moderationStatusInfo;
        this.author = authorInfo;
        this.actions = actions;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getPreview() {
        return this.preview;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ModerationStatusInfo getModerationStatusInfo() {
        return this.moderationStatusInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final AuthorInfo getAuthor() {
        return this.author;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Actions getActions() {
        return this.actions;
    }

    @k
    public final AdvertCollection copy(@k String id2, @k String name, @k DeepLink deepLink, @l Image preview, int size, @l String description, @l ModerationStatusInfo moderationStatusInfo, @l AuthorInfo author, @l Actions actions) {
        return new AdvertCollection(id2, name, deepLink, preview, size, description, moderationStatusInfo, author, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertCollection)) {
            return false;
        }
        AdvertCollection advertCollection = (AdvertCollection) other;
        return L.f(this.id, advertCollection.id) && L.f(this.name, advertCollection.name) && L.f(this.deepLink, advertCollection.deepLink) && L.f(this.preview, advertCollection.preview) && this.size == advertCollection.size && L.f(this.description, advertCollection.description) && L.f(this.moderationStatusInfo, advertCollection.moderationStatusInfo) && L.f(this.author, advertCollection.author) && L.f(this.actions, advertCollection.actions);
    }

    @l
    public final Actions getActions() {
        return this.actions;
    }

    @l
    public final AuthorInfo getAuthor() {
        return this.author;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final ModerationStatusInfo getModerationStatusInfo() {
        return this.moderationStatusInfo;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final Image getPreview() {
        return this.preview;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        int iE2 = a.e(this.deepLink, H.d(this.id.hashCode() * 31, 31, this.name), 31);
        Image image = this.preview;
        int iE3 = r.e(this.size, (iE2 + (image == null ? 0 : image.hashCode())) * 31, 31);
        String str = this.description;
        int iHashCode = (iE3 + (str == null ? 0 : str.hashCode())) * 31;
        ModerationStatusInfo moderationStatusInfo = this.moderationStatusInfo;
        int iHashCode2 = (iHashCode + (moderationStatusInfo == null ? 0 : moderationStatusInfo.hashCode())) * 31;
        AuthorInfo authorInfo = this.author;
        int iHashCode3 = (iHashCode2 + (authorInfo == null ? 0 : authorInfo.hashCode())) * 31;
        Actions actions = this.actions;
        return iHashCode3 + (actions != null ? actions.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertCollection(id=" + this.id + ", name=" + this.name + ", deepLink=" + this.deepLink + ", preview=" + this.preview + ", size=" + this.size + ", description=" + this.description + ", moderationStatusInfo=" + this.moderationStatusInfo + ", author=" + this.author + ", actions=" + this.actions + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.deepLink, flags);
        parcel.writeParcelable(this.preview, flags);
        parcel.writeInt(this.size);
        parcel.writeString(this.description);
        ModerationStatusInfo moderationStatusInfo = this.moderationStatusInfo;
        if (moderationStatusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moderationStatusInfo.writeToParcel(parcel, flags);
        }
        AuthorInfo authorInfo = this.author;
        if (authorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authorInfo.writeToParcel(parcel, flags);
        }
        Actions actions = this.actions;
        if (actions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actions.writeToParcel(parcel, flags);
        }
    }
}
