package com.avito.android.tariff_lf_constructor.configure.checkbox_selector;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilterCheckboxesInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/j;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/e;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299531a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public List<String> f299532b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f299533c;

    @Inject
    public j(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f299531a = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e
    public final void a(@Y61.k ArrayList arrayList, @Y61.k String str, @Y61.k Y41.a aVar) {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f299533c;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        if (str.length() == 0) {
            this.f299532b = null;
            aVar.invoke();
        } else {
            G g12 = new G(new f(arrayList, this, str));
            InterfaceC35745a5 interfaceC35745a5 = this.f299531a;
            this.f299533c = (io.reactivex.rxjava3.internal.observers.m) g12.z(interfaceC35745a5.c()).s(interfaceC35745a5.e()).x(new g(this, aVar), h.f299529b);
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e
    @Y61.k
    public final List b(@Y61.k ArrayList arrayList) {
        List<String> list = this.f299532b;
        if (list == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (list.contains(((com.avito.conveyor_item.a) obj).getF298268b())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
