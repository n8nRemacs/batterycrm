package com.avito.android.publish.publish_advert_request;

import Cd0.r;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.photo_cache.j;
import com.avito.android.photo_cache.q;
import com.avito.android.photo_picker.b0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.publish.O0;
import com.avito.android.publish.W0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.adverts.PostAdvertResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35936s;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.H;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: PublishAdvertRequestViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e;", "Landroidx/lifecycle/M0;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.publish.publish_advert_request.data.a f238999E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC28373a f239000J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f239001K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final b0 f239002L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final j f239003M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final InterfaceC33544d f239004N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final C0 f239005O;

    /* renamed from: P, reason: collision with root package name */
    @l
    public m f239006P;

    /* renamed from: Q, reason: collision with root package name */
    @l
    public y f239007Q;

    /* renamed from: S, reason: collision with root package name */
    public W0 f239009S;

    /* renamed from: R, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f239008R = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: T, reason: collision with root package name */
    @k
    public final C23038g0<a> f239010T = new C23038g0<>();

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/publish/publish_advert_request/e$a$a;", "Lcom/avito/android/publish/publish_advert_request/e$a$b;", "Lcom/avito/android/publish/publish_advert_request/e$a$c;", "Lcom/avito/android/publish/publish_advert_request/e$a$d;", "Lcom/avito/android/publish/publish_advert_request/e$a$e;", "Lcom/avito/android/publish/publish_advert_request/e$a$f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: PublishAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a$a;", "Lcom/avito/android/publish/publish_advert_request/e$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.publish_advert_request.e$a$a, reason: collision with other inner class name */
        public static final class C7182a extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError.UnknownError f239011a;

            public C7182a(@k ApiError.UnknownError unknownError) {
                super(null);
                this.f239011a = unknownError;
            }
        }

        /* compiled from: PublishAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a$b;", "Lcom/avito/android/publish/publish_advert_request/e$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f239012a;

            public b(@k String str) {
                super(null);
                this.f239012a = str;
            }
        }

        /* compiled from: PublishAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a$c;", "Lcom/avito/android/publish/publish_advert_request/e$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f239013a = new c();

            public c() {
                super(null);
            }
        }

        /* compiled from: PublishAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a$d;", "Lcom/avito/android/publish/publish_advert_request/e$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f239014a = new d();

            public d() {
                super(null);
            }
        }

        /* compiled from: PublishAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a$e;", "Lcom/avito/android/publish/publish_advert_request/e$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.publish.publish_advert_request.e$a$e, reason: collision with other inner class name */
        public static final class C7183e extends a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C7183e f239015a = new C7183e();

            public C7183e() {
                super(null);
            }
        }

        /* compiled from: PublishAdvertRequestViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/e$a$f;", "Lcom/avito/android/publish/publish_advert_request/e$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f239016a;

            /* renamed from: b, reason: collision with root package name */
            public final int f239017b;

            public f(int i12, int i13) {
                super(null);
                this.f239016a = i12;
                this.f239017b = i13;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CategoryParameters f239019c;

        public b(CategoryParameters categoryParameters) {
            this.f239019c = categoryParameters;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            List list = (List) obj;
            e eVar = e.this;
            eVar.getClass();
            PhotoParameter photoParameter = (PhotoParameter) ((CategoryParameter) this.f239019c.getFirstParameterOfType(PhotoParameter.class));
            if (photoParameter != null) {
                List listE0 = C42745f0.E0(list, photoParameter.getMaxCount());
                ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
                Iterator<T> it = listE0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ImageUploadResult((String) it.next(), new Image(P0.c()), null, 4, null));
                }
                photoParameter.setValue(new PhotoParameter.ImageUploadListWrapper(arrayList));
            }
            eVar.le();
        }
    }

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C0.Ge(e.this.f239005O, "PublishAdvertRequestViewModel:getUploadIds", (Throwable) obj, 4);
        }
    }

    /* compiled from: TypedResults.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/util/P2;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/a6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f239021b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.c) {
                return H0.f403644b;
            }
            if (p22 instanceof P2.b) {
                return z.c0(((P2.b) p22).f318720a);
            }
            if (p22 instanceof P2.a) {
                return z.M(C35936s.a(((P2.a) p22).f318719a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData;", "contactsData", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/adverts/PostAdvertResult;", "apply", "(Lcom/avito/android/publish/slots/contact_info/ContactsData;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.publish_advert_request.e$e, reason: collision with other inner class name */
    public static final class C7184e<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CategoryParameters f239023c;

        public C7184e(CategoryParameters categoryParameters) {
            this.f239023c = categoryParameters;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            e eVar = e.this;
            com.avito.android.publish.publish_advert_request.data.a aVar = eVar.f238999E;
            C0 c02 = eVar.f239005O;
            return aVar.a(c02.f231861Y.getNavigation(), this.f239023c, c02.f231865c0, c02.f231868f0);
        }
    }

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/adverts/PostAdvertResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String singleMessage;
            P2 p22 = (P2) obj;
            e eVar = e.this;
            eVar.getClass();
            if (!(p22 instanceof P2.b)) {
                if (p22 instanceof P2.a) {
                    com.avito.android.error.z.g(((P2.a) p22).f318719a, new com.avito.android.publish.publish_advert_request.f(eVar), null, null, null, null, 30);
                    return;
                }
                return;
            }
            PostAdvertResult postAdvertResult = (PostAdvertResult) ((P2.b) p22).f318720a;
            if (!(postAdvertResult instanceof PostAdvertResult.Ok)) {
                if (postAdvertResult instanceof PostAdvertResult.InputErrors) {
                    Map<String, PretendErrorValue> errors = ((PostAdvertResult.InputErrors) postAdvertResult).getMessages().getErrors();
                    if (eVar.f239005O.ze(errors)) {
                        return;
                    }
                    PretendErrorValue pretendErrorValue = (PretendErrorValue) C42745f0.F(errors.values());
                    if (pretendErrorValue == null || (singleMessage = pretendErrorValue.getSingleMessage()) == null) {
                        singleMessage = "";
                    }
                    eVar.f239010T.setValue(new a.C7182a(new ApiError.UnknownError(singleMessage, null, null, 6, null)));
                    return;
                }
                return;
            }
            PostAdvertResult.Ok ok2 = (PostAdvertResult.Ok) postAdvertResult;
            String id2 = ok2.getPostedAdvert().getId();
            String microCategoryId = ok2.getPostedAdvert().getMicroCategoryId();
            AdvertisementCategoryAlias categoryAlias = ok2.getPostedAdvert().getCategoryAlias();
            DeepLink nextStepUri = ok2.getNextStepUri();
            if (nextStepUri == null) {
                nextStepUri = new NoMatchLink();
            }
            O0 o02 = new O0(id2, microCategoryId, categoryAlias, nextStepUri);
            W0 w02 = eVar.f239009S;
            if (w02 == null) {
                w02 = null;
            }
            w02.d(o02);
            eVar.f239000J.c(new r.b());
        }
    }

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lcom/avito/android/publish/slots/contact_info/ContactsData;", "apply", "(Lkotlin/G0;)Lcom/avito/android/publish/slots/contact_info/ContactsData;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements o {
        public g() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return e.this.f239004N.b();
        }
    }

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            q qVar = (q) obj;
            e eVar = e.this;
            eVar.getClass();
            boolean z12 = qVar instanceof q.c;
            C23038g0<a> c23038g0 = eVar.f239010T;
            if (z12) {
                c23038g0.setValue(a.C7183e.f239015a);
                eVar.ke();
                y yVar = eVar.f239007Q;
                if (yVar != null) {
                    DisposableHelper.a(yVar);
                    return;
                }
                return;
            }
            if (qVar instanceof q.a) {
                c23038g0.setValue(a.d.f239014a);
                y yVar2 = eVar.f239007Q;
                if (yVar2 != null) {
                    DisposableHelper.a(yVar2);
                    return;
                }
                return;
            }
            if (qVar instanceof q.d) {
                q.d dVar = (q.d) qVar;
                c23038g0.setValue(new a.f(dVar.f216340b, dVar.f216341c));
            }
        }
    }

    /* compiled from: PublishAdvertRequestViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e eVar = e.this;
            eVar.f239010T.setValue(new a.C7182a(new ApiError.UnknownError("", null, null, 6, null)));
            y yVar = eVar.f239007Q;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
        }
    }

    public e(@k com.avito.android.publish.publish_advert_request.data.a aVar, @k InterfaceC28373a interfaceC28373a, @k InterfaceC35745a5 interfaceC35745a5, @k b0 b0Var, @k j jVar, @k InterfaceC33544d interfaceC33544d, @k C0 c02) {
        this.f238999E = aVar;
        this.f239000J = interfaceC28373a;
        this.f239001K = interfaceC35745a5;
        this.f239002L = b0Var;
        this.f239003M = jVar;
        this.f239004N = interfaceC33544d;
        this.f239005O = c02;
    }

    public final void ke() {
        CategoryParameters categoryParameters = this.f239005O.f231873k0;
        if (categoryParameters == null) {
            return;
        }
        B0 b0A = this.f239003M.a();
        InterfaceC35745a5 interfaceC35745a5 = this.f239001K;
        this.f239008R.b(b0A.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new b(categoryParameters), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void le() {
        m mVar = this.f239006P;
        if (mVar == null || mVar.getF318621e()) {
            C0 c02 = this.f239005O;
            CategoryParameters categoryParameters = c02.f231873k0;
            if (categoryParameters == null) {
                C0.Ge(c02, "Cannot create advert because params are null", null, 6);
                return;
            }
            C42026y c42026yN = this.f239004N.d(null).T(d.f239021b, Integer.MAX_VALUE).S().F().S().r(new g()).n(new C7184e(categoryParameters));
            InterfaceC35745a5 interfaceC35745a5 = this.f239001K;
            this.f239006P = (m) c42026yN.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new f(), io.reactivex.rxjava3.internal.functions.a.f401996f);
        }
    }

    public final void me(long j12) {
        this.f239010T.setValue(a.c.f239013a);
        this.f239007Q = (y) new H(this.f239003M.b().j0(this.f239001K.e()), z.F0(j12, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b)).v0(new h(), new i(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        m mVar = this.f239006P;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        y yVar = this.f239007Q;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f239008R.e();
        super.onCleared();
    }
}
