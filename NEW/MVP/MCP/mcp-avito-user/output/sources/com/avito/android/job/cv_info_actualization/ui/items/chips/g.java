package com.avito.android.job.cv_info_actualization.ui.items.chips;

import TP.a;
import Y41.l;
import Y61.k;
import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationChipsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/chips/g;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f174252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f174253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<a.AbstractC1070a, G0> f174254c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(h hVar, d dVar, l<? super a.AbstractC1070a, G0> lVar) {
        this.f174252a = hVar;
        this.f174253b = dVar;
        this.f174254c = lVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k com.avito.android.lib.design.chips.h hVar) {
        d dVar = this.f174253b;
        a aVarB80 = h.B80(this.f174252a, hVar, dVar.f174246e);
        if (aVarB80 != null) {
            this.f174254c.invoke(new a.AbstractC1070a.b(dVar.f174243b, aVarB80.f174236b, false));
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k com.avito.android.lib.design.chips.h hVar) {
        d dVar = this.f174253b;
        a aVarB80 = h.B80(this.f174252a, hVar, dVar.f174246e);
        if (aVarB80 != null) {
            this.f174254c.invoke(new a.AbstractC1070a.b(dVar.f174243b, aVarB80.f174236b, true));
        }
    }
}
