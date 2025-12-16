package com.avito.android.favorites.link;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetSimilarPushLinkUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.favorites.link.GetSimilarPushLinkUseCaseImpl", f = "GetSimilarPushLinkUseCase.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invoke", n = {}, s = {})
/* loaded from: classes13.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f157408q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f157409r;

    /* renamed from: s, reason: collision with root package name */
    public int f157410s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f157409r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f157408q = obj;
        this.f157410s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f157409r.a(0L, null, null, null, this);
    }
}
