package ru.cyberity.input;

import Y41.a;
import Y41.l;
import Y61.k;
import java.util.Map;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: Fingerprinter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0002\u000e\u0015B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u00020\n2\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108BX\u0082\u0084\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\f\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lru/cyberity/fingerprint/Fingerprinter;", "", "Lkotlin/Function0;", "Lru/cyberity/fingerprint/b;", "implFactory", "<init>", "(LY41/a;)V", "Lkotlin/Function1;", "", "", "Lkotlin/G0;", "listener", "b", "(LY41/l;)V", "a", "LY41/a;", "Lkotlin/Z;", "Lkotlin/C;", "()Ljava/lang/Object;", "impl", "c", "Version", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class Fingerprinter {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final a<ru.cyberity.input.b> implFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C impl = C42727D.c(new d());

    /* compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/cyberity/fingerprint/Fingerprinter$Version;", "", "", "intValue", "I", "getIntValue$cyberity_mobile_sdk_internal_core_release", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "V_4", "V_5", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public enum Version {
        V_4(4),
        V_5(5);

        private final int intValue;

        Version(int i12) {
            this.intValue = i12;
        }

        /* renamed from: getIntValue$cyberity_mobile_sdk_internal_core_release, reason: from getter */
        public final int getIntValue() {
            return this.intValue;
        }
    }

    /* compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lkotlin/G0;", "a", "()V", "ru/cyberity/fingerprint/Fingerprinter$e"}, k = 3, mv = {1, 7, 1})
    public final class b extends N implements a<G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fingerprinter f435685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f435686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f435687c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.input.tools.hashers.a f435688d;

        public final void a() {
            Object objB = this.f435685a.b();
            int i12 = Z.f406624c;
            if (!(objB instanceof Z.b)) {
                objB = Z.a(((ru.cyberity.input.b) objB).a(this.f435688d));
            }
            Object objA = ru.cyberity.input.tools.b.a(objB);
            l lVar = this.f435686b;
            Throwable thB = Z.b(objA);
            if (thB == null) {
                lVar.invoke(objA);
            } else {
                this.f435687c.invoke("");
                ru.cyberity.input.tools.logs.b.a(ru.cyberity.input.tools.logs.a.f436058a, thB);
            }
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lkotlin/G0;", "a", "()V", "ru/cyberity/fingerprint/Fingerprinter$e"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements a<G0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f435690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f435691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar, l lVar2) {
            super(0);
            this.f435690b = lVar;
            this.f435691c = lVar2;
        }

        public final void a() {
            Object objB = Fingerprinter.this.b();
            int i12 = Z.f406624c;
            if (!(objB instanceof Z.b)) {
                objB = Z.a(((ru.cyberity.input.b) objB).a());
            }
            Object objA = ru.cyberity.input.tools.b.a(objB);
            l lVar = this.f435690b;
            if (Z.b(objA) == null) {
                lVar.invoke(objA);
            } else {
                this.f435691c.invoke(P0.c());
            }
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Z;", "Lru/cyberity/fingerprint/b;", "a", "()Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements a<Z<? extends ru.cyberity.input.b>> {
        public d() {
            super(0);
        }

        @k
        public final Object a() {
            Fingerprinter fingerprinter = Fingerprinter.this;
            try {
                int i12 = Z.f406624c;
                return (ru.cyberity.input.b) fingerprinter.implFactory.invoke();
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                return new Z.b(th2);
            }
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ Z<? extends ru.cyberity.input.b> invoke() {
            return Z.a(a());
        }
    }

    /* compiled from: Fingerprinter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public final class e extends N implements a<G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fingerprinter f435693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Throwable, G0> f435694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<ru.cyberity.input.b, Z<Object>> f435695c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Object, G0> f435696d;

        public final void a() {
            Object objB = this.f435693a.b();
            l<ru.cyberity.input.b, Z<Object>> lVar = this.f435695c;
            int i12 = Z.f406624c;
            if (!(objB instanceof Z.b)) {
                objB = Z.a(lVar.invoke((ru.cyberity.input.b) objB).f406625b);
            }
            Object objA = ru.cyberity.input.tools.b.a(objB);
            l<Object, G0> lVar2 = this.f435696d;
            l<Throwable, G0> lVar3 = this.f435694b;
            Throwable thB = Z.b(objA);
            if (thB == null) {
                lVar2.invoke(objA);
            } else {
                lVar3.invoke(thB);
            }
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    public Fingerprinter(@k a<ru.cyberity.input.b> aVar) {
        this.implFactory = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b() {
        return ((Z) this.impl.getValue()).f406625b;
    }

    public final void b(@k l<? super Map<String, String>, G0> listener) {
        if (Z.b(ru.cyberity.input.tools.threading.a.a(new c(listener, listener))) != null) {
            listener.invoke(P0.c());
        }
    }
}
