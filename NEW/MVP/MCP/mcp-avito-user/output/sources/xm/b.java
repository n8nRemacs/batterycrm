package XM;

import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.bottom_sheet.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ImvCarsAllAffectingParamsBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXM/b;", "", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f18855a;

    public b(@k Context context, @k String str) {
        d dVar = new d(context, 0, 2, null);
        dVar.setContentView(R.layout.imv_cars_all_affecting_params_content);
        j.c(dVar, str, false, 0, 0, 0, WebSocketProtocol.PAYLOAD_SHORT);
        this.f18855a = dVar;
    }
}
