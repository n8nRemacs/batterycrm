package GN0;

import Y61.k;
import Y61.l;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Category.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_virtual-deal-room_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    @l
    public static final Category a(@k String str) {
        for (Category category : Category.f326475i) {
            if (L.f(category.f326476b, str)) {
                return category;
            }
        }
        return null;
    }
}
