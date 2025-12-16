package com.avito.android.messenger.service;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.C30277e1;
import com.avito.android.util.C;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: MessengerInfoProviderImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/e;", "Lcom/avito/android/messenger/service/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f197252a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f197253b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f197254c = Collections.singletonMap("X-Geo-required", "true");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f197255d;

    public e(@Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.P p12, @Y61.k C c12) {
        this.f197252a = c30277e1;
        this.f197253b = p12;
        this.f197255d = P0.g(new Q("app_name", "android"), new Q("app_version", p12.f().invoke()), new Q("app_version_code", String.valueOf(c12.getF125492l())));
    }

    @Override // com.avito.android.messenger.service.d
    @Y61.k
    public final String a() {
        C30277e1 c30277e1 = this.f197252a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[107];
        return C43066x.A0((String) c30277e1.f145003b1.a().invoke()).toString();
    }

    @Override // com.avito.android.messenger.service.d
    @Y61.k
    public final String b() {
        com.avito.android.P p12 = this.f197253b;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[5];
        Uri uri = Uri.parse((String) p12.f67404e.a().getValue());
        return C43066x.A0(uri.getScheme() + "://" + uri.getHost()).toString();
    }

    @Override // com.avito.android.messenger.service.d
    @Y61.k
    public final Map<String, String> c() {
        return this.f197254c;
    }

    @Override // com.avito.android.messenger.service.d
    @Y61.k
    public final String d() {
        C30277e1 c30277e1 = this.f197252a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[1];
        return C43066x.A0((String) c30277e1.f145004c.a().invoke()).toString();
    }

    @Override // com.avito.android.messenger.service.d
    @Y61.k
    public final String e() {
        C30277e1 c30277e1 = this.f197252a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[2];
        return C43066x.A0((String) c30277e1.f145007d.a().invoke()).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.avito.android.messenger.service.d
    @Y61.k
    public final Map<String, String> f() {
        return this.f197255d;
    }

    @Override // com.avito.android.messenger.service.d
    @Y61.k
    public final String g() {
        C30277e1 c30277e1 = this.f197252a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[3];
        return C43066x.A0((String) c30277e1.f145009e.a().invoke()).toString();
    }
}
