package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import kotlin.jvm.internal.N;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42925c extends N implements Y41.l<z, C42929g<Object, Object>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC42923a<Object, Object> f408458l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42925c(AbstractC42923a<Object, Object> abstractC42923a) {
        super(1);
        this.f408458l = abstractC42923a;
    }

    @Override // Y41.l
    public final C42929g<Object, Object> invoke(z zVar) {
        z zVar2 = zVar;
        int i12 = AbstractC42923a.f408447d;
        AbstractC42923a<Object, Object> abstractC42923a = this.f408458l;
        abstractC42923a.getClass();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        zVar2.b(new C42924b(abstractC42923a, map, zVar2, map2));
        return new C42929g<>(map, map2, map3);
    }
}
