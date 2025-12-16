package com.avito.android.lib.beduin_v2.component.webview;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.deep_linking.x;
import com.avito.android.lib.beduin_v2.component.webview.impl.b;
import com.avito.android.lib.beduin_v2.component.webview.impl.e;
import com.avito.beduin.v2.avito.component.text.state.A;
import com.avito.beduin.v2.avito.component.text.state.B;
import com.avito.beduin.v2.avito.component.text.state.F;
import com.avito.beduin.v2.avito.component.text.state.o;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: WebViewComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/text/state/o;", "Lcom/avito/android/lib/beduin_v2/component/webview/impl/e;", "a", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<o, e> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final x f175964m;

    /* compiled from: WebViewComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/text/state/o;", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.webview.a$a, reason: collision with other inner class name */
    public static final class C5208a extends n<o> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final x f175965c;

        public C5208a(@k x xVar) {
            super(A.f335310c);
            this.f175965c = xVar;
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k com.avito.beduin.v2.render.android_view.A a12) {
            return new a(this.f175965c);
        }
    }

    public a(@k x xVar) {
        super(new c());
        this.f175964m = xVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, o oVar) {
        e eVar = (e) view;
        o oVar2 = oVar;
        Boolean boolValueOf = Boolean.valueOf(oVar2.f335364b);
        B b12 = oVar2.f335365c;
        b.a aVar = b12 != null ? new b.a(b12.f335311a, b12.f335312b) : null;
        F f12 = oVar2.f335366d;
        eVar.setState(new com.avito.android.lib.beduin_v2.component.webview.impl.b(oVar2.f335363a, boolValueOf, aVar, f12 != null ? new b.C5210b(f12.f335324a) : null, oVar2.f335372j, oVar2.f335369g, oVar2.f335370h, oVar2.f335371i, Boolean.valueOf(oVar2.f335373k), oVar2.f335374l, oVar2.f335375m));
        eVar.f175989g = new b(1, this, a.class, "interceptUrl", "interceptUrl(Landroid/net/Uri;)Z", 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new e(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
