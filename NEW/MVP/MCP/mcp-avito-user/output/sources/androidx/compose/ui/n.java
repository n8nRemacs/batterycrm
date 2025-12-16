package androidx.compose.ui;

import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.v0;

/* compiled from: ComposedModifier.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/v$c;", "it", "", "invoke", "(Landroidx/compose/ui/v$c;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<v.c, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f40540l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(v.c cVar) {
            return Boolean.valueOf(!(cVar instanceof m));
        }
    }

    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/v;", "acc", "Landroidx/compose/ui/v$c;", "element", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/ui/v$c;)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<v, v.c, v> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.A f40541l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.runtime.A a12) {
            super(2);
            this.f40541l = a12;
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [Y41.q, java.lang.Object, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final v invoke(v vVar, v.c cVar) {
            v vVar2 = vVar;
            v.c cVarB = cVar;
            if (cVarB instanceof m) {
                ?? r52 = ((m) cVarB).f40527c;
                v0.e(3, r52);
                v.a aVar = v.f42878y1;
                androidx.compose.runtime.A a12 = this.f40541l;
                cVarB = n.b(a12, (v) r52.invoke(aVar, a12, 0));
            }
            return vVar2.d0(cVarB);
        }
    }

    @Y61.k
    public static final v a(@Y61.k v vVar, @Y61.k Y41.l<? super C22547y1, G0> lVar, @Y61.k Y41.q<? super v, ? super androidx.compose.runtime.A, ? super Integer, ? extends v> qVar) {
        return vVar.d0(new m(lVar, qVar));
    }

    public static final v b(androidx.compose.runtime.A a12, v vVar) {
        if (vVar.I(a.f40540l)) {
            return vVar;
        }
        a12.I(1219399079);
        v vVar2 = (v) vVar.C(v.f42878y1, new b(a12));
        a12.O();
        return vVar2;
    }

    @X41.i
    @Y61.k
    public static final v c(@Y61.k androidx.compose.runtime.A a12, @Y61.k v vVar) {
        a12.C(439770924);
        v vVarB = b(a12, vVar);
        a12.h();
        return vVarB;
    }
}
