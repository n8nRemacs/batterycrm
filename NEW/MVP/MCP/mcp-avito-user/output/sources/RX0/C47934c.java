package rx0;

import Y61.k;
import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SparePartsBottomSheetModule_ProvideAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lrx0/c;", "Ldagger/internal/h;", "Lcom/avito/konveyor/adapter/j;", "a", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47934c implements h<j> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f437256c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f437257a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<com.avito.konveyor.a> f437258b;

    /* compiled from: SparePartsBottomSheetModule_ProvideAdapterFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrx0/c$a;", "", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rx0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47934c(@k u uVar, @k Provider provider) {
        this.f437257a = uVar;
        this.f437258b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f437257a.get();
        com.avito.konveyor.a aVar2 = this.f437258b.get();
        f437256c.getClass();
        int i12 = C47933b.f437255a;
        return new j(aVar, aVar2);
    }
}
