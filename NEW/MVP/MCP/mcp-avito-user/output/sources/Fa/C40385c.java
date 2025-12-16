package fa;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsApi_Module_ProvideAdvertDetailsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lfa/c;", "Ldagger/internal/h;", "Lfa/a;", "a", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fa.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40385c implements dagger.internal.h<InterfaceC40383a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f395947b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f395948a;

    /* compiled from: AdvertDetailsApi_Module_ProvideAdvertDetailsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfa/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fa.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40385c(@k dagger.internal.f fVar) {
        this.f395948a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f395948a.get();
        f395947b.getClass();
        C40384b.f395946a.getClass();
        InterfaceC40383a interfaceC40383a = (InterfaceC40383a) r02.create(InterfaceC40383a.class);
        t.b(interfaceC40383a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC40383a;
    }
}
