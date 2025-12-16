package sP;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CrmPaidCvsApi_Module_ProvideCrmPaidCvsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LsP/c;", "Ldagger/internal/h;", "LsP/a;", "a", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sP.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48089c implements h<InterfaceC48087a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f437642b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f437643a;

    /* compiled from: CrmPaidCvsApi_Module_ProvideCrmPaidCvsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LsP/c$a;", "", "<init>", "()V", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sP.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48089c(@k f fVar) {
        this.f437643a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f437643a.get();
        f437642b.getClass();
        C48088b.f437641a.getClass();
        InterfaceC48087a interfaceC48087a = (InterfaceC48087a) r02.create(InterfaceC48087a.class);
        t.b(interfaceC48087a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC48087a;
    }
}
