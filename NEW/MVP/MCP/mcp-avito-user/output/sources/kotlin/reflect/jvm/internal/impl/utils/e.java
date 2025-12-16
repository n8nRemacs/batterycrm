package kotlin.reflect.jvm.internal.impl.utils;

import Y41.l;
import Y41.p;
import Y41.q;
import Y61.k;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* compiled from: functions.kt */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final l<Object, Boolean> f410353a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final q<Object, Object, Object, G0> f410354b;

    /* compiled from: functions.kt */
    public static final class a extends N implements l {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f410355l = 0;

        static {
            new a();
        }

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: functions.kt */
    public static final class b extends N implements l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f410356l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: functions.kt */
    public static final class c extends N implements l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f410357l = 0;

        static {
            new c();
        }

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj) {
            return G0.f406611a;
        }
    }

    /* compiled from: functions.kt */
    public static final class d extends N implements p<Object, Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f410358l = 0;

        static {
            new d();
        }

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj, Object obj2) {
            return G0.f406611a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.e$e, reason: collision with other inner class name */
    public static final class C11702e extends N implements q<Object, Object, Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11702e f410359l = new C11702e();

        public C11702e() {
            super(3);
        }

        @Override // Y41.q
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj, Object obj2, Object obj3) {
            return G0.f406611a;
        }
    }

    static {
        int i12 = f.f410360l;
        f410353a = b.f410356l;
        int i13 = a.f410355l;
        int i14 = c.f410357l;
        int i15 = d.f410358l;
        f410354b = C11702e.f410359l;
    }

    /* compiled from: functions.kt */
    public static final class f extends N implements l<Object, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f410360l = 0;

        static {
            new f();
        }

        public f() {
            super(1);
        }

        @Override // Y41.l
        @Y61.l
        public final Object invoke(@Y61.l Object obj) {
            return obj;
        }
    }
}
