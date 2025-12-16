package com.avito.android.travel_onboarding.ui.items;

import android.text.TextUtils;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConditionItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.travel_onboarding.ui.items.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35261w extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f302441l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35261w(UniversalImage universalImage) {
        super(1);
        this.f302441l = universalImage;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        if (this.f302441l != null) {
            aVar2.setMaxLines(2);
        }
        aVar2.setEllipsize(TextUtils.TruncateAt.END);
        return G0.f406611a;
    }
}
