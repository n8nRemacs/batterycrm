package IT0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.M;
import com.avito.beduin.v2.theme.k;
import kotlin.Metadata;

/* compiled from: ExceptionComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LIT0/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "LJT0/a;", "Landroid/widget/TextView;", "<init>", "()V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC36333c<JT0.a, TextView> {
    public a() {
        super(null, 1, null);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, k kVar, JT0.a aVar) {
        TextView textView = (TextView) view;
        textView.setText(aVar.f());
        M.a(textView, true);
        textView.setTextColor(-65536);
        textView.setBackground(new ColorDrawable(872401920));
        textView.setTextIsSelectable(true);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new AY0.a(viewGroup.getContext());
    }
}
