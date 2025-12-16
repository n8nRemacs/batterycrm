package WQ;

import Y61.k;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: KonveyorItemModule_ProvideKonveyorItemMappingsFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001b\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LWQ/f;", "Ldagger/internal/h;", "", "LWQ/d;", "LX41/o;", "a", "_avito_bx-content_konveyor-item_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<Set<d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f17921a = new a(null);

    /* compiled from: KonveyorItemModule_ProvideKonveyorItemMappingsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWQ/f$a;", "", "<init>", "()V", "_avito_bx-content_konveyor-item_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f17921a.getClass();
        B0 b02 = B0.f406639b;
        t.b(b02, "Cannot return null from a non-@Nullable @Provides method");
        return b02;
    }
}
