package com.avito.android.publish.slots.final_state_suggest.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.final_state_suggest.FinalStateSuggestResponse;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FinalStateSuggestItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/final_state_suggest/item/f;", "Lcom/avito/android/publish/slots/final_state_suggest/item/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f243926b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f243927c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243926b = cVar;
        this.f243927c = new C41981q0(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        P2<FinalStateSuggestResponse> p22 = aVar2.f243917c;
        if (p22 instanceof P2.b) {
            FinalStateSuggestResponse finalStateSuggestResponse = (FinalStateSuggestResponse) ((P2.b) p22).f318720a;
            hVar.ln(finalStateSuggestResponse.getTitle(), finalStateSuggestResponse.getContent(), finalStateSuggestResponse.getImage());
        } else if (p22 instanceof P2.a) {
            hVar.PF(new e(this, aVar2));
        } else if (p22 instanceof P2.c) {
            hVar.c0();
        }
    }

    @Override // com.avito.android.publish.slots.final_state_suggest.item.d
    @k
    /* renamed from: i2, reason: from getter */
    public final C41981q0 getF243927c() {
        return this.f243927c;
    }
}
