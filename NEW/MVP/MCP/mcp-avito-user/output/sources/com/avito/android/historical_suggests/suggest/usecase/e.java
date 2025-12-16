package com.avito.android.historical_suggests.suggest.usecase;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetIdByCoordinatesUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.usecase.GetIdByCoordinatesUseCase", f = "GetIdByCoordinatesUseCase.kt", i = {0}, l = {17, 19}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f162156q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f162157r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f162158s;

    /* renamed from: t, reason: collision with root package name */
    public int f162159t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f162158s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f162157r = obj;
        this.f162159t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f162158s.a(null, null, this);
    }
}
