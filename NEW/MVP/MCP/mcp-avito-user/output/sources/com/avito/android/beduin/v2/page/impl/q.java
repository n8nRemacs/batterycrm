package com.avito.android.beduin.v2.page.impl;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2PageFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f105142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Y41.a<G0> aVar) {
        super(1);
        this.f105142l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.error_layout_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_try_refresh_or_return_later, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_refresh, new Serializable[0]), new com.avito.android.advert.item.compatibility.v2.m(12, new p(this.f105142l))));
        return G0.f406611a;
    }
}
