package u60;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentApi_Module_ProvidePaymentApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu60/c;", "Ldagger/internal/h;", "Lu60/a;", "a", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<InterfaceC48808a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439799b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f439800a;

    /* compiled from: PaymentApi_Module_ProvidePaymentApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu60/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f439800a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439800a.get();
        f439799b.getClass();
        b.f439798a.getClass();
        InterfaceC48808a interfaceC48808a = (InterfaceC48808a) r02.create(InterfaceC48808a.class);
        t.b(interfaceC48808a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC48808a;
    }
}
