package com.avito.avcalls;

import Y41.l;
import com.avito.avcalls.call.models.CallMetaInfo;
import com.avito.avcalls.call.models.CallState;
import com.avito.avcalls.call.models.CameraPosition;
import com.avito.avcalls.call.models.CreateCallMetaInfo;
import com.avito.avcalls.call.models.TerminateReason;
import com.avito.avcalls.config.Config;
import com.avito.avcalls.connection_quality.ConnectionQualityStatus;
import com.avito.avcalls.logger.AvCallsLogMessage;
import kotlin.Metadata;

/* compiled from: AvCalls.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/avcalls/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.a$a, reason: collision with other inner class name */
    public interface InterfaceC10303a {
        void e(@Y61.k uQ0.b bVar);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$b;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$c;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(@Y61.k Throwable th2);

        void onComplete();
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$d;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        void a(@Y61.k Throwable th2);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$e;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        @Y61.k
        com.avito.android.iac_avcalls.impl_module.platform.avcalls.b j(@Y61.k String str, @Y61.k String str2, @Y61.k l lVar, @Y61.k l lVar2);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$f;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
        void g(@Y61.k AvCallsLogMessage avCallsLogMessage);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$g;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface g {
        void b(@Y61.k String str, @Y61.k CallState callState);

        void d(@Y61.l CameraPosition cameraPosition);

        void h(@Y61.k CallState callState, @Y61.k String str, @Y61.k String str2, @Y61.k CallMetaInfo callMetaInfo);

        void i(@Y61.k ConnectionQualityStatus connectionQualityStatus);

        void k(@Y61.k CallState callState);
    }

    /* compiled from: AvCalls.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/a$h;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface h {
        void a(@Y61.k Throwable th2);

        void b(@Y61.k CallState callState);
    }

    void a(@Y61.k String str, boolean z12);

    boolean b(@Y61.k String str, @Y61.k String str2);

    void c(@Y61.k String str, boolean z12);

    void d(@Y61.k CameraPosition cameraPosition);

    void e(@Y61.k String str, @Y61.k c cVar);

    void f(@Y61.k String str, boolean z12, @Y61.k DQ0.a aVar);

    void g(@Y61.k String str, @Y61.k c cVar);

    @Y61.k
    Config getConfig();

    void h(@Y61.k String str, @Y61.k TerminateReason terminateReason, @Y61.k c cVar);

    void i(@Y61.k String str, boolean z12, @Y61.k DQ0.a aVar);

    void j(@Y61.k String str, @Y61.k c cVar);

    void k(@Y61.k String str, @Y61.k c cVar);

    void l(@Y61.k String str, @Y61.k c cVar);

    void m(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12, @Y61.k CreateCallMetaInfo createCallMetaInfo, @Y61.k h hVar);
}
