package com.avito.android.search.filter.converter.util;

import android.content.res.Resources;
import android.text.Editable;
import com.avito.android.remote.model.filters_parameter.SimpleParametersTree;
import com.avito.android.util.D5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ObjectsSummaryFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/util/n;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D5 f262997a = new D5();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f262998b;

    public n(@Y61.k Resources resources) {
        this.f262998b = new d(resources, new g());
    }

    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.k SimpleParametersTree simpleParametersTree) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Editable editableNewEditable = Editable.Factory.getInstance().newEditable((String) it.next());
            m mVar = new m(simpleParametersTree, this);
            this.f262997a.getClass();
            D5.a(editableNewEditable, mVar);
            arrayList.add(editableNewEditable.toString());
        }
        return arrayList;
    }
}
