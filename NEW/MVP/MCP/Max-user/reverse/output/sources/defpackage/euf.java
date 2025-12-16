package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class euf implements Callable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gsc c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float o;

    public /* synthetic */ euf(Object obj, String str, gsc gscVar, float f, float f2, boolean z, int i) {
        this.a = i;
        this.Y = obj;
        this.b = str;
        this.c = gscVar;
        this.d = f;
        this.o = f2;
        this.X = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                fuf fufVar = (fuf) this.Y;
                crd crdVar = fufVar.c;
                lrd lrdVar = fufVar.a;
                vk6 vk6VarA = crdVar.a();
                String str = this.b;
                if (str == null) {
                    vk6VarA.S(1);
                } else {
                    vk6VarA.f(1, str);
                }
                vk6VarA.k(2, this.c.b);
                vk6VarA.g(3, this.d);
                vk6VarA.g(4, this.o);
                vk6VarA.k(5, this.X ? 1L : 0L);
                try {
                    lrdVar.c();
                    try {
                        vk6VarA.w();
                        lrdVar.q();
                        crdVar.r(vk6VarA);
                        return qqg.a;
                    } finally {
                        lrdVar.k();
                    }
                } catch (Throwable th) {
                    crdVar.r(vk6VarA);
                    throw th;
                }
            default:
                o2h o2hVar = (o2h) this.Y;
                crd crdVar2 = o2hVar.c;
                lrd lrdVar2 = o2hVar.a;
                vk6 vk6VarA2 = crdVar2.a();
                String str2 = this.b;
                if (str2 == null) {
                    vk6VarA2.S(1);
                } else {
                    vk6VarA2.f(1, str2);
                }
                vk6VarA2.k(2, this.c.b);
                vk6VarA2.g(3, this.d);
                vk6VarA2.g(4, this.o);
                vk6VarA2.k(5, this.X ? 1L : 0L);
                try {
                    lrdVar2.c();
                    try {
                        vk6VarA2.w();
                        lrdVar2.q();
                        crdVar2.r(vk6VarA2);
                        return null;
                    } finally {
                        lrdVar2.k();
                    }
                } catch (Throwable th2) {
                    crdVar2.r(vk6VarA2);
                    throw th2;
                }
        }
    }
}
