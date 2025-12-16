package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import android.content.res.Resources;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonsStickyView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class o extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Resources f193859l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Resources resources) {
        super(0);
        this.f193859l = resources;
    }

    @Override // Y41.a
    public final Integer invoke() {
        return Integer.valueOf(this.f193859l.getDimensionPixelSize(R.dimen.messenger_platform_actions_buttons_internal_margin_sticky));
    }
}
