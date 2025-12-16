package com.avito.android.mortgage.landing.dialog;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.mortgage.landing.list.items.programs.program.ProgramItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageProgramsInfoDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f199629l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(1);
        this.f199629l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        View viewFindViewById = view2.findViewById(R.id.programs_tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_group.TabGroup");
        }
        TabGroup tabGroup = (TabGroup) viewFindViewById;
        f fVar = this.f199629l;
        tabGroup.d(new c(fVar, view2, tabGroup));
        ArrayList arrayList = fVar.f199631H;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(((ProgramItem) it.next()).f199922c), null, false, 6, null));
        }
        int i12 = fVar.f199634K;
        if (i12 < 0) {
            i12 = 0;
        }
        com.avito.android.lib.design.tab_group.c.a(tabGroup, arrayList2, Integer.valueOf(i12));
        ProgramItem programItem = fVar.f199635L;
        if (programItem != null) {
            f.V(view2, programItem);
        }
        return G0.f406611a;
    }
}
