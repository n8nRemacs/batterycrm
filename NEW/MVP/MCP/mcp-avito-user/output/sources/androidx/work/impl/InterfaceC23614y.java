package androidx.work.impl;

import androidx.work.impl.model.C23580w;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StartStopToken.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/work/impl/y;", "", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC23614y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f56085a = a.f56086a;

    /* compiled from: StartStopToken.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/y$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.y$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f56086a = new a();

        @X41.j
        @X41.n
        @Y61.k
        public static InterfaceC23614y a(boolean z12) {
            C23615z c23615z = new C23615z();
            return z12 ? new A(c23615z) : c23615z;
        }
    }

    @Y61.l
    C23613x a(@Y61.k C23580w c23580w);

    @Y61.k
    default C23613x b(@Y61.k androidx.work.impl.model.H h12) {
        return d(androidx.work.impl.model.o0.a(h12));
    }

    boolean c(@Y61.k C23580w c23580w);

    @Y61.k
    C23613x d(@Y61.k C23580w c23580w);

    @Y61.k
    List<C23613x> remove(@Y61.k String str);
}
