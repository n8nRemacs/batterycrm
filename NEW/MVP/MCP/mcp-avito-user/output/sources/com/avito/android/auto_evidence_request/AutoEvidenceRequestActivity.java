package com.avito.android.auto_evidence_request;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auto_evidence_request.AutoEvidenceRequestFragment;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoEvidenceRequestActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_evidence_request/AutoEvidenceRequestActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoEvidenceRequestActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final a f95005n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f95006m = C35961v3.a(this);

    /* compiled from: AutoEvidenceRequestActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_evidence_request/AutoEvidenceRequestActivity$a;", "", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            AutoEvidenceRequestFragment.a aVar = AutoEvidenceRequestFragment.f95007y0;
            AutoEvidenceRequestOpenParams autoEvidenceRequestOpenParams = (AutoEvidenceRequestOpenParams) this.f95006m.getValue();
            aVar.getClass();
            AutoEvidenceRequestFragment autoEvidenceRequestFragment = new AutoEvidenceRequestFragment();
            autoEvidenceRequestFragment.f95009n0.setValue(autoEvidenceRequestFragment, AutoEvidenceRequestFragment.f95008z0[0], autoEvidenceRequestOpenParams);
            hE2.n(R.id.content, autoEvidenceRequestFragment, null);
            hE2.e();
        }
    }
}
