package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.text.C43059p;

/* compiled from: modifierChecks.kt */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.f f410281a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C43059p f410282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Collection<kotlin.reflect.jvm.internal.impl.name.f> f410283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC42905x, String> f410284d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final f[] f410285e;

    /* compiled from: modifierChecks.kt */
    public static final class a extends N implements Y41.l {

        /* renamed from: l, reason: collision with root package name */
        public static final a f410286l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends N implements Y41.l {

        /* renamed from: l, reason: collision with root package name */
        public static final b f410287l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends N implements Y41.l {

        /* renamed from: l, reason: collision with root package name */
        public static final c f410288l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public h() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(kotlin.reflect.jvm.internal.impl.name.f fVar, C43059p c43059p, Collection<kotlin.reflect.jvm.internal.impl.name.f> collection, Y41.l<? super InterfaceC42905x, String> lVar, f... fVarArr) {
        this.f410281a = fVar;
        this.f410282b = c43059p;
        this.f410283c = collection;
        this.f410284d = lVar;
        this.f410285e = fVarArr;
    }

    public /* synthetic */ h(kotlin.reflect.jvm.internal.impl.name.f fVar, f[] fVarArr, Y41.l lVar, int i12, C42822w c42822w) {
        this(fVar, fVarArr, (Y41.l<? super InterfaceC42905x, String>) ((i12 & 4) != 0 ? a.f410286l : lVar));
    }

    public h(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k f[] fVarArr, @Y61.k Y41.l<? super InterfaceC42905x, String> lVar) {
        this(fVar, (C43059p) null, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public h(C43059p c43059p, f[] fVarArr, Y41.l lVar, int i12, C42822w c42822w) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, c43059p, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, (Y41.l<? super InterfaceC42905x, String>) ((i12 & 4) != 0 ? b.f410287l : lVar), (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, Y41.l lVar, int i12, C42822w c42822w) {
        this((Collection<kotlin.reflect.jvm.internal.impl.name.f>) collection, fVarArr, (Y41.l<? super InterfaceC42905x, String>) ((i12 & 4) != 0 ? c.f410288l : lVar));
    }

    public h(@Y61.k Collection<kotlin.reflect.jvm.internal.impl.name.f> collection, @Y61.k f[] fVarArr, @Y61.k Y41.l<? super InterfaceC42905x, String> lVar) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, (C43059p) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
