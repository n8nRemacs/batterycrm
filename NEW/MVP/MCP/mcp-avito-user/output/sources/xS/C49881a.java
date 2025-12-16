package xS;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.beduin.v2.avito.component.progress_bar.state.a;
import com.avito.beduin.v2.avito.component.progress_bar.state.h;
import com.avito.beduin.v2.avito.component.progress_bar.state.o;
import com.avito.beduin.v2.avito.component.progress_bar.state.u;
import com.avito.beduin.v2.avito.component.progress_bar.state.v;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import xV.C49888a;
import xV.C49890c;
import xV.d;
import xV.e;
import yV.C50177a;

/* compiled from: ProgressBarComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LxS/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/a;", "Lcom/avito/android/lib/design/progress_bar_re23/ProgressBarRe23;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_progress-bar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49881a extends AbstractC36333c<com.avito.beduin.v2.avito.component.progress_bar.state.a, ProgressBarRe23> {

    /* compiled from: ProgressBarComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LxS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_progress-bar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xS.a$a, reason: collision with other inner class name */
    public static final class C12873a extends n<com.avito.beduin.v2.avito.component.progress_bar.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C12873a f442507c = new C12873a();

        public C12873a() {
            super(h.f334830c);
        }

        @Override // com.avito.beduin.v2.render.android_view.n
        @k
        public final InterfaceC36343m b(@k A a12) {
            return new C49881a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49881a() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.progress_bar.state.a aVar) {
        ProgressBarRe23 progressBarRe23 = (ProgressBarRe23) view;
        com.avito.beduin.v2.avito.component.progress_bar.state.a aVar2 = aVar;
        M.a(progressBarRe23, aVar2.f334818c);
        progressBarRe23.setStyle((C50177a) D.a(aVar2.f334817b, kVar));
        o oVar = aVar2.f334816a;
        if (oVar instanceof v) {
            progressBarRe23.setState(new C49888a(new e(((v) oVar).f334849a)));
            return;
        }
        if (oVar instanceof u) {
            ArrayList<a.C10376a> arrayList = ((u) oVar).f334848a.f4014b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (a.C10376a c10376a : arrayList) {
                arrayList2.add(new C49890c(c10376a.f334822a, s(c10376a.f334823b)));
            }
            progressBarRe23.setState(new C49888a(new d(arrayList2)));
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new ProgressBarRe23(viewGroup.getContext(), null, 0, 0, 14, null);
    }
}
