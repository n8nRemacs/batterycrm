package com.avito.android.bottom_sheet_group;

import androidx.view.InterfaceC23487e;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.util.O2;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BottomSheetGroupDialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f107337b;

    public f(j jVar) {
        this.f107337b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        j jVar = this.f107337b;
        BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper = jVar.f107392g;
        bottomSheetGroupParameterWrapper.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MultiselectParameter multiselectParameter : bottomSheetGroupParameterWrapper.f107183a.getParameters()) {
            if (O2.a(multiselectParameter.getValue())) {
                linkedHashMap.put(multiselectParameter.getId(), C42745f0.P0(multiselectParameter.getValue()));
            }
        }
        BottomSheetGroupFragment bottomSheetGroupFragment = jVar.f107397l;
        if (bottomSheetGroupFragment != null) {
            InterfaceC23487e targetFragment = bottomSheetGroupFragment.getTargetFragment();
            v vVar = targetFragment instanceof v ? (v) targetFragment : null;
            if (vVar != null) {
                vVar.f(jVar.f107393h, linkedHashMap);
            }
            bottomSheetGroupFragment.dismissAllowingStateLoss();
        }
    }
}
