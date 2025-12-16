package XO0;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BannerViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXO0/a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.C {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C1330a f18863e = new C1330a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f18864b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f18865c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f18866d;

    /* compiled from: BannerViewHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXO0/a$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: XO0.a$a, reason: collision with other inner class name */
    public static final class C1330a {
        public /* synthetic */ C1330a(C42822w c42822w) {
            this();
        }

        public C1330a() {
        }
    }

    public a(@k Y41.a aVar, @k View view) {
        super(view);
        this.f18864b = view;
        this.f18865c = aVar;
        this.f18866d = (TextView) view.findViewById(R.id.banner_text);
    }
}
