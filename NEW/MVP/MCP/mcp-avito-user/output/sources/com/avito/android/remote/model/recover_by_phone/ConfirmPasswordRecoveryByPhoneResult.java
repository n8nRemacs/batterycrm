package com.avito.android.remote.model.recover_by_phone;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "", "Deeplink", "ErrorDialog", "Failure", "IncorrectData", "NeedConfirm3fa", "Ok", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$Deeplink;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$ErrorDialog;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$Failure;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$IncorrectData;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$NeedConfirm3fa;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$Ok;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ConfirmPasswordRecoveryByPhoneResult {

    /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$Deeplink;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Deeplink implements ConfirmPasswordRecoveryByPhoneResult {

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        public Deeplink(@k DeepLink deepLink) {
            this.deeplink = deepLink;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$ErrorDialog;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "dialog", "Lcom/avito/android/remote/model/UserDialog;", "(Lcom/avito/android/remote/model/UserDialog;)V", "getDialog", "()Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorDialog implements ConfirmPasswordRecoveryByPhoneResult {

        @c("userDialog")
        @k
        private final UserDialog dialog;

        public ErrorDialog(@k UserDialog userDialog) {
            this.dialog = userDialog;
        }

        @k
        public final UserDialog getDialog() {
            return this.dialog;
        }
    }

    /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$Failure;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure implements ConfirmPasswordRecoveryByPhoneResult {

        @c("message")
        @k
        private final String message;

        public Failure(@k String str) {
            this.message = str;
        }

        @k
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$IncorrectData;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "messages", "", "", "(Ljava/util/Map;)V", "getMessages", "()Ljava/util/Map;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IncorrectData implements ConfirmPasswordRecoveryByPhoneResult {

        @c("messages")
        @k
        private final Map<String, String> messages;

        public IncorrectData(@k Map<String, String> map) {
            this.messages = map;
        }

        @k
        public final Map<String, String> getMessages() {
            return this.messages;
        }
    }

    /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$NeedConfirm3fa;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "emailList", "", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$NeedConfirm3fa$Email;", "(Ljava/util/List;)V", "getEmailList", "()Ljava/util/List;", "Email", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NeedConfirm3fa implements ConfirmPasswordRecoveryByPhoneResult {

        @c("emailList")
        @k
        private final List<Email> emailList;

        /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$NeedConfirm3fa$Email;", "Landroid/os/Parcelable;", "", "serverId", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$NeedConfirm3fa$Email;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getServerId", "getLabel", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Email implements Parcelable {

            @k
            public static final Parcelable.Creator<Email> CREATOR = new Creator();

            @c("label")
            @k
            private final String label;

            @c("id")
            @k
            private final String serverId;

            /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Email> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Email createFromParcel(@k Parcel parcel) {
                    return new Email(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Email[] newArray(int i12) {
                    return new Email[i12];
                }
            }

            public Email(@k String str, @k String str2) {
                this.serverId = str;
                this.label = str2;
            }

            public static /* synthetic */ Email copy$default(Email email, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = email.serverId;
                }
                if ((i12 & 2) != 0) {
                    str2 = email.label;
                }
                return email.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getServerId() {
                return this.serverId;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @k
            public final Email copy(@k String serverId, @k String label) {
                return new Email(serverId, label);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Email)) {
                    return false;
                }
                Email email = (Email) other;
                return L.f(this.serverId, email.serverId) && L.f(this.label, email.label);
            }

            @k
            public final String getLabel() {
                return this.label;
            }

            @k
            public final String getServerId() {
                return this.serverId;
            }

            public int hashCode() {
                return this.label.hashCode() + (this.serverId.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Email(serverId=");
                sb2.append(this.serverId);
                sb2.append(", label=");
                return C22026a.c(sb2, this.label, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.serverId);
                parcel.writeString(this.label);
            }
        }

        public NeedConfirm3fa(@k List<Email> list) {
            this.emailList = list;
        }

        @k
        public final List<Email> getEmailList() {
            return this.emailList;
        }
    }

    /* compiled from: ConfirmPasswordRecoveryByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult$Ok;", "Lcom/avito/android/remote/model/recover_by_phone/ConfirmPasswordRecoveryByPhoneResult;", "hash", "", "(Ljava/lang/String;)V", "getHash", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements ConfirmPasswordRecoveryByPhoneResult {

        @c("hash")
        @k
        private final String hash;

        public Ok(@k String str) {
            this.hash = str;
        }

        @k
        public final String getHash() {
            return this.hash;
        }
    }
}
