package rx0;

import Y61.k;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsBottomSheetModule_ProvideAdapterPresenterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lrx0/d;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/a;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rx0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47935d implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437259b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f437260a;

    /* compiled from: SparePartsBottomSheetModule_ProvideAdapterPresenterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrx0/d$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rx0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47935d(@k u uVar) {
        this.f437260a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f437260a.get();
        f437259b.getClass();
        int i12 = C47933b.f437255a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
