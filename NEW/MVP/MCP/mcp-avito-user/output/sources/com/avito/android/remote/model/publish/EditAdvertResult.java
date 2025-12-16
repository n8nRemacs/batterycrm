package com.avito.android.remote.model.publish;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: EditAdvertResult.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/publish/EditAdvertResult;", "Landroid/os/Parcelable;", "InputErrors", "NeedSupport", "Ok", "Lcom/avito/android/remote/model/publish/EditAdvertResult$InputErrors;", "Lcom/avito/android/remote/model/publish/EditAdvertResult$NeedSupport;", "Lcom/avito/android/remote/model/publish/EditAdvertResult$Ok;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface EditAdvertResult extends Parcelable {

    /* compiled from: EditAdvertResult.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/publish/EditAdvertResult$InputErrors;", "Lcom/avito/android/remote/model/publish/EditAdvertResult;", "Lcom/avito/android/remote/model/PretendResult;", "messages", "<init>", "(Lcom/avito/android/remote/model/PretendResult;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/PretendResult;", "getMessages", "()Lcom/avito/android/remote/model/PretendResult;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputErrors implements EditAdvertResult {

        @k
        public static final Parcelable.Creator<InputErrors> CREATOR = new Creator();

        @c("messages")
        @l
        private final PretendResult messages;

        /* compiled from: EditAdvertResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputErrors> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InputErrors createFromParcel(@k Parcel parcel) {
                return new InputErrors((PretendResult) parcel.readParcelable(InputErrors.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InputErrors[] newArray(int i12) {
                return new InputErrors[i12];
            }
        }

        public InputErrors(@l PretendResult pretendResult) {
            this.messages = pretendResult;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final PretendResult getMessages() {
            return this.messages;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.messages, flags);
        }
    }

    /* compiled from: EditAdvertResult.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/publish/EditAdvertResult$NeedSupport;", "Lcom/avito/android/remote/model/publish/EditAdvertResult;", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NeedSupport implements EditAdvertResult {

        @k
        public static final Parcelable.Creator<NeedSupport> CREATOR = new Creator();

        @c("action")
        @k
        private final Action action;

        /* compiled from: EditAdvertResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NeedSupport> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NeedSupport createFromParcel(@k Parcel parcel) {
                return new NeedSupport((Action) parcel.readParcelable(NeedSupport.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NeedSupport[] newArray(int i12) {
                return new NeedSupport[i12];
            }
        }

        public NeedSupport(@k Action action) {
            this.action = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final Action getAction() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.action, flags);
        }
    }

    /* compiled from: EditAdvertResult.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/publish/EditAdvertResult$Ok;", "Lcom/avito/android/remote/model/publish/EditAdvertResult;", "", "message", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements EditAdvertResult {

        @k
        public static final Parcelable.Creator<Ok> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        @c("message")
        @k
        private final String message;

        /* compiled from: EditAdvertResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ok> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Ok createFromParcel(@k Parcel parcel) {
                return new Ok(parcel.readString(), (DeepLink) parcel.readParcelable(Ok.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Ok[] newArray(int i12) {
                return new Ok[i12];
            }
        }

        public Ok(@k String str, @l DeepLink deepLink) {
            this.message = str;
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

        @k
        public final String getMessage() {
            return this.message;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.message);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }
}
