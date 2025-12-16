package Eb;

import TV0.e;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advertising.ui.adstub.CommercialUnavailableView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialUnavailableViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LEb/a;", "LTV0/e;", "Lcom/avito/android/serp/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13469a extends com.avito.android.serp.c implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f4086b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f4087c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CommercialUnavailableView f4088d;

    public C13469a(@k View view) {
        super(view);
        this.f4086b = view;
        View viewFindViewById = view.findViewById(R.id.close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f4087c = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.unavailable_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advertising.ui.adstub.CommercialUnavailableView");
        }
        this.f4088d = (CommercialUnavailableView) viewFindViewById2;
    }
}
