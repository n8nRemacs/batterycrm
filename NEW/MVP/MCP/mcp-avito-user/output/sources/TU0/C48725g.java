package tu0;

import Y61.k;
import com.avito.android.location.find.InterfaceC31503a;
import dagger.internal.h;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderMapModule_ProvideDefaultLocationProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ltu0/g;", "Ldagger/internal/h;", "Lcom/avito/android/location/find/d;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tu0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48725g implements h<com.avito.android.location.find.d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439658b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f439659a;

    /* compiled from: ServiceOrderMapModule_ProvideDefaultLocationProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltu0/g$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tu0.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48725g(@k C48721c c48721c, @k u uVar) {
        this.f439659a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC31503a interfaceC31503a = (InterfaceC31503a) this.f439659a.get();
        f439658b.getClass();
        return new com.avito.android.location.find.e(interfaceC31503a);
    }
}
