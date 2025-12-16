package H21;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Field.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LH21/a;", "T", "", "a", "b", "c", "d", "e", "LH21/a$b;", "LH21/a$c;", "LH21/a$e;", "LH21/a$d;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0393a f6925b = new C0393a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6926a;

    /* compiled from: Field.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH21/a$a;", "", "<init>", "()V", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: H21.a$a, reason: collision with other inner class name */
    public static final class C0393a {
        public /* synthetic */ C0393a(C42822w c42822w) {
            this();
        }

        @k
        public static a a(boolean z12) {
            return z12 ? c.f6928c : b.f6927c;
        }

        public C0393a() {
        }
    }

    /* compiled from: Field.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LH21/a$b;", "LH21/a;", "", "<init>", "()V", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends a<Object> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f6927c = new b();

        public b() {
            super(false, null);
        }
    }

    /* compiled from: Field.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LH21/a$c;", "LH21/a;", "", "<init>", "()V", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends a<Object> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final c f6928c = new c();

        public c() {
            super(true, null);
        }
    }

    /* compiled from: Field.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"LH21/a$d;", "T", "LH21/a;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f6929c;

        public d(boolean z12, @k String str) {
            super(z12, null);
            this.f6929c = str;
        }
    }

    /* compiled from: Field.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"LH21/a$e;", "T", "LH21/a;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e<T> extends a<T> {

        /* renamed from: c, reason: collision with root package name */
        public final T f6930c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, boolean z12) {
            super(z12, null);
            this.f6930c = obj;
        }
    }

    public a(boolean z12, C42822w c42822w) {
        this.f6926a = z12;
    }
}
