package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import defpackage.ajb;
import defpackage.cm6;
import defpackage.de;
import defpackage.e2f;
import defpackage.fni;
import defpackage.gu3;
import defpackage.hk3;
import defpackage.hs8;
import defpackage.k2f;
import defpackage.m3f;
import defpackage.o64;
import defpackage.p64;
import defpackage.pm0;
import defpackage.qqg;
import defpackage.rd5;
import defpackage.si1;
import defpackage.tk4;
import defpackage.tm6;
import defpackage.u08;
import defpackage.ue3;
import defpackage.ukd;
import defpackage.vm6;
import defpackage.wk3;
import defpackage.wy1;
import defpackage.y6d;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003CDEBq\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\b\b\u0000\u0010\"*\u00020!*\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b(\u0010)J7\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010*\u001a\u00020\u00142\u0018\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,0\u001e0+H\u0002¢\u0006\u0004\b.\u0010/J7\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010*\u001a\u00020\u00142\u0018\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,0\u001e0+H\u0002¢\u0006\u0004\b0\u0010/J/\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0018\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,0\u001e0+H\u0002¢\u0006\u0004\b1\u00102J7\u00104\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00030\u00030\u001e2\u0018\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0,0\u001e0+H\u0002¢\u0006\u0004\b4\u00102J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010AR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010BR\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010@¨\u0006F"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Action;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiServiceInternal", "Lo64;", "cidProvider", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "providedParams", "Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;", "internalIdsResolver", "Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;", "externalIdsResolver", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "startCallApiParams", "Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "peerIdGenerator", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "preparedStat", "", "isAnswer", "isCaller", "Ly6d;", "log", "Lsi1;", "callParams", "isFastStartEnabled", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Lo64;Lru/ok/android/externcalls/sdk/api/ConversationParams;Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;ZZLy6d;Lsi1;Z)V", "Le2f;", "executeSimple", "()Le2f;", "", "T", "retryForApiCall", "(Le2f;)Le2f;", "", "initialJoinLink", "anonToken", "executeWithJoinLink", "(Ljava/lang/String;Ljava/lang/String;)Le2f;", "isJoinByLink", "Lkotlin/Function0;", "Lajb;", "apiRequest", "prepareImpl", "(ZLcm6;)Le2f;", "getPrepareResult", "getPrepareResultWithoutInternalIds", "(Lcm6;)Le2f;", "kotlin.jvm.PlatformType", "getPrepareResultWithInternalIds", "params", "execute", "(Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;)Le2f;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Lo64;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "Lru/ok/android/externcalls/sdk/id/InternalIdsResolver;", "Lru/ok/android/externcalls/sdk/id/ExternalIdsResolver;", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "Lru/ok/android/externcalls/sdk/id/peer/PeerIdGenerator;", "Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Z", "Ly6d;", "Lsi1;", "Companion", "PrepareParams", "PrepareResult", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Prepare implements Action<PrepareParams, PrepareResult> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "ConversationPrepare";
    private final si1 callParams;
    private final o64 cidProvider;
    private final ExternalIdsResolver externalIdsResolver;
    private final InternalIdsResolver internalIdsResolver;
    private final boolean isAnswer;
    private final boolean isCaller;
    private final boolean isFastStartEnabled;
    private final y6d log;
    private final OkApiServiceInternal okApiServiceInternal;
    private final PeerIdGenerator peerIdGenerator;
    private final ConversationPreparedStat preparedStat;
    private final ConversationParams providedParams;
    private final StartCallApiParams startCallApiParams;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$Companion;", "", "()V", "TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionParams;", "Prepare", "PrepareJoin", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$PrepareJoin;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PrepareParams extends ActionParams {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$Prepare;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "()V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare$PrepareParams$Prepare, reason: collision with other inner class name */
        public static final class C0001Prepare implements PrepareParams {
            public static final C0001Prepare INSTANCE = new C0001Prepare();

            private C0001Prepare() {
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams$PrepareJoin;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareParams;", "initialJoinLink", "", "anonToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnonToken", "()Ljava/lang/String;", "getInitialJoinLink", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PrepareJoin implements PrepareParams {
            private final String anonToken;
            private final String initialJoinLink;

            public PrepareJoin(String str, String str2) {
                this.initialJoinLink = str;
                this.anonToken = str2;
            }

            public static /* synthetic */ PrepareJoin copy$default(PrepareJoin prepareJoin, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = prepareJoin.initialJoinLink;
                }
                if ((i & 2) != 0) {
                    str2 = prepareJoin.anonToken;
                }
                return prepareJoin.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInitialJoinLink() {
                return this.initialJoinLink;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAnonToken() {
                return this.anonToken;
            }

            public final PrepareJoin copy(String initialJoinLink, String anonToken) {
                return new PrepareJoin(initialJoinLink, anonToken);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PrepareJoin)) {
                    return false;
                }
                PrepareJoin prepareJoin = (PrepareJoin) other;
                return fni.a(this.initialJoinLink, prepareJoin.initialJoinLink) && fni.a(this.anonToken, prepareJoin.anonToken);
            }

            public final String getAnonToken() {
                return this.anonToken;
            }

            public final String getInitialJoinLink() {
                return this.initialJoinLink;
            }

            public int hashCode() {
                String str = this.initialJoinLink;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.anonToken;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return wy1.j("PrepareJoin(initialJoinLink=", this.initialJoinLink, ", anonToken=", this.anonToken, ")");
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/Prepare$PrepareResult;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionResult;", "conversationParams", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "unresolvedParticipantIds", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/api/ConversationParams;Ljava/util/Set;)V", "getConversationParams", "()Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getUnresolvedParticipantIds", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PrepareResult implements ActionResult {
        private final ConversationParams conversationParams;
        private final Set<ParticipantId> unresolvedParticipantIds;

        public PrepareResult(ConversationParams conversationParams, Set<ParticipantId> set) {
            this.conversationParams = conversationParams;
            this.unresolvedParticipantIds = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PrepareResult copy$default(PrepareResult prepareResult, ConversationParams conversationParams, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationParams = prepareResult.conversationParams;
            }
            if ((i & 2) != 0) {
                set = prepareResult.unresolvedParticipantIds;
            }
            return prepareResult.copy(conversationParams, set);
        }

        /* renamed from: component1, reason: from getter */
        public final ConversationParams getConversationParams() {
            return this.conversationParams;
        }

        public final Set<ParticipantId> component2() {
            return this.unresolvedParticipantIds;
        }

        public final PrepareResult copy(ConversationParams conversationParams, Set<ParticipantId> unresolvedParticipantIds) {
            return new PrepareResult(conversationParams, unresolvedParticipantIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrepareResult)) {
                return false;
            }
            PrepareResult prepareResult = (PrepareResult) other;
            return fni.a(this.conversationParams, prepareResult.conversationParams) && fni.a(this.unresolvedParticipantIds, prepareResult.unresolvedParticipantIds);
        }

        public final ConversationParams getConversationParams() {
            return this.conversationParams;
        }

        public final Set<ParticipantId> getUnresolvedParticipantIds() {
            return this.unresolvedParticipantIds;
        }

        public int hashCode() {
            ConversationParams conversationParams = this.conversationParams;
            return this.unresolvedParticipantIds.hashCode() + ((conversationParams == null ? 0 : conversationParams.hashCode()) * 31);
        }

        public String toString() {
            return "PrepareResult(conversationParams=" + this.conversationParams + ", unresolvedParticipantIds=" + this.unresolvedParticipantIds + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le2f;", "Lajb;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "invoke", "()Le2f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare$executeSimple$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements cm6 {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.cm6
        public final e2f invoke() {
            if (Prepare.this.providedParams == null && !Prepare.this.isCaller) {
                return Prepare.this.okApiServiceInternal.getConversationParams(null, !Prepare.this.isAnswer, Prepare.this.isAnswer ? ((p64) Prepare.this.cidProvider).a : null).i(de.a()).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.executeSimple.1.2
                    @Override // defpackage.tm6
                    public final ajb apply(ConversationParams conversationParams) {
                        return new ajb(conversationParams);
                    }
                });
            }
            ConversationParams conversationParams = Prepare.this.providedParams;
            ajb ajbVar = conversationParams != null ? new ajb(conversationParams) : null;
            if (ajbVar == null) {
                ajbVar = ajb.b;
            }
            return e2f.g(ajbVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le2f;", "Lajb;", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "invoke", "()Le2f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare$executeWithJoinLink$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00451 extends u08 implements cm6 {
        final /* synthetic */ String $anonToken;
        final /* synthetic */ String $initialJoinLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00451(String str, String str2) {
            super(0);
            this.$initialJoinLink = str;
            this.$anonToken = str2;
        }

        @Override // defpackage.cm6
        public final e2f invoke() {
            e2f joinConversationParamsExt = Prepare.this.okApiServiceInternal.getJoinConversationParamsExt(this.$initialJoinLink, this.$anonToken, Prepare.this.peerIdGenerator.generatePeerId(), Prepare.this.startCallApiParams);
            final Prepare prepare = Prepare.this;
            gu3 gu3Var = new gu3() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.executeWithJoinLink.1.1
                @Override // defpackage.gu3
                public final void accept(ConversationParams conversationParams) {
                    Prepare prepare2 = prepare;
                    if (conversationParams.id != null) {
                        o64 o64Var = prepare2.cidProvider;
                        String str = conversationParams.id;
                        if (o64Var instanceof p64) {
                            ((p64) o64Var).a = str;
                        }
                    }
                }
            };
            joinConversationParamsExt.getClass();
            return new k2f(joinConversationParamsExt, gu3Var, 1).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.executeWithJoinLink.1.2
                @Override // defpackage.tm6
                public final ajb apply(ConversationParams conversationParams) {
                    return new ajb(conversationParams);
                }
            });
        }
    }

    public Prepare(OkApiServiceInternal okApiServiceInternal, o64 o64Var, ConversationParams conversationParams, InternalIdsResolver internalIdsResolver, ExternalIdsResolver externalIdsResolver, StartCallApiParams startCallApiParams, PeerIdGenerator peerIdGenerator, ConversationPreparedStat conversationPreparedStat, boolean z, boolean z2, y6d y6dVar, si1 si1Var, boolean z3) {
        this.okApiServiceInternal = okApiServiceInternal;
        this.cidProvider = o64Var;
        this.providedParams = conversationParams;
        this.internalIdsResolver = internalIdsResolver;
        this.externalIdsResolver = externalIdsResolver;
        this.startCallApiParams = startCallApiParams;
        this.peerIdGenerator = peerIdGenerator;
        this.preparedStat = conversationPreparedStat;
        this.isAnswer = z;
        this.isCaller = z2;
        this.log = y6dVar;
        this.callParams = si1Var;
        this.isFastStartEnabled = z3;
    }

    private final e2f executeSimple() {
        return this.isFastStartEnabled ? e2f.g(new PrepareResult(null, rd5.a)).i(de.a()) : prepareImpl(false, new AnonymousClass1());
    }

    private final e2f executeWithJoinLink(String initialJoinLink, String anonToken) {
        return prepareImpl(true, new C00451(initialJoinLink, anonToken));
    }

    private final e2f getPrepareResult(boolean isJoinByLink, cm6 apiRequest) {
        return (this.callParams.z.j && (this.isCaller || isJoinByLink)) ? getPrepareResultWithoutInternalIds(apiRequest) : getPrepareResultWithInternalIds(apiRequest);
    }

    private final e2f getPrepareResultWithInternalIds(cm6 apiRequest) {
        m3f m3fVar = (m3f) apiRequest.invoke();
        e2f e2fVarRetryForApiCall = retryForApiCall(this.internalIdsResolver.resolveIdsAndGetFailed());
        ExternalIdsResolver externalIdsResolver = this.externalIdsResolver;
        hk3 hk3VarResolveIds = externalIdsResolver.resolveIds(externalIdsResolver.collectExternalIdResolutionCandidates());
        hk3VarResolveIds.getClass();
        e2f e2fVarRetryForApiCall2 = retryForApiCall(new wk3(0, hk3VarResolveIds));
        Object obj = new vm6() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.getPrepareResultWithInternalIds.1
            @Override // defpackage.vm6
            public final PrepareResult apply(ajb ajbVar, Set<ParticipantId> set, qqg qqgVar) {
                ConversationParams conversationParams;
                Object obj2 = ajbVar.a;
                if (obj2 == null) {
                    conversationParams = null;
                } else {
                    if (obj2 == null) {
                        throw new NoSuchElementException();
                    }
                    conversationParams = (ConversationParams) obj2;
                }
                return new PrepareResult(conversationParams, ue3.h0(ue3.E(set)));
            }
        };
        Objects.requireNonNull(m3fVar, "source1 is null");
        Objects.requireNonNull(e2fVarRetryForApiCall, "source2 is null");
        Objects.requireNonNull(e2fVarRetryForApiCall2, "source3 is null");
        Objects.requireNonNull(obj, "zipper is null");
        return new hs8(new m3f[]{m3fVar, e2fVarRetryForApiCall, e2fVarRetryForApiCall2}, 7, new ukd(18, obj));
    }

    private final e2f getPrepareResultWithoutInternalIds(cm6 apiRequest) {
        return ((e2f) apiRequest.invoke()).h(new tm6() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.getPrepareResultWithoutInternalIds.1
            @Override // defpackage.tm6
            public final PrepareResult apply(ajb ajbVar) {
                ConversationParams conversationParams;
                Object obj = ajbVar.a;
                if (obj == null) {
                    conversationParams = null;
                } else {
                    if (obj == null) {
                        throw new NoSuchElementException();
                    }
                    conversationParams = (ConversationParams) obj;
                }
                return new PrepareResult(conversationParams, rd5.a);
            }
        });
    }

    private final e2f prepareImpl(boolean isJoinByLink, cm6 apiRequest) {
        return new hs8(getPrepareResult(isJoinByLink, apiRequest).i(de.a()), 5, new pm0() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.Prepare.prepareImpl.1
            @Override // defpackage.pm0
            public final void accept(PrepareResult prepareResult, Throwable th) {
                Prepare.this.preparedStat.onConversationPrepared();
                if (th != null) {
                    Prepare.this.log.logException(Prepare.TAG, "Conversation prepare failed", th);
                } else {
                    Prepare.this.log.log(Prepare.TAG, "Conversation prepared");
                }
            }
        });
    }

    private final <T> e2f retryForApiCall(e2f e2fVar) {
        return this.isAnswer ? RetryKt.retryApiCallForIncoming(e2fVar, this.log) : RetryKt.retryApiCallForOutgoing(e2fVar, this.log);
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public e2f execute(PrepareParams params) {
        if (params instanceof PrepareParams.C0001Prepare) {
            return executeSimple();
        }
        if (!(params instanceof PrepareParams.PrepareJoin)) {
            throw new NoWhenBranchMatchedException();
        }
        PrepareParams.PrepareJoin prepareJoin = (PrepareParams.PrepareJoin) params;
        return executeWithJoinLink(prepareJoin.getInitialJoinLink(), prepareJoin.getAnonToken());
    }
}
