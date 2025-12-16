package pW;

import com.avito.android.location.find.DetectLocationInteractor;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qW.C47352a;

/* compiled from: FindDetectLocationModule_ProvideDetectLocationInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpW/e;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/DetectLocationInteractor;", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pW.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47014e implements dagger.internal.h<DetectLocationInteractor> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f428562d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f428563a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f428564b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f428565c;

    /* compiled from: FindDetectLocationModule_ProvideDetectLocationInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpW/e$a;", "", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pW.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47014e(@Y61.k u uVar, @Y61.k u uVar2, @Y61.k u uVar3) {
        this.f428563a = uVar;
        this.f428564b = uVar2;
        this.f428565c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C47352a c47352a = (C47352a) this.f428563a.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f428564b.get();
        com.avito.android.geo.j jVar = (com.avito.android.geo.j) this.f428565c.get();
        f428562d.getClass();
        return new com.avito.android.location.find.g(c47352a, C47010a.f428553a, interfaceC35745a5, jVar);
    }
}
