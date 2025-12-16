package com.avito.android.component.advert_badge_bar.title;

import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TitleItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/title/e;", "LTV0/d;", "Lcom/avito/android/component/advert_badge_bar/title/f;", "Lcom/avito/android/component/advert_badge_bar/title/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.d<f, a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.a<G0> f125015b;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        fVar.setText(((a) aVar).f125010c);
        fVar.a(new d(this));
    }

    public e(@l Y41.a<G0> aVar) {
        this.f125015b = aVar;
    }

    public /* synthetic */ e(Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar);
    }
}
