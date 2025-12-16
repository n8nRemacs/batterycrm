package kf;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoSelectBookingAnalyticsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkf/d;", "Ldagger/internal/h;", "Lkf/b;", "a", "_avito_auto-select-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kf.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42681d implements h<C42679b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f406526b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f406527a;

    /* compiled from: AutoSelectBookingAnalyticsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkf/d$a;", "", "<init>", "()V", "_avito_auto-select-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kf.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42681d(@k f fVar) {
        this.f406527a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f406527a.get();
        f406526b.getClass();
        return new C42679b(interfaceC28373a);
    }
}
