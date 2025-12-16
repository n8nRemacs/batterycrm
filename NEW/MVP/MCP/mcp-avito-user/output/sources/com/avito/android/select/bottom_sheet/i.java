package com.avito.android.select.bottom_sheet;

import android.content.Context;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.util.C35835l0;
import dq0.InterfaceC39780b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectBottomSheetMviView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39780b f265311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f265312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC39780b interfaceC39780b, g gVar) {
        super(1);
        this.f265311l = interfaceC39780b;
        this.f265312m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        Context context = contentPlaceholder2.getContext();
        InterfaceC39780b.c cVar = (InterfaceC39780b.c) this.f265311l;
        contentPlaceholder2.setTitle(context.getString(cVar.f394117a.f265381b));
        Context context2 = contentPlaceholder2.getContext();
        com.avito.android.select.e eVar = cVar.f394117a;
        contentPlaceholder2.setSubtitle(context2.getString(eVar.f265382c));
        contentPlaceholder2.setImageDrawable(C35835l0.h(eVar.f265380a, contentPlaceholder2.getContext()));
        contentPlaceholder2.setButtonTitle(this.f265312m.f265304p);
        return G0.f406611a;
    }
}
