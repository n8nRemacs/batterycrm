package com.avito.android.services_onboarding;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesOnboardingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServicesOnboardingFragment f279933l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ServicesOnboardingFragment servicesOnboardingFragment) {
        super(1);
        this.f279933l = servicesOnboardingFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageDrawable(null);
        ServicesOnboardingFragment servicesOnboardingFragment = this.f279933l;
        contentPlaceholder2.setTitle(servicesOnboardingFragment.getString(R.string.error_layout_unknown_error));
        contentPlaceholder2.setSubtitle(servicesOnboardingFragment.getString(R.string.error_layout_try_refresh));
        contentPlaceholder2.setButtonTitle(servicesOnboardingFragment.getString(R.string.error_layout_refresh));
        return G0.f406611a;
    }
}
