package com.vk.id.internal.auth;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.vk.id.auth.VKIDAuthCallback;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* compiled from: AuthCallbacksHolder.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR:\u0010\u0012\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u0004 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\t0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "", "<init>", "()V", "Lcom/vk/id/auth/VKIDAuthCallback;", "callback", "Lkotlin/G0;", "add", "(Lcom/vk/id/auth/VKIDAuthCallback;)V", "", "getAll", "()Ljava/util/Set;", "clear", "", "isEmpty", "()Z", "", "kotlin.jvm.PlatformType", "authCallbacks", "Ljava/util/Set;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthCallbacksHolder {
    private Set<VKIDAuthCallback> authCallbacks = Collections.newSetFromMap(new ConcurrentHashMap());

    public final void add(@k VKIDAuthCallback callback) {
        this.authCallbacks.add(callback);
    }

    public final void clear() {
        this.authCallbacks.clear();
    }

    @k
    public final Set<VKIDAuthCallback> getAll() {
        return this.authCallbacks;
    }

    public final boolean isEmpty() {
        return this.authCallbacks.isEmpty();
    }
}
