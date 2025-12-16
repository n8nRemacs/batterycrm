package com.avito.android.cv_validation_bottom_sheet.list;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.design.State;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CvItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/list/f;", "Lcom/avito/android/cv_validation_bottom_sheet/list/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f131865f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f131866b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f131867c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f131868d;

    /* renamed from: e, reason: collision with root package name */
    public final Avatar f131869e;

    public f(@k View view) {
        super(view);
        this.f131866b = view;
        this.f131867c = (TextView) view.findViewById(R.id.title);
        this.f131868d = (TextView) view.findViewById(R.id.description);
        this.f131869e = (Avatar) view.findViewById(R.id.avatar);
    }

    @Override // com.avito.android.cv_validation_bottom_sheet.list.e
    public final void b(@k String str) {
        I5.a(this.f131867c, str, false);
    }

    @Override // com.avito.android.cv_validation_bottom_sheet.list.e
    public final void n(@k String str) {
        I5.a(this.f131868d, str, false);
    }

    @Override // com.avito.android.cv_validation_bottom_sheet.list.e
    public final void x10(@k CvItem cvItem, @k l<? super CvItem, G0> lVar) {
        this.f131866b.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(7, lVar, cvItem));
    }

    @Override // com.avito.android.cv_validation_bottom_sheet.list.e
    public final void z1(@Y61.l Image image) {
        Avatar avatar = this.f131869e;
        if (image == null) {
            avatar.setState(State.f135880d);
            return;
        }
        Uri uriD = C35829k2.c(image, avatar, 2, 22).d();
        if (uriD != null) {
            s.c(avatar, uriD, true, null, null);
        }
    }
}
