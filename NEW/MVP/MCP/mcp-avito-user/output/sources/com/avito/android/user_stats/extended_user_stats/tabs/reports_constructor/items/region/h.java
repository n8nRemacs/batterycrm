package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region;

import RJ0.a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: RegionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/region/h;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/region/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f318058e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f318059b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f318060c;

    /* renamed from: d, reason: collision with root package name */
    public final DescriptionParameterItem f318061d;

    public h(@k View view) {
        super(view);
        this.f318059b = view;
        this.f318060c = (ConstraintLayout) view.findViewById(R.id.cl_split_item);
        this.f318061d = (DescriptionParameterItem) view.findViewById(R.id.dpi_split);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.f
    public final void Mf(@k final RegionItemData regionItemData, @k final l<? super RJ0.a, G0> lVar) {
        Integer numValueOf;
        Context context = this.f318059b.getContext();
        final int i12 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l lVar2 = lVar;
                RegionItemData regionItemData2 = regionItemData;
                switch (i12) {
                    case 0:
                        int i13 = h.f318058e;
                        if (regionItemData2.f318047h) {
                            lVar2.invoke(new a.o(regionItemData2.f318042c));
                            break;
                        }
                        break;
                    default:
                        int i14 = h.f318058e;
                        String str = regionItemData2.f318045f;
                        if (str != null && str.length() != 0) {
                            lVar2.invoke(new a.n(str));
                            break;
                        } else {
                            lVar2.invoke(new a.o(regionItemData2.f318042c));
                            break;
                        }
                        break;
                }
            }
        };
        ConstraintLayout constraintLayout = this.f318060c;
        constraintLayout.setOnClickListener(onClickListener);
        DescriptionParameterItem descriptionParameterItem = this.f318061d;
        descriptionParameterItem.getLeftTextView().setText(regionItemData.f318043d);
        descriptionParameterItem.getRightTextView().setText(regionItemData.f318044e);
        descriptionParameterItem.getLeftTextView().setTextAppearance(C35835l0.j(R.attr.textM20, context));
        descriptionParameterItem.getRightTextView().setTextAppearance(C35835l0.j(R.attr.textM20, context));
        descriptionParameterItem.b(0.0f, 0, null);
        String str = regionItemData.f318045f;
        if (str == null || str.length() == 0) {
            boolean z12 = regionItemData.f318046g;
            boolean z13 = regionItemData.f318047h;
            numValueOf = (z13 && z12) ? Integer.valueOf(R.attr.ic_arrowExpandMore16) : (!z13 || z12) ? null : Integer.valueOf(R.attr.ic_arrowExpandLess16);
        } else {
            numValueOf = Integer.valueOf(R.attr.ic_help16);
        }
        descriptionParameterItem.setLeftTextIconDrawable(numValueOf != null ? C43852a.a(context, C35835l0.j(numValueOf.intValue(), context)) : null);
        descriptionParameterItem.setHorizontalIconPadding(y6.b(4));
        final int i13 = 1;
        descriptionParameterItem.getIcon().setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l lVar2 = lVar;
                RegionItemData regionItemData2 = regionItemData;
                switch (i13) {
                    case 0:
                        int i132 = h.f318058e;
                        if (regionItemData2.f318047h) {
                            lVar2.invoke(new a.o(regionItemData2.f318042c));
                            break;
                        }
                        break;
                    default:
                        int i14 = h.f318058e;
                        String str2 = regionItemData2.f318045f;
                        if (str2 != null && str2.length() != 0) {
                            lVar2.invoke(new a.n(str2));
                            break;
                        } else {
                            lVar2.invoke(new a.o(regionItemData2.f318042c));
                            break;
                        }
                        break;
                }
            }
        });
        constraintLayout.setPadding(y6.b((regionItemData.f318048i * 16) + 16), y6.b(10), y6.b(16), y6.b(10));
    }
}
