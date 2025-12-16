package com.avito.android.profile_settings_extended.adapter.setting;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SettingItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/setting/a;", "LTV0/b;", "Lcom/avito/android/profile_settings_extended/adapter/setting/k;", "Lcom/avito/android/profile_settings_extended/adapter/setting/SettingItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<k, SettingItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f229846a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f229847b = new g.a<>(R.layout.ext_profile_setting_item, C6995a.f229848l);

    /* compiled from: SettingItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile_settings_extended/adapter/setting/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile_settings_extended/adapter/setting/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_settings_extended.adapter.setting.a$a, reason: collision with other inner class name */
    public static final class C6995a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6995a f229848l = new C6995a();

        public C6995a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public a(@Y61.k f fVar) {
        this.f229846a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f229846a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f229847b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SettingItem;
    }
}
