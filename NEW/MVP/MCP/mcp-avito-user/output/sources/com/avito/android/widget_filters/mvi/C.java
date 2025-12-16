package com.avito.android.widget_filters.mvi;

import com.avito.android.R;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersToolbarViewState;
import com.avito.android.widget_filters.mvi.entity.a;
import com.avito.android.widget_filters.mvi.entity.b;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.WidgetFiltersResponse;
import com.avito.android.widget_filters.remote.model.widgets.DateParam;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import java.io.Serializable;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/C;", "Lcom/avito/android/widget_filters/mvi/B;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MP0.a f329946a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.utils.b f329947b;

    /* compiled from: WidgetFiltersViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f329948a;

        static {
            int[] iArr = new int[WidgetFiltersWidget.WidgetType.values().length];
            try {
                WidgetFiltersWidget.WidgetType widgetType = WidgetFiltersWidget.WidgetType.f330263c;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WidgetFiltersWidget.WidgetType widgetType2 = WidgetFiltersWidget.WidgetType.f330263c;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WidgetFiltersWidget.WidgetType widgetType3 = WidgetFiltersWidget.WidgetType.f330263c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WidgetFiltersWidget.WidgetType widgetType4 = WidgetFiltersWidget.WidgetType.f330263c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f329948a = iArr;
        }
    }

    @Inject
    public C(@Y61.k MP0.a aVar, @Y61.k com.avito.android.widget_filters.utils.b bVar) {
        this.f329946a = aVar;
        this.f329947b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    @Override // com.avito.android.widget_filters.mvi.B
    @Y61.k
    public final com.avito.android.widget_filters.mvi.entity.c a(@Y61.k com.avito.android.widget_filters.mvi.entity.c cVar) {
        WidgetFiltersFooterViewState.ActionButtonType actionButtonType;
        WidgetFiltersFooterViewState.b bVarB;
        WidgetFiltersFooterViewState.b c10251b;
        ?? arrayList;
        NP0.i iVar;
        NP0.i iVar2;
        NP0.g gVar;
        SelectedDateRange selectedDateRange;
        NP0.m mVar;
        com.avito.android.widget_filters.mvi.entity.b bVar = cVar.f330098e;
        boolean z12 = bVar instanceof b.d;
        Integer numValueOf = null;
        int i12 = 0;
        WidgetFiltersToolbarViewState widgetFiltersToolbarViewState = cVar.f330108o;
        if (!z12) {
            if (bVar instanceof b.c) {
                return com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, null, null, null, null, 0, null, null, WidgetFiltersToolbarViewState.a(widgetFiltersToolbarViewState, null, new WidgetFiltersToolbarViewState.b(R.drawable.ic_close_24_black, WidgetFiltersToolbarViewState.NavigationButtonType.f330070b), 1), null, new a.e(((b.c) bVar).f330091b), 24575);
            }
            if (bVar instanceof b.C10253b) {
                return com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, null, null, null, null, 0, null, null, null, WidgetFiltersFooterViewState.a(cVar.f330109p, null, null, null, null, null, null, false, false, false, 191), ((b.C10253b) bVar).f330090b instanceof ApiError.NetworkIOError ? new a.d(R.attr.img_noInternet, com.avito.android.printable_text.b.c(R.string.error_layout_no_internet, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_check_connection, new Serializable[0])) : new a.d(R.attr.img_unknownError, com.avito.android.printable_text.b.c(R.string.error_layout_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_try_refresh_or_return_later, new Serializable[0])), 16383);
            }
            throw new NoWhenBranchMatchedException();
        }
        MP0.a aVar = this.f329946a;
        List<WidgetFiltersWidget> list = cVar.f330099f;
        ArrayList arrayListA = aVar.a(list, cVar);
        if (arrayListA.isEmpty()) {
            return com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, null, null, null, null, 0, null, null, WidgetFiltersToolbarViewState.a(widgetFiltersToolbarViewState, null, new WidgetFiltersToolbarViewState.b(R.drawable.ic_close_24_black, WidgetFiltersToolbarViewState.NavigationButtonType.f330070b), 1), WidgetFiltersFooterViewState.a(cVar.f330109p, null, null, null, null, null, null, false, false, false, 191), new a.c(com.avito.android.printable_text.b.c(R.string.error_layout_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_try_refresh_or_return_later, new Serializable[0])), 8191);
        }
        b.d dVar = (b.d) bVar;
        List<WidgetFiltersWidget> list2 = list;
        int size = list2.size() - 1;
        int i13 = cVar.f330105l;
        WidgetFiltersToolbarViewState widgetFiltersToolbarViewStateA = WidgetFiltersToolbarViewState.a(widgetFiltersToolbarViewState, null, (1 > i13 || i13 >= size) ? new WidgetFiltersToolbarViewState.b(R.drawable.ic_close_24_black, WidgetFiltersToolbarViewState.NavigationButtonType.f330070b) : new WidgetFiltersToolbarViewState.b(R.drawable.ic_back_24, WidgetFiltersToolbarViewState.NavigationButtonType.f330071c), 1);
        WidgetFiltersWidget.WidgetType widgetType = WidgetFiltersWidget.WidgetType.f330264d;
        boolean z13 = cVar.f330095b;
        WidgetFiltersWidget.WidgetType widgetType2 = cVar.f330106m;
        a.b bVar2 = new a.b((widgetType2 == widgetType || (widgetType2 == WidgetFiltersWidget.WidgetType.f330263c && z13)) ? false : true, arrayListA);
        String resetTitle = dVar.f330092b.getResetTitle();
        WidgetFiltersResponse widgetFiltersResponse = dVar.f330092b;
        String nextFilterTitle = widgetFiltersResponse.getNextFilterTitle();
        String searchFiltersTitle = widgetFiltersResponse.getSearchFiltersTitle();
        boolean z14 = !z13;
        int i14 = -1;
        WidgetFiltersFooterViewState.ResetButtonType resetButtonType = (widgetType2 == null ? -1 : a.f329948a[widgetType2.ordinal()]) == 1 ? WidgetFiltersFooterViewState.ResetButtonType.f330002c : WidgetFiltersFooterViewState.ResetButtonType.f330001b;
        int size2 = list2.size();
        d.C10254d c10254d = cVar.f330101h;
        boolean z15 = ((c10254d == null || (mVar = c10254d.f330146l) == null) ? null : mVar.f11499h) == null;
        if (i13 == 0 && widgetType2 == WidgetFiltersWidget.WidgetType.f330263c && z15) {
            actionButtonType = WidgetFiltersFooterViewState.ActionButtonType.f329998d;
        } else {
            int i15 = size2 - 1;
            actionButtonType = (i13 != i15 && i13 < i15) ? WidgetFiltersFooterViewState.ActionButtonType.f329996b : WidgetFiltersFooterViewState.ActionButtonType.f329997c;
        }
        WidgetFiltersFooterViewState.ActionButtonType actionButtonType2 = actionButtonType;
        WidgetFiltersWidget.WidgetType widgetType3 = cVar.f330107n.get(Integer.valueOf(i13));
        d.b bVar3 = cVar.f330102i;
        boolean z16 = widgetType3 == widgetType && (((bVar3 == null || (gVar = bVar3.f330127j) == null || (selectedDateRange = gVar.f11451h) == null) ? null : selectedDateRange.f286645b) != null);
        int i16 = widgetType2 == null ? -1 : a.f329948a[widgetType2.ordinal()];
        if (i16 == -1) {
            bVarB = b(cVar);
            c10251b = bVarB;
        } else if (i16 != 1) {
            if (i16 != 2 && i16 != 3 && i16 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            bVarB = b(cVar);
            c10251b = bVarB;
        } else if ((bVar3 != null ? bVar3.f330128k : null) != null) {
            if (bVar3 != null && (iVar2 = bVar3.f330128k) != null) {
                numValueOf = Integer.valueOf(iVar2.f11464g);
            }
            if (bVar3 == null || (iVar = bVar3.f330128k) == null) {
                arrayList = C42784z0.f406748b;
            } else {
                ArrayList<NP0.h> arrayList2 = iVar.f11465h;
                arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
                for (NP0.h hVar : arrayList2) {
                    int i17 = hVar.f11455a;
                    arrayList.add(new ItemChipable(i17, null, null, null, numValueOf != null && i17 == numValueOf.intValue(), null, hVar.f11456b, false, false, 430, null));
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ItemChipable) it.next()).f178766f) {
                    i14 = i12;
                    break;
                }
                i12++;
            }
            c10251b = cVar.f330096c ? new WidgetFiltersFooterViewState.b.C10251b(arrayList, Integer.valueOf(i14), c(cVar)) : new WidgetFiltersFooterViewState.b.a(arrayList, Integer.valueOf(i14));
        } else {
            bVarB = b(cVar);
            c10251b = bVarB;
        }
        return com.avito.android.widget_filters.mvi.entity.c.a(cVar, false, false, false, null, null, null, null, null, null, null, 0, null, null, widgetFiltersToolbarViewStateA, WidgetFiltersFooterViewState.a(cVar.f330109p, actionButtonType2, resetButtonType, resetTitle, nextFilterTitle, searchFiltersTitle, c10251b, z14, z16, false, 256), bVar2, 8191);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState.b b(com.avito.android.widget_filters.mvi.entity.c r3) {
        /*
            r2 = this;
            com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget$WidgetType r0 = r3.f330106m
            com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget$WidgetType r1 = com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget.WidgetType.f330264d
            if (r0 != r1) goto L10
            com.avito.android.widget_filters.mvi.entity.d$b r0 = r3.f330102i
            if (r0 == 0) goto Ld
            NP0.i r0 = r0.f330128k
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L14
        L10:
            boolean r0 = r3.f330096c
            if (r0 == 0) goto L1e
        L14:
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState$b$c r0 = new com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState$b$c
            com.avito.android.printable_text.PrintableText r3 = r2.c(r3)
            r0.<init>(r3)
            goto L20
        L1e:
            com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState$b$d r0 = com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState.b.d.f330011a
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.mvi.C.b(com.avito.android.widget_filters.mvi.entity.c):com.avito.android.widget_filters.mvi.entity.WidgetFiltersFooterViewState$b");
    }

    public final PrintableText c(com.avito.android.widget_filters.mvi.entity.c cVar) {
        String text;
        String text2;
        NP0.m mVar;
        String str;
        NP0.j jVar;
        String str2;
        NP0.d dVar;
        String str3;
        WidgetFiltersWidget.WidgetType widgetType = cVar.f330106m;
        int i12 = widgetType == null ? -1 : a.f329948a[widgetType.ordinal()];
        String str4 = "";
        if (i12 != 1) {
            if (i12 == 2) {
                d.C10254d c10254d = cVar.f330101h;
                if (c10254d != null && (mVar = c10254d.f330146l) != null && (str = mVar.f11496e) != null) {
                    str4 = str;
                }
                return com.avito.android.printable_text.b.f(str4);
            }
            if (i12 == 3) {
                d.c cVar2 = cVar.f330104k;
                if (cVar2 != null && (jVar = cVar2.f330135i) != null && (str2 = jVar.f11471e) != null) {
                    str4 = str2;
                }
                return com.avito.android.printable_text.b.f(str4);
            }
            if (i12 != 4) {
                return com.avito.android.printable_text.b.a();
            }
            d.a aVar = cVar.f330103j;
            if (aVar != null && (dVar = aVar.f330119i) != null && (str3 = dVar.f11436e) != null) {
                str4 = str3;
            }
            return com.avito.android.printable_text.b.f(str4);
        }
        d.b bVar = cVar.f330102i;
        if (bVar == null) {
            return com.avito.android.printable_text.b.a();
        }
        NP0.g gVar = bVar.f330127j;
        if (gVar == null) {
            return com.avito.android.printable_text.b.a();
        }
        SelectedDateRange selectedDateRange = gVar.f11451h;
        if ((selectedDateRange != null ? selectedDateRange.f286645b : null) == null) {
            DateParam dateParam = gVar.f11449f;
            if (dateParam != null && (text2 = dateParam.getText()) != null) {
                str4 = text2;
            }
            return com.avito.android.printable_text.b.f(str4);
        }
        if (selectedDateRange.f286646c == null) {
            DateParam dateParam2 = gVar.f11450g;
            if (dateParam2 != null && (text = dateParam2.getText()) != null) {
                str4 = text;
            }
            return com.avito.android.printable_text.b.f(str4);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        Date date = selectedDateRange.f286645b;
        Instant instant = date != null ? date.toInstant() : null;
        Date date2 = selectedDateRange.f286646c;
        return this.f329947b.o((int) chronoUnit.between(instant, date2 != null ? date2.toInstant() : null));
    }
}
