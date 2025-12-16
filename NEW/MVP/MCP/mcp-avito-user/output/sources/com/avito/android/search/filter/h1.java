package com.avito.android.search.filter;

import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: FiltersViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h1 extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k1 f263361l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1 k1Var) {
        super(1);
        this.f263361l = k1Var;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        final k1 k1Var = this.f263361l;
        if (zBooleanValue) {
            D6.w(k1Var.f263374f);
            D6.w(k1Var.f263375g);
            D6.w(k1Var.f263376h);
        } else {
            k1Var.f263378j.post(new Runnable() { // from class: com.avito.android.search.filter.g1
                @Override // java.lang.Runnable
                public final void run() {
                    k1 k1Var2 = k1Var;
                    if (k1Var2.f263379k) {
                        D6.H(k1Var2.f263375g);
                    }
                    D6.H(k1Var2.f263374f);
                    D6.H(k1Var2.f263376h);
                }
            });
        }
        return kotlin.G0.f406611a;
    }
}
