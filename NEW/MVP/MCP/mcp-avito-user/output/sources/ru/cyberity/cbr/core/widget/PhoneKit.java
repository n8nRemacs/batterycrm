package ru.cyberity.cbr.core.widget;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener;

/* compiled from: PhoneKit.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001BK\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/cyberity/cbr/core/widget/PhoneKit;", "", "", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "countries", "Lru/cyberity/cbr/core/data/model/remote/c;", "Lru/cyberity/cbr/core/data/model/PhoneCountryCodeWithMasks;", "phoneMasks", "Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "validListener", "<init>", "(Ljava/util/Map;Ljava/util/Map;Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;)V", "Landroid/os/Bundle;", "outState", "Lkotlin/G0;", "saveInstanceState", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "detach", "(Landroid/content/Context;)V", "Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "input", "", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "defaultCountry", "savedInstanceState", "attachToInput", "(Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;Ljava/util/List;Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;Landroid/os/Bundle;)V", "country", "", "isUser", "setCountry", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;Z)V", "Ljava/util/Map;", "getCountries", "()Ljava/util/Map;", "getPhoneMasks", "Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "getValidListener", "()Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "isValid", "()Z", "getCountry", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "getMask", "()Lru/cyberity/cbr/core/data/model/remote/c;", "mask", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class PhoneKit {

    @l
    private final Map<String, String> countries;

    @l
    private final Map<String, ru.cyberity.cbr.core.data.model.remote.c> phoneMasks;

    @l
    private final ValidationListener validListener;

    public PhoneKit(@l Map<String, String> map, @l Map<String, ru.cyberity.cbr.core.data.model.remote.c> map2, @l ValidationListener validationListener) {
        this.countries = map;
        this.phoneMasks = map2;
        this.validListener = validationListener;
    }

    public static /* synthetic */ void attachToInput$default(PhoneKit phoneKit, CBRFlaggedInputLayout cBRFlaggedInputLayout, List list, CBRCountryPicker.CountryItem countryItem, Bundle bundle, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachToInput");
        }
        if ((i12 & 8) != 0) {
            bundle = null;
        }
        phoneKit.attachToInput(cBRFlaggedInputLayout, list, countryItem, bundle);
    }

    @l
    public abstract CBRCountryPicker.CountryItem getCountry();

    @l
    public abstract ru.cyberity.cbr.core.data.model.remote.c getMask();

    @l
    public final Map<String, ru.cyberity.cbr.core.data.model.remote.c> getPhoneMasks() {
        return this.phoneMasks;
    }

    public abstract boolean isValid();

    public /* synthetic */ PhoneKit(Map map, Map map2, ValidationListener validationListener, int i12, C42822w c42822w) {
        this(map, map2, (i12 & 4) != 0 ? null : validationListener);
    }

    public void detach(@l Context context) {
    }

    public void saveInstanceState(@k Bundle outState) {
    }

    public void setCountry(@l CBRCountryPicker.CountryItem country, boolean isUser) {
    }

    public void attachToInput(@k CBRFlaggedInputLayout input, @k List<CBRCountryPicker.CountryItem> countries, @l CBRCountryPicker.CountryItem defaultCountry, @l Bundle savedInstanceState) {
    }
}
