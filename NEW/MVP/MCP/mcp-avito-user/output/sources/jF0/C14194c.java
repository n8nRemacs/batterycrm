package Jf0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WizardApi_Module_ProvideWizardApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LJf0/c;", "Ldagger/internal/h;", "LJf0/a;", "a", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14194c implements h<InterfaceC14192a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f9096b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f9097a;

    /* compiled from: WizardApi_Module_ProvideWizardApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJf0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jf0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14194c(@k f fVar) {
        this.f9097a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f9097a.get();
        f9096b.getClass();
        C14193b.f9095a.getClass();
        InterfaceC14192a interfaceC14192a = (InterfaceC14192a) r02.create(InterfaceC14192a.class);
        t.b(interfaceC14192a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC14192a;
    }
}
