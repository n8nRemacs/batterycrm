package dm0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertsActionsApi_Module_ProvideUserAdvertsActionsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ldm0/c;", "Ldagger/internal/h;", "Ldm0/a;", "a", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dm0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39757c implements h<InterfaceC39755a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f394043b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f394044a;

    /* compiled from: UserAdvertsActionsApi_Module_ProvideUserAdvertsActionsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldm0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_user-adverts-actions"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dm0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39757c(@k f fVar) {
        this.f394044a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f394044a.get();
        f394043b.getClass();
        C39756b.f394042a.getClass();
        InterfaceC39755a interfaceC39755a = (InterfaceC39755a) r02.create(InterfaceC39755a.class);
        t.b(interfaceC39755a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC39755a;
    }
}
