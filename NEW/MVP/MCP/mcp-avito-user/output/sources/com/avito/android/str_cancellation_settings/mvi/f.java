package com.avito.android.str_cancellation_settings.mvi;

import Ny0.InterfaceC14629a;
import Ny0.InterfaceC14630b;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.str_cancellation_settings.analytics.FromPageLabel;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCancellationSettingsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.b<StrCancellationSettingsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_cancellation_settings.domain.d f288493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_cancellation_settings.domain.a f288494b;

    /* renamed from: c, reason: collision with root package name */
    public final long f288495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f288496d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f288497e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f288498f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288499g;

    /* compiled from: StrCancellationSettingsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_cancellation_settings.mvi.StrCancellationSettingsBootstrap$produce$1", f = "StrCancellationSettingsBootstrap.kt", i = {0}, l = {38, 46}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrCancellationSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f288500q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f288501r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f288501r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrCancellationSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f288500q;
            f fVar = f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f288501r;
                if (fVar.f288499g) {
                    return G0.f406611a;
                }
                String strValueOf = String.valueOf(fVar.f288495c);
                FromPageLabel.f288145c.getClass();
                String str = fVar.f288498f;
                fVar.f288494b.c(strValueOf, FromPageLabel.a.a(str));
                String str2 = fVar.f288496d;
                Date date = str2 != null ? new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Locale("ru", "RU")).parse(str2) : null;
                String str3 = fVar.f288497e;
                StrCancellationSettingsInternalAction.Init init = new StrCancellationSettingsInternalAction.Init(fVar.f288495c, date, str3 != null ? new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Locale("ru", "RU")).parse(str3) : null, FromPageLabel.a.a(str));
                this.f288501r = interfaceC43172j;
                this.f288500q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    fVar.f288499g = true;
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f288501r;
                C42729a0.b(obj);
            }
            com.avito.android.str_cancellation_settings.domain.k kVarB = fVar.f288493a.b(fVar.f288495c, fVar.f288496d, fVar.f288497e);
            this.f288501r = null;
            this.f288500q = 2;
            if (C43175k.u(this, kVarB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            fVar.f288499g = true;
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.str_cancellation_settings.domain.d dVar, @Y61.k com.avito.android.str_cancellation_settings.domain.a aVar, @Ny0.c long j12, @Ny0.d @Y61.l String str, @Y61.l @InterfaceC14629a String str2, @InterfaceC14630b @Y61.l String str3) {
        this.f288493a = dVar;
        this.f288494b = aVar;
        this.f288495c = j12;
        this.f288496d = str;
        this.f288497e = str2;
        this.f288498f = str3;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrCancellationSettingsInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
