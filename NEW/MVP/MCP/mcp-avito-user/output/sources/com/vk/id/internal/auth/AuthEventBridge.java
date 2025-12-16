package com.vk.id.internal.auth;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AuthEventBridge.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/vk/id/internal/auth/AuthEventBridge;", "", "<init>", "()V", "Lcom/vk/id/internal/auth/AuthResult;", "authResult", "Lkotlin/G0;", "onAuthResult$vkid_release", "(Lcom/vk/id/internal/auth/AuthResult;)V", "onAuthResult", "Lcom/vk/id/internal/auth/AuthEventBridge$Listener;", "listener", "Lcom/vk/id/internal/auth/AuthEventBridge$Listener;", "getListener$vkid_release", "()Lcom/vk/id/internal/auth/AuthEventBridge$Listener;", "setListener$vkid_release", "(Lcom/vk/id/internal/auth/AuthEventBridge$Listener;)V", "Listener", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthEventBridge {

    @l
    private static Listener listener;

    @k
    public static final AuthEventBridge INSTANCE = new AuthEventBridge();
    public static final int $stable = 8;

    /* compiled from: AuthEventBridge.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/internal/auth/AuthEventBridge$Listener;", "", "Lcom/vk/id/internal/auth/AuthResult;", "authResult", "Lkotlin/G0;", "onAuthResult", "(Lcom/vk/id/internal/auth/AuthResult;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onAuthResult(@k AuthResult authResult);
    }

    private AuthEventBridge() {
    }

    public final void onAuthResult$vkid_release(@k AuthResult authResult) {
        Listener listener2 = listener;
        if (listener2 != null) {
            listener2.onAuthResult(authResult);
        }
    }

    public final void setListener$vkid_release(@l Listener listener2) {
        listener = listener2;
    }
}
