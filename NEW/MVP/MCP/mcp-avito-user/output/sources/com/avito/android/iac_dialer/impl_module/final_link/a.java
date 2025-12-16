package com.avito.android.iac_dialer.impl_module.final_link;

import Y61.k;
import android.content.Context;
import android.text.format.DateUtils;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage;
import com.avito.android.iac_dialer_finished.public_module.messenger_link.OpenChannelIfExistLink;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.AutomaticGsmClickSource;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiLong;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiMapStringString;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.iac_dialer_root.public_module.deeplink.IacLauncherIntentLink;
import com.avito.android.remote.model.Image;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacFinalLinkInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/a;", "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements IacFinalLinkInteractor {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C4921a f166002i = new C4921a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f166003a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IacMetaInfoStorage f166004b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final nt.f f166005c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.api.a f166006d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.splitter.features.a f166007e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final HK.a f166008f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f166009g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.app_foreground_provider.util_module.a f166010h;

    /* compiled from: IacFinalLinkInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/final_link/a$a;", "", "<init>", "()V", "", "FINAL_LINK_LOADING_TIMEOUT_MILLIS", "J", "FINISHED_FALLBACK_SCREEN_CLOSING_TIMEOUT_SEC", "MIN_CALL_DURATION_TO_FEEDBACK_MILLIS", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.final_link.a$a, reason: collision with other inner class name */
    public static final class C4921a {
        public /* synthetic */ C4921a(C42822w c42822w) {
            this();
        }

        public static final void a(C4921a c4921a, String str) {
            c4921a.getClass();
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacFinalLinkInteractor", str, null);
        }

        public C4921a() {
        }
    }

    /* compiled from: IacFinalLinkInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166011a;

        static {
            int[] iArr = new int[IacCallDirection.values().length];
            try {
                iArr[IacCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166011a = iArr;
        }
    }

    @Inject
    public a(@k Context context, @k IacMetaInfoStorage iacMetaInfoStorage, @k nt.f fVar, @k com.avito.android.iac_dialer.impl_module.api.a aVar, @k com.avito.android.iac_dialer.impl_module.splitter.features.a aVar2, @k HK.a aVar3, @k com.avito.android.server_time.f fVar2, @k com.avito.android.app_foreground_provider.util_module.a aVar4) {
        this.f166003a = context;
        this.f166004b = iacMetaInfoStorage;
        this.f166005c = fVar;
        this.f166006d = aVar;
        this.f166007e = aVar2;
        this.f166008f = aVar3;
        this.f166009g = fVar2;
        this.f166010h = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.avito.android.deep_linking.links.DeepLink] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.iac_dialer.impl_module.final_link.a r35, com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor.Params r36, com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage.Data r37, kotlin.coroutines.jvm.internal.ContinuationImpl r38) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.final_link.a.b(com.avito.android.iac_dialer.impl_module.final_link.a, com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor$Params, com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage$Data, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor.Params r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.iac_dialer.impl_module.final_link.b
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.iac_dialer.impl_module.final_link.b r0 = (com.avito.android.iac_dialer.impl_module.final_link.b) r0
            int r1 = r0.f166017v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166017v = r1
            goto L18
        L13:
            com.avito.android.iac_dialer.impl_module.final_link.b r0 = new com.avito.android.iac_dialer.impl_module.final_link.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f166015t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f166017v
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage$Data r7 = r0.f166014s
            com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor$Params r1 = r0.f166013r
            com.avito.android.iac_dialer.impl_module.final_link.a r0 = r0.f166012q
            kotlin.C42729a0.b(r8)
            r5 = r8
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r5
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.C42729a0.b(r8)
            com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage r8 = r6.f166004b
            java.util.LinkedHashMap r8 = r8.getF166043a()
            java.lang.String r2 = r7.getCallId()
            java.lang.Object r8 = r8.get(r2)
            com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage$Data r8 = (com.avito.android.iac_dialer.impl_module.final_link.IacMetaInfoStorage.Data) r8
            if (r8 != 0) goto L57
            com.avito.android.iac_dialer_root.public_module.deeplink.IacLauncherIntentLink r7 = new com.avito.android.iac_dialer_root.public_module.deeplink.IacLauncherIntentLink
            r7.<init>(r3)
            return r7
        L57:
            com.avito.android.iac_dialer.impl_module.final_link.c r2 = new com.avito.android.iac_dialer.impl_module.final_link.c
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.f166012q = r6
            r0.f166013r = r7
            r0.f166014s = r8
            r0.f166017v = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = kotlinx.coroutines.D1.c(r3, r2, r0)
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r1 = r6
        L6f:
            com.avito.android.deep_linking.links.DeepLink r0 = (com.avito.android.deep_linking.links.DeepLink) r0
            if (r0 != 0) goto L7e
            com.avito.android.iac_dialer.impl_module.final_link.a$a r0 = com.avito.android.iac_dialer.impl_module.final_link.a.f166002i
            java.lang.String r2 = "timeout to create finalLink exceeded - let's fallback to simple FinalScreen"
            com.avito.android.iac_dialer.impl_module.final_link.a.C4921a.a(r0, r2)
            com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenLink r0 = r1.e(r7, r8)
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.final_link.a.a(com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor$Params, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final IacFinishedFallbackScreenLink c(IacFinalLinkInteractor.Params params, IacMetaInfoStorage.Data data) {
        DeepLink channelsLink = new ChannelsLink(null, null, 3, null);
        IacMetaInfoStorage.StorageCallMeta.Item item = data.getMeta().getItem();
        OpenChannelIfExistLink openChannelIfExistLink = item != null ? new OpenChannelIfExistLink(data.getPeerUserId(), String.valueOf(item.getId()), channelsLink) : null;
        IacPiiDeepLink msgLink = data.getMeta().getMsgLink();
        DeepLink deepLinkUnwrap = msgLink != null ? msgLink.unwrap() : null;
        if (deepLinkUnwrap != null) {
            channelsLink = deepLinkUnwrap;
        } else if (openChannelIfExistLink != null) {
            channelsLink = openChannelIfExistLink;
        }
        return d(data, params, null, null, null, null, 3L, new ScreenFlowLink(new IacLauncherIntentLink(true), channelsLink));
    }

    public final IacFinishedFallbackScreenLink d(IacMetaInfoStorage.Data data, IacFinalLinkInteractor.Params params, DeepLink deepLink, DeepLink deepLink2, DeepLink deepLink3, AutomaticGsmClickSource automaticGsmClickSource, Long l12, DeepLink deepLink4) {
        IacPiiMapStringString imageUrls;
        IacPiiLong price;
        IacPiiString title;
        IacPiiMapStringString avatarUrls;
        IacPiiString name;
        ScreenFlowLink screenFlowLink = deepLink3 != null ? new ScreenFlowLink(new IacLauncherIntentLink(true), deepLink3) : null;
        String callId = data.getCallId();
        boolean zIsVideo = data.isVideo();
        IacMetaInfoStorage.StorageCallMeta.User peer = data.getMeta().getPeer();
        String strUnwrap = (peer == null || (name = peer.getName()) == null) ? null : name.unwrap();
        IacMetaInfoStorage.StorageCallMeta.User peer2 = data.getMeta().getPeer();
        Image imageUnwrap = (peer2 == null || (avatarUrls = peer2.getAvatarUrls()) == null) ? null : KK.b.a(avatarUrls).unwrap();
        String scenario = data.getMeta().getScenario();
        String strG = g(params.getFinishReason(), data.getDirection(), params.getCallDuration());
        IacCallDirection direction = data.getDirection();
        Long callDuration = params.getCallDuration();
        IacMetaInfoStorage.StorageCallMeta.Item item = data.getMeta().getItem();
        String string = item != null ? Long.valueOf(item.getId()).toString() : null;
        IacMetaInfoStorage.StorageCallMeta.Item item2 = data.getMeta().getItem();
        String strUnwrap2 = (item2 == null || (title = item2.getTitle()) == null) ? null : title.unwrap();
        IacMetaInfoStorage.StorageCallMeta.Item item3 = data.getMeta().getItem();
        String strUnwrap3 = (item3 == null || (price = item3.getPrice()) == null) ? null : KK.c.a(price, this.f166005c).unwrap();
        IacMetaInfoStorage.StorageCallMeta.Item item4 = data.getMeta().getItem();
        return new IacFinishedFallbackScreenLink(callId, zIsVideo, strUnwrap, imageUnwrap, scenario, strG, direction, callDuration, string, strUnwrap2, strUnwrap3, (item4 == null || (imageUrls = item4.getImageUrls()) == null) ? null : KK.b.a(imageUrls).unwrap(), deepLink, deepLink2, screenFlowLink, automaticGsmClickSource, l12, deepLink4 != null ? new IacPiiDeepLink(deepLink4) : null);
    }

    public final IacFinishedFallbackScreenLink e(IacFinalLinkInteractor.Params params, IacMetaInfoStorage.Data data) {
        return d(data, params, null, null, null, null, 3L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor.Params r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.avito.android.iac_dialer.impl_module.final_link.e
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.iac_dialer.impl_module.final_link.e r0 = (com.avito.android.iac_dialer.impl_module.final_link.e) r0
            int r1 = r0.f166034t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166034t = r1
            goto L18
        L13:
            com.avito.android.iac_dialer.impl_module.final_link.e r0 = new com.avito.android.iac_dialer.impl_module.final_link.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f166032r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f166034t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.avito.android.iac_dialer.impl_module.final_link.a r8 = r0.f166031q
            kotlin.C42729a0.b(r9)
            goto L73
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.C42729a0.b(r9)
            com.avito.android.iac_dialer.impl_module.splitter.features.a r9 = r7.f166007e
            r9.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.iac_dialer.impl_module.splitter.features.a.f166390j
            r5 = 6
            r2 = r2[r5]
            com.avito.android.A0$a r9 = r9.f166398i
            DE0.a r9 = r9.a()
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L54
            return r4
        L54:
            java.lang.String r9 = r8.getCallId()
            java.lang.Long r8 = r8.getCallDuration()
            if (r8 == 0) goto L63
            long r5 = r8.longValue()
            goto L65
        L63:
            r5 = 0
        L65:
            r0.f166031q = r7
            r0.f166034t = r3
            com.avito.android.iac_dialer.impl_module.api.a r8 = r7.f166006d
            java.lang.Object r9 = r8.a(r9, r5, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            r8 = r7
        L73:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r0 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L7b
            r9 = r4
            goto L8b
        L7b:
            boolean r0 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto Lcc
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r9 = r9.getResult()
            gK.a r9 = (gK.C40592a) r9
            com.avito.android.deep_linking.links.DeepLink r9 = r9.getCloseScreenLink()
        L8b:
            if (r9 != 0) goto L8e
            return r4
        L8e:
            boolean r0 = r9 instanceof com.avito.android.deep_linking.links.DetailsSheetLink
            if (r0 == 0) goto Lcb
            r0 = r9
            com.avito.android.deep_linking.links.DetailsSheetLink r0 = (com.avito.android.deep_linking.links.DetailsSheetLink) r0
            com.avito.android.deep_linking.links.DetailsSheetLinkBody r0 = r0.f133237b
            com.avito.android.deep_linking.links.DetailsSheetButton r0 = r0.getButton()
            if (r0 == 0) goto La2
            com.avito.android.deep_linking.links.DeepLink r0 = r0.getDeeplink()
            goto La3
        La2:
            r0 = r4
        La3:
            boolean r0 = r0 instanceof com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_enable.IacEnableDeeplink
            if (r0 == 0) goto Lcb
            com.avito.android.server_time.f r0 = r8.f166009g
            long r0 = r0.now()
            HK.a r2 = r8.f166008f
            long r5 = r2.g()
            long r0 = r0 - r5
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS
            r5 = 7
            long r5 = r3.toMillis(r5)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lca
            com.avito.android.server_time.f r8 = r8.f166009g
            long r0 = r8.now()
            r2.d(r0)
            return r9
        Lca:
            return r4
        Lcb:
            return r9
        Lcc:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.final_link.a.f(com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor$Params, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String g(IacFinalLinkInteractor.FinishReason finishReason, IacCallDirection iacCallDirection, Long l12) {
        boolean z12 = finishReason instanceof IacFinalLinkInteractor.FinishReason.BusyByIac ? true : finishReason instanceof IacFinalLinkInteractor.FinishReason.BusyByGsm;
        Context context = this.f166003a;
        if (z12) {
            return context.getString(R.string.iac_dialer_impl_finished_status_busy);
        }
        if (finishReason instanceof IacFinalLinkInteractor.FinishReason.Reject) {
            return context.getString(R.string.iac_dialer_impl_finished_status_declined);
        }
        if (finishReason instanceof IacFinalLinkInteractor.FinishReason.TimeoutConnect ? true : finishReason instanceof IacFinalLinkInteractor.FinishReason.TimeoutAnswer) {
            int i12 = b.f166011a[iacCallDirection.ordinal()];
            if (i12 == 1) {
                return context.getString(R.string.iac_dialer_impl_finished_status_timeout);
            }
            if (i12 == 2) {
                return context.getString(R.string.iac_dialer_impl_finished_status_finished);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (finishReason instanceof IacFinalLinkInteractor.FinishReason.HangupByLocal ? true : finishReason instanceof IacFinalLinkInteractor.FinishReason.HangupByPeer) {
            if (l12 == null || l12.longValue() < 1000) {
                return context.getString(R.string.iac_dialer_impl_finished_status_finished);
            }
            return context.getString(R.string.iac_dialer_impl_finished_status_finished_with_duration, DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(l12.longValue())));
        }
        if (finishReason instanceof IacFinalLinkInteractor.FinishReason.NoMicAccess) {
            int i13 = b.f166011a[iacCallDirection.ordinal()];
            if (i13 == 1) {
                return context.getString(R.string.iac_dialer_impl_finished_status_error);
            }
            if (i13 == 2) {
                return context.getString(R.string.iac_dialer_impl_finished_status_finished);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(finishReason instanceof IacFinalLinkInteractor.FinishReason.NoCameraAccess)) {
            if (finishReason instanceof IacFinalLinkInteractor.FinishReason.CanNotRecallByError ? true : finishReason instanceof IacFinalLinkInteractor.FinishReason.CanNotRecallByReason ? true : finishReason instanceof IacFinalLinkInteractor.FinishReason.CreateCallError ? true : finishReason instanceof IacFinalLinkInteractor.FinishReason.Unknown ? true : finishReason instanceof IacFinalLinkInteractor.FinishReason.Error) {
                return (l12 != null || iacCallDirection == IacCallDirection.INCOMING) ? context.getString(R.string.iac_dialer_impl_finished_status_finished) : context.getString(R.string.iac_dialer_impl_finished_status_could_not_get_through);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i14 = b.f166011a[iacCallDirection.ordinal()];
        if (i14 == 1) {
            return context.getString(R.string.iac_dialer_impl_finished_status_error);
        }
        if (i14 == 2) {
            return context.getString(R.string.iac_dialer_impl_finished_status_finished);
        }
        throw new NoWhenBranchMatchedException();
    }
}
