package Tl0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertApi_Module_ProvideUserAdvertApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LTl0/c;", "Ldagger/internal/h;", "LTl0/a;", "a", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15376c implements h<InterfaceC15374a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f15836b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f15837a;

    /* compiled from: UserAdvertApi_Module_ProvideUserAdvertApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTl0/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tl0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C15376c(@k f fVar) {
        this.f15837a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f15837a.get();
        f15836b.getClass();
        C15375b.f15835a.getClass();
        InterfaceC15374a interfaceC15374a = (InterfaceC15374a) r02.create(InterfaceC15374a.class);
        t.b(interfaceC15374a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC15374a;
    }
}
