package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PhonesListMviInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviInteractorImpl", f = "PhonesListMviInteractor.kt", i = {0}, l = {56}, m = "loadPhones", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class I extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public J f227920q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f227921r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f227922s;

    /* renamed from: t, reason: collision with root package name */
    public int f227923t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f227922s = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f227921r = obj;
        this.f227923t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f227922s.b(this);
    }
}
