package com.my.target;

import android.content.Context;
import com.my.target.K0;
import com.my.target.X;
import e11.C39883l;
import e11.C39924z;
import e11.e2;
import e11.k2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.u0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37814u0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final K0 f365162a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final ArrayList<C39883l> f365163b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public X.a f365164c;

    /* renamed from: com.my.target.u0$a */
    public class a implements K0.a {
        public a() {
        }

        @Override // com.my.target.K0.a
        public final void a(@j.N C39883l c39883l) {
            C37814u0 c37814u0 = C37814u0.this;
            X.a aVar = c37814u0.f365164c;
            if (aVar != null) {
                aVar.f(c39883l, null, c37814u0.f365162a.getView().getContext());
            }
        }

        @Override // com.my.target.K0.a
        public final void a(@j.N List<C39883l> list) {
            C37814u0 c37814u0 = C37814u0.this;
            Context context = c37814u0.f365162a.getView().getContext();
            String strQ = C39924z.q(context);
            for (C39883l c39883l : list) {
                ArrayList<C39883l> arrayList = c37814u0.f365163b;
                if (!arrayList.contains(c39883l)) {
                    arrayList.add(c39883l);
                    e2 e2Var = c39883l.f394702a;
                    if (strQ != null) {
                        k2.a(context, e2Var.a(strQ));
                    }
                    k2.a(context, e2Var.e("playbackStarted"));
                    k2.a(context, e2Var.e("show"));
                }
            }
        }
    }

    public C37814u0(@j.N ArrayList arrayList, @j.N K0 k02) {
        this.f365162a = k02;
        k02.setCarouselListener(new a());
        for (int i12 : k02.getNumbersOfCurrentShowingCards()) {
            if (i12 < arrayList.size() && i12 >= 0) {
                C39883l c39883l = (C39883l) arrayList.get(i12);
                this.f365163b.add(c39883l);
                k2.a(k02.getView().getContext(), c39883l.f394702a.e("playbackStarted"));
            }
        }
    }
}
