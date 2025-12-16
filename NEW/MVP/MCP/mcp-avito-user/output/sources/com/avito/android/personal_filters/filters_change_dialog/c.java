package com.avito.android.personal_filters.filters_change_dialog;

import Au.C13079a;
import Y41.p;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.modal.a;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import com.avito.android.personal_filters.filters_change_dialog.ui.PersonalFiltersChangeDialogData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PersonalFiltersChangeDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PersonalFiltersChangeDialogData f215717l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PersonalFiltersChangeDialogFragment f215718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ContextThemeWrapper f215719n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PersonalFiltersChangeDialogData personalFiltersChangeDialogData, PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment, ContextThemeWrapper contextThemeWrapper) {
        super(2);
        this.f215717l = personalFiltersChangeDialogData;
        this.f215718m = personalFiltersChangeDialogFragment;
        this.f215719n = contextThemeWrapper;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.G3();
        PersonalFiltersChangeDialogData personalFiltersChangeDialogData = this.f215717l;
        bVar2.setTitle(personalFiltersChangeDialogData.f215762b);
        bVar2.setSubtitle(personalFiltersChangeDialogData.f215763c);
        bVar2.setButtonsOrientation(1);
        PersonalFiltersChangeDialogFragment.a aVar = PersonalFiltersChangeDialogFragment.f215702o0;
        PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment = this.f215718m;
        ContextThemeWrapper contextThemeWrapper = this.f215719n;
        ListItemCheckbox listItemCheckbox = (ListItemCheckbox) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.personal_filters_change_dialog_custom_layout, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) contextThemeWrapper.getResources().getDimension(R.dimen.dialog_custom_view_top_margin), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        listItemCheckbox.setLayoutParams(marginLayoutParams);
        listItemCheckbox.setTitle(personalFiltersChangeDialogData.f215765e);
        listItemCheckbox.e(new C13079a(personalFiltersChangeDialogFragment, 5));
        bVar2.setCustomView(listItemCheckbox);
        bVar2.Q3(personalFiltersChangeDialogData.f215764d.f215767b, new j(4, personalFiltersChangeDialogFragment, personalFiltersChangeDialogData));
        bVar2.R3(personalFiltersChangeDialogData.f215766f, new com.avito.android.order.feature.c(personalFiltersChangeDialogFragment, 14));
        return G0.f406611a;
    }
}
