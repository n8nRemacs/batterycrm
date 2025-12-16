package com.avito.android.passport.profile_add.merge.code_request.mvi;

import androidx.compose.runtime.internal.P;
import c60.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CodeRequestEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/c;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lc60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements t<CodeRequestInternalAction, c60.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f212864b;

    @Inject
    public c(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f212864b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final c60.b b(CodeRequestInternalAction codeRequestInternalAction) {
        CodeRequestInternalAction codeRequestInternalAction2 = codeRequestInternalAction;
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.CodeRequested) {
            CodeRequestInternalAction.CodeRequested codeRequested = (CodeRequestInternalAction.CodeRequested) codeRequestInternalAction2;
            return new b.C2031b(codeRequested.f212872b, codeRequested.f212873c);
        }
        if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.DeepLinkAction) {
            b.a.a(this.f212864b, ((CodeRequestInternalAction.DeepLinkAction) codeRequestInternalAction2).f212877b, null, null, 6);
        } else {
            if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.UnknownError) {
                return new b.a(null, null, ((CodeRequestInternalAction.UnknownError) codeRequestInternalAction2).f212881b, 3, null);
            }
            if (codeRequestInternalAction2 instanceof CodeRequestInternalAction.UnknownServerError) {
                CodeRequestInternalAction.UnknownServerError unknownServerError = (CodeRequestInternalAction.UnknownServerError) codeRequestInternalAction2;
                return new b.a(unknownServerError.f212883b.getMessage(), unknownServerError.f212883b, null, 4, null);
            }
            if (!(codeRequestInternalAction2 instanceof CodeRequestInternalAction.Loading ? true : codeRequestInternalAction2.equals(CodeRequestInternalAction.ClearValidationError.f212871b) ? true : codeRequestInternalAction2.equals(CodeRequestInternalAction.EmptyPhoneValidationError.f212878b) ? true : codeRequestInternalAction2 instanceof CodeRequestInternalAction.RemotePhoneValidationError ? true : codeRequestInternalAction2 instanceof CodeRequestInternalAction.CodeRequesting ? true : codeRequestInternalAction2 instanceof CodeRequestInternalAction.ShowContent ? true : codeRequestInternalAction2 instanceof CodeRequestInternalAction.ContentError)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
