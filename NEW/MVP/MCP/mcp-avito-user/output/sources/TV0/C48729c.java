package tv0;

import AK0.l;
import Y61.k;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceRealtySheetStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ltv0/c;", "Ldagger/internal/h;", "Ltv0/b;", "a", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48729c implements h<C48728b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439664b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30214v6 f439665a;

    /* compiled from: ServiceRealtySheetStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltv0/c$a;", "", "<init>", "()V", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tv0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48729c(@k C30214v6 c30214v6) {
        this.f439665a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f439665a.get();
        f439664b.getClass();
        return new C48728b(lVar);
    }
}
