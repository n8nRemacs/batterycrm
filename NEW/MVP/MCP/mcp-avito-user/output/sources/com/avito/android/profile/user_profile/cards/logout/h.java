package com.avito.android.profile.user_profile.cards.logout;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LogoutCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/logout/h;", "Lcom/avito/android/profile/user_profile/cards/logout/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225047b;

    /* compiled from: LogoutCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225048l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225048l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225048l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.action_button);
        cVarA.a(R.string.log_out);
        this.f225047b = cVarA;
    }

    @Override // com.avito.android.profile.user_profile.cards.logout.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225047b.c(new a(aVar));
    }
}
