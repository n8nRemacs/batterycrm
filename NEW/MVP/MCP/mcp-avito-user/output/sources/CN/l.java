package CN;

import CN.i;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.suggest_locations.analytics.FromBlock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;
import tA0.C48528a;

/* compiled from: FiltersAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCN/l;", "LCN/f;", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f2120a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InlineFiltersSource f2121b;

    /* compiled from: FiltersAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LCN/l$a;", "", "<init>", "()V", "", "BIG_FILTERS_ID", "Ljava/lang/String;", "BIG_FILTERS_NAME", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FiltersAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[InlineFiltersSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InlineFiltersSource inlineFiltersSource2 = InlineFiltersSource.f170993b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InlineFiltersSource inlineFiltersSource) {
        this.f2120a = interfaceC28373a;
        this.f2121b = inlineFiltersSource;
    }

    public static List p(Filter filter, InlineFilterValue inlineFilterValue) {
        Filter.InnerOptions.Options options;
        String title;
        Object next;
        Filter.InnerOptions.Options options2;
        String title2;
        Object next2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (inlineFilterValue instanceof InlineFilterValue.InlineFilterSelectValue) {
            List<Filter.InnerOptions> options3 = filter.getOptions();
            if (options3 != null) {
                Iterator<T> it = options3.iterator();
                while (it.hasNext()) {
                    List<Filter.InnerOptions.Options> options4 = ((Filter.InnerOptions) it.next()).getOptions();
                    if (options4 != null) {
                        Iterator<T> it2 = options4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            if (L.f(((Filter.InnerOptions.Options) next2).getId(), ((InlineFilterValue.InlineFilterSelectValue) inlineFilterValue).getSelectedOption())) {
                                break;
                            }
                        }
                        options2 = (Filter.InnerOptions.Options) next2;
                    } else {
                        options2 = null;
                    }
                    if (options2 != null && (title2 = options2.getTitle()) != null) {
                        linkedHashSet.add(title2);
                    }
                }
            }
        } else if (inlineFilterValue instanceof InlineFilterValue.InlineFilterSelectIntValue) {
            linkedHashSet.add(String.valueOf(((InlineFilterValue.InlineFilterSelectIntValue) inlineFilterValue).getSelectedOption()));
        } else if (inlineFilterValue instanceof InlineFilterValue.InlineFilterBooleanValue) {
            linkedHashSet.add(String.valueOf(((InlineFilterValue.InlineFilterBooleanValue) inlineFilterValue).getValue()));
        } else if (inlineFilterValue instanceof InlineFilterValue.InlineFilterMultiSelectValue) {
            List<String> selectedOptions = ((InlineFilterValue.InlineFilterMultiSelectValue) inlineFilterValue).getSelectedOptions();
            if (selectedOptions != null) {
                for (String str : selectedOptions) {
                    List<Filter.InnerOptions> options5 = filter.getOptions();
                    if (options5 != null) {
                        Iterator<T> it3 = options5.iterator();
                        while (it3.hasNext()) {
                            List<Filter.InnerOptions.Options> options6 = ((Filter.InnerOptions) it3.next()).getOptions();
                            if (options6 != null) {
                                Iterator<T> it4 = options6.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it4.next();
                                    if (L.f(((Filter.InnerOptions.Options) next).getId(), str)) {
                                        break;
                                    }
                                }
                                options = (Filter.InnerOptions.Options) next;
                            } else {
                                options = null;
                            }
                            if (options != null && (title = options.getTitle()) != null) {
                                linkedHashSet.add(title);
                            }
                        }
                    }
                }
            }
        } else if (inlineFilterValue instanceof InlineFilterValue.InlineFilterNumericRangeValue) {
            InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = (InlineFilterValue.InlineFilterNumericRangeValue) inlineFilterValue;
            if (inlineFilterNumericRangeValue.getFrom() == null && inlineFilterNumericRangeValue.getTo() == null) {
                linkedHashSet.add("null, null");
            } else {
                linkedHashSet.add(String.valueOf(inlineFilterNumericRangeValue.getFrom()));
                linkedHashSet.add(String.valueOf(inlineFilterNumericRangeValue.getTo()));
            }
        } else if ((inlineFilterValue instanceof InlineFilterValue.InlineFilterDateRangeValue) || (inlineFilterValue instanceof InlineFilterValue.InlineRadiusValue)) {
            linkedHashSet.addAll(inlineFilterValue.toStringList());
        }
        return C42745f0.M0(linkedHashSet);
    }

    @Override // CN.f
    public final void a(@Y61.k SearchParams searchParams) {
        String categoryId = searchParams.getCategoryId();
        if (categoryId == null) {
            return;
        }
        this.f2120a.c(new i.a(categoryId, "Фильтры", "filtersButton", searchParams));
    }

    @Override // CN.f
    public final void b(@Y61.l String str, @Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue) {
        this.f2120a.c(new r(str, null, p(filter, inlineFilterValue), 2, null));
    }

    @Override // CN.f
    public final void c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f2120a.c(new c(str, str2, str3));
    }

    @Override // CN.f
    public final void d(@Y61.k SearchParams searchParams) {
        String categoryId = searchParams.getCategoryId();
        if (categoryId == null) {
            return;
        }
        this.f2120a.c(new i.b(categoryId, "Фильтры", "filtersButton", searchParams));
    }

    @Override // CN.f
    public final void e(@Y61.k String str, @Y61.k String str2) {
        this.f2120a.c(new d(str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // CN.f
    public final void f(@Y61.l String str, @Y61.l ArrayList arrayList) {
        InlineFilterValue inlineFilterValue;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Q q12 = (Q) it.next();
                String str2 = (String) q12.f406619b;
                if (str2 != null && (inlineFilterValue = (InlineFilterValue) q12.f406620c) != null) {
                    StringBuilder sbB = C22491k0.b(str2, '=');
                    sbB.append(inlineFilterValue.toStringList());
                    arrayList2.add(sbB.toString());
                }
            }
        }
        this.f2120a.c(new g(str, null, arrayList2, 2, null));
    }

    @Override // CN.f
    public final void g() {
        this.f2120a.c(new CN.a());
    }

    @Override // CN.f
    public final void h(@Y61.l Integer num, @Y61.l String str, @Y61.l String str2) {
        this.f2120a.c(new C48528a(str, str2, "", FromBlock.f292253c, num, null, null, null));
    }

    @Override // CN.f
    public final void i(@Y61.k SearchParams searchParams, @Y61.k Filter filter) {
        String id2;
        String title;
        String categoryId = searchParams.getCategoryId();
        if (categoryId == null || (id2 = filter.getId()) == null || (title = filter.getTitle()) == null) {
            return;
        }
        this.f2120a.c(new i.b(categoryId, title, id2, searchParams));
    }

    @Override // CN.f
    public final void j(@Y61.l String str) {
        this.f2120a.c(new q(str, null, 2, null));
    }

    @Override // CN.f
    public final void k() {
        this.f2120a.c(new CN.b());
    }

    @Override // CN.f
    public final void l(@Y61.k SearchParams searchParams, @Y61.k Filter filter) {
        String id2;
        String title;
        String categoryId = searchParams.getCategoryId();
        if (categoryId == null || (id2 = filter.getId()) == null || (title = filter.getTitle()) == null) {
            return;
        }
        this.f2120a.c(new i.a(categoryId, title, id2, searchParams));
    }

    @Override // CN.f
    public final void m(@Y61.l String str) {
        this.f2120a.c(new n(str));
    }

    @Override // CN.f
    public final void n(@Y61.k SearchParams searchParams, @Y61.k Filter filter) {
        String str;
        String categoryId = searchParams.getCategoryId();
        String sellerId = searchParams.getSellerId();
        String id2 = filter.getId();
        String title = filter.getTitle();
        if (categoryId == null || id2 == null || title == null) {
            return;
        }
        InterfaceC43057n interfaceC43057nB = C43059p.b(new C43059p(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN), id2);
        if (interfaceC43057nB != null) {
            id2 = interfaceC43057nB.getValue();
        }
        String str2 = id2;
        int iOrdinal = this.f2121b.ordinal();
        if (iOrdinal == 0) {
            str = null;
        } else if (iOrdinal == 1) {
            str = "extended_profile";
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "extended_profile_sx";
        }
        this.f2120a.c(new h(categoryId, title, str2, sellerId, str));
    }

    @Override // CN.f
    public final void o(@Y61.l SearchParams searchParams, @Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue) {
        String categoryId;
        Filter.Config config;
        Filter.Displaying displaying;
        String str;
        String str2;
        if (searchParams == null || (categoryId = searchParams.getCategoryId()) == null) {
            return;
        }
        String sellerId = searchParams.getSellerId();
        String id2 = filter.getId();
        if (id2 == null) {
            return;
        }
        InterfaceC43057n interfaceC43057nB = C43059p.b(new C43059p(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN), id2);
        String title = filter.getTitle();
        if (title == null) {
            return;
        }
        List listP = p(filter, inlineFilterValue);
        ArrayList arrayList = new ArrayList();
        if ((inlineFilterValue instanceof InlineFilterValue.InlineFilterSelectValue) || (inlineFilterValue instanceof InlineFilterValue.InlineFilterMultiSelectValue)) {
            arrayList.addAll(inlineFilterValue.toStringList());
        } else if (inlineFilterValue instanceof InlineFilterValue.InlineFilterDateRangeValue) {
            InlineFilterValue.InlineFilterDateRangeValue inlineFilterDateRangeValue = (InlineFilterValue.InlineFilterDateRangeValue) inlineFilterValue;
            Filter.Widget widget = filter.getWidget();
            arrayList.addAll(inlineFilterDateRangeValue.getFilterValueIds((widget == null || (config = widget.getConfig()) == null || (displaying = config.getDisplaying()) == null) ? null : displaying.getMapping()));
        } else if (inlineFilterValue instanceof InlineFilterValue.InlineFilterLocalPriorityValue) {
            arrayList.addAll(Collections.singletonList(String.valueOf(((InlineFilterValue.InlineFilterLocalPriorityValue) inlineFilterValue).getPriority())));
        }
        boolean z12 = filter.getValue() != null;
        if (interfaceC43057nB != null) {
            id2 = interfaceC43057nB.getValue();
        }
        String str3 = id2;
        int iOrdinal = this.f2121b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                str2 = "extended_profile";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "extended_profile_sx";
            }
            str = str2;
        } else {
            str = null;
        }
        this.f2120a.c(new k(categoryId, title, str3, listP, arrayList, z12, sellerId, str));
    }
}
