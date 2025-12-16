package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class mv implements n50 {

    /* renamed from: e, reason: collision with root package name */
    private static final int f388093e = R.drawable.monetization_ads_internal_instream_adtune_control_v2;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final eb<?> f388094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ib f388095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ri1 f388096c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final f8 f388097d;

    public mv(@Y61.l eb<?> ebVar, @Y61.k ib ibVar, @Y61.k ri1 ri1Var, @Y61.k br0 br0Var, @Y61.k p40 p40Var) {
        this.f388094a = ebVar;
        this.f388095b = ibVar;
        this.f388096c = ri1Var;
        this.f388097d = new f8(p40Var, br0Var);
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        Object obj;
        h90 h90VarA;
        List<AbstractC39344m> listA;
        Object next;
        ImageView imageViewH = se1Var.h();
        if (imageViewH != null) {
            imageViewH.setImageDrawable(androidx.core.content.d.getDrawable(imageViewH.getContext(), f388093e));
            imageViewH.setVisibility(0);
            eb<?> ebVar = this.f388094a;
            if (ebVar == null || (h90VarA = ebVar.a()) == null || (listA = h90VarA.a()) == null) {
                obj = null;
            } else {
                Iterator<T> it = listA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (kotlin.jvm.internal.L.f(((AbstractC39344m) next).a(), "adtune")) {
                            break;
                        }
                    }
                }
                obj = (AbstractC39344m) next;
            }
            x7 x7Var = obj instanceof x7 ? (x7) obj : null;
            if (x7Var != null) {
                imageViewH.setOnClickListener(new lv(x7Var, this.f388097d, this.f388096c, new jh1(imageViewH.getContext())));
            } else {
                this.f388095b.a(imageViewH, this.f388094a);
            }
        }
    }
}
