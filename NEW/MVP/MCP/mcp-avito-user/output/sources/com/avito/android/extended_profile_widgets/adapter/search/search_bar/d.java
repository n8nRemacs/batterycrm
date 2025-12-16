package com.avito.android.extended_profile_widgets.adapter.search.search_bar;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_bar/d;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_bar/c;", "a", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<oB.k, G0> f154745b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43238h f154746c;

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_bar/d$a;", "", "<init>", "()V", "", "INPUT_DEBOUNCE_MS", "J", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@Y61.k Y41.l<? super oB.k, G0> lVar, @Y61.k R0 r02) {
        this.f154745b = lVar;
        this.f154746c = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.d()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        SearchBarItem searchBarItem = (SearchBarItem) aVar;
        C43238h c43238h = this.f154746c;
        Q0.d(c43238h.f411905b);
        kVar.w80(searchBarItem);
        C43175k.K(new C43197r1(new e(this, null), y.a(kVar.e5())), c43238h);
        C43175k.K(new C43197r1(new f(this, kVar, null), y.a(kVar.o6())), c43238h);
        C43175k.K(new C43197r1(new g(searchBarItem, this, null), y.a(kVar.PC())), c43238h);
        C43175k.K(new C43197r1(new h(this, null), C43175k.n(C43175k.r(C43175k.t(y.a(kVar.dc()), 1)), 1000L)), c43238h);
        kVar.d(new i(kVar, this));
    }
}
