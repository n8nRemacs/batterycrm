package coil;

import android.content.Context;
import coil.f;
import coil.memory.MemoryCache;
import coil.request.C27245b;
import coil.util.t;
import com.avito.android.coil.d;
import kotlin.C42727D;
import kotlin.C43074z;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil/j;", "", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface j {

    /* compiled from: ImageLoader.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/j$a;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f58505a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public C27245b f58506b = coil.util.k.f58780a;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public InterfaceC42726C<? extends MemoryCache> f58507c = null;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public InterfaceC42726C<? extends coil.disk.a> f58508d = null;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public C43074z f58509e = null;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public d.a f58510f = null;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public t f58511g = new t(false, false, false, 0, null, 31, null);

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public coil.util.o f58512h = null;

        public a(@Y61.k Context context) {
            this.f58505a = context.getApplicationContext();
        }

        @Y61.k
        public final n a() {
            C27245b c27245b = this.f58506b;
            InterfaceC42726C<? extends MemoryCache> interfaceC42726CC = this.f58507c;
            if (interfaceC42726CC == null) {
                interfaceC42726CC = C42727D.c(new g(this));
            }
            InterfaceC42726C<? extends MemoryCache> interfaceC42726C = interfaceC42726CC;
            InterfaceC42726C<? extends coil.disk.a> interfaceC42726CC2 = this.f58508d;
            if (interfaceC42726CC2 == null) {
                interfaceC42726CC2 = C42727D.c(new h(this));
            }
            InterfaceC42726C<? extends coil.disk.a> interfaceC42726C2 = interfaceC42726CC2;
            InterfaceC42726C interfaceC42726CC3 = this.f58509e;
            if (interfaceC42726CC3 == null) {
                interfaceC42726CC3 = C42727D.c(i.f58415l);
            }
            InterfaceC42726C interfaceC42726C3 = interfaceC42726CC3;
            f.d dVar = this.f58510f;
            if (dVar == null) {
                dVar = f.d.f58373K1;
            }
            e eVar = new e();
            t tVar = this.f58511g;
            coil.util.o oVar = this.f58512h;
            return new n(this.f58505a, c27245b, interfaceC42726C, interfaceC42726C2, interfaceC42726C3, dVar, eVar, tVar, oVar);
        }
    }

    @Y61.k
    /* renamed from: a */
    C27245b getF58541b();

    @Y61.k
    coil.request.d b(@Y61.k coil.request.p pVar);

    @Y61.l
    Object c(@Y61.k coil.request.p pVar, @Y61.k SuspendLambda suspendLambda);
}
