package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: MemberScope.kt */
/* loaded from: classes8.dex */
public interface j extends m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f409683a = a.f409684a;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f409684a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> f409685b = C11688a.f409686l;

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.j$a$a, reason: collision with other inner class name */
        public static final class C11688a extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11688a f409686l = new C11688a();

            public C11688a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ Boolean invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return Boolean.TRUE;
            }
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b {
    }

    /* compiled from: MemberScope.kt */
    public static final class c extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f409687b = new c();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
            return B0.f406639b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return B0.f406639b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return B0.f406639b;
        }
    }

    @Y61.k
    Set<kotlin.reflect.jvm.internal.impl.name.f> a();

    @Y61.k
    Set<kotlin.reflect.jvm.internal.impl.name.f> b();

    @Y61.l
    Set<kotlin.reflect.jvm.internal.impl.name.f> c();

    @Y61.k
    Collection<? extends a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b);

    @Y61.k
    Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation);
}
