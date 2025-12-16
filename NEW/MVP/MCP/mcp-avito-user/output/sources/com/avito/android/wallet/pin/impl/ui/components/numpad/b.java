package com.avito.android.wallet.pin.impl.ui.components.numpad;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: WalletPinNumPad.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44967a f328928l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.numpad.a f328929m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f328930n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f328931o;

    /* compiled from: WalletPinNumPad.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[com.avito.android.wallet.pin.impl.ui.components.numpad.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.avito.android.wallet.pin.impl.ui.components.numpad.a aVar = com.avito.android.wallet.pin.impl.ui.components.numpad.a.f328922c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC44967a interfaceC44967a, com.avito.android.wallet.pin.impl.ui.components.numpad.a aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
        super(0);
        this.f328928l = interfaceC44967a;
        this.f328929m = aVar;
        this.f328930n = aVar2;
        this.f328931o = aVar3;
    }

    @Override // Y41.a
    public final G0 invoke() {
        p0.b.f422385b.getClass();
        b.a.a();
        this.f328928l.a(0);
        int iOrdinal = this.f328929m.ordinal();
        if (iOrdinal == 0) {
            this.f328930n.invoke();
        } else if (iOrdinal == 1) {
            this.f328931o.invoke();
        }
        return G0.f406611a;
    }
}
