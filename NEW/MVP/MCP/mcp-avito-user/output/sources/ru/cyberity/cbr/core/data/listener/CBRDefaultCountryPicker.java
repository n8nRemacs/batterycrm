package ru.cyberity.cbr.core.data.listener;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRCountryPickerDialog;

/* compiled from: CBRDefaultCountryPicker.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRDefaultCountryPicker;", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "items", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "callback", "", "requestKey", "resultKey", "Lkotlin/G0;", "pickCountry", "(Landroid/content/Context;Ljava/util/List;Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;Ljava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRDefaultCountryPicker implements CBRCountryPicker {
    @Override // ru.cyberity.cbr.core.data.listener.CBRCountryPicker
    public void pickCountry(@k Context context, @k List<CBRCountryPicker.CountryItem> items, @l CBRCountryPicker.CBRCountryPickerCallBack callback, @l String requestKey, @l String resultKey) {
        FragmentManager supportFragmentManager;
        ActivityC22955m activityC22955m = context instanceof ActivityC22955m ? (ActivityC22955m) context : null;
        if (activityC22955m == null || (supportFragmentManager = activityC22955m.getSupportFragmentManager()) == null || supportFragmentManager.H("CBRCountryPickerDialog") != null) {
            return;
        }
        CBRCountryPickerDialog cBRCountryPickerDialogNewInstance = CBRCountryPickerDialog.INSTANCE.newInstance((CBRCountryPicker.CountryItem[]) items.toArray(new CBRCountryPicker.CountryItem[0]), requestKey, resultKey);
        cBRCountryPickerDialogNewInstance.setCountryPickerCallBack(callback);
        cBRCountryPickerDialogNewInstance.show(supportFragmentManager, "CBRCountryPickerDialog");
    }
}
