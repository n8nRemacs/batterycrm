package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import k51.y;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.B;

/* compiled from: resolvers.kt */
/* loaded from: classes8.dex */
final class i extends N implements Y41.l<y, B> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f408258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(1);
        this.f408258l = jVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final B invoke(y yVar) {
        y yVar2 = yVar;
        j jVar = this.f408258l;
        Integer num = (Integer) jVar.f408262d.get(yVar2);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        h hVar = jVar.f408259a;
        h hVar2 = new h(hVar.f408253a, jVar, hVar.f408255c);
        InterfaceC42883l interfaceC42883l = jVar.f408260b;
        return new B(b.c(hVar2, interfaceC42883l.getAnnotations()), yVar2, jVar.f408261c + iIntValue, interfaceC42883l);
    }
}
