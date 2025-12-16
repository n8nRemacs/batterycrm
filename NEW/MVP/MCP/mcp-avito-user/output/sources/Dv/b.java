package dv;

import Y61.k;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pv.InterfaceC47148a;
import pv.InterfaceC47151d;

/* compiled from: DeeplinkViewModule_ProvideDeeplinkBridgeFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ldv/b;", "Ldagger/internal/h;", "Lpv/a;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements h<InterfaceC47148a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f394173b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f394174a;

    /* compiled from: DeeplinkViewModule_ProvideDeeplinkBridgeFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldv/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k f fVar) {
        this.f394174a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47151d interfaceC47151d = (InterfaceC47151d) this.f394174a.get();
        f394173b.getClass();
        C39806a.f394172a.getClass();
        return interfaceC47151d.v2();
    }
}
