package com.avito.android.advert.viewed.persistance;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ViewedAdvertsStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.advert.viewed.persistance.ViewedAdvertsStorageImpl", f = "ViewedAdvertsStorage.kt", i = {0}, l = {94}, m = "syncOldViewedAdverts", n = {"this"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f81064q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f81065r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f81066s;

    /* renamed from: t, reason: collision with root package name */
    public int f81067t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f81066s = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f81065r = obj;
        this.f81067t |= BeduinInputModel.MIN_TEXT_VERSION;
        return k.d(this.f81066s, null, this);
    }
}
