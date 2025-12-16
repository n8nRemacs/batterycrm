package com.avito.android.advertising.loaders.beduin.wrapper;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.advertising.CommercialItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommercialWrapperComponentContainerHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/wrapper/b;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f88173a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f88174b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f88175c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public CommercialItem f88176d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public com.avito.konveyor.adapter.b f88177e;

    /* compiled from: CommercialWrapperComponentContainerHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Integer, View> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final View invoke(Integer num) {
            int iIntValue = num.intValue();
            b bVar = b.this;
            View viewInflate = bVar.f88175c.inflate(iIntValue, bVar.f88173a, false);
            if (viewInflate != null) {
                return viewInflate;
            }
            throw new IllegalStateException();
        }
    }

    public b(@k ViewGroup viewGroup, @k com.avito.konveyor.a aVar) {
        this.f88173a = viewGroup;
        this.f88174b = aVar;
        this.f88175c = LayoutInflater.from(viewGroup.getContext());
    }

    public final void a(CommercialItem commercialItem) {
        ViewGroup viewGroup = this.f88173a;
        viewGroup.removeAllViews();
        com.avito.konveyor.a aVar = this.f88174b;
        com.avito.konveyor.adapter.b bVarK = aVar.k(viewGroup, aVar.O(commercialItem), new a());
        if (bVarK == null) {
            throw new IllegalStateException();
        }
        viewGroup.addView(bVarK.itemView);
        this.f88177e = bVarK;
        aVar.O5(bVarK, commercialItem, 0);
        this.f88176d = commercialItem;
    }
}
