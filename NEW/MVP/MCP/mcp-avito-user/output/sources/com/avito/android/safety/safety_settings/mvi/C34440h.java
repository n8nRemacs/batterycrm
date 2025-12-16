package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsActor", f = "SafetySettingsActor.kt", i = {1, 1, 2, 2, 5, 5, 6, 6}, l = {131, 135, 136, 137, 138, 141, 143, 144, 145}, m = "emitSwitchTfa", n = {"this", "$this$emitSwitchTfa", "this", "$this$emitSwitchTfa", "this", "$this$emitSwitchTfa", "this", "$this$emitSwitchTfa"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.safety.safety_settings.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34440h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f257759q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f257760r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f257761s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f257762t;

    /* renamed from: u, reason: collision with root package name */
    public int f257763u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34440h(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f257762t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f257761s = obj;
        this.f257763u |= BeduinInputModel.MIN_TEXT_VERSION;
        return n.c(this.f257762t, null, null, this);
    }
}
