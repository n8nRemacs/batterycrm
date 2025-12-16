package com.avito.android.publish;

import arrow.core.C23703n1;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.drafts.C33842h;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PublishParametersInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/publish/drafts/h;", "optionalDraft", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "apply", "(Larrow/core/Y0;)Lcom/avito/android/publish/PublishParametersInteractor$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.v0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34145v0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CategoryParameters f245523b;

    public C34145v0(CategoryParameters categoryParameters) {
        this.f245523b = categoryParameters;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 c23703n1;
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            c23703n1 = arrow.core.X0.f56264b;
        } else {
            if (!(y02 instanceof C23703n1)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((C33842h) ((C23703n1) y02).f56288b).f235377c;
            if (kotlin.jvm.internal.L.f(str, C33883n0.f237442k)) {
                str = null;
            }
            c23703n1 = new C23703n1(str);
        }
        return new PublishParametersInteractor.a(this.f245523b, (String) c23703n1.c());
    }
}
