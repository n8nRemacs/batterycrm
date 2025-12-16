package com.avito.android.language_selector.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import jJ.InterfaceC42262b;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import ur.InterfaceC49101b;

/* compiled from: LanguageSetUpUseCase.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/language_selector/domain/e;", "Lcom/avito/android/language_selector/domain/d;", "a", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42262b f174909a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49101b f174910b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f174911c;

    /* compiled from: LanguageSetUpUseCase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/language_selector/domain/e$a;", "", "<init>", "()V", "", "DEFAULT_LOCALE_LANGUAGE_TAG", "Ljava/lang/String;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LanguageSetUpUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.language_selector.domain.LanguageSetUpUseCaseImpl$execute$1", f = "LanguageSetUpUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return e.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            e eVar = e.this;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            try {
                if (eVar.f174909a.getF405542d().c()) {
                    eVar.f174909a.b(Locale.forLanguageTag("uz"));
                }
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "Language setup exception ", e12);
                eVar.f174909a.b(Locale.forLanguageTag("uz"));
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k InterfaceC42262b interfaceC42262b, @k InterfaceC49101b interfaceC49101b, @k R0 r02) {
        this.f174909a = interfaceC42262b;
        this.f174910b = interfaceC49101b;
        this.f174911c = U.a(r02.b());
    }

    @Override // com.avito.android.language_selector.domain.d
    public final void execute() {
        if (this.f174910b.c()) {
            C43259k.d(this.f174911c, null, null, new b(null), 3);
        }
    }
}
