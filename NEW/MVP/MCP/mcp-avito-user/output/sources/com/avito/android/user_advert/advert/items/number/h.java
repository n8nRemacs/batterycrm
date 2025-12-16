package com.avito.android.user_advert.advert.items.number;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: MyAdvertNumberItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/number/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/number/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.date_time_formatter.b f309761b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f309762c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f309763d;

    public h(@k View view, @k com.avito.android.date_time_formatter.b bVar) {
        super(view);
        this.f309761b = bVar;
        this.f309762c = view.getResources();
        this.f309763d = (TextView) view;
    }

    @Override // com.avito.android.user_advert.advert.items.number.g
    public final void Tj(long j12, @k String str) throws Resources.NotFoundException {
        this.f309763d.setText(this.f309762c.getString(R.string.advert_core_advert_number_template, str, this.f309761b.a(Long.valueOf(j12), TimeUnit.SECONDS)));
    }

    @Override // com.avito.android.user_advert.advert.items.number.g
    public final void bI(@k String str) throws Resources.NotFoundException {
        this.f309763d.setText(this.f309762c.getString(R.string.draft_number_template, str));
    }
}
