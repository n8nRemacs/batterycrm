package com.avito.android.service_booking_settings.work_hours;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingWorkHoursStateRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f277941l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar) {
        super(1);
        this.f277941l = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageDrawable(null);
        h hVar = this.f277941l;
        contentPlaceholder2.setTitle(hVar.f277935a.getContext().getString(R.string.service_booking_network_error_title));
        View view = hVar.f277935a;
        contentPlaceholder2.setSubtitle(view.getContext().getString(R.string.service_booking_network_error_message));
        contentPlaceholder2.setButtonTitle(view.getContext().getString(R.string.error_layout_refresh));
        return G0.f406611a;
    }
}
