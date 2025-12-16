package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.C38273c1;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import java.util.List;
import u21.InterfaceC48776c;

/* loaded from: classes8.dex */
public final class il0 implements InterfaceC48776c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<com.yandex.mobile.ads.nativeads.u> f386520a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final NativeAdEventListener f386521b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final nq f386522c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ou f386523d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final pu f386524e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final ac f386525f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private final fr f386526g;

    /* JADX WARN: Multi-variable type inference failed */
    @j.k0
    public il0(@Y61.k List<? extends com.yandex.mobile.ads.nativeads.u> list, @Y61.k NativeAdEventListener nativeAdEventListener, @Y61.k nq nqVar, @Y61.k ou ouVar, @Y61.k pu puVar, @Y61.k ac acVar, @Y61.k fr frVar) {
        this.f386520a = list;
        this.f386521b = nativeAdEventListener;
        this.f386522c = nqVar;
        this.f386523d = ouVar;
        this.f386524e = puVar;
        this.f386525f = acVar;
        this.f386526g = frVar;
    }

    @Override // u21.InterfaceC48776c
    public final void bindView(@Y61.k C38029k c38029k, @Y61.k View view, @Y61.k com.yandex.div2.H h12) {
        view.setVisibility(8);
        this.f386522c.getClass();
        C38273c1 c38273c1A = nq.a(h12);
        if (c38273c1A != null) {
            this.f386523d.getClass();
            Integer numA = ou.a(c38273c1A);
            if (numA == null || numA.intValue() < 0 || numA.intValue() >= this.f386520a.size()) {
                return;
            }
            com.yandex.mobile.ads.nativeads.u uVar = this.f386520a.get(numA.intValue());
            ll0 ll0VarA = this.f386525f.a(view, new up0(numA.intValue()));
            try {
                fr frVar = this.f386526g;
                Context context = c38029k.getContext();
                frVar.getClass();
                if (fr.a(context)) {
                    vi viVar = new vi();
                    C37916k actionHandler = c38029k.getActionHandler();
                    pq pqVar = actionHandler instanceof pq ? (pq) actionHandler : null;
                    if (pqVar != null) {
                        pqVar.a(numA.intValue(), viVar);
                    }
                    uVar.b(ll0VarA, viVar);
                } else {
                    uVar.a(ll0VarA);
                }
                view.setVisibility(0);
                uVar.setNativeAdEventListener(this.f386521b);
            } catch (NativeAdException unused) {
            }
        }
    }

    @Override // u21.InterfaceC48776c
    public final boolean matches(@Y61.k com.yandex.div2.H h12) {
        this.f386522c.getClass();
        C38273c1 c38273c1A = nq.a(h12);
        if (c38273c1A == null) {
            return false;
        }
        this.f386523d.getClass();
        Integer numA = ou.a(c38273c1A);
        this.f386524e.getClass();
        return numA != null && "native_ad_view".equals(pu.a(c38273c1A));
    }

    public il0(@Y61.k z41 z41Var, @Y61.k NativeAdEventListener nativeAdEventListener) {
        this(z41Var.d(), nativeAdEventListener, new nq(), new ou(), new pu(), new ac(new xq().a(z41Var)), new fr());
    }

    @Override // u21.InterfaceC48776c
    public /* bridge */ /* synthetic */ void preprocess(@Y61.k com.yandex.div2.H h12, @Y61.k com.yandex.div.json.expressions.e eVar) {
    }

    @Override // u21.InterfaceC48776c
    public /* bridge */ /* synthetic */ void beforeBindView(@Y61.k C38029k c38029k, @Y61.k View view, @Y61.k com.yandex.div2.H h12) {
    }

    @Override // u21.InterfaceC48776c
    public final void unbindView(@Y61.k C38029k c38029k, @Y61.k View view, @Y61.k com.yandex.div2.H h12) {
    }
}
