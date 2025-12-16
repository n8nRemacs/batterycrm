package fd;

import AK0.l;
import AK0.o;
import Y61.k;
import android.app.Application;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendDeviceInfoTaskModule_ProvideSendDeviceInfoPrefsFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lfd/c;", "Ldagger/internal/h;", "LAK0/l;", "a", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fd.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40402c implements h<l> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f395983b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.l f395984a;

    /* compiled from: SendDeviceInfoTaskModule_ProvideSendDeviceInfoPrefsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfd/c$a;", "", "<init>", "()V", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fd.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40402c(@k dagger.internal.l lVar) {
        this.f395984a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f395984a.f393949a;
        f395983b.getClass();
        C40400a.f395981a.getClass();
        return new o(application.getSharedPreferences("antifraud", 0));
    }
}
