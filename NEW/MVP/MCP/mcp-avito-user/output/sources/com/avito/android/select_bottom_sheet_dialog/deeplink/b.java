package com.avito.android.select_bottom_sheet_dialog.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.select.Arguments;
import com.avito.android.select.SelectResult;
import com.avito.android.select.bottom_sheet.SelectBottomSheetActivity;
import com.avito.android.select_bottom_sheet_dialog.deeplink.JobSelectBottomSheetDialogLink;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import fv.C40483b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;
import sv.C48421d;

/* compiled from: JobSelectBottomSheetDialogDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_bottom_sheet_dialog/deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/select_bottom_sheet_dialog/deeplink/JobSelectBottomSheetDialogLink;", "_avito_job_select-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<JobSelectBottomSheetDialogLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f266868g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f266869h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f266870i;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f266871b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f266872c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.select_bottom_sheet_dialog.deeplink.b$a$a, reason: collision with other inner class name */
        public static final class C7958a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f266873b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f266874c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.select_bottom_sheet_dialog.deeplink.JobSelectBottomSheetDialogDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "JobSelectBottomSheetDialogDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.select_bottom_sheet_dialog.deeplink.b$a$a$a, reason: collision with other inner class name */
            public static final class C7959a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f266875q;

                /* renamed from: r, reason: collision with root package name */
                public int f266876r;

                public C7959a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f266875q = obj;
                    this.f266876r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7958a.this.emit(null, this);
                }
            }

            public C7958a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f266873b = interfaceC43172j;
                this.f266874c = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.select_bottom_sheet_dialog.deeplink.b.a.C7958a.C7959a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.select_bottom_sheet_dialog.deeplink.b$a$a$a r0 = (com.avito.android.select_bottom_sheet_dialog.deeplink.b.a.C7958a.C7959a) r0
                    int r1 = r0.f266876r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f266876r = r1
                    goto L18
                L13:
                    com.avito.android.select_bottom_sheet_dialog.deeplink.b$a$a$a r0 = new com.avito.android.select_bottom_sheet_dialog.deeplink.b$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f266875q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f266876r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.select_bottom_sheet_dialog.deeplink.b r2 = r4.f266874c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f266876r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f266873b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select_bottom_sheet_dialog.deeplink.b.a.C7958a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, b bVar) {
            this.f266871b = interfaceC43160i;
            this.f266872c = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f266871b).collect(new C7958a(interfaceC43172j, this.f266872c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: JobSelectBottomSheetDialogDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select_bottom_sheet_dialog.deeplink.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C7960b extends C42801a implements p<C47918a, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            SelectResult selectResult;
            C47918a c47918a2 = c47918a;
            b bVar = (b) this.receiver;
            bVar.getClass();
            int i12 = c47918a2.f437156b;
            Intent intent = c47918a2.f437157c;
            if (intent != null) {
                intent.setExtrasClassLoader(m0.f406844a.b(SelectResult.class).getClass().getClassLoader());
                selectResult = (SelectResult) intent.getParcelableExtra("select_result");
            } else {
                selectResult = null;
            }
            if (i12 == -1 && selectResult != null) {
                try {
                    JobSelectBottomSheetDialogLink.Type typeValueOf = JobSelectBottomSheetDialogLink.Type.valueOf(selectResult.f264977b);
                    try {
                        SelectParameter.Value value = (SelectParameter.Value) C42745f0.E(selectResult.f264978c);
                        bVar.j(new JobSelectBottomSheetDialogLink.b.c(typeValueOf, new JobSelectBottomSheetDialogLink.Option(value.getId(), value.getTitle(), value.getSubtitle())));
                    } catch (Exception e12) {
                        V2.f318762a.a("DEFAULT_TAG", "Error when handle select dialog result", e12);
                        bVar.j(JobSelectBottomSheetDialogLink.b.C7957b.f266864b);
                    }
                } catch (Exception e13) {
                    V2.f318762a.a("DEFAULT_TAG", "Error when handle select dialog result", e13);
                    bVar.j(JobSelectBottomSheetDialogLink.b.C7957b.f266864b);
                }
            } else if (i12 == 0) {
                bVar.j(JobSelectBottomSheetDialogLink.b.a.f266863b);
            } else {
                bVar.j(JobSelectBottomSheetDialogLink.b.C7957b.f266864b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k Context context, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k R0 r02) {
        super(r02);
        this.f266868g = context;
        this.f266869h = interfaceC4053a;
        this.f266870i = bVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        Object next;
        JobSelectBottomSheetDialogLink jobSelectBottomSheetDialogLink = (JobSelectBottomSheetDialogLink) deepLink;
        List<JobSelectBottomSheetDialogLink.Option> listF = jobSelectBottomSheetDialogLink.f();
        ArrayList arrayList = new ArrayList(C42745f0.q(listF, 10));
        for (JobSelectBottomSheetDialogLink.Option option : listF) {
            arrayList.add(new SelectParameter.Value(option.getId(), option.getTitle(), option.getSubtitle(), null, new SelectParameter.Value.Display(null, option.getTitle(), option.getSubtitle(), null, null, null, null, null, null, null, null, null, 4088, null), null, false, null, null, null, 1000, null));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((SelectParameter.Value) next).getId(), jobSelectBottomSheetDialogLink.getSelectedId())) {
                break;
            }
        }
        SelectParameter.Value value = (SelectParameter.Value) next;
        this.f266869h.J(new Intent(this.f266868g, (Class<?>) SelectBottomSheetActivity.class).putExtra("select_arguments", new Arguments(false, jobSelectBottomSheetDialogLink.getType().name(), null, arrayList, value != null ? Collections.singletonList(value) : C42784z0.f406748b, jobSelectBottomSheetDialogLink.getTitle(), null, false, false, false, false, false, true, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -134225083, 255, null)), C48421d.a(this), new com.avito.android.select_bottom_sheet_dialog.deeplink.a(this));
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new C7960b(2, this, b.class, "handleActivityResult", "handleActivityResult(Lcom/avito/android/deeplink_handler/view/result/ActivityResult;)V", 4), new a(C40483b.a(this.f266870i), this)), this.f134492f);
        return G0.f406611a;
    }
}
