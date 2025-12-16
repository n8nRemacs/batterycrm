package com.avito.android.mortgage.landing.list.items.input;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import w00.InterfaceC49409a;

/* compiled from: InputPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f199747l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InputItem f199748m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, InputItem inputItem) {
        super(1);
        this.f199747l = hVar;
        this.f199748m = inputItem;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f199747l.f199757b.invoke(new InterfaceC49409a.D(this.f199748m.f199729b, str));
        return G0.f406611a;
    }
}
