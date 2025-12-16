package ru.mts.biometry.sdk.base;

import android.content.Intent;
import android.net.Uri;
import androidx.core.content.d;
import androidx.fragment.app.ActivityC22955m;

/* loaded from: classes9.dex */
public final class r extends p {
    @Override // ru.mts.biometry.sdk.base.p
    public final void b() {
        StringBuilder sb2 = new StringBuilder("package:");
        ActivityC22955m activityC22955mL1 = l1();
        sb2.append(activityC22955mL1 != null ? activityC22955mL1.getPackageName() : null);
        startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb2.toString())));
    }

    @Override // ru.mts.biometry.sdk.base.p, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (d.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0) {
            getParentFragmentManager().Y();
        }
    }
}
