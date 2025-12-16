package sY;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.master_plan.MasterPlanLinkData;
import com.avito.android.master_plan.MasterPlanShowLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MasterPlanShowLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LsY/f;", "LKu/a;", "Lcom/avito/android/master_plan/MasterPlanShowLink;", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends AbstractC14350a<MasterPlanShowLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("selectedBuildingId");
        try {
            Type type = new e().getType();
            String queryParameter2 = uri.getQueryParameter("data");
            return new MasterPlanShowLink(queryParameter, (MasterPlanLinkData) (queryParameter2 != null ? gson.e(queryParameter2, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "data", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
