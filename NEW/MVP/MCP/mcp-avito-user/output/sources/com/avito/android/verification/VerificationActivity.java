package com.avito.android.verification;

import Y61.k;
import Y61.l;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.L;
import com.avito.android.P;
import com.avito.android.P1;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import com.avito.android.deep_linking.links.VerificationConfirmRequisitesLink;
import com.avito.android.deep_linking.links.VerificationDisclaimerLink;
import com.avito.android.deep_linking.links.VerificationFetchInvoiceLink;
import com.avito.android.deep_linking.links.VerificationInputBillAmountLink;
import com.avito.android.deep_linking.links.VerificationInputInnLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.verification.links.verifications_list_old.VerificationsListLinkOld;
import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesArgs;
import com.avito.android.verification.verification_confirm_requisites.VerificationConfirmRequisitesFragment;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerArgs;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerFragment;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceArgs;
import com.avito.android.verification.verification_fetch_invoice.VerificationFetchInvoiceFragment;
import com.avito.android.verification.verification_finish.VerificationFinishArgs;
import com.avito.android.verification.verification_finish.VerificationFinishFragment;
import com.avito.android.verification.verification_form_builder.FormBuilderArgs;
import com.avito.android.verification.verification_form_builder.FormBuilderFragment;
import com.avito.android.verification.verification_form_builder.deeplink.VerificationFormBuilderLink;
import com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountArgs;
import com.avito.android.verification.verification_input_bill_amount.VerificationInputBillAmountFragment;
import com.avito.android.verification.verification_input_inn.VerificationInputInnArgs;
import com.avito.android.verification.verification_input_inn.VerificationInputInnFragment;
import com.avito.android.verification.verification_status_list.VerificationStatusListArgs;
import com.avito.android.verification.verification_status_list.VerificationStatusListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: VerificationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/VerificationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f323373r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public L f323374m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public x f323375n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f323376o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public P f323377p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public P1 f323378q;

    /* compiled from: VerificationActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/VerificationActivity$a;", "", "<init>", "()V", "", "RESULT_ERROR_MESSAGE", "Ljava/lang/String;", "RESULT_MESSAGE", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.verification_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.verification.di.verification_activity.a.a().a((com.avito.android.verification.di.verification_activity.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.verification_activity.c.class), cv.c.a(this)).a(this);
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Object, java.util.Map] */
    public final void a2(Intent intent, boolean z12) {
        DeepLink deepLinkE;
        Uri data = intent.getData();
        if (data != null) {
            x xVar = this.f323375n;
            if (xVar == null) {
                xVar = null;
            }
            deepLinkE = xVar.e(data);
        } else {
            deepLinkE = null;
        }
        if (deepLinkE != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f323376o;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLinkE, null, null, 6);
            return;
        }
        if (intent.hasExtra("key.verification_status_list_args")) {
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_status_list_args", VerificationStatusListArgs.class) : intent.getParcelableExtra("key.verification_status_list_args");
            VerificationStatusListFragment.f325745s0.getClass();
            VerificationStatusListFragment verificationStatusListFragment = new VerificationStatusListFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.verification_status_list_args", (VerificationStatusListArgs) parcelableExtra);
            verificationStatusListFragment.setArguments(bundle);
            b2(verificationStatusListFragment, "tag.verification_status_list", z12);
            return;
        }
        if (intent.hasExtra("key.verification_disclaimer_link")) {
            VerificationDisclaimerLink verificationDisclaimerLink = (VerificationDisclaimerLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_disclaimer_link", VerificationDisclaimerLink.class) : intent.getParcelableExtra("key.verification_disclaimer_link"));
            VerificationDisclaimerArgs verificationDisclaimerArgs = new VerificationDisclaimerArgs(verificationDisclaimerLink.f133839b, verificationDisclaimerLink.f133840c);
            VerificationDisclaimerFragment.f325020t0.getClass();
            VerificationDisclaimerFragment verificationDisclaimerFragment = new VerificationDisclaimerFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key.verification_disclaimer_args", verificationDisclaimerArgs);
            verificationDisclaimerFragment.setArguments(bundle2);
            b2(verificationDisclaimerFragment, "tag.verification_disclaimer", z12);
            return;
        }
        if (intent.hasExtra("key.verification_finish_link")) {
            Parcelable parcelableExtra2 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_finish_link", VerificationFinishArgs.class) : intent.getParcelableExtra("key.verification_finish_link");
            VerificationFinishFragment.f325228r0.getClass();
            VerificationFinishFragment verificationFinishFragment = new VerificationFinishFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("key.verification_finish_args", (VerificationFinishArgs) parcelableExtra2);
            verificationFinishFragment.setArguments(bundle3);
            b2(verificationFinishFragment, "tag.verification_finish", z12);
            return;
        }
        if (intent.hasExtra("key.verification_inn_link")) {
            VerificationInputInnArgs verificationInputInnArgs = new VerificationInputInnArgs(((VerificationInputInnLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_inn_link", VerificationInputInnLink.class) : intent.getParcelableExtra("key.verification_inn_link"))).f133844b);
            VerificationInputInnFragment.f325594s0.getClass();
            VerificationInputInnFragment verificationInputInnFragment = new VerificationInputInnFragment();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("key.verification_input_inn_args", verificationInputInnArgs);
            verificationInputInnFragment.setArguments(bundle4);
            b2(verificationInputInnFragment, "tag.verification_input_inn", z12);
            return;
        }
        if (intent.hasExtra("key.verification_input_bill_amount")) {
            VerificationInputBillAmountArgs verificationInputBillAmountArgs = new VerificationInputBillAmountArgs(((VerificationInputBillAmountLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_input_bill_amount", VerificationInputBillAmountLink.class) : intent.getParcelableExtra("key.verification_input_bill_amount"))).f133843b);
            VerificationInputBillAmountFragment.f325483t0.getClass();
            VerificationInputBillAmountFragment verificationInputBillAmountFragment = new VerificationInputBillAmountFragment();
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable("key.verification_input_bill_amount_args", verificationInputBillAmountArgs);
            verificationInputBillAmountFragment.setArguments(bundle5);
            b2(verificationInputBillAmountFragment, "tag.verification_input_bill_amount", z12);
            return;
        }
        if (intent.hasExtra("key.verification_confirm_requisites_link")) {
            VerificationConfirmRequisitesArgs verificationConfirmRequisitesArgs = new VerificationConfirmRequisitesArgs(((VerificationConfirmRequisitesLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_confirm_requisites_link", VerificationConfirmRequisitesLink.class) : intent.getParcelableExtra("key.verification_confirm_requisites_link"))).f133838b);
            VerificationConfirmRequisitesFragment.f324891t0.getClass();
            VerificationConfirmRequisitesFragment verificationConfirmRequisitesFragment = new VerificationConfirmRequisitesFragment();
            Bundle bundle6 = new Bundle();
            bundle6.putParcelable("key.verification_confirm_requisites_args", verificationConfirmRequisitesArgs);
            verificationConfirmRequisitesFragment.setArguments(bundle6);
            b2(verificationConfirmRequisitesFragment, "tag.verification_confirm_requisites", z12);
            return;
        }
        if (intent.hasExtra("key.verification_fetch_invoice_link")) {
            VerificationFetchInvoiceArgs verificationFetchInvoiceArgs = new VerificationFetchInvoiceArgs(((VerificationFetchInvoiceLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_fetch_invoice_link", VerificationFetchInvoiceLink.class) : intent.getParcelableExtra("key.verification_fetch_invoice_link"))).f133841b);
            VerificationFetchInvoiceFragment.f325132t0.getClass();
            VerificationFetchInvoiceFragment verificationFetchInvoiceFragment = new VerificationFetchInvoiceFragment();
            Bundle bundle7 = new Bundle();
            bundle7.putParcelable("key.verification_fetch_invoice_args", verificationFetchInvoiceArgs);
            verificationFetchInvoiceFragment.setArguments(bundle7);
            b2(verificationFetchInvoiceFragment, "tag.verification_fetch_invoice", z12);
            return;
        }
        if (intent.hasExtra("key.verification_form_builder_link")) {
            FormBuilderArgs formBuilderArgs = new FormBuilderArgs(((VerificationFormBuilderLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.verification_form_builder_link", VerificationFormBuilderLink.class) : intent.getParcelableExtra("key.verification_form_builder_link"))).f325373b);
            FormBuilderFragment.f325335u0.getClass();
            FormBuilderFragment formBuilderFragment = new FormBuilderFragment();
            Bundle bundle8 = new Bundle();
            bundle8.putParcelable("key.verification_form_builder_args", formBuilderArgs);
            formBuilderFragment.setArguments(bundle8);
            b2(formBuilderFragment, "tag.verification_form_builder", z12);
            return;
        }
        if (intent.hasExtra("key.profile_create_extended_link")) {
            ProfileCreateExtendedLink profileCreateExtendedLink = (ProfileCreateExtendedLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.profile_create_extended_link", ProfileCreateExtendedLink.class) : intent.getParcelableExtra("key.profile_create_extended_link"));
            P1 p12 = this.f323378q;
            b2((p12 != null ? p12 : null).a(profileCreateExtendedLink), "TAG_PROFILE_CREATE_EXTENDED", z12);
        } else {
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f323376o;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, new VerificationsListLinkOld(), null, null, 6);
        }
    }

    public final void b2(Fragment fragment, String str, boolean z12) {
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, fragment, str);
        if (z12) {
            hE2.c(str);
        }
        hE2.e();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> listP = getSupportFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (obj instanceof com.avito.android.ui.fragments.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.avito.android.ui.fragments.c) it.next()).i0()) {
                return;
            }
        }
        if (isTaskRoot() && getSupportFragmentManager().L() == 0) {
            Intent intent = this.f304538c;
            if (intent == null) {
                L l12 = this.f323374m;
                if (l12 == null) {
                    l12 = null;
                }
                startActivity(L.a.a(l12, null, 3));
            } else {
                startActivity(intent);
            }
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a2(getIntent(), false);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        a2(intent, true);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void startActivityForResult(@k Intent intent, int i12, @l Bundle bundle) {
        ComponentName component = intent.getComponent();
        if (kotlin.jvm.internal.L.f(component != null ? component.getClassName() : null, VerificationActivity.class.getName())) {
            P p12 = this.f323377p;
            if (p12 == null) {
                p12 = null;
            }
            p12.getClass();
            n<Object> nVar = P.f67370w0[66];
            if (!((Boolean) p12.f67396Z.a().invoke()).booleanValue()) {
                onNewIntent(intent);
                onActivityResult(i12, -1, null);
                return;
            }
        }
        super.startActivityForResult(intent, i12, bundle);
    }
}
