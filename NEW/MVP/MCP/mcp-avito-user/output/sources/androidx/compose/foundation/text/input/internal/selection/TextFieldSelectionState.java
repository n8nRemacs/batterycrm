package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.foundation.interaction.o;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.W1;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.selection.C20998b0;
import androidx.compose.foundation.text.selection.InterfaceC21023l0;
import androidx.compose.foundation.text.selection.InterfaceC21028o;
import androidx.compose.foundation.text.selection.InterfaceC21049z;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.text.v0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;
import l0.g;
import p0.InterfaceC44967a;

/* compiled from: TextFieldSelectionState.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "InputType", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionState {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f31260a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31261b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31262c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31263d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31264e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public InterfaceC44967a f31265f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Z f31266g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public M0 f31267h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f31268i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<? extends androidx.compose.foundation.content.internal.c> f31269j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public InterfaceC21023l0 f31270k;

    /* renamed from: l, reason: collision with root package name */
    public int f31271l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public o.b f31272m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputType {

        /* renamed from: b, reason: collision with root package name */
        public static final InputType f31273b;

        /* renamed from: c, reason: collision with root package name */
        public static final InputType f31274c;

        /* renamed from: d, reason: collision with root package name */
        public static final InputType f31275d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ InputType[] f31276e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f31277f;

        static {
            InputType inputType = new InputType("None", 0);
            f31273b = inputType;
            InputType inputType2 = new InputType("Touch", 1);
            f31274c = inputType2;
            InputType inputType3 = new InputType("Mouse", 2);
            f31275d = inputType3;
            InputType[] inputTypeArr = {inputType, inputType2, inputType3};
            f31276e = inputTypeArr;
            f31277f = kotlin.enums.c.a(inputTypeArr);
        }

        public InputType() {
            throw null;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) f31276e.clone();
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$a;", "Landroidx/compose/foundation/text/selection/o;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements InterfaceC21028o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f31278a;

        /* renamed from: b, reason: collision with root package name */
        public int f31279b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f31280c;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$a$a, reason: collision with other inner class name */
        public static final class C1619a extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f31282l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1619a(long j12) {
                super(0);
                this.f31282l = j12;
            }

            @Override // Y41.a
            public final String invoke() {
                return "Mouse.onDrag " + ((Object) l0.g.l(this.f31282l));
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ int f31283l = 0;

            static {
                new b();
            }

            public b() {
                super(0);
            }

            @Override // Y41.a
            public final /* bridge */ /* synthetic */ String invoke() {
                return "Mouse.onDragDone";
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ int f31284l = 0;

            static {
                new c();
            }

            public c() {
                super(0);
            }

            @Override // Y41.a
            public final /* bridge */ /* synthetic */ String invoke() {
                return "Mouse.onStart";
            }
        }

        public a(@Y61.k Y41.a<G0> aVar) {
            this.f31278a = aVar;
            l0.g.f413384b.getClass();
            this.f31280c = l0.g.f413386d;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
        public final boolean a(long j12, @Y61.k InterfaceC21049z interfaceC21049z) {
            if (TextFieldSelectionState.this.f31261b) {
                throw null;
            }
            return false;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
        public final void b() {
            int i12 = b.f31283l;
            InputType inputType = InputType.f31273b;
            TextFieldSelectionState.this.getClass();
            throw null;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
        public final boolean c(long j12, @Y61.k InterfaceC21049z interfaceC21049z) {
            if (TextFieldSelectionState.this.f31261b) {
                throw null;
            }
            return false;
        }

        public final long d(long j12, InterfaceC21049z interfaceC21049z, boolean z12) {
            int i12 = this.f31279b;
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 < 0) {
                numValueOf = null;
            }
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            if (numValueOf != null) {
                textFieldSelectionState.getClass();
                throw null;
            }
            textFieldSelectionState.getClass();
            throw null;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IndexTransformationType indexTransformationType = IndexTransformationType.f30841b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IndexTransformationType indexTransformationType2 = IndexTransformationType.f30841b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IndexTransformationType indexTransformationType3 = IndexTransformationType.f30841b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super N0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f31294q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f31296s;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {372}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31297q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f31298r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f31299s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f31298r = textFieldSelectionState;
                this.f31299s = k12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f31298r, this.f31299s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31297q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f31297q = 1;
                    if (this.f31298r.j(this.f31299s, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31300q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f31301r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f31302s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f31301r = textFieldSelectionState;
                this.f31302s = k12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f31301r, this.f31302s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31300q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f31300q = 1;
                    if (TextFieldSelectionState.a(this.f31301r, this.f31302s, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31303q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f31304r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f31305s;

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a extends kotlin.jvm.internal.N implements Y41.l<l0.g, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f31306l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(TextFieldSelectionState textFieldSelectionState) {
                    super(1);
                    this.f31306l = textFieldSelectionState;
                }

                @Override // Y41.l
                public final G0 invoke(l0.g gVar) {
                    long j12 = gVar.f413387a;
                    TextFieldSelectionState textFieldSelectionState = this.f31306l;
                    TextToolbarState textToolbarStateP = textFieldSelectionState.p();
                    TextToolbarState textToolbarState = TextToolbarState.f31345c;
                    if (textToolbarStateP == textToolbarState) {
                        textToolbarState = TextToolbarState.f31344b;
                    }
                    textFieldSelectionState.v(textToolbarState);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Continuation continuation) {
                super(2, continuation);
                this.f31304r = k12;
                this.f31305s = textFieldSelectionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f31305s, this.f31304r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31303q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    a aVar = new a(this.f31305s);
                    this.f31303q = 1;
                    if (C20445d2.g(this.f31304r, null, null, aVar, this, 7) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.input.pointer.K k12, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f31296s = k12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            d dVar = TextFieldSelectionState.this.new d(this.f31296s, continuation);
            dVar.f31294q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super N0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f31294q;
            CoroutineStart coroutineStart = CoroutineStart.f410683e;
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            androidx.compose.ui.input.pointer.K k12 = this.f31296s;
            C43259k.d(t12, null, coroutineStart, new a(textFieldSelectionState, k12, null), 1);
            C43259k.d(t12, null, coroutineStart, new b(textFieldSelectionState, k12, null), 1);
            return C43259k.d(t12, null, coroutineStart, new c(textFieldSelectionState, k12, null), 1);
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "offset", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {489}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31307q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC20509u1 f31308r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ long f31309s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f31310t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f31311u;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", i = {}, l = {502, 510}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31312q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f31313r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC20509u1 f31314s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f31315t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f31316u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.foundation.interaction.m f31317v;

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", i = {1}, l = {494, 499}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
            /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$e$a$a, reason: collision with other inner class name */
            public static final class C1621a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public Object f31318q;

                /* renamed from: r, reason: collision with root package name */
                public int f31319r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f31320s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ long f31321t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.foundation.interaction.m f31322u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1621a(TextFieldSelectionState textFieldSelectionState, long j12, androidx.compose.foundation.interaction.m mVar, Continuation<? super C1621a> continuation) {
                    super(2, continuation);
                    this.f31320s = textFieldSelectionState;
                    this.f31321t = j12;
                    this.f31322u = mVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                    return new C1621a(this.f31320s, this.f31321t, this.f31322u, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                    return ((C1621a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r8.f31319r
                        r2 = 0
                        androidx.compose.foundation.interaction.m r3 = r8.f31322u
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = r8.f31320s
                        r5 = 2
                        r6 = 1
                        if (r1 == 0) goto L2b
                        if (r1 == r6) goto L23
                        if (r1 != r5) goto L1b
                        java.lang.Object r0 = r8.f31318q
                        androidx.compose.foundation.interaction.o$b r0 = (androidx.compose.foundation.interaction.o.b) r0
                        kotlin.C42729a0.b(r9)
                        goto L58
                    L1b:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L23:
                        java.lang.Object r1 = r8.f31318q
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
                        kotlin.C42729a0.b(r9)
                        goto L43
                    L2b:
                        kotlin.C42729a0.b(r9)
                        androidx.compose.foundation.interaction.o$b r9 = r4.f31272m
                        if (r9 == 0) goto L45
                        androidx.compose.foundation.interaction.o$a r1 = new androidx.compose.foundation.interaction.o$a
                        r1.<init>(r9)
                        r8.f31318q = r4
                        r8.f31319r = r6
                        java.lang.Object r9 = r3.b(r1, r8)
                        if (r9 != r0) goto L42
                        return r0
                    L42:
                        r1 = r4
                    L43:
                        r1.f31272m = r2
                    L45:
                        androidx.compose.foundation.interaction.o$b r9 = new androidx.compose.foundation.interaction.o$b
                        long r6 = r8.f31321t
                        r9.<init>(r6, r2)
                        r8.f31318q = r9
                        r8.f31319r = r5
                        java.lang.Object r1 = r3.b(r9, r8)
                        if (r1 != r0) goto L57
                        return r0
                    L57:
                        r0 = r9
                    L58:
                        r4.f31272m = r0
                        kotlin.G0 r9 = kotlin.G0.f406611a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.e.a.C1621a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC20509u1 interfaceC20509u1, TextFieldSelectionState textFieldSelectionState, long j12, androidx.compose.foundation.interaction.m mVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f31314s = interfaceC20509u1;
                this.f31315t = textFieldSelectionState;
                this.f31316u = j12;
                this.f31317v = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f31314s, this.f31315t, this.f31316u, this.f31317v, continuation);
                aVar.f31313r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31312q;
                TextFieldSelectionState textFieldSelectionState = this.f31315t;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C43259k.d((kotlinx.coroutines.T) this.f31313r, null, null, new C1621a(this.f31315t, this.f31316u, this.f31317v, null), 3);
                    this.f31312q = 1;
                    obj = this.f31314s.p0(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        textFieldSelectionState.f31272m = null;
                        return G0.f406611a;
                    }
                    C42729a0.b(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                o.b bVar = textFieldSelectionState.f31272m;
                if (bVar != null) {
                    androidx.compose.foundation.interaction.j cVar = zBooleanValue ? new o.c(bVar) : new o.a(bVar);
                    this.f31312q = 2;
                    if (this.f31317v.b(cVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                textFieldSelectionState.f31272m = null;
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.compose.foundation.interaction.m mVar, TextFieldSelectionState textFieldSelectionState, Continuation<? super e> continuation) {
            super(3, continuation);
            this.f31310t = mVar;
            this.f31311u = textFieldSelectionState;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super G0> continuation) {
            long j12 = gVar.f413387a;
            e eVar = new e(this.f31310t, this.f31311u, continuation);
            eVar.f31308r = interfaceC20509u1;
            eVar.f31309s = j12;
            return eVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31307q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC20509u1 interfaceC20509u1 = this.f31308r;
                long j12 = this.f31309s;
                androidx.compose.foundation.interaction.m mVar = this.f31310t;
                if (mVar != null) {
                    a aVar = new a(interfaceC20509u1, this.f31311u, j12, mVar, null);
                    this.f31307q = 1;
                    if (kotlinx.coroutines.U.c(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "offset", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<l0.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f31323l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f31324m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f31325n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a<G0> aVar, TextFieldSelectionState textFieldSelectionState, Y41.a<G0> aVar2) {
            super(1);
            this.f31323l = aVar;
            this.f31324m = textFieldSelectionState;
            this.f31325n = aVar2;
        }

        @Override // Y41.l
        public final G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            int i12 = D.f31223l;
            this.f31323l.invoke();
            TextFieldSelectionState textFieldSelectionState = this.f31324m;
            if (!textFieldSelectionState.f31261b || !textFieldSelectionState.f31263d) {
                return G0.f406611a;
            }
            if (textFieldSelectionState.f31262c) {
                textFieldSelectionState.v(TextToolbarState.f31344b);
                throw null;
            }
            this.f31325n.invoke();
            throw null;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super N0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f31326q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f31328s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f31329t;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31330q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f31331r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f31332s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f31331r = textFieldSelectionState;
                this.f31332s = k12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f31331r, this.f31332s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31330q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f31330q = 1;
                    if (this.f31331r.j(this.f31332s, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31333q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f31334r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f31335s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ boolean f31336t;

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "<anonymous>", "(Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
            public static final class a implements InterfaceC20921f {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f31337a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f31338b;

                public a(TextFieldSelectionState textFieldSelectionState, boolean z12) {
                    this.f31337a = textFieldSelectionState;
                    this.f31338b = z12;
                }
            }

            /* compiled from: TextFieldSelectionState.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$g$b$b, reason: collision with other inner class name */
            public static final class C1622b extends kotlin.jvm.internal.N implements Y41.a<G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f31339l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1622b(TextFieldSelectionState textFieldSelectionState) {
                    super(0);
                    this.f31339l = textFieldSelectionState;
                }

                @Override // Y41.a
                public final G0 invoke() {
                    this.f31339l.c();
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Continuation continuation, boolean z12) {
                super(2, continuation);
                this.f31334r = k12;
                this.f31335s = textFieldSelectionState;
                this.f31336t = z12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                boolean z12 = this.f31336t;
                return new b(this.f31335s, this.f31334r, continuation, z12);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31333q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    TextFieldSelectionState textFieldSelectionState = this.f31335s;
                    a aVar = new a(textFieldSelectionState, this.f31336t);
                    C1622b c1622b = new C1622b(textFieldSelectionState);
                    this.f31333q = 1;
                    Object objC = C20444d1.c(this.f31334r, new C20919d(aVar, c1622b, null), this);
                    if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objC = G0.f406611a;
                    }
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$3", f = "TextFieldSelectionState.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31340q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionState f31341r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f31342s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ boolean f31343t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Continuation continuation, boolean z12) {
                super(2, continuation);
                this.f31341r = textFieldSelectionState;
                this.f31342s = k12;
                this.f31343t = z12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new c(this.f31341r, this.f31342s, continuation, this.f31343t);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f31340q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f31340q = 1;
                    if (TextFieldSelectionState.b(this.f31341r, this.f31342s, this.f31343t, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.compose.ui.input.pointer.K k12, Continuation continuation, boolean z12) {
            super(2, continuation);
            this.f31328s = k12;
            this.f31329t = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            g gVar = TextFieldSelectionState.this.new g(this.f31328s, continuation, this.f31329t);
            gVar.f31326q = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super N0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f31326q;
            CoroutineStart coroutineStart = CoroutineStart.f410683e;
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            androidx.compose.ui.input.pointer.K k12 = this.f31328s;
            C43259k.d(t12, null, coroutineStart, new a(textFieldSelectionState, k12, null), 1);
            boolean z12 = this.f31329t;
            C43259k.d(t12, null, coroutineStart, new b(textFieldSelectionState, k12, null, z12), 1);
            return C43259k.d(t12, null, coroutineStart, new c(textFieldSelectionState, k12, null, z12), 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r10, androidx.compose.ui.input.pointer.K r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof androidx.compose.foundation.text.input.internal.selection.C20933s
            if (r0 == 0) goto L17
            r0 = r12
            androidx.compose.foundation.text.input.internal.selection.s r0 = (androidx.compose.foundation.text.input.internal.selection.C20933s) r0
            int r1 = r0.f31422v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f31422v = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            androidx.compose.foundation.text.input.internal.selection.s r0 = new androidx.compose.foundation.text.input.internal.selection.s
            r0.<init>(r10, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.f31420t
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f31422v
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            kotlin.jvm.internal.l0$g r10 = r6.f31419s
            kotlin.jvm.internal.l0$g r11 = r6.f31418r
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r6.f31417q
            kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L34
            goto L81
        L34:
            r12 = move-exception
            goto L8d
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            kotlin.C42729a0.b(r12)
            kotlin.jvm.internal.l0$g r12 = new kotlin.jvm.internal.l0$g
            r12.<init>()
            l0.g$a r1 = l0.g.f413384b
            r1.getClass()
            long r3 = l0.g.f413386d
            r12.f406841b = r3
            kotlin.jvm.internal.l0$g r7 = new kotlin.jvm.internal.l0$g
            r7.<init>()
            r7.f406841b = r3
            androidx.compose.foundation.text.input.internal.selection.t r3 = new androidx.compose.foundation.text.input.internal.selection.t     // Catch: java.lang.Throwable -> L87
            r3.<init>(r10, r12, r7)     // Catch: java.lang.Throwable -> L87
            androidx.compose.foundation.text.input.internal.selection.u r4 = new androidx.compose.foundation.text.input.internal.selection.u     // Catch: java.lang.Throwable -> L87
            r4.<init>(r10, r12, r7)     // Catch: java.lang.Throwable -> L87
            androidx.compose.foundation.text.input.internal.selection.v r5 = new androidx.compose.foundation.text.input.internal.selection.v     // Catch: java.lang.Throwable -> L87
            r5.<init>(r10, r12, r7)     // Catch: java.lang.Throwable -> L87
            androidx.compose.foundation.text.input.internal.selection.w r8 = new androidx.compose.foundation.text.input.internal.selection.w     // Catch: java.lang.Throwable -> L87
            r8.<init>(r10, r7, r12)     // Catch: java.lang.Throwable -> L87
            r6.f31417q = r10     // Catch: java.lang.Throwable -> L87
            r6.f31418r = r12     // Catch: java.lang.Throwable -> L87
            r6.f31419s = r7     // Catch: java.lang.Throwable -> L87
            r6.f31422v = r2     // Catch: java.lang.Throwable -> L87
            r1 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r11 = androidx.compose.foundation.gestures.C20495q0.g(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L87
            if (r11 != r0) goto L7e
            goto L86
        L7e:
            r0 = r10
            r11 = r12
            r10 = r7
        L81:
            g(r0, r11, r10)
            kotlin.G0 r0 = kotlin.G0.f406611a
        L86:
            return r0
        L87:
            r11 = move-exception
            r0 = r10
            r10 = r7
            r9 = r12
            r12 = r11
            r11 = r9
        L8d:
            g(r0, r11, r10)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.input.pointer.K, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r17, androidx.compose.ui.input.pointer.K r18, boolean r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.input.pointer.K, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void g(TextFieldSelectionState textFieldSelectionState, l0.g gVar, l0.g gVar2) {
        if ((gVar.f406841b & 9223372034707292159L) != 9205357640488583168L) {
            g.a aVar = l0.g.f413384b;
            aVar.getClass();
            long j12 = l0.g.f413386d;
            gVar.f406841b = j12;
            aVar.getClass();
            gVar2.f406841b = j12;
            textFieldSelectionState.c();
        }
    }

    public static final void h(TextFieldSelectionState textFieldSelectionState, l0.g gVar, l0.g gVar2) {
        if ((gVar.f406841b & 9223372034707292159L) != 9205357640488583168L) {
            textFieldSelectionState.c();
            g.a aVar = l0.g.f413384b;
            aVar.getClass();
            gVar.f406841b = l0.g.f413386d;
            aVar.getClass();
            gVar2.f406841b = 0L;
            textFieldSelectionState.f31271l = -1;
        }
    }

    public final void c() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r4, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof androidx.compose.foundation.text.input.internal.selection.C20932q
            if (r4 == 0) goto L13
            r4 = r5
            androidx.compose.foundation.text.input.internal.selection.q r4 = (androidx.compose.foundation.text.input.internal.selection.C20932q) r4
            int r0 = r4.f31412u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f31412u = r0
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.q r4 = new androidx.compose.foundation.text.input.internal.selection.q
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.f31410s
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.f31412u
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L35
            boolean r0 = r4.f31409r
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = r4.f31408q
            kotlin.C42729a0.b(r5)
            if (r0 != 0) goto L30
            kotlin.G0 r4 = kotlin.G0.f406611a
            return r4
        L30:
            r4.getClass()
            r4 = 0
            throw r4
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.C42729a0.b(r5)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.d(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object e(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Continuation<? super G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new d(k12, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.text.input.internal.selection.r
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.input.internal.selection.r r0 = (androidx.compose.foundation.text.input.internal.selection.r) r0
            int r1 = r0.f31416t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31416t = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.r r0 = new androidx.compose.foundation.text.input.internal.selection.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f31414r
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f31416t
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r0.f31413q
            kotlin.C42729a0.b(r5)
            r0.getClass()
            r5 = 0
            throw r5
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            kotlin.C42729a0.b(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object i(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Continuation<? super G0> continuation) {
        Object objE = C20445d2.e(k12, new e(mVar, this, null), new f(aVar, this, aVar2), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : G0.f406611a;
    }

    @Y61.l
    public final Object j(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k SuspendLambda suspendLambda) {
        Object objN0 = k12.N0(new E(this, null), suspendLambda);
        return objN0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN0 : G0.f406611a;
    }

    @Y61.k
    public final C20922g k(boolean z12) {
        throw null;
    }

    @Y61.k
    public final l0.j l() {
        throw null;
    }

    @Y61.l
    public final Handle m() {
        throw null;
    }

    public final long n() {
        throw null;
    }

    @Y61.k
    public final C20922g o(boolean z12, boolean z13) {
        if (z12) {
            Handle handle = Handle.f30329c;
        } else {
            Handle handle2 = Handle.f30330d;
        }
        throw null;
    }

    public final TextToolbarState p() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.text.input.internal.selection.K
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.text.input.internal.selection.K r0 = (androidx.compose.foundation.text.input.internal.selection.K) r0
            int r1 = r0.f31236u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31236u = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.K r0 = new androidx.compose.foundation.text.input.internal.selection.K
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f31234s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31236u
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            kotlin.C42729a0.b(r14)
            goto La1
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L39:
            androidx.compose.foundation.content.internal.c r2 = r0.f31233r
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r0.f31232q
            kotlin.C42729a0.b(r14)
            goto L68
        L41:
            kotlin.C42729a0.b(r14)
            goto Lad
        L45:
            kotlin.C42729a0.b(r14)
            Y41.a<? extends androidx.compose.foundation.content.internal.c> r14 = r13.f31269j
            if (r14 == 0) goto La4
            java.lang.Object r14 = r14.invoke()
            r2 = r14
            androidx.compose.foundation.content.internal.c r2 = (androidx.compose.foundation.content.internal.c) r2
            if (r2 != 0) goto L56
            goto La4
        L56:
            androidx.compose.ui.platform.M0 r14 = r13.f31267h
            if (r14 == 0) goto L93
            r0.f31232q = r13
            r0.f31233r = r2
            r0.f31236u = r5
            androidx.compose.ui.platform.K0 r14 = r14.a()
            if (r14 != r1) goto L67
            return r1
        L67:
            r5 = r13
        L68:
            r7 = r14
            androidx.compose.ui.platform.K0 r7 = (androidx.compose.ui.platform.K0) r7
            if (r7 != 0) goto L6e
            goto L94
        L6e:
            android.content.ClipData r14 = r7.f41152a
            r14.getDescription()
            androidx.compose.ui.platform.L0 r8 = new androidx.compose.ui.platform.L0
            r8.<init>()
            androidx.compose.foundation.content.d r14 = r2.a()
            androidx.compose.foundation.content.g$a$a r0 = androidx.compose.foundation.content.g.a.f26980b
            r0.getClass()
            int r9 = androidx.compose.foundation.content.g.a.f26982d
            androidx.compose.foundation.content.g r0 = new androidx.compose.foundation.content.g
            r12 = 0
            r10 = 0
            r11 = 8
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            androidx.compose.foundation.content.internal.b$a r14 = (androidx.compose.foundation.content.internal.b.a) r14
            r14.c(r0)
            throw r3
        L93:
            r5 = r13
        L94:
            r0.f31232q = r3
            r0.f31233r = r3
            r0.f31236u = r4
            java.lang.Object r14 = r5.r(r0)
            if (r14 != r1) goto La1
            return r1
        La1:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        La4:
            r0.f31236u = r6
            java.lang.Object r14 = r13.r(r0)
            if (r14 != r1) goto Lad
            return r1
        Lad:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.q(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = 0
            boolean r1 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.L
            if (r1 == 0) goto L14
            r1 = r6
            androidx.compose.foundation.text.input.internal.selection.L r1 = (androidx.compose.foundation.text.input.internal.selection.L) r1
            int r2 = r1.f31240t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f31240t = r2
            goto L19
        L14:
            androidx.compose.foundation.text.input.internal.selection.L r1 = new androidx.compose.foundation.text.input.internal.selection.L
            r1.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r1.f31238r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f31240t
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2c
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = r1.f31237q
            kotlin.C42729a0.b(r6)
            goto L47
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            androidx.compose.ui.platform.M0 r6 = r5.f31267h
            if (r6 == 0) goto L72
            r1.f31237q = r5
            r1.f31240t = r4
            androidx.compose.ui.platform.K0 r6 = r6.a()
            if (r6 != r2) goto L46
            return r2
        L46:
            r1 = r5
        L47:
            androidx.compose.ui.platform.K0 r6 = (androidx.compose.ui.platform.K0) r6
            if (r6 == 0) goto L72
            int r2 = androidx.compose.foundation.internal.a.f28156a
            android.content.ClipData r6 = r6.f41152a
            r2 = 0
            android.content.ClipData$Item r6 = r6.getItemAt(r2)
            if (r6 == 0) goto L61
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L61
            java.lang.String r6 = r6.toString()
            goto L62
        L61:
            r6 = r0
        L62:
            if (r6 != 0) goto L65
            goto L72
        L65:
            r1.getClass()
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r1 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.f31477b
            r1 = 10
            androidx.compose.foundation.text.input.internal.t1.i(r0, r6, r2, r1)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L72:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.r(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void s() {
        throw null;
    }

    @Y61.l
    public final Object t(@Y61.k androidx.compose.ui.input.pointer.K k12, boolean z12, @Y61.k Continuation<? super G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new g(k12, null, z12), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    public final void u(boolean z12) {
        throw null;
    }

    public final void v(TextToolbarState textToolbarState) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.M
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.M r0 = (androidx.compose.foundation.text.input.internal.selection.M) r0
            int r1 = r0.f31244t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31244t = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.M r0 = new androidx.compose.foundation.text.input.internal.selection.M
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f31242r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31244t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r0.f31241q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L2c:
            r6 = move-exception
            goto L62
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.C42729a0.b(r6)
            androidx.compose.foundation.text.input.internal.selection.N r6 = new androidx.compose.foundation.text.input.internal.selection.N     // Catch: java.lang.Throwable -> L60
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L60
            r0.f31241q = r5     // Catch: java.lang.Throwable -> L60
            r0.f31244t = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = kotlinx.coroutines.U.c(r6, r0)     // Catch: java.lang.Throwable -> L60
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            r0.u(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r0.p()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.f31344b
            if (r6 == r1) goto L5d
            androidx.compose.foundation.text.input.internal.selection.Z r6 = r0.f31266g
            if (r6 == 0) goto L5d
            r6.a()
        L5d:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L60:
            r6 = move-exception
            r0 = r5
        L62:
            r0.u(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.p()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.f31344b
            if (r1 == r2) goto L74
            androidx.compose.foundation.text.input.internal.selection.Z r0 = r0.f31266g
            if (r0 == 0) goto L74
            r0.a()
        L74:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.w(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object x(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Y41.a<G0> aVar, @Y61.k Continuation<? super G0> continuation) {
        Object objJ = C20998b0.j(k12, new a(aVar), new b(aVar), continuation);
        return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : G0.f406611a;
    }

    public final void y(@Y61.k Handle handle, long j12) {
        throw null;
    }

    public final long z(androidx.compose.foundation.text.input.l lVar, int i12, int i13, boolean z12, InterfaceC21049z interfaceC21049z, boolean z13, boolean z14) {
        v0 v0VarA = v0.a(lVar.f31512d);
        if (!z14 && !z13) {
            v0.d(v0VarA.f42736a);
        }
        throw null;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$b;", "Landroidx/compose/foundation/text/W1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b implements W1 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f31285a;

        /* renamed from: b, reason: collision with root package name */
        public int f31286b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f31287c;

        /* renamed from: d, reason: collision with root package name */
        public long f31288d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public Handle f31289e;

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f31291l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j12) {
                super(0);
                this.f31291l = j12;
            }

            @Override // Y41.a
            public final String invoke() {
                return "Touch.onDrag at " + ((Object) l0.g.l(this.f31291l));
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$b$b, reason: collision with other inner class name */
        public static final class C1620b extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ int f31292l = 0;

            static {
                new C1620b();
            }

            public C1620b() {
                super(0);
            }

            @Override // Y41.a
            public final /* bridge */ /* synthetic */ String invoke() {
                return "Touch.onDragStop";
            }
        }

        /* compiled from: TextFieldSelectionState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f31293l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(long j12) {
                super(0);
                this.f31293l = j12;
            }

            @Override // Y41.a
            public final String invoke() {
                return "Touch.onDragStart after longPress at " + ((Object) l0.g.l(this.f31293l));
            }
        }

        public b(@Y61.k Y41.a<G0> aVar) {
            this.f31285a = aVar;
            l0.g.f413384b.getClass();
            this.f31287c = l0.g.f413386d;
            this.f31288d = 0L;
            this.f31289e = Handle.f30330d;
        }

        @Override // androidx.compose.foundation.text.W1
        public final void a(long j12) {
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            if (textFieldSelectionState.f31261b) {
                new c(j12);
                textFieldSelectionState.y(this.f31289e, j12);
                textFieldSelectionState.u(false);
                InputType inputType = InputType.f31274c;
                throw null;
            }
        }

        @Override // androidx.compose.foundation.text.W1
        public final void d(long j12) {
            if (TextFieldSelectionState.this.f31261b) {
                throw null;
            }
        }

        public final void e() {
            if ((this.f31287c & 9223372034707292159L) == 9205357640488583168L) {
                return;
            }
            int i12 = C1620b.f31292l;
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            textFieldSelectionState.c();
            this.f31286b = -1;
            l0.g.f413384b.getClass();
            this.f31287c = l0.g.f413386d;
            this.f31288d = 0L;
            textFieldSelectionState.f31271l = -1;
            InputType inputType = InputType.f31273b;
            throw null;
        }

        @Override // androidx.compose.foundation.text.W1
        public final void onCancel() {
            e();
        }

        @Override // androidx.compose.foundation.text.W1
        public final void onStop() {
            e();
        }

        @Override // androidx.compose.foundation.text.W1
        public final void b() {
        }

        @Override // androidx.compose.foundation.text.W1
        public final void c() {
        }
    }
}
