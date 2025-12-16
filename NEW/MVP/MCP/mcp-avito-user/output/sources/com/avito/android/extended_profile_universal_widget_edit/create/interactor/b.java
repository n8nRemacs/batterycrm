package com.avito.android.extended_profile_universal_widget_edit.create.interactor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import Za0.InterfaceC19524a;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.extended_profile_universal_widget_edit.create.mvi.entity.UniversalWidgetCreateInternalAction;
import com.avito.android.extended_profile_universal_widget_edit.f;
import com.avito.android.extended_profile_universal_widget_edit.j;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.android.remote.model.extended.modification.UniversalWidgetSectionModification;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import h31.e;
import hB.InterfaceC40798a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UniversalWidgetCreateInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/interactor/b;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/interactor/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.extended_profile_universal_widget_edit.create.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC19524a> f153727a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f153728b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f153729c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalWidgetCreateArguments f153730d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final f f153731e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final j f153732f;

    /* compiled from: UniversalWidgetCreateInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153733a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f153734b;

        static {
            int[] iArr = new int[UniversalWidget.SectionSubtype.values().length];
            try {
                iArr[UniversalWidget.SectionSubtype.COMMON_FACTOID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.FULL_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.IMAGE_WITH_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.TWO_COLUMNS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.THREE_COLUMNS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.FOUR_COLUMNS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f153733a = iArr;
            int[] iArr2 = new int[UniversalWidget.SectionType.values().length];
            try {
                iArr2[UniversalWidget.SectionType.FACTOID.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UniversalWidget.SectionType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[UniversalWidget.SectionType.IMAGE_WITH_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f153734b = iArr2;
        }
    }

    /* compiled from: UniversalWidgetCreateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.create.interactor.UniversalWidgetCreateInteractorImpl$createSection$1", f = "UniversalWidgetCreateInteractor.kt", i = {0, 1, 1, 1, 1}, l = {47, 58, 70}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "defaultValue", "section", "valueId"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.avito.android.extended_profile_universal_widget_edit.create.interactor.b$b, reason: collision with other inner class name */
    public static final class C4485b extends SuspendLambda implements p<InterfaceC43172j<? super UniversalWidgetCreateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public UniversalWidgetSectionModification f153735q;

        /* renamed from: r, reason: collision with root package name */
        public UniversalWidgetSectionModel.Section f153736r;

        /* renamed from: s, reason: collision with root package name */
        public String f153737s;

        /* renamed from: t, reason: collision with root package name */
        public int f153738t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f153739u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UniversalWidget.OrderedSectionType f153741w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4485b(UniversalWidget.OrderedSectionType orderedSectionType, Continuation<? super C4485b> continuation) {
            super(2, continuation);
            this.f153741w = orderedSectionType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4485b c4485b = b.this.new C4485b(this.f153741w, continuation);
            c4485b.f153739u = obj;
            return c4485b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalWidgetCreateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4485b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 564
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.create.interactor.b.C4485b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UniversalWidgetCreateInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.create.interactor.UniversalWidgetCreateInteractorImpl$createSection$2", f = "UniversalWidgetCreateInteractor.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super UniversalWidgetCreateInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153742q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f153743r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f153744s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ UniversalWidget.OrderedSectionType f153745t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UniversalWidget.OrderedSectionType orderedSectionType, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f153745t = orderedSectionType;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UniversalWidgetCreateInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(this.f153745t, continuation);
            cVar.f153743r = interfaceC43172j;
            cVar.f153744s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153742q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f153743r;
                UniversalWidgetCreateInternalAction.Error error = new UniversalWidgetCreateInternalAction.Error(this.f153744s, new InterfaceC40798a.b(this.f153745t));
                this.f153743r = null;
                this.f153742q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
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

    @Inject
    public b(@k e<InterfaceC19524a> eVar, @k R0 r02, @k InterfaceC35863o4 interfaceC35863o4, @k UniversalWidgetCreateArguments universalWidgetCreateArguments, @k f fVar, @k j jVar) {
        this.f153727a = eVar;
        this.f153728b = r02;
        this.f153729c = interfaceC35863o4;
        this.f153730d = universalWidgetCreateArguments;
        this.f153731e = fVar;
        this.f153732f = jVar;
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.create.interactor.a
    @k
    public final InterfaceC43160i<UniversalWidgetCreateInternalAction> a(@k UniversalWidget.OrderedSectionType orderedSectionType) {
        return C43175k.I(this.f153728b.a(), new C43152f0(C43175k.G(new C4485b(orderedSectionType, null)), new c(orderedSectionType, null)));
    }
}
