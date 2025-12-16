package ru.ok.android.externcalls.sdk.api;

import defpackage.dm0;
import defpackage.e2f;
import defpackage.em6;
import defpackage.enb;
import defpackage.hs8;
import defpackage.k2f;
import defpackage.ka5;
import defpackage.qqg;
import defpackage.ti1;
import defpackage.tk4;
import defpackage.tm6;
import defpackage.tvd;
import defpackage.u08;
import defpackage.u2f;
import defpackage.ue3;
import defpackage.uid;
import defpackage.we3;
import defpackage.x6d;
import defpackage.y6d;
import defpackage.y8g;
import defpackage.z8g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.request.BatchRequestKt;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;
import ru.ok.android.externcalls.sdk.api.request.CreateJoinLink;
import ru.ok.android.externcalls.sdk.api.request.GetConversationParams;
import ru.ok.android.externcalls.sdk.api.request.GetExternalIdsByOkIds;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdsByExternalIds;
import ru.ok.android.externcalls.sdk.api.request.GetSettings;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.api.request.JoinConversationByLink;
import ru.ok.android.externcalls.sdk.api.request.RemoveJoinLink;
import ru.ok.android.externcalls.sdk.api.request.StartConversation;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0001QB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ_\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J3\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010'J7\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*JK\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b,\u0010-JK\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b/\u0010-J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b0\u00101J/\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e040\u001b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e02H\u0001¢\u0006\u0004\b5\u00106J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001b2\u0006\u00107\u001a\u00020\u000eH\u0001¢\u0006\u0004\b9\u00101J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\u0006\u0010:\u001a\u00020\u000eH\u0001¢\u0006\u0004\b;\u00101J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@J/\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010E0\u00150\u001b2\u0010\u0010D\u001a\f\u0012\b\u0012\u00060Bj\u0002`C0AH\u0001¢\u0006\u0004\bF\u0010GJ/\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010J0\u00150\u001b2\u0010\u0010D\u001a\f\u0012\b\u0012\u00060Hj\u0002`I0AH\u0001¢\u0006\u0004\bK\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010MR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010OR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010P¨\u0006R"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "", "Ltvd;", "rxApiClient", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "okApiService", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "apiStats", "Ly6d;", "rtcLog", "Ly8g;", "timeProvider", "<init>", "(Ltvd;Lru/ok/android/externcalls/sdk/api/OkApiService;Lru/ok/android/externcalls/sdk/stat/api/ApiStats;Ly6d;Ly8g;)V", "", "servers", "cid", "", "createLink", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "", "", "opponentInternalIds", "opponentExternalIds", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Le2f;", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "startConversationImpl", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Le2f;", ApiProtocol.PARAM_PEER_ID, "Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "joinToConversation", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Le2f;", "anonToken", "isFastRetryEnabled", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getConversationParams", "(Ljava/lang/String;ZLjava/lang/String;)Le2f;", "initialJoinLink", "getJoinConversationParamsExt", "(Ljava/lang/String;Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Le2f;", "opponents", "startConversation", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Le2f;", "opponentIds", "startConversationWithExternalIds", ApiProtocol.PARAM_CREATE_JOIN_LINK, "(Ljava/lang/String;)Le2f;", "", ApiProtocol.PARAM_KEYS, "", "getSettings", "(Ljava/util/Set;)Le2f;", "participantExternalId", "Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "getOkIdByExternalId", ApiProtocol.PARAM_CONVERSATION_ID, "removeJoinLink", "Lorg/json/JSONObject;", "codecList", "Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Response;", "sendSupportedCodecsStatistics", "(Lorg/json/JSONObject;)Le2f;", "", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "candidates", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "getExternalIdsByOkIds", "(Ljava/util/Collection;)Le2f;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/api/BatchInternalIdResponse;", "getOkIdsByExternalIds", "Ltvd;", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "Ly6d;", "Ly8g;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OkApiServiceInternal {
    private static final String BATCH_PREFIX = "batch.execute/";
    private static final Companion Companion = new Companion(null);
    private static final int MAX_EXTERNAL_IDS_PER_REQUEST = 200;
    private static final int MAX_OK_IDS_PER_REQUEST = 100;
    private ApiStats apiStats;
    private final OkApiService okApiService;
    private y6d rtcLog;
    private final tvd rxApiClient;
    private y8g timeProvider;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal$Companion;", "", "()V", "BATCH_PREFIX", "", "MAX_EXTERNAL_IDS_PER_REQUEST", "", "MAX_OK_IDS_PER_REQUEST", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lqqg;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$getExternalIdsByOkIds$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements em6 {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return qqg.a;
        }

        public final void invoke(long j) {
            ApiStats apiStats = OkApiServiceInternal.this.apiStats;
            if (apiStats != null) {
                apiStats.reportExecutionTime("batch.execute/vchat.getExternalIdsByOkIds", j);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lqqg;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$getOkIdsByExternalIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00091 extends u08 implements em6 {
        public C00091() {
            super(1);
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return qqg.a;
        }

        public final void invoke(long j) {
            ApiStats apiStats = OkApiServiceInternal.this.apiStats;
            if (apiStats != null) {
                apiStats.reportExecutionTime("batch.execute/vchat.getOkIdsByExternalIds", j);
            }
        }
    }

    public OkApiServiceInternal(tvd tvdVar, OkApiService okApiService, ApiStats apiStats, y6d y6dVar, y8g y8gVar) {
        this.rxApiClient = tvdVar;
        this.okApiService = okApiService;
        this.apiStats = apiStats;
        this.rtcLog = y6dVar;
        this.timeProvider = y8gVar;
    }

    public static /* synthetic */ e2f getConversationParams$default(OkApiServiceInternal okApiServiceInternal, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return okApiServiceInternal.getConversationParams(str, z, str2);
    }

    private final e2f startConversationImpl(String servers, String cid, boolean createLink, ConversationParticipant opponent, List<Long> opponentInternalIds, List<String> opponentExternalIds, StartCallApiParams params) {
        return RetryKt.retryApiCallForOutgoing(this.rxApiClient.a(new StartConversation.Request(servers, cid, createLink, opponent, opponentInternalIds, opponentExternalIds, params, new OkApiServiceInternal$startConversationImpl$request$1(this.okApiService), new OkApiServiceInternal$startConversationImpl$request$2(this.okApiService))), this.rtcLog);
    }

    public final e2f createJoinLink(String cid) {
        return RetryKt.retryApiCallForFastWorkRequired(this.rxApiClient.a(new CreateJoinLink.Request(cid)), this.rtcLog);
    }

    public final e2f getConversationParams(String anonToken, boolean isFastRetryEnabled, String cid) {
        u2f u2fVarA = this.rxApiClient.a(new GetConversationParams.Request(anonToken, cid));
        if (isFastRetryEnabled) {
            RetryKt.retryApiCallForFastWorkRequired(u2fVarA, this.rtcLog);
            return u2fVarA;
        }
        RetryKt.retryApiCallForBackgroundWork(u2fVarA, this.rtcLog);
        return u2fVarA;
    }

    public final e2f getExternalIdsByOkIds(Collection<ti1> candidates) {
        ArrayList arrayListI0 = ue3.i0(candidates, 200, 200);
        final ArrayList arrayList = new ArrayList(we3.q(arrayListI0, 10));
        Iterator it = arrayListI0.iterator();
        while (it.hasNext()) {
            arrayList.add(new GetExternalIdsByOkIds.Request((List) it.next()));
        }
        u2f u2fVarA = this.rxApiClient.a(BatchRequestKt.toBatchRequest(arrayList));
        y8g y8gVar = this.timeProvider;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        uid uidVar = new uid();
        return RetryKt.retryApiCallForFastWorkRequired(new k2f(new hs8(u2fVarA, 6, new enb(uidVar, 19, y8gVar)), new ka5(uidVar, (em6) anonymousClass1, y8gVar), 1).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal.getExternalIdsByOkIds.2
            @Override // defpackage.tm6
            public final List<ExternalIdsResponse> apply(dm0 dm0Var) {
                return BatchRequestKt.parseBatchResponse(dm0Var, arrayList);
            }
        }), this.rtcLog);
    }

    public final e2f getJoinConversationParamsExt(String initialJoinLink, String anonToken, long peerId, StartCallApiParams params) {
        return RetryKt.retryApiCallForJoining(this.rxApiClient.a(new JoinConversationByLink.Request(initialJoinLink, anonToken, peerId, params)), this.rtcLog).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal.getJoinConversationParamsExt.1
            @Override // defpackage.tm6
            public final ConversationParams apply(JoinByLinkResponse joinByLinkResponse) {
                return joinByLinkResponse.toParams();
            }
        });
    }

    public final e2f getOkIdByExternalId(String participantExternalId) {
        return RetryKt.retryApiCallForFastWorkRequired(this.rxApiClient.a(new GetOkIdByExternalId.Request(participantExternalId, false, 2, null)), this.rtcLog);
    }

    public final e2f getOkIdsByExternalIds(Collection<ParticipantId> candidates) {
        ArrayList arrayListI0 = ue3.i0(candidates, 100, 100);
        final ArrayList arrayList = new ArrayList(we3.q(arrayListI0, 10));
        Iterator it = arrayListI0.iterator();
        while (it.hasNext()) {
            arrayList.add(new GetOkIdsByExternalIds.Request((List) it.next()));
        }
        u2f u2fVarA = this.rxApiClient.a(BatchRequestKt.toBatchRequest(arrayList));
        y8g y8gVar = this.timeProvider;
        C00091 c00091 = new C00091();
        uid uidVar = new uid();
        return RetryKt.retryApiCallForFastWorkRequired(new k2f(new hs8(u2fVarA, 6, new enb(uidVar, 19, y8gVar)), new ka5(uidVar, (em6) c00091, y8gVar), 1).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal.getOkIdsByExternalIds.2
            @Override // defpackage.tm6
            public final List<BatchInternalIdResponse> apply(dm0 dm0Var) {
                return BatchRequestKt.parseBatchResponse(dm0Var, arrayList);
            }
        }), this.rtcLog);
    }

    public final e2f getSettings(Set<String> keys) {
        return this.rxApiClient.a(new GetSettings.Request(keys));
    }

    public final e2f joinToConversation(String cid, long peerId, StartCallApiParams params) {
        return RetryKt.retryApiCallForJoining(this.rxApiClient.a(new JoinConversation.Request(cid, peerId, params, new OkApiServiceInternal$joinToConversation$request$1(this.okApiService))), this.rtcLog);
    }

    public final e2f removeJoinLink(String conversationId) {
        return RetryKt.retryApiCallForFastWorkRequired(this.rxApiClient.a(new RemoveJoinLink.Request(conversationId)), this.rtcLog);
    }

    public final e2f sendSupportedCodecsStatistics(JSONObject codecList) {
        return RetryKt.retryApiCallForBackgroundWork(this.rxApiClient.a(new ClientSupportedCodecs.Request(codecList)), this.rtcLog);
    }

    public final e2f startConversation(String servers, String cid, boolean createLink, ConversationParticipant opponent, List<Long> opponents, StartCallApiParams params) {
        return startConversationImpl(servers, cid, createLink, opponent, opponents, null, params);
    }

    public final e2f startConversationWithExternalIds(String servers, String cid, boolean createLink, ConversationParticipant opponent, List<String> opponentIds, StartCallApiParams params) {
        return startConversationImpl(servers, cid, createLink, opponent, null, opponentIds, params);
    }

    public OkApiServiceInternal(tvd tvdVar, OkApiService okApiService, ApiStats apiStats, y6d y6dVar, y8g y8gVar, int i, tk4 tk4Var) {
        this(tvdVar, (i & 2) != 0 ? new OkApiService() : okApiService, (i & 4) != 0 ? null : apiStats, (i & 8) != 0 ? x6d.a : y6dVar, (i & 16) != 0 ? new z8g() : y8gVar);
    }
}
