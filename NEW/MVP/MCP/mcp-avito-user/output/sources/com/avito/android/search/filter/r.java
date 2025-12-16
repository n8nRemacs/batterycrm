package com.avito.android.search.filter;

import com.avito.android.guests_selector.io.GuestsSelectorChildOutput;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FiltersFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/guests_selector/io/GuestsSelectorOutput;", "output", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/guests_selector/io/GuestsSelectorOutput;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<GuestsSelectorOutput, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FiltersFragment f263796l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f263797m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(FiltersFragment filtersFragment, String str) {
        super(1);
        this.f263796l = filtersFragment;
        this.f263797m = str;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(GuestsSelectorOutput guestsSelectorOutput) {
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
        GuestsSelectParameterValue guestsSelectParameterValue = new GuestsSelectParameterValue(1, numValueOf, numValueOf2, arrayList);
        InterfaceC34566e0 interfaceC34566e0 = this.f263796l.f261843t0;
        if (interfaceC34566e0 == null) {
            interfaceC34566e0 = null;
        }
        interfaceC34566e0.t(this.f263797m, new com.google.gson.d().a().l(guestsSelectParameterValue));
        return kotlin.G0.f406611a;
    }
}
