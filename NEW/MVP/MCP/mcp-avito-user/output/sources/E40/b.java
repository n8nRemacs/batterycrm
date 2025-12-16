package E40;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingPreviewItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE40/b;", "LE40/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f3742a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f3743b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<C40.a, G0> f3744c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f3745d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f3746e;

    public b(@k l lVar, @k View view, @k com.avito.android.util.text.a aVar) {
        this.f3742a = view;
        this.f3743b = aVar;
        this.f3744c = lVar;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f3745d = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f3746e = (TextView) viewFindViewById2;
    }
}
