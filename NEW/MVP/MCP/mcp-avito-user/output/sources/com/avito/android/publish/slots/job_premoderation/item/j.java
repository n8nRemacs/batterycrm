package com.avito.android.publish.slots.job_premoderation.item;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: JobPremoderationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/job_premoderation/item/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/job_premoderation/item/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f244452j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f244453b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Banner f244454c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f244455d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f244456e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f244457f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f244458g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f244459h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f244460i;

    public j(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f244453b = aVar;
        View viewFindViewById = this.itemView.findViewById(R.id.job_premoderation_banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f244454c = (Banner) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244455d = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.vacancy_header);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244456e = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.vacancy_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f244457f = viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(R.id.vacancy_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244458g = (TextView) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(R.id.vacancy_salary);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244459h = (TextView) viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(R.id.vacancy_additional_info);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f244460i = (TextView) viewFindViewById7;
    }

    @Override // com.avito.android.publish.slots.job_premoderation.item.i
    public final void Lx(@Y61.k a aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f244454c.setTitle(aVar.f244435a);
        com.avito.android.util.text.j.a(this.f244455d, aVar.f244436b, this.f244453b);
        I5.a(this.f244456e, aVar.f244437c, false);
        I5.a(this.f244458g, aVar.f244438d, false);
        I5.a(this.f244459h, aVar.f244439e, false);
        I5.a(this.f244460i, C42745f0.O(aVar.f244440f, " · ", null, null, null, 62), false);
        this.f244457f.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(5, aVar2));
    }
}
