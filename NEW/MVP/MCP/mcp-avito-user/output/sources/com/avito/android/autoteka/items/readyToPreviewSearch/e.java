package com.avito.android.autoteka.items.readyToPreviewSearch;

import Y41.l;
import Y61.k;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReadyToPreviewSearchPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/readyToPreviewSearch/e;", "Lcom/avito/android/autoteka/items/readyToPreviewSearch/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<AutotekaPreviewSearchAction, G0> f96958b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super AutotekaPreviewSearchAction, G0> lVar) {
        this.f96958b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((g) eVar).ix(new d(this));
    }
}
