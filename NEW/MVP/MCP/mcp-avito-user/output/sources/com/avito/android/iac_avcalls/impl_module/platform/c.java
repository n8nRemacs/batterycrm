package com.avito.android.iac_avcalls.impl_module.platform;

import Y61.k;
import Y61.l;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCallState;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsCreateCallMetaInfo;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.d2;

/* compiled from: AvCallsPlatformWithCoroutines.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/c;", "", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c {
    void a(@k String str, boolean z12);

    boolean b(@k String str, @k String str2);

    void c(@k String str, boolean z12);

    void d(@k AvCallsCameraPosition avCallsCameraPosition);

    void e(@k String str, boolean z12, @k MJ.a aVar);

    @l
    Object f(@k String str, @k String str2, @k String str3, boolean z12, @k AvCallsCreateCallMetaInfo avCallsCreateCallMetaInfo, @k Continuation<? super AvCallsCallState> continuation);

    void g(@k String str, boolean z12, @k MJ.a aVar);

    @k
    JJ.b getConfig();

    @l
    Object h(@k String str, @k AvCallsTerminateReason avCallsTerminateReason, @k Continuation<? super G0> continuation);

    @k
    d2<AvCallsEvent> i();

    @l
    Object j(@k String str, @k Continuation<? super G0> continuation);

    @l
    Object k(@k String str, @k Continuation<? super G0> continuation);

    @l
    Object l(@k IacPiiString iacPiiString, @k Continuation<? super G0> continuation);

    @l
    Object m(@k IacPiiString iacPiiString, @k Continuation<? super G0> continuation);

    @l
    Object n(@k String str, @k Continuation<? super G0> continuation);
}
