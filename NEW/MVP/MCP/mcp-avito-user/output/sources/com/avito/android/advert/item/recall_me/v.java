package com.avito.android.advert.item.recall_me;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl", f = "RecallMeBlockPresenter.kt", i = {0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2}, l = {153, 163, 176, 177}, m = "verifyPhone", n = {"this", "phoneWithCountryCode", "userName", "item", "view", "phone", "successMessage", "this", "phoneWithCountryCode", "userName", "item", "successMessage"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes10.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public o f78541q;

    /* renamed from: r, reason: collision with root package name */
    public String f78542r;

    /* renamed from: s, reason: collision with root package name */
    public String f78543s;

    /* renamed from: t, reason: collision with root package name */
    public RecallMeBlockItem f78544t;

    /* renamed from: u, reason: collision with root package name */
    public Object f78545u;

    /* renamed from: v, reason: collision with root package name */
    public String f78546v;

    /* renamed from: w, reason: collision with root package name */
    public String f78547w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f78548x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f78549y;

    /* renamed from: z, reason: collision with root package name */
    public int f78550z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f78549y = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f78548x = obj;
        this.f78550z |= BeduinInputModel.MIN_TEXT_VERSION;
        return o.k(this.f78549y, null, null, null, null, null, null, this);
    }
}
