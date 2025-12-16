package com.avito.android.select.sectioned_multiselect.core;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectCoreView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.sectioned_multiselect.core.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34657g extends kotlin.jvm.internal.N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.select.e f266665l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34656f f266666m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34657g(com.avito.android.select.e eVar, C34656f c34656f) {
        super(1);
        this.f266665l = eVar;
        this.f266666m = c34656f;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        Context context = contentPlaceholder2.getContext();
        com.avito.android.select.e eVar = this.f266665l;
        contentPlaceholder2.setTitle(context.getString(eVar.f265381b));
        contentPlaceholder2.setSubtitle(contentPlaceholder2.getContext().getString(eVar.f265382c));
        contentPlaceholder2.setImageDrawable(C35835l0.h(eVar.f265380a, contentPlaceholder2.getContext()));
        contentPlaceholder2.setButtonTitle(this.f266666m.f266640a.getContext().getString(R.string.pagination_error_action));
        return G0.f406611a;
    }
}
