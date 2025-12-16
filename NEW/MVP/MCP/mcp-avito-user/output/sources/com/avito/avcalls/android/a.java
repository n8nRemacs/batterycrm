package com.avito.avcalls.android;

import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.call.models.CreateCallMetaInfo;
import com.avito.avcalls.android.config.Config;
import com.avito.avcalls.android.connection_quality.ConnectionQualityStatus;
import com.avito.avcalls.android.video.CameraPosition;
import com.avito.avcalls.android.video.w;
import kotlin.Metadata;
import vQ0.AbstractC49254b;

/* compiled from: AvCalls.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/avcalls/android/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.a$a, reason: collision with other inner class name */
    public interface InterfaceC10304a {
        void a(@Y61.k AbstractC49254b abstractC49254b);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$c;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$d;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        void a(@Y61.k Throwable th2);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$e;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        @Y61.k
        com.avito.android.iac_avcalls.impl_module.platform.avcalls.b a(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$f;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
        void a(@Y61.k com.avito.avcalls.android.logger.a aVar);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$g;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface g {
        void a(@Y61.k String str, @Y61.k xQ0.b bVar);

        void b(@Y61.l CameraPosition cameraPosition);

        void c(@Y61.k xQ0.b bVar);

        void d(@Y61.k xQ0.b bVar);

        void e(@Y61.k ConnectionQualityStatus connectionQualityStatus);

        void g(@Y61.k xQ0.b bVar, @Y61.k String str, @Y61.k String str2, @Y61.k CallMetaInfo callMetaInfo);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/a$h;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface h {
    }

    void a(@Y61.k String str, boolean z12);

    boolean b(@Y61.k String str, @Y61.k String str2);

    void c(@Y61.k String str, boolean z12);

    void d(@Y61.k CameraPosition cameraPosition);

    void e(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar);

    void f(@Y61.k String str, boolean z12, @Y61.k w wVar);

    void g(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CreateCallMetaInfo createCallMetaInfo, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.e eVar);

    @Y61.k
    Config getConfig();

    void h(@Y61.k String str, @Y61.k xQ0.k kVar, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar);

    void i(@Y61.k String str, boolean z12, @Y61.k w wVar);

    void j(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar);

    void k(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar);

    void l(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar);

    void m(@Y61.k String str, @Y61.k com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d dVar);
}
