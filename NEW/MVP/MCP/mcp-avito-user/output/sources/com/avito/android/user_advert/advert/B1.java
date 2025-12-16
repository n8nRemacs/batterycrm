package com.avito.android.user_advert.advert;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/B1;", "Landroid/view/View$OnLayoutChangeListener;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class B1 implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final y1 f308211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f308212c;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.avito.android.user_advert.advert.y1] */
    public B1(final z1 z1Var) {
        this.f308212c = z1Var;
        kotlin.reflect.n<Object>[] nVarArr = z1.f310666e;
        z1Var.getClass();
        this.f308211b = new RecyclerView.j.b() { // from class: com.avito.android.user_advert.advert.y1
            @Override // androidx.recyclerview.widget.RecyclerView.j.b
            public final void a() {
                kotlin.reflect.n<Object>[] nVarArr2 = z1.f310666e;
                z1Var.a();
            }
        };
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        z1 z1Var = this.f308212c;
        if (z1Var.f310669c) {
            z1Var.f310669c = false;
            RecyclerView.j itemAnimator = z1Var.f310667a.getItemAnimator();
            if (itemAnimator != null ? itemAnimator.m(this.f308211b) : false) {
                return;
            }
            z1Var.a();
        }
    }
}
