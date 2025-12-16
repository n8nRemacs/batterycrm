package n40;

import Y61.k;
import com.avito.android.offlinization.beduin.i;
import com.avito.android.offlinization.beduin.m;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import o40.InterfaceC44578a;

/* compiled from: AepPatternHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ln40/d;", "Ldagger/internal/h;", "Ln40/a;", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements h<C44181a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f414898c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f414899a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o40.d f414900b;

    /* compiled from: AepPatternHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln40/d$a;", "", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k m mVar, @k o40.d dVar) {
        this.f414899a = mVar;
        this.f414900b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f414899a.get();
        InterfaceC44578a interfaceC44578a = (InterfaceC44578a) this.f414900b.get();
        f414898c.getClass();
        return new C44181a(iVar, interfaceC44578a);
    }
}
