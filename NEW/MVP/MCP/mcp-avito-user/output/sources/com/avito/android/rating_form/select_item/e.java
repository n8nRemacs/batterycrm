package com.avito.android.rating_form.select_item;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RatingFormSelectItemInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.rating_form.select_item.RatingFormSelectItemInteractorImpl", f = "RatingFormSelectItemInteractor.kt", i = {0}, l = {42}, m = "loadItems", n = {"query"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f249013q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249014r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f249015s;

    /* renamed from: t, reason: collision with root package name */
    public int f249016t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f249015s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f249014r = obj;
        this.f249016t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f249015s.a(null, null, this);
    }
}
