package com.avito.android.user_stats.extended_user_stats.list_search_dialog.item;

import Y41.l;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: CheckBoxView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/item/g;", "Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f317267b;

    /* renamed from: c, reason: collision with root package name */
    public final ListItemCheckbox f317268c;

    /* compiled from: CheckBoxView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CheckboxType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckboxType checkboxType = CheckboxType.f317256b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckboxType checkboxType2 = CheckboxType.f317256b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: CheckBoxView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f317269l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ CheckBoxData f317270m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CheckBoxData checkBoxData, i iVar) {
            super(1);
            this.f317269l = iVar;
            this.f317270m = checkBoxData;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            this.f317269l.a(this.f317270m.f317249c, zBooleanValue);
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        this.f317267b = view;
        this.f317268c = (ListItemCheckbox) view.findViewById(R.id.lic_item);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.f
    public final void VI(@k CheckBoxData checkBoxData, @k i iVar) {
        ToggleState.ToggleValue toggleValue;
        int iB2 = y6.b((checkBoxData.f317252f * 22) + 16);
        int iB3 = y6.b(16);
        ListItemCheckbox listItemCheckbox = this.f317268c;
        listItemCheckbox.setPadding(iB2, 0, iB3, 0);
        int iOrdinal = checkBoxData.f317251e.ordinal();
        if (iOrdinal == 0) {
            toggleValue = ToggleState.ToggleValue.f181170d;
        } else if (iOrdinal == 1) {
            toggleValue = ToggleState.ToggleValue.f181168b;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toggleValue = ToggleState.ToggleValue.f181169c;
        }
        ToggleState.ToggleValue toggleValue2 = toggleValue;
        Boolean bool = checkBoxData.f317255i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : true;
        listItemCheckbox.setState((kV.b) new kV.c(checkBoxData.f317250d, null, null, null, null, zBooleanValue2, null, new ToggleState(new b(checkBoxData, iVar), false, false, false, toggleValue2, 14, null), zBooleanValue, false, null, null, 3678, null));
    }
}
