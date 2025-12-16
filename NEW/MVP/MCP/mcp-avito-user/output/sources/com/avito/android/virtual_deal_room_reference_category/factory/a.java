package com.avito.android.virtual_deal_room_reference_category.factory;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReferenceCategoryWithUIFactory.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.factory.ReferenceCategoryWithUIFactory", f = "ReferenceCategoryWithUIFactory.kt", i = {}, l = {22}, m = "acceptInvitation", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f327216q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f327217r;

    /* renamed from: s, reason: collision with root package name */
    public int f327218s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f327217r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f327216q = obj;
        this.f327218s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f327217r.c(null, this);
    }
}
