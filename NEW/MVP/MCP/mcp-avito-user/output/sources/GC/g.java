package Gc;

import Y61.k;
import com.avito.android.analytics_adjust.InterfaceC28533a;
import com.avito.android.analytics_adjust.o;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdjustModule_BindAdjustFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LGc/g;", "Ldagger/internal/h;", "Lcom/avito/android/analytics_adjust/a;", "a", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements h<InterfaceC28533a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f6616b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f6617a;

    /* compiled from: AdjustModule_BindAdjustFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGc/g$a;", "", "<init>", "()V", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k f fVar, @k o oVar) {
        this.f6617a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics_adjust.k kVar = (com.avito.android.analytics_adjust.k) this.f6617a.get();
        f6616b.getClass();
        return kVar;
    }
}
