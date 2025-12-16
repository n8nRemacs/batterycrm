package com.avito.android.publish.start_publish.blueprint;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.start_publish.StartPublishSheet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryShortcutItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/blueprint/b;", "Lcom/avito/android/publish/start_publish/blueprint/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.start_publish.blueprint.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f245347a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f245348b = new g.a<>(R.layout.item_category_shortcut, a.f245349l);

    /* compiled from: CategoryShortcutItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/start_publish/blueprint/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/start_publish/blueprint/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f245349l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f245347a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f245347a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f245348b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof StartPublishSheet.SheetData.CategoryShortcutItem;
    }
}
