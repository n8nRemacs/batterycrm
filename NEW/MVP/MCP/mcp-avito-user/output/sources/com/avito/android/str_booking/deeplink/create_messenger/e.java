package com.avito.android.str_booking.deeplink.create_messenger;

import Y41.q;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplink;
import com.avito.android.util.InterfaceC35741a1;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCreateMessengerDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "", "throwable", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.deeplink.create_messenger.StrCreateMessengerDeeplinkHandler$doHandleSuspend$6", f = "StrCreateMessengerDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements q<InterfaceC43172j<? super G0>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f285421q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f285422r;

    /* compiled from: StrCreateMessengerDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/printable_text/PrintableText;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Throwable, PrintableText> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f285423l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final PrintableText invoke(Throwable th2) {
            return com.avito.android.printable_text.b.c(R.string.str_booking_error_toast_message, new Serializable[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation<? super e> continuation) {
        super(3, continuation);
        this.f285422r = fVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        e eVar = new e(this.f285422r, continuation);
        eVar.f285421q = th2;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f285421q;
        f fVar = this.f285422r;
        PrintableText printableTextA = InterfaceC35741a1.a.a(fVar.f285427j, th2, null, a.f285423l, 2);
        f.c.f125255c.getClass();
        a.i.C4057a.d(fVar.f285426i, printableTextA, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, null, 1966);
        fVar.j(StrCreateMessengerDeeplink.b.a.f285401b);
        fVar.f285425h.g(null, false);
        return G0.f406611a;
    }
}
