package uU;

import Y61.k;
import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.C;
import com.avito.beduin.v2.repository.environment.g;
import com.avito.beduin.v2.repository.environment.i;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EnvironmentClientModule_ProvideEnvironmentClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LuU/b;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/repository/environment/i;", "a", "_design-modules_beduin-v2_interactions_repository_common_environment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uU.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48950b implements h<i> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f439969c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f439970a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<C> f439971b;

    /* compiled from: EnvironmentClientModule_ProvideEnvironmentClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuU/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_environment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uU.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48950b(@k C30102l3 c30102l3, @k Provider provider) {
        this.f439970a = c30102l3;
        this.f439971b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f439970a.get();
        C c12 = this.f439971b.get();
        f439969c.getClass();
        C48949a.f439968a.getClass();
        c12.getF125491k().getClass();
        return new g(context);
    }
}
