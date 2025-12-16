package com.avito.android.mortgage.landing.dialog;

import Y61.l;
import android.view.View;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.mortgage.landing.list.items.programs.program.ProgramItem;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageProgramsInfoDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/dialog/c;", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.lib.design.tab_group.layout.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f199626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f199627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabGroup f199628c;

    public c(f fVar, View view, TabGroup tabGroup) {
        this.f199626a = fVar;
        this.f199627b = view;
        this.f199628c = tabGroup;
    }

    @Override // com.avito.android.lib.design.tab_group.layout.b
    public final void a(@l d.c cVar) {
        String str;
        int selectedTabPosition = cVar != null ? cVar.f180792b : this.f199628c.getSelectedTabPosition();
        f fVar = this.f199626a;
        ProgramItem programItem = (ProgramItem) C42745f0.K(selectedTabPosition, fVar.f199631H);
        if (programItem != null && !L.f(fVar.f199635L, programItem)) {
            fVar.f199635L = programItem;
            f.V(this.f199627b, programItem);
        }
        ProgramItem programItem2 = fVar.f199635L;
        if (programItem2 == null || (str = programItem2.f199931l) == null) {
            return;
        }
        fVar.f199632I.invoke(str);
    }
}
