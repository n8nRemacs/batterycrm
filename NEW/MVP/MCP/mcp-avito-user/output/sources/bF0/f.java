package bf0;

import Y61.l;
import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.search.Theme;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ContactMethodSlotWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbf0/f;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface f {

    /* compiled from: ContactMethodSlotWrapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Y61.k
        public static SelectParameter.Flat a(@Y61.k f fVar) {
            return ((ContactMethodSlotConfig) fVar.getF58084a().getWidget().getConfig()).getField();
        }
    }

    @Y61.k
    f.c b(@Y61.k ParameterSlot parameterSlot);

    @Y61.k
    C41998x0 c();

    @Y61.k
    com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar);

    @Y61.k
    ArrayList e(@l Theme theme);

    @Y61.k
    /* renamed from: f */
    ContactMethodSlot getF58084a();
}
