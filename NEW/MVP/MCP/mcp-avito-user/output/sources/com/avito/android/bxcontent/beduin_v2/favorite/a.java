package com.avito.android.bxcontent.beduin_v2.favorite;

import Y41.l;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BxFavoriteButtonComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f109520l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CheckableImageButton checkableImageButton) {
        super(1);
        this.f109520l = checkableImageButton;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        this.f109520l.setChecked(bool.booleanValue());
        return G0.f406611a;
    }
}
