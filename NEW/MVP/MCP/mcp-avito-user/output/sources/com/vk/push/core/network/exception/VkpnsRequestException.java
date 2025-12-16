package com.vk.push.core.network.exception;

import Y61.k;
import kotlin.Metadata;

/* compiled from: VkpnsRequestException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/network/exception/VkpnsRequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sdk-public-push-core-network_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VkpnsRequestException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f367116b;

    /* renamed from: c, reason: collision with root package name */
    public final int f367117c;

    public VkpnsRequestException(@k String str, int i12) {
        super(str);
        this.f367116b = str;
        this.f367117c = i12;
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f367116b;
    }
}
