package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ForceUpdateRootBootstrap.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.forceupdate.screens.forceupdateroot.mvi.ForceUpdateRootBootstrap", f = "ForceUpdateRootBootstrap.kt", i = {0}, l = {46, 47}, m = "openMavInWebView", n = {"$this$openMavInWebView"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f158578q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f158579r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f158580s;

    /* renamed from: t, reason: collision with root package name */
    public int f158581t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f158580s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f158579r = obj;
        this.f158581t |= BeduinInputModel.MIN_TEXT_VERSION;
        return e.c(this.f158580s, null, this);
    }
}
