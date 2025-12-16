package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonsSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class k extends N implements Y41.a<Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f193843l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(0);
        this.f193843l = mVar;
    }

    @Override // Y41.a
    public final Integer invoke() {
        View viewInflate = this.f193843l.f193845a.inflate(R.layout.messenger_platform_buttons_sheet_title, (ViewGroup) null);
        viewInflate.measure(0, 0);
        return Integer.valueOf(viewInflate.getMeasuredHeight());
    }
}
