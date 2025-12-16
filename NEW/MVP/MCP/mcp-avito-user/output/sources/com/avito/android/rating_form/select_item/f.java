package com.avito.android.rating_form.select_item;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormSelectItemInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.select_item.RatingFormSelectItemInteractorImpl", f = "RatingFormSelectItemInteractor.kt", i = {}, l = {56}, m = "loadItems", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f249017q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f249018r;

    /* renamed from: s, reason: collision with root package name */
    public int f249019s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f249018r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f249017q = obj;
        this.f249019s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f249018r.b(null, this);
    }
}
