package com.avito.android.shift_list.ui.list.time_item;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShiftTimePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shift_list/ui/list/time_item/e;", "LTV0/d;", "Lcom/avito/android/shift_list/ui/list/time_item/c;", "Lcom/avito/android/shift_list/ui/list/time_item/ShiftTimeItem;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<c, ShiftTimeItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f281164b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super DeepLink, G0> lVar) {
        this.f281164b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((c) eVar).Tl((ShiftTimeItem) aVar, this.f281164b);
    }
}
