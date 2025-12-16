package com.avito.android.tariff.cpr.configure.advance.items.reviews;

import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff.cpr.configure.advance.items.reviews.x;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: CprConfigureAdvanceReviewsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0007²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/u;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/h;", "Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/w;", VoiceInfo.STATE, "", "maxCardHeight", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class u extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<w> f295313b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super x, G0> f295314c;

    public u(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.cpr_configure_advance_reviews_compose_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        w.f295315c.getClass();
        this.f295313b = p2.a(w.f295316d);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.b.f41609b);
        composeView.setContent(new C22096n(381708981, new t(this), true));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f295314c = null;
    }

    @Override // com.avito.android.tariff.cpr.configure.advance.items.reviews.h
    public final void ok(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof x.b) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((x.b) next).f295322b) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        x.b bVar = (x.b) next;
        this.f295313b.setValue(new w(arrayList, bVar != null ? Integer.valueOf(arrayList.indexOf(bVar)) : null));
        this.f295314c = lVar;
    }
}
