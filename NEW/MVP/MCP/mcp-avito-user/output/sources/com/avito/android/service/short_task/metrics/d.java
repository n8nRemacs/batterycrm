package com.avito.android.service.short_task.metrics;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AccessebilityWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/d;", "Lcom/avito/android/service/short_task/metrics/c;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f274076a;

    /* compiled from: AccessebilityWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/accessibility/AccessibilityManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<AccessibilityManager> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f274077l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f274077l = context;
        }

        @Override // Y41.a
        public final AccessibilityManager invoke() {
            Object systemService = this.f274077l.getSystemService("accessibility");
            if (systemService instanceof AccessibilityManager) {
                return (AccessibilityManager) systemService;
            }
            return null;
        }
    }

    @Inject
    public d(@Y61.k Context context) {
        this.f274076a = C42727D.c(new a(context));
    }

    @Override // com.avito.android.service.short_task.metrics.c
    public final boolean a() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f274076a.getValue();
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null) {
            return false;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    @Override // com.avito.android.service.short_task.metrics.c
    public final boolean b() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f274076a.getValue();
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(2)) == null) {
            return false;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    @Override // com.avito.android.service.short_task.metrics.c
    public final boolean c() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f274076a.getValue();
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    @Override // com.avito.android.service.short_task.metrics.c
    public final boolean d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f274076a.getValue();
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(8)) == null) {
            return false;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }
}
