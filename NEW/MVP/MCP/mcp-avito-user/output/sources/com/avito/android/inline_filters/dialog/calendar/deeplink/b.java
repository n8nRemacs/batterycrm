package com.avito.android.inline_filters.dialog.calendar.deeplink;

import EN.b;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.inline_filters.calendar.deeplink.FiltersCalendarPickerDeepLink;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Date;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rv.C47919b;

/* compiled from: FiltersCalendarPickerDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/inline_filters/calendar/deeplink/FiltersCalendarPickerDeepLink;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<FiltersCalendarPickerDeepLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final EN.a f171200g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f171201h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.f f171202i;

    /* compiled from: FiltersCalendarPickerDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.inline_filters.dialog.calendar.deeplink.FiltersCalendarPickerDeepLinkHandler", f = "FiltersCalendarPickerDeepLinkHandler.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public b f171203q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f171204r;

        /* renamed from: t, reason: collision with root package name */
        public int f171206t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f171204r = obj;
            this.f171206t |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.n(this);
        }
    }

    /* compiled from: FiltersCalendarPickerDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.dialog.calendar.deeplink.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C5070b extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            Object serializable;
            Object serializable2;
            EN.b aVar;
            b bVar = (b) this.receiver;
            bVar.getClass();
            Bundle bundle = c47919b.f437159b;
            if (bundle.getBoolean("dismissed")) {
                aVar = b.c.f3941a;
            } else {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 33) {
                    serializable = bundle.getSerializable("date_from", Date.class);
                } else {
                    Object serializable3 = bundle.getSerializable("date_from");
                    if (!(serializable3 instanceof Date)) {
                        serializable3 = null;
                    }
                    serializable = (Date) serializable3;
                }
                Date date = serializable instanceof Date ? (Date) serializable : null;
                if (i12 >= 33) {
                    serializable2 = bundle.getSerializable("date_to", Date.class);
                } else {
                    Object serializable4 = bundle.getSerializable("date_to");
                    if (!(serializable4 instanceof Date)) {
                        serializable4 = null;
                    }
                    serializable2 = (Date) serializable4;
                }
                Date date2 = serializable2 instanceof Date ? (Date) serializable2 : null;
                int i13 = bundle.getInt("flex_dates", -1);
                Integer numValueOf = i13 != -1 ? Integer.valueOf(i13) : null;
                aVar = (date == null || date2 == null) ? date != null ? new b.a(date, numValueOf) : date2 != null ? new b.a(date2, numValueOf) : b.C0228b.f3940a : new b.d(date, date2, numValueOf);
            }
            bVar.j(new FiltersCalendarPickerDeepLink.b(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: FiltersCalendarPickerDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lrv/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.inline_filters.dialog.calendar.deeplink.FiltersCalendarPickerDeepLinkHandler$onCreateSuspend$3", f = "FiltersCalendarPickerDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super C47919b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f171207q;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super C47919b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f171207q = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.f(this.f171207q);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k EN.a aVar, @k a.d dVar, @k a.f fVar, @k R0 r02) {
        super(r02);
        this.f171200g = aVar;
        this.f171201h = dVar;
        this.f171202i = fVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f171201h.D0("filters_calendar_picker_tag", new com.avito.android.inline_filters.dialog.calendar.deeplink.a(this, (FiltersCalendarPickerDeepLink) deepLink));
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.avito.android.inline_filters.dialog.calendar.deeplink.b.a
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.inline_filters.dialog.calendar.deeplink.b$a r0 = (com.avito.android.inline_filters.dialog.calendar.deeplink.b.a) r0
            int r1 = r0.f171206t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171206t = r1
            goto L1a
        L13:
            com.avito.android.inline_filters.dialog.calendar.deeplink.b$a r0 = new com.avito.android.inline_filters.dialog.calendar.deeplink.b$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r10 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r10
            r0.<init>(r10)
        L1a:
            java.lang.Object r10 = r0.f171204r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f171206t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.inline_filters.dialog.calendar.deeplink.b r0 = r0.f171203q
            kotlin.C42729a0.b(r10)
            goto L42
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            kotlin.C42729a0.b(r10)
            r0.f171203q = r9
            r0.f171206t = r3
            kotlin.G0 r10 = kotlin.G0.f406611a
            if (r10 != r1) goto L41
            return r1
        L41:
            r0 = r9
        L42:
            com.avito.android.deeplink_handler.view.a$f r10 = r0.f171202i
            java.lang.String r1 = "filters_calendar_picker_request"
            kotlinx.coroutines.flow.i r10 = fv.C40483b.b(r10, r1)
            com.avito.android.inline_filters.dialog.calendar.deeplink.b$b r1 = new com.avito.android.inline_filters.dialog.calendar.deeplink.b$b
            java.lang.String r7 = "handleFragmentResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V"
            r8 = 4
            r3 = 2
            java.lang.Class<com.avito.android.inline_filters.dialog.calendar.deeplink.b> r5 = com.avito.android.inline_filters.dialog.calendar.deeplink.b.class
            java.lang.String r6 = "handleFragmentResult"
            r2 = r1
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.r1 r2 = new kotlinx.coroutines.flow.r1
            r2.<init>(r1, r10)
            com.avito.android.inline_filters.dialog.calendar.deeplink.b$c r10 = new com.avito.android.inline_filters.dialog.calendar.deeplink.b$c
            r1 = 3
            r3 = 0
            r10.<init>(r1, r3)
            kotlinx.coroutines.flow.f0 r1 = new kotlinx.coroutines.flow.f0
            r1.<init>(r2, r10)
            kotlinx.coroutines.internal.h r10 = r0.f134492f
            kotlinx.coroutines.flow.C43175k.K(r1, r10)
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.calendar.deeplink.b.n(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
