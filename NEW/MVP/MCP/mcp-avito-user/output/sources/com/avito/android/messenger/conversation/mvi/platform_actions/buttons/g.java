package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import android.content.res.Resources;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonsSheetView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Resources f193839l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Resources resources) {
        super(0);
        this.f193839l = resources;
    }

    @Override // Y41.a
    public final String invoke() {
        return this.f193839l.getString(R.string.messenger_context_actions_default_title_for_sheet);
    }
}
