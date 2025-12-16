package com.avito.android.lib.beduin_v2.component.input;

import androidx.compose.ui.focus.S;
import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputCompose.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f175738l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f175739m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f175740n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f175741o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(boolean z12, S s5, InterfaceC22489j2 interfaceC22489j2, Y41.a<G0> aVar) {
        super(0);
        this.f175738l = z12;
        this.f175739m = s5;
        this.f175740n = interfaceC22489j2;
        this.f175741o = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        if (this.f175738l) {
            S.c(this.f175739m);
            InterfaceC22489j2 interfaceC22489j2 = this.f175740n;
            if (interfaceC22489j2 != null) {
                interfaceC22489j2.show();
            }
            this.f175741o.invoke();
        }
        return G0.f406611a;
    }
}
