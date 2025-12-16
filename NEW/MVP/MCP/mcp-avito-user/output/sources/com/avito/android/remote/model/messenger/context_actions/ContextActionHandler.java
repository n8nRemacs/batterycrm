package com.avito.android.remote.model.messenger.context_actions;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContextActionHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "Landroid/os/Parcelable;", "()V", "Link", "MethodCall", "Unknown", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$Link;", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$Unknown;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ContextActionHandler implements Parcelable {

    /* compiled from: ContextActionHandler.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$Link;", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "", "link", Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$Link;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLink", "getDeepLink", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Link extends ContextActionHandler {

        @k
        public static final String DEEPLINK = "deepLink";

        @k
        public static final String TYPE = "link";

        @k
        public static final String URL = "url";

        @c(DEEPLINK)
        @l
        private final String deepLink;

        @c(URL)
        @k
        private final String link;

        @k
        public static final Parcelable.Creator<Link> CREATOR = new Creator();

        /* compiled from: ContextActionHandler.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Link> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Link createFromParcel(@k Parcel parcel) {
                return new Link(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Link[] newArray(int i12) {
                return new Link[i12];
            }
        }

        public Link(@k String str, @l String str2) {
            super(null);
            this.link = str;
            this.deepLink = str2;
        }

        public static /* synthetic */ Link copy$default(Link link, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = link.link;
            }
            if ((i12 & 2) != 0) {
                str2 = link.deepLink;
            }
            return link.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        @k
        public final Link copy(@k String link, @l String deepLink) {
            return new Link(link, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return L.f(this.link, link.link) && L.f(this.deepLink, link.deepLink);
        }

        @l
        public final String getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            int iHashCode = this.link.hashCode() * 31;
            String str = this.deepLink;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Link(link=");
            sb2.append(this.link);
            sb2.append(", deepLink=");
            return C22026a.c(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.link);
            parcel.writeString(this.deepLink);
        }
    }

    /* compiled from: ContextActionHandler.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002()B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "", "method", "Lcom/avito/android/remote/model/RawJson;", "params", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall$Reaction;", MethodCall.REACTION, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/RawJson;Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall$Reaction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/RawJson;", "component3", "()Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall$Reaction;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/RawJson;Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall$Reaction;)Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMethod", "Lcom/avito/android/remote/model/RawJson;", "getParams", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall$Reaction;", "getReaction", "Companion", "Reaction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class MethodCall extends ContextActionHandler {

        @k
        public static final String METHOD = "method";

        @k
        public static final String PARAMS = "params";

        @k
        public static final String REACTION = "reaction";

        @k
        public static final String TYPE = "method_call";

        @c("method")
        @k
        private final String method;

        @c("params")
        @l
        private final RawJson params;

        @c(REACTION)
        @l
        private final Reaction reaction;

        @k
        public static final Parcelable.Creator<MethodCall> CREATOR = new Creator();

        /* compiled from: ContextActionHandler.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MethodCall> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MethodCall createFromParcel(@k Parcel parcel) {
                return new MethodCall(parcel.readString(), parcel.readInt() == 0 ? null : RawJson.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Reaction.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MethodCall[] newArray(int i12) {
                return new MethodCall[i12];
            }
        }

        /* compiled from: ContextActionHandler.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall$Reaction;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$MethodCall$Reaction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Reaction implements Parcelable {

            @k
            public static final String TEXT = "text";

            @c("text")
            @k
            private final String text;

            @k
            public static final Parcelable.Creator<Reaction> CREATOR = new Creator();

            /* compiled from: ContextActionHandler.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Reaction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Reaction createFromParcel(@k Parcel parcel) {
                    return new Reaction(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Reaction[] newArray(int i12) {
                    return new Reaction[i12];
                }
            }

            public Reaction(@k String str) {
                this.text = str;
            }

            public static /* synthetic */ Reaction copy$default(Reaction reaction, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = reaction.text;
                }
                return reaction.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            public final Reaction copy(@k String text) {
                return new Reaction(text);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Reaction) && L.f(this.text, ((Reaction) other).text);
            }

            @k
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("Reaction(text="), this.text, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
            }
        }

        public MethodCall(@k String str, @l RawJson rawJson, @l Reaction reaction) {
            super(null);
            this.method = str;
            this.params = rawJson;
            this.reaction = reaction;
        }

        public static /* synthetic */ MethodCall copy$default(MethodCall methodCall, String str, RawJson rawJson, Reaction reaction, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = methodCall.method;
            }
            if ((i12 & 2) != 0) {
                rawJson = methodCall.params;
            }
            if ((i12 & 4) != 0) {
                reaction = methodCall.reaction;
            }
            return methodCall.copy(str, rawJson, reaction);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final RawJson getParams() {
            return this.params;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Reaction getReaction() {
            return this.reaction;
        }

        @k
        public final MethodCall copy(@k String method, @l RawJson params, @l Reaction reaction) {
            return new MethodCall(method, params, reaction);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MethodCall)) {
                return false;
            }
            MethodCall methodCall = (MethodCall) other;
            return L.f(this.method, methodCall.method) && L.f(this.params, methodCall.params) && L.f(this.reaction, methodCall.reaction);
        }

        @k
        public final String getMethod() {
            return this.method;
        }

        @l
        public final RawJson getParams() {
            return this.params;
        }

        @l
        public final Reaction getReaction() {
            return this.reaction;
        }

        public int hashCode() {
            int iHashCode = this.method.hashCode() * 31;
            RawJson rawJson = this.params;
            int iHashCode2 = (iHashCode + (rawJson == null ? 0 : rawJson.hashCode())) * 31;
            Reaction reaction = this.reaction;
            return iHashCode2 + (reaction != null ? reaction.hashCode() : 0);
        }

        @k
        public String toString() {
            return "MethodCall(method=" + this.method + ", params=" + this.params + ", reaction=" + this.reaction + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.method);
            RawJson rawJson = this.params;
            if (rawJson == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                rawJson.writeToParcel(parcel, flags);
            }
            Reaction reaction = this.reaction;
            if (reaction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                reaction.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ContextActionHandler.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler$Unknown;", "Lcom/avito/android/remote/model/messenger/context_actions/ContextActionHandler;", "<init>", "()V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unknown extends ContextActionHandler {

        @k
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        /* compiled from: ContextActionHandler.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Unknown createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return new Unknown();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Unknown[] newArray(int i12) {
                return new Unknown[i12];
            }
        }

        public Unknown() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            return this == other;
        }

        public int hashCode() {
            return System.identityHashCode(this);
        }

        @k
        public String toString() {
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ContextActionHandler(C42822w c42822w) {
        this();
    }

    private ContextActionHandler() {
    }
}
