package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class eu2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ eu2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Long] */
    @Override // defpackage.cm6
    public final Object invoke() {
        qmb qmbVar;
        Long l;
        x26 m11Var;
        int i = this.a;
        qqg qqgVar = qqg.a;
        int i2 = 6;
        int i3 = 2;
        int i4 = 3;
        int i5 = 8;
        int i6 = 5;
        int i7 = 1;
        ChatScreen chatScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatScreen.l1;
                return chatScreen.S0();
            case 1:
                yy7[] yy7VarArr2 = ChatScreen.l1;
                return a93.s0.x(chatScreen.getContext()).k();
            case 2:
                yy7[] yy7VarArr3 = ChatScreen.l1;
                hbd hbdVar = chatScreen.g1().a1;
                k18 k18Var = x4e.f;
                k18 k18Var2 = tv2.a;
                bwf bwfVarD = uv2.a.getAccessor().d(109);
                k18 k18Var3 = x4e.h;
                k18 k18Var4 = x4e.v;
                k18 k18Var5 = x4e.x;
                k18 k18Var6 = x4e.o;
                k18 k18Var7 = x4e.j;
                k18 k18Var8 = x4e.e;
                k18 k18Var9 = x4e.q;
                k18 k18Var10 = x4e.s;
                k18 k18Var11 = x4e.l;
                k18 k18Var12 = x4e.g;
                eu2 eu2Var = chatScreen.G0;
                return new mqf(hbdVar, k18Var6, k18Var5, eu2Var, new h79(eu2Var), k18Var, bwfVarD, k18Var3, k18Var4, k18Var7, k18Var8, k18Var9, k18Var10, k18Var11, k18Var12);
            case 3:
                yy7[] yy7VarArr4 = ChatScreen.l1;
                MessageWriteWidget messageWriteWidgetW0 = chatScreen.W0();
                if (messageWriteWidgetW0 == null || messageWriteWidgetW0.getViewLifecycleOwner().p().d.compareTo(l38.d) < 0) {
                    return null;
                }
                return messageWriteWidgetW0;
            case 4:
                yy7[] yy7VarArr5 = ChatScreen.l1;
                no9.B(chatScreen.V0(), false, 1);
                chatScreen.K0();
                return qqgVar;
            case 5:
                yy7[] yy7VarArr6 = ChatScreen.l1;
                return chatScreen.getContext();
            case 6:
                yy7[] yy7VarArr7 = ChatScreen.l1;
                pb2 pb2Var = (pb2) chatScreen.g1().a1.a.getValue();
                if (pb2Var != null) {
                    return fbj.a(pb2Var);
                }
                return null;
            case 7:
                yy7[] yy7VarArr8 = ChatScreen.l1;
                hs hsVar = chatScreen.u0;
                yy7[] yy7VarArr9 = ChatScreen.l1;
                yy7 yy7Var = yy7VarArr9[1];
                uf2 uf2Var = (uf2) hsVar.a(chatScreen);
                hs hsVar2 = chatScreen.t0;
                yy7 yy7Var2 = yy7VarArr9[0];
                long jLongValue = ((Number) hsVar2.a(chatScreen)).longValue();
                z5e z5eVar = new z5e(x4e.m, x4e.j);
                cs2 cs2Var = new cs2(new bc2(new d53(chatScreen.g1().a1, 12), i4), (hwa) y4e.a.getAccessor().c(79));
                k18 k18Var13 = tv2.a;
                uv2 uv2Var = uv2.a;
                return new c6e(z5eVar, jLongValue, uf2Var, new zr2(cs2Var, uv2Var.getAccessor().d(143), uv2Var.getAccessor().d(97), uv2Var.getAccessor().d(46), uv2Var.getDispatchers(), (a84) uv2Var.getAccessor().c(84)));
            case 8:
                yy7[] yy7VarArr10 = ChatScreen.l1;
                return chatScreen.getRouter();
            case 9:
                yy7[] yy7VarArr11 = ChatScreen.l1;
                return chatScreen.V0().x();
            case 10:
                yy7[] yy7VarArr12 = ChatScreen.l1;
                hs hsVar3 = chatScreen.u0;
                yy7[] yy7VarArr13 = ChatScreen.l1;
                yy7 yy7Var3 = yy7VarArr13[1];
                int iOrdinal = ((uf2) hsVar3.a(chatScreen)).ordinal();
                if (iOrdinal == 0) {
                    i3 = 1;
                } else if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                hbd hbdVar2 = chatScreen.g1().a1;
                hs hsVar4 = chatScreen.t0;
                yy7 yy7Var4 = yy7VarArr13[0];
                return new ozb(hbdVar2, Long.valueOf(((Number) hsVar4.a(chatScreen)).longValue()), i3);
            case 11:
                yy7[] yy7VarArr14 = ChatScreen.l1;
                if (chatScreen.getView() != null && !chatScreen.e1().b()) {
                    zx2 zx2VarG1 = chatScreen.g1();
                    pb2 pb2Var2 = (pb2) zx2VarG1.a1.a.getValue();
                    if (pb2Var2 != null) {
                        xfh.o(zx2VarG1, ((q2b) zx2VarG1.y()).c().getImmediate(), new xw2(pb2Var2, zx2VarG1, null), 2);
                    }
                }
                return qqgVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr15 = ChatScreen.l1;
                return new fed(new eu2(chatScreen, i2));
            case 13:
                yy7[] yy7VarArr16 = ChatScreen.l1;
                return new kj1(new bwf(new eu2(chatScreen, i5)), new s2i(chatScreen, 0));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr17 = ChatScreen.l1;
                if (chatScreen.S0() != f1e.CHAT) {
                    bud budVar = (bud) ue3.Q(chatScreen.getRouter().e());
                    c54 c54Var = budVar != null ? budVar.a : null;
                    if (c54Var == null || c54Var.equals(chatScreen) || !(c54Var instanceof ada)) {
                        c54Var = null;
                    }
                    ada adaVar = c54Var instanceof ada ? (ada) c54Var : null;
                    return adaVar != null ? ((ChatsTabWidget) adaVar).F0() : qmb.g;
                }
                pb2 pb2Var3 = (pb2) chatScreen.g1().a1.a.getValue();
                if (pb2Var3 == null) {
                    return qmb.g;
                }
                if (pb2Var3.K()) {
                    ku3 ku3VarN = pb2Var3.n();
                    qmbVar = new qmb(null, 0, e7f.c, ku3VarN != null ? Long.valueOf(ku3VarN.p()) : null, null, null, 51);
                } else {
                    if (!pb2Var3.Q()) {
                        return new qmb(null, 0, e7f.d, Long.valueOf(pb2Var3.b.a), null, null, 51);
                    }
                    ku3 ku3VarN2 = pb2Var3.n();
                    qmbVar = new qmb(null, 0, e7f.b, ku3VarN2 != null ? Long.valueOf(ku3VarN2.p()) : null, null, null, 51);
                }
                return qmbVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr18 = ChatScreen.l1;
                hs hsVar5 = chatScreen.u0;
                yy7[] yy7VarArr19 = ChatScreen.l1;
                yy7 yy7Var5 = yy7VarArr19[1];
                uf2 uf2Var2 = (uf2) hsVar5.a(chatScreen);
                hs hsVar6 = chatScreen.t0;
                yy7 yy7Var6 = yy7VarArr19[0];
                long jLongValue2 = ((Number) hsVar6.a(chatScreen)).longValue();
                i5i i5iVar = new i5i(new eu2(chatScreen, i6));
                hs hsVar7 = chatScreen.w0;
                yy7 yy7Var7 = yy7VarArr19[3];
                return new zx2(jLongValue2, uf2Var2, (String) hsVar7.a(chatScreen), i5iVar);
            case 16:
                hs hsVar8 = chatScreen.z0;
                yy7[] yy7VarArr20 = ChatScreen.l1;
                hs hsVar9 = chatScreen.y0;
                yy7[] yy7VarArr21 = ChatScreen.l1;
                yy7 yy7Var8 = yy7VarArr21[5];
                long[] jArr = (long[]) hsVar9.a(chatScreen);
                Set setE = jArr != null ? ys.E(jArr) : null;
                yy7 yy7Var9 = yy7VarArr21[6];
                Long l2 = (Long) hsVar8.a(chatScreen);
                if (l2 != null && l2.longValue() == 0) {
                    l = null;
                } else {
                    yy7 yy7Var10 = yy7VarArr21[6];
                    l = (Long) hsVar8.a(chatScreen);
                }
                hs hsVar10 = chatScreen.A0;
                yy7 yy7Var11 = yy7VarArr21[7];
                boolean zBooleanValue = ((Boolean) hsVar10.a(chatScreen)).booleanValue();
                hbd hbdVar3 = chatScreen.g1().a1;
                k18 k18Var14 = tv2.a;
                uv2 uv2Var2 = uv2.a;
                bwf bwfVarD2 = uv2Var2.getAccessor().d(46);
                bwf bwfVarD3 = uv2Var2.getAccessor().d(8);
                bwf bwfVarD4 = uv2Var2.getAccessor().d(138);
                bwf bwfVarD5 = uv2Var2.getAccessor().d(123);
                k18 k18VarB = ipi.b(3, new fu2(i7));
                bwf bwfVarD6 = uv2Var2.getAccessor().d(577);
                bwf bwfVarD7 = uv2Var2.getAccessor().d(578);
                bwf bwfVarD8 = uv2Var2.getAccessor().d(HttpStatus.SC_GONE);
                bwf bwfVarD9 = uv2Var2.getAccessor().d(575);
                k18 k18VarB2 = ipi.b(3, new fu2(i3));
                bwf bwfVarD10 = uv2Var2.getAccessor().d(216);
                hs hsVar11 = chatScreen.x0;
                yy7 yy7Var12 = yy7VarArr21[4];
                Long l3 = (Long) hsVar11.a(chatScreen);
                if (l3 != null) {
                    long jLongValue3 = l3.longValue();
                    zx2 zx2VarG12 = chatScreen.g1();
                    sq9 sq9VarA = mwi.a(jLongValue3, zx2VarG12.c, zx2VarG12.y());
                    m11Var = new m11(5, new n46(new ph0((x26) sq9VarA.f.getValue(), 27), new er(sq9VarA, continuation, i6)));
                } else {
                    m11Var = fd5.a;
                }
                return new no9(setE, l, zBooleanValue, bwfVarD2, bwfVarD3, bwfVarD5, bwfVarD4, k18VarB, bwfVarD6, bwfVarD7, bwfVarD8, bwfVarD9, k18VarB2, bwfVarD10, hbdVar3, m11Var);
            default:
                yy7[] yy7VarArr22 = ChatScreen.l1;
                k18 k18Var15 = tv2.a;
                uv2 uv2Var3 = uv2.a;
                return new mu8(uv2Var3.getAccessor().d(138), uv2Var3.getAccessor().d(493), tv2.a, uv2Var3.getAccessor().d(8), uv2Var3.getAccessor().d(47), new eu2(chatScreen, 9));
        }
    }
}
