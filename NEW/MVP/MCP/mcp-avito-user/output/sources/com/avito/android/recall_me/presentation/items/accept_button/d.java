package com.avito.android.recall_me.presentation.items.accept_button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import zi0.InterfaceC50571a;

/* compiled from: RecallMeAcceptButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/accept_button/d;", "LTV0/d;", "Lcom/avito/android/recall_me/presentation/items/accept_button/f;", "Lcom/avito/android/recall_me/presentation/items/accept_button/RecallMeAcceptButtonItem;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.d<f, RecallMeAcceptButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<InterfaceC50571a> f251939b;

    @Inject
    public d(@k com.jakewharton.rxrelay3.c<InterfaceC50571a> cVar) {
        this.f251939b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).Y0(((RecallMeAcceptButtonItem) aVar).f251933c, new c(this));
    }
}
