package com.avito.android.mortgage_invite.contact_info;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ApplicationContactInfoFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.contact_info.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32829e extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        ApplicationContactInfoFragment applicationContactInfoFragment = (ApplicationContactInfoFragment) this.receiver;
        ApplicationContactInfoFragment.a aVar = ApplicationContactInfoFragment.f205577u0;
        if (applicationContactInfoFragment.getParentFragmentManager().L() > 0) {
            applicationContactInfoFragment.getParentFragmentManager().Y();
        } else {
            ActivityC22955m activityC22955mL1 = applicationContactInfoFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
            }
        }
        return G0.f406611a;
    }
}
