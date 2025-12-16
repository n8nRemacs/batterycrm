package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42938a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42941d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42948e;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42930h extends AbstractC42923a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.G f408471e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.H f408472f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C42948e f408473g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public m51.e f408474h;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h$a */
    public abstract class a implements z.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$a, reason: collision with other inner class name */
        public static final class C11668a implements z.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C42931i f408476a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C42931i f408477b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f408478c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f408479d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f408480e;

            public C11668a(C42931i c42931i, a aVar, kotlin.reflect.jvm.internal.impl.name.f fVar, ArrayList arrayList) {
                this.f408477b = c42931i;
                this.f408478c = aVar;
                this.f408479d = fVar;
                this.f408480e = arrayList;
                this.f408476a = c42931i;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
            public final void a() {
                this.f408477b.a();
                C42938a c42938a = new C42938a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) C42745f0.u0(this.f408480e));
                this.f408478c.h(this.f408479d, c42938a);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
            public final void b(@Y61.l Object obj, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                this.f408476a.b(obj, fVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
            @Y61.l
            public final z.b c(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return this.f408476a.c(fVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
            @Y61.l
            public final z.a d(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return this.f408476a.d(bVar, fVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
            public final void e(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar2) {
                this.f408476a.e(fVar, bVar, fVar2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
            public final void f(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
                this.f408476a.f(fVar, fVar2);
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b */
        public static final class b implements z.b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f408481a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C42930h f408482b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f408483c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f408484d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$b$a, reason: collision with other inner class name */
            public static final class C11669a implements z.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C42931i f408485a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C42931i f408486b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f408487c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f408488d;

                public C11669a(C42931i c42931i, b bVar, ArrayList arrayList) {
                    this.f408486b = c42931i;
                    this.f408487c = bVar;
                    this.f408488d = arrayList;
                    this.f408485a = c42931i;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
                public final void a() {
                    this.f408486b.a();
                    this.f408487c.f408481a.add(new C42938a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) C42745f0.u0(this.f408488d)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
                public final void b(@Y61.l Object obj, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    this.f408485a.b(obj, fVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
                @Y61.l
                public final z.b c(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    return this.f408485a.c(fVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
                @Y61.l
                public final z.a d(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    return this.f408485a.d(bVar, fVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
                public final void e(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar2) {
                    this.f408485a.e(fVar, bVar, fVar2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
                public final void f(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
                    this.f408485a.f(fVar, fVar2);
                }
            }

            public b(C42930h c42930h, kotlin.reflect.jvm.internal.impl.name.f fVar, a aVar) {
                this.f408482b = c42930h;
                this.f408483c = fVar;
                this.f408484d = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
            public final void a() {
                this.f408484d.g(this.f408481a, this.f408483c);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
            public final void b(@Y61.l Object obj) {
                this.f408481a.add(C42930h.x(this.f408482b, this.f408483c, obj));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
            @Y61.l
            public final z.a c(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) {
                ArrayList arrayList = new ArrayList();
                return new C11669a(this.f408482b.s(bVar, b0.f407539a, arrayList), this, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
            public final void d(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
                this.f408481a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.k(bVar, fVar));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.b
            public final void e(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar) {
                this.f408481a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.s(fVar));
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void b(@Y61.l Object obj, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            h(fVar, C42930h.x(C42930h.this, fVar, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @Y61.l
        public final z.b c(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return new b(C42930h.this, fVar, this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        @Y61.l
        public final z.a d(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            ArrayList arrayList = new ArrayList();
            return new C11668a(C42930h.this.s(bVar, b0.f407539a, arrayList), this, fVar, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void e(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar2) {
            h(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.k(bVar, fVar2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
        public final void f(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2) {
            h(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.s(fVar2));
        }

        public abstract void g(@Y61.k ArrayList arrayList, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar);

        public abstract void h(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar);
    }

    public C42930h(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.G g12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.H h12, @Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar) {
        super(fVar, gVar);
        this.f408471e = g12;
        this.f408472f = h12;
        this.f408473g = new C42948e(g12, h12);
        this.f408474h = m51.e.f414319g;
    }

    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.g x(C42930h c42930h, kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
        c42930h.getClass();
        kotlin.reflect.jvm.internal.impl.resolve.constants.g gVarB = kotlin.reflect.jvm.internal.impl.resolve.constants.i.f409588a.b(obj, c42930h.f408471e);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + fVar;
        kotlin.reflect.jvm.internal.impl.resolve.constants.l.f409591b.getClass();
        return new l.b(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d
    @Y61.k
    public final m51.e p() {
        return this.f408474h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.d r(ProtoBuf.Annotation annotation, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        return this.f408473g.a(annotation, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d
    @Y61.l
    public final C42931i s(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k b0 b0Var, @Y61.k List list) {
        return new C42931i(this, C42904w.c(this.f408471e, bVar, this.f408472f), bVar, list, b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42923a
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g w(Object obj) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g b12;
        kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) obj;
        if (gVar instanceof C42941d) {
            b12 = new kotlin.reflect.jvm.internal.impl.resolve.constants.z(((Number) ((C42941d) gVar).f409586a).byteValue());
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.w) {
            b12 = new kotlin.reflect.jvm.internal.impl.resolve.constants.C(((Number) ((kotlin.reflect.jvm.internal.impl.resolve.constants.w) gVar).f409586a).shortValue());
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.n) {
            b12 = new kotlin.reflect.jvm.internal.impl.resolve.constants.A(((Number) ((kotlin.reflect.jvm.internal.impl.resolve.constants.n) gVar).f409586a).intValue());
        } else {
            if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.t)) {
                return gVar;
            }
            b12 = new kotlin.reflect.jvm.internal.impl.resolve.constants.B(((Number) ((kotlin.reflect.jvm.internal.impl.resolve.constants.t) gVar).f409586a).longValue());
        }
        return b12;
    }
}
