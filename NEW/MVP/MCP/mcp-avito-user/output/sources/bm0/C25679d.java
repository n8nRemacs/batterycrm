package bm0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertsActionsApi_Module_ProvideUserAdvertsActionsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbm0/d;", "Ldagger/internal/h;", "Lbm0/b;", "a", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bm0.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C25679d implements h<InterfaceC25677b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f57419b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f57420a;

    /* compiled from: UserAdvertsActionsApi_Module_ProvideUserAdvertsActionsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbm0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bm0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C25679d(@k f fVar) {
        this.f57420a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57420a.get();
        f57419b.getClass();
        C25678c.f57418a.getClass();
        InterfaceC25677b interfaceC25677b = (InterfaceC25677b) r02.create(InterfaceC25677b.class);
        t.b(interfaceC25677b, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC25677b;
    }
}
