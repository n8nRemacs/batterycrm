package kotlin.reflect.jvm.internal.impl.types.error;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.C22026a;
import i51.InterfaceC41228b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;

/* compiled from: ErrorScope.kt */
/* loaded from: classes8.dex */
public class e implements j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f410184b;

    public e(@k ErrorScopeKind errorScopeKind, @k String... strArr) {
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f410184b = String.format(errorScopeKind.f410143b, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @k
    public Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @k
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @k
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    public /* bridge */ /* synthetic */ Collection d(kotlin.reflect.jvm.internal.impl.name.f fVar, InterfaceC41228b interfaceC41228b) {
        return h(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @k
    public Collection<InterfaceC42882k> e(@k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @k l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    public /* bridge */ /* synthetic */ Collection f(kotlin.reflect.jvm.internal.impl.name.f fVar, NoLookupLocation noLookupLocation) {
        return i(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @k
    public InterfaceC42853f g(@k kotlin.reflect.jvm.internal.impl.name.f fVar, @k InterfaceC41228b interfaceC41228b) {
        ErrorEntity[] errorEntityArr = ErrorEntity.f410134b;
        return new a(kotlin.reflect.jvm.internal.impl.name.f.h(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{fVar}, 1))));
    }

    @k
    public Set h(@k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        h.f410195a.getClass();
        a aVar = h.f410197c;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        ErrorEntity[] errorEntityArr = ErrorEntity.f410134b;
        b bVar = new b(aVar, null, c11652a, kotlin.reflect.jvm.internal.impl.name.f.h("<Error function>"), CallableMemberDescriptor.Kind.f407408b, b0.f407539a);
        C42784z0 c42784z0 = C42784z0.f406748b;
        bVar.I0(null, null, c42784z0, c42784z0, c42784z0, h.b(ErrorTypeKind.f410154f, new String[0]), Modality.f407441e, r.f407789e);
        return Collections.singleton(bVar);
    }

    @k
    public Set i(@k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        h.f410195a.getClass();
        return h.f410200f;
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("ErrorScope{"), this.f410184b, '}');
    }
}
