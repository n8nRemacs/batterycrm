package com.avito.android.mortgage.person_form.suggestion.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import com.avito.android.mortgage.person_form.mvi.domain.formatters.d;
import com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuggestionsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/domain/b;", "", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f201449d = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IZ.a f201450a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f201451b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f201452c;

    /* compiled from: SuggestionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/domain/b$a;", "", "<init>", "()V", "", "INPUT_DEBOUNCE", "J", "", "MAX_SUGGESTIONS_COUNT", "I", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuggestionsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.suggestion.mvi.domain.SuggestionsInteractor$loadSuggestions$1", f = "SuggestionsInteractor.kt", i = {0, 1, 2, 3, 4, 5}, l = {31, 32, 34, 35, 36, 37, 43, 44}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.mortgage.person_form.suggestion.mvi.domain.b$b, reason: collision with other inner class name */
    public static final class C5971b extends SuspendLambda implements p<InterfaceC43172j<? super SuggestionInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201453q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201454r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SuggestFormSuggestType f201455s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f201456t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f201457u;

        /* compiled from: SuggestionsInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mortgage.person_form.suggestion.mvi.domain.b$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f201458a;

            static {
                int[] iArr = new int[SuggestFormSuggestType.values().length];
                try {
                    iArr[SuggestFormSuggestType.ADDRESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SuggestFormSuggestType.ORGANIZATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SuggestFormSuggestType.FMS_UNIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SuggestFormSuggestType.FULL_NAME.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f201458a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5971b(SuggestFormSuggestType suggestFormSuggestType, b bVar, String str, Continuation<? super C5971b> continuation) {
            super(2, continuation);
            this.f201455s = suggestFormSuggestType;
            this.f201456t = bVar;
            this.f201457u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C5971b c5971b = new C5971b(this.f201455s, this.f201456t, this.f201457u, continuation);
            c5971b.f201454r = obj;
            return c5971b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SuggestionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C5971b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 572
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.suggestion.mvi.domain.b.C5971b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k IZ.a aVar, @k R0 r02, @k d dVar) {
        this.f201450a = aVar;
        this.f201451b = r02;
        this.f201452c = dVar;
    }

    @k
    public final InterfaceC43160i<SuggestionInternalAction> a(@k SuggestFormSuggestType suggestFormSuggestType, @k String str) {
        return C43175k.I(this.f201451b.a(), C43175k.G(new C5971b(suggestFormSuggestType, this, str, null)));
    }
}
