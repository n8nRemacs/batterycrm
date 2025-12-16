package U9;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BlockView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LU9/a;", "", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f16218a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f16219b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f16220c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f16221d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f16222e;

    /* compiled from: BlockView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU9/a$a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: U9.a$a, reason: collision with other inner class name */
    public static final class C1103a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f16223a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextView f16224b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextView f16225c;

        public C1103a(@k View view) {
            this.f16223a = view;
            View viewFindViewById = view.findViewById(R.id.title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f16224b = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.value);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f16225c = (TextView) viewFindViewById2;
        }
    }

    public a(@k View view) {
        this.f16218a = view.getResources().getDimensionPixelOffset(R.dimen.rds_column_offset);
        View viewFindViewById = view.findViewById(R.id.block_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f16219b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.block_params_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f16220c = (LinearLayout) viewFindViewById2;
        this.f16221d = LayoutInflater.from(view.getContext());
        this.f16222e = new ArrayList();
    }
}
