package com.avito.android.settings.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectSettingsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/settings/adapter/a0;", "LTV0/b;", "Lcom/avito/android/settings/adapter/g0;", "Lcom/avito/android/settings/adapter/i0$i;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a0 implements TV0.b<g0, i0.i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c0 f280769a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f280770b = new g.a<>(R.layout.selectable_single_line, a.f280771l);

    /* compiled from: SelectSettingsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/settings/adapter/h0;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/settings/adapter/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, h0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f280771l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h0 invoke(ViewGroup viewGroup, View view) {
            return new h0(view);
        }
    }

    @Inject
    public a0(@Y61.k c0 c0Var) {
        this.f280769a = c0Var;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f280769a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f280770b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof i0.i;
    }
}
