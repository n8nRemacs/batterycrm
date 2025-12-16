package com.avito.android.mortgage.landing.list.items.programs.program;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProgramPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/program/e;", "LTV0/d;", "Lcom/avito/android/mortgage/landing/list/items/programs/program/g;", "Lcom/avito/android/mortgage/landing/list/items/programs/program/ProgramItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.d<g, ProgramItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f199942b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super String, G0> lVar) {
        this.f199942b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ProgramItem programItem = (ProgramItem) aVar;
        gVar.setTitle(programItem.f199922c);
        gVar.f(programItem.f199923d);
        gVar.vs(programItem.f199924e);
        gVar.setChecked(programItem.f199932m);
        gVar.I(programItem.f199933n);
        gVar.fd(new c(this, programItem));
        String str = programItem.f199926g;
        gVar.gX(str);
        if ((str == null || str.length() == 0) && programItem.f199927h) {
            gVar.uB();
        }
        gVar.HM(new d(this, programItem));
    }
}
