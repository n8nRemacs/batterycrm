package aw;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliveryTarifikatorApi_Module_ProvideDeliveryTarifikatorApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Law/c;", "Ldagger/internal/h;", "Law/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aw.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C24184c implements h<InterfaceC24182a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f56773b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f56774a;

    /* compiled from: DeliveryTarifikatorApi_Module_ProvideDeliveryTarifikatorApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Law/c$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: aw.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C24184c(@k f fVar) {
        this.f56774a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f56774a.get();
        f56773b.getClass();
        C24183b.f56772a.getClass();
        InterfaceC24182a interfaceC24182a = (InterfaceC24182a) r02.create(InterfaceC24182a.class);
        t.b(interfaceC24182a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC24182a;
    }
}
