package com.avito.android.extended_profile_phone_dialog;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfilePhoneInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile_phone_dialog.ExtendedProfilePhoneInteractorImpl", f = "ExtendedProfilePhoneInteractor.kt", i = {}, l = {48}, m = "sendCallEvent", n = {}, s = {})
/* loaded from: classes13.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f151604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f151605r;

    /* renamed from: s, reason: collision with root package name */
    public int f151606s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f151605r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f151604q = obj;
        this.f151606s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f151605r.a(null, null, this);
    }
}
