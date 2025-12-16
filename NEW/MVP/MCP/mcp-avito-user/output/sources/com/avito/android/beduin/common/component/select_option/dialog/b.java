package com.avito.android.beduin.common.component.select_option.dialog;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: OptionItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/dialog/b;", "LTV0/b;", "Lcom/avito/android/beduin/common/component/select_option/dialog/f;", "Lcom/avito/android/beduin/common/component/select_option/dialog/OptionItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<f, OptionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f102481a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f102482b = new g.a<>(R.layout.select_option_item, a.f102480l);

    public b(@k e eVar) {
        this.f102481a = eVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, OptionItem> a() {
        return this.f102481a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f102482b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof OptionItem;
    }
}
