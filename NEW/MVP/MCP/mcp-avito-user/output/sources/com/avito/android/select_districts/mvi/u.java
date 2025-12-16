package com.avito.android.select_districts.mvi;

import com.avito.android.R;
import com.avito.android.select_districts.mvi.entity.SelectDistrictsInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import pq0.c;

/* compiled from: SelectDistrictsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/u;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lpq0/c;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements com.avito.android.arch.mvi.u<SelectDistrictsInternalAction, pq0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.g f267093b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.d f267094c;

    @Inject
    public u(@Y61.k com.avito.android.select_districts.domain.g gVar, @Y61.k com.avito.android.select_districts.domain.d dVar) {
        this.f267093b = gVar;
        this.f267094c = dVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final pq0.c a(SelectDistrictsInternalAction selectDistrictsInternalAction, pq0.c cVar) {
        SelectDistrictsInternalAction selectDistrictsInternalAction2 = selectDistrictsInternalAction;
        pq0.c cVar2 = cVar;
        boolean z12 = selectDistrictsInternalAction2 instanceof SelectDistrictsInternalAction.Content;
        com.avito.android.select_districts.domain.d dVar = this.f267094c;
        if (z12) {
            SelectDistrictsInternalAction.Content content = (SelectDistrictsInternalAction.Content) selectDistrictsInternalAction2;
            boolean z13 = !dVar.getF266923c().isEmpty();
            int size = dVar.getF266923c().size();
            return new c.a(content.f267030b, content.f267031c, z13, (this.f267093b.f266927a && size == 0) ? com.avito.android.printable_text.b.c(R.string.select_districts_edit_main_button, new Serializable[0]) : size == 0 ? null : com.avito.android.printable_text.b.b(R.plurals.select_districts_main_button_plurals, size, Integer.valueOf(size)), content.f267032d);
        }
        if (selectDistrictsInternalAction2 instanceof SelectDistrictsInternalAction.Error) {
            return c.b.f428813b;
        }
        if (selectDistrictsInternalAction2 instanceof SelectDistrictsInternalAction.Loading) {
            return c.C12294c.f428814b;
        }
        if (selectDistrictsInternalAction2.equals(SelectDistrictsInternalAction.ShowEmptySearchStub.f267035b)) {
            return new c.d(!dVar.getF266923c().isEmpty());
        }
        if (selectDistrictsInternalAction2 instanceof SelectDistrictsInternalAction.SendResultAndCloseScreen) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
