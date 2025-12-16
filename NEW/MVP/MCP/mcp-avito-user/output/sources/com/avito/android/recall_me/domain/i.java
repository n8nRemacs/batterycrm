package com.avito.android.recall_me.domain;

import com.avito.android.recall_me.domain.h;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.remote.ConfirmCodeResponse;
import com.avito.android.remote.RecallMeError;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RecallMeInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/ConfirmCodeResponse;", "response", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/recall_me/domain/h$b;", "apply", "(Lcom/avito/android/remote/ConfirmCodeResponse;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f251848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f251849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RecallMeFormState f251850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RecallMeParams f251851e;

    public i(h hVar, String str, RecallMeFormState recallMeFormState, RecallMeParams recallMeParams) {
        this.f251848b = hVar;
        this.f251849c = str;
        this.f251850d = recallMeFormState;
        this.f251851e = recallMeParams;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String message;
        ConfirmCodeResponse confirmCodeResponse = (ConfirmCodeResponse) obj;
        boolean success = confirmCodeResponse.getSuccess();
        String str = this.f251849c;
        RecallMeFormState recallMeFormState = this.f251850d;
        h hVar = this.f251848b;
        if (success) {
            a aVar = hVar.f251840d;
            String str2 = recallMeFormState.f251831c;
            return z.c0(new h.b.a(aVar.a(confirmCodeResponse.getRetryAfterSec() != null ? Long.valueOf(r9.intValue()) : null, str, str2 != null ? str2 : "")));
        }
        RecallMeError error = confirmCodeResponse.getError();
        Integer numValueOf = error != null ? Integer.valueOf(error.getCode()) : null;
        boolean zR2 = C42745f0.r(com.avito.android.recall_me_core.g.f252051a, numValueOf);
        boolean z12 = (numValueOf != null && numValueOf.intValue() == 11) || (numValueOf != null && numValueOf.intValue() == 2);
        if (zR2) {
            int i12 = h.f251836f;
            return hVar.c(this.f251851e, recallMeFormState);
        }
        if (z12) {
            a aVar2 = hVar.f251840d;
            String str3 = recallMeFormState.f251831c;
            return z.c0(new h.b.a(aVar2.a(Long.valueOf(confirmCodeResponse.getRetryAfterSec() != null ? r9.intValue() : 0L), str, str3 != null ? str3 : "")));
        }
        RecallMeError error2 = confirmCodeResponse.getError();
        if (error2 == null || (message = error2.getMessage()) == null) {
            message = hVar.f251839c.f252014h;
        }
        return z.c0(new h.b.C7557b(message));
    }
}
