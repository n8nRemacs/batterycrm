package cN0;

import Y61.k;
import com.avito.android.server_time.f;
import com.avito.android.version_conflict.g;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnUpdateProposalDialogShownUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LcN0/d;", "Ldagger/internal/h;", "LcN0/c;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cN0.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27075d implements h<C27074c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f57844c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.version_conflict.h f57845a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<f> f57846b;

    /* compiled from: OnUpdateProposalDialogShownUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcN0/d$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cN0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27075d(@k com.avito.android.version_conflict.h hVar, @k Provider provider) {
        this.f57845a = hVar;
        this.f57846b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f57845a.get();
        f fVar = this.f57846b.get();
        f57844c.getClass();
        return new C27074c(gVar, fVar);
    }
}
