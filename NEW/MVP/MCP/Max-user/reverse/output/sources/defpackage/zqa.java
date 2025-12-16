package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public final class zqa extends e2f implements on6 {
    public final /* synthetic */ int a;
    public final vqa b;
    public final Object c;

    public zqa(vqa vqaVar) {
        this.a = 1;
        this.b = vqaVar;
        this.c = new in6();
    }

    @Override // defpackage.on6
    public final vqa b() {
        switch (this.a) {
            case 0:
                return new yqa(this.b, (m7c) this.c, 0);
            default:
                return new tsa(this.b, (in6) this.c, 3);
        }
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        int i = this.a;
        vqa vqaVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                vqaVar.a(new xqa(v2fVar, (m7c) obj, 1));
                break;
            default:
                try {
                    Object obj2 = ((in6) obj).get();
                    aj5 aj5Var = bj5.a;
                    vqaVar.a(new tk3(v2fVar, 5, (Collection) obj2));
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    cd5.d(th, v2fVar);
                    return;
                }
        }
    }

    public zqa(vqa vqaVar, m7c m7cVar) {
        this.a = 0;
        this.b = vqaVar;
        this.c = m7cVar;
    }
}
