package rN;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.S;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvSimilarAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrN/c;", "LrN/b;", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rN.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47571c implements InterfaceC47570b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<AdvertItem> f429770b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f429771c;

    @Inject
    public C47571c() {
        com.jakewharton.rxrelay3.c<AdvertItem> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f429770b = cVar;
        this.f429771c = new C41981q0(cVar);
    }

    @Override // rN.InterfaceC47570b
    @k
    /* renamed from: F8, reason: from getter */
    public final C41981q0 getF429771c() {
        return this.f429771c;
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@k AdvertItem advertItem, @l Image image) {
        this.f429770b.accept(advertItem);
    }

    @Override // La.g
    public final void ic(@k String str) {
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@k DeepLink deepLink) {
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@k S s5, @l AbstractC30567a abstractC30567a) {
    }
}
