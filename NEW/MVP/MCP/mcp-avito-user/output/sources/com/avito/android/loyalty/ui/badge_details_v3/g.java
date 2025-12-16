package com.avito.android.loyalty.ui.badge_details_v3;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BadgeDetailsV3Interactor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.loyalty.ui.badge_details_v3.BadgeDetailsV3InteractorImpl", f = "BadgeDetailsV3Interactor.kt", i = {}, l = {18}, m = "getBadgeDetails", n = {}, s = {})
/* loaded from: classes14.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f183292q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f183293r;

    /* renamed from: s, reason: collision with root package name */
    public int f183294s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f183293r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f183292q = obj;
        this.f183294s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f183293r.a(null, this);
    }
}
