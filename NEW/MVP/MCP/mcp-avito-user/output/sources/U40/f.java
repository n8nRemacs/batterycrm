package u40;

import Y61.k;
import android.os.Handler;
import android.os.Looper;
import com.avito.android.offlinization.A;
import com.avito.android.offlinization.B;
import com.avito.android.offlinization.analytics.events.NoCacheStartReason;
import com.avito.android.offlinization.p;
import com.avito.android.offlinization.t;
import com.avito.android.offlinization.u;
import dagger.internal.h;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import r40.C47487a;
import v40.C49161a;

/* compiled from: OfflineModule_InterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu40/f;", "Ldagger/internal/h;", "Lcom/avito/android/offlinization/t;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements h<t> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439783b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final B f439784a;

    /* compiled from: OfflineModule_InterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu40/f$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k B b12) {
        this.f439784a = b12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object c49161a;
        final A a12 = (A) this.f439784a.get();
        f439783b.getClass();
        C48792a.f439771a.getClass();
        p pVar = a12.f208467a;
        if (pVar.f()) {
            final C47487a c47487a = a12.f208469c;
            boolean z12 = c47487a.f429579a.getFreeSpace() - 10485760 >= 10485760 * ((long) 2);
            if (!z12 && pVar.a()) {
                a12.a(NoCacheStartReason.f208503c);
            }
            if (z12) {
                try {
                    Object obj = a12.f208468b.get();
                    a12.a(null);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.avito.android.offlinization.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            A a13 = a12;
                            com.avito.android.offlinization.ui.k.a(new z(a13), C43175k.G(new y(a13, c47487a, null)));
                        }
                    });
                    c49161a = new C49161a((u) obj, a12.f208471e);
                } catch (IOException unused) {
                    t.f208596W1.getClass();
                    c49161a = t.a.f208598b;
                    a12.a(NoCacheStartReason.f208504d);
                }
            } else {
                t.f208596W1.getClass();
                c49161a = t.a.f208598b;
            }
        } else {
            t.f208596W1.getClass();
            c49161a = t.a.f208598b;
        }
        dagger.internal.t.b(c49161a, "Cannot return null from a non-@Nullable @Provides method");
        return c49161a;
    }
}
