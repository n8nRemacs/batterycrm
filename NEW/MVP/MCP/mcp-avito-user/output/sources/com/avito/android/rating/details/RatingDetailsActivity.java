package com.avito.android.rating.details;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingDetailsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f246407m = new a(null);

    /* compiled from: RatingDetailsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/details/RatingDetailsActivity$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static Intent a(@Y61.k Context context, @Y61.k RatingDetailsArguments ratingDetailsArguments) {
            Intent intent = new Intent(context, (Class<?>) RatingDetailsActivity.class);
            intent.putExtra("key_arguments", ratingDetailsArguments);
            return intent;
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_arguments", RatingDetailsArguments.class) : intent.getParcelableExtra("key_arguments");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            RatingDetailsFragment.f246422S0.getClass();
            RatingDetailsFragment ratingDetailsFragment = new RatingDetailsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key_arguments", (RatingDetailsArguments) parcelableExtra);
            ratingDetailsFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, ratingDetailsFragment, null, 1);
            hE2.f();
        }
    }
}
