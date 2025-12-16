package com.avito.android.bundles.ui.view;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.subjects.e;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: VasBundlesEmptyActionButtonPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/ui/view/b;", "Lcom/avito/android/deep_linking/K;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements K {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<DeepLink> f108451b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f108452c;

    /* compiled from: VasBundlesEmptyActionButtonPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ButtonAction f108454m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ButtonAction buttonAction) {
            super(0);
            this.f108454m = buttonAction;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.f108451b.onNext(this.f108454m.getDeeplink());
            return G0.f406611a;
        }
    }

    @Inject
    public b() {
        e<DeepLink> eVar = new e<>();
        this.f108451b = eVar;
        this.f108452c = eVar;
    }

    public final void a(@k com.avito.android.bundles.ui.view.a aVar, @l ButtonAction buttonAction) {
        a aVar2 = buttonAction != null ? new a(buttonAction) : null;
        String title = buttonAction != null ? buttonAction.getTitle() : null;
        D6.G(aVar.f108449a, true ^ (title == null || C43066x.K(title)));
        Button button = aVar.f108450b;
        com.avito.android.lib.design.button.b.a(button, title, false);
        D6.a(aVar2, button);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f108452c;
    }
}
