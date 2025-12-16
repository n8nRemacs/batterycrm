package l30;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NewCarsSendLeadApi_Module_ProvideNewCarsSendLeadApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ll30/c;", "Ldagger/internal/h;", "Ll30/a;", "a", "_avito_new-cars-send-lead_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l30.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C43535c implements h<InterfaceC43533a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f413435b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f413436a;

    /* compiled from: NewCarsSendLeadApi_Module_ProvideNewCarsSendLeadApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll30/c$a;", "", "<init>", "()V", "_avito_new-cars-send-lead_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l30.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43535c(@k f fVar) {
        this.f413436a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f413436a.get();
        f413435b.getClass();
        C43534b.f413434a.getClass();
        InterfaceC43533a interfaceC43533a = (InterfaceC43533a) r02.create(InterfaceC43533a.class);
        t.b(interfaceC43533a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC43533a;
    }
}
