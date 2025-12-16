package com.avito.android.wallet.pin.impl.ui.components.pin_input;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletPinInputAnimationState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.ui.components.pin_input.WalletPinInputAnimationState", f = "WalletPinInputAnimationState.kt", i = {0, 1}, l = {40, 41}, m = "animateError", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f328990q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f328991r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f328992s;

    /* renamed from: t, reason: collision with root package name */
    public int f328993t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328992s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f328991r = obj;
        this.f328993t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f328992s.a(this);
    }
}
