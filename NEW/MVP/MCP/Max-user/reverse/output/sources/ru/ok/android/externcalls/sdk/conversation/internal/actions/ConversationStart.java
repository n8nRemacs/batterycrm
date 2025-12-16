package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import defpackage.a9h;
import defpackage.dnf;
import defpackage.e2f;
import defpackage.em6;
import defpackage.fni;
import defpackage.k18;
import defpackage.ll;
import defpackage.lv4;
import defpackage.o64;
import defpackage.p64;
import defpackage.qs3;
import defpackage.ti1;
import defpackage.tk4;
import defpackage.tm6;
import defpackage.u08;
import defpackage.u64;
import defpackage.ue3;
import defpackage.wk3;
import defpackage.xl;
import defpackage.xtd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.PeerConnection;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.delegate.InternalParamsDto;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003678BM\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00182\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+2\u0006\u0010*\u001a\u00020\u0002H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105¨\u00069"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Action;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Params;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Result;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiServiceInternal", "Lxl;", "deviceIdProvider", "Lll;", "appKeyProvider", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate;", "startConversationDelegate", "Lo64;", "conversationIdProvider", "", "isStartCallByExternalIdsEnabled", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "me", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Lxl;Lll;Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate;Lo64;ZLru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "startCallApiParams", "", "createInternalParamsJson", "(Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Ljava/lang/String;", "", "Lorg/webrtc/PeerConnection$IceServer;", "servers", "parseTurnServers", "(Ljava/util/List;)Ljava/lang/String;", "Lti1;", "myId", "", "collectOpponentInternalIds", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lti1;)Ljava/util/List;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "collectOpponentExternalIds", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/List;", "isFastStartEnabled", "()Z", "params", "Le2f;", "execute", "(Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Params;)Le2f;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Lxl;", "Lll;", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate;", "Lo64;", "Z", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Companion", "Params", "Result", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationStart implements Action<Params, Result> {
    private static final Companion Companion = new Companion(null);
    private static final int SIGNALING_PROTOCOL_DEFAULT = 5;
    private static final int SIGNALING_PROTOCOL_WITH_MULTIPLE_DEVICES = 6;
    private final ll appKeyProvider;
    private final o64 conversationIdProvider;
    private final xl deviceIdProvider;
    private final boolean isStartCallByExternalIdsEnabled;
    private final ConversationParticipant me;
    private final OkApiServiceInternal okApiServiceInternal;
    private final StartConversationDelegate startConversationDelegate;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Companion;", "", "()V", "SIGNALING_PROTOCOL_DEFAULT", "", "SIGNALING_PROTOCOL_WITH_MULTIPLE_DEVICES", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Params;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionParams;", "providedParams", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "createLink", "", "opponent", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "startCallApiParams", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "(Lru/ok/android/externcalls/sdk/api/ConversationParams;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)V", "getCreateLink", "()Z", "getOpponent", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "getProvidedParams", "()Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getStartCallApiParams", "()Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Params implements ActionParams {
        private final boolean createLink;
        private final ConversationParticipant opponent;
        private final ConversationParams providedParams;
        private final StartCallApiParams startCallApiParams;

        public Params(ConversationParams conversationParams, boolean z, ConversationParticipant conversationParticipant, StartCallApiParams startCallApiParams) {
            this.providedParams = conversationParams;
            this.createLink = z;
            this.opponent = conversationParticipant;
            this.startCallApiParams = startCallApiParams;
        }

        public static /* synthetic */ Params copy$default(Params params, ConversationParams conversationParams, boolean z, ConversationParticipant conversationParticipant, StartCallApiParams startCallApiParams, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationParams = params.providedParams;
            }
            if ((i & 2) != 0) {
                z = params.createLink;
            }
            if ((i & 4) != 0) {
                conversationParticipant = params.opponent;
            }
            if ((i & 8) != 0) {
                startCallApiParams = params.startCallApiParams;
            }
            return params.copy(conversationParams, z, conversationParticipant, startCallApiParams);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationParams getProvidedParams() {
            return this.providedParams;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCreateLink() {
            return this.createLink;
        }

        /* renamed from: component3, reason: from getter */
        public final ConversationParticipant getOpponent() {
            return this.opponent;
        }

        /* renamed from: component4, reason: from getter */
        public final StartCallApiParams getStartCallApiParams() {
            return this.startCallApiParams;
        }

        public final Params copy(ConversationParams providedParams, boolean createLink, ConversationParticipant opponent, StartCallApiParams startCallApiParams) {
            return new Params(providedParams, createLink, opponent, startCallApiParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fni.a(this.providedParams, params.providedParams) && this.createLink == params.createLink && fni.a(this.opponent, params.opponent) && fni.a(this.startCallApiParams, params.startCallApiParams);
        }

        public final boolean getCreateLink() {
            return this.createLink;
        }

        public final ConversationParticipant getOpponent() {
            return this.opponent;
        }

        public final ConversationParams getProvidedParams() {
            return this.providedParams;
        }

        public final StartCallApiParams getStartCallApiParams() {
            return this.startCallApiParams;
        }

        public int hashCode() {
            ConversationParams conversationParams = this.providedParams;
            int iB = a9h.b((conversationParams == null ? 0 : conversationParams.hashCode()) * 31, 31, this.createLink);
            ConversationParticipant conversationParticipant = this.opponent;
            return this.startCallApiParams.hashCode() + ((iB + (conversationParticipant != null ? conversationParticipant.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Params(providedParams=" + this.providedParams + ", createLink=" + this.createLink + ", opponent=" + this.opponent + ", startCallApiParams=" + this.startCallApiParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Result;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionResult;", "callInfo", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "(Lru/ok/android/externcalls/sdk/api/CallInfo;)V", "getCallInfo", "()Lru/ok/android/externcalls/sdk/api/CallInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Result implements ActionResult {
        private final CallInfo callInfo;

        public Result(CallInfo callInfo) {
            this.callInfo = callInfo;
        }

        public static /* synthetic */ Result copy$default(Result result, CallInfo callInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                callInfo = result.callInfo;
            }
            return result.copy(callInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final CallInfo getCallInfo() {
            return this.callInfo;
        }

        public final Result copy(CallInfo callInfo) {
            return new Result(callInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && fni.a(this.callInfo, ((Result) other).callInfo);
        }

        public final CallInfo getCallInfo() {
            return this.callInfo;
        }

        public int hashCode() {
            return this.callInfo.hashCode();
        }

        public String toString() {
            return "Result(callInfo=" + this.callInfo + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/webrtc/PeerConnection$IceServer;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart$parseTurnServers$2, reason: invalid class name and case insensitive filesystem */
    public static final class C00442 extends u08 implements em6 {
        public static final C00442 INSTANCE = new C00442();

        public C00442() {
            super(1);
        }

        @Override // defpackage.em6
        public final CharSequence invoke(PeerConnection.IceServer iceServer) {
            String str = iceServer != null ? iceServer.hostname : null;
            return str == null ? "" : str;
        }
    }

    public ConversationStart(OkApiServiceInternal okApiServiceInternal, xl xlVar, ll llVar, StartConversationDelegate startConversationDelegate, o64 o64Var, boolean z, ParticipantStore participantStore, ConversationParticipant conversationParticipant) {
        this.okApiServiceInternal = okApiServiceInternal;
        this.deviceIdProvider = xlVar;
        this.appKeyProvider = llVar;
        this.startConversationDelegate = startConversationDelegate;
        this.conversationIdProvider = o64Var;
        this.isStartCallByExternalIdsEnabled = z;
        this.store = participantStore;
        this.me = conversationParticipant;
    }

    private final List<String> collectOpponentExternalIds(ParticipantStore store, ParticipantId myId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getExternalId() != null && !fni.a(next.getExternalId(), myId)) {
                arrayList.add(next.getExternalId().id);
            }
        }
        return arrayList;
    }

    private final List<Long> collectOpponentInternalIds(ParticipantStore store, ti1 myId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getInternalId() != null && !fni.a(next.getInternalId(), myId)) {
                arrayList.add(Long.valueOf(next.getInternalId().a));
            }
        }
        return arrayList;
    }

    private final String createInternalParamsJson(StartCallApiParams startCallApiParams) {
        String str = this.appKeyProvider != null ? "CGPGAGLGDIHBABABA" : null;
        xl xlVar = this.deviceIdProvider;
        return new InternalParamsDto(AbstractUploader.SDK_TYPE_STRING, "125.1.0.73.1", str, xlVar != null ? ((lv4) ((k18) ((qs3) ((xtd) xlVar).b).X).getValue()).a() : null, startCallApiParams.getIsMultipleDevicesEnabled() ? 6 : 5, startCallApiParams.getDomainId(), false).toJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StartConversationDelegate.Result execute$lambda$0(ConversationStart conversationStart, Params params) {
        return conversationStart.startConversationDelegate.invoke(new StartConversationDelegate.Params(((p64) conversationStart.conversationIdProvider).a, conversationStart.collectOpponentExternalIds(conversationStart.store, conversationStart.me.getExternalId()), params.getStartCallApiParams().getChatId(), params.getStartCallApiParams().getIsVideo(), conversationStart.createInternalParamsJson(params.getStartCallApiParams())));
    }

    private final String parseTurnServers(List<? extends PeerConnection.IceServer> servers) {
        if (servers == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : servers) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) obj;
            if ((iceServer != null ? iceServer.hostname : null) != null && dnf.r(iceServer.hostname, "turn", false)) {
                arrayList.add(obj);
            }
        }
        return ue3.N(arrayList, ",", null, null, C00442.INSTANCE, 30);
    }

    public final boolean isFastStartEnabled() {
        return this.startConversationDelegate != null;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public e2f execute(Params params) {
        e2f e2fVarStartConversation;
        if (this.startConversationDelegate != null) {
            e2fVarStartConversation = new wk3(5, new u64(this, 0, params)).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart.execute.2
                @Override // defpackage.tm6
                public final CallInfo apply(StartConversationDelegate.Result result) throws ApiException {
                    if (result instanceof StartConversationDelegate.Result.Success) {
                        return CallInfo.INSTANCE.createFromStartConversationDelegateResult$calls_sdk_release((StartConversationDelegate.Result.Success) result);
                    }
                    if (!(result instanceof StartConversationDelegate.Result.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StartConversationDelegate.Result.Error error = (StartConversationDelegate.Result.Error) result;
                    if (error.getErrorCode() != null) {
                        throw new ApiInvocationException(1, error.getErrorCode());
                    }
                    throw new ApiException(error.getThrowable());
                }
            });
        } else {
            if (this.isStartCallByExternalIdsEnabled) {
                OkApiServiceInternal okApiServiceInternal = this.okApiServiceInternal;
                ConversationParams providedParams = params.getProvidedParams();
                e2fVarStartConversation = okApiServiceInternal.startConversationWithExternalIds(parseTurnServers(providedParams != null ? providedParams.stunTurnServers : null), ((p64) this.conversationIdProvider).a, params.getCreateLink(), params.getOpponent(), collectOpponentExternalIds(this.store, this.me.getExternalId()), params.getStartCallApiParams());
            } else {
                OkApiServiceInternal okApiServiceInternal2 = this.okApiServiceInternal;
                ConversationParams providedParams2 = params.getProvidedParams();
                e2fVarStartConversation = okApiServiceInternal2.startConversation(parseTurnServers(providedParams2 != null ? providedParams2.stunTurnServers : null), ((p64) this.conversationIdProvider).a, params.getCreateLink(), params.getOpponent(), collectOpponentInternalIds(this.store, this.me.getInternalId()), params.getStartCallApiParams());
            }
        }
        return e2fVarStartConversation.h(new tm6() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart.execute.3
            @Override // defpackage.tm6
            public final Result apply(CallInfo callInfo) {
                return new Result(callInfo);
            }
        });
    }
}
