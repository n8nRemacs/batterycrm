package com.vk.id.internal.auth.app;

import Y61.k;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.vk.id.internal.auth.AuthOptions;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.auth.VKIDAuthProvider;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import kotlin.Metadata;

/* compiled from: AppAuthProvider.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/id/internal/auth/app/AppAuthProvider;", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "starter", "", "appPackage", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDActivityStarter;Ljava/lang/String;)V", "Lcom/vk/id/internal/auth/AuthOptions;", "authOptions", "Lkotlin/G0;", "auth", "(Lcom/vk/id/internal/auth/AuthOptions;)V", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "Ljava/lang/String;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppAuthProvider implements VKIDAuthProvider {

    @k
    private final String appPackage;

    @k
    private final InternalVKIDActivityStarter starter;

    public AppAuthProvider(@k InternalVKIDActivityStarter internalVKIDActivityStarter, @k String str) {
        this.starter = internalVKIDActivityStarter;
        this.appPackage = str;
    }

    @Override // com.vk.id.internal.auth.VKIDAuthProvider
    public void auth(@k AuthOptions authOptions) {
        this.starter.startActivity(new Intent("android.intent.action.VIEW", AuthOptionsKt.toAuthUriCodeFlow(authOptions, this.appPackage)));
    }
}
