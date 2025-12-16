package y01;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* compiled from: OpenDeviceHmsClientBuilder.java */
/* renamed from: y01.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C50034e extends AbstractClientBuilder<C50033d, f> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public final AnyClient buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new C50033d(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
