package com.avito.android.messenger.conversation.mvi.platform_actions.buttons;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ButtonsStickyView.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/constraintlayout/widget/ConstraintLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class p extends N implements Y41.a<ConstraintLayout> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f193860l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar) {
        super(0);
        this.f193860l = sVar;
    }

    @Override // Y41.a
    public final ConstraintLayout invoke() {
        return (ConstraintLayout) this.f193860l.f193863a.inflate(R.layout.messenger_platform_buttons_sticky, (ViewGroup) null);
    }
}
