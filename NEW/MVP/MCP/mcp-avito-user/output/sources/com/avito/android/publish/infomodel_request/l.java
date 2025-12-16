package com.avito.android.publish.infomodel_request;

import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.remote.model.Navigation;
import kotlin.Metadata;

/* compiled from: InfomodelRequestViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Navigation;", "navigation", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "apply", "(Lcom/avito/android/remote/model/Navigation;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f236171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f236172c;

    public l(f fVar, String str) {
        this.f236171b = fVar;
        this.f236172c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Navigation navigation2 = (Navigation) obj;
        f fVar = this.f236171b;
        boolean z12 = fVar.f236160T;
        PublishParametersInteractor publishParametersInteractor = fVar.f236149E;
        C0 c02 = fVar.f236158R;
        if (!z12) {
            return publishParametersInteractor.e(navigation2, c02.f231873k0, c02.f231875m0, c02.f231868f0);
        }
        return publishParametersInteractor.j(navigation2, this.f236172c, c02.se(), c02.f231868f0);
    }
}
