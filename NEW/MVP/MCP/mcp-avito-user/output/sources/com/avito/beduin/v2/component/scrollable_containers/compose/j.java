package com.avito.beduin.v2.component.scrollable_containers.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Prefetch.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class j extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Integer> f336297l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f336298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Integer> f336299n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InterfaceC22204y1<Integer> interfaceC22204y1, f fVar, InterfaceC22204y1<Integer> interfaceC22204y12) {
        super(0);
        this.f336297l = interfaceC22204y1;
        this.f336298m = fVar;
        this.f336299n = interfaceC22204y12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        InterfaceC22204y1<Integer> interfaceC22204y1 = this.f336297l;
        int iIntValue = interfaceC22204y1.getF42167b().intValue();
        f fVar = this.f336298m;
        int iC2 = fVar.c();
        InterfaceC22204y1<Integer> interfaceC22204y12 = this.f336299n;
        boolean z12 = false;
        if (iIntValue == iC2 ? interfaceC22204y12.getF42167b().intValue() < fVar.b() : interfaceC22204y1.getF42167b().intValue() < fVar.c()) {
            z12 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z12);
        interfaceC22204y1.setValue(Integer.valueOf(fVar.c()));
        interfaceC22204y12.setValue(Integer.valueOf(fVar.b()));
        return boolValueOf;
    }
}
