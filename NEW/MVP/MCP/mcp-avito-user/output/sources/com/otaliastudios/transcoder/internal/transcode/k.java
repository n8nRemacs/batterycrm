package com.otaliastudios.transcoder.internal.transcode;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TranscodeEngine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(D)V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class k extends N implements Y41.l<Double, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f366210l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar) {
        super(1);
        this.f366210l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(Double d12) {
        double dDoubleValue = d12.doubleValue();
        j jVar = this.f366210l;
        jVar.f366208a.post(new i(jVar, dDoubleValue));
        return G0.f406611a;
    }
}
