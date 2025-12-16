package com.vk.id.internal.auth;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthProvidersChooserDefault.kt */
@P
@s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vk/id/internal/auth/AuthProvidersChooserDefault;", "Lcom/vk/id/internal/auth/AuthProvidersChooser;", "packageManager", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "silentAuthServicesProvider", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "activityStarter", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;Lcom/vk/id/internal/context/InternalVKIDActivityStarter;)V", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "chooseBest", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "params", "Lcom/vk/id/auth/VKIDAuthParams;", "(Lcom/vk/id/auth/VKIDAuthParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthProvidersChooserDefault implements AuthProvidersChooser {

    @k
    private final InternalVKIDActivityStarter activityStarter;

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("AuthProvidersChooserDefault");

    @k
    private final InternalVKIDPackageManager packageManager;

    @k
    private final SilentAuthServicesProvider silentAuthServicesProvider;

    /* compiled from: AuthProvidersChooserDefault.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.vk.id.internal.auth.AuthProvidersChooserDefault", f = "AuthProvidersChooserDefault.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "chooseBest", n = {"this"}, s = {"L$0"})
    /* renamed from: com.vk.id.internal.auth.AuthProvidersChooserDefault$chooseBest$1, reason: invalid class name */
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
            return AuthProvidersChooserDefault.this.chooseBest(null, this);
        }
    }

    public AuthProvidersChooserDefault(@k InternalVKIDPackageManager internalVKIDPackageManager, @k SilentAuthServicesProvider silentAuthServicesProvider, @k InternalVKIDActivityStarter internalVKIDActivityStarter) {
        this.packageManager = internalVKIDPackageManager;
        this.silentAuthServicesProvider = silentAuthServicesProvider;
        this.activityStarter = internalVKIDActivityStarter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.vk.id.internal.auth.AuthProvidersChooser
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object chooseBest(@Y61.k com.vk.id.auth.VKIDAuthParams r11, @Y61.k kotlin.coroutines.Continuation<? super com.vk.id.internal.auth.VKIDAuthProvider> r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.internal.auth.AuthProvidersChooserDefault.chooseBest(com.vk.id.auth.VKIDAuthParams, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
