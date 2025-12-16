package com.akita.compose.component.stepper;

import androidx.compose.animation.core.C20268c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Stepper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.akita.compose.component.stepper.StepperKt", f = "Stepper.kt", i = {0, 1, 2}, l = {346, 347, 348, 349}, m = "shake", n = {"$this$shake", "$this$shake", "$this$shake"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes10.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C20268c f62936q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f62937r;

    /* renamed from: s, reason: collision with root package name */
    public int f62938s;

    public v() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f62937r = obj;
        this.f62938s |= BeduinInputModel.MIN_TEXT_VERSION;
        return l.e(null, this);
    }
}
