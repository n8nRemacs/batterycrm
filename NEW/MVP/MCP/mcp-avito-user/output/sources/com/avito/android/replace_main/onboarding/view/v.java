package com.avito.android.replace_main.onboarding.view;

import Cm0.C13324a;
import Cm0.InterfaceC13325b;
import Cm0.InterfaceC13326c;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import i31.InterfaceC41220a;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: ReplaceMainOnboardingViewImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/replace_main/onboarding/view/v;", "LCm0/b;", "a", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v implements InterfaceC13325b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f254577a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f254578b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<C13324a> f254579c = p2.a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f254580d;

    /* compiled from: ReplaceMainOnboardingViewImpl.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/onboarding/view/v$a;", "", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        v a(@Y61.k InterfaceC13326c.a aVar);
    }

    /* compiled from: ReplaceMainOnboardingViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/ComposeView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ComposeView> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13326c.a f254581l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f254582m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13326c.a aVar, v vVar) {
            super(0);
            this.f254581l = aVar;
            this.f254582m = vVar;
        }

        @Override // Y41.a
        public final ComposeView invoke() {
            InterfaceC13326c.a aVar = this.f254581l;
            ComposeView composeView = new ComposeView(aVar.f2665a, null, 0, 6, null);
            composeView.setContent(new C22096n(-1417345729, new A(this.f254582m, composeView, aVar), true));
            return composeView;
        }
    }

    @i31.c
    public v(@InterfaceC41220a @Y61.k InterfaceC13326c.a aVar, @Y61.k p pVar) {
        this.f254577a = pVar;
        this.f254578b = new FrameLayout(aVar.f2665a);
        this.f254580d = C42727D.c(new b(aVar, this));
    }

    @Override // Cm0.InterfaceC13325b
    @SuppressLint({"UseKtx"})
    public final void a(@Y61.k C13324a c13324a) {
        FrameLayout frameLayout = this.f254578b;
        if (frameLayout.getChildCount() == 0) {
            frameLayout.addView((ComposeView) this.f254580d.getValue());
        }
        this.f254579c.setValue(c13324a);
    }

    @Override // Cm0.InterfaceC13325b
    @Y61.k
    /* renamed from: getView */
    public final View getF254526a() {
        return this.f254578b;
    }
}
