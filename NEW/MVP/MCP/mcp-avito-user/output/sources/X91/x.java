package X91;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class x extends RecyclerView.Adapter {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18764c = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f18764c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        v vVar = (v) this.f18764c.get(i12);
        B91.s sVar = ((w) c12).f18763b;
        sVar.f1164b.setImageDrawable(vVar.f18760a);
        sVar.f1166d.setText(vVar.f18762c);
        sVar.f1165c.setText(vVar.f18761b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        View viewB = C0.b(viewGroup, R.layout.sdk_bio_rv_item_step, viewGroup, false);
        int i13 = R.id.iv_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) g2.d.a(viewB, R.id.iv_icon);
        if (appCompatImageView != null) {
            i13 = R.id.tv_caption;
            TextView textView = (TextView) g2.d.a(viewB, R.id.tv_caption);
            if (textView != null) {
                i13 = R.id.tv_title;
                TextView textView2 = (TextView) g2.d.a(viewB, R.id.tv_title);
                if (textView2 != null) {
                    return new w(new B91.s((ConstraintLayout) viewB, appCompatImageView, textView, textView2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewB.getResources().getResourceName(i13)));
    }
}
