package defpackage;

/* loaded from: classes2.dex */
public final class q05 {
    public static final /* synthetic */ yy7[] h = {new toc(q05.class, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0), ho7.d(vid.a, q05.class, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), new toc(q05.class, "draftSerializer", "getDraftSerializer()Lru/ok/tamtam/draft/DraftSerializer;", 0), new toc(q05.class, "messageController", "getMessageController()Lru/ok/tamtam/messages/MessageController;", 0), new toc(q05.class, "api", "getApi()Lru/ok/tamtam/api/Api;", 0), new toc(q05.class, "tamTamObservables", "getTamTamObservables()Lru/ok/tamtam/rx/TamTamObservables;", 0), new toc(q05.class, "ioNetworkScheduler", "getIoNetworkScheduler()Lio/reactivex/rxjava3/core/Scheduler;", 0)};
    public static final String i = q05.class.getName();
    public final kz4 a;
    public final kz4 b;
    public final kz4 c;
    public final kz4 d;
    public final kz4 e;
    public final kz4 f;
    public final kz4 g;

    public q05(kz4 kz4Var, kz4 kz4Var2, kz4 kz4Var3, kz4 kz4Var4, kz4 kz4Var5, kz4 kz4Var6, kz4 kz4Var7) {
        this.a = kz4Var;
        this.b = kz4Var2;
        this.c = kz4Var3;
        this.d = kz4Var4;
        this.e = kz4Var5;
        this.f = kz4Var6;
        this.g = kz4Var7;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Long r17, java.lang.Long r18, defpackage.kfe r19) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q05.a(java.lang.Long, java.lang.Long, kfe):void");
    }

    public final ve2 b() {
        yy7 yy7Var = h[0];
        return (ve2) this.a.get();
    }

    public final void c(pb2 pb2Var, kfe kfeVar) {
        Long lValueOf;
        wqi.c(i, "Save server draft", new Object[0]);
        yy7 yy7Var = h[2];
        q3b q3bVar = (q3b) this.c.get();
        long j = pb2Var.a;
        k18 k18Var = q3bVar.c;
        String str = kfeVar.b;
        long j2 = kfeVar.a;
        Long lValueOf2 = null;
        y08 y08Var = (str == null || str.length() == 0) ? null : new y08(str, po8.s(kfeVar.d));
        Long l = kfeVar.e;
        if (l != null) {
            si9 si9VarI = ((qi9) k18Var.getValue()).i(j, l.longValue());
            lValueOf = si9VarI != null ? Long.valueOf(si9VarI.a) : null;
        } else {
            lValueOf = null;
        }
        Long l2 = kfeVar.f;
        if (l2 != null) {
            si9 si9VarI2 = ((qi9) k18Var.getValue()).i(j, l2.longValue());
            if (si9VarI2 != null) {
                lValueOf2 = Long.valueOf(si9VarI2.a);
            }
        }
        b().u(pb2Var.a, kfeVar.g, new p3b(j2, y08Var, lValueOf, lValueOf2, Long.valueOf(kfeVar.g), true, 64));
    }
}
