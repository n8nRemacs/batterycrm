package com.avito.android.passport.profile_switch;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportSwitchProfileInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.profile_switch.PassportSwitchProfileInteractorImpl", f = "PassportSwitchProfileInteractor.kt", i = {0}, l = {38, 45}, m = "switchProfile", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public n f213706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f213707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f213708s;

    /* renamed from: t, reason: collision with root package name */
    public int f213709t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f213708s = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f213707r = obj;
        this.f213709t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f213708s.a(null, null, this);
    }
}
