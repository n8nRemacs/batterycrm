package com.avito.android.recall_me_v2.domain.scenario;

import Y41.l;
import Y61.k;
import ae.C19873a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.j;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RecallMeCodeCheckScenarioBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me_v2/domain/scenario/a;", "Lcom/avito/android/code_check_public/e;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@com.avito.android.code_check_public.f
/* loaded from: classes16.dex */
public final class a extends com.avito.android.code_check_public.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d.b f252052b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c.b f252053c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f252054d;

    /* compiled from: RecallMeCodeCheckScenarioBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_check_public/model/Phone;", "phone", "Lkotlin/G0;", "invoke-597-hdM", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.recall_me_v2.domain.scenario.a$a, reason: collision with other inner class name */
    public static final class C7561a extends N implements l<Phone, G0> {
        public C7561a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Phone phone) {
            Phone phone2 = phone;
            String str = phone2 != null ? phone2.f119296b : null;
            if ((str != null ? Phone.a(str) : null) == null) {
                throw new IllegalArgumentException("Phone must be set for RecallMeCodeCheckScenarioBuilder!");
            }
            a.this.f252054d.c(new C19873a(Phone.b(str), CodeConfirmationSource.f92765m));
            return G0.f406611a;
        }
    }

    @Inject
    public a(@com.avito.android.code_check_public.g @k d.b bVar, @com.avito.android.code_check_public.g @k c.b bVar2, @k InterfaceC28373a interfaceC28373a) {
        this.f252052b = bVar;
        this.f252053c = bVar2;
        this.f252054d = interfaceC28373a;
    }

    @Override // com.avito.android.code_check_public.e
    @k
    public final com.avito.android.code_check_public.d a() {
        return new com.avito.android.code_check_public.d(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c("RecallMeConfirm", new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null), new C7561a(), new c.a(com.avito.android.printable_text.b.c(R.string.recall_me_code_check_code_title, new Serializable[0]), null, new c.d.b(com.avito.android.printable_text.b.c(R.string.recall_me_code_check_code_subtitle, new Serializable[0]), new j(R.dimen.recall_me_check_code_subtitle_margin_top)), com.avito.android.printable_text.b.c(R.string.recall_me_code_check_code_hint, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.recall_me_code_check_code_resend, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.recall_me_code_check_code_resend_timer, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.recall_me_code_check_code_action, new Serializable[0]), 18, null), this.f252053c, this.f252052b, null, null, 192, null), false, null, 6, null));
    }
}
