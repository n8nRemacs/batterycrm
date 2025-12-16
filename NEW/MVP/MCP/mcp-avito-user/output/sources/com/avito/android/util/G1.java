package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: GmsTasks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "result", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class G1 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.K<arrow.core.Y0<Object>> f318612l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(io.reactivex.rxjava3.core.K<arrow.core.Y0<Object>> k12) {
        super(1);
        this.f318612l = k12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        io.reactivex.rxjava3.core.K<arrow.core.Y0<Object>> k12 = this.f318612l;
        if (!k12.i()) {
            k12.onSuccess(arrow.core.Z0.b(obj));
        }
        return kotlin.G0.f406611a;
    }
}
