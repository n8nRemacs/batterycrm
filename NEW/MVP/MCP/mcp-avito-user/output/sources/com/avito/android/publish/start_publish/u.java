package com.avito.android.publish.start_publish;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.PublishStartInfo;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.google.gson.Gson;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StartPublishInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/start_publish/u;", "Lcom/avito/android/publish/start_publish/t;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements t {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f245435g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<H0> f245436a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245437b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34126a f245438c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f245439d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f245440e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Gson f245441f;

    /* compiled from: StartPublishInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/avito/android/publish/start_publish/u$a;", "", "<init>", "()V", "", "BUSINESS_CATEGORY_ID", "I", "", "IMAGE_BUSINESS", "Ljava/lang/String;", "IMAGE_GENERAL", "IMAGE_JOB", "IMAGE_REALTY", "IMAGE_SERVICES", "IMAGE_TRANSPORT", "JOB_CATEGORY_ID", "REALTY_CATEGORY_ID", "SERVICES_CATEGORY_ID", "TRANSPORT_CATEGORY_ID", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public u(@Y61.k h31.e<H0> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC34126a interfaceC34126a, @Y61.k Q1 q12, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k Gson gson) {
        this.f245436a = eVar;
        this.f245437b = interfaceC35745a5;
        this.f245438c = interfaceC34126a;
        this.f245439d = q12;
        this.f245440e = interfaceC41196a;
        this.f245441f = gson;
    }

    @Override // com.avito.android.publish.start_publish.t
    @Y61.k
    public final S a(boolean z12) {
        io.reactivex.rxjava3.core.I iZ2;
        S sB2 = b();
        InterfaceC35745a5 interfaceC35745a5 = this.f245437b;
        if (z12) {
            iZ2 = io.reactivex.rxjava3.core.I.q(PublishStartInfo.Publish.INSTANCE);
        } else {
            Q1 q12 = this.f245439d;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[3];
            boolean zBooleanValue = ((Boolean) q12.f67482e.a().invoke()).booleanValue();
            h31.e<H0> eVar = this.f245436a;
            iZ2 = zBooleanValue ? g1.a(eVar.get().i().B(1L, TimeUnit.SECONDS, interfaceC35745a5.c(), null)).u(new C32102w0(21)).r(new y(this)).z(interfaceC35745a5.a()) : g1.a(eVar.get().V().B(1L, TimeUnit.SECONDS, interfaceC35745a5.c(), null)).u(new C32102w0(20)).z(interfaceC35745a5.a()).r(w.f245443b);
        }
        return io.reactivex.rxjava3.core.I.G(sB2, iZ2, x.f245444b).z(interfaceC35745a5.a()).s(interfaceC35745a5.e());
    }

    @Override // com.avito.android.publish.start_publish.t
    @Y61.k
    public final S b() {
        return this.f245438c.a().r(new v(this)).s(this.f245437b.e());
    }
}
