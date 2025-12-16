package com.avito.android.lib.beduin_v2.component.slider;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.avito.component.slider.state.AvitoSliderState;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.ranges.s;

/* compiled from: SliderComponent.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/slider/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/slider/state/AvitoSliderState;", "Lcom/avito/android/lib/beduin_v2/component/slider/d;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_slider"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<AvitoSliderState, d> {

    /* compiled from: SliderComponent.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/slider/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/slider/state/AvitoSliderState;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_slider"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.slider.a$a, reason: collision with other inner class name */
    public static final class C5202a extends n<AvitoSliderState> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C5202a f175903c = new C5202a();

        public C5202a() {
            super(com.avito.beduin.v2.avito.component.slider.state.d.f335129c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, AvitoSliderState avitoSliderState) {
        d dVar = (d) view;
        AvitoSliderState avitoSliderState2 = avitoSliderState;
        dVar.setStyle((SliderStyleWrapper) D.a(avitoSliderState2.f335118g, kVar));
        dVar.setState(new e(avitoSliderState2.f335116e, s.m(avitoSliderState2.f335113b, avitoSliderState2.f335114c), avitoSliderState2.f335112a, avitoSliderState2.f335115d));
        l<Integer, G0> lVar = avitoSliderState2.f335117f;
        dVar.setOnValueChange(lVar != null ? new b(lVar) : null);
        M.a(dVar, avitoSliderState2.f335119h);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new d(viewGroup.getContext());
    }
}
