package i30;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsGetContactsApi_Module_ProvideNewCarsGetContactsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Li30/c;", "Ldagger/internal/h;", "Li30/a;", "a", "_avito_new-cars-get-contacts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: i30.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C41219c implements h<InterfaceC41217a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f398354b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f398355a;

    /* compiled from: NewCarsGetContactsApi_Module_ProvideNewCarsGetContactsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li30/c$a;", "", "<init>", "()V", "_avito_new-cars-get-contacts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: i30.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41219c(@k f fVar) {
        this.f398355a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398355a.get();
        f398354b.getClass();
        C41218b.f398353a.getClass();
        InterfaceC41217a interfaceC41217a = (InterfaceC41217a) r02.create(InterfaceC41217a.class);
        t.b(interfaceC41217a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC41217a;
    }
}
