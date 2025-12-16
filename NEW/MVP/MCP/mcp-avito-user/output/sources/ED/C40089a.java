package ed;

import Y61.k;
import Zc.C19537e;
import Zc.InterfaceC19534b;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.antifraud.device_info.task.SendDeviceInfoTask;
import dagger.internal.f;
import dagger.internal.h;
import dd.C39707d;
import dd.InterfaceC39704a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendDeviceInfoTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Led/a;", "Ldagger/internal/h;", "Lcom/avito/android/antifraud/device_info/task/SendDeviceInfoTask;", "a", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ed.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40089a implements h<SendDeviceInfoTask> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C11093a f395254e = new C11093a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f395255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C19537e f395256b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final S f395257c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C39707d f395258d;

    /* compiled from: SendDeviceInfoTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Led/a$a;", "", "<init>", "()V", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ed.a$a, reason: collision with other inner class name */
    public static final class C11093a {
        public /* synthetic */ C11093a(C42822w c42822w) {
            this();
        }

        public C11093a() {
        }
    }

    public C40089a(@k f fVar, @k C19537e c19537e, @k S s5, @k C39707d c39707d) {
        this.f395255a = fVar;
        this.f395256b = c19537e;
        this.f395257c = s5;
        this.f395258d = c39707d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f395255a.get();
        InterfaceC19534b interfaceC19534b = (InterfaceC19534b) this.f395256b.get();
        P p12 = (P) this.f395257c.get();
        InterfaceC39704a interfaceC39704a = (InterfaceC39704a) this.f395258d.get();
        f395254e.getClass();
        return new SendDeviceInfoTask(interfaceC28373a, interfaceC19534b, p12, interfaceC39704a);
    }
}
