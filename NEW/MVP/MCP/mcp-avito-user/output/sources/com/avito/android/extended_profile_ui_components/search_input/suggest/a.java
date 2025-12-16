package com.avito.android.extended_profile_ui_components.search_input.suggest;

import Y41.p;
import android.text.SpannableStringBuilder;
import androidx.camera.camera2.internal.G;
import com.avito.android.extended_profile_ui_components.search_input.suggest.c;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kA0.C42560e;
import kA0.InterfaceC42557b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;

/* compiled from: ExtendedProfileSuggestInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/suggest/a;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC42557b> f153425a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f153426b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public volatile N0 f153427c;

    /* compiled from: ExtendedProfileSuggestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_ui_components/search_input/suggest/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_ui_components.search_input.suggest.ExtendedProfileSuggestInteractor$getSuggests$1", f = "ExtendedProfileSuggestInteractor.kt", i = {}, l = {32, 37}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile_ui_components.search_input.suggest.a$a, reason: collision with other inner class name */
    public static final class C4475a extends SuspendLambda implements p<InterfaceC43172j<? super c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153428q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f153429r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f153431t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f153432u;

        /* compiled from: ExtendedProfileSuggestInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.extended_profile_ui_components.search_input.suggest.ExtendedProfileSuggestInteractor$getSuggests$1$1", f = "ExtendedProfileSuggestInteractor.kt", i = {}, l = {44, 46, 55}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.extended_profile_ui_components.search_input.suggest.a$a$a, reason: collision with other inner class name */
        public static final class C4476a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f153433q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f153434r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a f153435s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<c> f153436t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f153437u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f153438v;

            /* compiled from: ExtendedProfileSuggestInteractor.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LkA0/e;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.extended_profile_ui_components.search_input.suggest.ExtendedProfileSuggestInteractor$getSuggests$1$1$deferred$1", f = "ExtendedProfileSuggestInteractor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.extended_profile_ui_components.search_input.suggest.a$a$a$a, reason: collision with other inner class name */
            public static final class C4477a extends SuspendLambda implements p<T, Continuation<? super TypedResult<C42560e>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f153439q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ a f153440r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f153441s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f153442t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4477a(a aVar, String str, String str2, Continuation<? super C4477a> continuation) {
                    super(2, continuation);
                    this.f153440r = aVar;
                    this.f153441s = str;
                    this.f153442t = str2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C4477a(this.f153440r, this.f153441s, this.f153442t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<C42560e>> continuation) {
                    return ((C4477a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f153439q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC42557b interfaceC42557b = this.f153440r.f153425a.get();
                        this.f153439q = 1;
                        obj = interfaceC42557b.b(this.f153441s, this.f153442t, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4476a(a aVar, InterfaceC43172j<? super c> interfaceC43172j, String str, String str2, Continuation<? super C4476a> continuation) {
                super(2, continuation);
                this.f153435s = aVar;
                this.f153436t = interfaceC43172j;
                this.f153437u = str;
                this.f153438v = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4476a c4476a = new C4476a(this.f153435s, this.f153436t, this.f153437u, this.f153438v, continuation);
                c4476a.f153434r = obj;
                return c4476a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4476a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f153433q;
                try {
                } catch (Throwable th2) {
                    InterfaceC43172j<c> interfaceC43172j = this.f153436t;
                    c.b bVar = new c.b(th2);
                    this.f153433q = 3;
                    if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43076a0 interfaceC43076a0B = C43259k.b((T) this.f153434r, this.f153435s.f153426b.a(), new C4477a(this.f153435s, this.f153437u, this.f153438v, null), 2);
                    this.f153435s.f153427c = interfaceC43076a0B;
                    this.f153433q = 1;
                    obj = interfaceC43076a0B.F(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    C42729a0.b(obj);
                }
                TypedResult typedResult = (TypedResult) obj;
                InterfaceC43172j<c> interfaceC43172j2 = this.f153436t;
                a aVar = this.f153435s;
                String str = this.f153437u;
                if (!(typedResult instanceof TypedResult.Success)) {
                    if (typedResult instanceof TypedResult.Error) {
                        throw C35936s.a(((TypedResult.Error) typedResult).getError(), ((TypedResult.Error) typedResult).getCause());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c.a aVar2 = new c.a(a.a(aVar, ((C42560e) ((TypedResult.Success) typedResult).getResult()).a(), str));
                this.f153433q = 2;
                if (interfaceC43172j2.emit(aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4475a(String str, String str2, Continuation<? super C4475a> continuation) {
            super(2, continuation);
            this.f153431t = str;
            this.f153432u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C4475a c4475a = a.this.new C4475a(this.f153431t, this.f153432u, continuation);
            c4475a.f153429r = obj;
            return c4475a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4475a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153428q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f153429r;
            a aVar = a.this;
            N0 n02 = aVar.f153427c;
            String str = null;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            aVar.f153427c = null;
            if (C43066x.K(this.f153431t)) {
                c.a aVar2 = new c.a(C42784z0.f406748b);
                this.f153428q = 1;
                if (interfaceC43172j.emit(aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
            String str2 = this.f153432u;
            if (str2 != null && !C43066x.K(str2)) {
                str = str2;
            }
            C4476a c4476a = new C4476a(a.this, interfaceC43172j, this.f153431t, str == null ? DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME : str, null);
            this.f153428q = 2;
            if (t1.c(c4476a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f153425a = eVar;
        this.f153426b = r02;
    }

    public static final ArrayList a(a aVar, List list, String str) {
        aVar.getClass();
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (String str2 : list2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            List listF0 = C43066x.f0(str, new String[]{" "}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listF0) {
                if (!C43066x.K((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                int iG2 = C43066x.G(str2, str3, 0, true);
                while (iG2 != -1) {
                    int length = str3.length() + iG2;
                    androidx.media3.extractor.text.cea.a.a(1, spannableStringBuilder, iG2, length, 33);
                    iG2 = C43066x.G(str2, str3, length, false);
                }
            }
            arrayList.add(new SuggestItem(G.f("suggest_", str2), spannableStringBuilder));
        }
        return arrayList;
    }

    @Y61.k
    public final InterfaceC43160i<c> b(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new C4475a(str, str2, null));
    }
}
