package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class wua extends n2 {
    public static final kc3 o = new kc3(26);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wua(xhb xhbVar, int i) {
        super(xhbVar);
        this.d = i;
    }

    @Override // defpackage.n2
    public short P() {
        switch (this.d) {
            case 1:
                qha qhaVar = xhb.c;
                return (short) 29;
            case 2:
                qha qhaVar2 = xhb.c;
                return (short) 28;
            case 3:
                qha qhaVar3 = xhb.c;
                return (short) 26;
            case 4:
                qha qhaVar4 = xhb.c;
                return (short) 261;
            case 5:
                qha qhaVar5 = xhb.c;
                return (short) 260;
            case 6:
                qha qhaVar6 = xhb.c;
                return (short) 259;
            case 7:
                qha qhaVar7 = xhb.c;
                return (short) 27;
            case 23:
                qha qhaVar8 = xhb.c;
                return (short) 76;
            case 25:
                qha qhaVar9 = xhb.c;
                return (short) 54;
            case 26:
                qha qhaVar10 = xhb.c;
                return (short) 61;
            case 27:
                qha qhaVar11 = xhb.c;
                return (short) 117;
            case 28:
                qha qhaVar12 = xhb.c;
                return (short) 63;
            case 29:
                qha qhaVar13 = xhb.c;
                return (short) 52;
            default:
                return super.P();
        }
    }

    @Override // defpackage.n2
    public sg8 R() {
        switch (this.d) {
            case 0:
                return o;
            default:
                return super.R();
        }
    }

    @Override // defpackage.n2
    public boolean Z() {
        switch (this.d) {
            case 0:
                return true;
            case 10:
                return false;
            case 11:
                return false;
            case 13:
                return false;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return false;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return false;
            case 16:
                return false;
            case 18:
                return false;
            case 19:
                return false;
            case 20:
                return false;
            default:
                return super.Z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua() {
        super(xhb.C0);
        this.d = 12;
        ((us) this.b).put("type", (short) 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua(String str, String str2) {
        super(xhb.J0);
        this.d = 20;
        x("trackId", str);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        x("email", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua(String str, List list, String str2, String str3, int i) {
        super(xhb.L0);
        this.d = 17;
        Boolean bool = Boolean.TRUE;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        bool = (i & 16) != 0 ? null : bool;
        x("trackId", str);
        if (str2 != null && str2.length() != 0) {
            x("password", str2);
        }
        if (str3 != null && str3.length() != 0) {
            x("hint", str3);
        }
        if (bool != null) {
            ((us) this.b).put("remove2fa", bool);
        }
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(((xjg) it.next()).a));
        }
        o("expectedCapabilities", arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua(String str) {
        super(xhb.M0);
        this.d = 8;
        if (str == null || str.length() == 0) {
            return;
        }
        x("trackId", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua(int i, int i2, long j, String str, String str2) {
        super((xhb) null);
        this.d = 3;
        if (i == 0 && l8g.c(str)) {
            throw new RuntimeException("Asset type or sectionId should be set");
        }
        if (i != 0) {
            x("type", az1.d(i));
        }
        if (!l8g.c(str)) {
            x("sectionId", str);
        }
        t(j, "from");
        j(i2, "count");
        if (str2 != null) {
            x("query", str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua(int i, long j) {
        super((xhb) null);
        this.d = 7;
        if (i != 0) {
            x("type", az1.d(i));
        }
        t(j, "sync");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua(int i, long[] jArr) {
        super((xhb) null);
        this.d = 2;
        if (i != 0) {
            if (jArr != null && jArr.length != 0) {
                x("type", az1.d(i));
                q("ids", jArr);
                return;
            }
            throw new IllegalArgumentException("ids must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wua(String str, long j) {
        super(xhb.U1);
        this.d = 0;
        x(SdkMetricStatEvent.VALUE_KEY, str);
        t(j, "userId");
    }
}
