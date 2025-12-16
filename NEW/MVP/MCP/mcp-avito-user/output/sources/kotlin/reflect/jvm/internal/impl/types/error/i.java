package kotlin.reflect.jvm.internal.impl.types.error;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.C22026a;
import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: ThrowingScope.kt */
/* loaded from: classes8.dex */
public final class i extends e {
    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    public final /* bridge */ /* synthetic */ Collection d(kotlin.reflect.jvm.internal.impl.name.f fVar, InterfaceC41228b interfaceC41228b) {
        h(fVar);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @k
    public final Collection<InterfaceC42882k> e(@k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @k l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        throw new IllegalStateException(this.f410184b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    public final /* bridge */ /* synthetic */ Collection f(kotlin.reflect.jvm.internal.impl.name.f fVar, NoLookupLocation noLookupLocation) {
        i(fVar);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @k
    public final InterfaceC42853f g(@k kotlin.reflect.jvm.internal.impl.name.f fVar, @k InterfaceC41228b interfaceC41228b) {
        throw new IllegalStateException(this.f410184b + ", required name: " + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e
    @k
    public final Set h(@k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        throw new IllegalStateException(this.f410184b + ", required name: " + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e
    @k
    public final Set i(@k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        throw new IllegalStateException(this.f410184b + ", required name: " + fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e
    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ThrowingScope{"), this.f410184b, '}');
    }
}
