package com.avito.android.di.component;

import Du.b;
import android.content.Context;
import ax0.C24190a;
import com.avito.android.C28726b0;
import com.avito.android.C34161r;
import com.avito.android.P;
import com.avito.android.app.task.InitTimberLoggerTask;
import com.avito.android.enabler.RemoteFeaturesDecorator;
import com.avito.android.retrofit.H;
import com.avito.android.util.C35768c5;
import com.avito.android.util.C35882r3;
import com.avito.android.util.C35947t3;
import com.avito.android.util.InterfaceC35950u;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import pc1.b;

/* compiled from: BuildDependenciesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/component/l;", "", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.component.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC29905l {

    /* compiled from: BuildDependenciesProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.component.l$a */
    public static final class a {
    }

    @Y61.k
    C35947t3 a(@Y61.k P p12);

    @Y61.k
    FirebaseMessaging b();

    @Y61.k
    OkHttpClient c(@Y61.k OkHttpClient okHttpClient);

    @Y61.k
    C35947t3 d();

    @Y61.k
    com.avito.android.iac_dialer_watcher.public_module.logging.logger.e e();

    @Y61.k
    C35947t3 f();

    @Y61.k
    C35882r3 g(@Y61.k Interceptor interceptor, @Y61.k Interceptor interceptor2, @Y61.k Interceptor interceptor3);

    @Y61.k
    H.a h();

    @Y61.k
    C34161r i(@Y61.k InterfaceC35950u interfaceC35950u, @Y61.k Set set, @Y61.k RemoteFeaturesDecorator remoteFeaturesDecorator, @Y61.k com.avito.android.analytics.features.a aVar);

    @Y61.k
    com.avito.android.bxcontent.mvi.entity.f j();

    @Y61.k
    InitTimberLoggerTask k(@Y61.k b.c cVar, @Y61.k P p12);

    @Y61.k
    C35882r3 l();

    @Y61.k
    com.avito.android.configuration.d m(@Y61.k Context context, @Y61.k com.avito.android.configuration.e eVar);

    @Y61.k
    C24190a n();

    @Y61.k
    b.a o();

    @Y61.k
    C28726b0 p();

    @Y61.k
    B0 q();

    @Y61.k
    C35768c5 r();
}
