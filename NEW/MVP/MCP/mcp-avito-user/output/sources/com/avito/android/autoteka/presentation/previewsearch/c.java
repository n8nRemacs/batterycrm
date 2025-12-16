package com.avito.android.autoteka.presentation.previewsearch;

import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutotekaPreviewSearchActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutotekaPreviewSearchActivity f97557l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AutotekaPreviewSearchActivity autotekaPreviewSearchActivity) {
        super(0);
        this.f97557l = autotekaPreviewSearchActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.autoteka.items.payment.h hVar = AutotekaPreviewSearchActivity.f97529x;
        this.f97557l.a2().accept(AutotekaPreviewSearchAction.ShowKeyboardIfNeed.f97617b);
        return G0.f406611a;
    }
}
