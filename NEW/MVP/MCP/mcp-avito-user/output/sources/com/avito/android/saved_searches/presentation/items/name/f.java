package com.avito.android.saved_searches.presentation.items.name;

import Eo0.InterfaceC13515a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.text.Editable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advert.item.icebreakers.n;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.E1;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import l41.o;

/* compiled from: SavedSearchNameView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/name/f;", "Lcom/avito/android/saved_searches/presentation/items/name/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f258516f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f258517b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f258518c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f258519d;

    /* renamed from: e, reason: collision with root package name */
    public final long f258520e;

    /* compiled from: SavedSearchNameView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.saved_searches.presentation.items.name.SavedSearchNameViewImpl$3", f = "SavedSearchNameView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f258522q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC13515a, G0> f258523r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super InterfaceC13515a, G0> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f258523r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f258523r, continuation);
            bVar.f258522q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((b) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f258523r.invoke(new InterfaceC13515a.h((String) this.f258522q));
            return G0.f406611a;
        }
    }

    /* compiled from: SavedSearchNameView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isOpened", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.saved_searches.presentation.items.name.SavedSearchNameViewImpl$4", f = "SavedSearchNameView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f258524q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ View f258525r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f258526s;

        /* compiled from: Views.kt */
        @s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f258527b;

            public a(f fVar) {
                this.f258527b = fVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.f258527b;
                Editable editableM53getText = fVar.f258519d.m53getText();
                Input input = fVar.f258519d;
                if (editableM53getText != null && editableM53getText.length() == 0) {
                    Input.t(input, input.getHint(), false, 6);
                }
                input.clearFocus();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, f fVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f258525r = view;
            this.f258526s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f258525r, this.f258526s, continuation);
            cVar.f258524q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return ((c) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (!((Boolean) this.f258524q).booleanValue()) {
                f fVar = this.f258526s;
                long j12 = fVar.f258520e;
                this.f258525r.postDelayed(new a(fVar), j12);
            }
            return G0.f406611a;
        }
    }

    public f(@k T t12, @k l<? super InterfaceC13515a, G0> lVar, @k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f258517b = aVar;
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.saved_search_name_root);
        this.f258518c = componentContainer;
        Input input = (Input) view.findViewById(R.id.name_input);
        this.f258519d = input;
        this.f258520e = view.getResources().getInteger(android.R.integer.config_shortAnimTime);
        componentContainer.setTitleStyle(C35835l0.j(R.attr.textH50, view.getContext()));
        input.setOnFocusChangeListener(new n(2, lVar));
        C43175k.K(new C43197r1(new b(lVar, null), y.a(com.avito.android.lib.design.input.n.e(input).y(250L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).d0(new o() { // from class: com.avito.android.saved_searches.presentation.items.name.f.a
            @Override // l41.o
            public final Object apply(Object obj) {
                return ((CharSequence) obj).toString();
            }
        }).D(io.reactivex.rxjava3.internal.functions.a.f401991a))), t12);
        C43175k.K(new C43197r1(new c(view, this, null), y.a(new C(new E1(view.getRootView(), 1)).q0(1L))), t12);
    }

    @Override // com.avito.android.saved_searches.presentation.items.name.e
    public final void ao(@Y61.l AttributedText attributedText, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        Input input = this.f258519d;
        if (String.valueOf(input.m53getText()).length() > 0) {
            return;
        }
        ComponentContainer componentContainer = this.f258518c;
        componentContainer.setTitle(str);
        Input.t(input, str2, false, 6);
        input.setHint(str3);
        input.setInputType(16385);
        componentContainer.setMessage(this.f258517b.c(componentContainer.getContext(), attributedText));
    }
}
