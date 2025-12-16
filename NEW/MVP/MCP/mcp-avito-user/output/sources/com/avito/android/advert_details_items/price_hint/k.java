package com.avito.android.advert_details_items.price_hint;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PriceHintView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/price_hint/k;", "Lcom/avito/android/advert_details_items/price_hint/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f85373b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public y f85374c;

    /* compiled from: PriceHintView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f85375b;

        public a(Y41.a<G0> aVar) {
            this.f85375b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f85375b.invoke();
        }
    }

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.hint_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f85373b = (ImageView) viewFindViewById;
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    public final void du(@Y61.l Y41.a<G0> aVar) {
        y yVar = this.f85374c;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f85374c = (y) C37722i.a(this.f85373b).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).t0(new a(aVar));
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        D6.w(this.f85373b);
        y yVar = this.f85374c;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.advert_details_items.price_hint.j
    public final void ox() {
        D6.G(this.f85373b, true);
    }
}
