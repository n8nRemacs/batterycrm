package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes8.dex */
public abstract class k implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f410292a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f410293b = new a();

        public a() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
            return eVar.f407712k != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f410294b = new b();

        public b() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
            return (eVar.f407712k == null && eVar.f407711j == null) ? false : true;
        }
    }

    public k(String str, C42822w c42822w) {
        this.f410292a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.l
    public final String b(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.k
    public final String getDescription() {
        return this.f410292a;
    }
}
