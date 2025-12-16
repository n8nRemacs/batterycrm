package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.mortgage.api.model.DocumentsForm;
import com.avito.android.mortgage.api.model.RemoteValidFile;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageDocumentUploadDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.deeplink.MortgageDocumentUploadDeeplinkHandler$doHandle$1", f = "MortgageDocumentUploadDeeplinkHandler.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class C extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f198674q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f198675r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MortgageDocumentUploadLink f198676s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d12, MortgageDocumentUploadLink mortgageDocumentUploadLink, Continuation<? super C> continuation) {
        super(2, continuation);
        this.f198675r = d12;
        this.f198676s = mortgageDocumentUploadLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C(this.f198675r, this.f198676s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f198674q;
        D d12 = this.f198675r;
        MortgageDocumentUploadLink mortgageDocumentUploadLink = this.f198676s;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = mortgageDocumentUploadLink.f198702b;
            this.f198674q = 1;
            objA = d12.f198680i.a(str, mortgageDocumentUploadLink.f198703c, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = obj;
        }
        TypedResult typedResult = (TypedResult) objA;
        if (typedResult instanceof TypedResult.Success) {
            DocumentsForm documentsForm = (DocumentsForm) ((TypedResult.Success) typedResult).getResult();
            String str2 = mortgageDocumentUploadLink.f198708h;
            String str3 = mortgageDocumentUploadLink.f198703c;
            List<String> list = mortgageDocumentUploadLink.f198707g;
            int iIndexOf = 1 + list.indexOf(str3);
            int size = list.size();
            String title = documentsForm.getTitle();
            AttributedText info = documentsForm.getInfo();
            String limitsInfo = documentsForm.getLimitsInfo();
            String analyticsAttrTitle = documentsForm.getAnalyticsAttrTitle();
            List<RemoteValidFile> listF = documentsForm.f();
            if (listF == null) {
                listF = C42784z0.f406748b;
            }
            List<RemoteValidFile> list2 = listF;
            d12.f198677f.R(d12.f198678g.b(new DocumentUploadArguments(str2, iIndexOf, size, title, info, limitsInfo, mortgageDocumentUploadLink.f198702b, mortgageDocumentUploadLink.f198703c, mortgageDocumentUploadLink.f198704d, mortgageDocumentUploadLink.f198705e, mortgageDocumentUploadLink.f198706f, analyticsAttrTitle, mortgageDocumentUploadLink.f198707g, list2, mortgageDocumentUploadLink.f198709i)), com.avito.android.deeplink_handler.view.b.f134588l);
            d12.j(AbstractC14250d.c.f9171c);
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
            String strJ = com.avito.android.error.z.j(apiExceptionA);
            if (strJ != null) {
                a.i.C4057a.d(d12.f198679h, com.avito.android.printable_text.b.f(strJ), null, null, new f.c(com.avito.android.error.z.n(apiExceptionA)), 0, ToastBarPosition.f181044b, null, null, 1966);
            }
            d12.j(AbstractC14250d.b.f9170c);
        }
        return G0.f406611a;
    }
}
