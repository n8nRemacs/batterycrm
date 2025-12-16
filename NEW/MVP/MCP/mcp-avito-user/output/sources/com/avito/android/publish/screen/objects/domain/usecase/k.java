package com.avito.android.publish.screen.objects.domain.usecase;

import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.N;

/* compiled from: ObjectValidateUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f240119l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SafeContinuation safeContinuation) {
        super(1);
        this.f240119l = safeContinuation;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        int i12 = Z.f406624c;
        this.f240119l.resumeWith(new ObjectFillFormInternalAction.ShowErrorAlert(str));
        return G0.f406611a;
    }
}
