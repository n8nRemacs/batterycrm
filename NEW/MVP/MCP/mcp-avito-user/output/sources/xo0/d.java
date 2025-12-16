package XO0;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoadingStateViewHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXO0/d;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends RecyclerView.C {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f18870d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final Spinner f18871b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f18872c;

    /* compiled from: LoadingStateViewHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXO0/d$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k Y41.a aVar, @k View view) {
        super(view);
        this.f18871b = (Spinner) view.findViewById(R.id.progress_bar);
        this.f18872c = (LinearLayout) view.findViewById(R.id.refresh);
        ((Button) view.findViewById(R.id.refresh_button)).setOnClickListener(new Ae0.b(22, aVar));
    }
}
