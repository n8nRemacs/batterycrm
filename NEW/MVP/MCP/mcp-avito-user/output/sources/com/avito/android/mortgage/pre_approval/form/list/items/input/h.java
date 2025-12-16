package com.avito.android.mortgage.pre_approval.form.list.items.input;

import Q00.a;
import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasTouch", "", "value", "Lkotlin/G0;", "invoke", "(ZF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements p<Boolean, Float, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f201786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f201787m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, c cVar) {
        super(2);
        this.f201786l = iVar;
        this.f201787m = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(Boolean bool, Float f12) {
        boolean zBooleanValue = bool.booleanValue();
        float fFloatValue = f12.floatValue();
        if (!zBooleanValue) {
            this.f201786l.f201788b.invoke(new a.h(this.f201787m.f201767b, fFloatValue));
        }
        return G0.f406611a;
    }
}
