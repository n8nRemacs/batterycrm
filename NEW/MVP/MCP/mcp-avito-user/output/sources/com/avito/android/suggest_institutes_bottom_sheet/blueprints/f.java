package com.avito.android.suggest_institutes_bottom_sheet.blueprints;

import Y41.l;
import Y61.k;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import rA0.C47519a;

/* compiled from: SuggestInstituteItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/blueprints/f;", "LTV0/d;", "Lcom/avito/android/suggest_institutes_bottom_sheet/blueprints/h;", "LrA0/a;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.d<h, C47519a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f291990b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super Integer, G0> lVar) {
        this.f291990b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        C47519a c47519a = (C47519a) aVar;
        ListItemCheckmark listItemCheckmark = hVar.f291992b;
        listItemCheckmark.setTitle(c47519a.f429646b);
        listItemCheckmark.setChecked(c47519a.f429647c);
        listItemCheckmark.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(26, new e(this), hVar));
    }
}
