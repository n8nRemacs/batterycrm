package com.avito.android.settings.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.settings.adapter.i0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategorySettingsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/settings/adapter/a;", "LTV0/b;", "Lcom/avito/android/settings/adapter/f;", "Lcom/avito/android/settings/adapter/i0$a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.settings.adapter.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34943a implements TV0.b<InterfaceC34948f, i0.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34945c f280766a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f280767b = new g.a<>(R.layout.subheader, C8358a.f280768l);

    /* compiled from: CategorySettingsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/settings/adapter/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/settings/adapter/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.settings.adapter.a$a, reason: collision with other inner class name */
    public static final class C8358a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C34949g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8358a f280768l = new C8358a();

        public C8358a() {
            super(2);
        }

        @Override // Y41.p
        public final C34949g invoke(ViewGroup viewGroup, View view) {
            return new C34949g(view);
        }
    }

    @Inject
    public C34943a(@Y61.k InterfaceC34945c interfaceC34945c) {
        this.f280766a = interfaceC34945c;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f280766a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f280767b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof i0.a;
    }
}
