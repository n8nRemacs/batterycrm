package com.avito.android.mortgage.sign;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import o10.InterfaceC44504b;

/* compiled from: SignFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.p<Float, Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SignFragment f203634l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SignFragment signFragment) {
        super(2);
        this.f203634l = signFragment;
    }

    @Override // Y41.p
    public final G0 invoke(Float f12, Float f13) {
        ((t) this.f203634l.f203590o0.getValue()).accept(new InterfaceC44504b.C12156b(f12.floatValue(), f13.floatValue()));
        return G0.f406611a;
    }
}
