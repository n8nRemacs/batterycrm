package E40;

import A91.p;
import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingPreviewView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE40/g;", "LE40/f;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f3754a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D40.a f3755b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f3756c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<C40.a, G0> f3757d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f3758e;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k View view, @k D40.a aVar, @k com.avito.android.util.text.a aVar2, @k l<? super C40.a, G0> lVar) {
        this.f3754a = view;
        this.f3755b = aVar;
        this.f3756c = aVar2;
        this.f3757d = lVar;
        this.f3758e = (TextView) view.findViewById(R.id.title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.items_view);
        ImageView imageView = (ImageView) view.findViewById(R.id.close_button);
        recyclerView.setAdapter(aVar);
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        imageView.setOnClickListener(new p(this, 2));
    }
}
