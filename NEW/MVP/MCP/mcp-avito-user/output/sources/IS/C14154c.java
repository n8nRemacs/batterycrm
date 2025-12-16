package Is;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CrmApi_Module_ProvideCrmApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIs/c;", "Ldagger/internal/h;", "LIs/a;", "a", "_avito_crm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Is.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14154c implements h<InterfaceC14152a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8575b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f8576a;

    /* compiled from: CrmApi_Module_ProvideCrmApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIs/c$a;", "", "<init>", "()V", "_avito_crm_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Is.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14154c(@k f fVar) {
        this.f8576a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f8576a.get();
        f8575b.getClass();
        C14153b.f8574a.getClass();
        InterfaceC14152a interfaceC14152a = (InterfaceC14152a) r02.create(InterfaceC14152a.class);
        t.b(interfaceC14152a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14152a;
    }
}
