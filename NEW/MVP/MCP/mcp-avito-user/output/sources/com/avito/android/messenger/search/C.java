package com.avito.android.messenger.search;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23503n;
import androidx.transition.Q;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f196976c;

    public /* synthetic */ C(D d12, int i12) {
        this.f196975b = i12;
        this.f196976c = d12;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.C] */
    @Override // java.lang.Runnable
    public final void run() {
        D d12 = this.f196976c;
        switch (this.f196975b) {
            case 0:
                kotlin.reflect.n<Object>[] nVarArr = D.f197013t;
                if (((RecyclerView.Adapter) d12.f197028p.getValue()).getItemCount() > 0) {
                    d12.f197018f.A0(0);
                    break;
                }
                break;
            case 1:
                kotlin.reflect.n<Object>[] nVarArr2 = D.f197013t;
                Q5 q52 = new Q5(new C23503n());
                View view = d12.f197019g;
                q52.b(view);
                Q.a(d12.f197014b, q52.c());
                d12.f197017e.setLoading(true);
                D6.w(view);
                break;
            default:
                d12.f197017e.v();
                break;
        }
    }
}
