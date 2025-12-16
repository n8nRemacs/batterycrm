package com.avito.android.settings.adapter;

import Nv0.InterfaceC14616a;
import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReplaceMainItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/settings/adapter/W;", "LTV0/b;", "Lcom/avito/android/settings/adapter/Y;", "Lcom/avito/android/settings/adapter/i0$h;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class W implements TV0.b<Y, i0.h> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.replace_main.toggle.v f280757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14616a, G0> f280758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.util.b f280759c = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f280760d = new g.a<>(R.layout.replace_main, new a());

    /* compiled from: ReplaceMainItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/settings/adapter/Z;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/settings/adapter/Z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, Z> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Z invoke(ViewGroup viewGroup, View view) {
            W w12 = W.this;
            return new Z(view, w12.f280757a, w12.f280758b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public W(@Y61.k com.avito.android.replace_main.toggle.v vVar, @Y61.k Y41.l<? super InterfaceC14616a, G0> lVar) {
        this.f280757a = vVar;
        this.f280758b = lVar;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<Y, i0.h> a() {
        return this.f280759c;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f280760d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof i0.h;
    }
}
