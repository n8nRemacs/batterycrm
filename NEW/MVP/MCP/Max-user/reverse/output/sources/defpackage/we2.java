package defpackage;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class we2 extends sm implements j1g, tsb {
    public final long X;
    public final long Y;
    public final String Z;
    public final long d;
    public final int o;

    public we2(long j, long j2, int i, long j3, String str, long j4) {
        super(j);
        this.d = j2;
        this.o = i;
        this.X = j3;
        this.Y = j4;
        this.Z = str == null ? "" : str;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        qb2 qb2Var = ((xe2) l0gVar).c;
        if (qb2Var == null) {
            return;
        }
        l().m0(Collections.singletonList(qb2Var));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ald aldVar = (ald) tmVar.N.getValue();
        nxg nxgVar = (nxg) aldVar.e.getValue();
        long j = this.d;
        svi.e(nxgVar, null, null, new zkd(aldVar, j, null), 3);
        ConcurrentHashMap concurrentHashMap = ((abd) aldVar.b.getValue()).i;
        bwd.b((py4) concurrentHashMap.get(0L));
        concurrentHashMap.remove(0L);
        k().c(new n73(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatCreate chatCreate = new Tasks.ChatCreate();
        chatCreate.requestId = this.a;
        int i = this.o;
        if (i != 0) {
            chatCreate.chatType = wy1.c(i);
        }
        chatCreate.chatId = this.d;
        chatCreate.groupId = this.X;
        chatCreate.startPayload = this.Z;
        chatCreate.cid = this.Y;
        return fl9.toByteArray(chatCreate);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.A0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 28);
        int i = this.o;
        if (i != 0 && i != 1) {
            wuaVar.x("chatType", wy1.c(i));
        }
        long j = this.X;
        if (j != 0) {
            wuaVar.t(j, "groupId");
        }
        String str = this.Z;
        if (!l8g.c(str)) {
            wuaVar.x("startPayload", str);
        }
        long j2 = this.Y;
        if (j2 != 0) {
            wuaVar.t(j2, "cid");
        }
        return wuaVar;
    }
}
