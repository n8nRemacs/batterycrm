package com.avito.android.guests_selector;

import com.avito.android.guests_selector.GuestsSelectorDialogFragment;
import gI.InterfaceC40585a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GuestsSelectorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "data", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class p extends N implements Y41.l<com.avito.android.lib.design.picker.k<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f161584l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar) {
        super(1);
        this.f161584l = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar) {
        Y41.l<InterfaceC40585a, G0> lVar = this.f161584l.f161576b;
        T t12 = kVar.f180046a;
        ((GuestsSelectorDialogFragment.b) lVar).invoke(new InterfaceC40585a.d(t12 instanceof String ? (String) t12 : null));
        return G0.f406611a;
    }
}
