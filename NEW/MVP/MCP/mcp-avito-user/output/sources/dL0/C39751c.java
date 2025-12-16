package dl0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishApi_Module_ProvidePublishApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ldl0/c;", "Ldagger/internal/h;", "Ldl0/a;", "a", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39751c implements h<InterfaceC39749a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f394033b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f394034a;

    /* compiled from: PublishApi_Module_ProvidePublishApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldl0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dl0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39751c(@k f fVar) {
        this.f394034a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f394034a.get();
        f394033b.getClass();
        C39750b.f394032a.getClass();
        InterfaceC39749a interfaceC39749a = (InterfaceC39749a) r02.create(InterfaceC39749a.class);
        t.b(interfaceC39749a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC39749a;
    }
}
