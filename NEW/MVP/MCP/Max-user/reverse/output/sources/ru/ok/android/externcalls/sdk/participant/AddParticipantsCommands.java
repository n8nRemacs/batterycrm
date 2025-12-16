package ru.ok.android.externcalls.sdk.participant;

import defpackage.az1;
import defpackage.cm6;
import defpackage.em6;
import defpackage.fr6;
import defpackage.hd5;
import defpackage.hn6;
import defpackage.hu3;
import defpackage.k01;
import defpackage.mze;
import defpackage.o81;
import defpackage.paj;
import defpackage.pze;
import defpackage.qqg;
import defpackage.ti1;
import defpackage.tk4;
import defpackage.u08;
import defpackage.ue3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsFailedException;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u00014B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001b\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160!¢\u0006\u0004\b\"\u0010#Je\u0010,\u001a\u00020\u00172\u0010\u0010'\u001a\f\u0012\b\u0012\u00060%j\u0002`&0$2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020(2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0004\b,\u0010-Ja\u0010/\u001a\u00020\u00172\f\u0010'\u001a\b\u0012\u0004\u0012\u00020.0$2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020(2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0004\b/\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103¨\u00065"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands;", "", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lk01;", "call", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "mappings", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "stateProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lk01;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lcm6;)V", "Lorg/json/JSONObject;", NegotiationErrorStat.KEY_ERROR, "Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "parseErrorResponse", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "parseAddError", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "Lkotlin/Function1;", "", "Lqqg;", "onError", "Lpze;", "provideSignaling", "withSignaling", "(Lem6;Lem6;)V", "", "link", "Ljava/lang/Runnable;", "onSuccess", "Lhu3;", "addParticipantByLink", "(Ljava/lang/String;Ljava/lang/Runnable;Lhu3;)V", "", "Lti1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantsIds", "", "isUnban", "isShowChatHistory", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "addParticipants", "(Ljava/util/Collection;Ljava/lang/Boolean;ZLem6;Lem6;)V", "Lo81;", "addParticipantsExtIds", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lk01;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lcm6;", "ListenerAddParticipantsResponse", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddParticipantsCommands {
    private final k01 call;
    private final IdMappingWrapper mappings;
    private final SignalingProvider signalingProvider;
    private final cm6 stateProvider;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipantByLink$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends hn6 implements em6 {
        public AnonymousClass1(Object obj) {
            super(1, 0, hu3.class, obj, "accept", "accept(Ljava/lang/Object;)V");
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return qqg.a;
        }

        public final void invoke(Throwable th) {
            ((hu3) this.receiver).accept(th);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpze;", "signaling", "Lqqg;", "invoke", "(Lpze;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipantByLink$2, reason: invalid class name */
    public static final class AnonymousClass2 extends u08 implements em6 {
        final /* synthetic */ String $link;
        final /* synthetic */ hu3 $onError;
        final /* synthetic */ Runnable $onSuccess;
        final /* synthetic */ AddParticipantsCommands this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, hu3 hu3Var, Runnable runnable, AddParticipantsCommands addParticipantsCommands) {
            super(1);
            this.$link = str;
            this.$onError = hu3Var;
            this.$onSuccess = runnable;
            this.this$0 = addParticipantsCommands;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(hu3 hu3Var, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
            hu3Var.accept(addParticipantsCommands.parseErrorResponse(jSONObject));
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((pze) obj);
            return qqg.a;
        }

        public final void invoke(pze pzeVar) throws JSONException {
            try {
                String str = this.$link;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("participantIdAsQRCodeLink", str);
                fr6 fr6VarB = paj.b(jSONObject, "add-participant");
                final Runnable runnable = this.$onSuccess;
                pzeVar.d(fr6VarB, false, new mze() { // from class: ru.ok.android.externcalls.sdk.participant.a
                    @Override // defpackage.mze
                    public final void onResponse(JSONObject jSONObject2) {
                        runnable.run();
                    }
                }, new b(this.$onError, this.this$0, 2));
            } catch (JSONException e) {
                this.$onError.accept(new RuntimeException("Request preparation error", e));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpze;", "signaling", "Lqqg;", "invoke", "(Lpze;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipants$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00511 extends u08 implements em6 {
        final /* synthetic */ boolean $isShowChatHistory;
        final /* synthetic */ Boolean $isUnban;
        final /* synthetic */ em6 $onError;
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ Collection<ti1> $participantsIds;
        final /* synthetic */ AddParticipantsCommands this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00511(Collection<ti1> collection, Boolean bool, boolean z, AddParticipantsCommands addParticipantsCommands, em6 em6Var, em6 em6Var2) {
            super(1);
            this.$participantsIds = collection;
            this.$isUnban = bool;
            this.$isShowChatHistory = z;
            this.this$0 = addParticipantsCommands;
            this.$onSuccess = em6Var;
            this.$onError = em6Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(em6 em6Var, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
            if (em6Var != null) {
                em6Var.invoke(addParticipantsCommands.parseAddError(jSONObject));
            }
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((pze) obj);
            return qqg.a;
        }

        public final void invoke(pze pzeVar) {
            try {
                pzeVar.d(paj.d(this.$participantsIds, this.$isUnban, this.$isShowChatHistory), false, new ListenerAddParticipantsResponse(this.this$0, this.$onSuccess, this.$onError, null, 4, null), new b(this.$onError, this.this$0, 0));
            } catch (JSONException e) {
                em6 em6Var = this.$onError;
                if (em6Var != null) {
                    em6Var.invoke(new RuntimeException("add.participant", e));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpze;", "signaling", "Lqqg;", "invoke", "(Lpze;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipantsExtIds$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00521 extends u08 implements em6 {
        final /* synthetic */ boolean $isShowChatHistory;
        final /* synthetic */ Boolean $isUnban;
        final /* synthetic */ em6 $onError;
        final /* synthetic */ em6 $onSuccess;
        final /* synthetic */ Collection<o81> $participantsIds;
        final /* synthetic */ AddParticipantsCommands this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00521(Collection<o81> collection, Boolean bool, boolean z, AddParticipantsCommands addParticipantsCommands, em6 em6Var, em6 em6Var2) {
            super(1);
            this.$participantsIds = collection;
            this.$isUnban = bool;
            this.$isShowChatHistory = z;
            this.this$0 = addParticipantsCommands;
            this.$onSuccess = em6Var;
            this.$onError = em6Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(em6 em6Var, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
            if (em6Var != null) {
                em6Var.invoke(addParticipantsCommands.parseAddError(jSONObject));
            }
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((pze) obj);
            return qqg.a;
        }

        public final void invoke(pze pzeVar) throws JSONException {
            try {
                Collection<o81> collection = this.$participantsIds;
                Boolean bool = this.$isUnban;
                boolean z = this.$isShowChatHistory;
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<o81> it = collection.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().a);
                }
                jSONObject.put(ApiProtocol.PARAM_EXTERNAL_IDS, jSONArray);
                pzeVar.d(paj.a(jSONObject, bool, z), false, this.this$0.new ListenerAddParticipantsResponse(this.$onSuccess, this.$onError, this.$participantsIds), new b(this.$onError, this.this$0, 1));
            } catch (JSONException e) {
                em6 em6Var = this.$onError;
                if (em6Var != null) {
                    em6Var.invoke(new RuntimeException("add.participant", e));
                }
            }
        }
    }

    public AddParticipantsCommands(SignalingProvider signalingProvider, k01 k01Var, IdMappingWrapper idMappingWrapper, cm6 cm6Var) {
        this.signalingProvider = signalingProvider;
        this.call = k01Var;
        this.mappings = idMappingWrapper;
        this.stateProvider = cm6Var;
    }

    public static /* synthetic */ void addParticipants$default(AddParticipantsCommands addParticipantsCommands, Collection collection, Boolean bool, boolean z, em6 em6Var, em6 em6Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            em6Var = null;
        }
        if ((i & 16) != 0) {
            em6Var2 = null;
        }
        addParticipantsCommands.addParticipants(collection, bool, z, em6Var, em6Var2);
    }

    public static /* synthetic */ void addParticipantsExtIds$default(AddParticipantsCommands addParticipantsCommands, Collection collection, Boolean bool, boolean z, em6 em6Var, em6 em6Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            em6Var = null;
        }
        if ((i & 16) != 0) {
            em6Var2 = null;
        }
        addParticipantsCommands.addParticipantsExtIds(collection, bool, z, em6Var, em6Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddParticipantsFailedException parseAddError(JSONObject error) {
        String strOptString = error.optString("message");
        if (strOptString == null) {
            strOptString = "Add participants error: " + error;
        }
        return new AddParticipantsFailedException(strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException parseErrorResponse(org.json.JSONObject r3) {
        /*
            r2 = this;
            java.lang.String r0 = "message"
            java.lang.String r0 = r3.optString(r0)
            if (r0 != 0) goto L16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Add participant by link error: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = "error"
            java.lang.String r3 = r3.optString(r1)
            if (r3 == 0) goto L6e
            int r1 = r3.hashCode()
            switch(r1) {
                case -1949027499: goto L62;
                case -1148527576: goto L56;
                case -814624751: goto L4a;
                case -506696988: goto L3e;
                case -500593498: goto L32;
                case 1966207640: goto L26;
                default: goto L25;
            }
        L25:
            goto L6e
        L26:
            java.lang.String r1 = "link_is_outdated"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L2f
            goto L6e
        L2f:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r3 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.LINK_OUTDATED
            goto L70
        L32:
            java.lang.String r1 = "wrong_signature"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3b
            goto L6e
        L3b:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r3 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.WRONG_SIGNATURE
            goto L70
        L3e:
            java.lang.String r1 = "qr.general_error"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L47
            goto L6e
        L47:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r3 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_GENERAL_ERROR
            goto L70
        L4a:
            java.lang.String r1 = "qr.wrong_prefix"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L53
            goto L6e
        L53:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r3 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_WRONG_PREFIX
            goto L70
        L56:
            java.lang.String r1 = "qr.no_user_id_parameter"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L5f
            goto L6e
        L5f:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r3 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_NO_USER_ID_PARAMETER
            goto L70
        L62:
            java.lang.String r1 = "malformed_qr_url"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L6b
            goto L6e
        L6b:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r3 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.MALFORMED_QR_URL
            goto L70
        L6e:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r3 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.UNKNOWN
        L70:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException r1 = new ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands.parseErrorResponse(org.json.JSONObject):ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException");
    }

    private final void withSignaling(em6 onError, em6 provideSignaling) {
        pze signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            provideSignaling.invoke(signaling);
        } else if (onError != null) {
            onError.invoke(new IllegalStateException("Conversation is not prepared or already destroyed"));
        }
    }

    public static /* synthetic */ void withSignaling$default(AddParticipantsCommands addParticipantsCommands, em6 em6Var, em6 em6Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            em6Var = null;
        }
        addParticipantsCommands.withSignaling(em6Var, em6Var2);
    }

    public final void addParticipantByLink(String link, Runnable onSuccess, hu3 onError) {
        withSignaling(new AnonymousClass1(onError), new AnonymousClass2(link, onError, onSuccess, this));
    }

    public final void addParticipants(Collection<ti1> participantsIds, Boolean isUnban, boolean isShowChatHistory, em6 onSuccess, em6 onError) {
        if (this.stateProvider.invoke() == Conversation.State.Finished) {
            return;
        }
        withSignaling$default(this, null, new C00511(participantsIds, isUnban, isShowChatHistory, this, onSuccess, onError), 1, null);
    }

    public final void addParticipantsExtIds(Collection<o81> participantsIds, Boolean isUnban, boolean isShowChatHistory, em6 onSuccess, em6 onError) {
        if (this.stateProvider.invoke() == Conversation.State.Finished) {
            return;
        }
        withSignaling$default(this, null, new C00521(participantsIds, isUnban, isShowChatHistory, this, onSuccess, onError), 1, null);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001BI\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands$ListenerAddParticipantsResponse;", "Lmze;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "Lqqg;", "onSuccess", "", "onError", "", "Lo81;", ApiProtocol.PARAM_EXTERNAL_IDS, "<init>", "(Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands;Lem6;Lem6;Ljava/util/Collection;)V", "Lorg/json/JSONObject;", "response", "onResponse", "(Lorg/json/JSONObject;)V", "Lem6;", "Ljava/util/Collection;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class ListenerAddParticipantsResponse implements mze {
        private final Collection<o81> externalIds;
        private final em6 onError;
        private final em6 onSuccess;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[az1.y(2).length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ListenerAddParticipantsResponse(em6 em6Var, em6 em6Var2, Collection<o81> collection) {
            this.onSuccess = em6Var;
            this.onError = em6Var2;
            this.externalIds = collection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [hd5] */
        @Override // defpackage.mze
        public void onResponse(JSONObject response) throws JSONException {
            ArrayList arrayList;
            ArrayList arrayList2;
            try {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (response.has("participants")) {
                    JSONArray jSONArray = response.getJSONArray("participants");
                    int length = response.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            ti1 ti1VarW = paj.w(jSONObjectOptJSONObject);
                            int iV = az1.v(AddParticipantsCommands.this.call.y(ti1VarW, jSONObjectOptJSONObject));
                            if (iV == 0) {
                                arrayList3.add(ti1VarW);
                            } else if (iV == 1) {
                                arrayList4.add(ti1VarW);
                            }
                        }
                    }
                }
                em6 em6Var = this.onSuccess;
                if (em6Var != null) {
                    AddParticipantsCommands addParticipantsCommands = AddParticipantsCommands.this;
                    ArrayList arrayListD = paj.D(response, "rejectedParticipantIds");
                    ?? r9 = hd5.a;
                    if (arrayListD == null) {
                        arrayListD = r9;
                    }
                    ArrayList arrayListD2 = paj.D(response, "bannedParticipantIds");
                    if (arrayListD2 == null) {
                        arrayListD2 = r9;
                    }
                    ArrayList arrayListC = paj.C(response, "rejectedParticipants");
                    if (arrayListC == null) {
                        arrayListC = r9;
                    }
                    ArrayList arrayListC2 = paj.C(response, "bannedParticipants");
                    if (arrayListC2 == null) {
                        arrayListC2 = r9;
                    }
                    if (arrayListC.isEmpty() && arrayListC2.isEmpty()) {
                        arrayList = r9;
                        arrayList2 = r9;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Collection<o81> collection = this.externalIds;
                        if (collection != null) {
                            for (o81 o81Var : collection) {
                                ArrayList arrayList5 = arrayListC2;
                                linkedHashMap.put(o81Var.a, new ParticipantId(o81Var.a, o81Var.b == 3, o81Var.c));
                                arrayListC2 = arrayList5;
                            }
                        }
                        ArrayList arrayList6 = arrayListC2;
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it = arrayList6.iterator();
                        while (it.hasNext()) {
                            ParticipantId participantId = (ParticipantId) linkedHashMap.get((String) it.next());
                            if (participantId != null) {
                                arrayList7.add(participantId);
                            }
                        }
                        arrayList = new ArrayList();
                        Iterator it2 = arrayListC.iterator();
                        while (it2.hasNext()) {
                            ParticipantId participantId2 = (ParticipantId) linkedHashMap.get((String) it2.next());
                            if (participantId2 != null) {
                                arrayList.add(participantId2);
                            }
                        }
                        arrayList2 = arrayList7;
                    }
                    IdMappingWrapper idMappingWrapper = addParticipantsCommands.mappings;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it3 = arrayListD2.iterator();
                    while (it3.hasNext()) {
                        ParticipantId byInternal = idMappingWrapper.getByInternal((ti1) it3.next());
                        if (byInternal != null) {
                            arrayList8.add(byInternal);
                        }
                    }
                    ArrayList arrayListT = ue3.T(arrayList8, arrayList2);
                    IdMappingWrapper idMappingWrapper2 = addParticipantsCommands.mappings;
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it4 = arrayListD.iterator();
                    while (it4.hasNext()) {
                        ParticipantId byInternal2 = idMappingWrapper2.getByInternal((ti1) it4.next());
                        if (byInternal2 != null) {
                            arrayList9.add(byInternal2);
                        }
                    }
                    ArrayList arrayListT2 = ue3.T(arrayList9, arrayList);
                    IdMappingWrapper idMappingWrapper3 = addParticipantsCommands.mappings;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        ParticipantId byInternal3 = idMappingWrapper3.getByInternal((ti1) it5.next());
                        if (byInternal3 != null) {
                            arrayList10.add(byInternal3);
                        }
                    }
                    IdMappingWrapper idMappingWrapper4 = addParticipantsCommands.mappings;
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        ParticipantId byInternal4 = idMappingWrapper4.getByInternal((ti1) it6.next());
                        if (byInternal4 != null) {
                            arrayList11.add(byInternal4);
                        }
                    }
                    em6Var.invoke(new AddParticipantsResult(arrayList10, arrayList11, arrayListT2, arrayListT));
                }
            } catch (JSONException e) {
                em6 em6Var2 = this.onError;
                if (em6Var2 != null) {
                    em6Var2.invoke(new RuntimeException("add.participant.success", e));
                }
            }
        }

        public /* synthetic */ ListenerAddParticipantsResponse(AddParticipantsCommands addParticipantsCommands, em6 em6Var, em6 em6Var2, Collection collection, int i, tk4 tk4Var) {
            this((i & 1) != 0 ? null : em6Var, (i & 2) != 0 ? null : em6Var2, (i & 4) != 0 ? hd5.a : collection);
        }
    }
}
