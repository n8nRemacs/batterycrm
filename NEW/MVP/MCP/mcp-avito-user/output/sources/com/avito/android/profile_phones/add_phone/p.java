package com.avito.android.profile_phones.add_phone;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AddPhoneInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_phones.add_phone.AddPhoneInteractorImpl", f = "AddPhoneInteractor.kt", i = {0}, l = {72}, m = "validateSelfEmployedPhoneInternal", n = {"phone"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f226955q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226956r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f226957s;

    /* renamed from: t, reason: collision with root package name */
    public int f226958t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f226957s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f226956r = obj;
        this.f226958t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f226957s.d(null, this);
    }
}
