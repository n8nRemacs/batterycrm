package com.avito.android.publish.realty_address_submission;

import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.realty_address_submission.di.b;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResultAction;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResultAdvert;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;

/* compiled from: RealtyAddressSubmissionBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/realty_address_submission/RealtyAddressSubmissionBottomSheetDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RealtyAddressSubmissionBottomSheetDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public static final a f239040k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f239041h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public InterfaceC44261b f239042i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public AtomicReference f239043j0;

    /* compiled from: RealtyAddressSubmissionBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/realty_address_submission/RealtyAddressSubmissionBottomSheetDialog$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public RealtyAddressSubmissionBottomSheetDialog() {
        super(0, 1, null);
        this.f239043j0 = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        b.a aVarA = com.avito.android.publish.realty_address_submission.di.a.a();
        aVarA.b((com.avito.android.publish.realty_address_submission.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish.realty_address_submission.di.c.class));
        aVarA.a(cv.c.b(this));
        aVarA.build().a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        c cVar = new c(this, requireContext());
        RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction = null;
        com.avito.android.lib.design.bottom_sheet.d.M(cVar, null, false, true, 7);
        cVar.D(R.layout.realty_address_submission_bottomsheet, true);
        cVar.R(new d(this));
        com.avito.android.lib.design.bottom_sheet.d.I(cVar, true);
        Bundle bundleRequireArguments = requireArguments();
        com.avito.android.lib.design.bottom_sheet.j.c(cVar, bundleRequireArguments.getString("title"), true, 0, 0, 0, 124);
        TextView textView = (TextView) cVar.findViewById(R.id.location_picker_realty_submission_description);
        if (textView != null) {
            textView.setText(bundleRequireArguments.getString("description"));
        }
        Button button = (Button) cVar.findViewById(R.id.location_picker_realty_submission_activate_button);
        if (button != null) {
            RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction2 = (RealtyAddressSubmissionResultAction) bundleRequireArguments.getParcelable("action_activate");
            if (realtyAddressSubmissionResultAction2 != null) {
                button.setText(realtyAddressSubmissionResultAction2.getTitle());
                button.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(27, realtyAddressSubmissionResultAction2, this));
                com.avito.android.deeplink_handler.handler.composite.a aVar = this.f239041h0;
                if (aVar == null) {
                    aVar = null;
                }
                this.f239043j0 = (AtomicReference) aVar.d9().t0(new e(this));
            } else {
                realtyAddressSubmissionResultAction2 = null;
            }
            if (realtyAddressSubmissionResultAction2 == null) {
                D6.w(button);
            }
        }
        Button button2 = (Button) cVar.findViewById(R.id.location_picker_realty_submission_continue_button);
        if (button2 != null) {
            if (button2.getContext().getResources().getConfiguration().orientation == 2) {
                D6.w(button2);
            } else {
                RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction3 = (RealtyAddressSubmissionResultAction) bundleRequireArguments.getParcelable("action_continue");
                if (realtyAddressSubmissionResultAction3 != null) {
                    button2.setText(realtyAddressSubmissionResultAction3.getTitle());
                    button2.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(cVar, 16));
                    realtyAddressSubmissionResultAction = realtyAddressSubmissionResultAction3;
                }
                if (realtyAddressSubmissionResultAction == null) {
                    D6.w(button2);
                }
            }
        }
        RealtyAddressSubmissionResultAdvert realtyAddressSubmissionResultAdvert = (RealtyAddressSubmissionResultAdvert) bundleRequireArguments.getParcelable("advert");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) cVar.findViewById(R.id.location_picker_realty_submission_advert_image);
        if (simpleDraweeView != null) {
            if (realtyAddressSubmissionResultAdvert != null) {
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.d(n.a(realtyAddressSubmissionResultAdvert.getImage()));
                aVarA.c();
            } else {
                D6.w(simpleDraweeView);
                G0 g02 = G0.f406611a;
            }
        }
        TextView textView2 = (TextView) cVar.findViewById(R.id.location_picker_realty_submission_advert_title);
        if (textView2 != null) {
            if (realtyAddressSubmissionResultAdvert != null) {
                textView2.setText(realtyAddressSubmissionResultAdvert.getTitle());
            } else {
                D6.w(textView2);
                G0 g03 = G0.f406611a;
            }
        }
        TextView textView3 = (TextView) cVar.findViewById(R.id.location_picker_realty_submission_advert_price);
        if (textView3 != null) {
            if (realtyAddressSubmissionResultAdvert != null) {
                textView3.setText(realtyAddressSubmissionResultAdvert.getPrice());
            } else {
                D6.w(textView3);
                G0 g04 = G0.f406611a;
            }
        }
        TextView textView4 = (TextView) cVar.findViewById(R.id.location_picker_realty_submission_advert_status);
        if (textView4 != null) {
            if (realtyAddressSubmissionResultAdvert != null) {
                textView4.setText(realtyAddressSubmissionResultAdvert.getStatusText());
            } else {
                D6.w(textView4);
                G0 g05 = G0.f406611a;
            }
        }
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f239043j0.dispose();
    }
}
