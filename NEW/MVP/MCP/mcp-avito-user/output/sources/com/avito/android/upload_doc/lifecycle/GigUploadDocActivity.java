package com.avito.android.upload_doc.lifecycle;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GigUploadDocActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/upload_doc/lifecycle/GigUploadDocActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/upload_doc/lifecycle/g;", "<init>", "()V", "a", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GigUploadDocActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, g {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f306811m = new a(null);

    /* compiled from: GigUploadDocActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/upload_doc/lifecycle/GigUploadDocActivity$a;", "", "<init>", "()V", "", "EXTRA_FLOW_TYPE", "Ljava/lang/String;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // android.app.Activity
    public final void finish() {
        K2.c(this);
        super.finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        Intent intent = getIntent();
        GigUploadDocDeeplink.FlowType flowType = (GigUploadDocDeeplink.FlowType) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("EXTRA_FLOW_TYPE", GigUploadDocDeeplink.FlowType.class) : intent.getParcelableExtra("EXTRA_FLOW_TYPE"));
        if (flowType == null) {
            return;
        }
        H hE2 = getSupportFragmentManager().e();
        GigUploadDocFragment.f306812w0.getClass();
        GigUploadDocFragment gigUploadDocFragment = new GigUploadDocFragment();
        C35966w1.a(gigUploadDocFragment, -1, new com.avito.android.upload_doc.lifecycle.a(flowType));
        hE2.j(R.id.fragment_container, gigUploadDocFragment, null, 1);
        hE2.e();
    }

    @Override // com.avito.android.upload_doc.lifecycle.g
    public final void q0() {
        setResult(-1);
        finish();
    }

    @Override // com.avito.android.upload_doc.lifecycle.g
    public final void y0() {
        setResult(0);
        finish();
    }
}
