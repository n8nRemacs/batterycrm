package com.avito.android.service.short_task.metrics;

import com.avito.android.util.C35836l1;
import com.avito.android.util.C35958v0;
import com.avito.android.util.InterfaceC35879r0;
import com.avito.android.util.InterfaceC35951u0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DataDiskUsageMetricProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/g;", "Lcom/avito/android/service/short_task/metrics/n;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C35958v0 f274081a;

    public g(@Y61.k C35958v0 c35958v0) {
        this.f274081a = c35958v0;
    }

    @Override // com.avito.android.service.short_task.metrics.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> a() {
        C35958v0 c35958v0 = this.f274081a;
        InterfaceC35879r0 interfaceC35879r0 = c35958v0.f319094a;
        m mVar = new m("disk_capacity", Long.valueOf(interfaceC35879r0.a().getTotalSpace()));
        m mVar2 = new m("free_disk_space", Long.valueOf(interfaceC35879r0.a().getFreeSpace()));
        InterfaceC35951u0 interfaceC35951u0 = c35958v0.f319095b;
        ArrayList arrayListE0 = C42745f0.e0(mVar, mVar2, new m("android_data_size_total", Long.valueOf(interfaceC35951u0.b())), new m("android_data_size_cache", Long.valueOf(interfaceC35951u0.a())), new m("android_data_size_code_cache", Long.valueOf(C35836l1.c(C35836l1.b(interfaceC35879r0.a(), "code_cache")))), new m("android_data_size_databases", Long.valueOf(C35836l1.c(C35836l1.b(interfaceC35879r0.a(), "databases")))), new m("android_data_size_files", Long.valueOf(C35836l1.c(C35836l1.b(interfaceC35879r0.a(), "files")))), new m("android_data_size_lib", Long.valueOf(C35836l1.c(C35836l1.b(interfaceC35879r0.a(), "lib")))), new m("android_data_size_shared_prefs", Long.valueOf(C35836l1.c(C35836l1.b(interfaceC35879r0.a(), "shared_prefs")))), new m("android_data_size_app_webview", Long.valueOf(C35836l1.c(C35836l1.b(interfaceC35879r0.a(), "app_webview")))), new m("android_data_size_no_backup", Long.valueOf(C35836l1.c(C35836l1.b(interfaceC35879r0.a(), "no_backup")))));
        arrayListE0.add(new m("android_data_size_apk", Long.valueOf(interfaceC35951u0.c())));
        return io.reactivex.rxjava3.core.z.X(arrayListE0);
    }
}
