package Ek0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationsApi_Module_ProvideNotificationsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEk0/c;", "Ldagger/internal/h;", "LEk0/a;", "a", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class c implements h<InterfaceC13498a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f4219b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f4220a;

    /* compiled from: NotificationsApi_Module_ProvideNotificationsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEk0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f4220a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f4220a.get();
        f4219b.getClass();
        C13499b.f4218a.getClass();
        InterfaceC13498a interfaceC13498a = (InterfaceC13498a) r02.create(InterfaceC13498a.class);
        t.b(interfaceC13498a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC13498a;
    }
}
