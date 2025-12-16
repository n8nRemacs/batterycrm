package com.avito.android.contact_access.contact_access_service.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactAccessServiceActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/view/ContactAccessServiceActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactAccessServiceActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        Intent intent = getIntent();
        ContactAccessServiceArguments contactAccessServiceArguments = (ContactAccessServiceArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra_contact_access_args", ContactAccessServiceArguments.class) : intent.getParcelableExtra("extra_contact_access_args"));
        if (contactAccessServiceArguments == null) {
            return;
        }
        ContactAccessServiceFragment contactAccessServiceFragment = new ContactAccessServiceFragment();
        C35966w1.a(contactAccessServiceFragment, -1, new c(contactAccessServiceArguments));
        H hE2 = getSupportFragmentManager().e();
        hE2.j(R.id.fragment_container, contactAccessServiceFragment, null, 1);
        hE2.e();
    }
}
