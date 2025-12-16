package com.avito.android.publish.edit_advert_request;

import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.edit_advert_request.j;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditAdvertRequestFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/j$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/edit_advert_request/j$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<j.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditAdvertRequestFragment f235501l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EditAdvertRequestFragment editAdvertRequestFragment) {
        super(1);
        this.f235501l = editAdvertRequestFragment;
    }

    @Override // Y41.l
    public final G0 invoke(j.a aVar) {
        j.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof j.a.b;
        EditAdvertRequestFragment editAdvertRequestFragment = this.f235501l;
        if (z12) {
            j.a.b bVar = (j.a.b) aVar2;
            Intent intentPutExtra = new Intent().putExtra("status_message", bVar.f235519a).putExtra("edited_advert_id", bVar.f235520b);
            j jVar = editAdvertRequestFragment.f235448q0;
            if (jVar == null) {
                jVar = null;
            }
            Intent intentPutExtra2 = intentPutExtra.putExtra("edited_advert_post_action", jVar.f235509M.f231869g0);
            ActivityC22955m activityC22955mL1 = editAdvertRequestFragment.l1();
            PublishActivity publishActivity = activityC22955mL1 instanceof PublishActivity ? (PublishActivity) activityC22955mL1 : null;
            if (publishActivity != null) {
                publishActivity.d2(intentPutExtra2);
            }
        } else if (aVar2 instanceof j.a.c) {
            com.avito.android.progress_overlay.l lVar = editAdvertRequestFragment.f235449r0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (aVar2 instanceof j.a.C7102a) {
            com.avito.android.progress_overlay.l lVar2 = editAdvertRequestFragment.f235449r0;
            (lVar2 != null ? lVar2 : null).a(((j.a.C7102a) aVar2).f235518a.getF244063c());
        } else if (aVar2 instanceof j.a.d) {
            com.avito.android.progress_overlay.l lVar3 = editAdvertRequestFragment.f235449r0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.j();
            j.a.d dVar = (j.a.d) aVar2;
            Action.Confirmation confirmation = dVar.f235522a;
            com.avito.android.lib.deprecated_design.dialog.a aVar3 = editAdvertRequestFragment.f235447p0;
            (aVar3 != null ? aVar3 : null).b(null, confirmation.getDescription(), confirmation.getCancel(), new g(editAdvertRequestFragment), confirmation.getOk(), dVar.f235523b);
        }
        return G0.f406611a;
    }
}
