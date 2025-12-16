package com.avito.android.employee_mode_impl.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmployeeModeSwitchLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmployeeModeSwitchLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/employee_mode_impl/deeplink/k;", "LKu/a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends AbstractC14350a<EmployeeModeSwitchLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("isOn", false);
        String queryParameter = uri.getQueryParameter("then");
        return new EmployeeModeSwitchLink(booleanQueryParameter, queryParameter != null ? xVar.b(queryParameter) : null, false, EmployeeModeSwitchLink.SwitchSource.f133305d);
    }
}
