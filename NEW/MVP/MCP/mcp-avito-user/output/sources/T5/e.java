package T5;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LeasingTermView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT5/e;", "LT5/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f15359a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f15360b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f15361c;

    public e(@k View view) {
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f15359a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.value);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f15360b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tooltip_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f15361c = (ImageView) viewFindViewById3;
    }
}
