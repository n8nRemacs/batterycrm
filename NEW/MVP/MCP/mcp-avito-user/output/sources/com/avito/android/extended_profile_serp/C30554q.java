package com.avito.android.extended_profile_serp;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSerpInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpInteractorImpl", f = "ExtendedProfileSerpInteractor.kt", i = {}, l = {170}, m = "loadSerpPageParams", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile_serp.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30554q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f153096q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30553p f153097r;

    /* renamed from: s, reason: collision with root package name */
    public int f153098s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30554q(C30553p c30553p, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f153097r = c30553p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f153096q = obj;
        this.f153098s |= BeduinInputModel.MIN_TEXT_VERSION;
        return C30553p.b(this.f153097r, null, this);
    }
}
