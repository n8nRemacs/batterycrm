package vS;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.lib.design.page_indicator_re23.state.PageIndicatorState;
import com.avito.android.util.D6;
import com.avito.beduin.v2.avito.component.page_indicator.state.f;
import com.avito.beduin.v2.avito.component.page_indicator.state.l;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;
import sV.C48111b;

/* compiled from: PageIndicatorComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LvS/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/page_indicator/state/f;", "Lcom/avito/android/lib/design/page_indicator_re23/PageIndicatorRe23;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_page-indicator"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49259a extends AbstractC36333c<f, PageIndicatorRe23> {

    /* compiled from: PageIndicatorComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LvS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/page_indicator/state/f;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_page-indicator"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vS.a$a, reason: collision with other inner class name */
    public static final class C12777a extends n<f> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C12777a f440787c = new C12777a();

        public C12777a() {
            super(l.f334796c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new C49259a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49259a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, f fVar) {
        PageIndicatorRe23 pageIndicatorRe23 = (PageIndicatorRe23) view;
        f fVar2 = fVar;
        pageIndicatorRe23.setStyle((C48111b) D.a(fVar2.f334786d, kVar));
        pageIndicatorRe23.setState(new PageIndicatorState(fVar2.f334783a, fVar2.f334784b, fVar2.f334785c));
        D6.G(pageIndicatorRe23, fVar2.f334787e);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new PageIndicatorRe23(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
