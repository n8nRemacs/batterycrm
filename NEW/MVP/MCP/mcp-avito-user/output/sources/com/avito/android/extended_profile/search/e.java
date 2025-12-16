package com.avito.android.extended_profile.search;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSearchInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile.search.ExtendedProfileSearchInteractorImpl", f = "ExtendedProfileSearchInteractor.kt", i = {}, l = {212}, m = "getFiltersCount", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f150490q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f150491r;

    /* renamed from: s, reason: collision with root package name */
    public int f150492s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f150491r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f150490q = obj;
        this.f150492s |= BeduinInputModel.MIN_TEXT_VERSION;
        return k.d(this.f150491r, null, this);
    }
}
