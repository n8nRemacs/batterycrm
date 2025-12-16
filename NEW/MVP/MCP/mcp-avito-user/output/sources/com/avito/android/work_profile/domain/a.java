package com.avito.android.work_profile.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GetAppliesListInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.work_profile.domain.GetAppliesListInteractor", f = "GetAppliesListInteractor.kt", i = {}, l = {12}, m = "invoke", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f330633q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f330634r;

    /* renamed from: s, reason: collision with root package name */
    public int f330635s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f330634r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f330633q = obj;
        this.f330635s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f330634r.a(this);
    }
}
