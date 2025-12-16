package com.avito.beduin.v2.component.aspect_ratio.android_view;

import ET0.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import com.avito.beduin.v2.component.aspect_ratio.android_view.AspectRatioFrameLayout;
import com.avito.beduin.v2.component.aspect_ratio.state.AspectRatioState;
import com.avito.beduin.v2.engine.component.InterfaceC36244d;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.C;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.q;
import com.avito.beduin.v2.render.android_view.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: AspectRatioComponent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/android_view/a;", "Lcom/avito/beduin/v2/render/android_view/q;", "Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState;", "Lcom/avito/beduin/v2/component/aspect_ratio/android_view/AspectRatioFrameLayout;", "Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState$a;", "a", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends q<AspectRatioState, AspectRatioFrameLayout, AspectRatioState.a> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f335493o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A f335494m;

    /* renamed from: n, reason: collision with root package name */
    public s<AspectRatioState.a> f335495n;

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/android_view/a$a;", "Lcom/avito/beduin/v2/render/android_view/s$c;", "Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState$a;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.aspect_ratio.android_view.a$a, reason: collision with other inner class name */
    public static final class C10383a implements s.c<AspectRatioState.a> {
        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final /* bridge */ /* synthetic */ boolean c(InterfaceC36244d interfaceC36244d, InterfaceC36244d interfaceC36244d2) {
            return true;
        }

        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final ViewGroup.LayoutParams d(InterfaceC36244d interfaceC36244d, Resources resources) {
            return new FrameLayout.LayoutParams(-1, -1);
        }

        @Override // com.avito.beduin.v2.render.android_view.s.c
        public final /* bridge */ /* synthetic */ boolean h(InterfaceC36244d interfaceC36244d) {
            return true;
        }
    }

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[AspectRatioState.Axis.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AspectRatioState.Axis axis = AspectRatioState.Axis.f335527c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(@k A a12) {
        super(null, 1, null);
        this.f335494m = a12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, Object obj) {
        AspectRatioFrameLayout.Axis axis;
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) view;
        AspectRatioState aspectRatioState = (AspectRatioState) obj;
        Y41.a<G0> aVar = aspectRatioState.f335519b;
        aspectRatioFrameLayout.setOnClickListener(aVar != null ? new i(14, aVar) : null);
        aspectRatioFrameLayout.setClickable(aVar != null);
        M.a(aspectRatioFrameLayout, aspectRatioState.f335523f);
        aspectRatioFrameLayout.setBackgroundColor(s(aspectRatioState.f335518a));
        ET0.b bVar = aspectRatioState.f335521d;
        aspectRatioFrameLayout.setPadding(ET0.d.b(aspectRatioFrameLayout.getResources(), bVar != null ? bVar.f4016a : 0), ET0.d.b(aspectRatioFrameLayout.getResources(), bVar != null ? bVar.f4019d : 0), ET0.d.b(aspectRatioFrameLayout.getResources(), bVar != null ? bVar.f4017b : 0), ET0.d.b(aspectRatioFrameLayout.getResources(), bVar != null ? bVar.f4018c : 0));
        s<AspectRatioState.a> sVar = this.f335495n;
        s.a(com.avito.beduin.v2.component.aspect_ratio.android_view.b.f335496l, sVar != null ? sVar : null, kVar, C42745f0.V(aspectRatioState.f335522e));
        AspectRatioState.b bVar2 = aspectRatioState.f335520c;
        int iOrdinal = bVar2.f335535c.ordinal();
        if (iOrdinal == 0) {
            axis = AspectRatioFrameLayout.Axis.f335486b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            axis = AspectRatioFrameLayout.Axis.f335487c;
        }
        aspectRatioFrameLayout.setRatio(new AspectRatioFrameLayout.a(bVar2.f335533a, bVar2.f335534b, axis));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(viewGroup.getContext(), null, 0, 0, 14, null);
        A a12 = this.f335494m;
        if (a12.f337909e.f57087a) {
            l.a(aspectRatioFrameLayout);
        }
        this.f335495n = new s<>(a12, a12.f337907c, aspectRatioFrameLayout, new C10383a(), R.id.aspect_ratio_child_component, this);
        return aspectRatioFrameLayout;
    }

    @Override // com.avito.beduin.v2.render.android_view.q
    @k
    public final C u() {
        s<AspectRatioState.a> sVar = this.f335495n;
        if (sVar == null) {
            return null;
        }
        return sVar;
    }
}
