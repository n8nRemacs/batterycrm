package com.avito.android.publish;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23040h0;
import com.avito.android.dialog.DialogWithDeeplinkActions;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import kotlin.Metadata;

/* compiled from: LiveDatas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class V<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232098b;

    public V(PublishActivity publishActivity) {
        this.f232098b = publishActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            DeepLinksDialogInfo deepLinksDialogInfo = (DeepLinksDialogInfo) t12;
            PublishActivity publishActivity = this.f232098b;
            Fragment fragmentH = publishActivity.getSupportFragmentManager().H("tag_draft_version_conflict_dialog");
            DialogFragment dialogFragment = fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null;
            DialogFragment dialogFragment2 = dialogFragment;
            if (dialogFragment == null) {
                DialogWithDeeplinkActions dialogWithDeeplinkActions = new DialogWithDeeplinkActions();
                com.avito.android.dialog.z.a(dialogWithDeeplinkActions, deepLinksDialogInfo, false);
                dialogFragment2 = dialogWithDeeplinkActions;
            }
            if (dialogFragment2.isAdded()) {
                return;
            }
            dialogFragment2.setCancelable(false);
            dialogFragment2.show(publishActivity.getSupportFragmentManager(), "tag_draft_version_conflict_dialog");
        }
    }
}
