package kotlin.reflect.jvm.internal.impl.util;

import androidx.camera.camera2.internal.G;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes8.dex */
public abstract class u implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f410342a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends u {

        /* renamed from: b, reason: collision with root package name */
        public final int f410343b;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i12) {
            StringBuilder sbJ = G.j(i12, "must have at least ", " value parameter");
            sbJ.append(i12 > 1 ? "s" : "");
            super(sbJ.toString(), null);
            this.f410343b = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
            return eVar.g().size() >= this.f410343b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends u {

        /* renamed from: b, reason: collision with root package name */
        public final int f410344b;

        public b() {
            super("must have exactly 2 value parameters", null);
            this.f410344b = 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
            return eVar.g().size() == this.f410344b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends u {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f410345b = new c();

        public c() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
            return eVar.g().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class d extends u {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final d f410346b = new d();

        public d() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
            return eVar.g().size() == 1;
        }
    }

    public u(String str, C42822w c42822w) {
        this.f410342a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.l
    public final String b(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.k
    public final String getDescription() {
        return this.f410342a;
    }
}
