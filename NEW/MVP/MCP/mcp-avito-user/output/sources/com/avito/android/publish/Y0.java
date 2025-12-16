package com.avito.android.publish;

import android.annotation.SuppressLint;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.W0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.drafts.C33842h;
import com.avito.android.publish.drafts.IdValuePair;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import yc.C50213a;

/* compiled from: SubmissionPresenter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Y0;", "Lcom/avito/android/publish/W0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Y0 implements W0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f232107a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232108b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f232109c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f232110d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PublishDraftRepository f232111e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.drafts.E f232112f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Gson f232113g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f232114h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.drafts.K f232115i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final W0.b f232116j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f232117k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232118l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to delete publish draft!", (Throwable) obj);
            Y0.this.f232114h.getF125491k().getClass();
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "apply", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f232120b = new b<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "it", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f232121b = new c<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            W0.a.a(Y0.this, false, 3);
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f232123b = new e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to listen to parameter changes", (Throwable) obj);
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f232124b;

        public f(Y41.a<kotlin.G0> aVar) {
            this.f232124b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f232124b.invoke();
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/publish/drafts/h;", "optionalDraft", "Lkotlin/G0;", "accept", "(Larrow/core/Y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) throws NotFoundException {
            CategoryParameters categoryParameters;
            C33842h c33842h = (C33842h) ((arrow.core.Y0) obj).c();
            if (c33842h == null || (categoryParameters = c33842h.f235387m) == null) {
                return;
            }
            C0 c02 = Y0.this.f232107a;
            c02.Je(categoryParameters, c02.f231861Y);
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f232126b = new h<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "serializedState", "Lio/reactivex/rxjava3/core/w;", "Lcom/avito/android/publish/drafts/I;", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CategoryParameters f232128c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f232129d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ PublishState f232130e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f232131f;

        public i(CategoryParameters categoryParameters, boolean z12, PublishState publishState, boolean z13) {
            this.f232128c = categoryParameters;
            this.f232129d = z12;
            this.f232130e = publishState;
            this.f232131f = z13;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Object next;
            Object next2;
            String str = (String) obj;
            Y0 y02 = Y0.this;
            PublishDraftRepository publishDraftRepository = y02.f232111e;
            String strB = y02.f232110d.b();
            String str2 = y02.f232107a.f231866d0;
            if (str2 == null) {
                str2 = null;
            }
            CategoryParameters categoryParameters = this.f232128c;
            boolean shouldSaveDraft = categoryParameters.getShouldSaveDraft();
            PublishState publishState = this.f232130e;
            Navigation navigationH = publishState.h();
            String activeFieldId = publishState.getActiveFieldId();
            List<CategoryPublishStep> steps = categoryParameters.getSteps();
            if (steps == null) {
                steps = C42784z0.f406748b;
            }
            List<ParameterSlot> parameters = categoryParameters.getParameters();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                T next3 = it.next();
                Iterator<T> it2 = it;
                ParameterSlot parameterSlot = (ParameterSlot) next3;
                String str3 = activeFieldId;
                if ((parameterSlot instanceof CharParameter) && ((CharParameter) parameterSlot).getInputType() == CharParameter.InputType.VIN) {
                    arrayList.add(next3);
                }
                it = it2;
                activeFieldId = str3;
            }
            String str4 = activeFieldId;
            int iF2 = kotlin.collections.P0.f(C42745f0.q(arrayList, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next4 = it3.next();
                linkedHashMap.put(((ParameterSlot) next4).getId(), next4);
            }
            ArrayList arrayList2 = new ArrayList();
            for (T t12 : parameters) {
                if (t12 instanceof CharParameter) {
                    arrayList2.add(t12);
                }
            }
            int iF3 = kotlin.collections.P0.f(C42745f0.q(arrayList2, 10));
            if (iF3 < 16) {
                iF3 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF3);
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object next5 = it4.next();
                linkedHashMap2.put(((CharParameter) next5).getId(), next5);
            }
            Set<Map.Entry<Integer, PublishState.StepState>> setEntrySet = publishState.k().entrySet();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it5 = setEntrySet.iterator();
            while (it5.hasNext()) {
                Map.Entry entry = (Map.Entry) it5.next();
                Iterator<T> it6 = it5;
                int iIntValue = ((Number) entry.getKey()).intValue();
                PublishState.StepState stepState = (PublishState.StepState) entry.getValue();
                Navigation navigation2 = navigationH;
                if (stepState instanceof PublishState.StepState.Vin) {
                    Iterator<T> it7 = steps.get(iIntValue).getFields().iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it7.next();
                        Iterator<T> it8 = it7;
                        if (linkedHashMap.get((String) next2) != null) {
                            break;
                        }
                        it7 = it8;
                    }
                    String str5 = (String) next2;
                    String recognizedVin = ((PublishState.StepState.Vin) stepState).getRecognizedVin();
                    if (recognizedVin != null && str5 != null) {
                        arrayList3.add(new IdValuePair(str5, recognizedVin));
                    }
                } else if (stepState instanceof PublishState.StepState.Imei) {
                    Iterator<T> it9 = steps.get(iIntValue).getFields().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it9.next();
                        Iterator<T> it10 = it9;
                        if (linkedHashMap2.get((String) next) != null) {
                            break;
                        }
                        it9 = it10;
                    }
                    String str6 = (String) next;
                    String recognizedImei = ((PublishState.StepState.Imei) stepState).getRecognizedImei();
                    if (recognizedImei != null && str6 != null) {
                        arrayList3.add(new IdValuePair(str6, recognizedImei));
                    }
                } else if (!(stepState instanceof PublishState.StepState.CategoriesSuggestions)) {
                    boolean z12 = stepState instanceof PublishState.StepState.Wizard;
                }
                navigationH = navigation2;
                it5 = it6;
            }
            LocalPublishState localPublishState = new LocalPublishState(arrayList3, C42745f0.M0(publishState.e()));
            return publishDraftRepository.c(strB, str2, categoryParameters, str, this.f232129d, shouldSaveDraft, (3584 & 64) != 0 ? null : null, (3584 & 128) != 0 ? null : null, navigationH, (3584 & 512) != 0 ? null : str4, (3584 & 1024) != 0 ? new LocalPublishState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : localPublishState, (3584 & 2048) != 0 ? false : this.f232131f, kotlin.jvm.internal.L.f(y02.f232117k.a(), InterfaceC42451b.C11596b.f405967a));
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "saveDraftIfNeeded", th2);
            Y0.this.f232114h.getF125491k().getClass();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f232133l = new k();

        public k() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            V2.f318762a.c("saveDraftIfNeeded", "Draft saved!", null);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/drafts/I;", "kotlin.jvm.PlatformType", "saveInfo", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/drafts/I;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.publish.drafts.I, kotlin.G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(com.avito.android.publish.drafts.I i12) {
            com.avito.android.publish.drafts.I i13 = i12;
            String str = i13.f235321a;
            Y0 y02 = Y0.this;
            if (str != null) {
                y02.f232107a.f231865c0 = str;
            }
            String str2 = i13.f235322b;
            if (str2 != null) {
                y02.f232115i.a(str2);
            }
            DeepLinksDialogInfo deepLinksDialogInfo = i13.f235323c;
            if (deepLinksDialogInfo != null) {
                y02.f232107a.f231880r0.postValue(deepLinksDialogInfo);
            }
            return kotlin.G0.f406611a;
        }
    }

    public Y0(@Y61.k C0 c02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C50213a c50213a, @Y61.k PublishDraftRepository publishDraftRepository, @Y61.k com.avito.android.publish.drafts.E e12, @Y61.k Gson gson, @Y61.k com.avito.android.util.C c12, @Y61.k com.avito.android.publish.drafts.K k12, @Y61.k W0.b bVar, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f232107a = c02;
        this.f232108b = interfaceC35745a5;
        this.f232109c = interfaceC33535v;
        this.f232110d = c50213a;
        this.f232111e = publishDraftRepository;
        this.f232112f = e12;
        this.f232113g = gson;
        this.f232114h = c12;
        this.f232115i = k12;
        this.f232116j = bVar;
        this.f232117k = interfaceC41196a;
    }

    @Override // com.avito.android.publish.W0
    public final void a(boolean z12, boolean z13) {
        if (z12 && z13) {
            C0 c02 = this.f232107a;
            W0.a.a(this, !(c02.f231870h0 || c02.f231871i0), 2);
        }
    }

    @Override // com.avito.android.publish.W0
    @SuppressLint({"CheckResult"})
    public final boolean b(boolean z12, boolean z13) {
        CategoryParameters categoryParameters;
        CategoryParameters categoryParametersDeepCopy;
        C0 c02 = this.f232107a;
        if ((z13 && c02.Ce()) || (categoryParameters = c02.f231873k0) == null || (categoryParametersDeepCopy = categoryParameters.deepCopy()) == null) {
            return false;
        }
        final PublishState publishStateC = c02.f231861Y.c();
        if (z13 && publishStateC.e().isEmpty()) {
            return false;
        }
        io.reactivex.rxjava3.internal.operators.single.D d12 = new io.reactivex.rxjava3.internal.operators.single.D(new io.reactivex.rxjava3.internal.operators.single.G(new Callable() { // from class: com.avito.android.publish.X0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f232103b.f232113g.l(publishStateC);
            }
        }), new i(categoryParametersDeepCopy, !publishStateC.e().isEmpty() && categoryParametersDeepCopy.getShouldSaveDraft(), publishStateC, z12));
        InterfaceC35745a5 interfaceC35745a5 = this.f232108b;
        d12.p(interfaceC35745a5.a()).k(interfaceC35745a5.e()).n(A1.a(new l()), A1.c(new j()), A1.b(k.f232133l));
        return true;
    }

    @Override // com.avito.android.publish.W0
    public final void c() {
        this.f232118l.e();
    }

    @Override // com.avito.android.publish.W0
    public final void d(@Y61.k O0 o02) {
        C0 c02 = this.f232107a;
        String str = o02.f231951a;
        c02.f231862Z = str;
        this.f232112f.a("AdvertPublished").x(this.f232108b.a()).v(new com.avito.android.advert_core.task.a(17), new a());
        Integer categoryId = c02.f231861Y.getNavigation().getCategoryId();
        InterfaceC33535v interfaceC33535v = this.f232109c;
        interfaceC33535v.w(categoryId);
        AdvertisementCategoryAlias advertisementCategoryAlias = o02.f231953c;
        if (advertisementCategoryAlias != null) {
            interfaceC33535v.i0(advertisementCategoryAlias);
        }
        interfaceC33535v.C(c02.f231861Y.getNavigation().getCategoryId(), o02);
        DeepLink deepLink = o02.f231954d;
        boolean z12 = deepLink instanceof NoMatchLink;
        W0.b bVar = this.f232116j;
        if (z12) {
            bVar.L0(str);
        } else {
            bVar.a(deepLink);
        }
    }

    @Override // com.avito.android.publish.W0
    public final void e() {
        b(false, false);
    }

    @Override // com.avito.android.publish.W0
    public final void f(@Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2) {
        io.reactivex.rxjava3.internal.operators.single.U uE2 = this.f232111e.e();
        InterfaceC35745a5 interfaceC35745a5 = this.f232108b;
        this.f232118l.b(new C42016n(uE2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new f(aVar)), new B0(aVar2, 1)).x(new g(), h.f232126b));
    }

    @Override // com.avito.android.publish.W0
    public final void i() {
        C0 c02 = this.f232107a;
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(c02.f231881s0.d0(b.f232120b), c02.f231882t0.d0(c.f232121b).n0(5L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b));
        d dVar = new d();
        l41.g<? super Throwable> gVar = e.f232123b;
        zVarG0.getClass();
        this.f232118l.b(zVarG0.v0(dVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
