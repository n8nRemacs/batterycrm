package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class ju extends vi0 {
    public final long X;
    public final long[] o;

    public ju(long j, int i, long[] jArr, long j2) {
        super(j, i);
        this.o = jArr;
        this.X = j2;
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.AssetsListModify assetsListModify = new Tasks.AssetsListModify();
        assetsListModify.assetType = a.p(this.d);
        assetsListModify.requestId = this.a;
        assetsListModify.ids = this.o;
        assetsListModify.modifyTime = this.X;
        return fl9.toByteArray(assetsListModify);
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.R0;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 4);
        int i = this.d;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long[] jArr = this.o;
        if (jArr == null) {
            throw new IllegalArgumentException("ids must not be null");
        }
        wuaVar.x("type", az1.d(i));
        wuaVar.q("ids", jArr);
        long j = this.X;
        if (j >= 0) {
            wuaVar.t(j, "updateTime");
        }
        return wuaVar;
    }

    @Override // defpackage.vi0
    public final void s(l0g l0gVar) {
        ku kuVar = (ku) l0gVar;
        if (!kuVar.c) {
            e(new pzf("asset.task.failed", "failed to modify asset list", null));
            return;
        }
        t(kuVar.d);
        tm tmVar = this.c;
        (tmVar != null ? tmVar : null).b().c(new lu(this.a));
    }
}
