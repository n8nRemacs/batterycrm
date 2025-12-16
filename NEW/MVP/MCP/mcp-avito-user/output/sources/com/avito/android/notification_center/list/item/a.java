package com.avito.android.notification_center.list.item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.notification_center.list.item.NotificationCenterListItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorSnippetItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification_center/list/item/a;", "LTV0/b;", "Lcom/avito/android/notification_center/list/item/h;", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem$ErrorSnippet;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<h, NotificationCenterListItem.ErrorSnippet> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f207607a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f207608b = new g.a<>(R.layout.notification_center_load_snippet, C6194a.f207609l);

    /* compiled from: ErrorSnippetItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/notification_center/list/item/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/notification_center/list/item/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.notification_center.list.item.a$a, reason: collision with other inner class name */
    public static final class C6194a extends N implements Y41.p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6194a f207609l = new C6194a();

        public C6194a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f207607a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f207607a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f207608b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof NotificationCenterListItem.ErrorSnippet;
    }
}
