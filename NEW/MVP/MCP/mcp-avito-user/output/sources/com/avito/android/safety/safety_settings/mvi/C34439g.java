package com.avito.android.safety.safety_settings.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafetySettingsActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.safety.safety_settings.mvi.SafetySettingsActor", f = "SafetySettingsActor.kt", i = {0}, l = {153, 154}, m = "emitEnableTfaSuccess", n = {"$this$emitEnableTfaSuccess"}, s = {"L$0"})
/* renamed from: com.avito.android.safety.safety_settings.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34439g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f257755q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257756r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f257757s;

    /* renamed from: t, reason: collision with root package name */
    public int f257758t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34439g(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f257757s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f257756r = obj;
        this.f257758t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f257757s.g(null, null, this);
    }
}
