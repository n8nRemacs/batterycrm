package dd;

import AK0.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.google.gson.Gson;
import dagger.internal.f;
import dagger.internal.h;
import fd.C40402c;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeviceInfoStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ldd/d;", "Ldagger/internal/h;", "Ldd/b;", "a", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dd.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39707d implements h<C39705b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f393976d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C40402c f393977a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<Gson> f393978b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f393979c;

    /* compiled from: DeviceInfoStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldd/d$a;", "", "<init>", "()V", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dd.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39707d(@k C40402c c40402c, @k Provider provider, @k f fVar) {
        this.f393977a = c40402c;
        this.f393978b = provider;
        this.f393979c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f393977a.get();
        Gson gson = this.f393978b.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f393979c.get();
        f393976d.getClass();
        return new C39705b(lVar, gson, interfaceC28373a);
    }
}
