package com.avito.android.select_districts.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectDistrictsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.select_districts.domain.SelectDistrictsInteractor", f = "SelectDistrictsInteractor.kt", i = {}, l = {12}, m = "getDistricts", n = {}, s = {})
/* loaded from: classes3.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f266930q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f266931r;

    /* renamed from: s, reason: collision with root package name */
    public int f266932s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f266931r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f266930q = obj;
        this.f266932s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f266931r.a(0, this);
    }
}
