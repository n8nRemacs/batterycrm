package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class gs5 {
    public static final /* synthetic */ int h = 0;
    public final hwa a;
    public final d1g b;
    public final j0e c;
    public final j0e d;
    public final a3g e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final zl3 g = new zl3();

    public gs5(hwa hwaVar, d1g d1gVar, j0e j0eVar, j0e j0eVar2, tw0 tw0Var, a3g a3gVar) {
        this.a = hwaVar;
        this.b = d1gVar;
        this.c = j0eVar;
        this.d = j0eVar2;
        this.e = a3gVar;
        tw0Var.d(this);
    }

    public final o3f a(Callable callable) {
        o3f o3fVar = new o3f();
        this.f.put((Long) callable.call(), o3fVar);
        return o3fVar;
    }

    @vnf
    public void onEvent(eu euVar) {
        o3f o3fVar = (o3f) this.f.get(Long.valueOf(euVar.a));
        if (o3fVar != null) {
            o3fVar.a(euVar);
        }
    }

    @vnf
    public void onEvent(ru ruVar) {
        o3f o3fVar = (o3f) this.f.get(Long.valueOf(ruVar.a));
        if (o3fVar != null) {
            o3fVar.a(ruVar);
        }
    }

    @vnf
    public void onEvent(lu luVar) {
        o3f o3fVar = (o3f) this.f.get(Long.valueOf(luVar.a));
        if (o3fVar != null) {
            o3fVar.a(luVar);
        }
    }

    @vnf
    public void onEvent(ou ouVar) {
        o3f o3fVar = (o3f) this.f.get(Long.valueOf(ouVar.a));
        if (o3fVar != null) {
            o3fVar.a(ouVar);
        }
    }

    @vnf
    public void onEvent(rj0 rj0Var) {
        o3f o3fVar = (o3f) this.f.get(Long.valueOf(rj0Var.a));
        if (o3fVar != null) {
            o3fVar.onError(new TamErrorException(rj0Var.b));
        }
    }
}
