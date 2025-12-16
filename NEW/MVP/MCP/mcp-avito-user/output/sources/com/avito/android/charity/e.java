package com.avito.android.charity;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.A;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;
import po.C47118a;

/* compiled from: CharityInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lpo/a;", "response", "Lio/reactivex/rxjava3/core/w;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f118059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharitySource f118060c;

    public e(String str, CharitySource charitySource) {
        this.f118059b = str;
        this.f118060c = charitySource;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return A.a(((C47118a) ((TypedResult.Success) typedResult).getResult()).getDeeplink());
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        V2.f318762a.c("CharityInteractor", "Failed to prepare charity popup for advertId=" + this.f118059b + ", source=" + this.f118060c + ". Error: " + ((TypedResult.Error) typedResult).getError().getF244063c(), null);
        return C41928w.f403335b;
    }
}
