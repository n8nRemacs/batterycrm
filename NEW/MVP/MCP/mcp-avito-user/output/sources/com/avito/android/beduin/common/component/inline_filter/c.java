package com.avito.android.beduin.common.component.inline_filter;

import Y41.p;
import com.avito.android.beduin.common.component.inline_filter.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: BeduinInlineFilterComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class c extends H implements p<Button, Filter, G0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(Button button, Filter filter) {
        Filter.InnerOptions innerOptions;
        List<Filter.InnerOptions.Options> options;
        List<String> stringList;
        Button button2 = button;
        Filter filter2 = filter;
        a aVar = (a) this.receiver;
        a.C3041a c3041a = a.f101486k;
        aVar.getClass();
        InlineFilterValue value = filter2.getValue();
        ArrayList arrayList = (value == null || (stringList = value.toStringList()) == null) ? new ArrayList() : new ArrayList(stringList);
        List<Filter.InnerOptions> options2 = filter2.getOptions();
        Filter.InnerOptions.Options options3 = null;
        if (options2 != null && (innerOptions = (Filter.InnerOptions) C42745f0.G(options2)) != null && (options = innerOptions.getOptions()) != null) {
            Iterator<T> it = options.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((Filter.InnerOptions.Options) next).getTitle(), button2.getText())) {
                    options3 = next;
                    break;
                }
            }
            options3 = options3;
        }
        if (options3 != null) {
            if (arrayList.contains(options3.getId())) {
                arrayList.remove(options3.getId());
            } else {
                arrayList.add(options3.getId());
            }
            aVar.u(filter2, new InlineFilterValue.InlineFilterMultiSelectValue(arrayList));
        }
        return G0.f406611a;
    }
}
