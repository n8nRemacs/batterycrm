package com.avito.android.remote.model.category_parameters.slot.user_verification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* compiled from: UserVerificationSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b3\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b5\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b8\u00109JÐ\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b<\u0010\"J\u0010\u0010=\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\u00192\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bC\u0010>J \u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bH\u0010IR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bQ\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bR\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\bV\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bW\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010X\u001a\u0004\bY\u0010.R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\b[\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\\\u001a\u0004\b]\u00102R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\\\u001a\u0004\b^\u00102R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\\\u001a\u0004\b_\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b`\u00102R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010a\u001a\u0004\b\u001a\u00107R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010b\u001a\u0004\bc\u00109¨\u0006d"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationStatus;", "status", "", "title", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/DefaultState;", "defaultState", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;", "waitingState", "unverifiedState", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/BlockedState;", "blockedState", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerifiedState;", "verifiedState", "errorMessage", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerificationField;", "verificationField", "Lcom/avito/android/deep_linking/links/DeepLink;", "verificationLink", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;", "agentNotStarted", "agentWaiting", "agentRecover", "agentUnverified", "", "isRedesign", "", "topMargin", "<init>", "(Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/DefaultState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/BlockedState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerifiedState;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerificationField;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationStatus;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/DefaultState;", "component4", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/BlockedState;", "component7", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerifiedState;", "component8", "component9", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerificationField;", "component10", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component11", "()Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;", "component12", "component13", "component14", "component15", "()Ljava/lang/Boolean;", "component16", "()Ljava/lang/Integer;", "copy", "(Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationStatus;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/DefaultState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/BlockedState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerifiedState;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerificationField;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationSlotConfig;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationStatus;", "getStatus", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/DefaultState;", "getDefaultState", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/Banner;", "getWaitingState", "getUnverifiedState", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/BlockedState;", "getBlockedState", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerifiedState;", "getVerifiedState", "getErrorMessage", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerificationField;", "getVerificationField", "Lcom/avito/android/deep_linking/links/DeepLink;", "getVerificationLink", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/AgentVerificationState;", "getAgentNotStarted", "getAgentWaiting", "getAgentRecover", "getAgentUnverified", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getTopMargin", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserVerificationSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<UserVerificationSlotConfig> CREATOR = new Creator();

    @c("agentNotStarted")
    @l
    private final AgentVerificationState agentNotStarted;

    @c("agentRecover")
    @l
    private final AgentVerificationState agentRecover;

    @c("agentUnverified")
    @l
    private final AgentVerificationState agentUnverified;

    @c("agentWaiting")
    @l
    private final AgentVerificationState agentWaiting;

    @c("blocked")
    @l
    private final BlockedState blockedState;

    @c("default")
    @l
    private final DefaultState defaultState;

    @c("errorMessage")
    @l
    private final String errorMessage;

    @c("isRedesign")
    @l
    private final Boolean isRedesign;

    @c("status")
    @l
    private final UserVerificationStatus status;

    @c("title")
    @l
    private final String title;

    @c("topMargin")
    @l
    private final Integer topMargin;

    @c("notAvailable")
    @l
    private final Banner unverifiedState;

    @c("verificationField")
    @l
    private final VerificationField verificationField;

    @c("verificationLink")
    @l
    private final DeepLink verificationLink;

    @c("verified")
    @l
    private final VerifiedState verifiedState;

    @c("waiting")
    @l
    private final Banner waitingState;

    /* compiled from: UserVerificationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserVerificationSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserVerificationSlotConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            UserVerificationStatus userVerificationStatusValueOf = parcel.readInt() == 0 ? null : UserVerificationStatus.valueOf(parcel.readString());
            String string = parcel.readString();
            DefaultState defaultStateCreateFromParcel = parcel.readInt() == 0 ? null : DefaultState.CREATOR.createFromParcel(parcel);
            Banner bannerCreateFromParcel = parcel.readInt() == 0 ? null : Banner.CREATOR.createFromParcel(parcel);
            Banner bannerCreateFromParcel2 = parcel.readInt() == 0 ? null : Banner.CREATOR.createFromParcel(parcel);
            BlockedState blockedStateCreateFromParcel = parcel.readInt() == 0 ? null : BlockedState.CREATOR.createFromParcel(parcel);
            VerifiedState verifiedStateCreateFromParcel = parcel.readInt() == 0 ? null : VerifiedState.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            VerificationField verificationFieldCreateFromParcel = parcel.readInt() == 0 ? null : VerificationField.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(UserVerificationSlotConfig.class.getClassLoader());
            AgentVerificationState agentVerificationStateCreateFromParcel = parcel.readInt() == 0 ? null : AgentVerificationState.CREATOR.createFromParcel(parcel);
            AgentVerificationState agentVerificationStateCreateFromParcel2 = parcel.readInt() == 0 ? null : AgentVerificationState.CREATOR.createFromParcel(parcel);
            AgentVerificationState agentVerificationStateCreateFromParcel3 = parcel.readInt() == 0 ? null : AgentVerificationState.CREATOR.createFromParcel(parcel);
            AgentVerificationState agentVerificationStateCreateFromParcel4 = parcel.readInt() == 0 ? null : AgentVerificationState.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserVerificationSlotConfig(userVerificationStatusValueOf, string, defaultStateCreateFromParcel, bannerCreateFromParcel, bannerCreateFromParcel2, blockedStateCreateFromParcel, verifiedStateCreateFromParcel, string2, verificationFieldCreateFromParcel, deepLink, agentVerificationStateCreateFromParcel, agentVerificationStateCreateFromParcel2, agentVerificationStateCreateFromParcel3, agentVerificationStateCreateFromParcel4, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserVerificationSlotConfig[] newArray(int i12) {
            return new UserVerificationSlotConfig[i12];
        }
    }

    public UserVerificationSlotConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UserVerificationStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final DeepLink getVerificationLink() {
        return this.verificationLink;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final AgentVerificationState getAgentNotStarted() {
        return this.agentNotStarted;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final AgentVerificationState getAgentWaiting() {
        return this.agentWaiting;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final AgentVerificationState getAgentRecover() {
        return this.agentRecover;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final AgentVerificationState getAgentUnverified() {
        return this.agentUnverified;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Boolean getIsRedesign() {
        return this.isRedesign;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DefaultState getDefaultState() {
        return this.defaultState;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Banner getWaitingState() {
        return this.waitingState;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Banner getUnverifiedState() {
        return this.unverifiedState;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BlockedState getBlockedState() {
        return this.blockedState;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final VerifiedState getVerifiedState() {
        return this.verifiedState;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final VerificationField getVerificationField() {
        return this.verificationField;
    }

    @k
    public final UserVerificationSlotConfig copy(@l UserVerificationStatus status, @l String title, @l DefaultState defaultState, @l Banner waitingState, @l Banner unverifiedState, @l BlockedState blockedState, @l VerifiedState verifiedState, @l String errorMessage, @l VerificationField verificationField, @l DeepLink verificationLink, @l AgentVerificationState agentNotStarted, @l AgentVerificationState agentWaiting, @l AgentVerificationState agentRecover, @l AgentVerificationState agentUnverified, @l Boolean isRedesign, @l Integer topMargin) {
        return new UserVerificationSlotConfig(status, title, defaultState, waitingState, unverifiedState, blockedState, verifiedState, errorMessage, verificationField, verificationLink, agentNotStarted, agentWaiting, agentRecover, agentUnverified, isRedesign, topMargin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserVerificationSlotConfig)) {
            return false;
        }
        UserVerificationSlotConfig userVerificationSlotConfig = (UserVerificationSlotConfig) other;
        return this.status == userVerificationSlotConfig.status && L.f(this.title, userVerificationSlotConfig.title) && L.f(this.defaultState, userVerificationSlotConfig.defaultState) && L.f(this.waitingState, userVerificationSlotConfig.waitingState) && L.f(this.unverifiedState, userVerificationSlotConfig.unverifiedState) && L.f(this.blockedState, userVerificationSlotConfig.blockedState) && L.f(this.verifiedState, userVerificationSlotConfig.verifiedState) && L.f(this.errorMessage, userVerificationSlotConfig.errorMessage) && L.f(this.verificationField, userVerificationSlotConfig.verificationField) && L.f(this.verificationLink, userVerificationSlotConfig.verificationLink) && L.f(this.agentNotStarted, userVerificationSlotConfig.agentNotStarted) && L.f(this.agentWaiting, userVerificationSlotConfig.agentWaiting) && L.f(this.agentRecover, userVerificationSlotConfig.agentRecover) && L.f(this.agentUnverified, userVerificationSlotConfig.agentUnverified) && L.f(this.isRedesign, userVerificationSlotConfig.isRedesign) && L.f(this.topMargin, userVerificationSlotConfig.topMargin);
    }

    @l
    public final AgentVerificationState getAgentNotStarted() {
        return this.agentNotStarted;
    }

    @l
    public final AgentVerificationState getAgentRecover() {
        return this.agentRecover;
    }

    @l
    public final AgentVerificationState getAgentUnverified() {
        return this.agentUnverified;
    }

    @l
    public final AgentVerificationState getAgentWaiting() {
        return this.agentWaiting;
    }

    @l
    public final BlockedState getBlockedState() {
        return this.blockedState;
    }

    @l
    public final DefaultState getDefaultState() {
        return this.defaultState;
    }

    @l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    public final UserVerificationStatus getStatus() {
        return this.status;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @l
    public final Banner getUnverifiedState() {
        return this.unverifiedState;
    }

    @l
    public final VerificationField getVerificationField() {
        return this.verificationField;
    }

    @l
    public final DeepLink getVerificationLink() {
        return this.verificationLink;
    }

    @l
    public final VerifiedState getVerifiedState() {
        return this.verifiedState;
    }

    @l
    public final Banner getWaitingState() {
        return this.waitingState;
    }

    public int hashCode() {
        UserVerificationStatus userVerificationStatus = this.status;
        int iHashCode = (userVerificationStatus == null ? 0 : userVerificationStatus.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DefaultState defaultState = this.defaultState;
        int iHashCode3 = (iHashCode2 + (defaultState == null ? 0 : defaultState.hashCode())) * 31;
        Banner banner = this.waitingState;
        int iHashCode4 = (iHashCode3 + (banner == null ? 0 : banner.hashCode())) * 31;
        Banner banner2 = this.unverifiedState;
        int iHashCode5 = (iHashCode4 + (banner2 == null ? 0 : banner2.hashCode())) * 31;
        BlockedState blockedState = this.blockedState;
        int iHashCode6 = (iHashCode5 + (blockedState == null ? 0 : blockedState.hashCode())) * 31;
        VerifiedState verifiedState = this.verifiedState;
        int iHashCode7 = (iHashCode6 + (verifiedState == null ? 0 : verifiedState.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VerificationField verificationField = this.verificationField;
        int iHashCode9 = (iHashCode8 + (verificationField == null ? 0 : verificationField.hashCode())) * 31;
        DeepLink deepLink = this.verificationLink;
        int iHashCode10 = (iHashCode9 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AgentVerificationState agentVerificationState = this.agentNotStarted;
        int iHashCode11 = (iHashCode10 + (agentVerificationState == null ? 0 : agentVerificationState.hashCode())) * 31;
        AgentVerificationState agentVerificationState2 = this.agentWaiting;
        int iHashCode12 = (iHashCode11 + (agentVerificationState2 == null ? 0 : agentVerificationState2.hashCode())) * 31;
        AgentVerificationState agentVerificationState3 = this.agentRecover;
        int iHashCode13 = (iHashCode12 + (agentVerificationState3 == null ? 0 : agentVerificationState3.hashCode())) * 31;
        AgentVerificationState agentVerificationState4 = this.agentUnverified;
        int iHashCode14 = (iHashCode13 + (agentVerificationState4 == null ? 0 : agentVerificationState4.hashCode())) * 31;
        Boolean bool = this.isRedesign;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.topMargin;
        return iHashCode15 + (num != null ? num.hashCode() : 0);
    }

    @l
    public final Boolean isRedesign() {
        return this.isRedesign;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserVerificationSlotConfig(status=");
        sb2.append(this.status);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", defaultState=");
        sb2.append(this.defaultState);
        sb2.append(", waitingState=");
        sb2.append(this.waitingState);
        sb2.append(", unverifiedState=");
        sb2.append(this.unverifiedState);
        sb2.append(", blockedState=");
        sb2.append(this.blockedState);
        sb2.append(", verifiedState=");
        sb2.append(this.verifiedState);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", verificationField=");
        sb2.append(this.verificationField);
        sb2.append(", verificationLink=");
        sb2.append(this.verificationLink);
        sb2.append(", agentNotStarted=");
        sb2.append(this.agentNotStarted);
        sb2.append(", agentWaiting=");
        sb2.append(this.agentWaiting);
        sb2.append(", agentRecover=");
        sb2.append(this.agentRecover);
        sb2.append(", agentUnverified=");
        sb2.append(this.agentUnverified);
        sb2.append(", isRedesign=");
        sb2.append(this.isRedesign);
        sb2.append(", topMargin=");
        return s.j(sb2, this.topMargin, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        UserVerificationStatus userVerificationStatus = this.status;
        if (userVerificationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(userVerificationStatus.name());
        }
        parcel.writeString(this.title);
        DefaultState defaultState = this.defaultState;
        if (defaultState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            defaultState.writeToParcel(parcel, flags);
        }
        Banner banner = this.waitingState;
        if (banner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            banner.writeToParcel(parcel, flags);
        }
        Banner banner2 = this.unverifiedState;
        if (banner2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            banner2.writeToParcel(parcel, flags);
        }
        BlockedState blockedState = this.blockedState;
        if (blockedState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blockedState.writeToParcel(parcel, flags);
        }
        VerifiedState verifiedState = this.verifiedState;
        if (verifiedState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verifiedState.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.errorMessage);
        VerificationField verificationField = this.verificationField;
        if (verificationField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationField.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.verificationLink, flags);
        AgentVerificationState agentVerificationState = this.agentNotStarted;
        if (agentVerificationState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            agentVerificationState.writeToParcel(parcel, flags);
        }
        AgentVerificationState agentVerificationState2 = this.agentWaiting;
        if (agentVerificationState2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            agentVerificationState2.writeToParcel(parcel, flags);
        }
        AgentVerificationState agentVerificationState3 = this.agentRecover;
        if (agentVerificationState3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            agentVerificationState3.writeToParcel(parcel, flags);
        }
        AgentVerificationState agentVerificationState4 = this.agentUnverified;
        if (agentVerificationState4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            agentVerificationState4.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isRedesign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num = this.topMargin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }

    public UserVerificationSlotConfig(@l UserVerificationStatus userVerificationStatus, @l String str, @l DefaultState defaultState, @l Banner banner, @l Banner banner2, @l BlockedState blockedState, @l VerifiedState verifiedState, @l String str2, @l VerificationField verificationField, @l DeepLink deepLink, @l AgentVerificationState agentVerificationState, @l AgentVerificationState agentVerificationState2, @l AgentVerificationState agentVerificationState3, @l AgentVerificationState agentVerificationState4, @l Boolean bool, @l Integer num) {
        this.status = userVerificationStatus;
        this.title = str;
        this.defaultState = defaultState;
        this.waitingState = banner;
        this.unverifiedState = banner2;
        this.blockedState = blockedState;
        this.verifiedState = verifiedState;
        this.errorMessage = str2;
        this.verificationField = verificationField;
        this.verificationLink = deepLink;
        this.agentNotStarted = agentVerificationState;
        this.agentWaiting = agentVerificationState2;
        this.agentRecover = agentVerificationState3;
        this.agentUnverified = agentVerificationState4;
        this.isRedesign = bool;
        this.topMargin = num;
    }

    public /* synthetic */ UserVerificationSlotConfig(UserVerificationStatus userVerificationStatus, String str, DefaultState defaultState, Banner banner, Banner banner2, BlockedState blockedState, VerifiedState verifiedState, String str2, VerificationField verificationField, DeepLink deepLink, AgentVerificationState agentVerificationState, AgentVerificationState agentVerificationState2, AgentVerificationState agentVerificationState3, AgentVerificationState agentVerificationState4, Boolean bool, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : userVerificationStatus, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : defaultState, (i12 & 8) != 0 ? null : banner, (i12 & 16) != 0 ? null : banner2, (i12 & 32) != 0 ? null : blockedState, (i12 & 64) != 0 ? null : verifiedState, (i12 & 128) != 0 ? null : str2, (i12 & 256) != 0 ? null : verificationField, (i12 & 512) != 0 ? null : deepLink, (i12 & 1024) != 0 ? null : agentVerificationState, (i12 & 2048) != 0 ? null : agentVerificationState2, (i12 & 4096) != 0 ? null : agentVerificationState3, (i12 & 8192) != 0 ? null : agentVerificationState4, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool, (i12 & 32768) != 0 ? null : num);
    }
}
