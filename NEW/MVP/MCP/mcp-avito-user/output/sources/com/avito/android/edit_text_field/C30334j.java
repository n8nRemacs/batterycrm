package com.avito.android.edit_text_field;

import Ay.InterfaceC13104b;
import Ay.d;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditTextFieldInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LAy/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldInteractorImpl$editExtendedSettingsTextField$1", f = "EditTextFieldInteractor.kt", i = {0, 1, 2, 2, 3, 3, 4, 4}, l = {61, 64, 81, 83, 89, 93, 95, UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "newFormatTextState", "$this$flow", "newFormatTextState", "$this$flow", "settings"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$2"})
/* renamed from: com.avito.android.edit_text_field.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30334j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13104b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f146987q;

    /* renamed from: r, reason: collision with root package name */
    public FormattedAlertSettings f146988r;

    /* renamed from: s, reason: collision with root package name */
    public int f146989s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f146990t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d.c f146991u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f146992v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C30336l f146993w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ EditTextFieldFragment.Mode.Extended f146994x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30334j(d.c cVar, String str, C30336l c30336l, EditTextFieldFragment.Mode.Extended extended, Continuation<? super C30334j> continuation) {
        super(2, continuation);
        this.f146991u = cVar;
        this.f146992v = str;
        this.f146993w = c30336l;
        this.f146994x = extended;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30334j c30334j = new C30334j(this.f146991u, this.f146992v, this.f146993w, this.f146994x, continuation);
        c30334j.f146990t = obj;
        return c30334j;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC13104b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30334j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) throws com.avito.android.util.ApiException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_text_field.C30334j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
