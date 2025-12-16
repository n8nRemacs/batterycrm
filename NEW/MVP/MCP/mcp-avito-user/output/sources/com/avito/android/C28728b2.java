package com.avito.android;

import Du.b;
import android.content.Context;
import ax0.C24190a;
import com.avito.android.app.task.InitTimberLoggerTask;
import com.avito.android.di.component.InterfaceC29905l;
import com.avito.android.di.module.C30147p4;
import com.avito.android.di.module.C30166r2;
import com.avito.android.di.module.ha;
import com.avito.android.enabler.RemoteFeaturesDecorator;
import com.avito.android.retrofit.H;
import com.avito.android.util.C35768c5;
import com.avito.android.util.C35882r3;
import com.avito.android.util.C35947t3;
import com.avito.android.util.InterfaceC35940s3;
import com.avito.android.util.InterfaceC35950u;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import pc1.b;

/* compiled from: ReleaseBuildDependenciesProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/b2;", "Lcom/avito/android/di/component/l;", "<init>", "()V", "_avito-apps_shared_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.b2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C28728b2 implements InterfaceC29905l {
    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C35947t3 a(@Y61.k P p12) {
        new C30147p4();
        Interceptor.Companion companion = Interceptor.INSTANCE;
        return new C35947t3();
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final FirebaseMessaging b() {
        FirebaseMessaging firebaseMessaging;
        com.google.firebase.messaging.G g12 = FirebaseMessaging.f361749o;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(com.google.firebase.g.c());
        }
        return firebaseMessaging;
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C35947t3 d() {
        new C30147p4();
        Interceptor.Companion companion = Interceptor.INSTANCE;
        return new C35947t3();
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.public_module.logging.logger.e e() {
        new ha();
        return new com.avito.android.iac_dialer_watcher.public_module.logging.logger.e();
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C35947t3 f() {
        new C30147p4();
        Interceptor.Companion companion = Interceptor.INSTANCE;
        return new C35947t3();
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C35882r3 g(@Y61.k Interceptor interceptor, @Y61.k Interceptor interceptor2, @Y61.k Interceptor interceptor3) {
        new C30147p4();
        InterfaceC35940s3.f319047a.getClass();
        return InterfaceC35940s3.a.f319049b;
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final H.a h() {
        return H.a.f255093a;
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C34161r i(@Y61.k InterfaceC35950u interfaceC35950u, @Y61.k Set set, @Y61.k RemoteFeaturesDecorator remoteFeaturesDecorator, @Y61.k com.avito.android.analytics.features.a aVar) {
        new C30166r2();
        P p12 = new P(interfaceC35950u);
        kotlin.reflect.n<Object> nVar = P.f67370w0[44];
        return ((Boolean) p12.f67377G.a().invoke()).booleanValue() ? new C34161r(interfaceC35950u, set, C42745f0.U(remoteFeaturesDecorator, aVar)) : new C34161r(interfaceC35950u, set, null, 4, null);
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final com.avito.android.bxcontent.mvi.entity.f j() {
        return new com.avito.android.bxcontent.mvi.entity.f(15);
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final InitTimberLoggerTask k(@Y61.k b.c cVar, @Y61.k P p12) {
        return new InitTimberLoggerTask(cVar, p12);
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C35882r3 l() {
        new C30147p4();
        InterfaceC35940s3.f319047a.getClass();
        return InterfaceC35940s3.a.f319049b;
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final com.avito.android.configuration.d m(@Y61.k Context context, @Y61.k com.avito.android.configuration.e eVar) {
        return new com.avito.android.configuration.d(context, eVar);
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C24190a n() {
        return new C24190a();
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final b.a o() {
        return b.a.f3520a;
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C28726b0 p() {
        return new C28726b0();
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final kotlin.collections.B0 q() {
        return kotlin.collections.B0.f406639b;
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final C35768c5 r() {
        return new C35768c5();
    }

    @Override // com.avito.android.di.component.InterfaceC29905l
    @Y61.k
    public final OkHttpClient c(@Y61.k OkHttpClient okHttpClient) {
        return okHttpClient;
    }
}
