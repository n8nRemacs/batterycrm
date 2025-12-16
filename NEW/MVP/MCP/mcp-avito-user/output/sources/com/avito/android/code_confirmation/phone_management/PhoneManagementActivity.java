package com.avito.android.code_confirmation.phone_management;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.C29388a;
import com.avito.android.code_confirmation.code_confirmation.InterfaceC29390c;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.code_confirmation.phone_management.di.b;
import com.avito.android.code_confirmation.phone_management.j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.util.G;
import cv.InterfaceC39417a;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneManagementActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/PhoneManagementActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/code_confirmation/phone_management/j$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PhoneManagementActivity extends com.avito.android.ui.activity.a implements j.a, InterfaceC28477j.b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f119659p = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC29390c f119660m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public j f119661n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<com.avito.android.code_confirmation.code_confirmation.s0> f119662o = registerForActivityResult(new a(), new androidx.view.result.a() { // from class: com.avito.android.code_confirmation.phone_management.a
        @Override // androidx.view.result.a
        public final void a(Object obj) {
            String str = (String) obj;
            if (str == null) {
                int i12 = PhoneManagementActivity.f119659p;
                return;
            }
            j jVar = this.f119666b.f119661n;
            if (jVar == null) {
                jVar = null;
            }
            jVar.b(str);
        }
    });

    /* compiled from: PhoneManagementActivity.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/code_confirmation/phone_management/PhoneManagementActivity$a", "Li/a;", "Lcom/avito/android/code_confirmation/code_confirmation/s0;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC41201a<com.avito.android.code_confirmation.code_confirmation.s0, String> {
        public a() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, com.avito.android.code_confirmation.code_confirmation.s0 s0Var) {
            com.avito.android.code_confirmation.code_confirmation.s0 s0Var2 = s0Var;
            InterfaceC29390c interfaceC29390c = PhoneManagementActivity.this.f119660m;
            if (interfaceC29390c == null) {
                interfaceC29390c = null;
            }
            Intent intentB = interfaceC29390c.b(s0Var2);
            intentB.setFlags(603979776);
            return intentB;
        }

        @Override // i.AbstractC41201a
        public final String parseResult(int i12, Intent intent) {
            ConfirmedCodeInfo confirmedCodeInfoA;
            String str;
            if (i12 != -1) {
                return null;
            }
            if (intent == null || (confirmedCodeInfoA = C29388a.a(intent)) == null || (str = confirmedCodeInfoA.f119575b) == null) {
                throw new IllegalStateException("login must be specified");
            }
            return str;
        }
    }

    public final void a2(boolean z12) {
        setResult(z12 ? -1 : 0);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.code_confirmation.phone_management.di.a.a();
        com.avito.android.code_confirmation.phone_management.di.c cVar = (com.avito.android.code_confirmation.phone_management.di.c) C29972i.a(C29972i.b(this), com.avito.android.code_confirmation.phone_management.di.c.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        Intent intent = getIntent();
        int i12 = Build.VERSION.SDK_INT;
        CodeConfirmationSource codeConfirmationSource = (CodeConfirmationSource) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra(SearchParamsConverterKt.SOURCE, CodeConfirmationSource.class) : intent.getParcelableExtra(SearchParamsConverterKt.SOURCE));
        if (codeConfirmationSource == null) {
            codeConfirmationSource = CodeConfirmationSource.f92767o;
        }
        CodeConfirmationSource codeConfirmationSource2 = codeConfirmationSource;
        Resources resources = getResources();
        Intent intent2 = getIntent();
        PhoneManagementIntentFactory.CallSource callSource = (PhoneManagementIntentFactory.CallSource) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("call_source", PhoneManagementIntentFactory.CallSource.class) : intent2.getParcelableExtra("call_source"));
        if (callSource == null) {
            callSource = PhoneManagementIntentFactory.CallSource.Messenger.f119665b;
        }
        aVarA.a(cVar, interfaceC39417aA, resources, this, bundle != null ? G.a(bundle, "presenter_state") : null, callSource, codeConfirmationSource2).a(this);
        super.onCreate(bundle);
        setContentView(R.layout.code_confirmation_phone_management);
        E e12 = new E(findViewById(android.R.id.content));
        j jVar = this.f119661n;
        (jVar != null ? jVar : null).c(e12);
        Input input = e12.f119657g;
        input.v();
        input.q();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        j jVar = this.f119661n;
        if (jVar == null) {
            jVar = null;
        }
        jVar.e0();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j jVar = this.f119661n;
        if (jVar == null) {
            jVar = null;
        }
        G.c(bundle, "presenter_state", jVar.d0());
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        j jVar = this.f119661n;
        if (jVar == null) {
            jVar = null;
        }
        jVar.a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        j jVar = this.f119661n;
        if (jVar == null) {
            jVar = null;
        }
        jVar.c0();
        super.onStop();
    }
}
