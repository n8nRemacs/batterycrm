package Uq;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComparisonApi_Module_ProvideComparisonApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LUq/c;", "Ldagger/internal/h;", "LUq/a;", "a", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC15558a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f16690b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f16691a;

    /* compiled from: ComparisonApi_Module_ProvideComparisonApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUq/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k f fVar) {
        this.f16691a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f16691a.get();
        f16690b.getClass();
        b.f16689a.getClass();
        InterfaceC15558a interfaceC15558a = (InterfaceC15558a) r02.create(InterfaceC15558a.class);
        t.b(interfaceC15558a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC15558a;
    }
}
