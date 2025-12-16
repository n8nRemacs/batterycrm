package com.avito.android.beduin.context;

import Y41.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.view.C23034e0;
import com.avito.android.beduin.common.action.BeduinContentPlaceholderAction;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinContextImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<BeduinContentPlaceholderAction.Show, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23034e0<com.avito.android.beduin_shared.model.progress_overlay.b> f103888l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f103889m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f103890n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C23034e0<com.avito.android.beduin_shared.model.progress_overlay.b> c23034e0, Context context, c cVar) {
        super(1);
        this.f103888l = c23034e0;
        this.f103889m = context;
        this.f103890n = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinContentPlaceholderAction.Show show) {
        BeduinContentPlaceholderAction.Show show2 = show;
        String title = show2.getTitle();
        String subtitle = show2.getSubtitle();
        Drawable drawableC = v.c(this.f103889m, show2.getImage(), null);
        BeduinContentPlaceholderAction.Show.Button button = show2.getButton();
        b.a.C3147a c3147a = button != null ? new b.a.C3147a(button.getTitle(), new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(27, this.f103890n, button)) : null;
        BeduinComponentTheme theme = show2.getTheme();
        this.f103888l.setValue(new b.a(title, subtitle, drawableC, c3147a, theme != null ? Integer.valueOf(theme.f100608b) : null));
        return G0.f406611a;
    }
}
