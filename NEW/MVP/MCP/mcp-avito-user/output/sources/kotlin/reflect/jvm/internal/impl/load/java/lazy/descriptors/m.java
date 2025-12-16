package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.collections.b1;
import kotlin.jvm.internal.N;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes8.dex */
final class m extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f408173l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar) {
        super(0);
        this.f408173l = lVar;
    }

    @Override // Y41.a
    public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
        l lVar = this.f408173l;
        return b1.h(lVar.a(), lVar.b());
    }
}
