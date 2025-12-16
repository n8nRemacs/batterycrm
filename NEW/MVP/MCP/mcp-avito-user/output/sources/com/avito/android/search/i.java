package com.avito.android.search;

import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SearchDeepLinkInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f263819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f263820c;

    public i(j jVar, String str) {
        this.f263819b = jVar;
        this.f263820c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new P2.b(((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink());
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = this.f263819b;
        if (jVar.f263824d.d()) {
            return new P2.a(((TypedResult.Error) typedResult).getError());
        }
        return new P2.b(jVar.f263825e.b("ru.avito://1/bx/content?presentationType=serp&query=" + this.f263820c));
    }
}
