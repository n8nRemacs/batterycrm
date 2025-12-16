package com.avito.android.select.new_metro;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectMetroInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.select.new_metro.SelectMetroInteractor", f = "SelectMetroInteractor.kt", i = {}, l = {12}, m = "getMetroStations", n = {}, s = {})
/* loaded from: classes3.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f266312q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f266313r;

    /* renamed from: s, reason: collision with root package name */
    public int f266314s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f266313r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f266312q = obj;
        this.f266314s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f266313r.a(0, this);
    }
}
