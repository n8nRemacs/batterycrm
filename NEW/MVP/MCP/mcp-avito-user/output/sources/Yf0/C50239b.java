package yf0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import com.avito.android.mandatory_verification.items.accountVerification.MandatoryVerificationAccountVerificationItem;
import com.avito.android.publish.items.button.DeepLinkActionButtonItem;
import com.avito.android.publish.slots.user_verification.UserVerificationError;
import com.avito.android.publish.slots.user_verification.banner.UserVerificationBannerItem;
import com.avito.android.publish.slots.user_verification.title.UserVerificationTitleItem;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.user_verification.AgentVerificationState;
import com.avito.android.remote.model.category_parameters.slot.user_verification.Banner;
import com.avito.android.remote.model.category_parameters.slot.user_verification.BlockedState;
import com.avito.android.remote.model.category_parameters.slot.user_verification.Button;
import com.avito.android.remote.model.category_parameters.slot.user_verification.DefaultState;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationStatus;
import com.avito.android.remote.model.category_parameters.slot.user_verification.VerifiedState;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserVerificationSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lyf0/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationSlot;", "Lcom/avito/android/publish/slots/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50239b extends k<UserVerificationSlot> implements com.avito.android.publish.slots.k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UserVerificationSlot f443426b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public UserVerificationStatus f443427c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f443428d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<f> f443429e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f443430f;

    /* compiled from: UserVerificationSlotWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yf0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f443431a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f443432b;

        static {
            int[] iArr = new int[UserVerificationStatus.values().length];
            try {
                iArr[UserVerificationStatus.Waiting.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserVerificationStatus.Unverified.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserVerificationStatus.Recover.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserVerificationStatus.Default.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserVerificationStatus.Verified.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserVerificationStatus.Blocked.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f443431a = iArr;
            int[] iArr2 = new int[AgentVerificationState.Benefit.Icon.values().length];
            try {
                iArr2[AgentVerificationState.Benefit.Icon.VAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AgentVerificationState.Benefit.Icon.ITEM_RICH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f443432b = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    @i31.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50239b(@i31.InterfaceC41220a @Y61.k com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlot r17, @Y61.k com.avito.android.deeplink_handler.handler.composite.a r18) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.C50239b.<init>(com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlot, com.avito.android.deeplink_handler.handler.composite.a):void");
    }

    public static IntermediaryVerificationData.Button l(AgentVerificationState.Button button) {
        String title = button.getTitle();
        DeepLink link = button.getLink();
        String style = button.getStyle();
        Boolean enabled = button.getEnabled();
        return new IntermediaryVerificationData.Button(link, title, style, enabled != null ? enabled.booleanValue() : true);
    }

    public static UserVerificationBannerItem m(Banner banner) {
        return new UserVerificationBannerItem(String.valueOf(banner.hashCode()), banner.getTitle(), banner.getText(), banner.getIconName(), banner.getIconColor(), banner.getBackgroundColor());
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<f> a() {
        return this.f443430f;
    }

    @Override // com.avito.android.publish.slots.k
    public final boolean b() {
        return ((UserVerificationSlotConfig) this.f443426b.getWidget().getConfig()).getStatus() != UserVerificationStatus.Blocked;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        UserVerificationStatus userVerificationStatus = this.f443427c;
        boolean z12 = userVerificationStatus == UserVerificationStatus.Default || userVerificationStatus == UserVerificationStatus.Recover;
        this.f443428d = z12;
        return z.c0(z12 ? new P2.a(new UserVerificationError()) : new P2.b(new SuccessResult(null)));
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f443426b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        this.f443429e.accept(new f.a(SlotType.USER_VERIFICATION, this.f443426b));
        return super.h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        ArrayList arrayList;
        String errorMessage;
        BlockedState blockedState;
        UserVerificationSlot userVerificationSlot = this.f443426b;
        if (L.f(((UserVerificationSlotConfig) userVerificationSlot.getWidget().getConfig()).isRedesign(), Boolean.TRUE)) {
            arrayList = new ArrayList();
            UserVerificationSlotConfig userVerificationSlotConfig = (UserVerificationSlotConfig) userVerificationSlot.getWidget().getConfig();
            UserVerificationStatus status = userVerificationSlotConfig.getStatus();
            this.f443427c = status;
            switch (status != null ? a.f443431a[status.ordinal()] : -1) {
                case 1:
                    Banner waitingState = userVerificationSlotConfig.getWaitingState();
                    if (waitingState != null) {
                        String id2 = userVerificationSlot.getId();
                        String redesignTitle = waitingState.getRedesignTitle();
                        String str = redesignTitle == null ? "" : redesignTitle;
                        String redesignDescription = waitingState.getRedesignDescription();
                        arrayList.add(new MandatoryVerificationAccountVerificationItem(id2, str, redesignDescription == null ? "" : redesignDescription, null, true, null, userVerificationSlotConfig.getTopMargin()));
                        break;
                    }
                    break;
                case 2:
                    Banner unverifiedState = userVerificationSlotConfig.getUnverifiedState();
                    if (unverifiedState != null) {
                        arrayList.add(m(unverifiedState));
                        break;
                    }
                    break;
                case 3:
                case 4:
                    DefaultState defaultState = userVerificationSlotConfig.getDefaultState();
                    if (defaultState != null) {
                        String id3 = userVerificationSlot.getId();
                        String redesignTitle2 = defaultState.getRedesignTitle();
                        String str2 = redesignTitle2 == null ? "" : redesignTitle2;
                        String redesignDescription2 = defaultState.getRedesignDescription();
                        String str3 = redesignDescription2 == null ? "" : redesignDescription2;
                        MandatoryVerificationAccountVerificationItem.Button button = new MandatoryVerificationAccountVerificationItem.Button(defaultState.getButton().getTitle(), defaultState.getButton().getLink(), defaultState.getButton().getStyle());
                        String errorMessage2 = userVerificationSlotConfig.getErrorMessage();
                        arrayList.add(new MandatoryVerificationAccountVerificationItem(id3, str2, str3, button, false, (errorMessage2 == null || !(this.f443428d || this.f443427c == UserVerificationStatus.Recover)) ? null : errorMessage2, userVerificationSlotConfig.getTopMargin()));
                        break;
                    }
                    break;
                case 5:
                    VerifiedState verifiedState = userVerificationSlotConfig.getVerifiedState();
                    if (verifiedState != null) {
                        arrayList.add(new MandatoryVerificationAccountVerificationItem(userVerificationSlot.getId(), verifiedState.getTitle(), verifiedState.getDescription(), null, true, null, userVerificationSlotConfig.getTopMargin()));
                        break;
                    }
                    break;
                case 6:
                    BlockedState blockedState2 = userVerificationSlotConfig.getBlockedState();
                    if (blockedState2 != null) {
                        arrayList.add(new com.avito.android.publish.slots.user_verification.blocker.c(blockedState2.getTitle(), blockedState2.getText(), blockedState2.getSupportText(), String.valueOf(blockedState2.hashCode()), blockedState2.getImage(), blockedState2.getButtonText()));
                        break;
                    }
                    break;
            }
        } else {
            arrayList = new ArrayList();
            UserVerificationSlotConfig userVerificationSlotConfig2 = (UserVerificationSlotConfig) userVerificationSlot.getWidget().getConfig();
            UserVerificationStatus status2 = userVerificationSlotConfig2.getStatus();
            this.f443427c = status2;
            int i12 = status2 != null ? a.f443431a[status2.ordinal()] : -1;
            if (i12 == 1) {
                String title = userVerificationSlotConfig2.getTitle();
                if (title != null) {
                    arrayList.add(new UserVerificationTitleItem(String.valueOf(title.hashCode()), title));
                }
                Banner waitingState2 = userVerificationSlotConfig2.getWaitingState();
                if (waitingState2 != null) {
                    arrayList.add(m(waitingState2));
                }
            } else if (i12 == 2) {
                Banner unverifiedState2 = userVerificationSlotConfig2.getUnverifiedState();
                if (unverifiedState2 != null) {
                    arrayList.add(m(unverifiedState2));
                }
            } else if (i12 == 3 || i12 == 4) {
                String title2 = userVerificationSlotConfig2.getTitle();
                if (title2 != null) {
                    arrayList.add(new UserVerificationTitleItem(String.valueOf(title2.hashCode()), title2));
                }
                DefaultState defaultState2 = userVerificationSlotConfig2.getDefaultState();
                if (defaultState2 != null) {
                    String text = defaultState2.getText();
                    arrayList.add(new com.avito.android.publish.slots.user_verification.subtitle.c(String.valueOf(text.hashCode()), text));
                    Button button2 = defaultState2.getButton();
                    arrayList.add(new DeepLinkActionButtonItem(String.valueOf(button2.hashCode()), button2.getStyle(), button2.getTitle(), button2.getLink()));
                }
            } else if (i12 == 6 && (blockedState = userVerificationSlotConfig2.getBlockedState()) != null) {
                arrayList.add(new com.avito.android.publish.slots.user_verification.blocker.c(blockedState.getTitle(), blockedState.getText(), blockedState.getSupportText(), String.valueOf(blockedState.hashCode()), blockedState.getImage(), blockedState.getButtonText()));
            }
            if (this.f443428d && (errorMessage = userVerificationSlotConfig2.getErrorMessage()) != null) {
                arrayList.add(new com.avito.android.publish.slots.user_verification.error.c(String.valueOf(errorMessage.hashCode()), errorMessage));
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}
