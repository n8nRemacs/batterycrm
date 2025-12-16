package com.avito.android.virtual_deal_room_reference_category.factory;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReferenceCategoryWithoutUIFactory.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.factory.ReferenceCategoryWithoutUIFactory", f = "ReferenceCategoryWithoutUIFactory.kt", i = {}, l = {19}, m = "acceptInvitation", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f327220q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f327221r;

    /* renamed from: s, reason: collision with root package name */
    public int f327222s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f327221r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f327220q = obj;
        this.f327222s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f327221r.c(null, this);
    }
}
