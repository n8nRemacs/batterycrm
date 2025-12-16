package J80;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlayerPerfInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LJ80/d;", "Ldagger/internal/h;", "LJ80/c;", "a", "_avito_player-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8795b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f8796a;

    /* compiled from: PlayerPerfInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ80/d$a;", "", "<init>", "()V", "_avito_player-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k dagger.internal.f fVar) {
        this.f8796a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f8796a.get();
        f8795b.getClass();
        return new c(interfaceC28373a);
    }
}
