package uZ;

import Y61.l;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import kotlin.Metadata;

/* compiled from: MnzFloatingFooter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: uZ.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49006c {
    @l
    public static final MnzFloatingFooter a(@l MnzFloatingFooter mnzFloatingFooter, @l MnzFloatingFooterContact mnzFloatingFooterContact, boolean z12) {
        MnzFloatingFooter mnzFloatingFooterA = null;
        mnzFloatingFooterA = null;
        if (z12) {
            if (mnzFloatingFooter != null) {
                MnzFloatingFooterContacts contacts = mnzFloatingFooter.getContacts();
                return MnzFloatingFooter.a(mnzFloatingFooter, contacts != null ? MnzFloatingFooterContacts.a(contacts, mnzFloatingFooterContact) : null);
            }
        } else {
            if (mnzFloatingFooterContact == null) {
                return mnzFloatingFooter;
            }
            if (mnzFloatingFooter != null) {
                MnzFloatingFooterContacts contacts2 = mnzFloatingFooter.getContacts();
                mnzFloatingFooterA = MnzFloatingFooter.a(mnzFloatingFooter, contacts2 != null ? MnzFloatingFooterContacts.a(contacts2, mnzFloatingFooterContact) : null);
            }
            if (mnzFloatingFooterA == null) {
                return mnzFloatingFooter;
            }
        }
        return mnzFloatingFooterA;
    }
}
