package com.avito.android.beduin.common.component.real_estate_filter;

import android.content.Context;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.select_option.Option;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRealEstateFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/s;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RealEstateFilters f102336a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C28803d f102337b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f102338c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f102339d;

    /* compiled from: BeduinRealEstateFilterDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/s$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    public s(@Y61.k final Context context, @Y61.k RealEstateFilters realEstateFilters, @Y61.k RealEstateFilterState realEstateFilterState, @Y61.l C28803d c28803d) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        Chips chips;
        Chips chips2;
        RealEstateFinishType realEstateFinishType;
        Object next;
        RealEstateCompletionDate realEstateCompletionDate;
        Object next2;
        RealEstateDevelopment realEstateDevelopment;
        Object next3;
        this.f102336a = realEstateFilters;
        this.f102337b = c28803d;
        this.f102338c = context.getResources().getBoolean(R.bool.is_tablet);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_LookAndFeel), 0, 2, null);
        this.f102339d = dVar;
        dVar.D(R.layout.beduin_real_estate_filter_dialog, true);
        A.a(dVar, context.getString(R.string.real_estate_filter_screen_title), context.getString(R.string.design_clear_description));
        dVar.P(new u(this));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        List<RealEstateDevelopment> developments = realEstateFilters.getDevelopments();
        if (developments == null || developments.isEmpty()) {
            D6.w((ComponentContainer) dVar.findViewById(R.id.development));
        } else {
            D6.H((ComponentContainer) dVar.findViewById(R.id.development));
        }
        Input input = (Input) dVar.findViewById(R.id.development_input);
        if (input != null) {
            List<RealEstateDevelopment> developments2 = realEstateFilters.getDevelopments();
            if (developments2 != null) {
                Iterator<T> it = developments2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    } else {
                        next3 = it.next();
                        if (L.f(((RealEstateDevelopment) next3).getId(), realEstateFilterState.getDevelopmentId())) {
                            break;
                        }
                    }
                }
                realEstateDevelopment = (RealEstateDevelopment) next3;
            } else {
                realEstateDevelopment = null;
            }
            Input.t(input, realEstateDevelopment != null ? realEstateDevelopment.getName() : null, false, 6);
            final int i12 = 1;
            input.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.beduin.common.component.real_estate_filter.r

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s f102334c;

                {
                    this.f102334c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<RealEstateFinishType> finishTypes;
                    List<RealEstateDevelopment> developments3;
                    switch (i12) {
                        case 0:
                            C28803d c28803d2 = this.f102334c.f102337b;
                            if (c28803d2 != null && (finishTypes = c28803d2.f102290f.getFilters().getFinishTypes()) != null) {
                                Context context2 = context;
                                String string = context2.getString(R.string.real_estate_filter_finish_type);
                                String finishTypeId = c28803d2.f102295k.getFinishTypeId();
                                List<RealEstateFinishType> list = finishTypes;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                                for (RealEstateFinishType realEstateFinishType2 : list) {
                                    arrayList.add(new Option(realEstateFinishType2.getId(), realEstateFinishType2.getName()));
                                }
                                c28803d2.x(context2, string, finishTypeId, arrayList, new g(finishTypes, c28803d2), true);
                                break;
                            }
                            break;
                        case 1:
                            C28803d c28803d3 = this.f102334c.f102337b;
                            if (c28803d3 != null && (developments3 = c28803d3.f102290f.getFilters().getDevelopments()) != null) {
                                Context context3 = context;
                                String string2 = context3.getString(R.string.real_estate_filter_development);
                                String developmentId = c28803d3.f102295k.getDevelopmentId();
                                List<RealEstateDevelopment> list2 = developments3;
                                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                                for (RealEstateDevelopment realEstateDevelopment2 : list2) {
                                    arrayList2.add(new Option(realEstateDevelopment2.getId(), realEstateDevelopment2.getName()));
                                }
                                c28803d3.x(context3, string2, developmentId, arrayList2, new f(developments3, c28803d3), false);
                                break;
                            }
                            break;
                        default:
                            C28803d c28803d4 = this.f102334c.f102337b;
                            if (c28803d4 != null) {
                                String selectedCompletionDateId = c28803d4.f102295k.getSelectedCompletionDateId();
                                List<RealEstateCompletionDate> completionDates = c28803d4.f102290f.getFilters().getCompletionDates();
                                if (completionDates != null) {
                                    Context context4 = context;
                                    String string3 = context4.getString(R.string.real_estate_filter_completion);
                                    List<RealEstateCompletionDate> list3 = completionDates;
                                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                                    for (RealEstateCompletionDate realEstateCompletionDate2 : list3) {
                                        arrayList3.add(new Option(realEstateCompletionDate2.toStringId(), realEstateCompletionDate2.getName()));
                                    }
                                    c28803d4.x(context4, string3, selectedCompletionDateId, arrayList3, new C28804e(completionDates, c28803d4), true);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        Input input2 = (Input) this.f102339d.findViewById(R.id.completion_input);
        if (input2 != null) {
            String selectedCompletionDateId = realEstateFilterState.getSelectedCompletionDateId();
            List<RealEstateCompletionDate> completionDates = realEstateFilters.getCompletionDates();
            if (completionDates != null) {
                Iterator<T> it2 = completionDates.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        if (L.f(((RealEstateCompletionDate) next2).toStringId(), selectedCompletionDateId)) {
                            break;
                        }
                    }
                }
                realEstateCompletionDate = (RealEstateCompletionDate) next2;
            } else {
                realEstateCompletionDate = null;
            }
            Input.t(input2, realEstateCompletionDate != null ? realEstateCompletionDate.getName() : null, false, 6);
            final int i13 = 2;
            input2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.beduin.common.component.real_estate_filter.r

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s f102334c;

                {
                    this.f102334c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<RealEstateFinishType> finishTypes;
                    List<RealEstateDevelopment> developments3;
                    switch (i13) {
                        case 0:
                            C28803d c28803d2 = this.f102334c.f102337b;
                            if (c28803d2 != null && (finishTypes = c28803d2.f102290f.getFilters().getFinishTypes()) != null) {
                                Context context2 = context;
                                String string = context2.getString(R.string.real_estate_filter_finish_type);
                                String finishTypeId = c28803d2.f102295k.getFinishTypeId();
                                List<RealEstateFinishType> list = finishTypes;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                                for (RealEstateFinishType realEstateFinishType2 : list) {
                                    arrayList.add(new Option(realEstateFinishType2.getId(), realEstateFinishType2.getName()));
                                }
                                c28803d2.x(context2, string, finishTypeId, arrayList, new g(finishTypes, c28803d2), true);
                                break;
                            }
                            break;
                        case 1:
                            C28803d c28803d3 = this.f102334c.f102337b;
                            if (c28803d3 != null && (developments3 = c28803d3.f102290f.getFilters().getDevelopments()) != null) {
                                Context context3 = context;
                                String string2 = context3.getString(R.string.real_estate_filter_development);
                                String developmentId = c28803d3.f102295k.getDevelopmentId();
                                List<RealEstateDevelopment> list2 = developments3;
                                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                                for (RealEstateDevelopment realEstateDevelopment2 : list2) {
                                    arrayList2.add(new Option(realEstateDevelopment2.getId(), realEstateDevelopment2.getName()));
                                }
                                c28803d3.x(context3, string2, developmentId, arrayList2, new f(developments3, c28803d3), false);
                                break;
                            }
                            break;
                        default:
                            C28803d c28803d4 = this.f102334c.f102337b;
                            if (c28803d4 != null) {
                                String selectedCompletionDateId2 = c28803d4.f102295k.getSelectedCompletionDateId();
                                List<RealEstateCompletionDate> completionDates2 = c28803d4.f102290f.getFilters().getCompletionDates();
                                if (completionDates2 != null) {
                                    Context context4 = context;
                                    String string3 = context4.getString(R.string.real_estate_filter_completion);
                                    List<RealEstateCompletionDate> list3 = completionDates2;
                                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                                    for (RealEstateCompletionDate realEstateCompletionDate2 : list3) {
                                        arrayList3.add(new Option(realEstateCompletionDate2.toStringId(), realEstateCompletionDate2.getName()));
                                    }
                                    c28803d4.x(context4, string3, selectedCompletionDateId2, arrayList3, new C28804e(completionDates2, c28803d4), true);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        Input input3 = (Input) this.f102339d.findViewById(R.id.finish_type_input);
        if (input3 != null) {
            List<RealEstateFinishType> finishTypes = realEstateFilters.getFinishTypes();
            if (finishTypes != null) {
                Iterator<T> it3 = finishTypes.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (L.f(((RealEstateFinishType) next).getId(), realEstateFilterState.getFinishTypeId())) {
                            break;
                        }
                    }
                }
                realEstateFinishType = (RealEstateFinishType) next;
            } else {
                realEstateFinishType = null;
            }
            Input.t(input3, realEstateFinishType != null ? realEstateFinishType.getName() : null, false, 6);
            final int i14 = 0;
            input3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.beduin.common.component.real_estate_filter.r

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s f102334c;

                {
                    this.f102334c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<RealEstateFinishType> finishTypes2;
                    List<RealEstateDevelopment> developments3;
                    switch (i14) {
                        case 0:
                            C28803d c28803d2 = this.f102334c.f102337b;
                            if (c28803d2 != null && (finishTypes2 = c28803d2.f102290f.getFilters().getFinishTypes()) != null) {
                                Context context2 = context;
                                String string = context2.getString(R.string.real_estate_filter_finish_type);
                                String finishTypeId = c28803d2.f102295k.getFinishTypeId();
                                List<RealEstateFinishType> list = finishTypes2;
                                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                                for (RealEstateFinishType realEstateFinishType2 : list) {
                                    arrayList.add(new Option(realEstateFinishType2.getId(), realEstateFinishType2.getName()));
                                }
                                c28803d2.x(context2, string, finishTypeId, arrayList, new g(finishTypes2, c28803d2), true);
                                break;
                            }
                            break;
                        case 1:
                            C28803d c28803d3 = this.f102334c.f102337b;
                            if (c28803d3 != null && (developments3 = c28803d3.f102290f.getFilters().getDevelopments()) != null) {
                                Context context3 = context;
                                String string2 = context3.getString(R.string.real_estate_filter_development);
                                String developmentId = c28803d3.f102295k.getDevelopmentId();
                                List<RealEstateDevelopment> list2 = developments3;
                                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                                for (RealEstateDevelopment realEstateDevelopment2 : list2) {
                                    arrayList2.add(new Option(realEstateDevelopment2.getId(), realEstateDevelopment2.getName()));
                                }
                                c28803d3.x(context3, string2, developmentId, arrayList2, new f(developments3, c28803d3), false);
                                break;
                            }
                            break;
                        default:
                            C28803d c28803d4 = this.f102334c.f102337b;
                            if (c28803d4 != null) {
                                String selectedCompletionDateId2 = c28803d4.f102295k.getSelectedCompletionDateId();
                                List<RealEstateCompletionDate> completionDates2 = c28803d4.f102290f.getFilters().getCompletionDates();
                                if (completionDates2 != null) {
                                    Context context4 = context;
                                    String string3 = context4.getString(R.string.real_estate_filter_completion);
                                    List<RealEstateCompletionDate> list3 = completionDates2;
                                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                                    for (RealEstateCompletionDate realEstateCompletionDate2 : list3) {
                                        arrayList3.add(new Option(realEstateCompletionDate2.toStringId(), realEstateCompletionDate2.getName()));
                                    }
                                    c28803d4.x(context4, string3, selectedCompletionDateId2, arrayList3, new C28804e(completionDates2, c28803d4), true);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        List<RealEstateRoomType> roomsTypes = realEstateFilters.getRoomsTypes();
        if (roomsTypes != null && (chips = (Chips) this.f102339d.findViewById(R.id.room_types)) != null) {
            List<RealEstateRoomType> list = roomsTypes;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(new E((RealEstateRoomType) it4.next()));
            }
            chips.setData(arrayList);
            Iterator<RealEstateRoomType> it5 = roomsTypes.iterator();
            int i15 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i15 = -1;
                    break;
                }
                String id2 = it5.next().getId();
                List<String> roomsTypeIds = realEstateFilterState.getRoomsTypeIds();
                if (L.f(id2, roomsTypeIds != null ? (String) C42745f0.G(roomsTypeIds) : null)) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 != -1 && (chips2 = (Chips) this.f102339d.findViewById(R.id.room_types)) != null) {
                chips2.q((com.avito.android.lib.design.chips.h) arrayList.get(i15), true);
            }
            chips.setChipsSelectedListener(new z(chips, this));
        }
        int length = String.valueOf(realEstateFilters.getMaxPrice()).length();
        int length2 = String.valueOf(realEstateFilters.getMaxArea()).length();
        Input input4 = (Input) this.f102339d.findViewById(R.id.priceFrom);
        if (input4 != null) {
            Input.t(input4, realEstateFilterState.getPriceFrom(), false, 6);
            input4.setMaxLength(length);
            input4.b(new w(input4, this));
        }
        Input input5 = (Input) this.f102339d.findViewById(R.id.priceTo);
        if (input5 != null) {
            Input.t(input5, realEstateFilterState.getPriceTo(), false, 6);
            input5.setMaxLength(length);
            input5.b(new x(input5, this));
        }
        Input input6 = (Input) this.f102339d.findViewById(R.id.areaFrom);
        if (input6 != null) {
            Input.t(input6, realEstateFilterState.getAreaFrom(), false, 6);
            input6.setMaxLength(length2);
            input6.b(new y(input6, this));
        }
        Input input7 = (Input) this.f102339d.findViewById(R.id.areaTo);
        if (input7 != null) {
            Input.t(input7, realEstateFilterState.getAreaTo(), false, 6);
            input7.setMaxLength(length2);
            input7.b(new v(input7, this));
        }
        View viewFindViewById4 = this.f102339d.findViewById(R.id.confirm);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new q(this, 0));
        }
        if (!this.f102338c) {
            com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f102339d;
            NestedScrollView nestedScrollView = (NestedScrollView) dVar2.findViewById(R.id.filter_scroll_view);
            if (nestedScrollView != null && (viewFindViewById = dVar2.findViewById(R.id.filter_content)) != null && (viewFindViewById2 = dVar2.findViewById(R.id.floating_confirm_container)) != null && (viewFindViewById3 = this.f102339d.findViewById(R.id.confirm)) != null) {
                D6.l(true, nestedScrollView, new t(this, viewFindViewById, nestedScrollView, viewFindViewById3, viewFindViewById2));
            }
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            com.avito.android.lib.design.bottom_sheet.d r0 = r5.f102339d
            r1 = 2131363268(0x7f0a05c4, float:1.834634E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lf
            goto L82
        Lf:
            r1 = 0
            com.avito.android.beduin.common.component.real_estate_filter.d r2 = r5.f102337b
            if (r2 == 0) goto L7f
            com.avito.android.beduin.common.component.real_estate_filter.BeduinRealEstateFilterModel r3 = r2.f102290f
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilters r3 = r3.getFilters()
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateDevelopment r3 = r3.findDefaultDevelopmentValue()
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getAreaTo()
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getAreaFrom()
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getPriceTo()
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getPriceFrom()
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getCompletionDateFrom()
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getCompletionDateTo()
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.util.List r4 = r4.getRoomsTypeIds()
            boolean r4 = com.avito.android.util.O2.a(r4)
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getFinishTypeId()
            if (r4 != 0) goto L7e
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r4 = r2.f102295k
            java.lang.String r4 = r4.getDevelopmentId()
            if (r4 == 0) goto L7f
            com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState r2 = r2.f102295k
            java.lang.String r2 = r2.getDevelopmentId()
            if (r3 == 0) goto L77
            java.lang.String r3 = r3.getId()
            goto L78
        L77:
            r3 = 0
        L78:
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto L7f
        L7e:
            r1 = 1
        L7f:
            r0.setEnabled(r1)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.real_estate_filter.s.a():void");
    }
}
