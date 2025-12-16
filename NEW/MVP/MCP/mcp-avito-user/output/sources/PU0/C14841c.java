package Pu0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrdersApi_Module_ProvideServiceOrdersApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LPu0/c;", "Ldagger/internal/h;", "LPu0/a;", "a", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pu0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14841c implements h<InterfaceC14839a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f13364b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f13365a;

    /* compiled from: ServiceOrdersApi_Module_ProvideServiceOrdersApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPu0/c$a;", "", "<init>", "()V", "_avito_service-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pu0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14841c(@k f fVar) {
        this.f13365a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f13365a.get();
        f13364b.getClass();
        C14840b.f13363a.getClass();
        InterfaceC14839a interfaceC14839a = (InterfaceC14839a) r02.create(InterfaceC14839a.class);
        t.b(interfaceC14839a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14839a;
    }
}
