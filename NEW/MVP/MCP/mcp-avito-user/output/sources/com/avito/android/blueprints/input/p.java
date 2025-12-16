package com.avito.android.blueprints.input;

import com.avito.android.blueprints.input.z;
import com.avito.android.items.ItemWithState;
import kotlin.Metadata;

/* compiled from: MultiStateInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/input/p;", "Lcom/avito/android/llm/ui/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements com.avito.android.llm.ui.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f105976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.d f105977b;

    public p(z zVar, com.avito.android.items.d dVar) {
        this.f105976a = zVar;
        this.f105977b = dVar;
    }

    @Override // com.avito.android.llm.ui.d
    public final void a(@Y61.k String str) {
        this.f105976a.x2(str);
    }

    @Override // com.avito.android.llm.ui.d
    public final void b(@Y61.l String str, boolean z12) {
        this.f105976a.h3(str, z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void c(boolean z12) {
        this.f105976a.q2(z12);
    }

    @Override // com.avito.android.llm.ui.d
    public final void j3(@Y61.k String str) {
        this.f105977b.O0(new ItemWithState.State.Error.ErrorWithMessage(str));
        z.a.a(this.f105976a, str, null, 2);
    }

    @Override // com.avito.android.llm.ui.d
    public final void y0(@Y61.k String str) {
        this.f105976a.he(str);
    }
}
