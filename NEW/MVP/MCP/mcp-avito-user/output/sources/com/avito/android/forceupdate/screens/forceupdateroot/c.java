package com.avito.android.forceupdate.screens.forceupdateroot;

import Y41.p;
import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ForceUpdateRootActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ForceUpdateRootActivity f158560l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ForceUpdateRootActivity forceUpdateRootActivity) {
        super(2);
        this.f158560l = forceUpdateRootActivity;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        ForceUpdateRootActivity forceUpdateRootActivity = this.f158560l;
        bVar2.setImage(C35835l0.h(R.attr.img_updateApp, forceUpdateRootActivity));
        bVar2.setTitle(R.string.version_conflict_update_proposal_title);
        bVar2.setSubtitle(R.string.version_conflict_update_proposal_subtitle);
        bVar2.setButtonsOrientation(1);
        bVar2.O3(R.string.version_conflict_update_proposal_primary_button, new a(forceUpdateRootActivity));
        bVar2.T3(R.string.version_conflict_update_proposal_secondary_button, new b(forceUpdateRootActivity));
        return G0.f406611a;
    }
}
