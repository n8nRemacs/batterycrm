package com.avito.android.publish.drafts;

import Zd0.C19544b;
import ae0.C19878c;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.view.InterfaceC23487e;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.DialogWithDeeplinkActions;
import com.avito.android.publish.drafts.di.c;
import com.avito.android.util.NotFoundException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDraftAvailableDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/drafts/PublishDraftAvailableDialog;", "Lcom/avito/android/dialog/DialogWithDeeplinkActions;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishDraftAvailableDialog extends DialogWithDeeplinkActions implements InterfaceC28477j.b {

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f235328m0 = new a(null);

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public C19544b f235329j0;

    /* renamed from: k0, reason: collision with root package name */
    public r f235330k0;

    /* renamed from: l0, reason: collision with root package name */
    public String f235331l0;

    /* compiled from: PublishDraftAvailableDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/drafts/PublishDraftAvailableDialog$a;", "", "<init>", "()V", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.dialog.DialogWithDeeplinkActions
    public final void h5() {
        g5(null, null);
        r rVar = this.f235330k0;
        (rVar != null ? rVar : null).b1();
    }

    @Override // com.avito.android.dialog.DialogWithDeeplinkActions
    public final boolean i5(@Y61.k DeepLink deepLink) {
        if (!(deepLink instanceof AdvertPublicationLink)) {
            return false;
        }
        r rVar = this.f235330k0;
        if (rVar == null) {
            rVar = null;
        }
        rVar.o1();
        return true;
    }

    @Override // com.avito.android.dialog.DialogWithDeeplinkActions
    public final void j5() {
        C19544b c19544b = this.f235329j0;
        if (c19544b == null) {
            c19544b = null;
        }
        String str = this.f235331l0;
        String str2 = str != null ? str : null;
        c19544b.getClass();
        c19544b.f20317a.c(new C19878c(new Q("esid", str2)));
    }

    @Override // com.avito.android.dialog.DialogWithDeeplinkActions
    public final void k5() {
        c.a aVarA = com.avito.android.publish.drafts.di.b.a();
        aVarA.a((com.avito.android.publish.drafts.di.f) C29972i.a(C29972i.b(this), com.avito.android.publish.drafts.di.f.class));
        aVarA.build().b(this);
    }

    @Override // com.avito.android.dialog.DialogWithDeeplinkActions, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        r rVar = this.f235330k0;
        if (rVar == null) {
            rVar = null;
        }
        rVar.b1();
    }

    @Override // com.avito.android.dialog.DialogWithDeeplinkActions, com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) throws NotFoundException {
        r rVar;
        super.onCreate(bundle);
        if (getParentFragment() != null) {
            InterfaceC23487e parentFragment = getParentFragment();
            rVar = parentFragment instanceof r ? (r) parentFragment : null;
            if (rVar == null) {
                throw new ClassCastException();
            }
        } else {
            androidx.core.content.j jVarL1 = l1();
            rVar = jVarL1 instanceof r ? (r) jVarL1 : null;
            if (rVar == null) {
                throw new ClassCastException();
            }
        }
        this.f235330k0 = rVar;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_session_id") : null;
        if (string == null) {
            throw new NotFoundException("key_session_id", (Throwable) null, 2, (C42822w) null);
        }
        this.f235331l0 = string;
    }
}
