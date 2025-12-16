package com.avito.android.calendar_select.presentation.view.konveyor.items.empty;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: EmptyItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/empty/c;", "LTV0/b;", "Lcom/avito/android/calendar_select/presentation/view/konveyor/items/empty/e;", "Lcom/avito/android/calendar_select/presentation/view/konveyor/items/empty/a;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements TV0.b<e, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f113530a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f113531b = new g.a<>(R.layout.calendar_select_day_item, b.f113529l);

    public c(@k d dVar) {
        this.f113530a = dVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<e, a> a() {
        return this.f113530a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f113531b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof a;
    }
}
