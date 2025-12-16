package com.avito.android.advert.item.recall_me;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl", f = "RecallMeBlockPresenter.kt", i = {0, 0, 0}, l = {227}, m = "saveRecallMeRequest", n = {"this", "item", "successMessage"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes10.dex */
final class t extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f78524q;

    /* renamed from: r, reason: collision with root package name */
    public RecallMeBlockItem f78525r;

    /* renamed from: s, reason: collision with root package name */
    public String f78526s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f78527t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f78528u;

    /* renamed from: v, reason: collision with root package name */
    public int f78529v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f78528u = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f78527t = obj;
        this.f78529v |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = o.f78483n;
        return this.f78528u.O(null, null, null, null, this);
    }
}
