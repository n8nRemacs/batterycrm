package com.avito.android.beduin.context;

import Y41.l;
import androidx.view.C23034e0;
import com.avito.android.beduin.common.action.BeduinContentPlaceholderAction;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinContextImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Hide;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Hide;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<BeduinContentPlaceholderAction.Hide, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23034e0<com.avito.android.beduin_shared.model.progress_overlay.b> f103579l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C23034e0<com.avito.android.beduin_shared.model.progress_overlay.b> c23034e0) {
        super(1);
        this.f103579l = c23034e0;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinContentPlaceholderAction.Hide hide) {
        this.f103579l.setValue(b.C3148b.f105322a);
        return G0.f406611a;
    }
}
