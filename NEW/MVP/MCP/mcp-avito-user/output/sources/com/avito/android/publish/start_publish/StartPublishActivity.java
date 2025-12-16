package com.avito.android.publish.start_publish;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.publish.start_publish.StartPublishFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StartPublishActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StartPublishActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f245278m = new a(null);

    /* compiled from: StartPublishActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishActivity$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.start_publish_activity;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Fragment fragmentH = getSupportFragmentManager().H("tag.start_publish");
        if (fragmentH == null) {
            StartPublishFragment.a aVar = StartPublishFragment.f245287D0;
            StartPublishBundle startPublishBundle = (StartPublishBundle) getIntent().getParcelableExtra("key.call_with_params");
            boolean booleanExtra = getIntent().getBooleanExtra("with_up_intent", true);
            aVar.getClass();
            fragmentH = new StartPublishFragment();
            if (startPublishBundle != null) {
                Bundle bundle2 = new Bundle(2);
                bundle2.putParcelable("called_params", startPublishBundle);
                bundle2.putBoolean("with_up_intent", booleanExtra);
                fragmentH.setArguments(bundle2);
            }
        }
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, fragmentH, "tag.start_publish");
        hE2.e();
    }
}
