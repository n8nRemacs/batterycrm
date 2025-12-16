package lm0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RemoteDeviceIdApi_Module_ProvideRemoteDeviceIdApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Llm0/c;", "Ldagger/internal/h;", "Llm0/a;", "a", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lm0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C43798c implements h<InterfaceC43796a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414183b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f414184a;

    /* compiled from: RemoteDeviceIdApi_Module_ProvideRemoteDeviceIdApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llm0/c$a;", "", "<init>", "()V", "_avito_remote-device-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lm0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43798c(@k f fVar) {
        this.f414184a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f414184a.get();
        f414183b.getClass();
        C43797b.f414182a.getClass();
        InterfaceC43796a interfaceC43796a = (InterfaceC43796a) r02.create(InterfaceC43796a.class);
        t.b(interfaceC43796a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC43796a;
    }
}
