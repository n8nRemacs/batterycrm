package n01;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import java.util.Arrays;

/* compiled from: PushClientBuilder.java */
/* renamed from: n01.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44164b extends AbstractClientBuilder<C44163a, Api.ApiOptions.NoOptions> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public final AnyClient buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        clientSettings.setApiName(Arrays.asList(HuaweiApiAvailability.HMS_API_NAME_PUSH, "Core.API"));
        return new C44163a(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
