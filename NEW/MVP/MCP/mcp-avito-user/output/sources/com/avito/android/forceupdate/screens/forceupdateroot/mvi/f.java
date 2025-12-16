package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ForceUpdateRootBootstrap.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.forceupdate.screens.forceupdateroot.mvi.ForceUpdateRootBootstrap", f = "ForceUpdateRootBootstrap.kt", i = {0}, l = {35, 36}, m = "showProposalDialog", n = {"$this$showProposalDialog"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f158600q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f158601r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f158602s;

    /* renamed from: t, reason: collision with root package name */
    public int f158603t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f158602s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f158601r = obj;
        this.f158603t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f158602s.d(null, this);
    }
}
