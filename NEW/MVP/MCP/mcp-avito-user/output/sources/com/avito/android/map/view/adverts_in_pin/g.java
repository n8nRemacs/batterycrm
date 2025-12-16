package com.avito.android.map.view.adverts_in_pin;

import android.content.Context;
import android.view.View;
import com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertsInPinView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/skeleton/ScrollUnpredictiveGridLayoutManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements Y41.a<ScrollUnpredictiveGridLayoutManager> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f185410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(0);
        this.f185410l = fVar;
    }

    @Override // Y41.a
    public final ScrollUnpredictiveGridLayoutManager invoke() {
        f fVar = this.f185410l;
        View view = fVar.f185393j;
        if (view == null) {
            view = null;
        }
        Context context = view.getContext();
        fVar.f185388e.getClass();
        return new ScrollUnpredictiveGridLayoutManager(context, 1);
    }
}
