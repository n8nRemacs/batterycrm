package com.avito.android.vas_planning.remove;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.vas_planning.remove.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlannerRemoveDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_planning/remove/o$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_planning/remove/o$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.l<o.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasPlannerRemoveDialogFragment f322476l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(VasPlannerRemoveDialogFragment vasPlannerRemoveDialogFragment) {
        super(1);
        this.f322476l = vasPlannerRemoveDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(o.a aVar) {
        o.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof o.a.C9970a;
        VasPlannerRemoveDialogFragment vasPlannerRemoveDialogFragment = this.f322476l;
        if (z12) {
            ActivityC22955m activityC22955mRequireActivity = vasPlannerRemoveDialogFragment.requireActivity();
            Intent intent = new Intent();
            m mVar = vasPlannerRemoveDialogFragment.f322470i0;
            if (mVar == null) {
                mVar = null;
            }
            intent.putExtra("extra_vas_remove_msg", mVar.f322496a.getString(R.string.vas_planning_remove_failure));
            G0 g02 = G0.f406611a;
            activityC22955mRequireActivity.setResult(0, intent);
            vasPlannerRemoveDialogFragment.dismiss();
        } else if (aVar2 instanceof o.a.b) {
            ActivityC22955m activityC22955mRequireActivity2 = vasPlannerRemoveDialogFragment.requireActivity();
            Intent intent2 = new Intent();
            intent2.putExtra("extra_vas_remove_plan_id", ((o.a.b) aVar2).f322506a);
            G0 g03 = G0.f406611a;
            activityC22955mRequireActivity2.setResult(-1, intent2);
            vasPlannerRemoveDialogFragment.dismiss();
        }
        return G0.f406611a;
    }
}
