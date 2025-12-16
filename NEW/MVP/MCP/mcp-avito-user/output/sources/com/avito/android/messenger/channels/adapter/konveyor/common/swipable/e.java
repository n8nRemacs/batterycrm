package com.avito.android.messenger.channels.adapter.konveyor.common.swipable;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SwipableItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f186924l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view) {
        super(0);
        this.f186924l = view;
    }

    @Override // Y41.a
    public final View invoke() {
        return this.f186924l.findViewById(R.id.chat_list_element_right_view);
    }
}
