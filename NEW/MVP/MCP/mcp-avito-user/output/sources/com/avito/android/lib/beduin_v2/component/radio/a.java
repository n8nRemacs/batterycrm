package com.avito.android.lib.beduin_v2.component.radio;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: RadioComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/radio/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/radio/state/a;", "Lcom/avito/android/lib/design/toggle/RadioButton;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_radio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.radio.state.a, RadioButton> {

    /* compiled from: RadioComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/radio/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/radio/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_radio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.radio.a$a, reason: collision with other inner class name */
    public static final class C5198a extends n<com.avito.beduin.v2.avito.component.radio.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C5198a f175871c = new C5198a();

        public C5198a() {
            super(com.avito.beduin.v2.avito.component.radio.state.k.f334898c);
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
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.radio.state.a aVar) {
        RadioButton radioButton = (RadioButton) view;
        com.avito.beduin.v2.avito.component.radio.state.a aVar2 = aVar;
        radioButton.setStyle((com.avito.android.lib.design.toggle.a) D.a(aVar2.f334883f, kVar));
        radioButton.setState(new ToggleState(new b(aVar2), aVar2.f334879b, aVar2.f334880c, !(aVar2.f334881d == null && aVar2.f334882e == null) && aVar2.f334879b, aVar2.f334878a ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b));
        M.a(radioButton, aVar2.f334884g);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new RadioButton(viewGroup.getContext(), null);
    }
}
