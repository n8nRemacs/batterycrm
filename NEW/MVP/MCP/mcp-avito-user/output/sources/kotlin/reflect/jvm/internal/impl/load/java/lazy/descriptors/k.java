package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes8.dex */
final class k extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f408154l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(1);
        this.f408154l = lVar;
    }

    @Override // Y41.l
    public final Collection<? extends a0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return l.v(this.f408154l, fVar);
    }
}
