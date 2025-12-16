package com.avito.android.delivery_common;

import Y61.k;
import android.view.View;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_delivery-common_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {

    /* compiled from: Views.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f135014l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f135015m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, View view2) {
            super(0);
            this.f135014l = view;
            this.f135015m = view2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            D6.f(this.f135014l, 0, 0, 0, this.f135015m.getMeasuredHeight(), 7);
            return G0.f406611a;
        }
    }

    public static final void a(@k View view, @k View view2) {
        D6.l(true, view2, new a(view, view2));
    }
}
