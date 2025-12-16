package com.avito.android.service_booking.mvi.step;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceBookingMviStepRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class H extends kotlin.jvm.internal.N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34912f f274435l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f274436m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C34912f c34912f, String str) {
        super(1);
        this.f274435l = c34912f;
        this.f274436m = str;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageDrawable(null);
        C34912f c34912f = this.f274435l;
        contentPlaceholder2.setTitle(c34912f.f274639a.getContext().getString(R.string.sb_default_error_title));
        contentPlaceholder2.setSubtitle(this.f274436m);
        contentPlaceholder2.setButtonTitle(c34912f.f274639a.getContext().getString(R.string.error_layout_refresh));
        return G0.f406611a;
    }
}
