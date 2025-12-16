package mN0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VideoRequirementsApi_Module_ProvideVideoRequirementsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LmN0/c;", "Ldagger/internal/h;", "LmN0/a;", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mN0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43986c implements h<InterfaceC43984a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414483b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f414484a;

    /* compiled from: VideoRequirementsApi_Module_ProvideVideoRequirementsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmN0/c$a;", "", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mN0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43986c(@k f fVar) {
        this.f414484a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414484a.get();
        f414483b.getClass();
        C43985b.f414482a.getClass();
        InterfaceC43984a interfaceC43984a = (InterfaceC43984a) r02.create(InterfaceC43984a.class);
        t.b(interfaceC43984a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC43984a;
    }
}
