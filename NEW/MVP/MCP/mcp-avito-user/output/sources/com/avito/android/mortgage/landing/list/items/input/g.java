package com.avito.android.mortgage.landing.list.items.input;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w00.InterfaceC49409a;

/* compiled from: InputPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasTouch", "", "value", "Lkotlin/G0;", "invoke", "(ZF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g extends N implements p<Boolean, Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f199755l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InputItem f199756m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InputItem inputItem) {
        super(2);
        this.f199755l = hVar;
        this.f199756m = inputItem;
    }

    @Override // Y41.p
    public final G0 invoke(Boolean bool, Float f12) {
        boolean zBooleanValue = bool.booleanValue();
        float fFloatValue = f12.floatValue();
        if (!zBooleanValue) {
            this.f199755l.f199757b.invoke(new InterfaceC49409a.z(this.f199756m.f199729b, fFloatValue));
        }
        return G0.f406611a;
    }
}
