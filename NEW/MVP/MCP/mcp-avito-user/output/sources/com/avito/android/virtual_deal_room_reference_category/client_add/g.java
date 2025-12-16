package com.avito.android.virtual_deal_room_reference_category.client_add;

import Gf0.ViewOnClickListenerC13875b;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.view.C23069w;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.K2;
import j.D;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import rO0.C47580d;
import rO0.InterfaceC47577a;

/* compiled from: ClientAddView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/g;", "Lcom/avito/android/virtual_deal_room_reference_category/client_add/d;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements com.avito.android.virtual_deal_room_reference_category.client_add.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC47577a, G0> f327157a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Lifecycle f327158b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final T f327159c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View f327160d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public View f327161e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public View f327162f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Input f327163g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Input f327164h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Input f327165i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Input f327166j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Button f327167k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public UU.a f327168l;

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = g.this.f327163g;
            if (input != null) {
                input.requestFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddViewImpl$setContentView$2$2", f = "ClientAddView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f327170q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            b bVar = g.this.new b(continuation);
            bVar.f327170q = obj;
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
            g.this.f327157a.invoke(new InterfaceC47577a.f((String) this.f327170q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = g.this.f327165i;
            if (input != null) {
                input.requestFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddViewImpl$setContentView$3$2", f = "ClientAddView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f327173q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            d dVar = g.this.new d(continuation);
            dVar.f327173q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            g.this.f327157a.invoke(new InterfaceC47577a.c((String) this.f327173q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = g.this.f327166j;
            if (input != null) {
                input.requestFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddViewImpl$setContentView$4$2", f = "ClientAddView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f327176q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            f fVar = g.this.new f(continuation);
            fVar.f327176q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((f) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            g.this.f327157a.invoke(new InterfaceC47577a.d((String) this.f327176q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.virtual_deal_room_reference_category.client_add.g$g, reason: collision with other inner class name */
    public static final class C10142g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Input f327178l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10142g(Input input) {
            super(0);
            this.f327178l = input;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = this.f327178l;
            input.clearFocus();
            K2.d(input, false);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddViewImpl$setContentView$5$2", f = "ClientAddView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f327179q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            h hVar = g.this.new h(continuation);
            hVar.f327179q = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((h) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            g.this.f327157a.invoke(new InterfaceC47577a.b((String) this.f327179q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f327157a.invoke(InterfaceC47577a.e.f429780a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC47577a, G0> lVar, @k Lifecycle lifecycle, @k T t12) {
        this.f327157a = lVar;
        this.f327158b = lifecycle;
        this.f327159c = t12;
    }

    public static InterfaceC43160i f(g gVar, Input input) {
        gVar.getClass();
        return C23069w.a(y.a(n.f(input).d0(new com.avito.android.virtual_deal_room_reference_category.client_add.f()).D(io.reactivex.rxjava3.internal.functions.a.f401991a)), gVar.f327158b, Lifecycle.State.f46682e);
    }

    public static void g(g gVar, Input input, CharSequence charSequence) {
        gVar.getClass();
        String deformattedText = input.getDeformattedText();
        if (charSequence.length() <= 0 || charSequence.equals(deformattedText)) {
            charSequence = null;
        }
        if (charSequence != null) {
            Input.t(input, charSequence, false, 6);
        }
    }

    @Override // com.avito.android.virtual_deal_room_reference_category.client_add.d
    public final void a(@Y61.l View view) {
        Button button;
        Context context;
        this.f327162f = view;
        String string = (view == null || (context = view.getContext()) == null) ? null : context.getString(R.string.virtual_deal_room_reference_category_save);
        if (string == null) {
            string = "";
        }
        this.f327168l = new UU.a(string, null, false, false, false, new i(), null, null, null, false, 990, null);
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.save_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            button = (Button) viewFindViewById;
            UU.a aVar = this.f327168l;
            if (aVar != null) {
                button.setState(aVar);
            }
        } else {
            button = null;
        }
        this.f327167k = button;
    }

    @Override // com.avito.android.virtual_deal_room_reference_category.client_add.d
    public final void b(@Y61.l View view) {
        View view2;
        Input input;
        Input input2;
        Input input3;
        Input input4 = null;
        if (view != null) {
            view.setOnClickListener(new ViewOnClickListenerC13875b(view, 4));
            view2 = view;
        } else {
            view2 = null;
        }
        this.f327161e = view2;
        T t12 = this.f327159c;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.input_surname);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input = (Input) viewFindViewById;
            d(input, new a());
            C43175k.K(new C43197r1(new b(null), f(this, input)), t12);
        } else {
            input = null;
        }
        this.f327164h = input;
        if (view != null) {
            View viewFindViewById2 = view.findViewById(R.id.input_name);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input2 = (Input) viewFindViewById2;
            d(input2, new c());
            C43175k.K(new C43197r1(new d(null), f(this, input2)), t12);
        } else {
            input2 = null;
        }
        this.f327163g = input2;
        if (view != null) {
            View viewFindViewById3 = view.findViewById(R.id.input_phone);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input3 = (Input) viewFindViewById3;
            d(input3, new e());
            C43175k.K(new C43197r1(new f(null), f(this, input3)), t12);
        } else {
            input3 = null;
        }
        this.f327165i = input3;
        if (view != null) {
            View viewFindViewById4 = view.findViewById(R.id.input_email);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            Input input5 = (Input) viewFindViewById4;
            d(input5, new C10142g(input5));
            C43175k.K(new C43197r1(new h(null), f(this, input5)), t12);
            input4 = input5;
        }
        this.f327166j = input4;
    }

    @Override // com.avito.android.virtual_deal_room_reference_category.client_add.d
    public final void c(@k C47580d c47580d) {
        UU.a aVar = this.f327168l;
        if (aVar != null) {
            UU.a aVarA = UU.a.a(aVar, null, false, c47580d.f429807f, false, null, 1015);
            Button button = this.f327167k;
            if (button != null) {
                button.setState(aVarA);
            }
        }
        Input input = this.f327163g;
        if (input != null) {
            g(this, input, c47580d.f429802a);
        }
        Input input2 = this.f327164h;
        if (input2 != null) {
            g(this, input2, c47580d.f429803b);
        }
        Input input3 = this.f327165i;
        if (input3 != null) {
            g(this, input3, c47580d.f429804c);
        }
        Input input4 = this.f327166j;
        if (input4 != null) {
            g(this, input4, c47580d.f429805d);
        }
        Input input5 = this.f327163g;
        boolean z12 = c47580d.f429807f;
        if (input5 != null) {
            input5.setEnabled(!z12);
        }
        Input input6 = this.f327164h;
        if (input6 != null) {
            input6.setEnabled(!z12);
        }
        Input input7 = this.f327165i;
        if (input7 != null) {
            input7.setEnabled(!z12);
        }
        Input input8 = this.f327166j;
        if (input8 == null) {
            return;
        }
        input8.setEnabled(!z12);
    }

    public final void d(Input input, Y41.a aVar) {
        C43175k.K(new C43197r1(new com.avito.android.virtual_deal_room_reference_category.client_add.e(aVar, null), C23069w.a(y.a(n.a(input, 6)), this.f327158b, Lifecycle.State.f46682e)), this.f327159c);
    }

    public final void e(PrintableText printableText, @D int i12) {
        Context context;
        View view = this.f327161e;
        String strK0 = null;
        if (view != null && (context = view.getContext()) != null && printableText != null) {
            strK0 = printableText.k0(context);
        }
        if (strK0 != null) {
            View view2 = this.f327161e;
            if (view2 != null) {
                View viewFindViewById = view2.findViewById(i12);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
                }
                ComponentContainer.n((ComponentContainer) viewFindViewById, strK0, 2);
                return;
            }
            return;
        }
        View view3 = this.f327161e;
        if (view3 != null) {
            View viewFindViewById2 = view3.findViewById(i12);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
            }
            ((ComponentContainer) viewFindViewById2).k();
        }
    }
}
