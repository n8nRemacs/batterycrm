package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonsSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class f extends N implements Y41.a<View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f193838l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar) {
        super(0);
        this.f193838l = mVar;
    }

    @Override // Y41.a
    public final View invoke() {
        return this.f193838l.h().findViewById(R.id.platform_buttons_sheet_close_button);
    }
}
