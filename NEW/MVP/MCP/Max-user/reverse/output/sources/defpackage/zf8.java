package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class zf8 extends n2 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf8(xhb xhbVar, int i) {
        super(xhbVar);
        this.d = i;
    }

    @Override // defpackage.n2
    public boolean A() {
        switch (this.d) {
            case 5:
                return true;
            default:
                return super.A();
        }
    }

    @Override // defpackage.n2
    public short P() {
        switch (this.d) {
            case 0:
                qha qhaVar = xhb.c;
                return (short) 5;
            case 1:
                qha qhaVar2 = xhb.c;
                return (short) 179;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 13:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case 21:
            case 22:
            case 28:
            default:
                return super.P();
            case 6:
                qha qhaVar3 = xhb.c;
                return (short) 181;
            case 8:
                qha qhaVar4 = xhb.c;
                return (short) 74;
            case 9:
                qha qhaVar5 = xhb.c;
                return (short) 178;
            case 10:
                qha qhaVar6 = xhb.c;
                return (short) 73;
            case 11:
                qha qhaVar7 = xhb.c;
                return (short) 72;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                qha qhaVar8 = xhb.c;
                return (short) 118;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                qha qhaVar9 = xhb.c;
                return (short) 70;
            case 16:
                qha qhaVar10 = xhb.c;
                return (short) 80;
            case LangUtils.HASH_SEED /* 17 */:
                qha qhaVar11 = xhb.c;
                return (short) 1;
            case 18:
                qha qhaVar12 = xhb.c;
                return (short) 16;
            case 19:
                qha qhaVar13 = xhb.c;
                return (short) 60;
            case 20:
                qha qhaVar14 = xhb.c;
                return (short) 43;
            case 23:
                qha qhaVar15 = xhb.c;
                return (short) 97;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                qha qhaVar16 = xhb.c;
                return (short) 96;
            case 25:
                qha qhaVar17 = xhb.c;
                return (short) 193;
            case 26:
                qha qhaVar18 = xhb.c;
                return (short) 81;
            case 27:
                qha qhaVar19 = xhb.c;
                return (short) 119;
            case 29:
                qha qhaVar20 = xhb.c;
                return (short) 79;
        }
    }

    @Override // defpackage.n2
    public int Q() {
        switch (this.d) {
            case LangUtils.HASH_SEED /* 17 */:
                return 0;
            default:
                return super.Q();
        }
    }

    @Override // defpackage.n2
    public boolean Z() {
        switch (this.d) {
            case 0:
                return false;
            default:
                return super.Z();
        }
    }

    @Override // defpackage.n2
    public boolean z() {
        switch (this.d) {
            case LangUtils.HASH_SEED /* 17 */:
                return true;
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(long j, int i) {
        super((xhb) null);
        this.d = i;
        switch (i) {
            case 20:
                super((xhb) null);
                if (j == 0) {
                    throw new IllegalArgumentException("photoId must not be 0");
                }
                t(j, "photoId");
                return;
            default:
                if (j != 0) {
                    t(j, ApiProtocol.PARAM_CHAT_ID);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(long j, String str, int i) {
        super((xhb) null);
        this.d = 19;
        x("query", str);
        j(i, "count");
        if (j != 0) {
            t(j, "marker");
        }
        x("type", "ALL");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(long j, List list) {
        super((xhb) null);
        this.d = 8;
        if (j != 0) {
            t(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        o("messageIds", list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(Boolean bool) {
        super((xhb) null);
        this.d = 16;
        j(1, "count");
        ((us) this.b).put("profile", bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(List list) {
        super((xhb) null);
        this.d = 0;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dm dmVar = (dm) it.next();
                dmVar.getClass();
                nn8 nn8Var = new nn8();
                nn8Var.put("time", Long.valueOf(dmVar.a));
                nn8Var.put("userId", Long.valueOf(dmVar.b));
                nn8Var.put("type", dmVar.d);
                nn8Var.put("event", dmVar.e);
                Map map = dmVar.f;
                if (map != null) {
                    nn8Var.put("params", map);
                }
                long j = dmVar.c;
                Long lValueOf = j <= 0 ? null : Long.valueOf(j);
                if (lValueOf != null) {
                    nn8Var.put("sessionId", Long.valueOf(lValueOf.longValue()));
                }
                arrayList.add(nn8Var.b());
            }
            o("events", arrayList);
            return;
        }
        throw new IllegalArgumentException("status can't be null or empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(boolean z, int i) {
        super(xhb.G2);
        this.d = 21;
        i("delete", z);
        if (i != 0) {
            short s = 1;
            if (i == 1) {
                s = 0;
            } else if (i != 2) {
                throw null;
            }
            ((us) this.b).put("type", Short.valueOf(s));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8() {
        super(xhb.H2);
        this.d = 22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(long j, long j2, String str, sz szVar, ArrayList arrayList, ss4 ss4Var) {
        super(xhb.q1);
        this.d = 4;
        t(j, ApiProtocol.PARAM_CHAT_ID);
        t(j2, "messageId");
        if (str != null) {
            x("text", str);
        }
        if (szVar != null) {
            o("attachments", szVar);
        }
        if (arrayList != null) {
            o("elements", arrayList);
        }
        if (ss4Var != null) {
            v("delayedAttributes", ss4Var.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(long j, long[] jArr) {
        super(xhb.x1);
        this.d = 5;
        t(j, ApiProtocol.PARAM_CHAT_ID);
        q("messageIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf8(long j, long j2, wjb wjbVar, Boolean bool, long j3) {
        super(xhb.o1);
        this.d = 13;
        if (j != 0) {
            t(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j2 != 0) {
            t(j2, "userId");
        }
        v("message", wjbVar.a());
        if (bool != null) {
            ((us) this.b).put("notify", bool);
        }
        if (j3 != 0) {
            t(j3, "lastKnownDraftTime");
        }
    }
}
