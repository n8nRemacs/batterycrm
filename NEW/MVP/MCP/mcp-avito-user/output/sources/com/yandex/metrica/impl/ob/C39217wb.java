package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.wb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39217wb implements InterfaceC39193vb {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC39193vb f382111a;

    /* renamed from: com.yandex.metrica.impl.ob.wb$a */
    public class a implements InterfaceC39085qm<C39169ub> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f382112a;

        public a(Context context) {
            this.f382112a = context;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39085qm
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C39169ub a() {
            return C39217wb.this.f382111a.a(this.f382112a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wb$b */
    public class b implements InterfaceC39085qm<C39169ub> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f382114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gb f382115b;

        public b(Context context, Gb gb2) {
            this.f382114a = context;
            this.f382115b = gb2;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39085qm
        public C39169ub a() {
            return C39217wb.this.f382111a.a(this.f382114a, this.f382115b);
        }
    }

    public C39217wb(@j.N InterfaceC39193vb interfaceC39193vb) {
        this.f382111a = interfaceC39193vb;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39193vb
    @j.N
    public C39169ub a(@j.N Context context) {
        return a(new a(context));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39193vb
    @j.N
    public C39169ub a(@j.N Context context, @j.N Gb gb2) {
        return a(new b(context, gb2));
    }

    @j.N
    private C39169ub a(@j.N InterfaceC39085qm<C39169ub> interfaceC39085qm) {
        C39169ub c39169ubA = interfaceC39085qm.a();
        C39145tb c39145tb = c39169ubA.f381928a;
        return (c39145tb == null || !"00000000-0000-0000-0000-000000000000".equals(c39145tb.f381872b)) ? c39169ubA : new C39169ub(null, U0.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }
}
