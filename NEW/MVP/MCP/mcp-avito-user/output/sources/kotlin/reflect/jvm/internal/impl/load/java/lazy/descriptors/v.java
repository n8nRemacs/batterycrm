package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes8.dex */
final class v extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.j, Collection<? extends U>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f408235l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(1);
        this.f408235l = fVar;
    }

    @Override // Y41.l
    public final Collection<? extends U> invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar) {
        return jVar.f(this.f408235l, NoLookupLocation.f407888f);
    }
}
