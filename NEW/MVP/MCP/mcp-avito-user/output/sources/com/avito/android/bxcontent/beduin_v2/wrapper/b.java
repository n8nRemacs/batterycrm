package com.avito.android.bxcontent.beduin_v2.wrapper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.exception.ItemNotSupportedException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BxWrapperComponentContainerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f109557a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f109558b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f109559c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public l1 f109560d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.konveyor.adapter.b f109561e;

    /* compiled from: BxWrapperComponentContainerHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Integer, View> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final View invoke(Integer num) {
            int iIntValue = num.intValue();
            b bVar = b.this;
            View viewInflate = bVar.f109559c.inflate(iIntValue, bVar.f109557a, false);
            if (viewInflate != null) {
                return viewInflate;
            }
            throw new IllegalStateException();
        }
    }

    public b(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.a aVar) {
        this.f109557a = viewGroup;
        this.f109558b = aVar;
        this.f109559c = LayoutInflater.from(viewGroup.getContext());
    }

    public final void a(l1 l1Var) throws ItemNotSupportedException {
        ViewGroup viewGroup = this.f109557a;
        viewGroup.removeAllViews();
        com.avito.konveyor.a aVar = this.f109558b;
        com.avito.konveyor.adapter.b bVarK = aVar.k(viewGroup, aVar.O(l1Var), new a());
        if (bVarK == null) {
            throw new IllegalStateException();
        }
        viewGroup.addView(bVarK.itemView);
        this.f109561e = bVarK;
        aVar.O5(bVarK, l1Var, 0);
        this.f109560d = l1Var;
    }

    public final void b(@Y61.l l1 l1Var) {
        l1 l1Var2 = this.f109560d;
        com.avito.konveyor.adapter.b bVar = this.f109561e;
        if (l1Var == null) {
            this.f109557a.removeAllViews();
            this.f109560d = null;
            this.f109561e = null;
        } else {
            if (l1Var2 == null || bVar == null) {
                a(l1Var);
                return;
            }
            if (l1Var.equals(l1Var2)) {
                return;
            }
            if (l1Var2.getClass() != l1Var.getClass() || !L.f(l1Var2.getF79990c(), l1Var.getF79990c())) {
                a(l1Var);
            } else {
                this.f109558b.O5(bVar, l1Var, 0);
                this.f109560d = l1Var;
            }
        }
    }
}
