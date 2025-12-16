package com.avito.android.user_address.suggest;

import Y41.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviState;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAddressSuggestFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements l<UserAddressSuggestMviState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserAddressSuggestFragment f308022l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserAddressSuggestFragment userAddressSuggestFragment) {
        super(1);
        this.f308022l = userAddressSuggestFragment;
    }

    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(UserAddressSuggestMviState userAddressSuggestMviState) {
        UserAddressSuggestMviState userAddressSuggestMviState2 = userAddressSuggestMviState;
        com.avito.android.user_address.suggest.view.g gVar = this.f308022l.f308008v0;
        if (gVar != null) {
            if (userAddressSuggestMviState2 instanceof UserAddressSuggestMviState.Content) {
                UserAddressSuggestMviState.Content content = (UserAddressSuggestMviState.Content) userAddressSuggestMviState2;
                if (content instanceof UserAddressSuggestMviState.Content.Data) {
                    gVar.f308162c.c(new UV0.c(((UserAddressSuggestMviState.Content.Data) userAddressSuggestMviState2).f308087e));
                    gVar.f308161b.notifyDataSetChanged();
                    D6.w(gVar.f308169j);
                    D6.H(gVar.f308164e);
                    D6.H(gVar.f308165f);
                    ShimmerLayout shimmerLayout = gVar.f308167h;
                    if (shimmerLayout != null) {
                        D6.w(shimmerLayout);
                        shimmerLayout.d();
                    }
                    D6.w(gVar.f308168i);
                    D6.w(gVar.f308166g);
                } else if (content instanceof UserAddressSuggestMviState.Content.NoResult) {
                    D6.w(gVar.f308169j);
                    D6.H(gVar.f308164e);
                    D6.w(gVar.f308165f);
                    ShimmerLayout shimmerLayout2 = gVar.f308167h;
                    if (shimmerLayout2 != null) {
                        D6.w(shimmerLayout2);
                        shimmerLayout2.d();
                    }
                    D6.w(gVar.f308168i);
                    D6.H(gVar.f308166g);
                }
            } else if (userAddressSuggestMviState2 instanceof UserAddressSuggestMviState.ShimmerLoading) {
                D6.w(gVar.f308169j);
                D6.w(gVar.f308165f);
                ShimmerLayout shimmerLayout3 = gVar.f308167h;
                if (shimmerLayout3 != null) {
                    D6.H(shimmerLayout3);
                    shimmerLayout3.c();
                }
                D6.w(gVar.f308168i);
                D6.H(gVar.f308164e);
                D6.w(gVar.f308166g);
            } else {
                boolean z12 = userAddressSuggestMviState2 instanceof UserAddressSuggestMviState.ApiError;
                View view = gVar.f308160a;
                e eVar = gVar.f308163d;
                if (z12) {
                    D6.H(gVar.f308169j);
                    ImageView imageView = gVar.f308170k;
                    if (imageView != null) {
                        eVar.getClass();
                        imageView.setImageResource(R.drawable.img_unknown_error_216_160);
                    }
                    TextView textView = gVar.f308171l;
                    if (textView != null) {
                        textView.setText(eVar.getF308060a());
                    }
                    TextView textView2 = gVar.f308172m;
                    if (textView2 != null) {
                        textView2.setText(eVar.getF308061b());
                    }
                    D6.w(gVar.f308164e);
                    D6.w(gVar.f308165f);
                    K2.d(view, true);
                    ShimmerLayout shimmerLayout4 = gVar.f308167h;
                    if (shimmerLayout4 != null) {
                        D6.w(shimmerLayout4);
                        shimmerLayout4.d();
                    }
                    D6.w(gVar.f308168i);
                    D6.w(gVar.f308166g);
                } else if (userAddressSuggestMviState2 instanceof UserAddressSuggestMviState.NetworkError) {
                    D6.H(gVar.f308169j);
                    ImageView imageView2 = gVar.f308170k;
                    if (imageView2 != null) {
                        imageView2.setImageResource(eVar.getF308062c());
                    }
                    TextView textView3 = gVar.f308171l;
                    if (textView3 != null) {
                        textView3.setText(eVar.getF308063d());
                    }
                    TextView textView4 = gVar.f308172m;
                    if (textView4 != null) {
                        textView4.setText(eVar.getF308064e());
                    }
                    D6.w(gVar.f308164e);
                    D6.w(gVar.f308165f);
                    K2.d(view, true);
                    ShimmerLayout shimmerLayout5 = gVar.f308167h;
                    if (shimmerLayout5 != null) {
                        D6.w(shimmerLayout5);
                        shimmerLayout5.d();
                    }
                    D6.w(gVar.f308168i);
                    D6.w(gVar.f308166g);
                }
            }
        }
        return G0.f406611a;
    }
}
