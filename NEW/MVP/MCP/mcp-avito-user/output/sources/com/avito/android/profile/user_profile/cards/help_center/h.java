package com.avito.android.profile.user_profile.cards.help_center;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.c;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/help_center/h;", "Lcom/avito/android/profile/user_profile/cards/help_center/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PU.b f224975b;

    /* compiled from: HelpCenterCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f224976l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f224976l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f224976l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        PU.b bVarA = c.a.a(view, R.id.user_profile_common_card_container);
        bVarA.f13077c.f12285b.setText(R.string.user_profile_help_center_title);
        TextView textView = bVarA.f13078d;
        D6.H(textView);
        textView.setText(R.string.user_profile_help_center_description);
        this.f224975b = bVarA;
    }

    @Override // com.avito.android.profile.user_profile.cards.help_center.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f224975b.a(new a(aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f224975b.a(null);
    }
}
