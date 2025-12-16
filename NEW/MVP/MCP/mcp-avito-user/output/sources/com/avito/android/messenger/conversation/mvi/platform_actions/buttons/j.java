package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonsSheetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/spinner/Spinner;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class j extends N implements Y41.a<Spinner> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f193842l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar) {
        super(0);
        this.f193842l = mVar;
    }

    @Override // Y41.a
    public final Spinner invoke() {
        return (Spinner) this.f193842l.h().findViewById(R.id.platform_buttons_sheet_progress);
    }
}
