package defpackage;

import android.os.Bundle;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class vef implements tm6, gu3, snc, m7c, k4g, kw0, om6 {
    public final /* synthetic */ int a;

    public /* synthetic */ vef(int i) {
        this.a = i;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                wqi.e("wef", "createSticker: failed", (Throwable) obj);
                break;
            case 4:
                wqi.e("igf", "clear: repository clear failed", (Throwable) obj);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                wqi.c("d1g", "retryWhenCommonError: connected", new Object[0]);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                wqi.c("d1g", "retryWhenCommonErrorObs: connected", new Object[0]);
                break;
            case 18:
                wqi.c("g1g", "retryWhenTamHttpError: connected", new Object[0]);
                break;
            case 21:
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    @Override // defpackage.tm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vef.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.snc
    public void b(float f) {
        String str = quf.h;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "convert: progress " + f, null);
        }
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        switch (this.a) {
            case 26:
                fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new h8g(bundle.getBoolean(Integer.toString(2, 36), false)) : new h8g();
            default:
                int i = bundle.getInt(Integer.toString(0, 36), 0);
                long j = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j2 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
                u8 u8Var = bundle2 != null ? (u8) u8.Z.e(bundle2) : u8.X;
                l9g l9gVar = new l9g();
                l9gVar.g(null, null, i, j, j2, u8Var, z);
                return l9gVar;
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return d1g.a(((Integer) obj).intValue());
    }

    public /* synthetic */ vef(igf igfVar) {
        this.a = 2;
    }
}
