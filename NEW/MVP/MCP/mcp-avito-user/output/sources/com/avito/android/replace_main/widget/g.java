package com.avito.android.replace_main.widget;

import Em0.InterfaceC13505a;
import Em0.InterfaceC13506b;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.replace_main.onboarding.widget.ReplaceMainItem;
import i31.InterfaceC41220a;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: ReplaceMainWidgetViewImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/replace_main/widget/g;", "LEm0/a;", "a", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements InterfaceC13505a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13506b.a f254689a;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f254692d;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<ReplaceMainItem> f254690b = p2.a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254691c = C42727D.c(new c());

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254693e = C42727D.c(new b());

    /* compiled from: ReplaceMainWidgetViewImpl.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/widget/g$a;", "", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        g a(@Y61.k InterfaceC13506b.a aVar);
    }

    /* compiled from: ReplaceMainWidgetViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/ComposeView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ComposeView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ComposeView invoke() {
            g gVar = g.this;
            ComposeView composeView = new ComposeView(gVar.f254689a.f4225a, null, 0, 6, null);
            composeView.setViewCompositionStrategy(InterfaceC22532u2.b.f41609b);
            composeView.setContent(new C22096n(1687695093, new i(gVar), true));
            return composeView;
        }
    }

    /* compiled from: ReplaceMainWidgetViewImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/n2;", "Lcom/avito/android/replace_main/onboarding/widget/ReplaceMainItem;", "invoke", "()Lkotlinx/coroutines/flow/n2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<n2<? extends ReplaceMainItem>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final n2<? extends ReplaceMainItem> invoke() {
            return C43175k.b(g.this.f254690b);
        }
    }

    @i31.c
    public g(@InterfaceC41220a @Y61.k InterfaceC13506b.a aVar) {
        this.f254689a = aVar;
        this.f254692d = new FrameLayout(aVar.f4225a);
    }

    @Override // Em0.InterfaceC13505a
    public final void a(@Y61.k ReplaceMainItem replaceMainItem) {
        this.f254690b.setValue(replaceMainItem);
        FrameLayout frameLayout = this.f254692d;
        if (frameLayout.getChildCount() == 0) {
            frameLayout.addView((ComposeView) this.f254693e.getValue());
        }
    }
}
