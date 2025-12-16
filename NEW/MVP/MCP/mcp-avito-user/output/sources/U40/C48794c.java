package u40;

import Y61.k;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import s40.InterfaceC47996c;

/* compiled from: OfflineModule_Cache$_common_offlinization_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu40/c;", "Ldagger/internal/h;", "Lr40/f;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u40.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48794c implements h<r40.f> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f439774c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<r40.h> f439775a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final s40.e f439776b;

    /* compiled from: OfflineModule_Cache$_common_offlinization_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/offlinization/di/OfflineModule_Cache$_common_offlinization_implFactory.Companion", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: u40.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C48794c(@k Provider provider, @k s40.e eVar) {
        this.f439775a = provider;
        this.f439776b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r40.h hVar = this.f439775a.get();
        InterfaceC47996c interfaceC47996c = (InterfaceC47996c) this.f439776b.get();
        f439774c.getClass();
        C48792a.f439771a.getClass();
        return new r40.g(hVar, interfaceC47996c);
    }
}
