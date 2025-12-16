package com.avito.android.service_booking_calendar.flexible.content;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CalendarContentStateRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f275640l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gt0.d f275641m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gt0.d dVar) {
        super(1);
        this.f275640l = gVar;
        this.f275641m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageDrawable(null);
        g gVar = this.f275640l;
        contentPlaceholder2.setTitle(gVar.f275644a.getContext().getString(R.string.sb_calendar_default_error_title));
        PrintableText printableText = this.f275641m.f396923b;
        View view = gVar.f275644a;
        contentPlaceholder2.setSubtitle(printableText.k0(view.getContext()));
        contentPlaceholder2.setButtonTitle(view.getContext().getString(R.string.error_layout_refresh));
        return G0.f406611a;
    }
}
