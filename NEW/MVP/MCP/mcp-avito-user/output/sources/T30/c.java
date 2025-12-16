package T30;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionMessengerDialogAbTestProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LT30/c;", "Ldagger/internal/h;", "LT30/b;", "a", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f15340d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final U30.c f15341a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<InterfaceC27642e> f15342b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e0 f15343c;

    /* compiled from: NotificationPermissionMessengerDialogAbTestProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT30/c$a;", "", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k U30.c cVar, @k Provider provider, @k e0 e0Var) {
        this.f15341a = cVar;
        this.f15342b = provider;
        this.f15343c = e0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U30.a aVar = (U30.a) this.f15341a.get();
        InterfaceC27642e interfaceC27642e = this.f15342b.get();
        c0 c0Var = (c0) this.f15343c.get();
        f15340d.getClass();
        return new b(aVar, interfaceC27642e, c0Var);
    }
}
