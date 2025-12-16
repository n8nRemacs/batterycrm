package com.avito.android.beduin.common.container.checkbox_group;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.D6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupContainer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/i;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/container/checkbox_group/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<i, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f102972l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.f102972l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(i iVar) {
        i iVar2 = iVar;
        a aVar = this.f102972l;
        iVar2.setTag(aVar.f102968f.getF100853b());
        iVar2.removeAllViews();
        BeduinCheckboxGroupModel beduinCheckboxGroupModel = aVar.f102968f;
        for (BeduinCheckboxGroupOption beduinCheckboxGroupOption : beduinCheckboxGroupModel.getOptions()) {
            String id2 = beduinCheckboxGroupOption.getId();
            int iGenerateViewId = View.generateViewId();
            g gVar = new g(iVar2.getContext(), null, 0, 6, null);
            gVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            gVar.setTag(id2);
            gVar.setId(iGenerateViewId);
            D6.f(gVar, aVar.f395324b, 0, aVar.f395325c, 0, 10);
            List<BeduinModel> contents = beduinCheckboxGroupOption.getContents();
            ArrayList arrayList = new ArrayList(C42745f0.q(contents, 10));
            Iterator<T> it = contents.iterator();
            while (it.hasNext()) {
                AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aU = aVar.u((BeduinModel) it.next());
                InterfaceC40116e interfaceC40116eI = abstractC40112aU.i(iVar2, new ViewGroup.MarginLayoutParams(-1, -2));
                if (interfaceC40116eI.getF103243b().getId() == -1) {
                    interfaceC40116eI.getF103243b().setId(View.generateViewId());
                }
                abstractC40112aU.m(interfaceC40116eI);
                arrayList.add(interfaceC40116eI.getF103243b());
            }
            LinearLayoutCompat linearLayoutCompat = gVar.f102981c;
            linearLayoutCompat.removeAllViews();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linearLayoutCompat.addView((View) it2.next());
            }
            List<String> selectedIds = beduinCheckboxGroupModel.getSelectedIds();
            boolean z12 = false;
            if (selectedIds != null && selectedIds.contains(beduinCheckboxGroupOption.getId())) {
                z12 = true;
            }
            gVar.setChecked(z12);
            gVar.setOnCheckedChangeListener(new j(iVar2));
            iVar2.addView(gVar);
        }
        return G0.f406611a;
    }
}
