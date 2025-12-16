package ig;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoFinanceUserProfileApi_Module_ProvideAvitoFinanceUserProfileApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lig/c;", "Ldagger/internal/h;", "Lig/a;", "a", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ig.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C41397c implements h<InterfaceC41395a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f398611b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f398612a;

    /* compiled from: AvitoFinanceUserProfileApi_Module_ProvideAvitoFinanceUserProfileApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lig/c$a;", "", "<init>", "()V", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ig.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41397c(@k f fVar) {
        this.f398612a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398612a.get();
        f398611b.getClass();
        C41396b.f398610a.getClass();
        InterfaceC41395a interfaceC41395a = (InterfaceC41395a) r02.create(InterfaceC41395a.class);
        t.b(interfaceC41395a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC41395a;
    }
}
