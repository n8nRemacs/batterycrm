package com.avito.android.tariff.cpx.configure.advance.items.chips;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxConfigureAdvanceChipsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/chips/c;", "LTV0/b;", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/j;", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.b<j, b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f295703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f295704b = new g.a<>(R.layout.cpx_configure_advance_chips_item, a.f295705l);

    /* compiled from: CpxConfigureAdvanceChipsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tariff/cpx/configure/advance/items/chips/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f295705l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view);
        }
    }

    @Inject
    public c(@Y61.k e eVar) {
        this.f295703a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f295703a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f295704b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof b;
    }
}
