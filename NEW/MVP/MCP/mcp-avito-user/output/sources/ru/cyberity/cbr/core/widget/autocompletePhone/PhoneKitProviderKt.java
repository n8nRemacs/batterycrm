package ru.cyberity.cbr.core.widget.autocompletePhone;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout;
import ru.cyberity.cbr.core.widget.PhoneKit;

/* compiled from: PhoneKitProvider.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a^\u0010\u000e\u001a\u00020\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00042\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002j\u0004\u0018\u0001`\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "input", "", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "countries", "Lru/cyberity/cbr/core/data/model/remote/c;", "Lru/cyberity/cbr/core/data/model/PhoneCountryCodeWithMasks;", "phoneMasks", "Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "validationListener", "", "initialValue", "Lru/cyberity/cbr/core/widget/PhoneKit;", "getPhoneKit", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class PhoneKitProviderKt {
    @k
    public static final PhoneKit getPhoneKit(@l CBRFlaggedInputLayout cBRFlaggedInputLayout, @l Map<String, String> map, @l Map<String, c> map2, @l ValidationListener validationListener, @l CharSequence charSequence) {
        return new PhoneNumberKitV2(cBRFlaggedInputLayout, map, map2, validationListener, charSequence);
    }

    public static /* synthetic */ PhoneKit getPhoneKit$default(CBRFlaggedInputLayout cBRFlaggedInputLayout, Map map, Map map2, ValidationListener validationListener, CharSequence charSequence, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            charSequence = null;
        }
        return getPhoneKit(cBRFlaggedInputLayout, map, map2, validationListener, charSequence);
    }
}
