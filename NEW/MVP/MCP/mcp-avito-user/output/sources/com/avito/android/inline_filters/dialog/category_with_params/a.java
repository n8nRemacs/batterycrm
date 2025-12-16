package com.avito.android.inline_filters.dialog.category_with_params;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.category_with_params.CategoryWithParamsFragment;
import com.avito.android.category_with_params.entity.CategoryParams;
import com.avito.android.category_with_params.entity.ListItem;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryWithParamsFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_with_params/a;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/E;", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC30998a<E> {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f171517o = 0;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Filter f171518d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FragmentManager f171519e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final com.avito.android.deeplink_handler.handler.composite.a f171520f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final InterfaceC30995b f171521g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Map<String, String> f171522h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final SearchParams f171523i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final PresentationType f171524j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f171525k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final N f171526l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final N f171527m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f171528n;

    /* compiled from: CategoryWithParamsFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_with_params/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.dialog.category_with_params.a$a, reason: collision with other inner class name */
    public static final class C5072a {
        public /* synthetic */ C5072a(C42822w c42822w) {
            this();
        }

        public C5072a() {
        }
    }

    static {
        new C5072a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @k Filter filter, @k FragmentManager fragmentManager, @l com.avito.android.deeplink_handler.handler.composite.a aVar, @l InterfaceC30995b interfaceC30995b, @l Map map, @l SearchParams searchParams, @l PresentationType presentationType, @l String str, @k p pVar, @k Y41.a aVar2) {
        super(context, R.style.Re23_BottomSheet_Default);
        this.f171518d = filter;
        this.f171519e = fragmentManager;
        this.f171520f = aVar;
        this.f171521g = interfaceC30995b;
        this.f171522h = map;
        this.f171523i = searchParams;
        this.f171524j = presentationType;
        this.f171525k = str;
        this.f171526l = (N) pVar;
        this.f171527m = (N) aVar2;
        this.f171528n = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
        c();
        CategoryWithParamsFragment categoryWithParamsFragmentE = e();
        if (categoryWithParamsFragmentE != null) {
            categoryWithParamsFragmentE.f117653l0 = null;
        }
        this.f171528n.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        ?? arrayList;
        Filter.Config config;
        Filter.Displaying displaying;
        CategoryWithParamsFragment categoryWithParamsFragmentE = e();
        if (categoryWithParamsFragmentE == null) {
            CategoryWithParamsFragment.a aVar = CategoryWithParamsFragment.f117648m0;
            Filter filter = this.f171518d;
            String title = filter.getTitle();
            List<Filter.InnerOptions.Options> selectedOptions = filter.getSelectedOptions();
            if (selectedOptions != null) {
                List<Filter.InnerOptions.Options> list = selectedOptions;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Filter.InnerOptions.Options) it.next()).getId());
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = C42784z0.f406748b;
            }
            Filter.Widget widget = filter.getWidget();
            List<List<String>> groupedMultiselectIds = (widget == null || (config = widget.getConfig()) == null || (displaying = config.getDisplaying()) == null) ? null : displaying.getGroupedMultiselectIds();
            if (groupedMultiselectIds == null) {
                groupedMultiselectIds = C42784z0.f406748b;
            }
            Set setP0 = C42745f0.P0(C42745f0.H(groupedMultiselectIds));
            List<Filter.InnerOptions> options = filter.getOptions();
            if (options == null) {
                options = C42784z0.f406748b;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = options.iterator();
            while (it2.hasNext()) {
                List<Filter.InnerOptions.Options> options2 = ((Filter.InnerOptions) it2.next()).getOptions();
                if (options2 == null) {
                    options2 = C42784z0.f406748b;
                }
                C42745f0.h(options2, arrayList2);
            }
            kotlin.collections.builders.b bVarT = C42745f0.t();
            Iterator it3 = arrayList2.iterator();
            Boolean boolValueOf = null;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Filter.InnerOptions.Options options3 = (Filter.InnerOptions.Options) it3.next();
                boolean zContains = setP0.contains(options3.getId());
                if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(zContains))) {
                    bVarT.add(new ListItem.Divider(null, 1, null));
                }
                String id2 = options3.getId();
                String title2 = options3.getTitle();
                String str = title2 == null ? "" : title2;
                Filter.InnerOptions.Display display = options3.getDisplay();
                bVarT.add(new ListItem.Option(id2, str, arrayList.contains(options3.getId()), display != null ? display.getMultiThemeImages() : null, null, 16, null));
                boolValueOf = Boolean.valueOf(zContains);
            }
            kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
            String title3 = filter.getTitle();
            CategoryParams categoryParams = new CategoryParams(title3 != null ? title3 : "", bVarP, groupedMultiselectIds);
            aVar.getClass();
            categoryWithParamsFragmentE = new CategoryWithParamsFragment();
            categoryWithParamsFragmentE.setArguments(C22777e.b(new Q("category_with_params_params_title_key", title), new Q("category_with_params_params_key", categoryParams)));
        }
        if (!categoryWithParamsFragmentE.isAdded()) {
            categoryWithParamsFragmentE.show(this.f171519e, "tag.category_with_params_dialog_fragment");
        }
        categoryWithParamsFragmentE.f117653l0 = new d(this);
    }

    public final CategoryWithParamsFragment e() {
        Fragment fragmentH = this.f171519e.H("tag.category_with_params_dialog_fragment");
        if (fragmentH instanceof CategoryWithParamsFragment) {
            return (CategoryWithParamsFragment) fragmentH;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
    public final void f() {
        CategoryWithParamsFragment categoryWithParamsFragmentE = e();
        if (categoryWithParamsFragmentE != null) {
            categoryWithParamsFragmentE.f117653l0 = null;
            categoryWithParamsFragmentE.dismissAllowingStateLoss();
        }
        this.f171528n.e();
        this.f171527m.invoke();
    }
}
