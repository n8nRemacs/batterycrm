package Nx0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrBookingApi_Module_ProvideStrBookingApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LNx0/d;", "Ldagger/internal/h;", "LNx0/b;", "a", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nx0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14624d implements h<InterfaceC14622b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f11877b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f11878a;

    /* compiled from: StrBookingApi_Module_ProvideStrBookingApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNx0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Nx0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14624d(@k f fVar) {
        this.f11878a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11878a.get();
        f11877b.getClass();
        C14623c.f11876a.getClass();
        InterfaceC14622b interfaceC14622b = (InterfaceC14622b) r02.create(InterfaceC14622b.class);
        t.b(interfaceC14622b, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14622b;
    }
}
