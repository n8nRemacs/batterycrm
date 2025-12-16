package wZ;

import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wZ.g;
import wZ.k;

/* compiled from: MnzFloatingFooterDomain.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h {
    @Y61.k
    public static final C49582f a(@Y61.k MnzFloatingFooterContact mnzFloatingFooterContact) {
        k kVarA;
        int count = mnzFloatingFooterContact.getCount();
        float progress = mnzFloatingFooterContact.getProgress();
        AttributedText text = mnzFloatingFooterContact.getText();
        String iconName = mnzFloatingFooterContact.getIconName();
        UniversalColor progressColor = mnzFloatingFooterContact.getProgressColor();
        if (progressColor != null) {
            k.f441571d.getClass();
            kVarA = k.a.a(progressColor);
        } else {
            kVarA = null;
        }
        return new C49582f(count, progress, text, iconName, kVarA);
    }

    @Y61.k
    public static final g b(@Y61.k MnzFloatingFooter mnzFloatingFooter) {
        AttributedText terms = mnzFloatingFooter.getTerms();
        C49578b c49578bA = C49579c.a(mnzFloatingFooter.getButton());
        ButtonAction secondButton = mnzFloatingFooter.getSecondButton();
        g.a aVar = null;
        C49578b c49578bA2 = secondButton != null ? C49579c.a(secondButton) : null;
        MnzFloatingFooterContacts contacts = mnzFloatingFooter.getContacts();
        if (contacts != null) {
            AttributedText text = contacts.getText();
            MnzFloatingFooterContact current = contacts.getCurrent();
            aVar = new g.a(text, current != null ? a(current) : null);
        }
        return new g(aVar, terms, c49578bA, c49578bA2, null, 16, null);
    }
}
