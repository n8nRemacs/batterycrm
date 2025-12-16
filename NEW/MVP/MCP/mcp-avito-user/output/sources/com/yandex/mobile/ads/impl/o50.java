package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class o50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ff1<VideoAd> f388440a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final jm f388441b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final m61 f388442c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final lo f388443d;

    public o50(@Y61.k Context context, @Y61.k ff1<VideoAd> ff1Var, @Y61.k jm jmVar, @Y61.k m61 m61Var, @Y61.k lo loVar) {
        this.f388440a = ff1Var;
        this.f388441b = jmVar;
        this.f388442c = m61Var;
        this.f388443d = loVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final List<eb<?>> a() {
        Object next;
        im imVarA = this.f388440a.a();
        this.f388441b.getClass();
        ArrayList arrayList = new ArrayList(jm.a(imVarA));
        for (kotlin.Q q12 : C42745f0.U(new kotlin.Q("sponsored", this.f388442c.a()), new kotlin.Q("call_to_action", this.f388443d))) {
            String str = (String) q12.f406619b;
            ho hoVar = (ho) q12.f406620c;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((eb) next).b(), str)) {
                    break;
                }
            }
            if (((eb) next) == null) {
                arrayList.add(hoVar.a());
            }
        }
        return arrayList;
    }

    public /* synthetic */ o50(Context context, ff1 ff1Var) {
        this(context, ff1Var, new jm(), new m61(context, ff1Var), new lo(context));
    }
}
