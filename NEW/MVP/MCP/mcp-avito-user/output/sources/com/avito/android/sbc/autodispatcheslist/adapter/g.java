package com.avito.android.sbc.autodispatcheslist.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30566f2;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbcAutoDispatchItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/g;", "LTV0/b;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/n;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements TV0.b<n, f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f259054a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30566f2 f259055b;

    /* compiled from: SbcAutoDispatchItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/sbc/autodispatcheslist/adapter/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/sbc/autodispatcheslist/adapter/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, n> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            C30566f2 c30566f2 = g.this.f259055b;
            c30566f2.getClass();
            kotlin.reflect.n<Object> nVar = C30566f2.f155067o[5];
            return new n(view, ((Boolean) c30566f2.f155073g.a().invoke()).booleanValue());
        }
    }

    @Inject
    public g(@Y61.k i iVar, @Y61.k C30566f2 c30566f2) {
        this.f259054a = iVar;
        this.f259055b = c30566f2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f259054a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.sbc_auto_dispatch_list_item, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof f;
    }
}
