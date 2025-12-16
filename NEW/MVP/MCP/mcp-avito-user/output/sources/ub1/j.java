package ub1;

import kotlin.G0;
import kotlin.Q;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.core.tasks.f;
import ru.rustore.sdk.reactive.single.AbstractC47905a;

/* loaded from: classes9.dex */
public final class j {

    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ru.rustore.sdk.core.tasks.f<T>.b f440157l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ru.rustore.sdk.core.tasks.f<T>.b bVar) {
            super(1);
            this.f440157l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f440157l.a(th2);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends N implements Y41.l<T, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ru.rustore.sdk.core.tasks.f<T>.b f440158l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ru.rustore.sdk.core.tasks.f<T>.b bVar) {
            super(1);
            this.f440158l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            this.f440158l.b(obj);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ru.rustore.sdk.core.tasks.f<T> a(AbstractC47905a<T> abstractC47905a) {
        ru.rustore.sdk.core.tasks.f.f436778d.getClass();
        Q qA2 = f.a.a();
        ru.rustore.sdk.core.tasks.f<T> fVar = (ru.rustore.sdk.core.tasks.f) qA2.f406619b;
        f.b bVar = (f.b) qA2.f406620c;
        fVar.a(new i(ru.rustore.sdk.reactive.single.E.a(abstractC47905a, new a(bVar), new b(bVar))), null);
        return fVar;
    }
}
