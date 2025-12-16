package com.avito.android.profile.pro.impl.screen.item.my_services;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProMyServicesView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/my_services/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/my_services/f;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f223344e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f223345b;

    /* renamed from: c, reason: collision with root package name */
    public final GridLayout f223346c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final WeakReference<Context> f223347d;

    /* compiled from: ProfileProMyServicesView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/my_services/g$a;", "", "<init>", "()V", "", "BADGE_MAX_VALUE_TEXT", "Ljava/lang/String;", "", "COLUMN_COUNT_3", "I", "COLUMN_COUNT_4", "EMPTY_VIEW_TAG", "MY_SERVICE_VIEW_TAG", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(@k View view) {
        super(view);
        this.f223345b = (TextView) view.findViewById(R.id.profile_pro_my_services_title);
        this.f223346c = (GridLayout) view.findViewById(R.id.profile_pro_my_services_items);
        this.f223347d = new WeakReference<>(view.getContext());
    }

    public static void B80(View view, ProfileProMyServiceItem profileProMyServiceItem, l lVar) {
        ((TextView) view.findViewById(R.id.item_title)).setText(profileProMyServiceItem.f223328b);
        Integer numM = com.avito.android.lib.util.f.m(profileProMyServiceItem.f223330d);
        if (numM != null) {
            int iIntValue = numM.intValue();
            FV.a aVar = FV.a.f4720a;
            View viewFindViewById = view.findViewById(R.id.item_icon);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            aVar.getClass();
            FV.a.c((TextView) viewFindViewById, iIntValue);
        }
        view.setOnClickListener(new j(27, lVar, profileProMyServiceItem));
        Badge badge = (Badge) view.findViewById(R.id.notification_badge);
        long j12 = profileProMyServiceItem.f223331e;
        if (j12 <= 0) {
            badge.setVisibility(8);
        } else {
            badge.setTitleText(j12 < 100 ? String.valueOf(j12) : "99+");
            badge.setVisibility(0);
        }
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.my_services.f
    public final void Yr(@k ProfileProMyServicesItem profileProMyServicesItem, @k l<? super D90.a, G0> lVar) {
        this.f223345b.setText(profileProMyServicesItem.f223335c);
        ArrayList arrayList = profileProMyServicesItem.f223337e;
        int size = arrayList != null ? arrayList.size() : 0;
        boolean z12 = true;
        int i12 = (size <= 1 || size % 4 != 1) ? 4 : 3;
        GridLayout gridLayout = this.f223346c;
        if (i12 < gridLayout.getColumnCount()) {
            int childCount = gridLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = gridLayout.getChildAt(i13);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.GridLayout.LayoutParams");
                }
                GridLayout.LayoutParams layoutParams2 = (GridLayout.LayoutParams) layoutParams;
                layoutParams2.columnSpec = GridLayout.spec(i13 % i12, 1.0f);
                layoutParams2.rowSpec = GridLayout.spec(i13 / i12, 1.0f);
                childAt.setLayoutParams(layoutParams2);
            }
        }
        gridLayout.setColumnCount(i12);
        if (arrayList == null || !(!arrayList.isEmpty())) {
            gridLayout.removeAllViews();
            return;
        }
        WeakReference<Context> weakReference = this.f223347d;
        Context context = weakReference.get();
        if (context == null) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i14 = size < i12 ? i12 - size : 0;
        int childCount2 = gridLayout.getChildCount();
        int i15 = 0;
        while (true) {
            if (i15 >= size && i15 >= childCount2) {
                break;
            }
            boolean z13 = i15 < size ? z12 : false;
            boolean z14 = i15 < childCount2 ? z12 : false;
            if (z13 && z14) {
                View childAt2 = gridLayout.getChildAt(i15);
                Object tag = childAt2.getTag();
                if (L.f(tag, "my_service_view")) {
                    B80(childAt2, (ProfileProMyServiceItem) arrayList.get(i15), lVar);
                } else if (L.f(tag, "empty_view")) {
                    gridLayout.removeViewAt(i15);
                    ProfileProMyServiceItem profileProMyServiceItem = (ProfileProMyServiceItem) arrayList.get(i15);
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.item_profile_pro_my_service_item, (ViewGroup) gridLayout, false);
                    B80(viewInflate, profileProMyServiceItem, lVar);
                    viewInflate.setTag("my_service_view");
                    gridLayout.addView(viewInflate, i15);
                }
            } else if (z13) {
                ProfileProMyServiceItem profileProMyServiceItem2 = (ProfileProMyServiceItem) arrayList.get(i15);
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_profile_pro_my_service_item, (ViewGroup) gridLayout, false);
                B80(viewInflate2, profileProMyServiceItem2, lVar);
                viewInflate2.setTag("my_service_view");
                gridLayout.addView(viewInflate2, i15);
            } else if (z14) {
                if (i14 <= 0) {
                    gridLayout.removeViews(i15, childCount2 - i15);
                    break;
                } else if (L.f(gridLayout.getChildAt(i15).getTag(), "my_service_view")) {
                    gridLayout.removeViewAt(i15);
                    childCount2--;
                    z12 = true;
                } else {
                    i14--;
                }
            }
            i15++;
            z12 = true;
        }
        Context context2 = weakReference.get();
        if (context2 == null) {
            return;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            GridLayout.LayoutParams layoutParams3 = new GridLayout.LayoutParams();
            layoutParams3.width = 0;
            layoutParams3.height = 0;
            layoutParams3.columnSpec = GridLayout.spec(BeduinInputModel.MIN_TEXT_VERSION, 1.0f);
            View view = new View(context2);
            view.setTag("empty_view");
            gridLayout.addView(view, layoutParams3);
        }
    }
}
