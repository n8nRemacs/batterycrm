package M30;

import Y61.k;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionDialogAbTestProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LM30/c;", "Ldagger/internal/h;", "LM30/b;", "a", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f10368d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final S f10369a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f10370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e0 f10371c;

    /* compiled from: NotificationPermissionDialogAbTestProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM30/c$a;", "", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k S s5, @k e0 e0Var, @k Provider provider) {
        this.f10369a = s5;
        this.f10370b = provider;
        this.f10371c = e0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P p12 = (P) this.f10369a.get();
        InterfaceC27642e interfaceC27642e = this.f10370b.get();
        c0 c0Var = (c0) this.f10371c.get();
        f10368d.getClass();
        return new b(p12, interfaceC27642e, c0Var);
    }
}
