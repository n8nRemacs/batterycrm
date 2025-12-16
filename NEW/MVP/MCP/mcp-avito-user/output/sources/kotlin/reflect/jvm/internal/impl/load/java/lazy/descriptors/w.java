package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.N;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes8.dex */
final class w extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.resolve.scopes.j, Collection<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

    /* renamed from: l, reason: collision with root package name */
    public static final w f408236l = new w();

    public w() {
        super(1);
    }

    @Override // Y41.l
    public final Collection<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke(kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar) {
        return jVar.b();
    }
}
