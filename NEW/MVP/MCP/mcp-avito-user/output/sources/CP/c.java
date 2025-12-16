package cP;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContactAccessApi_Module_ProvideContactAccessApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LcP/c;", "Ldagger/internal/h;", "LcP/a;", "a", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<InterfaceC27082a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f57854b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f57855a;

    /* compiled from: ContactAccessApi_Module_ProvideContactAccessApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LcP/c$a;", "", "<init>", "()V", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f57855a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f57855a.get();
        f57854b.getClass();
        b.f57853a.getClass();
        InterfaceC27082a interfaceC27082a = (InterfaceC27082a) r02.create(InterfaceC27082a.class);
        t.b(interfaceC27082a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC27082a;
    }
}
