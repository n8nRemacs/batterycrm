package defpackage;

import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;

/* loaded from: classes2.dex */
public abstract class h0 implements hm {
    private volatile gm cachedParams;

    public final synchronized gm a() {
        gm gmVar = this.cachedParams;
        if (gmVar != null) {
            return gmVar;
        }
        gm gmVar2 = new gm();
        populateParams(gmVar2);
        this.cachedParams = gmVar2;
        return gmVar2;
    }

    public boolean canRepeat() {
        return a().b;
    }

    public final synchronized void invalidateParams() {
        this.cachedParams = null;
    }

    public abstract void populateParams(gm gmVar);

    @Override // defpackage.hm
    public boolean shouldPost() {
        return a().c;
    }

    @Override // defpackage.hm
    public final boolean willWriteParams() {
        return a().d;
    }

    @Override // defpackage.hm
    public final boolean willWriteSupplyParams() {
        return a().e;
    }

    @Override // defpackage.hm
    public final void writeParams(gy7 gy7Var) throws JsonSerializeException, IOException {
        a().c(gy7Var);
    }

    @Override // defpackage.hm
    public final void writeSupplyParams(gy7 gy7Var) throws JsonSerializeException, IOException {
        a().d(gy7Var);
    }
}
