package com.vk.id.internal.auth;

import Y61.k;
import Y61.l;
import com.vk.id.auth.VKIDAuthParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AuthProvidersChooser.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/internal/auth/AuthProvidersChooser;", "", "chooseBest", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "params", "Lcom/vk/id/auth/VKIDAuthParams;", "(Lcom/vk/id/auth/VKIDAuthParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AuthProvidersChooser {
    @l
    Object chooseBest(@k VKIDAuthParams vKIDAuthParams, @k Continuation<? super VKIDAuthProvider> continuation);
}
