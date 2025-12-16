package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class y1h extends n2 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1h(xhb xhbVar, int i) {
        super(xhbVar);
        this.d = i;
    }

    @Override // defpackage.n2
    public short P() {
        switch (this.d) {
            case 1:
                qha qhaVar = xhb.c;
                return (short) 83;
            case 2:
                qha qhaVar2 = xhb.c;
                return (short) 82;
            default:
                return super.P();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1h(int i) {
        super((xhb) null);
        this.d = 2;
        j(az1.v(i), "type");
        j(1, "count");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1h(String str, long j, long j2, long j3) {
        super((xhb) null);
        this.d = 1;
        t(j, "videoId");
        if (j2 != 0) {
            t(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 > 0) {
            t(j3, "messageId");
        }
        if (l8g.c(str)) {
            return;
        }
        x(ApiProtocol.KEY_TOKEN, str);
    }
}
