package com.avito.android.settings.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DividerItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/settings/adapter/h;", "LTV0/b;", "Lcom/avito/android/settings/adapter/m;", "Lcom/avito/android/settings/adapter/i0$c;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.settings.adapter.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34950h implements TV0.b<InterfaceC34955m, i0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34952j f280780a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f280781b = new g.a<>(R.layout.divider, a.f280782l);

    /* compiled from: DividerItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/settings/adapter/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/settings/adapter/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.settings.adapter.h$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C34956n> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f280782l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C34956n invoke(ViewGroup viewGroup, View view) {
            return new C34956n(view);
        }
    }

    @Inject
    public C34950h(@Y61.k InterfaceC34952j interfaceC34952j) {
        this.f280780a = interfaceC34952j;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f280780a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f280781b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof i0.c;
    }
}
