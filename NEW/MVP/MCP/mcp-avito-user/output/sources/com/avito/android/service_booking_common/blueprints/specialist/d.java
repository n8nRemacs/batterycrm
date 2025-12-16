package com.avito.android.service_booking_common.blueprints.specialist;

import Y61.k;
import android.content.res.Resources;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.service_booking_calendar.flexible.header.toolbar.g;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import qt0.j;

/* compiled from: SbSpecialistItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/specialist/d;", "Lcom/avito/android/service_booking_common/blueprints/specialist/c;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f276487b = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        j jVar = (j) aVar;
        I5.a(fVar.f276490c, jVar.f429458f, false);
        I5.a(fVar.f276491d, jVar.f429459g, false);
        SimpleDraweeView simpleDraweeView = fVar.f276492e;
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        View view = fVar.f276489b;
        Resources resources = view.getResources();
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        aVarA.f169492j = resources.getDrawable(R.drawable.sb_specialist_placeholder, null);
        aVarA.f169493k = null;
        aVarA.f169485c = Integer.valueOf(R.drawable.sb_specialist_placeholder);
        Uri uri = jVar.f429457e;
        if (uri == null) {
            aVarA.b();
        } else {
            aVarA.f(uri);
            aVarA.c();
        }
        String str = jVar.f429460h;
        TextView textView = fVar.f276494g;
        ImageView imageView = fVar.f276493f;
        if (str == null) {
            D6.w(imageView);
            D6.w(textView);
        } else {
            Integer num = jVar.f429461i;
            I5.a(textView, view.getResources().getString(R.string.sb_rating_and_reviews, str, num != null ? view.getResources().getQuantityString(R.plurals.reviews, num.intValue(), num) : ""), false);
            D6.H(imageView);
        }
        if (jVar.f429455c) {
            view.setOnClickListener(new g(5, this, jVar));
            view.setClickable(true);
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    @Override // com.avito.android.service_booking_common.blueprints.specialist.c
    @k
    /* renamed from: f, reason: from getter */
    public final e2 getF276487b() {
        return this.f276487b;
    }
}
