package com.avito.android.credits.installments;

import Y41.l;
import Y61.k;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.credits.installments.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.credit_broker.ActionText;
import com.avito.android.remote.model.credit_broker.InstallmentsFloatingView;
import com.avito.android.remote.model.credit_broker.InstallmentsImage;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.remote.model.credit_broker.Toggle;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsStickyBlockFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/installments/b;", "", "<init>", "()V", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* compiled from: InstallmentsStickyBlockFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InstallmentsFloatingView f128864l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ H f128865m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InstallmentsFloatingView installmentsFloatingView, l<? super com.avito.android.credits.installments.a, G0> lVar) {
            super(0);
            this.f128864l = installmentsFloatingView;
            this.f128865m = (H) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = ((ActionText) this.f128864l).getDeepLink();
            if (deepLink != null) {
                this.f128865m.invoke(new a.b(deepLink));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsStickyBlockFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.credits.installments.b$b, reason: collision with other inner class name */
    public static final class C3821b extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H f128866l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3821b(l<? super com.avito.android.credits.installments.a, G0> lVar) {
            super(1);
            this.f128866l = (H) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            this.f128866l.invoke(new a.c(bool.booleanValue()));
            return G0.f406611a;
        }
    }

    @Inject
    public b() {
    }

    @k
    public static List a(@k LoanTerms.Term term, @k l lVar) {
        Object installmentsActionToggle;
        InstallmentsFloatingView floatingView = term.getFloatingView();
        if (floatingView == null) {
            return C42784z0.f406748b;
        }
        if (floatingView instanceof ActionText) {
            ActionText actionText = (ActionText) floatingView;
            installmentsActionToggle = new ContactBar.InfoStickyBlock.InstallmentsActionText(null, actionText.getImage(), actionText.getTitle(), actionText.getActionAttributedText(), new a(floatingView, lVar), 1, null);
        } else {
            if (!(floatingView instanceof Toggle)) {
                throw new NoWhenBranchMatchedException();
            }
            Toggle toggle = (Toggle) floatingView;
            InstallmentsImage image = toggle.getImage();
            AttributedText title = toggle.getTitle();
            Boolean isChecked = toggle.getIsChecked();
            installmentsActionToggle = new ContactBar.InfoStickyBlock.InstallmentsActionToggle(null, image, title, isChecked != null ? isChecked.booleanValue() : false, toggle.getSubmitButtonTitle(), toggle.getSubmitButtonDeeplink(), new C3821b(lVar), 1, null);
        }
        return Collections.singletonList(installmentsActionToggle);
    }
}
