package com.vk.id.internal.auth.app;

import Y61.k;
import Y61.l;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: SilentAuthServicesProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u0004\u0018\u00010\u000b*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006!"}, d2 = {"Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "packageManager", "", "currentPackageName", "Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "cache", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Ljava/lang/String;Lcom/vk/id/internal/auth/app/TrustedProvidersCache;)V", "Lkotlin/sequences/m;", "Lcom/vk/id/internal/auth/app/VkAuthProviderInfo;", "excludeCurrentApp", "(Lkotlin/sequences/m;)Lkotlin/sequences/m;", "", "isAllowedToOpenWebAuth", "(Lcom/vk/id/internal/auth/app/VkAuthProviderInfo;)Z", "Landroid/content/pm/ServiceInfo;", "", "Lcom/vk/id/internal/auth/app/VkAuthSilentAuthProvider;", "trustedProviders", "mapToProviderInfo", "(Landroid/content/pm/ServiceInfo;Ljava/util/List;)Lcom/vk/id/internal/auth/app/VkAuthProviderInfo;", "Landroid/content/pm/ResolveInfo;", "getAppsWithSilentAuthServices", "()Ljava/util/List;", "Lcom/vk/id/internal/auth/app/SilentAuthProviderData;", "getSilentAuthServices", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "Ljava/lang/String;", "Lcom/vk/id/internal/auth/app/TrustedProvidersCache;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SilentAuthServicesProvider {

    @k
    private final TrustedProvidersCache cache;

    @k
    private final String currentPackageName;

    @k
    private final InternalVKIDPackageManager packageManager;
    public static final int $stable = 8;

    /* compiled from: SilentAuthServicesProvider.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.internal.auth.app.SilentAuthServicesProvider", f = "SilentAuthServicesProvider.kt", i = {0}, l = {19}, m = "getSilentAuthServices", n = {"this"}, s = {"L$0"})
    /* renamed from: com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return SilentAuthServicesProvider.this.getSilentAuthServices(this);
        }
    }

    public SilentAuthServicesProvider(@k InternalVKIDPackageManager internalVKIDPackageManager, @k String str, @k TrustedProvidersCache trustedProvidersCache) {
        this.packageManager = internalVKIDPackageManager;
        this.currentPackageName = str;
        this.cache = trustedProvidersCache;
    }

    private final InterfaceC43030m<VkAuthProviderInfo> excludeCurrentApp(InterfaceC43030m<VkAuthProviderInfo> interfaceC43030m) {
        return C43033p.i(interfaceC43030m, new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeCurrentApp$lambda$4(SilentAuthServicesProvider silentAuthServicesProvider, VkAuthProviderInfo vkAuthProviderInfo) {
        return !L.f(vkAuthProviderInfo.getComponentName().getPackageName(), silentAuthServicesProvider.currentPackageName);
    }

    private final List<ResolveInfo> getAppsWithSilentAuthServices() {
        return this.packageManager.queryIntentServices(new Intent("com.vk.silentauth.action.GET_INFO"), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VkAuthProviderInfo getSilentAuthServices$lambda$0(SilentAuthServicesProvider silentAuthServicesProvider, List list, ResolveInfo resolveInfo) {
        return silentAuthServicesProvider.mapToProviderInfo(resolveInfo.serviceInfo, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SilentAuthProviderData getSilentAuthServices$lambda$3(VkAuthProviderInfo vkAuthProviderInfo) {
        return new SilentAuthProviderData(vkAuthProviderInfo.getComponentName(), vkAuthProviderInfo.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAllowedToOpenWebAuth(VkAuthProviderInfo vkAuthProviderInfo) {
        ResolveInfo resolveInfoResolveActivity = this.packageManager.resolveActivity(new Intent("android.intent.action.VIEW", AuthOptionsKt.basicCodeFlowUri(vkAuthProviderInfo.getComponentName().getPackageName())), 0);
        ActivityInfo activityInfo = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo : null;
        return activityInfo != null && L.f(activityInfo.packageName, vkAuthProviderInfo.getComponentName().getPackageName());
    }

    private final VkAuthProviderInfo mapToProviderInfo(ServiceInfo serviceInfo, List<VkAuthSilentAuthProvider> list) {
        Object next;
        String strCalculateDigestHex = SilentAuthInfoUtils.INSTANCE.calculateDigestHex(this.packageManager, serviceInfo.packageName);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            VkAuthSilentAuthProvider vkAuthSilentAuthProvider = (VkAuthSilentAuthProvider) next;
            if (L.f(serviceInfo.packageName, vkAuthSilentAuthProvider.getAppPackage()) && L.f(strCalculateDigestHex, vkAuthSilentAuthProvider.getAppSha())) {
                break;
            }
        }
        VkAuthSilentAuthProvider vkAuthSilentAuthProvider2 = (VkAuthSilentAuthProvider) next;
        if (vkAuthSilentAuthProvider2 != null) {
            return new VkAuthProviderInfo(new ComponentName(serviceInfo.packageName, serviceInfo.name), vkAuthSilentAuthProvider2.getWeight());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSilentAuthServices(@Y61.k kotlin.coroutines.Continuation<? super java.util.List<com.vk.id.internal.auth.app.SilentAuthProviderData>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.vk.id.internal.auth.app.SilentAuthServicesProvider.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$1 r0 = (com.vk.id.internal.auth.app.SilentAuthServicesProvider.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$1 r0 = new com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.vk.id.internal.auth.app.SilentAuthServicesProvider r0 = (com.vk.id.internal.auth.app.SilentAuthServicesProvider) r0
            kotlin.C42729a0.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            com.vk.id.internal.auth.app.TrustedProvidersCache r5 = r4.cache
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getSilentAuthProviders(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.util.List r5 = (java.util.List) r5
            java.util.List r1 = r0.getAppsWithSilentAuthServices()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.s0 r2 = new kotlin.collections.s0
            r2.<init>(r1)
            M11.c r1 = new M11.c
            r3 = 3
            r1.<init>(r3, r0, r5)
            kotlin.sequences.h r5 = kotlin.sequences.C43033p.y(r2, r1)
            kotlin.sequences.m r5 = r0.excludeCurrentApp(r5)
            com.vk.id.internal.auth.app.a r1 = new com.vk.id.internal.auth.app.a
            r2 = 0
            r1.<init>(r0, r2)
            kotlin.sequences.h r5 = kotlin.sequences.C43033p.i(r5, r1)
            com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1 r0 = new com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1
            r0.<init>()
            kotlin.sequences.f0 r1 = new kotlin.sequences.f0
            r1.<init>(r5, r0)
            P11.a r5 = new P11.a
            r0 = 24
            r5.<init>(r0)
            kotlin.sequences.o0 r0 = new kotlin.sequences.o0
            r0.<init>(r1, r5)
            java.util.List r5 = kotlin.sequences.C43033p.D(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.internal.auth.app.SilentAuthServicesProvider.getSilentAuthServices(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
