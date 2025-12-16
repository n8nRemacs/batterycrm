package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.types.l0;
import kotlin.reflect.jvm.internal.impl.types.n0;

/* compiled from: AttributeArrayOwner.kt */
/* loaded from: classes8.dex */
public abstract class e<K, T> extends a<K, T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public c<T> f410277b = i.f410289b;

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @Y61.k
    public final c<T> b() {
        return this.f410277b;
    }

    public final void e(@Y61.k String str, @Y61.k l0 l0Var) {
        n0.a aVarD = d();
        int iA2 = aVarD.a(aVarD.f410340a, str, new s(aVarD));
        int size = this.f410277b.getSize();
        if (size == 0) {
            this.f410277b = new o(iA2, l0Var);
            return;
        }
        if (size == 1) {
            o oVar = (o) this.f410277b;
            int i12 = oVar.f410299c;
            if (i12 == iA2) {
                this.f410277b = new o(iA2, l0Var);
                return;
            } else {
                d dVar = new d();
                this.f410277b = dVar;
                dVar.a(i12, oVar.f410298b);
            }
        }
        this.f410277b.a(iA2, l0Var);
    }
}
