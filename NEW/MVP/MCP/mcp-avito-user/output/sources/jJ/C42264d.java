package jJ;

import Y61.k;
import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocaleStoreImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LjJ/d;", "Ldagger/internal/h;", "LjJ/c;", "a", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jJ.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C42264d implements h<C42263c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f405543b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f405544a;

    /* compiled from: LocaleStoreImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjJ/d$a;", "", "<init>", "()V", "_common_i18n_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jJ.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42264d(@k l lVar) {
        this.f405544a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f405544a.f393949a;
        f405543b.getClass();
        return new C42263c(application);
    }
}
