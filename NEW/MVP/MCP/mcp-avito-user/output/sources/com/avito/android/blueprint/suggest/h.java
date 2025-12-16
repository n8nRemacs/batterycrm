package com.avito.android.blueprint.suggest;

import Hj.C13996a;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import kotlin.Metadata;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/suggest/h;", "Lcom/avito/android/llm/ui/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements com.avito.android.llm.ui.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f105709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f105710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f105711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f105712d;

    public h(y yVar, ParameterElement.H h12, y yVar2, w wVar) {
        this.f105709a = yVar;
        this.f105710b = h12;
        this.f105711c = yVar2;
        this.f105712d = wVar;
    }

    @Override // com.avito.android.llm.ui.d
    public final void a(@Y61.k String str) {
        this.f105709a.x2(str);
    }

    @Override // com.avito.android.llm.ui.d
    public final void b(@Y61.l String str, boolean z12) {
        this.f105709a.h3(str, z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void c(boolean z12) {
        this.f105709a.q2(z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void j3(@Y61.k String str) {
        ItemWithState.State.Error.ErrorWithMessage errorWithMessage = new ItemWithState.State.Error.ErrorWithMessage(str);
        ParameterElement.H h12 = this.f105710b;
        h12.f117309o = errorWithMessage;
        this.f105712d.getClass();
        this.f105711c.a60(C13996a.a(w.V(h12), h12.f117309o));
    }

    @Override // com.avito.android.llm.ui.d
    public final void y0(@Y61.k String str) {
        this.f105709a.f8(str);
    }
}
