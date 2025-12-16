package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoUploadParameter.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingV2;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Action;", "action", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content;", "content", "<init>", "(Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Action;Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Action;", "component2", "()Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content;", "copy", "(Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Action;Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content;)Lcom/avito/android/remote/model/category_parameters/OnboardingV2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Action;", "getAction", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content;", "getContent", "Action", "Content", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OnboardingV2 implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingV2> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("content")
    @k
    private final Content content;

    /* compiled from: VideoUploadParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Action;", "Landroid/os/Parcelable;", "", "title", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final String uri;

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @l String str2) {
            this.title = str;
            this.uri = str2;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = action.title;
            }
            if ((i12 & 2) != 0) {
                str2 = action.uri;
            }
            return action.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        @k
        public final Action copy(@k String title, @l String uri) {
            return new Action(title, uri);
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
            return L.f(this.title, action.title) && L.f(this.uri, action.uri);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.uri;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return C22026a.c(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.uri);
        }
    }

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingV2 createFromParcel(@k Parcel parcel) {
            return new OnboardingV2(parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), Content.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingV2[] newArray(int i12) {
            return new OnboardingV2[i12];
        }
    }

    public OnboardingV2(@l Action action, @k Content content) {
        this.action = action;
        this.content = content;
    }

    public static /* synthetic */ OnboardingV2 copy$default(OnboardingV2 onboardingV2, Action action, Content content, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            action = onboardingV2.action;
        }
        if ((i12 & 2) != 0) {
            content = onboardingV2.content;
        }
        return onboardingV2.copy(action, content);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    @k
    public final OnboardingV2 copy(@l Action action, @k Content content) {
        return new OnboardingV2(action, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingV2)) {
            return false;
        }
        OnboardingV2 onboardingV2 = (OnboardingV2) other;
        return L.f(this.action, onboardingV2.action) && L.f(this.content, onboardingV2.content);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @k
    public final Content getContent() {
        return this.content;
    }

    public int hashCode() {
        Action action = this.action;
        return this.content.hashCode() + ((action == null ? 0 : action.hashCode()) * 31);
    }

    @k
    public String toString() {
        return "OnboardingV2(action=" + this.action + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Action action = this.action;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, flags);
        }
        this.content.writeToParcel(parcel, flags);
    }

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video;", "video", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video;Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Image;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video;", "component4", "()Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Image;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video;Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Image;)Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video;", "getVideo", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Image;", "getImage", "Image", "Video", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Content implements Parcelable {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new Creator();

        @c("image")
        @l
        private final Image image;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        @c("video")
        @l
        private final Video video;

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Content> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Content createFromParcel(@k Parcel parcel) {
                return new Content(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Video.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        /* compiled from: VideoUploadParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Image;", "Landroid/os/Parcelable;", "", "value", "valueDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Image;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "getValueDark", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Image implements Parcelable {

            @k
            public static final Parcelable.Creator<Image> CREATOR = new Creator();

            @c("value")
            @k
            private final String value;

            @c("valueDark")
            @l
            private final String valueDark;

            /* compiled from: VideoUploadParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Image> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Image createFromParcel(@k Parcel parcel) {
                    return new Image(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Image[] newArray(int i12) {
                    return new Image[i12];
                }
            }

            public Image(@k String str, @l String str2) {
                this.value = str;
                this.valueDark = str2;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = image.value;
                }
                if ((i12 & 2) != 0) {
                    str2 = image.valueDark;
                }
                return image.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getValueDark() {
                return this.valueDark;
            }

            @k
            public final Image copy(@k String value, @l String valueDark) {
                return new Image(value, valueDark);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return L.f(this.value, image.value) && L.f(this.valueDark, image.valueDark);
            }

            @k
            public final String getValue() {
                return this.value;
            }

            @l
            public final String getValueDark() {
                return this.valueDark;
            }

            public int hashCode() {
                int iHashCode = this.value.hashCode() * 31;
                String str = this.valueDark;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Image(value=");
                sb2.append(this.value);
                sb2.append(", valueDark=");
                return C22026a.c(sb2, this.valueDark, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.value);
                parcel.writeString(this.valueDark);
            }
        }

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video$Thumbnail;", "thumbnail", "", "videoUrl", "videoUrlDark", "<init>", "(Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video$Thumbnail;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video$Thumbnail;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video$Thumbnail;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video$Thumbnail;", "getThumbnail", "Ljava/lang/String;", "getVideoUrl", "getVideoUrlDark", "Thumbnail", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Video implements Parcelable {

            @k
            public static final Parcelable.Creator<Video> CREATOR = new Creator();

            @c("thumbnail")
            @l
            private final Thumbnail thumbnail;

            @c("videoUrl")
            @l
            private final String videoUrl;

            @c("videoUrlDark")
            @l
            private final String videoUrlDark;

            /* compiled from: VideoUploadParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Video> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Video createFromParcel(@k Parcel parcel) {
                    return new Video(parcel.readInt() == 0 ? null : Thumbnail.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Video[] newArray(int i12) {
                    return new Video[i12];
                }
            }

            /* compiled from: VideoUploadParameter.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video$Thumbnail;", "Landroid/os/Parcelable;", "", "value", "valueDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/OnboardingV2$Content$Video$Thumbnail;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "getValueDark", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Thumbnail implements Parcelable {

                @k
                public static final Parcelable.Creator<Thumbnail> CREATOR = new Creator();

                @c("value")
                @k
                private final String value;

                @c("valueDark")
                @k
                private final String valueDark;

                /* compiled from: VideoUploadParameter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Thumbnail> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Thumbnail createFromParcel(@k Parcel parcel) {
                        return new Thumbnail(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Thumbnail[] newArray(int i12) {
                        return new Thumbnail[i12];
                    }
                }

                public Thumbnail(@k String str, @k String str2) {
                    this.value = str;
                    this.valueDark = str2;
                }

                public static /* synthetic */ Thumbnail copy$default(Thumbnail thumbnail, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = thumbnail.value;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = thumbnail.valueDark;
                    }
                    return thumbnail.copy(str, str2);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getValueDark() {
                    return this.valueDark;
                }

                @k
                public final Thumbnail copy(@k String value, @k String valueDark) {
                    return new Thumbnail(value, valueDark);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Thumbnail)) {
                        return false;
                    }
                    Thumbnail thumbnail = (Thumbnail) other;
                    return L.f(this.value, thumbnail.value) && L.f(this.valueDark, thumbnail.valueDark);
                }

                @k
                public final String getValue() {
                    return this.value;
                }

                @k
                public final String getValueDark() {
                    return this.valueDark;
                }

                public int hashCode() {
                    return this.valueDark.hashCode() + (this.value.hashCode() * 31);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Thumbnail(value=");
                    sb2.append(this.value);
                    sb2.append(", valueDark=");
                    return C22026a.c(sb2, this.valueDark, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.value);
                    parcel.writeString(this.valueDark);
                }
            }

            public Video(@l Thumbnail thumbnail, @l String str, @l String str2) {
                this.thumbnail = thumbnail;
                this.videoUrl = str;
                this.videoUrlDark = str2;
            }

            public static /* synthetic */ Video copy$default(Video video, Thumbnail thumbnail, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    thumbnail = video.thumbnail;
                }
                if ((i12 & 2) != 0) {
                    str = video.videoUrl;
                }
                if ((i12 & 4) != 0) {
                    str2 = video.videoUrlDark;
                }
                return video.copy(thumbnail, str, str2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Thumbnail getThumbnail() {
                return this.thumbnail;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getVideoUrl() {
                return this.videoUrl;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getVideoUrlDark() {
                return this.videoUrlDark;
            }

            @k
            public final Video copy(@l Thumbnail thumbnail, @l String videoUrl, @l String videoUrlDark) {
                return new Video(thumbnail, videoUrl, videoUrlDark);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return L.f(this.thumbnail, video.thumbnail) && L.f(this.videoUrl, video.videoUrl) && L.f(this.videoUrlDark, video.videoUrlDark);
            }

            @l
            public final Thumbnail getThumbnail() {
                return this.thumbnail;
            }

            @l
            public final String getVideoUrl() {
                return this.videoUrl;
            }

            @l
            public final String getVideoUrlDark() {
                return this.videoUrlDark;
            }

            public int hashCode() {
                Thumbnail thumbnail = this.thumbnail;
                int iHashCode = (thumbnail == null ? 0 : thumbnail.hashCode()) * 31;
                String str = this.videoUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.videoUrlDark;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Video(thumbnail=");
                sb2.append(this.thumbnail);
                sb2.append(", videoUrl=");
                sb2.append(this.videoUrl);
                sb2.append(", videoUrlDark=");
                return C22026a.c(sb2, this.videoUrlDark, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Thumbnail thumbnail = this.thumbnail;
                if (thumbnail == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    thumbnail.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.videoUrl);
                parcel.writeString(this.videoUrlDark);
            }
        }

        public Content(@k String str, @k String str2, @l Video video, @l Image image) {
            this.title = str;
            this.subtitle = str2;
            this.video = video;
            this.image = image;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, String str2, Video video, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = content.title;
            }
            if ((i12 & 2) != 0) {
                str2 = content.subtitle;
            }
            if ((i12 & 4) != 0) {
                video = content.video;
            }
            if ((i12 & 8) != 0) {
                image = content.image;
            }
            return content.copy(str, str2, video, image);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Video getVideo() {
            return this.video;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final Content copy(@k String title, @k String subtitle, @l Video video, @l Image image) {
            return new Content(title, subtitle, video, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return L.f(this.title, content.title) && L.f(this.subtitle, content.subtitle) && L.f(this.video, content.video) && L.f(this.image, content.image);
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final Video getVideo() {
            return this.video;
        }

        public int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.subtitle);
            Video video = this.video;
            int iHashCode = (iD2 + (video == null ? 0 : video.hashCode())) * 31;
            Image image = this.image;
            return iHashCode + (image != null ? image.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Content(title=" + this.title + ", subtitle=" + this.subtitle + ", video=" + this.video + ", image=" + this.image + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Video video = this.video;
            if (video == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                video.writeToParcel(parcel, flags);
            }
            Image image = this.image;
            if (image == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                image.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Content(String str, String str2, Video video, Image image, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : video, (i12 & 8) != 0 ? null : image);
        }
    }
}
