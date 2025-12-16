package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42924b implements z.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC42923a<Object, Object> f408451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap<C, List<Object>> f408452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f408453c;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$a */
    public final class a extends kotlin.reflect.jvm.internal.impl.load.kotlin.b.b implements z.e {
        public a(@Y61.k C c12) {
            super(c12);
        }

        @Y61.l
        public final z.a c(int i12, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b bVar2) {
            C.a aVar = C.f408430b;
            C c12 = this.f408455a;
            aVar.getClass();
            C c13 = C.a.c(c12, i12);
            C42924b c42924b = C42924b.this;
            List<Object> arrayList = c42924b.f408452b.get(c13);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c42924b.f408452b.put(c13, arrayList);
            }
            return c42924b.f408451a.t(bVar, bVar2, arrayList);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$b, reason: collision with other inner class name */
    public class C11666b implements z.c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C f408455a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList<Object> f408456b = new ArrayList<>();

        public C11666b(@Y61.k C c12) {
            this.f408455a = c12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.c
        public final void a() {
            ArrayList<Object> arrayList = this.f408456b;
            if (arrayList.isEmpty()) {
                return;
            }
            C42924b.this.f408452b.put(this.f408455a, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.c
        @Y61.l
        public final z.a b(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b bVar2) {
            return C42924b.this.f408451a.t(bVar, bVar2, this.f408456b);
        }
    }

    public C42924b(AbstractC42923a abstractC42923a, HashMap map, z zVar, HashMap map2) {
        this.f408451a = abstractC42923a;
        this.f408452b = map;
        this.f408453c = zVar;
    }

    @Y61.l
    public final a a(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k String str) {
        C.a aVar = C.f408430b;
        String strB = fVar.b();
        aVar.getClass();
        return new a(new C(strB.concat(str), null));
    }
}
