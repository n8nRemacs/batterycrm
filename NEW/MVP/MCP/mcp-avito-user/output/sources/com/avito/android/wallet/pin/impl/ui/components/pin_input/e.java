package com.avito.android.wallet.pin.impl.ui.components.pin_input;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletPinInputAnimationState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.ui.components.pin_input.WalletPinInputAnimationState", f = "WalletPinInputAnimationState.kt", i = {0}, l = {59}, m = "animateSuccess", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f328994q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f328995r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f328996s;

    /* renamed from: t, reason: collision with root package name */
    public int f328997t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328996s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f328995r = obj;
        this.f328997t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f328996s.c(this);
    }
}
