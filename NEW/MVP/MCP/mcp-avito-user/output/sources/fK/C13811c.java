package Fk;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BuyContactLinkApi_Module_ProvideBuyContactLinkApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LFk/c;", "Ldagger/internal/h;", "LFk/a;", "a", "_avito_job_buy-contact-link_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fk.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13811c implements h<InterfaceC13809a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f5964b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f5965a;

    /* compiled from: BuyContactLinkApi_Module_ProvideBuyContactLinkApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFk/c$a;", "", "<init>", "()V", "_avito_job_buy-contact-link_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fk.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13811c(@k dagger.internal.f fVar) {
        this.f5965a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f5965a.get();
        f5964b.getClass();
        C13810b.f5963a.getClass();
        InterfaceC13809a interfaceC13809a = (InterfaceC13809a) r02.create(InterfaceC13809a.class);
        t.b(interfaceC13809a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC13809a;
    }
}
