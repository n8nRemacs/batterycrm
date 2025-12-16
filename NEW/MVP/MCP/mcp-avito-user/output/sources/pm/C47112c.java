package pm;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import lm.C43795c;

/* compiled from: CampaignsSaleRequestBlock.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-network_campaigns-sale"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: pm.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C47112c {
    @l
    public static final C43795c a(@k C47111b c47111b) {
        Object bVar;
        String uuid;
        Integer discount;
        try {
            int i12 = Z.f406624c;
            uuid = c47111b.getUuid();
            discount = c47111b.getDiscount();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (discount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jIntValue = discount.intValue();
        List<Long> listB = c47111b.b();
        if (listB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        bVar = new C43795c(jIntValue, listB, uuid);
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return (C43795c) bVar;
    }
}
