package com.avito.android.wallet.pin.impl.settings.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletSecuritySettingsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsActor", f = "WalletSecuritySettingsActor.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {UpdateStatusCode.DialogButton.CONFIRM, 107, 107, 112}, m = "onDeepLinkResult", n = {"this", "$this$onDeepLinkResult", "previousState", "deepLinkResult", "this", "$this$onDeepLinkResult", "deepLinkResult", "this", "$this$onDeepLinkResult", "deepLinkResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f328775q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f328776r;

    /* renamed from: s, reason: collision with root package name */
    public Object f328777s;

    /* renamed from: t, reason: collision with root package name */
    public Object f328778t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f328779u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a f328780v;

    /* renamed from: w, reason: collision with root package name */
    public int f328781w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328780v = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f328779u = obj;
        this.f328781w |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f328780v, null, null, null, this);
    }
}
