package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class cu extends vi0 {
    public final long o;

    public cu(int i, long j, long j2) {
        super(j, i);
        this.o = j2;
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.AssetsAdd assetsAdd = new Tasks.AssetsAdd();
        assetsAdd.assetType = a.p(this.d);
        assetsAdd.id = this.o;
        assetsAdd.requestId = this.a;
        return fl9.toByteArray(assetsAdd);
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.Q0;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 1);
        int i = this.d;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        }
        long j = this.o;
        if (j == 0) {
            throw new IllegalArgumentException("id must not be null or empty");
        }
        wuaVar.x("type", az1.d(i));
        wuaVar.t(j, "id");
        return wuaVar;
    }

    @Override // defpackage.vi0
    public final void s(l0g l0gVar) {
        du duVar = (du) l0gVar;
        if (!duVar.c) {
            e(new pzf("asset.task.failed", "failed to add asset", null));
            return;
        }
        t(duVar.d);
        tm tmVar = this.c;
        (tmVar != null ? tmVar : null).b().c(new eu(this.a));
    }
}
