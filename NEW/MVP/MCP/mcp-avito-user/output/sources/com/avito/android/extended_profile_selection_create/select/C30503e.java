package com.avito.android.extended_profile_selection_create.select;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSelectionCreateInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateInteractorImpl", f = "ExtendedProfileSelectionCreateInteractor.kt", i = {}, l = {202}, m = "createSelectionValue", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile_selection_create.select.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30503e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152270q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30499d f152271r;

    /* renamed from: s, reason: collision with root package name */
    public int f152272s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30503e(C30499d c30499d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f152271r = c30499d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f152270q = obj;
        this.f152272s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C30499d.d(this.f152271r, null, this);
    }
}
