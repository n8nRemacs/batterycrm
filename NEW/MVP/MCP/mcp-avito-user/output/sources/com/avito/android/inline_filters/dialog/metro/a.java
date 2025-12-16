package com.avito.android.inline_filters.dialog.metro;

import Y41.l;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MetroSelectDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "selectedMetros", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements l<List<? extends ParcelableEntity<String>>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MetroSelectDialogFragment f171857l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MetroSelectDialogFragment metroSelectDialogFragment) {
        super(1);
        this.f171857l = metroSelectDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(List<? extends ParcelableEntity<String>> list) {
        List<? extends ParcelableEntity<String>> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((ParcelableEntity) it.next()).getId());
        }
        InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue = new InlineFilterValue.InlineFilterMultiSelectValue(arrayList);
        d dVar = this.f171857l.f171852i0;
        if (dVar != null) {
            dVar.b(inlineFilterMultiSelectValue);
        }
        return G0.f406611a;
    }
}
