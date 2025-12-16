package com.avito.android.advert.icebreakerseditor;

import b4.C25408d;
import com.avito.android.remote.model.IceBreaker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IcebreakerUiModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.icebreakerseditor.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27798a {
    @Y61.k
    public static final ArrayList a(@Y61.k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C25408d.c(r1.getId(), ((IceBreaker) it.next()).getMessageText()));
        }
        return arrayList;
    }
}
