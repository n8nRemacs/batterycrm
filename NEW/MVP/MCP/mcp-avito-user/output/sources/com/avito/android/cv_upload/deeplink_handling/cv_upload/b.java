package com.avito.android.cv_upload.deeplink_handling.cv_upload;

import Ju.AbstractC14250d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.view.C23060r0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink.JobCvUploadLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import hO.InterfaceC40860a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CvUploadDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_upload/deeplink_handling/cv_upload/b;", "Lev/a;", "Lcom/avito/android/deeplink/JobCvUploadLink;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40161a<JobCvUploadLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f131616f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f131617g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC40860a f131618h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.cv_upload.features.a f131619i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f131620j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public N0 f131621k;

    /* compiled from: CvUploadDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_upload.deeplink_handling.cv_upload.CvUploadDeeplinkHandler$onCreate$1", f = "CvUploadDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* compiled from: CvUploadDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.cv_upload.deeplink_handling.cv_upload.b$a$a, reason: collision with other inner class name */
        public static final class C3934a<T> implements r {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f131623b;

            public C3934a(b bVar) {
                this.f131623b = bVar;
            }

            @Override // l41.r
            public final boolean test(Object obj) {
                return ((C47918a) obj).f437155a == C48421d.a(this.f131623b);
            }
        }

        /* compiled from: CvUploadDeeplinkHandler.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.cv_upload.deeplink_handling.cv_upload.b$a$b, reason: collision with other inner class name */
        public static final class C3935b<T> implements g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f131624b;

            public C3935b(b bVar) {
                this.f131624b = bVar;
            }

            @Override // l41.g
            public final void accept(Object obj) {
                Uri data;
                C47918a c47918a = (C47918a) obj;
                b bVar = this.f131624b;
                C23060r0 c23060r0 = bVar.f395446d;
                G0 g02 = null;
                if (c23060r0 == null) {
                    c23060r0 = null;
                }
                String str = (String) c23060r0.b("key_from_page");
                if (c47918a.f437156b != -1 || str == null) {
                    bVar.j(AbstractC14250d.b.f9170c);
                    return;
                }
                Intent intent = c47918a.f437157c;
                if (intent != null && (data = intent.getData()) != null) {
                    bVar.f131616f.R(bVar.f131618h.a(data, str), com.avito.android.deeplink_handler.view.b.f134588l);
                    bVar.j(AbstractC14250d.c.f9171c);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    bVar.j(AbstractC14250d.b.f9170c);
                }
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b bVar = b.this;
            bVar.f131617g.Q().N(new C3934a(bVar)).t0(new C3935b(bVar));
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k InterfaceC40860a interfaceC40860a, @k com.avito.android.cv_upload.features.a aVar) {
        this.f131616f = interfaceC4053a;
        this.f131617g = bVar;
        this.f131618h = interfaceC40860a;
        this.f131619i = aVar;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f131620j = U.a(K.f411877a);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JobCvUploadLink jobCvUploadLink = (JobCvUploadLink) deepLink;
        C23060r0 c23060r0 = this.f395446d;
        if (c23060r0 == null) {
            c23060r0 = null;
        }
        c23060r0.e(jobCvUploadLink.f134086b, "key_from_page");
        if (jobCvUploadLink.f134087c) {
            this.f131616f.R(this.f131618h.b(jobCvUploadLink), com.avito.android.deeplink_handler.view.b.f134588l);
            j(AbstractC14250d.c.f9171c);
            return;
        }
        com.avito.android.cv_upload.features.a aVar = this.f131619i;
        aVar.getClass();
        n<Object> nVar = com.avito.android.cv_upload.features.a.f131676c[0];
        boolean zBooleanValue = ((Boolean) aVar.f131677b.a().invoke()).booleanValue();
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType(zBooleanValue ? "*/*" : "application/pdf");
        if (zBooleanValue) {
            type.putExtra("android.intent.extra.MIME_TYPES", c.f131625a);
        }
        this.f131616f.J(type.setFlags(1).setFlags(64), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f131621k = C43259k.d(this.f131620j, null, null, new a(null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        N0 n02 = this.f131621k;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
    }
}
