package com.yandex.mobile.ads.impl;

import android.view.Display;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.gi;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.kv0;
import com.yandex.mobile.ads.impl.lh1;
import com.yandex.mobile.ads.impl.m90;
import com.yandex.mobile.ads.impl.nv0;
import com.yandex.mobile.ads.impl.pt;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.wn;
import com.yandex.mobile.ads.impl.zs;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class G0 implements wn.a, jc0.f, m90.a, oi1, uf.d, bs0, lh1.b.a, kv0.a, zs.b, ly {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383213c;

    public /* synthetic */ G0(Object obj, int i12) {
        this.f383212b = i12;
        this.f383213c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.jc0.f
    public int a(Object obj) {
        return jc0.a((vw) this.f383213c, (ec0) obj);
    }

    @Override // com.yandex.mobile.ads.impl.ly
    public Object apply(Object obj) {
        return ((zw) this.f383213c).a((s91) obj);
    }

    @Override // com.yandex.mobile.ads.impl.m90.a
    public void invoke(Object obj) {
        switch (this.f383212b) {
            case 2:
                ((gt0.b) obj).a((ad0) this.f383213c);
                break;
            case 3:
                ((gt0.b) obj).a((xm) this.f383213c);
                break;
            case 4:
                ((pt.b) this.f383213c).a((gt0.b) obj);
                break;
            case 5:
                ((gt0.b) obj).a((Metadata) this.f383213c);
                break;
            case 6:
                ((gt0.b) obj).a((ji1) this.f383213c);
                break;
            case 7:
                ((gt0.b) obj).onCues((List) this.f383213c);
                break;
            default:
                ((gt0.b) obj).a((zp) this.f383213c);
                break;
        }
    }

    @Override // com.yandex.mobile.ads.impl.uf.d
    public long a(long j12) {
        return ((mw) this.f383213c).a(j12);
    }

    @Override // com.yandex.mobile.ads.impl.kv0.a
    public kv0 a(jt0 jt0Var) {
        return nv0.a.a((vu) this.f383213c, jt0Var);
    }

    @Override // com.yandex.mobile.ads.impl.zs.b
    public zs a(th thVar) {
        return qc1.a((zs.a) this.f383213c, thVar);
    }

    @Override // com.yandex.mobile.ads.impl.oi1
    public Map a() {
        return cf1.b((ne1) this.f383213c);
    }

    @Override // com.yandex.mobile.ads.impl.bs0
    /* renamed from: a, reason: collision with other method in class */
    public void mo126a() {
        lg1.b((lg1) this.f383213c);
    }

    @Override // com.yandex.mobile.ads.impl.lh1.b.a
    public void a(Display display) {
        ((lh1) this.f383213c).a(display);
    }

    @Override // com.yandex.mobile.ads.impl.wn.a
    public void a(wn wnVar) {
        ((gi) this.f383213c).a((gi.b) wnVar);
    }
}
