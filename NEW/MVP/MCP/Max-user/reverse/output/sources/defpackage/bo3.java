package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class bo3 extends sm implements j1g, tsb {
    public final qxg X;
    public final boolean Y;
    public final long[] Z;
    public final long d;
    public final boolean o;

    public bo3(long j, long j2, boolean z, qxg qxgVar, boolean z2, long[] jArr) {
        super(j);
        this.d = j2;
        this.o = z;
        this.X = qxgVar;
        this.Y = z2;
        this.Z = jArr;
    }

    public static bo3 t(byte[] bArr) throws ProtoException {
        qxg qxgVar;
        try {
            Tasks.Config config = (Tasks.Config) fl9.mergeFrom(new Tasks.Config(), bArr);
            long j = config.requestId;
            long j2 = config.chatId;
            boolean z = config.isPushToken;
            Map<String, String> map = config.userSettings;
            if (map == null || map.isEmpty()) {
                qxgVar = null;
            } else {
                oxg oxgVar = new oxg();
                if (map.containsKey("pushNewContacts")) {
                    oxgVar.a = Boolean.valueOf(Boolean.parseBoolean(map.get("pushNewContacts")));
                }
                if (map.containsKey("dontDustirbUntil")) {
                    oxgVar.b = Long.valueOf(Long.parseLong(map.get("dontDustirbUntil")));
                }
                if (map.containsKey("dialogsPushNotification")) {
                    oxgVar.c = map.get("dialogsPushNotification");
                }
                if (map.containsKey("chatsPushNotification")) {
                    oxgVar.d = map.get("chatsPushNotification");
                }
                if (map.containsKey("pushSound")) {
                    oxgVar.e = map.get("pushSound");
                }
                if (map.containsKey("dialogsPushSound")) {
                    oxgVar.f = map.get("dialogsPushSound");
                }
                if (map.containsKey("chatsPushSound")) {
                    oxgVar.g = map.get("chatsPushSound");
                }
                if (map.containsKey("hiddenOnline")) {
                    oxgVar.h = Boolean.valueOf(map.get("hiddenOnline"));
                }
                if (map.containsKey("led")) {
                    oxgVar.i = Integer.valueOf(map.get("led"));
                }
                if (map.containsKey("dialogsLed")) {
                    oxgVar.j = Integer.valueOf(map.get("dialogsLed"));
                }
                if (map.containsKey("chatsLed")) {
                    oxgVar.k = Integer.valueOf(map.get("chatsLed"));
                }
                if (map.containsKey("vibration")) {
                    oxgVar.l = Boolean.valueOf(Boolean.parseBoolean(map.get("vibration")));
                }
                if (map.containsKey("dialogsVibration")) {
                    oxgVar.m = Boolean.valueOf(Boolean.parseBoolean(map.get("dialogsVibration")));
                }
                if (map.containsKey("chatsVibration")) {
                    oxgVar.n = Boolean.valueOf(Boolean.parseBoolean(map.get("chatsVibration")));
                }
                if (map.containsKey("chatsInvite")) {
                    oxgVar.o = xrf.b(map.get("chatsInvite"));
                }
                if (map.containsKey("incomingCall")) {
                    oxgVar.p = xrf.b(map.get("incomingCall"));
                }
                if (map.containsKey("inactiveTTL")) {
                    String str = map.get("inactiveTTL");
                    pxg pxgVar = pxg.TTL_6M;
                    if (str != null) {
                        switch (str) {
                            case "1M":
                                pxgVar = pxg.TTL_1M;
                                break;
                            case "3M":
                                pxgVar = pxg.TTL_3M;
                                break;
                        }
                    }
                    oxgVar.q = pxgVar;
                }
                if (map.containsKey("groupChatCallNotificationStatus")) {
                    oxgVar.r = xrf.a(map.get("groupChatCallNotificationStatus"));
                }
                if (map.containsKey("suggestStickersStatus")) {
                    oxgVar.s = xrf.c(map.get("suggestStickersStatus"));
                }
                if (map.containsKey("audioTranscriptionEnabled")) {
                    oxgVar.t = Boolean.valueOf(Boolean.parseBoolean(map.get("audioTranscriptionEnabled")));
                }
                if (map.containsKey("unsafeFiles")) {
                    oxgVar.x = Boolean.valueOf(Boolean.parseBoolean(map.get("unsafeFiles")));
                }
                qxgVar = new qxg(oxgVar);
            }
            return new bo3(j, j2, z, qxgVar, config.reset, config.syncChatIds);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[RETURN] */
    @Override // defpackage.tsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            r8 = this;
            tm r0 = r8.c
            a3g r0 = r0.e()
            long r1 = r8.a
            usb r3 = defpackage.usb.X
            java.util.List r0 = r0.h(r1, r3)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "bo3"
            r3 = 3
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            r2g r1 = (defpackage.r2g) r1
            tsb r4 = r1.f
            bo3 r4 = (defpackage.bo3) r4
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L12
            c3g r1 = r1.b
            c3g r4 = defpackage.c3g.d
            if (r1 == r4) goto L12
            java.lang.String r0 = "onPreExecute: removed existent config task"
            defpackage.wqi.d(r2, r0)
            return r3
        L37:
            boolean r0 = r8.Y
            r1 = 1
            if (r0 == 0) goto L3d
            goto L9b
        L3d:
            boolean r0 = r8.o
            if (r0 == 0) goto L51
            java.lang.String r0 = r8.s()
            boolean r0 = defpackage.l8g.c(r0)
            java.lang.String r4 = "onPreExecute: tokenEmpty="
            defpackage.ho7.q(r4, r2, r0)
            if (r0 == 0) goto L9b
            goto L9c
        L51:
            qxg r0 = r8.X
            if (r0 == 0) goto L56
            goto L9b
        L56:
            long[] r0 = r8.Z
            if (r0 == 0) goto L5e
            int r0 = r0.length
            if (r0 <= 0) goto L5e
            goto L9b
        L5e:
            tm r0 = r8.c
            ve2 r0 = r0.c()
            long r4 = r8.d
            pb2 r0 = r0.M(r4)
            if (r0 == 0) goto L9c
            boolean r2 = r0.F()
            if (r2 != 0) goto L73
            goto L9c
        L73:
            rf2 r0 = r0.b
            pf2 r2 = r0.b
            int r2 = r2.ordinal()
            r3 = 2
            if (r2 == 0) goto L94
            if (r2 == r1) goto L8b
            if (r2 != r3) goto L83
            goto L8b
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "invalid chat type"
            r0.<init>(r1)
            throw r0
        L8b:
            long r4 = r0.a
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L9b
            goto L9a
        L94:
            of2 r0 = r0.c
            of2 r2 = defpackage.of2.Y
            if (r0 != r2) goto L9b
        L9a:
            return r3
        L9b:
            return r1
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo3.c():int");
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        if (l0gVar instanceof do3) {
            do3 do3Var = (do3) l0gVar;
            l5c l5cVar = ((z7c) this.c.d.getValue()).b;
            String str = do3Var.c;
            qxg qxgVar = do3Var.d;
            l5cVar.i("hash", str);
            this.c.b().c(new svf(true));
            if (qxgVar != null) {
                ((z7c) this.c.d.getValue()).c.t(qxgVar);
                if (Boolean.FALSE.equals(qxgVar.u)) {
                    pe8 pe8Var = (pe8) ((pb3) this.c.f.getValue());
                    pe8Var.i("app.pin_" + pe8Var.s(), null);
                }
                this.c.b().c(new ho3());
            }
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        this.c.b().c(new svf(false));
        String str = pzfVar.b;
        if ("favorite.chats.limit".equals(str)) {
            this.c.c().f0(this.d, false);
        }
        if (l8g.d(str) && (str.equals("wrong.device.token") || str.equals("WRONG_DEVICE_TOKEN"))) {
            ((w4e) ((pb3) this.c.f.getValue())).B("");
            ((vxf) ((lv4) this.c.c.getValue()).h.getValue()).e();
        }
        if (pzfVar instanceof hzf) {
            return;
        }
        f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bo3.class == obj.getClass()) {
            bo3 bo3Var = (bo3) obj;
            qxg qxgVar = bo3Var.X;
            if (this.d != bo3Var.d || this.o != bo3Var.o || this.Y != bo3Var.Y) {
                return false;
            }
            qxg qxgVar2 = this.X;
            if (qxgVar2 != null) {
                return qxgVar2.equals(qxgVar);
            }
            if (qxgVar == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tsb
    public final void f() {
        this.c.e().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.Config config = new Tasks.Config();
        config.requestId = this.a;
        config.chatId = this.d;
        config.isPushToken = this.o;
        config.reset = this.Y;
        qxg qxgVar = this.X;
        if (qxgVar == null) {
            config.userSettings = new us(0);
        } else {
            us usVar = new us(0);
            Boolean bool = qxgVar.a;
            if (bool != null) {
                usVar.put("pushNewContacts", String.valueOf(bool));
            }
            Long l = qxgVar.b;
            if (l != null) {
                usVar.put("dontDustirbUntil", String.valueOf(l));
            }
            String str = qxgVar.c;
            if (str != null) {
                usVar.put("dialogsPushNotification", str);
            }
            String str2 = qxgVar.d;
            if (str2 != null) {
                usVar.put("chatsPushNotification", str2);
            }
            String str3 = qxgVar.e;
            if (str3 != null) {
                usVar.put("pushSound", str3);
            }
            String str4 = qxgVar.f;
            if (str4 != null) {
                usVar.put("dialogsPushSound", str4);
            }
            String str5 = qxgVar.g;
            if (str5 != null) {
                usVar.put("chatsPushSound", str5);
            }
            Boolean bool2 = qxgVar.h;
            if (bool2 != null) {
                usVar.put("hiddenOnline", String.valueOf(bool2));
            }
            Integer num = qxgVar.i;
            if (num != null) {
                usVar.put("led", String.valueOf(num));
            }
            Integer num2 = qxgVar.j;
            if (num2 != null) {
                usVar.put("dialogsLed", String.valueOf(num2));
            }
            Integer num3 = qxgVar.k;
            if (num3 != null) {
                usVar.put("chatsLed", String.valueOf(num3));
            }
            Boolean bool3 = qxgVar.l;
            if (bool3 != null) {
                usVar.put("vibration", String.valueOf(bool3));
            }
            Boolean bool4 = qxgVar.m;
            if (bool4 != null) {
                usVar.put("dialogsVibration", String.valueOf(bool4));
            }
            Boolean bool5 = qxgVar.n;
            if (bool5 != null) {
                usVar.put("chatsVibration", String.valueOf(bool5));
            }
            int i = qxgVar.o;
            if (i != 0) {
                usVar.put("chatsInvite", xrf.i(i));
            }
            int i2 = qxgVar.p;
            if (i2 != 0) {
                usVar.put("incomingCall", xrf.i(i2));
            }
            pxg pxgVar = qxgVar.q;
            if (pxgVar != null) {
                usVar.put("inactiveTTL", pxgVar.a);
            }
            int i3 = qxgVar.r;
            if (i3 != 0) {
                usVar.put("groupChatCallNotificationStatus", xrf.h(i3));
            }
            int i4 = qxgVar.s;
            if (i4 != 0) {
                usVar.put("suggestStickersStatus", xrf.j(i4));
            }
            Boolean bool6 = qxgVar.t;
            if (bool6 != null) {
                usVar.put("audioTranscriptionEnabled", String.valueOf(bool6));
            }
            Boolean bool7 = qxgVar.u;
            if (bool7 != null) {
                usVar.put("safeMode", String.valueOf(bool7));
            }
            config.userSettings = usVar;
        }
        config.syncChatIds = this.Z;
        return fl9.toByteArray(config);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.X;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    @Override // defpackage.sm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n2 i() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo3.i():n2");
    }

    public final String s() {
        if (!this.o || !((vw6) ((lv4) this.c.c.getValue()).f).a()) {
            return null;
        }
        String strE = ((vxf) ((lv4) this.c.c.getValue()).h.getValue()).e();
        if (l8g.c(strE)) {
            return null;
        }
        return strE;
    }
}
