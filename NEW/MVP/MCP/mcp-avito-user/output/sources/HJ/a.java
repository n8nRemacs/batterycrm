package HJ;

import Y61.k;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallState;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvCallsPlatform.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHJ/a;", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    void a(@k String str, boolean z12);

    boolean b(@k String str, @k String str2);

    void c(@k String str, boolean z12);

    void d(@k AvCallsCameraPosition avCallsCameraPosition);

    void e(@k String str, boolean z12, @k MJ.a aVar);

    @k
    z<AvCallsEvent> f();

    void g(@k String str, boolean z12, @k MJ.a aVar);

    @k
    JJ.b getConfig();

    @k
    I<G0> h(@k String str, @k AvCallsTerminateReason avCallsTerminateReason);

    @k
    I<G0> i(@k String str);

    @k
    I<G0> j(@k String str);

    @k
    I<G0> k(@k IacPiiString iacPiiString);

    @k
    I<G0> l(@k String str);

    @k
    I<G0> m(@k IacPiiString iacPiiString);

    @k
    I<AvCallsCallState> n(@k String str, @k String str2, @k String str3, boolean z12, @k AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo);
}
