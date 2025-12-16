package com.avito.android.rating_form.select_item.adapter.loading_error;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoadingErrorItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/loading_error/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/select_item/adapter/loading_error/k;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f248964b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f248965c;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rating_form_select_item_loading_error_retry_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f248964b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.rating_form.select_item.adapter.loading_error.k
    @Y61.k
    public final z<G0> A() {
        return C37722i.a(this.f248964b);
    }

    @Override // com.avito.android.rating_form.select_item.adapter.loading_error.k
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f248965c = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f248965c;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
