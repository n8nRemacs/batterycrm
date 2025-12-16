package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;

/* compiled from: MemberScope.kt */
/* loaded from: classes8.dex */
public abstract class c {

    /* compiled from: MemberScope.kt */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f409651a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f409652b;

        static {
            d.a aVar = d.f409654c;
            aVar.getClass();
            int i12 = d.f409661j;
            aVar.getClass();
            int i13 = d.f409659h;
            aVar.getClass();
            f409652b = (~(d.f409660i | i13)) & i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public final int a() {
            return f409652b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f409653a = new b();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
