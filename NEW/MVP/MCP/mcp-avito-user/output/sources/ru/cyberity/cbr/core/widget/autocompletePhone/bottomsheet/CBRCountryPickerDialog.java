package ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.analytics.f;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBRDefaultCountryPickerKt;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog;

/* compiled from: CBRCountryPickerDialog.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\b2\n\u0010\u0010\u001a\u00060\u000fR\u00020\u00012\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRCountryPickerDialog;", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "getThemeBackgroundColor", "(Landroid/view/View;)Ljava/lang/Integer;", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;", "holder", "position", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "item", "bindItemViewHolder", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;ILru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;)V", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "value", "countryPickerCallBack", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "getCountryPickerCallBack", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "setCountryPickerCallBack", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;)V", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRCountryPickerDialog extends CBRPickerDialog {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private CBRCountryPicker.CBRCountryPickerCallBack countryPickerCallBack;

    /* compiled from: CBRCountryPickerDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRCountryPickerDialog$Companion;", "", "()V", "TAG", "", "newInstance", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRCountryPickerDialog;", "items", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "requestKey", "resultKey", "([Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;Ljava/lang/String;Ljava/lang/String;)Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRCountryPickerDialog;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final CBRCountryPickerDialog newInstance(@k CBRCountryPicker.CountryItem[] items, @l String requestKey, @l String resultKey) {
            CBRCountryPickerDialog cBRCountryPickerDialog = new CBRCountryPickerDialog();
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList(items.length);
            for (CBRCountryPicker.CountryItem countryItem : items) {
                arrayList.add(new CBRPickerDialog.Item(countryItem.getCode(), countryItem.getName()));
            }
            bundle.putParcelableArray("extra_items", (CBRPickerDialog.Item[]) arrayList.toArray(new CBRPickerDialog.Item[0]));
            bundle.putInt("extra_item_layout_id", R.layout.cbr_countries_list_item);
            bundle.putBoolean("extra_show_search", true);
            bundle.putBoolean("extra_sort", true);
            if (requestKey != null) {
                bundle.putString("extra_request_key", requestKey);
            }
            if (resultKey != null) {
                bundle.putString("EXTRA_RESULT_KEY", resultKey);
            }
            cBRCountryPickerDialog.setArguments(bundle);
            return cBRCountryPickerDialog;
        }

        private Companion() {
        }
    }

    @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog
    public void bindItemViewHolder(@k CBRPickerDialog.PickerItemViewHolder holder, int position, @k CBRPickerDialog.Item item) {
        super.bindItemViewHolder(holder, position, item);
        ((ImageView) holder.itemView.findViewById(android.R.id.icon)).setImageDrawable(CBRDefaultCountryPickerKt.getFlagDrawable(new CBRCountryPicker.CountryItem(item.getId(), item.getTitle()), requireContext()));
    }

    @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog
    @l
    public Integer getThemeBackgroundColor(@k View view) {
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            return themeHelper.getColor(customTheme, CBRColorElement.BACKGROUND_COMMON, themeHelper.isDarkTheme(view));
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ru.cyberity.cbr.core.analytics.l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().j().c(), false, 1, null);
        super.onResume();
    }

    @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) throws Resources.NotFoundException {
        super.onViewCreated(view, savedInstanceState);
        ru.cyberity.cbr.core.analytics.l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().b().c(), false, 1, null);
    }

    public final void setCountryPickerCallBack(@l final CBRCountryPicker.CBRCountryPickerCallBack cBRCountryPickerCallBack) {
        setPickerCallBack(new CBRPickerDialog.PickerCallBack() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRCountryPickerDialog$countryPickerCallBack$1
            @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog.PickerCallBack
            public void onCancel() {
                ru.cyberity.cbr.core.analytics.l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().m().c(), false, 1, null);
            }

            @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog.PickerCallBack
            public void onDialogClose() {
                super.onDialogClose();
                ru.cyberity.cbr.core.analytics.l.a(f.a(0L, 1, null).a(Screen.CountriesScreen).a().o().c(), false, 1, null);
            }

            @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog.PickerCallBack
            public void onDismiss() {
                CBRCountryPicker.CBRCountryPickerCallBack cBRCountryPickerCallBack2 = cBRCountryPickerCallBack;
                if (cBRCountryPickerCallBack2 != null) {
                    cBRCountryPickerCallBack2.onDismiss();
                }
            }

            @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog.PickerCallBack
            public void onItemSelected(@k CBRPickerDialog.Item item) {
                CBRCountryPicker.CBRCountryPickerCallBack cBRCountryPickerCallBack2 = cBRCountryPickerCallBack;
                if (cBRCountryPickerCallBack2 != null) {
                    cBRCountryPickerCallBack2.onItemSelected(new CBRCountryPicker.CountryItem(item.getId(), item.getTitle()));
                }
            }
        });
        this.countryPickerCallBack = cBRCountryPickerCallBack;
    }
}
