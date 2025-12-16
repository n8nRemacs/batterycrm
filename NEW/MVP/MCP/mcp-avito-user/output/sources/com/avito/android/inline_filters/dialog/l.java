package com.avito.android.inline_filters.dialog;

import com.avito.android.guests_selector.io.GuestsSelectorChildOutput;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterDialogOpener.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/guests_selector/io/GuestsSelectorOutput;", "outputParams", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/guests_selector/io/GuestsSelectorOutput;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.l<GuestsSelectorOutput, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f171662l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f171663m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter) {
        super(1);
        this.f171662l = (N) pVar;
        this.f171663m = filter;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(GuestsSelectorOutput guestsSelectorOutput) {
        GuestsSelectorOutput guestsSelectorOutput2 = guestsSelectorOutput;
        List<GuestsSelectorChildOutput> list = guestsSelectorOutput2.f161449c;
        int size = list.size();
        int i12 = guestsSelectorOutput2.f161448b;
        Integer numValueOf = Integer.valueOf(size + i12);
        Integer numValueOf2 = Integer.valueOf(i12);
        List<GuestsSelectorChildOutput> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((GuestsSelectorChildOutput) it.next()).f161446b);
        }
        this.f171662l.invoke(this.f171663m, new InlineFilterValue.InlineFilterGuestsSelectValue(1, numValueOf, numValueOf2, arrayList));
        return G0.f406611a;
    }
}
