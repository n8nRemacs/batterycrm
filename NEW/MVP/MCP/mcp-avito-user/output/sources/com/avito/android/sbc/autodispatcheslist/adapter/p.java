package com.avito.android.sbc.autodispatcheslist.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbcAutoDispatchPaginationItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/p;", "LTV0/b;", "LTV0/e;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/o;", "<init>", "()V", "a", "b", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements TV0.b<TV0.e, o> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f259088a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<b> f259089b = new g.a<>(R.layout.sbc_auto_dispatch_pagination_item, c.f259090l);

    /* compiled from: SbcAutoDispatchPaginationItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/p$a;", "LTV0/d;", "LTV0/e;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/o;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TV0.d<TV0.e, o> {
        @Override // TV0.d
        public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        }
    }

    /* compiled from: SbcAutoDispatchPaginationItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/p$b;", "Lcom/avito/konveyor/adapter/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b {
    }

    /* compiled from: SbcAutoDispatchPaginationItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/sbc/autodispatcheslist/adapter/p$b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/sbc/autodispatcheslist/adapter/p$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<ViewGroup, View, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f259090l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) {
            return new b(view);
        }
    }

    @Inject
    public p() {
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<TV0.e, o> a() {
        return this.f259088a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<b> b() {
        return this.f259089b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof o;
    }
}
