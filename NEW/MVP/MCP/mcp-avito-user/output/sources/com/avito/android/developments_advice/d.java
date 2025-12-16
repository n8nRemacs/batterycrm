package com.avito.android.developments_advice;

import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.util.D6;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import mw.InterfaceC44144a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f135970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f135971c;

    public /* synthetic */ d(j jVar, int i12) {
        this.f135970b = i12;
        this.f135971c = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String asSoonAsPossibleTitle;
        Object next;
        switch (this.f135970b) {
            case 0:
                j jVar = this.f135971c;
                CoordinatorLayout coordinatorLayout = jVar.f136104c;
                int i12 = 0;
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(coordinatorLayout.getContext(), 0, 2, null);
                dVar.D(R.layout.consultation_time_interval_picker, true);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar, ((CallInterval) C42745f0.E(jVar.f136119r)).getDayTitle(), true, true, 2);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
                LinearLayout linearLayout = (LinearLayout) dVar.findViewById(R.id.container);
                for (Object obj : jVar.f136119r) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    CallInterval callInterval = (CallInterval) obj;
                    ListItemCheckmark listItemCheckmark = new ListItemCheckmark(coordinatorLayout.getContext(), null);
                    if (callInterval.getAsSoonAsPossible()) {
                        asSoonAsPossibleTitle = callInterval.getAsSoonAsPossibleTitle();
                        if (asSoonAsPossibleTitle == null) {
                            asSoonAsPossibleTitle = "";
                        }
                    } else {
                        asSoonAsPossibleTitle = callInterval.getFrom() + (char) 8211 + callInterval.getTo();
                    }
                    listItemCheckmark.setTitle(asSoonAsPossibleTitle);
                    if (callInterval.f136192b) {
                        listItemCheckmark.setChecked(true);
                    }
                    listItemCheckmark.setOnClickListener(new C(jVar, i12, dVar, 4));
                    linearLayout.addView(listItemCheckmark);
                    i12 = i13;
                }
                com.avito.android.lib.util.g.a(dVar);
                return;
            default:
                j jVar2 = this.f135971c;
                String deformattedText = jVar2.f136107f.getDeformattedText();
                String deformattedText2 = jVar2.f136109h.getDeformattedText();
                String deformattedText3 = jVar2.f136111j.getDeformattedText();
                Iterator<T> it = jVar2.f136119r.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((CallInterval) next).f136192b) {
                        }
                    } else {
                        next = null;
                    }
                }
                jVar2.f136102a.a2().accept(new InterfaceC44144a.e(new t(deformattedText, deformattedText2, deformattedText3, (CallInterval) next, D6.y(jVar2.f136108g))));
                return;
        }
    }
}
