package com.avito.android.inline_filters.dialog;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.GroupSection;
import com.avito.android.remote.model.category_parameters.SectionTitle;
import com.avito.android.remote.model.search.ConfigCalendarSelectionType;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;
import com.avito.android.select.sectioned_multiselect.core.SectionedMultiselectCoreFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: InlineFilterDialogOpener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/j;", "Lcom/avito/android/inline_filters/dialog/InlineFilterDialogOpener;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements InlineFilterDialogOpener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Fragment f171646b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f171647c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30999b f171648d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final z f171649e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.select.i f171650f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public AbstractC30998a<? extends E> f171651g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public SelectBottomSheetMviFragment f171652h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public SectionedMultiselectCoreFragment f171653i;

    /* compiled from: InlineFilterDialogOpener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171654a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f171655b;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Multiselect.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.Select.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.SectionedMultiselect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.Beduin.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WidgetType.GuestsSelect.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WidgetType.Calendar.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f171654a = iArr;
            int[] iArr2 = new int[ConfigCalendarSelectionType.values().length];
            try {
                iArr2[ConfigCalendarSelectionType.SINGLE_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ConfigCalendarSelectionType.DATE_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f171655b = iArr2;
        }
    }

    /* compiled from: InlineFilterDialogOpener.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "it", "Lcom/avito/android/remote/model/search/Filter$OptionsGroup;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Filter.OptionsGroup, List<? extends ParcelableEntity<String>>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<ParcelableEntity<String>> f171656l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ParcelableEntity<String>> list) {
            super(1);
            this.f171656l = list;
        }

        @Override // Y41.l
        public final List<? extends ParcelableEntity<String>> invoke(Filter.OptionsGroup optionsGroup) {
            Filter.OptionsGroup optionsGroup2 = optionsGroup;
            String groupTitle = optionsGroup2.getGroupTitle();
            List<ParcelableEntity<String>> list = this.f171656l;
            if (groupTitle == null || groupTitle.length() == 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (optionsGroup2.getGroupIds().contains(((ParcelableEntity) obj).getId())) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            String groupTitle2 = optionsGroup2.getGroupTitle();
            if (groupTitle2 == null) {
                groupTitle2 = "";
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (optionsGroup2.getGroupIds().contains(((ParcelableEntity) obj2).getId())) {
                    arrayList2.add(obj2);
                }
            }
            return Collections.singletonList(new GroupSection(groupTitle2, arrayList2));
        }
    }

    /* compiled from: InlineFilterDialogOpener.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "inner", "Lcom/avito/android/remote/model/search/Filter$InnerOptions;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<Filter.InnerOptions, List<ParcelableEntity<String>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f171657l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final List<ParcelableEntity<String>> invoke(Filter.InnerOptions innerOptions) {
            Filter.InnerOptions innerOptions2 = innerOptions;
            List<Filter.InnerOptions.Options> options = innerOptions2.getOptions();
            if (options == null || options.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String title = innerOptions2.getTitle();
            if (title != null) {
                arrayList.add(new SectionTitle(title, null, 2, null));
            }
            List<Filter.InnerOptions.Options> options2 = innerOptions2.getOptions();
            if (options2 != null) {
                arrayList.addAll(options2);
            }
            return arrayList;
        }
    }

    public j(@Y61.l Fragment fragment, @Y61.k FragmentManager fragmentManager, @Y61.k InterfaceC30999b interfaceC30999b, @Y61.l z zVar, @Y61.l com.avito.android.select.i iVar) {
        this.f171646b = fragment;
        this.f171647c = fragmentManager;
        this.f171648d = interfaceC30999b;
        this.f171649e = zVar;
        this.f171650f = iVar;
    }

    public static List a(Filter filter, List list) {
        Filter.Config config;
        List<Filter.OptionsGroup> groups;
        List listD;
        Filter.Widget widget = filter.getWidget();
        return (widget == null || (config = widget.getConfig()) == null || (groups = config.getGroups()) == null || (listD = C43033p.D(C43033p.r(new o0(new C42770s0(groups), new b(list))))) == null) ? list : listD;
    }

    public static List b(Filter filter, boolean z12) {
        List listD;
        if (z12) {
            return C42784z0.f406748b;
        }
        List<Filter.InnerOptions> options = filter.getOptions();
        return (options == null || (listD = C43033p.D(C43033p.r(C43033p.y(new C42770s0(options), c.f171657l)))) == null) ? C42784z0.f406748b : listD;
    }

    /* JADX WARN: Removed duplicated region for block: B:236:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0  */
    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RA(@Y61.k com.avito.android.remote.model.search.Filter r62, @Y61.k java.util.List r63, @Y61.l android.os.Parcelable r64, @Y61.l com.avito.android.remote.model.SearchParams r65, @Y61.l com.avito.android.inline_filters.InterfaceC30995b r66, @Y61.l com.avito.android.inline_filters.W r67, @Y61.l com.avito.android.inline_filters.InterfaceC31046f r68, @Y61.l com.avito.android.location.r r69, @Y61.l CN.f r70, @Y61.l com.avito.android.deeplink_handler.handler.composite.a r71, @Y61.l com.avito.android.remote.model.PresentationType r72, @Y61.l java.util.Map r73, @Y61.k Y41.p r74, @Y61.l Y41.l r75, @Y61.k Y41.p r76, @Y61.k Y41.p r77, @Y61.k Y41.a r78, @Y61.k Y41.l r79, @Y61.l Y41.l r80, @Y61.l com.avito.android.inline_filters.dialog.InlineFilterDialogOpener.Source r81, @Y61.l com.avito.android.remote.model.metro_lines.MetroResponseBody r82, @Y61.l java.lang.String r83, @Y61.l java.lang.String r84, @Y61.l com.avito.android.remote.model.search.Filter r85, @Y61.l com.avito.android.remote.model.search.Filter r86, @Y61.l Y41.l r87, @Y61.l Hr.InterfaceC14024a r88, @Y61.l com.avito.android.guests_selector.d r89, @Y61.l cE.C27025b r90, @Y61.l com.avito.android.C0 r91, @Y61.l lE.C43624b r92) {
        /*
            Method dump skipped, instructions count: 3160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.j.RA(com.avito.android.remote.model.search.Filter, java.util.List, android.os.Parcelable, com.avito.android.remote.model.SearchParams, com.avito.android.inline_filters.b, com.avito.android.inline_filters.W, com.avito.android.inline_filters.f, com.avito.android.location.r, CN.f, com.avito.android.deeplink_handler.handler.composite.a, com.avito.android.remote.model.PresentationType, java.util.Map, Y41.p, Y41.l, Y41.p, Y41.p, Y41.a, Y41.l, Y41.l, com.avito.android.inline_filters.dialog.InlineFilterDialogOpener$Source, com.avito.android.remote.model.metro_lines.MetroResponseBody, java.lang.String, java.lang.String, com.avito.android.remote.model.search.Filter, com.avito.android.remote.model.search.Filter, Y41.l, Hr.a, com.avito.android.guests_selector.d, cE.b, com.avito.android.C0, lE.b):void");
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    @Y61.l
    public final Parcelable d0() {
        AbstractC30998a<? extends E> abstractC30998a = this.f171651g;
        if (abstractC30998a != null) {
            return abstractC30998a.b();
        }
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void f2() {
        AbstractC30998a<? extends E> abstractC30998a = this.f171651g;
        if (abstractC30998a != null) {
            abstractC30998a.a();
        }
        SelectBottomSheetMviFragment selectBottomSheetMviFragment = this.f171652h;
        if (selectBottomSheetMviFragment != null) {
            selectBottomSheetMviFragment.dismiss();
        }
    }

    public /* synthetic */ j(Fragment fragment, FragmentManager fragmentManager, InterfaceC30999b interfaceC30999b, z zVar, com.avito.android.select.i iVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : fragment, fragmentManager, interfaceC30999b, zVar, (i12 & 16) != 0 ? null : iVar);
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onPause() {
    }

    @Override // com.avito.android.inline_filters.dialog.InlineFilterDialogOpener
    public final void onResume() {
    }
}
