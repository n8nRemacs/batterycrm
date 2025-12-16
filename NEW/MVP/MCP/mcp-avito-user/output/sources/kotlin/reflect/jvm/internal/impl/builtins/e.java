package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: DefaultBuiltIns.kt */
/* loaded from: classes8.dex */
public final class e extends k {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final b f407194g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<e> f407195h = C42727D.c(a.f407196l);

    /* compiled from: DefaultBuiltIns.kt */
    public static final class a extends N implements Y41.a<e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f407196l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final e invoke() {
            return new e(false, 1, null);
        }
    }

    /* compiled from: DefaultBuiltIns.kt */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public e() {
        this(false, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z12, int i12, C42822w c42822w) {
        super(new kotlin.reflect.jvm.internal.impl.storage.f("DefaultBuiltIns"));
        z12 = (i12 & 1) != 0 ? true : z12;
        if (z12) {
            c(false);
        }
    }
}
