package aS;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.gradient.e;
import com.avito.beduin.v2.avito.component.gradient.content.b;
import com.avito.beduin.v2.avito.component.gradient.content.d;
import com.avito.beduin.v2.avito.component.gradient.content.f;
import com.avito.beduin.v2.avito.component.gradient.state.h;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GradientComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LaS/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/gradient/state/a;", "Landroid/view/View;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_gradient"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C19812a extends AbstractC36333c<com.avito.beduin.v2.avito.component.gradient.state.a, View> {

    /* compiled from: GradientComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LaS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/gradient/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_gradient"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: aS.a$a, reason: collision with other inner class name */
    public static final class C1495a extends n<com.avito.beduin.v2.avito.component.gradient.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C1495a f20900c = new C1495a();

        public C1495a() {
            super(h.f334385c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new C19812a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19812a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.gradient.state.a aVar) {
        Drawable drawable;
        b bVar = aVar.f334374a;
        if (bVar instanceof f) {
            f fVar = (f) bVar;
            new e();
            int i12 = fVar.f334368b;
            ET0.a<d> aVar2 = fVar.f334369c;
            ArrayList arrayList = aVar2.f4014b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(s(((d) it.next()).f334364a)));
            }
            int[] iArrL0 = C42745f0.L0(arrayList2);
            ArrayList arrayList3 = aVar2.f4014b;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Float.valueOf(((d) it2.next()).f334365b));
            }
            float[] fArrJ0 = C42745f0.J0(arrayList4);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShaderFactory(new com.avito.android.lib.design.gradient.d(i12, fArrJ0, iArrL0));
            paintDrawable.setShape(new RectShape());
            drawable = paintDrawable;
        } else if (bVar instanceof com.avito.beduin.v2.avito.component.gradient.content.a) {
            com.avito.beduin.v2.avito.component.gradient.content.a aVar3 = (com.avito.beduin.v2.avito.component.gradient.content.a) bVar;
            drawable = (Drawable) kVar.f338363a.b(aVar3.f334362b, aVar3.f334363c);
        } else {
            drawable = null;
        }
        view.setBackground(drawable);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    @k
    public final View n(@k ViewGroup viewGroup) {
        return new View(viewGroup.getContext());
    }
}
