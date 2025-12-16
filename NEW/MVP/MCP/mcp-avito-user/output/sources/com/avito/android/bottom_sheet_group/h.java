package com.avito.android.bottom_sheet_group;

import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupDialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f107339b;

    public h(j jVar) {
        this.f107339b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        j jVar = this.f107339b;
        BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper = jVar.f107392g;
        Iterator<T> it = bottomSheetGroupParameterWrapper.f107183a.getParameters().iterator();
        while (it.hasNext()) {
            ((MultiselectParameter) it.next()).setValue(null);
        }
        bottomSheetGroupParameterWrapper.f107186d.clear();
        jVar.d();
        jVar.c();
    }
}
