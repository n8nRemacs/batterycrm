package com.avito.android.passport.remove_draft;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportRemoveDraftAsyncDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.remove_draft.PassportRemoveDraftAsyncDeeplinkHandler", f = "PassportRemoveDraftAsyncDeeplinkHandler.kt", i = {0}, l = {55}, m = "handleActual", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f213892q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f213893r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f213894s;

    /* renamed from: t, reason: collision with root package name */
    public int f213895t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f213894s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f213893r = obj;
        this.f213895t |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.k(this.f213894s, null, this);
    }
}
