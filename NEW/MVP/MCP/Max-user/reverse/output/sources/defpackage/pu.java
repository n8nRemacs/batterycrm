package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class pu extends vi0 {
    public final long[] o;

    public pu(int i, long j, long[] jArr) {
        super(j, i);
        this.o = jArr;
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.AssetsRemove assetsRemove = new Tasks.AssetsRemove();
        assetsRemove.assetType = a.p(this.d);
        assetsRemove.ids = this.o;
        assetsRemove.requestId = this.a;
        return fl9.toByteArray(assetsRemove);
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.S0;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 6);
        int i = this.d;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long[] jArr = this.o;
        if (jArr == null || jArr.length == 0) {
            throw new IllegalArgumentException("ids must not be null or empty");
        }
        wuaVar.x("type", az1.d(i));
        wuaVar.q("ids", jArr);
        return wuaVar;
    }

    @Override // defpackage.vi0
    public final void s(l0g l0gVar) {
        qu quVar = (qu) l0gVar;
        if (!quVar.c) {
            e(new pzf("asset.task.failed", "failed to remove asset", null));
            return;
        }
        t(quVar.d);
        tm tmVar = this.c;
        (tmVar != null ? tmVar : null).b().c(new ru(this.a));
    }
}
