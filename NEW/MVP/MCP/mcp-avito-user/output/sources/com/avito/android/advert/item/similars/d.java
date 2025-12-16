package com.avito.android.advert.item.similars;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.section.SectionElementData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AdvertAsyncComplementaryPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.item.similars.AdvertAsyncComplementaryPresenterImpl", f = "AdvertAsyncComplementaryPresenter.kt", i = {0, 0}, l = {418, 427}, m = "handleErrorState", n = {"this", "currentSectionData"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f80268q;

    /* renamed from: r, reason: collision with root package name */
    public SectionElementData f80269r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f80270s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f80271t;

    /* renamed from: u, reason: collision with root package name */
    public int f80272u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f80271t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f80270s = obj;
        this.f80272u |= BeduinInputModel.MIN_TEXT_VERSION;
        return c.r(this.f80271t, null, null, this);
    }
}
