package ON;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.A;
import com.avito.android.select.Arguments;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;
import com.avito.android.select.bottom_sheet.c;
import com.avito.android.select.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupInlineFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LON/a;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/E;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC30998a<E> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FragmentManager f12221d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Filter f12222e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final x f12223f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<i> f12224g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final N f12225h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final N f12226i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final SelectBottomSheetMviFragment f12227j;

    /* compiled from: SelectableGroupInlineFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ON/a$a", "Lcom/avito/android/select/A;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ON.a$a, reason: collision with other inner class name */
    public static final class C0789a implements A {
        public C0789a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // com.avito.android.select.A
        public final void a(@k InlineFilterValue inlineFilterValue) {
            a aVar = a.this;
            SelectBottomSheetMviFragment selectBottomSheetMviFragment = aVar.f12227j;
            if (selectBottomSheetMviFragment != null) {
                selectBottomSheetMviFragment.f265015r0 = null;
            }
            if (selectBottomSheetMviFragment != null) {
                selectBottomSheetMviFragment.dismiss();
            }
            aVar.f12225h.invoke(aVar.f12222e, inlineFilterValue);
            aVar.f12226i.invoke();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // com.avito.android.select.A
        public final void onDialogClose() {
            a aVar = a.this;
            SelectBottomSheetMviFragment selectBottomSheetMviFragment = aVar.f12227j;
            if (selectBottomSheetMviFragment != null) {
                selectBottomSheetMviFragment.f265015r0 = null;
            }
            if (selectBottomSheetMviFragment != null) {
                selectBottomSheetMviFragment.dismiss();
            }
            aVar.f12226i.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @k FragmentManager fragmentManager, @k Filter filter, @k x xVar, @k List list, @k p pVar, @k Y41.a aVar) {
        ArrayList arrayList;
        Filter.Config config;
        Boolean areGroupsCollapsible;
        Filter.Config config2;
        Boolean searchAvailable;
        List<UniversalColor> list2;
        Filter.InnerOptions.Display.Link link;
        Filter.Config config3;
        super(context, R.style.Re23_BottomSheet_Default);
        this.f12221d = fragmentManager;
        this.f12222e = filter;
        this.f12223f = xVar;
        this.f12224g = list;
        this.f12225h = (N) pVar;
        this.f12226i = (N) aVar;
        Fragment fragmentH = fragmentManager.H("tag.select_bottom_sheet_dialog_fragment");
        SelectBottomSheetMviFragment selectBottomSheetMviFragmentA = fragmentH instanceof SelectBottomSheetMviFragment ? (SelectBottomSheetMviFragment) fragmentH : null;
        if (selectBottomSheetMviFragmentA == null) {
            Filter.Widget widget = filter.getWidget();
            List<Filter.OptionsGroup> groups = (widget == null || (config3 = widget.getConfig()) == null) ? null : config3.getGroups();
            if (groups != null) {
                List<Filter.OptionsGroup> list3 = groups;
                arrayList = new ArrayList(C42745f0.q(list3, 10));
                for (Filter.OptionsGroup optionsGroup : list3) {
                    arrayList.add(new MultiselectParameter.Displaying.Group(optionsGroup.getGroupIds(), optionsGroup.getGroupTitle(), null, 4, null));
                }
            } else {
                arrayList = null;
            }
            List<i> list4 = this.f12224g;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
            for (i iVar : list4) {
                arrayList2.add(new MultiselectParameter.Value(iVar.f172092c, iVar.f172093d, (iVar.f172095f != InlineItemType.f172058e || (list2 = iVar.f172107r) == null || (link = iVar.f172108s) == null) ? null : new MultiselectParameter.Value.Display(null, null, null, null, null, null, null, null, null, null, list2, new MultiselectParameter.Value.Display.Link(link.getDeepLink()), 1022, null), null, false, null, 56, null));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list4) {
                if (((i) obj).f172094e) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                i iVar2 = (i) it.next();
                arrayList4.add(new MultiselectParameter.Value(iVar2.f172092c, iVar2.f172093d, null, null, false, null, 56, null));
            }
            String id2 = filter.getId();
            String str = id2 == null ? "" : id2;
            List<ParcelableEntity<String>> listB = this.f12223f.b(arrayList, arrayList2);
            String title = filter.getTitle();
            String str2 = title == null ? "" : title;
            Filter.Widget widget2 = filter.getWidget();
            boolean zBooleanValue = (widget2 == null || (config2 = widget2.getConfig()) == null || (searchAvailable = config2.getSearchAvailable()) == null) ? true : searchAvailable.booleanValue();
            Filter.Widget widget3 = filter.getWidget();
            selectBottomSheetMviFragmentA = c.a(null, new Arguments(false, str, arrayList, listB, arrayList4, str2, null, zBooleanValue, false, false, true, true, false, (widget3 == null || (config = widget3.getConfig()) == null || (areGroupsCollapsible = config.getAreGroupsCollapsible()) == null) ? true : areGroupsCollapsible.booleanValue(), false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -15551, 255, null));
        }
        this.f12227j = selectBottomSheetMviFragmentA;
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f12227j;
        if ((selectBottomSheetMviFragment == null || !selectBottomSheetMviFragment.isAdded()) && selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.show(this.f12221d, "tag.select_bottom_sheet_dialog_fragment");
        }
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.f265015r0 = new C0789a();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
    }
}
