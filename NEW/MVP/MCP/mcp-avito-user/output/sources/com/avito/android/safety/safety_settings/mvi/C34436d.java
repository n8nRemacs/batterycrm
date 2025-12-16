package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsActor", f = "SafetySettingsActor.kt", i = {0}, l = {175, 176}, m = "emitEnableTfaError", n = {"$this$emitEnableTfaError"}, s = {"L$0"})
/* renamed from: com.avito.android.safety.safety_settings.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34436d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f257666q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257667r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f257668s;

    /* renamed from: t, reason: collision with root package name */
    public int f257669t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34436d(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f257668s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f257667r = obj;
        this.f257669t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f257668s.f(null, null, this);
    }
}
