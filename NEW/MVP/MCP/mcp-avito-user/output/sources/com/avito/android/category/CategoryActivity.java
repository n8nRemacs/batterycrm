package com.avito.android.category;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category/CategoryActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CategoryActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: CategoryActivity.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category/CategoryActivity$a;", "", "<init>", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.overlay_fragment_container;
    }

    public final void a2() {
        Intent intent = getIntent();
        CategoryArguments categoryArguments = (CategoryArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("arguments", CategoryArguments.class) : intent.getParcelableExtra("arguments"));
        if (categoryArguments == null) {
            throw new RuntimeException("arguments was not passed to " + this);
        }
        CategoryFragment.f116455w0.getClass();
        CategoryFragment categoryFragment = new CategoryFragment();
        C35966w1.a(categoryFragment, -1, new i(categoryArguments));
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, categoryFragment, null);
        hE2.h();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a2();
    }
}
