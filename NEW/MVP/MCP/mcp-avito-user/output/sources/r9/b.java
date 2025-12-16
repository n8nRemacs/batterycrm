package R9;

import Y61.k;
import Y61.l;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;

/* compiled from: SafeDealComponents.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {
    @l
    public static final ContactBar.Button.Target a(@k SafeDeal.Component.Button button) {
        DeepLink deepLink = button.getDeepLink();
        if (deepLink == null) {
            return null;
        }
        String id2 = button.getId();
        String title = button.getTitle();
        String secondaryText = button.getSecondaryText();
        Boolean isLoading = button.getIsLoading();
        return new ContactBar.Button.Target(title, secondaryText, deepLink, isLoading != null ? isLoading.booleanValue() : false, button.getTheme(), button.getStyle(), null, ContactBar.Button.Target.Type.f125085b, null, false, id2, 768, null);
    }
}
