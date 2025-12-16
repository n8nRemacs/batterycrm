package Wv;

import Uv.InterfaceC15572a;
import Y61.k;
import com.avito.android.delivery_tarifikator.presentation.region_screen.RegionScreenParams;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RegionScreenItemsMapperImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LWv/c;", "Ldagger/internal/h;", "LWv/b;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f18083c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f18084a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f18085b;

    /* compiled from: RegionScreenItemsMapperImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWv/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k l lVar, @k u uVar) {
        this.f18084a = lVar;
        this.f18085b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        RegionScreenParams regionScreenParams = (RegionScreenParams) this.f18084a.f393949a;
        InterfaceC15572a interfaceC15572a = (InterfaceC15572a) this.f18085b.get();
        f18083c.getClass();
        return new b(regionScreenParams, interfaceC15572a);
    }
}
