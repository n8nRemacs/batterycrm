package Nv;

import Jv.InterfaceC14252a;
import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliveryTarifikatorLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNv/d;", "Ldagger/internal/h;", "LNv/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements h<C14615a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f11807c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f11808a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Jv.d f11809b;

    /* compiled from: DeliveryTarifikatorLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNv/d$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k dv.b bVar, @k Jv.d dVar) {
        this.f11808a = bVar;
        this.f11809b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f11808a.get();
        InterfaceC14252a interfaceC14252a = (InterfaceC14252a) this.f11809b.get();
        f11807c.getClass();
        return new C14615a(interfaceC4053a, interfaceC14252a);
    }
}
