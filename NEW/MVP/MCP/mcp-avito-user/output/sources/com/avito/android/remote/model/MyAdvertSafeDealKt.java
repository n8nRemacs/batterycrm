package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: MyAdvertSafeDeal.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"switchers", "", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service$Content$Switcher;", "Lcom/avito/android/remote/model/MyAdvertSafeDeal$Service;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class MyAdvertSafeDealKt {
    @k
    public static final List<MyAdvertSafeDeal.Service.Content.Switcher> switchers(@k List<MyAdvertSafeDeal.Service> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            MyAdvertSafeDeal.Service.Content content = ((MyAdvertSafeDeal.Service) it.next()).getContent();
            MyAdvertSafeDeal.Service.Content.Switcher switcher = content instanceof MyAdvertSafeDeal.Service.Content.Switcher ? (MyAdvertSafeDeal.Service.Content.Switcher) content : null;
            if (switcher != null) {
                arrayList.add(switcher);
            }
        }
        return arrayList;
    }
}
