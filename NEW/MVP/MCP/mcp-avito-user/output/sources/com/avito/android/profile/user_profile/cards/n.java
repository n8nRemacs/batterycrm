package com.avito.android.profile.user_profile.cards;

import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserHatCommonSubView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/n;", "Lcom/avito/android/profile/user_profile/cards/m;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.user_hat.d f225088b;

    /* compiled from: UserHatCommonSubView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f225089l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225089l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f225089l.invoke();
            return G0.f406611a;
        }
    }

    public n(@Y61.k com.avito.android.component.user_hat.d dVar) {
        this.f225088b = dVar;
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void B8() {
        com.avito.android.component.user_hat.d dVar = this.f225088b;
        dVar.b(null);
        dVar.a(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void J(@Y61.l String str) {
        this.f225088b.f125296c.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void S2(@Y61.l String str, @Y61.l Float f12) {
        com.avito.android.component.user_hat.d dVar = this.f225088b;
        boolean z12 = f12 != null;
        boolean z13 = str != null;
        RatingBar ratingBar = dVar.f125300g;
        D6.G(ratingBar, z12);
        TextView textView = dVar.f125301h;
        D6.G(textView, z13);
        D6.G(dVar.f125302i, z12);
        ratingBar.setFloatingRatingIsEnabled(true);
        ratingBar.setRating(f12 != null ? f12.floatValue() : 0.0f);
        textView.setTextColor(C35835l0.d(str != null ? R.attr.blue : R.attr.gray28, dVar.f125295b));
        if (str == null) {
            str = dVar.f125294a.getContext().getString(R.string.user_hat_more_info);
        }
        textView.setText(str);
        TextView textView2 = dVar.f125303j;
        D6.G(textView2, true);
        textView2.setText(f12 != null ? C35852n1.a(f12.floatValue()) : null);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void SL(@Y61.k String str) {
        I5.a(this.f225088b.f125297d, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void Y70(@Y61.k Y41.a<G0> aVar) {
        this.f225088b.f125294a.setOnClickListener(new com.avito.android.calltracking.item.m(28, new a(aVar)));
    }

    @Override // com.avito.android.profile.user_profile.cards.m
    public final void eB(@Y61.k String str, @Y61.l String str2) {
        com.avito.android.component.user_hat.d dVar = this.f225088b;
        dVar.b(str);
        dVar.a(str2);
    }
}
