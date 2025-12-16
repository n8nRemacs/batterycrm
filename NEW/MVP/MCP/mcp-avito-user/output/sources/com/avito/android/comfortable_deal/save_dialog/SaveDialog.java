package com.avito.android.comfortable_deal.save_dialog;

import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.comfortable_deal.save_dialog.model.SaveArguments;
import com.avito.android.lib.design.modal.a;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: SaveDialog.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/save_dialog/SaveDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SaveDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public static final a f122629h0 = new a(null);

    /* compiled from: SaveDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/save_dialog/SaveDialog$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SaveDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.save_dialog.SaveDialog$a$a, reason: collision with other inner class name */
        public static final class C3630a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SaveArguments f122630l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3630a(SaveArguments saveArguments) {
                super(1);
                this.f122630l = saveArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("save_arguments", this.f122630l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static SaveDialog a(@k SaveArguments saveArguments) {
            SaveDialog saveDialog = new SaveDialog();
            C35966w1.a(saveDialog, -1, new C3630a(saveArguments));
            return saveDialog;
        }

        public a() {
        }
    }

    /* compiled from: SaveDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<a.b, DialogInterface, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            a aVar = SaveDialog.f122629h0;
            SaveDialog saveDialog = SaveDialog.this;
            bVar2.setTitle(saveDialog.f5().f122635c);
            Integer num = saveDialog.f5().f122636d;
            if (num != null) {
                bVar2.setSubtitle(num.intValue());
            }
            if (!saveDialog.f5().f122639g) {
                bVar2.setButtonsOrientation(1);
            }
            SaveArguments saveArgumentsF5 = saveDialog.f5();
            bVar2.O3(saveArgumentsF5.f122637e, new com.avito.android.comfortable_deal.save_dialog.a(saveDialog));
            SaveArguments saveArgumentsF52 = saveDialog.f5();
            bVar2.T3(saveArgumentsF52.f122638f, new com.avito.android.comfortable_deal.save_dialog.b(saveDialog));
            bVar2.setCloseButtonVisible(false);
            return G0.f406611a;
        }
    }

    public SaveDialog() {
        super(0, 1, null);
    }

    public final SaveArguments f5() {
        return (SaveArguments) requireArguments().getParcelable("save_arguments");
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        return a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, requireContext(), new b());
    }
}
