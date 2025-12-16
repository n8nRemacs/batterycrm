package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Y61.k;
import androidx.compose.runtime.C22026a;
import kotlin.reflect.jvm.internal.impl.builtins.n;

/* compiled from: FunctionTypeKind.kt */
/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kotlin.reflect.jvm.internal.impl.name.c f407213a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f407214b;

    /* compiled from: FunctionTypeKind.kt */
    public static final class a extends e {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f407215c = new a();

        public a() {
            super("Function", n.f407339l);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class b extends e {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f407216c = new b();

        public b() {
            super("KFunction", n.f407336i);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class c extends e {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final c f407217c = new c();

        public c() {
            super("KSuspendFunction", n.f407336i);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class d extends e {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final d f407218c = new d();

        public d() {
            super("SuspendFunction", n.f407333f);
        }
    }

    public e(@k String str, @k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        this.f407213a = cVar;
        this.f407214b = str;
    }

    @k
    public final kotlin.reflect.jvm.internal.impl.name.f a(int i12) {
        return kotlin.reflect.jvm.internal.impl.name.f.e(this.f407214b + i12);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f407213a);
        sb2.append('.');
        return C22026a.c(sb2, this.f407214b, 'N');
    }
}
