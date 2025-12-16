package com.avito.android.publish;

import com.avito.android.Q1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.channels.mvi.data.CallableC31711t;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.PublishSession;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.remote.model.Draft;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.rx3.g1;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishParametersInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/n0;", "Lcom/avito/android/publish/PublishParametersInteractor;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.n0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33883n0 implements PublishParametersInteractor {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final String f237442k;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H0 f237443b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PublishDraftRepository f237444c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<String> f237445d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f237446e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.drafts.E f237447f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f237448g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Q1 f237449h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f237450i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final T0 f237451j;

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/n0$a;", "", "<init>", "()V", "", "EMPTY_SERIALIZED_PUBLISH_STATE", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.n0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lcom/avito/android/util/h3;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/h3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f237452b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new AbstractC35806h3.d(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new AbstractC35806h3.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lio/reactivex/rxjava3/core/I;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$c */
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f237453b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (io.reactivex.rxjava3.core.I) obj;
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "apply", "(Lcom/avito/android/remote/model/category_parameters/CategoryParameters;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$d */
    public static final class d<T, R> implements l41.o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return C33883n0.this.f237444c.e().r(new C34145v0((CategoryParameters) obj));
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lio/reactivex/rxjava3/core/I;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$e */
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f237455b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (io.reactivex.rxjava3.core.I) obj;
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lcom/avito/android/util/h3;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/h3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$f */
    public static final class f<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f237456b = new f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new AbstractC35806h3.d(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new AbstractC35806h3.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "apply", "(Lcom/avito/android/remote/model/category_parameters/CategoryParameters;)Lcom/avito/android/publish/PublishParametersInteractor$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$g */
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f237457b = new g<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            CategoryParameters categoryParameters = (CategoryParameters) obj;
            DeepLink redirectUri = categoryParameters.getRedirectUri();
            if (redirectUri == null) {
                return new PublishParametersInteractor.a(categoryParameters, null, 2, null);
            }
            throw new PublishParametersInteractor.RedirectUriException(redirectUri);
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/PublishParametersInteractor$a;", "remoteData", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/publish/PublishParametersInteractor$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$h */
    public static final class h<T, R> implements l41.o {
        public h() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            PublishParametersInteractor.a aVar = (PublishParametersInteractor.a) obj;
            Draft draft = aVar.f232001a.getDraft();
            C33883n0 c33883n0 = C33883n0.this;
            C42026y c42026yN = draft != null ? c33883n0.f237444c.e().n(new C33979p0(c33883n0, draft, aVar)) : null;
            return c42026yN == null ? c33883n0.f237447f.a("ParametersLoadWithoutDraft").B(aVar) : c42026yN;
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$i */
    public static final class i<T, R> implements l41.o {
        public i() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return C33883n0.this.f237444c.d().B((TypedResult) obj);
        }
    }

    /* compiled from: PublishParametersInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "apply", "(Lcom/avito/android/remote/model/category_parameters/CategoryParameters;)Lcom/avito/android/publish/PublishParametersInteractor$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.n0$j */
    public static final class j<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T, R> f237460b = new j<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            CategoryParameters categoryParameters = (CategoryParameters) obj;
            DeepLink redirectUri = categoryParameters.getRedirectUri();
            if (redirectUri == null) {
                return new PublishParametersInteractor.a(categoryParameters, null, 2, null);
            }
            throw new PublishParametersInteractor.RedirectUriException(redirectUri);
        }
    }

    static {
        new a(null);
        f237442k = "";
    }

    public C33883n0(@Y61.k com.avito.android.remote.H0 h02, @Y61.k PublishDraftRepository publishDraftRepository, @Y61.k Y41.a<String> aVar, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k com.avito.android.publish.drafts.E e12, @Y61.k AttributesTreeConverter attributesTreeConverter, @Y61.k Q1 q12, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k T0 t02) {
        this.f237443b = h02;
        this.f237444c = publishDraftRepository;
        this.f237445d = aVar;
        this.f237446e = categoryParametersConverter;
        this.f237447f = e12;
        this.f237448g = attributesTreeConverter;
        this.f237449h = q12;
        this.f237450i = interfaceC41196a;
        this.f237451j = t02;
    }

    public static final TypedResult a(C33883n0 c33883n0, TypedResult typedResult) {
        CategoryParameters categoryParametersCopy$default;
        Q1 q12 = c33883n0.f237449h;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[7];
        boolean zBooleanValue = ((Boolean) q12.f67490i.a().invoke()).booleanValue();
        if (!(typedResult instanceof TypedResult.Success) || !zBooleanValue) {
            return typedResult;
        }
        CategoryParameters categoryParameters = (CategoryParameters) ((TypedResult.Success) typedResult).getResult();
        List<CategoryPublishStep> steps = categoryParameters.getSteps();
        if (steps != null) {
            Iterator<CategoryPublishStep> it = steps.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (it.next() instanceof CategoryPublishStep.Premoderation) {
                    break;
                }
                i12++;
            }
            Iterator<CategoryPublishStep> it2 = steps.iterator();
            int i13 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i13 = -1;
                    break;
                }
                CategoryPublishStep next = it2.next();
                if ((next instanceof CategoryPublishStep.Request) && kotlin.jvm.internal.L.f(next.getSubtype(), PublishSession.StepType.f232015q.f232026c)) {
                    break;
                }
                i13++;
            }
            boolean z12 = (i12 == -1 || i13 == -1) ? false : true;
            boolean z13 = i12 - i13 == 1;
            if (z12 && z13) {
                CategoryPublishStep.MergedPretendPremoderation mergedPretendPremoderation = new CategoryPublishStep.MergedPretendPremoderation((CategoryPublishStep.Request) steps.get(i13), (CategoryPublishStep.Premoderation) steps.get(i12));
                ArrayList arrayList = new ArrayList(steps);
                arrayList.remove(i12);
                arrayList.set(i13, mergedPretendPremoderation);
                categoryParametersCopy$default = CategoryParameters.copy$default(categoryParameters, null, null, null, arrayList, null, null, null, false, null, 503, null);
            } else {
                categoryParametersCopy$default = categoryParameters;
            }
            if (categoryParametersCopy$default != null) {
                categoryParameters = categoryParametersCopy$default;
            }
        }
        return new TypedResult.Success(categoryParameters);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.z<AbstractC35806h3<CategoryParameters>> c(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, @Y61.l String str) {
        return f(new io.reactivex.rxjava3.internal.operators.single.G(new CallableC31711t(this, navigation2, categoryParameters, null, str)).n(e.f237455b).r(new C34141t0(this)), categoryParameters).F().d0(f.f237456b).r0(AbstractC35806h3.e.f318894a);
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> e(@Y61.k Navigation navigation2, @Y61.l CategoryParameters categoryParameters, boolean z12, @Y61.l String str) {
        return g1.a(f(new io.reactivex.rxjava3.internal.operators.single.G(new CallableC31711t(this, navigation2, categoryParameters, Boolean.valueOf(z12), str)).n(c.f237453b).r(new C34141t0(this)), categoryParameters)).n(new d());
    }

    public final io.reactivex.rxjava3.core.I f(io.reactivex.rxjava3.internal.operators.single.O o12, CategoryParameters categoryParameters) {
        Q1 q12 = this.f237449h;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[8];
        return !((Boolean) q12.f67492j.a().invoke()).booleanValue() ? o12 : o12.r(new C33985s0(categoryParameters, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> g(@Y61.k Navigation navigation2, @Y61.l String str, @Y61.l Map<String, ? extends Object> map, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CategoryParametersConverter categoryParametersConverter = this.f237446e;
        linkedHashMap.putAll(categoryParametersConverter.convertToFieldMap(navigation2));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map != null) {
            linkedHashMap2.putAll(categoryParametersConverter.convertToFieldMap(map));
        }
        Y41.a<String> aVar = str == null ? this.f237445d : null;
        String str4 = aVar != null ? (String) ((kotlin.jvm.internal.V) aVar).get() : null;
        return g1.a(f((this.f237449h.z().invoke().booleanValue() ? this.f237443b.I(str4, linkedHashMap, linkedHashMap2, str, str2, bool, str3) : this.f237443b.H(str4, linkedHashMap, linkedHashMap2, str, str2, bool, str3)).r(new C34141t0(this)), null)).r(g.f237457b).n(new h());
    }

    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ItemBrief> h(@Y61.k String str) {
        return this.f237443b.n(str, "edit", this.f237445d.invoke());
    }

    public final io.reactivex.rxjava3.internal.operators.maybe.T i(Draft draft, CategoryParameters categoryParameters) {
        String publishSessionId = draft.getPublishSessionId();
        String draftId = draft.getDraftId();
        boolean shouldSaveDraft = categoryParameters.getShouldSaveDraft();
        Navigation navigation2 = categoryParameters.getNavigation();
        String draftId2 = draft.getDraftId();
        int version = draft.getVersion();
        return new io.reactivex.rxjava3.internal.operators.maybe.T(this.f237444c.c(publishSessionId, draftId, categoryParameters, f237442k, false, shouldSaveDraft, (3584 & 64) != 0 ? null : draftId2, (3584 & 128) != 0 ? null : Integer.valueOf(version), navigation2, (3584 & 512) != 0 ? null : null, (3584 & 1024) != 0 ? new LocalPublishState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : null, (3584 & 2048) != 0 ? false : false, kotlin.jvm.internal.L.f(this.f237450i.a(), InterfaceC42451b.C11596b.f405967a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PublishParametersInteractor.a> j(@Y61.k Navigation navigation2, @Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        io.reactivex.rxjava3.core.I<TypedResult<CategoryParameters>> iA2;
        boolean zBooleanValue = this.f237449h.z().invoke().booleanValue();
        Y41.a<String> aVar = this.f237445d;
        T0 t02 = this.f237451j;
        CategoryParametersConverter categoryParametersConverter = this.f237446e;
        if (zBooleanValue) {
            iA2 = this.f237443b.D(str, categoryParametersConverter.convertToFieldMap(navigation2), str2, (String) ((kotlin.jvm.internal.V) aVar).get(), t02.j(false), str3);
        } else {
            iA2 = this.f237443b.A(str, categoryParametersConverter.convertToFieldMap(navigation2), str2, (String) ((kotlin.jvm.internal.V) aVar).get(), t02.j(false), str3);
        }
        return g1.a(f(iA2.n(new i()).r(new C34141t0(this)), null)).r(j.f237460b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.PublishParametersInteractor
    @Y61.k
    public final io.reactivex.rxjava3.core.z k(@Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters, @Y61.k String str) {
        List<ParameterSlot> parametersExceptOwnedBySlots = categoryParameters.getParametersExceptOwnedBySlots();
        CategoryParametersConverter categoryParametersConverter = this.f237446e;
        Map<String, String> mapConvertToFieldMap = categoryParametersConverter.convertToFieldMap(parametersExceptOwnedBySlots);
        return this.f237443b.p(str, (String) ((kotlin.jvm.internal.V) this.f237445d).get(), categoryParametersConverter.convertToFieldMap(navigation2), mapConvertToFieldMap).d0(new l41.o() { // from class: com.avito.android.publish.u0
            @Override // l41.o
            public final Object apply(Object obj) {
                return C33883n0.a(this.f245504b, (TypedResult) obj);
            }
        }).d0(b.f237452b).r0(AbstractC35806h3.e.f318894a);
    }
}
