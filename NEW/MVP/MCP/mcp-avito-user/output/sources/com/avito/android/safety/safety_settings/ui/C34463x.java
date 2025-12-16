package com.avito.android.safety.safety_settings.ui;

import android.content.Context;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vo0.InterfaceC49362a;

/* compiled from: SafetySettingsScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.ui.SafetySettingsScreenKt$SafetySettingsScreen$1$2$1", f = "SafetySettingsScreen.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.safety.safety_settings.ui.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34463x extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257903q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC49362a> f257904r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f257905s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f257906t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f257907u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f257908v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f257909w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f257910x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f257911y;

    /* compiled from: SafetySettingsScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvo0/a;", "event", "Lkotlin/G0;", "emit", "(Lvo0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.safety.safety_settings.ui.x$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f257912b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f257913c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f257914d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f257915e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f257916f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f257917g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f257918h;

        /* compiled from: SafetySettingsScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.safety.safety_settings.ui.SafetySettingsScreenKt$SafetySettingsScreen$1$2$1$1", f = "SafetySettingsScreen.kt", i = {2}, l = {82, 91, 100}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: com.avito.android.safety.safety_settings.ui.x$a$a, reason: collision with other inner class name */
        public static final class C7739a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f257919q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f257920r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a<T> f257921s;

            /* renamed from: t, reason: collision with root package name */
            public int f257922t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C7739a(a<? super T> aVar, Continuation<? super C7739a> continuation) {
                super(continuation);
                this.f257921s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f257920r = obj;
                this.f257922t |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f257921s.emit(null, this);
            }
        }

        public a(Context context, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, com.akita.compose.component.toast_bar.J j13, String str, String str2, InterfaceC22204y1 interfaceC22204y1) {
            this.f257912b = context;
            this.f257913c = uVar;
            this.f257914d = j12;
            this.f257915e = j13;
            this.f257916f = str;
            this.f257917g = str2;
            this.f257918h = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k vo0.InterfaceC49362a r11, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.safety_settings.ui.C34463x.a.emit(vo0.a, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34463x(InterfaceC43160i interfaceC43160i, Context context, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, com.akita.compose.component.toast_bar.J j13, String str, String str2, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f257904r = interfaceC43160i;
        this.f257905s = context;
        this.f257906t = uVar;
        this.f257907u = j12;
        this.f257908v = j13;
        this.f257909w = str;
        this.f257910x = str2;
        this.f257911y = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f257911y;
        return new C34463x(this.f257904r, this.f257905s, this.f257906t, this.f257907u, this.f257908v, this.f257909w, this.f257910x, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C34463x) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257903q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22204y1 interfaceC22204y1 = this.f257911y;
            a aVar = new a(this.f257905s, this.f257906t, this.f257907u, this.f257908v, this.f257909w, this.f257910x, interfaceC22204y1);
            this.f257903q = 1;
            if (this.f257904r.collect(aVar, this) == coroutine_suspended) {
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
