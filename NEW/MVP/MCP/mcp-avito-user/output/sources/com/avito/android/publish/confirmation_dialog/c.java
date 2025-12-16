package com.avito.android.publish.confirmation_dialog;

import Y41.p;
import Y61.k;
import android.content.DialogInterface;
import com.avito.android.details.SelectItemBaseFragment;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.util.g;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ConfirmationDialog.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* compiled from: ConfirmationDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CategoryPublishStep.Params.Confirmation f232418l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f232419m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CategoryPublishStep.Params.Confirmation confirmation, Y41.a<G0> aVar) {
            super(2);
            this.f232418l = confirmation;
            this.f232419m = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            CategoryPublishStep.Params.Confirmation confirmation = this.f232418l;
            bVar2.setTitle(confirmation.getTitle());
            bVar2.setButtonsOrientation(1);
            bVar2.setCancelable(true);
            bVar2.setSubtitle(confirmation.getSubtitle());
            String confirmationButtonText = confirmation.getConfirmationButtonText();
            if (confirmationButtonText != null && confirmationButtonText.length() != 0) {
                bVar2.L3(confirmationButtonText, new com.avito.android.publish.confirmation_dialog.a(this.f232419m, dialogInterface2));
            }
            String cancelButtonText = confirmation.getCancelButtonText();
            if (cancelButtonText != null && cancelButtonText.length() != 0) {
                bVar2.M3(cancelButtonText, new b(dialogInterface2));
            }
            return G0.f406611a;
        }
    }

    public static final void a(@k SelectItemBaseFragment selectItemBaseFragment, @k CategoryPublishStep.Params.Confirmation confirmation, @k Y41.a<G0> aVar) {
        g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, selectItemBaseFragment.requireContext(), new a(confirmation, aVar)));
    }
}
