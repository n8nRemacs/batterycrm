package androidx.view;

import X41.i;
import Y41.l;
import Y61.k;
import j.InterfaceC42154j;
import j.K;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;

/* compiled from: Transformations.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final class H0 {

    /* compiled from: Transformations.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f46671b;

        public a(l lVar) {
            this.f46671b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f46671b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f46671b;
        }

        public final int hashCode() {
            return this.f46671b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46671b.invoke(obj);
        }
    }

    @InterfaceC42154j
    @K
    @i
    @k
    public static final C23034e0 a(@k C23038g0 c23038g0, @k l lVar) {
        C23034e0 c23034e0 = c23038g0.isInitialized() ? new C23034e0(lVar.invoke(c23038g0.getValue())) : new C23034e0();
        c23034e0.a(c23038g0, new a(new F0(c23034e0, lVar)));
        return c23034e0;
    }
}
