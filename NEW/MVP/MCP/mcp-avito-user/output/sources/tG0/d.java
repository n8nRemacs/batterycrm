package tG0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UniversalMapApi_Module_ProvideUniversalMapApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LtG0/d;", "Ldagger/internal/h;", "LtG0/b;", "a", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements h<InterfaceC48553b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f439211b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f439212a;

    /* compiled from: UniversalMapApi_Module_ProvideUniversalMapApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LtG0/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k f fVar) {
        this.f439212a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f439212a.get();
        f439211b.getClass();
        C48554c.f439210a.getClass();
        InterfaceC48553b interfaceC48553b = (InterfaceC48553b) r02.create(InterfaceC48553b.class);
        t.b(interfaceC48553b, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC48553b;
    }
}
