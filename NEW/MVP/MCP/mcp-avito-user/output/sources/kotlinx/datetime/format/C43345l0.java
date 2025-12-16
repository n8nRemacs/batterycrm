package kotlinx.datetime.format;

import kotlin.Metadata;

/* compiled from: UtcOffsetFormat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/l0;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.format.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43345l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43345l0 f412434a = new C43345l0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.datetime.internal.format.E<x0> f412435b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.datetime.internal.format.E<x0> f412436c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.datetime.internal.format.E<x0> f412437d;

    /* compiled from: UtcOffsetFormat.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlinx/datetime/format/l0$c", "Lkotlinx/datetime/internal/format/m;", "Lkotlinx/datetime/format/x0;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.datetime.format.l0$c */
    public static final class c implements kotlinx.datetime.internal.format.m<x0> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlinx.datetime.internal.format.y<x0, Boolean> f412440a = new kotlinx.datetime.internal.format.y<>(new kotlin.jvm.internal.Y() { // from class: kotlinx.datetime.format.l0.c.a
            @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
            public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                ((x0) obj).q((Boolean) obj2);
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((x0) obj).getF412364a();
            }
        });

        @Override // kotlinx.datetime.internal.format.m
        /* renamed from: a, reason: from getter */
        public final kotlinx.datetime.internal.format.y getF412440a() {
            return this.f412440a;
        }

        @Override // kotlinx.datetime.internal.format.m
        public final boolean b(x0 x0Var) {
            x0 x0Var2 = x0Var;
            Integer f412365b = x0Var2.getF412365b();
            if ((f412365b != null ? f412365b.intValue() : 0) != 0) {
                return false;
            }
            Integer f412366c = x0Var2.getF412366c();
            if ((f412366c != null ? f412366c.intValue() : 0) != 0) {
                return false;
            }
            Integer f412367d = x0Var2.getF412367d();
            return (f412367d != null ? f412367d.intValue() : 0) == 0;
        }
    }

    static {
        c cVar = new c();
        f412435b = new kotlinx.datetime.internal.format.E<>(new kotlinx.datetime.internal.format.y(new kotlin.jvm.internal.Y() { // from class: kotlinx.datetime.format.l0.d
            @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
            public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                ((x0) obj).d((Integer) obj2);
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((x0) obj).getF412365b();
            }
        }), 0, 18, null, 0, cVar, 8, null);
        f412436c = new kotlinx.datetime.internal.format.E<>(new kotlinx.datetime.internal.format.y(new kotlin.jvm.internal.Y() { // from class: kotlinx.datetime.format.l0.a
            @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
            public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                ((x0) obj).r((Integer) obj2);
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((x0) obj).getF412366c();
            }
        }), 0, 59, null, 0, cVar, 8, null);
        f412437d = new kotlinx.datetime.internal.format.E<>(new kotlinx.datetime.internal.format.y(new kotlin.jvm.internal.Y() { // from class: kotlinx.datetime.format.l0.b
            @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
            public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                ((x0) obj).z((Integer) obj2);
            }

            @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((x0) obj).getF412367d();
            }
        }), 0, 59, null, 0, cVar, 8, null);
    }
}
