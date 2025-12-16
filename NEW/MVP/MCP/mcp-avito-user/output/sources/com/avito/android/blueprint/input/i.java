package com.avito.android.blueprint.input;

import Hj.C13996a;
import com.avito.android.items.ItemWithState;
import kotlin.Metadata;

/* compiled from: PublishInputPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/input/i;", "Lcom/avito/android/llm/ui/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements com.avito.android.llm.ui.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f105525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.d f105526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f105527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f105528d;

    public i(s sVar, com.avito.android.items.d dVar, s sVar2, o oVar) {
        this.f105525a = sVar;
        this.f105526b = dVar;
        this.f105527c = sVar2;
        this.f105528d = oVar;
    }

    @Override // com.avito.android.llm.ui.d
    public final void a(@Y61.k String str) {
        this.f105525a.x2(str);
    }

    @Override // com.avito.android.llm.ui.d
    public final void b(@Y61.l String str, boolean z12) {
        this.f105525a.h3(str, z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void c(boolean z12) {
        this.f105525a.q2(z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void j3(@Y61.k String str) {
        ItemWithState.State.Error.ErrorWithMessage errorWithMessage = new ItemWithState.State.Error.ErrorWithMessage(str);
        com.avito.android.items.d dVar = this.f105526b;
        dVar.O0(errorWithMessage);
        this.f105527c.a60(C13996a.a(this.f105528d.O(dVar), dVar.getF173921f()));
    }

    @Override // com.avito.android.llm.ui.d
    public final void y0(@Y61.k String str) {
        this.f105525a.he(str);
    }
}
