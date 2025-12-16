package com.avito.android.wallet.pin.impl.ui.components.pin_input;

import Y61.k;
import Y61.l;
import androidx.compose.animation.core.R0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletPinInput.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.ui.components.pin_input.WalletPinAnimationState", f = "WalletPinInput.kt", i = {0, 0, 1, 1}, l = {109, 110, 111}, m = "animateScale", n = {"this", "animationSpec", "this", "animationSpec"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f328985q;

    /* renamed from: r, reason: collision with root package name */
    public R0 f328986r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f328987s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f328988t;

    /* renamed from: u, reason: collision with root package name */
    public int f328989u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f328988t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f328987s = obj;
        this.f328989u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f328988t.a(0.0f, this);
    }
}
