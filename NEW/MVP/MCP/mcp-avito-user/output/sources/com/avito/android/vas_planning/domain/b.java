package com.avito.android.vas_planning.domain;

import com.yandex.div.internal.widget.tabs.d;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements M, d.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f322323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f322324c;

    public /* synthetic */ b(int i12, ArrayList arrayList) {
        this.f322323b = i12;
        this.f322324c = arrayList;
    }

    @Override // com.yandex.div.internal.widget.tabs.d.g
    public List a() {
        ArrayList arrayList = this.f322324c;
        switch (this.f322323b) {
            default:
                int i12 = com.yandex.div.core.view2.divs.tabs.c.f368746k;
            case 1:
                return arrayList;
        }
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(K k12) {
        org.threeten.bp.f fVarF = org.threeten.bp.f.F();
        ArrayList arrayList = this.f322324c;
        boolean z12 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((org.threeten.bp.f) it.next()).E(fVarF)) {
                    z12 = false;
                    break;
                }
            }
        }
        k12.onSuccess(Boolean.valueOf(z12));
    }
}
