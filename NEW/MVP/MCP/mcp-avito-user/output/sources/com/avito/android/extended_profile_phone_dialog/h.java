package com.avito.android.extended_profile_phone_dialog;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfilePhoneInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile_phone_dialog.ExtendedProfilePhoneInteractorImpl", f = "ExtendedProfilePhoneInteractor.kt", i = {}, l = {34}, m = "getPhones", n = {}, s = {})
/* loaded from: classes13.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f151601q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f151602r;

    /* renamed from: s, reason: collision with root package name */
    public int f151603s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f151602r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f151601q = obj;
        this.f151603s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f151602r.b(null, null, null, null, this);
    }
}
