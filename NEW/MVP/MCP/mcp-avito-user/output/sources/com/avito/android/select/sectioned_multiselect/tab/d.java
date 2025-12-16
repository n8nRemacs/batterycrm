package com.avito.android.select.sectioned_multiselect.tab;

import Yp0.AbstractC18314a;
import Zp0.InterfaceC19587b;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.select.sectioned_multiselect.core.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectTabPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZp0/e;", "result", "Lkotlin/G0;", "accept", "(LZp0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f266705b;

    public d(n nVar) {
        this.f266705b = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Zp0.e eVar = (Zp0.e) obj;
        n nVar = this.f266705b;
        nVar.getClass();
        InterfaceC19587b interfaceC19587b = eVar.f20508b;
        P p12 = nVar.f266785f;
        p12.T4(interfaceC19587b);
        List<ParcelableEntity<String>> list = eVar.f20507a;
        ArrayList arrayList = new ArrayList();
        for (T t12 : list) {
            if (t12 instanceof SelectParameter.Value) {
                arrayList.add(t12);
            }
        }
        ArrayList arrayListB = nVar.f266786g.b(arrayList);
        p12.G6(arrayListB);
        p12.s5(arrayListB);
        ArrayList arrayListC = nVar.c();
        if (p12.getF266527T() != null) {
            arrayListC.add(AbstractC18314a.b.f19694b);
        }
        t tVar = nVar.f266791l;
        if (tVar != null) {
            tVar.a(arrayListC);
        }
    }
}
