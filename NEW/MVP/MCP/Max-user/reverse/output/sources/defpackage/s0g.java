package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class s0g implements j1g {
    public final /* synthetic */ i2f a;

    public s0g(i2f i2fVar) {
        this.a = i2fVar;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        i2f i2fVar = this.a;
        if (i2fVar.e()) {
            return;
        }
        i2fVar.a(l0gVar);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        i2f i2fVar = this.a;
        if (i2fVar.e()) {
            return;
        }
        i2fVar.onError(new TamErrorException(pzfVar));
    }
}
