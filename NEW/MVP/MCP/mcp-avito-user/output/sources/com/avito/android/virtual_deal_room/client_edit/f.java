package com.avito.android.virtual_deal_room.client_edit;

import CN0.a;
import Gf0.ViewOnClickListenerC13875b;
import Y41.p;
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
import com.avito.android.util.D6;
import com.avito.android.util.H2;
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

/* compiled from: ClientEditView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/f;", "Lcom/avito/android/virtual_deal_room/client_edit/c;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.android.virtual_deal_room.client_edit.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<CN0.a, G0> f326157a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Lifecycle f326158b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T f326159c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View f326160d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public View f326161e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public View f326162f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Input f326163g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Input f326164h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Input f326165i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Input f326166j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Input f326167k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Button f326168l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public UU.a f326169m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public H2 f326170n;

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = f.this.f326165i;
            if (input != null) {
                input.requestFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditViewImpl$setContentView$2$2", f = "ClientEditView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f326172q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f326172q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((b) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f.this.f326157a.invoke(new a.c((String) this.f326172q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = f.this.f326163g;
            if (input != null) {
                input.requestFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditViewImpl$setContentView$3$2", f = "ClientEditView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f326175q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = f.this.new d(continuation);
            dVar.f326175q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f.this.f326157a.invoke(new a.g((String) this.f326175q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = f.this.f326166j;
            if (input != null) {
                input.requestFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditViewImpl$setContentView$4$2", f = "ClientEditView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.virtual_deal_room.client_edit.f$f, reason: collision with other inner class name */
    public static final class C10084f extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f326178q;

        public C10084f(Continuation<? super C10084f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C10084f c10084f = f.this.new C10084f(continuation);
            c10084f.f326178q = obj;
            return c10084f;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((C10084f) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f.this.f326157a.invoke(new a.d((String) this.f326178q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = f.this.f326167k;
            if (input != null) {
                input.requestFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditViewImpl$setContentView$5$2", f = "ClientEditView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f326181q;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = f.this.new h(continuation);
            hVar.f326181q = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((h) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f.this.f326157a.invoke(new a.e((String) this.f326181q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Input f326183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Input input) {
            super(0);
            this.f326183l = input;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Input input = this.f326183l;
            input.clearFocus();
            K2.d(input, false);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditViewImpl$setContentView$6$2", f = "ClientEditView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f326184q;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = f.this.new j(continuation);
            jVar.f326184q = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((j) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f.this.f326157a.invoke(new a.b((String) this.f326184q));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isKeyboardVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<Boolean, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            D6.G(f.this.f326168l, !bool.booleanValue());
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<G0> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f326157a.invoke(a.f.f2136a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@Y61.k Y41.l<? super CN0.a, G0> lVar, @Y61.k Lifecycle lifecycle, @Y61.k T t12) {
        this.f326157a = lVar;
        this.f326158b = lifecycle;
        this.f326159c = t12;
    }

    public static InterfaceC43160i f(f fVar, Input input) {
        fVar.getClass();
        return C23069w.a(y.a(n.f(input).d0(new com.avito.android.virtual_deal_room.client_edit.e()).D(io.reactivex.rxjava3.internal.functions.a.f401991a)), fVar.f326158b, Lifecycle.State.f46682e);
    }

    public static void g(f fVar, Input input, CharSequence charSequence) {
        fVar.getClass();
        String deformattedText = input.getDeformattedText();
        if (charSequence.length() <= 0 || charSequence.equals(deformattedText)) {
            charSequence = null;
        }
        if (charSequence != null) {
            Input.t(input, charSequence, false, 6);
        }
    }

    @Override // com.avito.android.virtual_deal_room.client_edit.c
    public final void a(@Y61.l View view) {
        Button button;
        Context context;
        this.f326162f = view;
        String string = (view == null || (context = view.getContext()) == null) ? null : context.getString(R.string.virtual_deal_room_save);
        if (string == null) {
            string = "";
        }
        this.f326169m = new UU.a(string, null, false, false, false, new l(), null, null, null, false, 990, null);
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.save_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            button = (Button) viewFindViewById;
            UU.a aVar = this.f326169m;
            if (aVar != null) {
                button.setState(aVar);
            }
        } else {
            button = null;
        }
        this.f326168l = button;
    }

    @Override // com.avito.android.virtual_deal_room.client_edit.c
    public final void b(@Y61.l View view) {
        View view2;
        Input input;
        Input input2;
        Input input3;
        Input input4;
        Input input5;
        if (view != null) {
            view.setOnClickListener(new ViewOnClickListenerC13875b(view, 2));
            view2 = view;
        } else {
            view2 = null;
        }
        this.f326161e = view2;
        T t12 = this.f326159c;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.input_name);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input = (Input) viewFindViewById;
            d(input, new a());
            C43175k.K(new C43197r1(new b(null), f(this, input)), t12);
        } else {
            input = null;
        }
        this.f326163g = input;
        if (view != null) {
            View viewFindViewById2 = view.findViewById(R.id.input_surname);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input2 = (Input) viewFindViewById2;
            d(input2, new c());
            C43175k.K(new C43197r1(new d(null), f(this, input2)), t12);
        } else {
            input2 = null;
        }
        this.f326164h = input2;
        if (view != null) {
            View viewFindViewById3 = view.findViewById(R.id.input_patronymic);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input3 = (Input) viewFindViewById3;
            d(input3, new e());
            C43175k.K(new C43197r1(new C10084f(null), f(this, input3)), t12);
        } else {
            input3 = null;
        }
        this.f326165i = input3;
        if (view != null) {
            View viewFindViewById4 = view.findViewById(R.id.input_phone);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input4 = (Input) viewFindViewById4;
            d(input4, new g());
            C43175k.K(new C43197r1(new h(null), f(this, input4)), t12);
        } else {
            input4 = null;
        }
        this.f326166j = input4;
        if (view != null) {
            View viewFindViewById5 = view.findViewById(R.id.input_email);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
            }
            input5 = (Input) viewFindViewById5;
            d(input5, new i(input5));
            C43175k.K(new C43197r1(new j(null), f(this, input5)), t12);
        } else {
            input5 = null;
        }
        this.f326167k = input5;
        H2 h22 = this.f326170n;
        if (h22 != null) {
            h22.dispose();
        }
        this.f326170n = view != null ? K2.b(view, new k()) : null;
    }

    @Override // com.avito.android.virtual_deal_room.client_edit.c
    public final void c(@Y61.k CN0.c cVar) {
        UU.a aVar = this.f326169m;
        if (aVar != null) {
            UU.a aVarA = UU.a.a(aVar, null, cVar.f2154i, cVar.f2153h, false, null, 1011);
            Button button = this.f326168l;
            if (button != null) {
                button.setState(aVarA);
            }
        }
        Input input = this.f326163g;
        if (input != null) {
            g(this, input, cVar.f2147b);
        }
        Input input2 = this.f326164h;
        if (input2 != null) {
            g(this, input2, cVar.f2148c);
        }
        Input input3 = this.f326165i;
        if (input3 != null) {
            g(this, input3, cVar.f2149d);
        }
        Input input4 = this.f326166j;
        if (input4 != null) {
            g(this, input4, cVar.f2150e);
        }
        Input input5 = this.f326167k;
        if (input5 != null) {
            g(this, input5, cVar.f2151f);
        }
        Input input6 = this.f326163g;
        boolean z12 = cVar.f2153h;
        if (input6 != null) {
            input6.setEnabled(!z12);
        }
        Input input7 = this.f326164h;
        if (input7 != null) {
            input7.setEnabled(!z12);
        }
        Input input8 = this.f326165i;
        if (input8 != null) {
            input8.setEnabled(!z12);
        }
        Input input9 = this.f326166j;
        if (input9 != null) {
            input9.setEnabled(!z12);
        }
        Input input10 = this.f326167k;
        if (input10 == null) {
            return;
        }
        input10.setEnabled(!z12);
    }

    public final void d(Input input, Y41.a aVar) {
        C43175k.K(new C43197r1(new com.avito.android.virtual_deal_room.client_edit.d(aVar, null), C23069w.a(y.a(n.a(input, 6)), this.f326158b, Lifecycle.State.f46682e)), this.f326159c);
    }

    public final void e(PrintableText printableText, @D int i12) {
        Context context;
        View view = this.f326161e;
        String strK0 = null;
        if (view != null && (context = view.getContext()) != null && printableText != null) {
            strK0 = printableText.k0(context);
        }
        if (strK0 != null) {
            View view2 = this.f326161e;
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
        View view3 = this.f326161e;
        if (view3 != null) {
            View viewFindViewById2 = view3.findViewById(i12);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
            }
            ((ComponentContainer) viewFindViewById2).k();
        }
    }
}
