package com.avito.android.auto_reseller_contacts.spend_contact_dialog;

import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.remote.model.auto_contact_models.Counter;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35961v3;
import com.avito.android.util.D6;
import com.avito.android.util.N0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SpendContactDialogActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/spend_contact_dialog/SpendContactDialogActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SpendContactDialogActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f95792p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f95793m = C35961v3.a(this);

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public g f95794n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.modal.a f95795o;

    /* compiled from: SpendContactDialogActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/spend_contact_dialog/SpendContactDialogActivity$a;", "", "<init>", "()V", "", "CALL_LINK_KEY", "Ljava/lang/String;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.auto_reseller_contacts.spend_contact_dialog.di.a.a().a(a2()).a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    public final SpendContactOpenParams a2() {
        return (SpendContactOpenParams) this.f95793m.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this, new d(this, LayoutInflater.from(this).inflate(R.layout.spend_dialog_counter_view, (ViewGroup) null)));
        j jVar = new j(aVarC);
        g gVar = this.f95794n;
        g gVar2 = gVar != null ? gVar : null;
        gVar2.f95806b = jVar;
        Counter counter = gVar2.f95805a.f95796b.getCounter();
        if (counter == null) {
            j jVar2 = gVar2.f95806b;
            if (jVar2 != null) {
                D6.w(jVar2.f95811e);
            }
        } else {
            j jVar3 = gVar2.f95806b;
            if (jVar3 != null) {
                jVar3.f95808b.setText(counter.getTitle());
            }
            j jVar4 = gVar2.f95806b;
            if (jVar4 != null) {
                jVar4.f95810d.setText(counter.getDetails());
            }
            j jVar5 = gVar2.f95806b;
            if (jVar5 != null) {
                String progressColor = counter.getProgressColor();
                String progressBackground = counter.getProgressBackground();
                ProgressBar progressBar = jVar5.f95809c;
                progressBar.setProgress(counter.getPercents() / 100);
                Integer numA = com.avito.android.lib.util.e.a(progressColor);
                int iIntValue = numA != null ? numA.intValue() : 0;
                Context context = jVar5.f95807a;
                progressBar.setFillColor(C35835l0.d(iIntValue, context));
                Integer numA2 = com.avito.android.lib.util.e.a(progressBackground);
                progressBar.setEmptyColor(C35835l0.d(numA2 != null ? numA2.intValue() : 0, context));
            }
        }
        com.avito.android.lib.util.g.a(aVarC);
        this.f95795o = aVarC;
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.lib.design.modal.a aVar = this.f95795o;
        if (aVar != null) {
            N0.a(aVar);
        }
        g gVar = this.f95794n;
        if (gVar == null) {
            gVar = null;
        }
        gVar.f95806b = null;
    }
}
