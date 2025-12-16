package U9;

import Y61.k;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.advert_core.specifications.SpecificationView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpecificationsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU9/g;", "LU9/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f16229a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Toolbar f16230b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f16231c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SpecificationView f16232d;

    public g(@k Y41.a aVar, @k View view) {
        View viewFindViewById = view.findViewById(R.id.scroll_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f16229a = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.toolbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById2;
        this.f16230b = toolbar;
        this.f16231c = view.findViewById(R.id.toolbar_shadow);
        View viewFindViewById3 = view.findViewById(R.id.specifications);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert_core.specifications.SpecificationView");
        }
        this.f16232d = (SpecificationView) viewFindViewById3;
        toolbar.setNavigationOnClickListener(new Ae0.b(21, aVar));
        viewFindViewById.getViewTreeObserver().addOnScrollChangedListener(new f(this, 0));
    }
}
