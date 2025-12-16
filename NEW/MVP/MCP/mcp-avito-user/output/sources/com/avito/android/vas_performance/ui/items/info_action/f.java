package com.avito.android.vas_performance.ui.items.info_action;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.o;

/* compiled from: InfoActionItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/info_action/f;", "Lcom/avito/android/vas_performance/ui/items/info_action/d;", "Lcom/avito/android/deep_linking/K;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d, K {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<com.avito.android.vas_performance.ui.items.info_action.a> f321702b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f321703c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final B0 f321704d;

    /* compiled from: InfoActionItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/info_action/a;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Lcom/avito/android/vas_performance/ui/items/info_action/a;)Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f321705b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((com.avito.android.vas_performance.ui.items.info_action.a) obj).f321695d;
        }
    }

    @Inject
    public f() {
        io.reactivex.rxjava3.subjects.e<com.avito.android.vas_performance.ui.items.info_action.a> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f321702b = eVar;
        this.f321703c = eVar;
        this.f321704d = eVar.d0(a.f321705b);
    }

    @Override // com.avito.android.vas_performance.ui.items.info_action.d
    @k
    /* renamed from: H0, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF321703c() {
        return this.f321703c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        com.avito.android.vas_performance.ui.items.info_action.a aVar2 = (com.avito.android.vas_performance.ui.items.info_action.a) aVar;
        hVar.setTitle(aVar2.f321694c);
        hVar.c(new e(this, aVar2));
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f321704d;
    }
}
