package Fk;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CheckVerificationApi_Module_ProvideCheckVerificationApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LFk/f;", "Ldagger/internal/h;", "LFk/d;", "a", "_avito_job_publish-check-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements h<InterfaceC13812d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f5967b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f5968a;

    /* compiled from: CheckVerificationApi_Module_ProvideCheckVerificationApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFk/f$a;", "", "<init>", "()V", "_avito_job_publish-check-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k dagger.internal.f fVar) {
        this.f5968a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f5968a.get();
        f5967b.getClass();
        e.f5966a.getClass();
        InterfaceC13812d interfaceC13812d = (InterfaceC13812d) r02.create(InterfaceC13812d.class);
        t.b(interfaceC13812d, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC13812d;
    }
}
