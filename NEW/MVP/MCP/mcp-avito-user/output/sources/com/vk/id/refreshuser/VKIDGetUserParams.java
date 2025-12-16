package com.vk.id.refreshuser;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKIDGetUserParams.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0015\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/vk/id/refreshuser/VKIDGetUserParams;", "", "refreshTokenState", "", "<init>", "(Ljava/lang/String;)V", "getRefreshTokenState$vkid_release", "()Ljava/lang/String;", "Builder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDGetUserParams {

    @l
    private final String refreshTokenState;

    /* compiled from: VKIDGetUserParams.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/refreshuser/VKIDGetUserParams$Builder;", "", "<init>", "()V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
    }

    public /* synthetic */ VKIDGetUserParams(String str, C42822w c42822w) {
        this(str);
    }

    @l
    /* renamed from: getRefreshTokenState$vkid_release, reason: from getter */
    public final String getRefreshTokenState() {
        return this.refreshTokenState;
    }

    private VKIDGetUserParams(String str) {
        this.refreshTokenState = str;
    }

    public /* synthetic */ VKIDGetUserParams(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}
