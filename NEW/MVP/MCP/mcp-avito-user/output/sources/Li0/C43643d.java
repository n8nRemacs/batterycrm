package lI0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertApi_Module_ProvideUserAdvertApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LlI0/d;", "Ldagger/internal/h;", "LlI0/a;", "a", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lI0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43643d implements h<InterfaceC43640a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f413694b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f413695a;

    /* compiled from: UserAdvertApi_Module_ProvideUserAdvertApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlI0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lI0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43643d(@k f fVar) {
        this.f413695a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f413695a.get();
        f413694b.getClass();
        C43642c.f413693a.getClass();
        InterfaceC43640a interfaceC43640a = (InterfaceC43640a) r02.create(InterfaceC43640a.class);
        t.b(interfaceC43640a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC43640a;
    }
}
