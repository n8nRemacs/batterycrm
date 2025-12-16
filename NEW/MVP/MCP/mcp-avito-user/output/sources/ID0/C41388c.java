package id0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProgressInfoToastBarApi_Module_ProvideProgressInfoToastBarApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lid0/c;", "Ldagger/internal/h;", "Lid0/a;", "a", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: id0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C41388c implements h<InterfaceC41386a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f398606b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f398607a;

    /* compiled from: ProgressInfoToastBarApi_Module_ProvideProgressInfoToastBarApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid0/c$a;", "", "<init>", "()V", "_avito_progress-info-toast-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: id0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41388c(@k f fVar) {
        this.f398607a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398607a.get();
        f398606b.getClass();
        C41387b.f398605a.getClass();
        InterfaceC41386a interfaceC41386a = (InterfaceC41386a) r02.create(InterfaceC41386a.class);
        t.b(interfaceC41386a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC41386a;
    }
}
