package ya0;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import kotlin.Metadata;

/* compiled from: RecommendationSnippetView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lya0/b;", "Lya0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ya0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C50204b implements InterfaceC50203a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f443183a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f443184b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f443185c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f443186d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f443187e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final StrikethroughTextView f443188f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f443189g;

    public C50204b(@k View view, @k com.avito.android.util.text.a aVar) {
        this.f443183a = aVar;
        this.f443184b = view;
        this.f443185c = (ImageView) view.findViewById(R.id.snippet_image);
        this.f443186d = (TextView) view.findViewById(R.id.title);
        this.f443187e = (TextView) view.findViewById(R.id.price);
        this.f443188f = (StrikethroughTextView) view.findViewById(R.id.old_price);
        this.f443189g = (TextView) view.findViewById(R.id.additional_info);
    }
}
