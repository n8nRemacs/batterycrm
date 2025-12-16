package CN;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: FiltersAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/f;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface f {

    /* compiled from: FiltersAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(@Y61.k SearchParams searchParams);

    void b(@Y61.l String str, @Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue);

    void c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    void d(@Y61.k SearchParams searchParams);

    void e(@Y61.k String str, @Y61.k String str2);

    void f(@Y61.l String str, @Y61.l ArrayList arrayList);

    void g();

    void h(@Y61.l Integer num, @Y61.l String str, @Y61.l String str2);

    void i(@Y61.k SearchParams searchParams, @Y61.k Filter filter);

    void j(@Y61.l String str);

    void k();

    void l(@Y61.k SearchParams searchParams, @Y61.k Filter filter);

    void m(@Y61.l String str);

    void n(@Y61.k SearchParams searchParams, @Y61.k Filter filter);

    void o(@Y61.l SearchParams searchParams, @Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue);
}
