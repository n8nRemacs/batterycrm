package com.avito.android.work_profile.profile.gig.ui.list.title_item;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.header_button.HeaderButton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigTitleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/title_item/c;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f331250g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f331251b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f331252c;

    /* renamed from: d, reason: collision with root package name */
    public final HeaderButton f331253d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f331254e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f331255f;

    public c(@k View view) {
        super(view);
        this.f331251b = (ViewGroup) view.findViewById(R.id.title_root);
        this.f331252c = (TextView) view.findViewById(R.id.title);
        this.f331253d = (HeaderButton) view.findViewById(R.id.click_marker);
        this.f331254e = (TextView) view.findViewById(R.id.subtitle);
        this.f331255f = (Button) view.findViewById(R.id.title_button);
    }
}
