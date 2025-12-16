package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class mu extends vi0 {
    public final long X;
    public final int Y;
    public final long o;

    public mu(long j, int i, long j2, long j3, int i2) {
        super(j, i);
        this.o = j2;
        this.X = j3;
        this.Y = i2;
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.AssetsMove assetsMove = new Tasks.AssetsMove();
        assetsMove.assetType = a.p(this.d);
        assetsMove.id = this.o;
        assetsMove.requestId = this.a;
        assetsMove.prevId = this.X;
        assetsMove.position = this.Y;
        return fl9.toByteArray(assetsMove);
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.T0;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 5);
        int i = this.d;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long j = this.o;
        if (j == 0) {
            throw new IllegalArgumentException("id must not be null or empty");
        }
        long j2 = this.X;
        int i2 = this.Y;
        if (j2 <= 0 && i2 < 0) {
            throw new IllegalArgumentException("prevId or position must be set");
        }
        wuaVar.x("type", az1.d(i));
        wuaVar.t(j, "id");
        if (j2 > 0) {
            wuaVar.t(j2, "prevId");
            return wuaVar;
        }
        wuaVar.j(i2, "position");
        return wuaVar;
    }

    @Override // defpackage.vi0
    public final void s(l0g l0gVar) {
        nu nuVar = (nu) l0gVar;
        if (!nuVar.c) {
            e(new pzf("asset.task.failed", "failed to move asset", null));
            return;
        }
        t(nuVar.d);
        tm tmVar = this.c;
        (tmVar != null ? tmVar : null).b().c(new ou(this.a));
    }
}
