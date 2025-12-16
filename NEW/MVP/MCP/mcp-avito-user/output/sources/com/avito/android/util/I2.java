package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: Keyboards.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class I2 extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.B<Boolean> f318629l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(io.reactivex.rxjava3.core.B<Boolean> b12) {
        super(1);
        this.f318629l = b12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        io.reactivex.rxjava3.core.B<Boolean> b12 = this.f318629l;
        if (!b12.getF318621e()) {
            b12.onNext(bool2);
        }
        return kotlin.G0.f406611a;
    }
}
