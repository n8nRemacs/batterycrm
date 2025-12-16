package com.avito.android.profile.user_profile.cards.action;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/action/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/user_profile/cards/action/g;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f224640b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f224641c;

    /* compiled from: ActionItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = h.this.f224641c;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.action_button);
        this.f224640b = cVarA;
        cVarA.c(new a());
    }

    @Override // com.avito.android.profile.user_profile.cards.action.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f224641c = aVar;
    }

    @Override // com.avito.android.profile.user_profile.cards.action.g
    public final void setTitle(@k String str) {
        this.f224640b.b(str);
    }
}
