package com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MallShortcutBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/e;", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/MallShortcutItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<e, MallShortcutItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f273010a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f273011b = new g.a<>(R.layout.mall_shortcut_item, C8104a.f273012l);

    /* compiled from: MallShortcutBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.a$a, reason: collision with other inner class name */
    public static final class C8104a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8104a f273012l = new C8104a();

        public C8104a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    public a(@k d dVar) {
        this.f273010a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273010a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f273011b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof MallShortcutItem;
    }
}
