package defpackage;

import android.app.Application;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.calls.CallNotifierFixActivity;
import one.me.calls.impl.model.CallCreateException;
import one.me.calls.impl.service.CallServiceImpl;
import org.apache.http.HttpStatus;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class hw1 implements tv1, wq {
    public final k18 A0;
    public final k18 B0;
    public final k18 C0;
    public final k18 D0;
    public final k18 E0;
    public final k18 F0;
    public final k18 G0;
    public final k18 H0;
    public final k18 I0;
    public final k18 J0;
    public final k18 K0;
    public final k18 L0;
    public final k18 M0;
    public final k18 N0;
    public final bwf O0;
    public final k18 P0;
    public final k18 Q0;
    public x9f R0;
    public x9f S0;
    public x9f T0;
    public boolean U0;
    public Long W0;
    public final k18 X;
    public boolean X0;
    public final k18 Y;
    public final k18 Z;
    public final sv1 a;
    public final tcf a1;
    public final p51 b;
    public final tcf b1;
    public final ow1 c;
    public final k18 c1;
    public final k18 d;
    public final vv1 d1;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final k18 y0;
    public final k18 z0;
    public final AtomicBoolean V0 = new AtomicBoolean(false);
    public final ConcurrentHashMap Y0 = new ConcurrentHashMap();
    public final LinkedHashSet Z0 = new LinkedHashSet();

    public hw1(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12, k18 k18Var13, k18 k18Var14, k18 k18Var15, k18 k18Var16, k18 k18Var17, k18 k18Var18, k18 k18Var19, k18 k18Var20, k18 k18Var21, k18 k18Var22, k18 k18Var23, k18 k18Var24, k18 k18Var25, k18 k18Var26, sv1 sv1Var, p51 p51Var, ow1 ow1Var, k18 k18Var27, k18 k18Var28, k18 k18Var29, k18 k18Var30, bwf bwfVar, k18 k18Var31) {
        this.a = sv1Var;
        this.b = p51Var;
        this.c = ow1Var;
        this.d = k18Var;
        this.o = k18Var3;
        this.X = k18Var4;
        this.Y = k18Var5;
        this.Z = k18Var6;
        this.s0 = k18Var7;
        this.t0 = k18Var9;
        this.u0 = k18Var11;
        this.v0 = k18Var14;
        this.w0 = k18Var8;
        this.x0 = k18Var10;
        this.y0 = k18Var12;
        this.z0 = k18Var17;
        this.A0 = k18Var15;
        this.B0 = k18Var18;
        this.C0 = k18Var19;
        this.D0 = k18Var2;
        this.E0 = k18Var21;
        this.F0 = k18Var22;
        this.G0 = k18Var23;
        this.H0 = k18Var24;
        this.I0 = k18Var27;
        this.J0 = k18Var28;
        this.K0 = k18Var16;
        this.L0 = k18Var25;
        this.M0 = k18Var29;
        this.N0 = k18Var30;
        this.O0 = bwfVar;
        this.P0 = k18Var31;
        this.Q0 = k18Var13;
        tcf tcfVarA = ucf.a(mb4.m);
        this.a1 = tcfVarA;
        this.b1 = tcfVarA;
        this.c1 = k18Var26;
        this.d1 = new vv1(this, k18Var8, k18Var7, k18Var2, k18Var, k18Var11);
        ((eza) k18Var20.getValue()).getClass();
        gw0.w(new g56(new m11(4, new ph0(((dob) ((nnb) k18Var14.getValue())).z0, 24)), new gw1(this, null), 1), sv1Var);
    }

    public static final void a(hw1 hw1Var, Throwable th) {
        Object value;
        mb4 mb4VarK;
        int i;
        String message;
        Throwable callCreateException = th;
        hw1Var.getClass();
        wqi.g("CallEngineTag", callCreateException, "can't start call", new Object[0]);
        tcf tcfVar = hw1Var.a1;
        do {
            value = tcfVar.getValue();
            mb4VarK = hw1Var.k();
            if (callCreateException instanceof ApiInvocationException) {
                if (hw1Var.k().a != null && (!(r5 instanceof kr1))) {
                    yx1 yx1VarP = hw1Var.p();
                    String str = hw1Var.l().c;
                    ApiInvocationException apiInvocationException = (ApiInvocationException) callCreateException;
                    int i2 = apiInvocationException.a;
                    String str2 = apiInvocationException.b;
                    yx1VarP.getClass();
                    yx1.d(yx1VarP, "GROUP_CALL_JOIN_FAILED", str, null, null, String.valueOf(i2), str2, true, 28);
                }
                String message2 = ((ApiInvocationException) callCreateException).getMessage();
                i = message2 == null ? 0 : (vmf.s(message2, "privacy.violation", false) || vmf.s(message2, "call.blocked", false)) ? 3 : vmf.s(message2, "not.chat.participant", false) ? 8 : vmf.s(message2, "wait.for.admin", false) ? 9 : vmf.s(message2, "user.restricted.call", false) ? 10 : 4;
                hw1Var.w().b(i != 0 ? u45.s(i) : null);
            } else {
                if ((callCreateException instanceof IllegalStateException) && (message = callCreateException.getMessage()) != null && vmf.s(message, "endpoint is null", false)) {
                    hw1Var.w().b(null);
                }
                i = 0;
            }
        } while (!tcfVar.c(value, mb4.a(mb4VarK, null, 0L, null, null, false, false, false, null, new vn5(i != 0 ? i : 4), 4095)));
        Long l = (Long) hw1Var.s().f.getValue();
        long jLongValue = l != null ? l.longValue() : 0L;
        hw1Var.C();
        if (callCreateException instanceof IOException) {
            callCreateException = new CallCreateException(wy1.h("Can't create a call due to error: ", callCreateException.getMessage()), callCreateException);
        }
        ((j94) hw1Var.E0.getValue()).a("ONEME-6833", callCreateException);
        hw1Var.o().a(hw1Var.k().i, false);
        hw1Var.p().f = 8;
        ConversationEndReason.Error error = new ConversationEndReason.Error(callCreateException);
        Throwable cause = callCreateException.getCause();
        hw1Var.D(error, jLongValue, cause != null ? cause.getMessage() : null);
    }

    public static final void b(hw1 hw1Var, ConversationEndReason conversationEndReason) {
        Object value;
        Object value2;
        mb4 mb4VarK;
        Object value3;
        Object value4;
        mb4 mb4VarK2;
        co5 vn5Var;
        co5 co5Var;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        co5 co5Var2 = wn5.a;
        hw1Var.p().f = 8;
        Long l = (Long) hw1Var.s().f.getValue();
        hw1Var.D(conversationEndReason, l != null ? l.longValue() : 0L, null);
        Conversation conversationR = hw1Var.r();
        if (conversationR != null) {
            x65 x65VarS = hw1Var.s();
            if (hw1Var.k().i || !hw1Var.k().h) {
                hw1Var.G(conversationR, conversationEndReason, x65VarS);
            } else {
                Long l2 = hw1Var.W0;
                boolean zG = l2 != null ? ((qv3) hw1Var.J0.getValue()).g(l2.longValue()) : false;
                if (l2 == null || conversationR.isCaller() || zG) {
                    hw1Var.G(conversationR, conversationEndReason, x65VarS);
                } else {
                    String conversationId = conversationR.getConversationId();
                    long jLongValue = l2.longValue();
                    cx1 cx1Var = (cx1) hw1Var.z0.getValue();
                    if (((tih) cx1Var.c.getValue()).d()) {
                        id1 id1Var = (id1) cx1Var.b.getValue();
                        id1Var.getClass();
                        Intent intent = new Intent(id1Var.b(), (Class<?>) CallNotifierFixActivity.class);
                        intent.setAction("action-unknown-call");
                        intent.putExtra("call_id", conversationId);
                        intent.putExtra("caller_id", jLongValue);
                        intent.setFlags(268435456);
                        id1Var.b().startActivity(intent);
                    }
                }
            }
            x65 x65VarS2 = hw1Var.s();
            tcf tcfVar = x65VarS2.e;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, null));
            x9f x9fVar = x65VarS2.c;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            x65VarS2.c = null;
            hw1Var.x().e();
            ((f41) hw1Var.Y.getValue()).c(false);
            if (conversationEndReason instanceof ConversationEndReason.Missed) {
                tcf tcfVar2 = hw1Var.a1;
                do {
                    value8 = tcfVar2.getValue();
                } while (!tcfVar2.c(value8, mb4.a(hw1Var.k(), null, 0L, null, null, false, false, false, null, new vn5(1), 4095)));
                hw1Var.x().d();
            } else if (conversationEndReason instanceof ConversationEndReason.Rejected) {
                tcf tcfVar3 = hw1Var.a1;
                do {
                    value7 = tcfVar3.getValue();
                } while (!tcfVar3.c(value7, mb4.a(hw1Var.k(), null, 0L, null, null, false, false, false, null, new vn5(11), 4095)));
                hw1Var.x().b();
            } else if (conversationEndReason instanceof ConversationEndReason.Busy) {
                tcf tcfVar4 = hw1Var.a1;
                do {
                    value6 = tcfVar4.getValue();
                } while (!tcfVar4.c(value6, mb4.a(hw1Var.k(), null, 0L, null, null, false, false, false, null, new vn5(2), 4095)));
                hw1Var.x().b();
            } else if ((conversationEndReason instanceof ConversationEndReason.RemovedFromCall) || (conversationEndReason instanceof ConversationEndReason.Banned)) {
                tcf tcfVar5 = hw1Var.a1;
                do {
                    value2 = tcfVar5.getValue();
                    mb4VarK = hw1Var.k();
                } while (!tcfVar5.c(value2, mb4VarK.l instanceof bo5 ? mb4.a(mb4VarK, null, 0L, null, null, false, false, false, null, new vn5(7), 4095) : mb4.a(mb4VarK, null, 0L, null, null, false, false, false, null, new vn5(6), 4095)));
                if (conversationR.isAnswered()) {
                    hw1Var.x().d();
                }
            } else if ((conversationEndReason instanceof ConversationEndReason.Hangup) || (conversationEndReason instanceof ConversationEndReason.EndedForAll) || (conversationEndReason instanceof ConversationEndReason.Canceled) || (conversationEndReason instanceof ConversationEndReason.AcceptedOnAnotherDevice)) {
                tcf tcfVar6 = hw1Var.a1;
                do {
                    value3 = tcfVar6.getValue();
                } while (!tcfVar6.c(value3, mb4.a(hw1Var.k(), null, 0L, null, null, false, false, false, null, co5Var2, 4095)));
                if (conversationR.isAnswered()) {
                    hw1Var.x().d();
                }
            } else if ((conversationEndReason instanceof ConversationEndReason.ConversationAlreadyEnded) || (conversationEndReason instanceof ConversationEndReason.CallTimeout) || (conversationEndReason instanceof ConversationEndReason.Error) || (conversationEndReason instanceof ConversationEndReason.ObsoleteClient) || (conversationEndReason instanceof ConversationEndReason.Unknown)) {
                tcf tcfVar7 = hw1Var.a1;
                do {
                    value4 = tcfVar7.getValue();
                    mb4VarK2 = hw1Var.k();
                    if (mb4VarK2.i) {
                        vn5Var = new vn5(12);
                    } else if (mb4VarK2.h) {
                        co5Var = co5Var2;
                    } else {
                        vn5Var = new vn5(4);
                    }
                    co5Var = vn5Var;
                } while (!tcfVar7.c(value4, mb4.a(mb4VarK2, null, 0L, null, null, false, false, false, null, co5Var, 4095)));
                hw1Var.x().e();
            } else {
                if (!(conversationEndReason instanceof ConversationEndReason.PeerConnectionTimeout) && !(conversationEndReason instanceof ConversationEndReason.SignalingTimeout)) {
                    throw new NoWhenBranchMatchedException();
                }
                tcf tcfVar8 = hw1Var.a1;
                do {
                    value5 = tcfVar8.getValue();
                } while (!tcfVar8.c(value5, mb4.a(hw1Var.k(), null, 0L, null, null, false, false, false, null, new vn5(5), 4095)));
                yx1 yx1VarP = hw1Var.p();
                String conversationId2 = conversationR.getConversationId();
                boolean zIsGroupCall = conversationR.isGroupCall();
                yx1VarP.getClass();
                yx1.d(yx1VarP, "BAD_CONNECTION_ALERT", conversationId2, "DISCONNECT", null, null, null, zIsGroupCall, 120);
                if (conversationR.isAnswered()) {
                    hw1Var.x().d();
                }
            }
            Iterator it = hw1Var.Z0.iterator();
            while (it.hasNext()) {
                ((iq1) it.next()).e();
            }
        }
        hw1Var.Y0.clear();
    }

    public static final void d(hw1 hw1Var) {
        Object value;
        mb4 mb4VarK;
        boolean z;
        tcf tcfVar = hw1Var.a1;
        do {
            value = tcfVar.getValue();
            mb4VarK = hw1Var.k();
            boolean z2 = mb4VarK.i;
            boolean z3 = mb4VarK.e;
            if (!z2 && !mb4VarK.j) {
                return;
            }
            if (!mb4VarK.f) {
                hw1Var.H(true);
            }
            Conversation conversationA = hw1Var.q().a();
            Collection participants = conversationA != null ? conversationA.getParticipants() : null;
            if (participants == null) {
                participants = hd5.a;
            }
            if (z2 || participants.size() <= 2) {
                z = z2;
            } else {
                hw1Var.W0 = null;
                z = true;
            }
            boolean z4 = (z3 || !hw1Var.A(participants)) ? z3 : true;
            if (z4 != z3 || z != z2) {
                mb4VarK = mb4.a(mb4VarK, null, 0L, null, null, z4, z ? true : mb4VarK.g, z, null, null, 7855);
            }
        } while (!tcfVar.c(value, mb4VarK));
    }

    public final boolean A(Collection collection) {
        Conversation conversationA = q().a();
        if (conversationA == null) {
            return false;
        }
        ParticipantId externalId = conversationA.getMe().getExternalId();
        ParticipantId participantIdC = externalId != null ? knb.c(knb.a(externalId)) : null;
        if (collection != null && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!fni.a(((ConversationParticipant) it.next()).getExternalId(), participantIdC)) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        boolean z = l().i;
        k18 k18Var = this.v0;
        boolean z2 = ((onb) ((dob) ((nnb) k18Var.getValue())).z0.getValue()).h;
        boolean zIsScreenCaptureEnabled = ((onb) ((dob) ((nnb) k18Var.getValue())).z0.getValue()).a.a.isScreenCaptureEnabled();
        return z ? !zIsScreenCaptureEnabled : z2 && !zIsScreenCaptureEnabled;
    }

    public final void C() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        mb4 mb4Var;
        co5 co5Var;
        gxi gxiVar;
        wqi.c("CallEngineTag", "release call data", new Object[0]);
        x9f x9fVar = this.T0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.T0 = null;
        x9f x9fVar2 = this.R0;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        this.R0 = null;
        n41 n41Var = (n41) ((c51) m()).j.getValue();
        zo1 zo1Var = (zo1) this.D0.getValue();
        Application application = (Application) this.d.getValue();
        zo1Var.getClass();
        zo1.c().post(new qn(application, 1));
        ((tih) this.P0.getValue()).i.remove(this);
        w().c(this.d1);
        ax1 ax1VarW = w();
        k18 k18Var = this.x0;
        ax1VarW.c((fob) k18Var.getValue());
        ax1 ax1VarW2 = w();
        k18 k18Var2 = this.L0;
        ax1VarW2.c((z01) k18Var2.getValue());
        ax1 ax1VarW3 = w();
        k18 k18Var3 = this.Q0;
        ax1VarW3.c((jd1) k18Var3.getValue());
        x9f x9fVar3 = this.S0;
        if (x9fVar3 != null) {
            x9fVar3.cancel((CancellationException) null);
        }
        this.S0 = null;
        this.U0 = false;
        x().e();
        oy4 oy4Var = (oy4) this.t0.getValue();
        x9f x9fVar4 = oy4Var.e;
        if (x9fVar4 != null) {
            x9fVar4.cancel((CancellationException) null);
        }
        oy4Var.e = null;
        ((gob) ((fob) k18Var.getValue())).clear();
        ((ix1) this.y0.getValue()).d();
        w21 w21Var = (w21) ((v21) this.s0.getValue());
        w21Var.getClass();
        w21Var.a(CallsAudioManager.State.IDLE);
        CallsAudioManager callsAudioManager = (CallsAudioManager) w21Var.c.getAndSet(null);
        wqi.c("CallAudioController", "CallAudioController released: " + (callsAudioManager != null ? Integer.valueOf(callsAudioManager.hashCode()) : null), new Object[0]);
        x65 x65VarS = s();
        tcf tcfVar = x65VarS.e;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, null));
        x9f x9fVar5 = x65VarS.c;
        if (x9fVar5 != null) {
            x9fVar5.cancel((CancellationException) null);
        }
        x65VarS.c = null;
        c51 c51Var = (c51) m();
        c51Var.getClass();
        t9f t9fVar = c51Var.l;
        wqi.c("CallChatRepositoryTag", "release call chat state", new Object[0]);
        x9f x9fVar6 = c51Var.m;
        if (x9fVar6 != null) {
            x9fVar6.cancel((CancellationException) null);
        }
        c51Var.m = null;
        x9f x9fVar7 = c51Var.n;
        if (x9fVar7 != null) {
            x9fVar7.cancel((CancellationException) null);
        }
        c51Var.n = null;
        yy7[] yy7VarArr = c51.o;
        qt7 qt7Var = (qt7) t9fVar.D(c51Var, yy7VarArr[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(c51Var, yy7VarArr[0], null);
        tcf tcfVar2 = c51Var.i;
        do {
            value2 = tcfVar2.getValue();
        } while (!tcfVar2.c(value2, n41.h));
        tcf tcfVar3 = ((g1e) this.K0.getValue()).b;
        do {
            value3 = tcfVar3.getValue();
            ((Boolean) value3).getClass();
        } while (!tcfVar3.c(value3, Boolean.FALSE));
        v11 v11Var = (v11) ((z01) k18Var2.getValue());
        qt7 qt7Var2 = (qt7) v11Var.z0.D(v11Var, v11.G0[0]);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
        x9f x9fVar8 = v11Var.y0;
        if (x9fVar8 != null) {
            x9fVar8.cancel((CancellationException) null);
        }
        v11Var.y0 = null;
        v11Var.x0.set(false);
        ParticipantStatesManager participantStatesManagerF = v11Var.f();
        if (participantStatesManagerF != null) {
            participantStatesManagerF.removeHandListener((ParticipantStatesManager.Listener) v11Var.Y.getValue());
        }
        MediaMuteManager mediaMuteManagerE = v11Var.e();
        if (mediaMuteManagerE != null) {
            mediaMuteManagerE.removeListener((q11) v11Var.A0.getValue());
        }
        ConversationFeatureManager conversationFeatureManagerG = v11Var.g();
        if (conversationFeatureManagerG != null) {
            conversationFeatureManagerG.removeFeatureListener(u81.b, (r11) v11Var.B0.getValue());
        }
        v11Var.Z.set(new xs(0));
        tcf tcfVar4 = v11Var.s0;
        do {
            value4 = tcfVar4.getValue();
        } while (!tcfVar4.c(value4, qa.d));
        v11Var.u0.set(false);
        v11Var.v0.set(false);
        v11Var.w0.set(false);
        md1 md1Var = (md1) ((jd1) k18Var3.getValue());
        Conversation conversationA = ((n64) md1Var.a.getValue()).a();
        ConversationFeatureManager featureManager = conversationA != null ? conversationA.getFeatureManager() : null;
        if (featureManager != null) {
            featureManager.removeFeatureListener(u81.a, (kd1) md1Var.Y.getValue());
        }
        md1Var.Z.m(null, Boolean.FALSE);
        md1Var.X.set(false);
        qt7 qt7Var3 = (qt7) md1Var.d.D(md1Var, md1.t0[0]);
        if (qt7Var3 != null) {
            qt7Var3.cancel(null);
        }
        Conversation conversationA2 = q().a();
        k18 k18Var4 = this.A0;
        if (conversationA2 != null) {
            conversationA2.getMediaConnectionManager().removeListener(w());
            conversationA2.getRecordManager().removeRecordListener((u1e) k18Var4.getValue());
            try {
                conversationA2.release();
            } catch (Throwable th) {
                wqi.e("CallEngineTag", th.getMessage(), th);
            }
        }
        ((d2e) ((u1e) k18Var4.getValue())).c(f2e.d);
        q().a.set(null);
        ((dob) ((nnb) this.v0.getValue())).a();
        tcf tcfVar5 = this.a1;
        c9c c9cVar = ((mb4) tcfVar5.getValue()).k;
        if (c9cVar == null || c9cVar.equals(c9c.e)) {
            do {
                value5 = tcfVar5.getValue();
                mb4Var = (mb4) value5;
                co5Var = mb4Var.l;
                vn5 vn5Var = co5Var instanceof vn5 ? (vn5) co5Var : null;
                boolean z = (vn5Var != null ? vn5Var.a : 0) == 3;
                gxiVar = mb4Var.a;
                if (mb4Var.i || z) {
                    gxiVar = null;
                }
            } while (!tcfVar5.c(value5, mb4.a(mb4.m, null, 0L, null, null, false, false, false, new c9c(mb4Var.c, gxiVar, co5Var, n41Var), null, 7167)));
        }
        this.V0.set(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r12, long r13, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw1.D(ru.ok.android.externcalls.sdk.events.end.ConversationEndReason, long, java.lang.String):void");
    }

    public final void E(naf nafVar) {
        o51 o51VarD;
        if (!g(nafVar.a)) {
            wqi.c("CallEngineTag", "outgoing call can't start because call already started.", new Object[0]);
            return;
        }
        p().d = rx1.a;
        p().f = 1;
        o().b(false);
        j(null);
        uid uidVar = new uid();
        p51 p51Var = this.b;
        uv1 uv1Var = new uv1(this, nafVar, uidVar, 0);
        jx0 jx0Var = new jx0(1, this, hw1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 2);
        maf mafVar = nafVar.a;
        if (mafVar instanceof kaf) {
            o51VarD = p51Var.a(((kaf) mafVar).a, nafVar, uv1Var, jx0Var);
        } else if (mafVar instanceof iaf) {
            o51VarD = p51Var.b(((iaf) mafVar).a, nafVar, nafVar.b, uv1Var, jx0Var);
        } else if (mafVar instanceof jaf) {
            jaf jafVar = (jaf) mafVar;
            o51VarD = p51Var.d(jafVar.a, jafVar.c, nafVar, jafVar.b, uv1Var, jx0Var);
        } else {
            if (!(mafVar instanceof laf)) {
                throw new NoWhenBranchMatchedException();
            }
            gxi gxiVar = ((laf) mafVar).a;
            if (gxiVar instanceof kr1) {
                o51VarD = p51Var.a((kr1) gxiVar, nafVar, uv1Var, jx0Var);
            } else if (gxiVar instanceof ir1) {
                o51VarD = p51Var.b((ir1) gxiVar, nafVar, ((ir1) gxiVar).b, uv1Var, jx0Var);
            } else {
                if (!(gxiVar instanceof jr1)) {
                    throw new NoWhenBranchMatchedException();
                }
                jr1 jr1Var = (jr1) gxiVar;
                String str = jr1Var.a;
                boolean z = jr1Var.b;
                gxiVar.getClass();
                o51VarD = p51Var.d(str, z, nafVar, false, uv1Var, jx0Var);
            }
        }
        i(o51VarD);
        uidVar.a = o51VarD;
    }

    public final void F(String str, String str2, boolean z) {
        yx1 yx1VarP = p();
        long j = z ? 2L : 1L;
        yx1VarP.getClass();
        yx1.d(yx1VarP, "INCOMING_CALL_INIT", str, null, Long.valueOf(j), str2, null, false, 212);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [hd5] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(ru.ok.android.externcalls.sdk.Conversation r19, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r20, defpackage.x65 r21) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw1.G(ru.ok.android.externcalls.sdk.Conversation, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason, x65):void");
    }

    public final void H(boolean z) {
        Conversation conversation;
        int i;
        boolean z2;
        Object value;
        ConversationParticipant opponent;
        ParticipantId externalId;
        zn5 zn5Var = zn5.a;
        Conversation conversationR = r();
        if (conversationR != null) {
            gxi gxiVar = k().a;
            boolean z3 = gxiVar != null && ((gxiVar instanceof kr1) ^ true);
            boolean z4 = k().f;
            int i2 = 6;
            if (z || !z4) {
                conversation = conversationR;
                i = 6;
            } else {
                x().e();
                tcf tcfVar = this.a1;
                while (true) {
                    Object value2 = tcfVar.getValue();
                    tcf tcfVar2 = tcfVar;
                    conversation = conversationR;
                    i = i2;
                    if (tcfVar2.c(value2, mb4.a(k(), null, 0L, null, null, false, false, false, null, zn5Var, 4063))) {
                        break;
                    }
                    i2 = i;
                    tcfVar = tcfVar2;
                    conversationR = conversation;
                }
                if (!z3) {
                    oqd oqdVarX = x();
                    oqdVarX.d = i;
                    el1 el1VarA = oqdVarX.a();
                    el1VarA.c(el1VarA.k.e, false);
                }
            }
            if (z3) {
                ParticipantCollection participants = conversation.getParticipants();
                if (participants == null || !participants.isEmpty()) {
                    Iterator<ConversationParticipant> it = participants.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ConversationParticipant next = it.next();
                        if (next.isUseable() && next.isCallAccepted()) {
                            if (!conversation.isMeInWaitingRoom()) {
                            }
                        }
                    }
                }
                z2 = false;
            } else {
                ParticipantCollection participants2 = conversation.getParticipants();
                if (participants2 == null || !participants2.isEmpty()) {
                    for (ConversationParticipant conversationParticipant : participants2) {
                        if (!conversationParticipant.isUseable() || !conversationParticipant.isCallAccepted()) {
                            z2 = false;
                        }
                    }
                }
                z2 = true;
            }
            if (!z3) {
                Conversation conversationR2 = r();
                this.W0 = (conversationR2 == null || (opponent = conversationR2.getOpponent()) == null || (externalId = opponent.getExternalId()) == null) ? null : Long.valueOf(knb.a(externalId).a);
            }
            if (z2) {
                x().e();
                x65 x65VarS = s();
                if (x65VarS.c == null) {
                    x65VarS.c = svi.e(x65VarS.a, ((q2b) ((lzf) x65VarS.b.getValue())).a(), null, new w65(x65VarS, null), 2);
                }
                if (!k().h && !z3) {
                    oqd oqdVarX2 = x();
                    oqdVarX2.d = i;
                    el1 el1VarA2 = oqdVarX2.a();
                    el1VarA2.c(el1VarA2.k.e, false);
                }
                if (z3) {
                    yx1 yx1VarP = p();
                    String str = l().c;
                    Long lValueOf = Long.valueOf(conversation.getParticipants().size());
                    yx1VarP.getClass();
                    yx1.d(yx1VarP, "GROUP_CALL_JOIN", str, null, lValueOf, null, null, true, 116);
                }
                tcf tcfVar3 = this.a1;
                do {
                    value = tcfVar3.getValue();
                } while (!tcfVar3.c(value, mb4.a(k(), null, 0L, null, null, false, false, false, null, zn5Var, 4063)));
                p().f = i;
                ((gob) ((fob) this.x0.getValue())).rebindParticipantViews();
            }
        }
    }

    @Override // defpackage.wq
    public final void c() {
        if (x().a().a()) {
            return;
        }
        x().e();
    }

    public final void e(iq1 iq1Var) {
        this.Z0.add(iq1Var);
    }

    public final void f(boolean z) {
        wqi.c("CallEngineTag", "call answer", new Object[0]);
        String str = l().c;
        gxi gxiVar = l().a;
        yx1.e(p(), str, "ANSWERED", (gxiVar == null || !gxiVar.a()) ? 1L : 2L, null, 24);
        Conversation conversationR = r();
        if (conversationR == null || !conversationR.isPrepared()) {
            return;
        }
        conversationR.init();
        conversationR.connect();
        gu5 gu5Var = (gu5) ((rt5) this.F0.getValue());
        gu5Var.getClass();
        if (gu5Var.k(PmsKey.f12callincomingab, 0L) != 0) {
            ((f41) this.Y.getValue()).c(z);
        }
    }

    public final boolean g(maf mafVar) {
        gxi gxiVar = k().a;
        if (gxiVar == null) {
            return true;
        }
        if ((mafVar instanceof iaf) && (gxiVar instanceof ir1) && ((iaf) mafVar).a.a == ((ir1) gxiVar).a) {
            return false;
        }
        if ((mafVar instanceof kaf) && (gxiVar instanceof kr1) && ((kaf) mafVar).a.a == ((kr1) gxiVar).a) {
            return false;
        }
        boolean z = mafVar instanceof jaf;
        if (z && (gxiVar instanceof jr1) && fni.a(dqi.t(((jaf) mafVar).a), dqi.t(((jr1) gxiVar).a))) {
            return false;
        }
        return (z && (gxiVar instanceof ir1) && fni.a(dqi.t(((jaf) mafVar).a), dqi.t(k().d))) ? false : true;
    }

    public final void h(o51 o51Var) {
        Object value;
        mb4 mb4VarK;
        String conversationId;
        String joinLink;
        boolean zA;
        gxi jr1Var;
        wqi.c("CallEngineTag", "init prepared conversation", new Object[0]);
        if (k().k != null) {
            String conversationId2 = o51Var.a.getConversationId();
            String str = k().c;
            c9c c9cVar = k().k;
            StringBuilder sbL = wy1.l("Call already destroyed, release all: prepared=", conversationId2, " active=", str, " previousCallState=");
            sbL.append(c9cVar);
            wqi.c("CallEngineTag", sbL.toString(), new Object[0]);
            C();
            return;
        }
        Iterator it = this.Z0.iterator();
        while (it.hasNext()) {
            ((iq1) it.next()).k();
        }
        co5 co5Var = k().l;
        boolean z = o51Var.b instanceof kr1;
        boolean z2 = !z;
        Conversation conversation = o51Var.a;
        boolean z3 = false;
        int i = 1;
        if (o51Var.d && !conversation.isCaller() && !conversation.isAnswered() && !conversation.isConcurrent() && !conversation.isCaller()) {
            z3 = true;
        }
        n41 n41Var = (n41) ((c51) m()).j.getValue();
        if (z3) {
            wqi.c("CallEngineTag", "doAfterCallPrepared show incoming", new Object[0]);
            cx1 cx1Var = (cx1) this.z0.getValue();
            boolean zA2 = o51Var.b.a();
            cx1Var.getClass();
            wqi.c("CallsNavigatorTag", "show showIncomingCallUi", new Object[0]);
            boolean zC = ((ix1) cx1Var.a.getValue()).c();
            if (zC) {
                wqi.c("CallsNavigatorTag", "notification available, will show via service.", new Object[0]);
            } else {
                if (zC || !((tih) cx1Var.c.getValue()).d()) {
                    wqi.c("CallsNavigatorTag", "can't show incoming call ui", new Object[0]);
                    return;
                }
                ho7.q("show call screen areIncomingNotificationsEnabled=", "CallsNavigatorTag", zC);
                id1 id1Var = (id1) cx1Var.b.getValue();
                id1Var.getClass();
                Intent intent = new Intent(id1Var.b(), (Class<?>) CallNotifierFixActivity.class);
                id1.a(intent, n41Var, zA2);
                id1Var.b().startActivity(intent);
            }
        } else {
            wqi.c("CallEngineTag", "doAfterCallPrepared answer", new Object[0]);
            Conversation conversation2 = o51Var.a;
            conversation2.init();
            conversation2.connect();
        }
        x9f x9fVar = this.T0;
        int i2 = 6;
        if (x9fVar == null || !x9fVar.isActive()) {
            this.T0 = gw0.w(gw0.u(new g56(gw0.l(new ph0(((c51) m()).j, 23), new cj0(i2)), new dw1(this, null), i), ((q2b) ((lzf) this.C0.getValue())).c()), this.a);
        }
        if (z3) {
            oqd oqdVarX = x();
            oqdVarX.d = 2;
            el1 el1VarA = oqdVarX.a();
            int ringerMode = ((AudioManager) el1VarA.g.getValue()).getRingerMode();
            if (ringerMode == 0) {
                wqi.c("RingtoneManagerTag", "current ringer mode is RINGER_MODE_SILENT", new Object[0]);
            } else if (ringerMode == 1) {
                wqi.c("RingtoneManagerTag", "current ringer mode is RINGER_MODE_VIBRATE", new Object[0]);
                el1VarA.d();
            } else if (ringerMode == 2) {
                wqi.c("RingtoneManagerTag", "current ringer mode is RINGER_MODE_NORMAL", new Object[0]);
                el1VarA.c(el1VarA.k.b, true);
                el1VarA.d();
            }
        } else if ((o51Var.b instanceof kr1) && conversation.isCaller() && !conversation.isDestroyed() && !conversation.isAnswered()) {
            co5Var = ao5.a;
            oqd oqdVarX2 = x();
            oqdVarX2.d = 3;
            el1 el1VarA2 = oqdVarX2.a();
            el1VarA2.c(el1VarA2.k.c, true);
            p().f = 3;
        } else if (!(o51Var.b instanceof kr1)) {
            if (!(co5Var instanceof bo5)) {
                p().f = 6;
                co5Var = zn5.a;
            }
            x().e();
        }
        co5 co5Var2 = co5Var;
        conversation.getMediaConnectionManager().addListener(w());
        conversation.getRecordManager().addRecordListener((u1e) this.A0.getValue());
        d2e d2eVar = (d2e) ((u1e) this.A0.getValue());
        d2eVar.getClass();
        wqi.m("ScreenRecordControllerTag", "prepare recoding state", new Object[0]);
        d2eVar.onRecordStarted();
        m11 m11Var = new m11(21, new xnb(((dx3) d2eVar.X.getValue()).a(), 9));
        int i3 = s65.d;
        d2eVar.x0 = gw0.w(gw0.u(new g56(new uxb(gw0.s(zs0.a(m11Var, v9j.h(HttpStatus.SC_MULTIPLE_CHOICES, y65.MILLISECONDS), new hwd(i)), new a2e(2, null)), d2eVar, 13), new b2e(d2eVar, null), i), ((q2b) ((lzf) d2eVar.Y.getValue())).a()), (sv1) d2eVar.c.getValue());
        if (z) {
            md1 md1Var = (md1) ((jd1) this.Q0.getValue());
            Conversation conversationA = ((n64) md1Var.a.getValue()).a();
            ConversationFeatureManager featureManager = conversationA != null ? conversationA.getFeatureManager() : null;
            if (featureManager != null) {
                featureManager.addFeatureListener(u81.a, (kd1) md1Var.Y.getValue());
            }
            md1Var.a();
        }
        tcf tcfVar = this.a1;
        do {
            value = tcfVar.getValue();
            mb4VarK = k();
            conversationId = o51Var.a.getConversationId();
            joinLink = o51Var.a.getJoinLink();
            zA = o51Var.b instanceof kr1 ? true : A(o51Var.a.getParticipants());
            gxi gxiVar = o51Var.b;
            jr1 jr1Var2 = gxiVar instanceof jr1 ? (jr1) gxiVar : null;
            if (jr1Var2 != null) {
                String joinLink2 = o51Var.a.getJoinLink();
                if (joinLink2 == null) {
                    joinLink2 = jr1Var2.a;
                }
                jr1Var = new jr1(joinLink2, jr1Var2.b);
            } else {
                jr1Var = gxiVar;
            }
        } while (!tcfVar.c(value, mb4.a(mb4VarK, jr1Var, 0L, conversationId, joinLink, zA, false, false, null, co5Var2, 4066)));
        oy4 oy4Var = (oy4) this.t0.getValue();
        x9f x9fVar2 = oy4Var.e;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        oy4Var.e = null;
        oy4Var.e = svi.e(oy4Var.a, ((q2b) ((lzf) oy4Var.c.getValue())).a(), null, new ny4(oy4Var, null), 2);
        if (((o51Var.d && o51Var.b.a()) || !z) && !((qsb) this.H0.getValue()).c(qsb.m)) {
            p().g(o51Var.a.getConversationId(), "OUT_OF_CALL", z2);
        }
        if (!z && !((qsb) this.H0.getValue()).c(qsb.h)) {
            yx1 yx1VarP = p();
            String conversationId3 = o51Var.a.getConversationId();
            yx1VarP.getClass();
            yx1.d(yx1VarP, "REQUEST_PERMISSION_MIC", conversationId3, "AFTER_INITIATION", null, null, null, z2, 120);
        }
        o().a(k().i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(o51 o51Var) {
        Object value;
        boolean z = o51Var.b instanceof kr1;
        boolean z2 = !z;
        tcf tcfVar = this.a1;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new mb4(o51Var.b, o51Var.a.getConversationId(), o51Var.a.getJoinLink(), z2, o51Var.d, z2, 3634)));
        q().a.getAndSet(o51Var.a);
        ((tih) this.P0.getValue()).c(this);
        w().d(this.d1);
        w().d((fob) this.x0.getValue());
        w().d((z01) this.L0.getValue());
        w().d((jd1) this.Q0.getValue());
        this.S0 = svi.e(this.a, null, null, new yv1(this, null), 3);
        int i = 1;
        if (!o51Var.d && (o51Var.b instanceof kr1)) {
            oqd oqdVarX = x();
            oqdVarX.d = 3;
            el1 el1VarA = oqdVarX.a();
            el1VarA.c(el1VarA.k.c, true);
            p().f = 3;
        }
        gxi gxiVar = o51Var.b;
        int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (gxiVar instanceof ir1) {
            c51 c51Var = (c51) m();
            c51Var.l.O(c51Var, c51.o[0], c51Var.c(c51Var.b().k(((ir1) gxiVar).a), true));
        } else if (gxiVar instanceof kr1) {
            s41 s41VarM = m();
            long j = ((kr1) gxiVar).a;
            c51 c51Var2 = (c51) s41VarM;
            x9f x9fVar = c51Var2.n;
            if (x9fVar == null || !x9fVar.isActive()) {
                wqi.c("CallChatRepositoryTag", "start loading call chat in p2p", new Object[0]);
                c51Var2.n = svi.e(c51Var2.a, ((q2b) ((lzf) c51Var2.e.getValue())).a(), null, new a51(c51Var2, j, null), 2);
            } else {
                wqi.c("CallChatRepositoryTag", "load call chat in p2p in progress", new Object[0]);
            }
        } else {
            if (!(gxiVar instanceof jr1)) {
                throw new NoWhenBranchMatchedException();
            }
            jr1 jr1Var = (jr1) gxiVar;
            ((c51) m()).d(jr1Var.a, jr1Var.b);
        }
        dob dobVar = (dob) ((nnb) this.v0.getValue());
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            dobVar.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ParticipantsRepository", ho7.f(((onb) dobVar.z0.getValue()).c.size(), "Call prepare participant state, current participants size="), null);
            }
        }
        jve jveVar = dobVar.t0;
        int i3 = s65.d;
        y65 y65Var = y65.MILLISECONDS;
        int i4 = 26;
        dobVar.x0.O(dobVar, dob.A0[0], gw0.w(gw0.u(new m36(new y83(gw0.m(new rnb(zs0.a(jveVar, v9j.i(300L, y65Var), new cj0(i4)), dobVar, objArr3 == true ? 1 : 0)), i4, dobVar), new tnb(4, null)), ((q2b) ((lzf) dobVar.Y.getValue())).a()), dobVar.a));
        Conversation conversationA = ((n64) dobVar.d.getValue()).a();
        ParticipantStatesManager participantStatesManager = conversationA != null ? conversationA.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.addHandListener((ParticipantStatesManager.Listener) dobVar.Z.getValue());
        }
        dobVar.u0 = gw0.w(new g56(((g1e) dobVar.X.getValue()).b, new ynb(dobVar, null), i), dobVar.a);
        dobVar.v0 = gw0.w(gw0.u(new g56(new rnb(zs0.a(new m11(19, new xnb(((dx3) dobVar.o.getValue()).a(), objArr2 == true ? 1 : 0)), v9j.i(300L, y65Var), new cj0(25)), dobVar, i), new znb(dobVar, null), i), ((q2b) ((lzf) dobVar.Y.getValue())).a()), dobVar.a);
        v11 v11Var = (v11) ((z01) this.L0.getValue());
        v11Var.y0 = gw0.w(gw0.u(new g56(new x3(zs0.a(new m11(objArr == true ? 1 : 0, new ph0(((dx3) v11Var.d.getValue()).a(), i2)), v9j.h(HttpStatus.SC_MULTIPLE_CHOICES, y65Var), new cj0(i2)), v11Var, 6), new p11(v11Var, null), i), ((q2b) ((lzf) v11Var.X.getValue())).a()), v11Var.a);
        AtomicBoolean atomicBoolean = v11Var.x0;
        ParticipantStatesManager participantStatesManagerF = v11Var.f();
        atomicBoolean.set(participantStatesManagerF != null ? participantStatesManagerF.isOwnHandRaised() : false);
        ParticipantStatesManager participantStatesManagerF2 = v11Var.f();
        if (participantStatesManagerF2 != null) {
            participantStatesManagerF2.addHandListener((ParticipantStatesManager.Listener) v11Var.Y.getValue());
        }
        MediaMuteManager mediaMuteManagerE = v11Var.e();
        if (mediaMuteManagerE != null) {
            mediaMuteManagerE.addListener((q11) v11Var.A0.getValue());
        }
        ConversationFeatureManager conversationFeatureManagerG = v11Var.g();
        if (conversationFeatureManagerG != null) {
            conversationFeatureManagerG.addFeatureListener(u81.b, (r11) v11Var.B0.getValue());
        }
        Conversation conversationR = r();
        if (conversationR != null) {
            ((w21) ((v21) this.s0.getValue())).a((conversationR.isCaller() || !z) ? CallsAudioManager.State.DIALING : CallsAudioManager.State.RINGING);
            wqi.c("CallEngineTag", this + " conversation is ready " + conversationR.getConversationId(), new Object[0]);
        }
    }

    public final void j(ek1 ek1Var) {
        w6f w6fVarA;
        Object value;
        String str;
        String str2;
        Long lValueOf;
        wqi.c("CallEngineTag", this + " doBeforeCreateConversation push=" + ek1Var, new Object[0]);
        ix1 ix1Var = (ix1) this.y0.getValue();
        x7b x7bVar = (x7b) ix1Var.d.getValue();
        x7bVar.getClass();
        try {
            wqi.c("x7b", "recreateIncomingChannelsIfNeeded: created = " + ((yka) x7bVar.e.getValue()).l(), new Object[0]);
        } catch (SecurityException e) {
            wqi.p("x7b", "recreateIncomingChannelsIfNeeded", e);
        } catch (Throwable th) {
            wqi.e("x7b", "recreateIncomingChannelsIfNeeded", th);
        }
        x7b x7bVar2 = (x7b) ix1Var.d.getValue();
        x7bVar2.getClass();
        try {
            wqi.c("x7b", "recreateActiveCallChannelIfNeeded: created = " + ((yka) x7bVar2.e.getValue()).k(), new Object[0]);
        } catch (SecurityException e2) {
            wqi.p("x7b", "recreateActiveCallChannelIfNeeded", e2);
        } catch (Throwable th2) {
            wqi.e("x7b", "recreateActiveCallChannelIfNeeded", th2);
        }
        c51 c51Var = (c51) m();
        c51Var.getClass();
        wqi.c("CallChatRepositoryTag", "prepare call chat state push=" + ek1Var, new Object[0]);
        if (ek1Var != null) {
            long j = ek1Var.b;
            tcf tcfVar = c51Var.i;
            do {
                value = tcfVar.getValue();
                String str3 = ek1Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                str = str3;
                str2 = ek1Var.e;
                long j2 = ek1Var.a;
                lValueOf = Long.valueOf(j2);
                if (j2 == 0) {
                    lValueOf = null;
                }
            } while (!tcfVar.c(value, new n41(Long.valueOf(j), str, str2, Long.valueOf(lValueOf != null ? lValueOf.longValue() : j), 96)));
        }
        zo1 zo1Var = (zo1) this.D0.getValue();
        Application application = (Application) this.d.getValue();
        zo1Var.getClass();
        zo1.c().post(new ud(application, 19, new Intent(application, (Class<?>) CallServiceImpl.class).putExtra("ACTION", 0)));
        w21 w21Var = (w21) ((v21) this.s0.getValue());
        CallsAudioManager callsAudioManager = (CallsAudioManager) w21Var.c.updateAndGet(new k11(1, w21Var));
        wqi.c("CallAudioController", "CallAudioController prepared: " + (callsAudioManager != null ? callsAudioManager.hashCode() : 0), new Object[0]);
        oqd oqdVarX = x();
        k18 k18Var = oqdVarX.b;
        k18 k18Var2 = oqdVarX.a;
        gu5 gu5Var = (gu5) ((rt5) k18Var.getValue());
        gu5Var.getClass();
        if (!gu5Var.j(PmsKey.f10callcustomringtone, false)) {
            el1 el1VarA = oqdVarX.a();
            bwf bwfVar = w6f.h;
            el1VarA.b(ebj.c());
            return;
        }
        boolean z = ((sxg) k18Var2.getValue()).g.getBoolean("app.calls.incoming.vibration", true);
        el1 el1VarA2 = oqdVarX.a();
        nqd nqdVarJ = ((sxg) k18Var2.getValue()).j();
        if (nqdVarJ.equals(lqd.a)) {
            bwf bwfVar2 = w6f.h;
            w6fVarA = w6f.a(ebj.c(), null, z, 63);
        } else if (nqdVarJ instanceof kqd) {
            try {
                if (new File(((kqd) nqdVarJ).a).exists()) {
                    bwf bwfVar3 = w6f.h;
                    w6fVarA = w6f.a(ebj.c(), new t6f(((kqd) nqdVarJ).a), z, 61);
                } else {
                    bwf bwfVar4 = w6f.h;
                    w6fVarA = w6f.a(ebj.c(), null, z, 63);
                }
            } catch (IOException e3) {
                wqi.p(oqd.class.getName(), "ringtone file not found, using default ringtone", e3);
                bwf bwfVar5 = w6f.h;
                w6fVarA = w6f.a(ebj.c(), null, z, 63);
            }
        } else {
            if (!(nqdVarJ instanceof mqd)) {
                throw new NoWhenBranchMatchedException();
            }
            Uri uri = Uri.parse(((mqd) nqdVarJ).a);
            bwf bwfVar6 = w6f.h;
            w6fVarA = w6f.a(ebj.c(), new u6f(uri), z, 61);
        }
        el1VarA2.b(w6fVarA);
    }

    public final mb4 k() {
        return (mb4) this.a1.getValue();
    }

    public final mb4 l() {
        return (mb4) this.b1.getValue();
    }

    public final s41 m() {
        return (s41) this.u0.getValue();
    }

    @Override // defpackage.wq
    public final void n() {
    }

    public final jx1 o() {
        return (jx1) this.N0.getValue();
    }

    public final yx1 p() {
        return (yx1) this.G0.getValue();
    }

    public final n64 q() {
        return (n64) this.X.getValue();
    }

    public final Conversation r() {
        return q().a();
    }

    public final x65 s() {
        return (x65) this.Z.getValue();
    }

    public final boolean t() {
        if (this.X0) {
            return false;
        }
        co5 co5Var = l().l;
        return ((co5Var instanceof wn5) || (co5Var instanceof vn5) || (co5Var instanceof xn5)) ? false : true;
    }

    public final boolean u() {
        Conversation conversationA = q().a();
        boolean z = conversationA != null && conversationA.isAnswered();
        Conversation conversationA2 = q().a();
        boolean z2 = conversationA2 != null && conversationA2.isCaller();
        co5 co5Var = l().l;
        return ((co5Var instanceof wn5) || (co5Var instanceof vn5) || (co5Var instanceof xn5) || (!z && !z2 && !l().i)) ? false : true;
    }

    public final boolean v() {
        Conversation conversationA = q().a();
        boolean z = (conversationA == null || conversationA.isAnswered()) ? false : true;
        Conversation conversationA2 = q().a();
        boolean z2 = (conversationA2 == null || conversationA2.isCaller()) ? false : true;
        co5 co5Var = l().l;
        return ((co5Var instanceof wn5) || (co5Var instanceof vn5) || (co5Var instanceof xn5) || !z || !z2 || l().i) ? false : true;
    }

    public final ax1 w() {
        return (ax1) this.o.getValue();
    }

    public final oqd x() {
        return (oqd) this.w0.getValue();
    }

    public final void y() {
        z(k().l instanceof bo5 ? m07.d : null);
    }

    public final void z(m07 m07Var) {
        wqi.c("CallEngineTag", "hangup " + m07Var, new Object[0]);
        this.V0.set(true);
        this.X0 = false;
        Conversation conversationR = r();
        if (conversationR != null) {
            if (m07Var == null) {
                m07Var = null;
            }
            conversationR.hangup(new l07(m07Var));
        }
    }
}
