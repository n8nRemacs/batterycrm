package com.vk.push.core.network.exception;

import Y61.k;
import kotlin.Metadata;

/* compiled from: VkpnsRequestWithErrorBodyException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/network/exception/VkpnsRequestWithErrorBodyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sdk-public-push-core-network_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VkpnsRequestWithErrorBodyException extends Exception {
    public VkpnsRequestWithErrorBodyException(@k String str) {
        super("Request ended with: ".concat(str));
    }
}
