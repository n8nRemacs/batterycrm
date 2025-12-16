package com.avito.android.delivery_location_suggest;

import com.avito.android.geo_common.model.AddressSuggestionV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import tF.AbstractC48544a;
import uF.d;

/* compiled from: DeliveryLocationSuggestInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LtF/a;", "it", "LuF/d;", "apply", "(LtF/a;)LuF/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final o<T, R> f135210b = new o<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC48544a abstractC48544a = (AbstractC48544a) obj;
        if (abstractC48544a instanceof AbstractC48544a.C12665a) {
            AbstractC48544a.C12665a c12665a = (AbstractC48544a.C12665a) abstractC48544a;
            return new d.a(c12665a.f439204a, c12665a.f439205b);
        }
        if (abstractC48544a instanceof AbstractC48544a.b) {
            return new d.b(((AbstractC48544a.b) abstractC48544a).f439206a);
        }
        if (!(abstractC48544a instanceof AbstractC48544a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        List<AddressSuggestionV2> listA = ((AbstractC48544a.c) abstractC48544a).a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((AddressSuggestionV2) it.next()).d());
        }
        return new d.c(arrayList);
    }
}
