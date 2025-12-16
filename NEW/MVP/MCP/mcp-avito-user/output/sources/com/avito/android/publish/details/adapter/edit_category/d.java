package com.avito.android.publish.details.adapter.edit_category;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EditCategoryItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/edit_category/d;", "Lcom/avito/android/publish/details/adapter/edit_category/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<ParameterElement.k> f233220b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f233221c;

    @Inject
    public d() {
        com.jakewharton.rxrelay3.c<ParameterElement.k> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f233220b = cVar;
        this.f233221c = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.details.adapter.edit_category.b
    @k
    /* renamed from: H, reason: from getter */
    public final C41981q0 getF233221c() {
        return this.f233221c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        g gVar = (g) eVar;
        ParameterElement.k kVar = (ParameterElement.k) aVar;
        String str2 = kVar.f117450e;
        if (str2 != null && str2.length() != 0 && (str = kVar.f117449d) != null && str.length() != 0) {
            gVar.g0(str2 + " · " + str);
        }
        gVar.s("edit_category_root");
        ItemWithState.State state = kVar.f117452g;
        if (state instanceof ItemWithState.State.Normal) {
            gVar.G();
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            gVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            gVar.H(null);
        } else {
            boolean z12 = state instanceof ItemWithState.State.Warning;
        }
        gVar.setEnabled(kVar.f117453h);
        gVar.a(new c(this, kVar));
    }
}
