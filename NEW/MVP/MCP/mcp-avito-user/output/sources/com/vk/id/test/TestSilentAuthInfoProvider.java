package com.vk.id.test;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.vk.dto.common.id.UserId;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.silentauth.SilentAuthInfo;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TestSilentAuthInfoProvider.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/id/test/TestSilentAuthInfoProvider;", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "<init>", "()V", "", "timeout", "", "Lcom/vk/silentauth/SilentAuthInfo;", "getSilentAuthInfos", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "appId", "Lkotlin/G0;", "setAppId", "(I)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TestSilentAuthInfoProvider implements SilentAuthInfoProvider {
    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    public long getDefaultTimeout() {
        return SilentAuthInfoProvider.DefaultImpls.getDefaultTimeout(this);
    }

    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    @l
    public Object getSilentAuthInfos(long j12, @k Continuation<? super List<SilentAuthInfo>> continuation) {
        return Collections.singletonList(new SilentAuthInfo(UserId.f366760c, "uuid", "token", 1000 + System.currentTimeMillis(), null, null, null, null, null, null, null, null, 0, null, null, null, 0, 131056, null));
    }

    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    public void setAppId(int appId) {
    }
}
