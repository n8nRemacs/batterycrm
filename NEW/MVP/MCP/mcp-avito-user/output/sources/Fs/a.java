package FS;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.beduin.v2.avito.component.spinner.state.g;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: SpinnerComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LFS/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/spinner/state/a;", "LBV/a;", "<init>", "()V", "a", "_design-modules_beduin-v2_renderer_component_spinner"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36333c<com.avito.beduin.v2.avito.component.spinner.state.a, BV.a> {

    /* compiled from: SpinnerComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LFS/a$a;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/avito/component/spinner/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_spinner"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: FS.a$a, reason: collision with other inner class name */
    public static final class C0290a extends n<com.avito.beduin.v2.avito.component.spinner.state.a> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C0290a f4715c = new C0290a();

        public C0290a() {
            super(g.f335143c);
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
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, com.avito.beduin.v2.avito.component.spinner.state.a aVar) {
        BV.a aVar2 = (BV.a) view;
        com.avito.beduin.v2.avito.component.spinner.state.a aVar3 = aVar;
        M.a(aVar2, aVar3.f335134b);
        aVar2.setStyle((com.avito.android.lib.design.spinner.a) D.a(aVar3.f335133a, kVar));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new BV.a(viewGroup.getContext());
    }
}
