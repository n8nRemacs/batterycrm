package Ca1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class k extends RecyclerView.Adapter {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2266c = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2266c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ((j) c12).f2265b.f1152b.setText((String) this.f2266c.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        View viewB = C0.b(viewGroup, R.layout.sdk_bio_list_item, null, false);
        TextView textView = (TextView) g2.d.a(viewB, R.id.tv_text);
        if (textView != null) {
            return new j(new B91.o((LinearLayout) viewB, textView));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewB.getResources().getResourceName(R.id.tv_text)));
    }
}
