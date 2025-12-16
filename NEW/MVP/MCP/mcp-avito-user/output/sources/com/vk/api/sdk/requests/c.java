package com.vk.api.sdk.requests;

import Y41.l;
import com.vk.dto.common.id.UserId;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VKRequest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/vk/dto/common/id/UserId;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class c extends N implements l<UserId, CharSequence> {
    static {
        new c();
    }

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(UserId userId) {
        return String.valueOf(userId.f366761b);
    }
}
