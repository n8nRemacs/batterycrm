package wi0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecallMeApi_Module_ProvideRecallMeApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lwi0/g;", "Ldagger/internal/h;", "Lwi0/b;", "a", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements h<InterfaceC49631b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f441760b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f441761a;

    /* compiled from: RecallMeApi_Module_ProvideRecallMeApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi0/g$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k dagger.internal.f fVar) {
        this.f441761a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f441761a.get();
        f441760b.getClass();
        C49635f.f441759a.getClass();
        InterfaceC49631b interfaceC49631b = (InterfaceC49631b) r02.create(InterfaceC49631b.class);
        t.b(interfaceC49631b, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC49631b;
    }
}
