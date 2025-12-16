package com.avito.android.seller_coach.hints_dialog.view;

import Gq0.C13908a;
import Y61.k;
import androidx.fragment.app.Fragment;
import com.avito.android.seller_coach.hints_dialog.view.h;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HintItemsDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/view/i;", "Lcom/avito/android/seller_coach/hints_dialog/view/h$b;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.seller_coach.hints_dialog.provider.b f267589a;

    @Inject
    public i(@k com.avito.android.seller_coach.hints_dialog.provider.b bVar) {
        this.f267589a = bVar;
    }

    @Override // com.avito.android.seller_coach.hints_dialog.view.h.b
    @k
    public final c a(@k C13908a c13908a, @k Fragment fragment, @k h.c cVar) {
        return new c(fragment, c13908a, cVar, this.f267589a);
    }
}
