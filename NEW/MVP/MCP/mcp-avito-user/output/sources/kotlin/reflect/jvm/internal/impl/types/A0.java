package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C42822w;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes8.dex */
public abstract class A0 {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a f410003a;

    /* compiled from: TypeSubstitution.kt */
    public static final class a extends A0 {
        @Override // kotlin.reflect.jvm.internal.impl.types.A0
        public final /* bridge */ /* synthetic */ x0 d(O o12) {
            return null;
        }

        @Y61.k
        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* compiled from: TypeSubstitution.kt */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f410003a = new a();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    @Y61.l
    public abstract x0 d(@Y61.k O o12);

    public boolean e() {
        return this instanceof a;
    }

    @Y61.k
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        return gVar;
    }

    @Y61.k
    public O f(@Y61.k O o12, @Y61.k Variance variance) {
        return o12;
    }
}
