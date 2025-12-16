package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class fh2 extends n2 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh2(xhb xhbVar, int i) {
        super(xhbVar);
        this.d = i;
    }

    @Override // defpackage.n2
    public boolean A() {
        switch (this.d) {
            case 1:
                return true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return true;
            default:
                return super.A();
        }
    }

    @Override // defpackage.n2
    public short P() {
        switch (this.d) {
            case 0:
                return xhb.C2.a;
            case 1:
            case 5:
            case 6:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case 16:
            case LangUtils.HASH_SEED /* 17 */:
            case 18:
            case 19:
            case 26:
            case 27:
            default:
                return super.P();
            case 2:
                qha qhaVar = xhb.c;
                return (short) 48;
            case 3:
                qha qhaVar2 = xhb.c;
                return (short) 57;
            case 4:
                qha qhaVar3 = xhb.c;
                return (short) 58;
            case 7:
                qha qhaVar4 = xhb.c;
                return (short) 59;
            case 8:
                qha qhaVar5 = xhb.c;
                return (short) 77;
            case 9:
                qha qhaVar6 = xhb.c;
                return (short) 86;
            case 10:
                qha qhaVar7 = xhb.c;
                return (short) 68;
            case 11:
                return xhb.D2.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                qha qhaVar8 = xhb.c;
                return (short) 75;
            case 13:
                qha qhaVar9 = xhb.c;
                return (short) 55;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                qha qhaVar10 = xhb.c;
                return (short) 53;
            case 20:
                qha qhaVar11 = xhb.c;
                return (short) 36;
            case 21:
                qha qhaVar12 = xhb.c;
                return (short) 39;
            case 22:
                qha qhaVar13 = xhb.c;
                return (short) 35;
            case 23:
                qha qhaVar14 = xhb.c;
                return (short) 34;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return xhb.B2.a;
            case 25:
                return xhb.A2.a;
            case 28:
                qha qhaVar15 = xhb.c;
                return (short) 87;
            case 29:
                qha qhaVar16 = xhb.c;
                return (short) 124;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(String str, long j, po3 po3Var, boolean z) {
        super(xhb.A0);
        this.d = 17;
        if (str != null && str.length() != 0) {
            x("pushToken", str);
        }
        if (j > 0) {
            t(j, "pushOptions");
        }
        if (po3Var != null) {
            us usVar = new us(4);
            String str2 = po3Var.a;
            if (str2 != null) {
                usVar.put("hash", str2);
            }
            Map map = po3Var.c;
            if (map != null) {
                map = map.isEmpty() ? null : map;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(to8.i(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        fy2 fy2Var = (fy2) entry.getValue();
                        ArrayList arrayList = fy2Var.a;
                        us usVar2 = new us(0);
                        usVar2.put("dontDisturbUntil", Long.valueOf(fy2Var.b));
                        Long l = fy2Var.c;
                        if (l != null) {
                            usVar2.put("favIndex", l);
                        }
                        if (arrayList == null || arrayList.isEmpty()) {
                            Boolean bool = Boolean.FALSE;
                            usVar2.put("sound", bool);
                            usVar2.put("vibr", bool);
                            usVar2.put("led", bool);
                        } else {
                            usVar2.put("sound", Boolean.valueOf(arrayList.contains(jt2.SOUND)));
                            usVar2.put("vibr", Boolean.valueOf(arrayList.contains(jt2.VIBRATION)));
                            usVar2.put("led", Boolean.valueOf(arrayList.contains(jt2.LED)));
                        }
                        linkedHashMap.put(key, usVar2);
                    }
                    usVar.put("chats", linkedHashMap);
                }
            }
            qxg qxgVar = po3Var.d;
            if (qxgVar != null) {
                us usVar3 = new us(0);
                Boolean bool2 = qxgVar.a;
                if (bool2 != null) {
                    usVar3.put("PUSH_NEW_CONTACTS", bool2);
                }
                Long l2 = qxgVar.b;
                if (l2 != null) {
                    usVar3.put("DONT_DISTURB_UNTIL", l2);
                }
                String str3 = qxgVar.c;
                if (str3 != null) {
                    usVar3.put("DIALOGS_PUSH_NOTIFICATION", str3);
                }
                String str4 = qxgVar.d;
                if (str4 != null) {
                    usVar3.put("CHATS_PUSH_NOTIFICATION", str4);
                }
                String str5 = qxgVar.e;
                if (str5 != null) {
                    usVar3.put("PUSH_SOUND", str5);
                }
                String str6 = qxgVar.f;
                if (str6 != null) {
                    usVar3.put("DIALOGS_PUSH_SOUND", str6);
                }
                String str7 = qxgVar.g;
                if (str7 != null) {
                    usVar3.put("CHATS_PUSH_SOUND", str7);
                }
                Boolean bool3 = qxgVar.h;
                if (bool3 != null) {
                    usVar3.put("HIDDEN", bool3);
                }
                Integer num = qxgVar.i;
                if (num != null) {
                    usVar3.put("LED", num);
                }
                Integer num2 = qxgVar.j;
                if (num2 != null) {
                    usVar3.put("DIALOGS_LED", num2);
                }
                Integer num3 = qxgVar.k;
                if (num3 != null) {
                    usVar3.put("CHATS_LED", num3);
                }
                Boolean bool4 = qxgVar.l;
                if (bool4 != null) {
                    usVar3.put("VIBR", bool4);
                }
                Boolean bool5 = qxgVar.m;
                if (bool5 != null) {
                    usVar3.put("DIALOGS_VIBR", bool5);
                }
                Boolean bool6 = qxgVar.n;
                if (bool6 != null) {
                    usVar3.put("CHATS_VIBR", bool6);
                }
                int i = qxgVar.p;
                if (i != 0) {
                    usVar3.put("INCOMING_CALL", xrf.i(i));
                }
                int i2 = qxgVar.o;
                if (i2 != 0) {
                    usVar3.put("CHATS_INVITE", xrf.i(i2));
                }
                pxg pxgVar = qxgVar.q;
                if (pxgVar != null) {
                    usVar3.put("INACTIVE_TTL", pxgVar.a);
                }
                int i3 = qxgVar.r;
                if (i3 != 0) {
                    usVar3.put("M_CALL_PUSH_NOTIFICATION", xrf.h(i3));
                }
                int i4 = qxgVar.s;
                if (i4 != 0) {
                    usVar3.put("SUGGEST_STICKERS", xrf.j(i4));
                }
                Boolean bool7 = qxgVar.t;
                if (bool7 != null) {
                    usVar3.put("AUDIO_TRANSCRIPTION_ENABLED", bool7);
                }
                Boolean bool8 = qxgVar.u;
                if (bool8 != null) {
                    usVar3.put("SAFE_MODE", bool8);
                }
                Boolean bool9 = qxgVar.v;
                if (bool9 != null) {
                    usVar3.put("SAFE_MODE_NO_PIN", bool9);
                }
                int i5 = qxgVar.w;
                if (i5 != 0) {
                    usVar3.put("SEARCH_BY_PHONE", xrf.i(i5));
                }
                Boolean bool10 = qxgVar.x;
                if (bool10 != null) {
                    usVar3.put("UNSAFE_FILES", bool10);
                }
                Boolean bool11 = qxgVar.y;
                if (bool11 != null) {
                    usVar3.put("CONTENT_LEVEL_ACCESS", bool11);
                }
                usVar.put("user", usVar3);
            }
            v("settings", usVar);
        }
        if (z) {
            i("reset", z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2() {
        super((xhb) null);
        this.d = 28;
        j(1, "count");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(long j, int i, String str, boolean z, String str2, Map map, String str3, String str4, n10 n10Var, Long l, boolean z2, long j2) {
        String str5;
        super((xhb) null);
        this.d = 13;
        t(j, ApiProtocol.PARAM_CHAT_ID);
        if (i != 0) {
            if (i == 1) {
                str5 = "UNKNOWN";
            } else if (i == 2) {
                str5 = "PUBLIC";
            } else {
                if (i != 3) {
                    throw null;
                }
                str5 = "PRIVATE";
            }
            x("access", str5);
        }
        if (!l8g.c(str)) {
            x("link", str);
        }
        if (z) {
            i("revokePrivateLink", true);
        }
        if (str2 != null) {
            x("description", str2);
        }
        if (map != null && map.size() > 0) {
            v("options", map);
        }
        if (str3 != null) {
            x("theme", str3);
        }
        if (str4 != null) {
            x("photoToken", str4);
        }
        if (n10Var != null) {
            v("crop", n10Var.a());
        }
        if (l != null) {
            ((us) this.b).put("pinMessageId", l);
            if (z2) {
                i("notifyPin", true);
            }
        }
        if (j2 != 0) {
            t(j2, "changeOwnerId");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(long j, int i, List list, br2 br2Var, boolean z, int i2, int i3) {
        super((xhb) null);
        this.d = 8;
        t(j, ApiProtocol.PARAM_CHAT_ID);
        x("operation", wy1.b(i));
        o("userIds", list);
        x("type", br2Var.a);
        if (i == 1) {
            i("showHistory", z);
        }
        if (i2 != 0) {
            j(i2, "cleanMsgPeriod");
        }
        if (i3 != 0) {
            j(i3, "permissions");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(long j, String str, long j2, int i, String str2) {
        super((xhb) null);
        this.d = 7;
        t(j, ApiProtocol.PARAM_CHAT_ID);
        if (!l8g.c(str)) {
            x("type", str);
        }
        if (j2 != 0) {
            t(j2, "marker");
        }
        if (i > 0) {
            j(i, "count");
        }
        if (l8g.c(str2)) {
            return;
        }
        x("query", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(String str) {
        super((xhb) null);
        this.d = 3;
        if (l8g.c(str)) {
            return;
        }
        x("link", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(String str, int i, String str2) {
        super((xhb) null);
        this.d = 10;
        x("query", str);
        j(i, "count");
        if (l8g.c(str2)) {
            return;
        }
        x("marker", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(List list) {
        super((xhb) null);
        this.d = 2;
        o("chatIds", list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(rj3 rj3Var, byte b, long[] jArr, Long l, String str) {
        super(xhb.J2);
        this.d = 15;
        ((us) this.b).put("typeId", Byte.valueOf(rj3Var.a));
        ((us) this.b).put("reasonId", Byte.valueOf(b));
        q("ids", jArr);
        if (l != null) {
            ((us) this.b).put("parentId", l);
        }
        if (str == null || str.length() == 0) {
            return;
        }
        x("details", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(long j, long j2, long j3) {
        super(xhb.M1);
        this.d = 27;
        t(j, "fileId");
        t(j2, ApiProtocol.PARAM_CHAT_ID);
        t(j3, "messageId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(long[] jArr) {
        super(xhb.W0);
        this.d = 19;
        q("contactIds", jArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(long j, Long l, Set set, Integer num, Integer num2) {
        super(xhb.c1);
        this.d = 6;
        t(j, ApiProtocol.PARAM_CHAT_ID);
        ((us) this.b).put("messageId", l);
        if (set != null && !set.isEmpty()) {
            s00 s00Var = s00.UNKNOWN;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                switch (((s00) it.next()).ordinal()) {
                    case 2:
                        arrayList.add("PHOTO");
                        break;
                    case 3:
                        arrayList.add("VIDEO");
                        break;
                    case 4:
                        arrayList.add("AUDIO");
                        break;
                    case 6:
                        arrayList.add("SHARE");
                        break;
                    case 7:
                        arrayList.add("APP");
                        break;
                    case 8:
                        arrayList.add("CALL");
                        break;
                    case 9:
                        arrayList.add("FILE");
                        break;
                    case 10:
                        arrayList.add("CONTACT");
                        break;
                    case 11:
                        arrayList.add("PRESENT");
                        break;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        arrayList.add("INLINE_KEYBOARD");
                        break;
                    case 13:
                        arrayList.add("LOCATION");
                        break;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        arrayList.add("REPLY_KEYBOARD");
                        break;
                    case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        arrayList.add("VIDEO_MSG");
                        break;
                }
            }
            o("attachTypes", arrayList);
        }
        if (num != null) {
            ((us) this.b).put("forward", num);
        }
        if (num2 != null) {
            ((us) this.b).put("backward", num2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(long j, long j2, int i, long j3, int i2, long j4, boolean z, String str, rs4 rs4Var) {
        super(xhb.a1);
        this.d = 1;
        t(j, ApiProtocol.PARAM_CHAT_ID);
        t(j2, "from");
        j(i, "forward");
        t(j3, "forwardTime");
        j(i2, "backward");
        t(j4, "backwardTime");
        i("getChat", false);
        i("getMessages", z);
        if (str != null && str.length() != 0) {
            x("chatAccessToken", str);
        }
        x("itemType", rs4Var.name());
    }
}
