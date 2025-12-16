package KZ;

import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationProcessItemValue.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class C {
    @Y61.l
    public static final A a(@Y61.k B b12) {
        Object next;
        Set setL0 = C42756l.l0(new ApplicationProcessType[]{ApplicationProcessType.NEXT, ApplicationProcessType.SAVE, ApplicationProcessType.CONFIRM_REALTY_OBJECT});
        Iterator<T> it = b12.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (setL0.contains(((A) next).getType())) {
                break;
            }
        }
        return (A) next;
    }

    @Y61.l
    public static final A b(@Y61.k B b12) {
        Object next;
        Iterator<T> it = b12.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((A) next).getType() == ApplicationProcessType.PREVIOUS) {
                break;
            }
        }
        return (A) next;
    }
}
