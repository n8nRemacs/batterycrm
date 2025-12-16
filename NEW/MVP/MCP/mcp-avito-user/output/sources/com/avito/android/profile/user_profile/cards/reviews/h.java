package com.avito.android.profile.user_profile.cards.reviews;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import gr.C40723b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReviewsCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/reviews/h;", "Lcom/avito/android/profile/user_profile/cards/reviews/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f225334b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C40723b f225335c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225336d;

    /* compiled from: ReviewsCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225337l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225337l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225337l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f225334b = (TextView) view.findViewById(R.id.title);
        C40723b c40723bB = com.avito.android.profile.user_profile.cards.d.b(view, R.id.reviews);
        com.avito.android.profile.user_profile.cards.d.c(c40723bB, C35835l0.l(context.getDrawable(R.drawable.ic_review_24), C35835l0.d(R.attr.gray28, context)));
        this.f225335c = c40723bB;
        this.f225336d = com.avito.android.profile.user_profile.cards.d.a(view, R.id.action_button);
    }

    @Override // com.avito.android.profile.user_profile.cards.reviews.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225336d.c(new a(aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.reviews.g
    public final void W10(@k String str) {
        this.f225335c.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.reviews.g
    public final void ZW(@k String str) {
        this.f225336d.b(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.reviews.g
    public final void zA(@k String str) {
        I5.a(this.f225334b, str, false);
    }
}
