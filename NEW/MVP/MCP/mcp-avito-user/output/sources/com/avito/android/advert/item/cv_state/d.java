package com.avito.android.advert.item.cv_state;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.InterfaceC28130g0;
import com.avito.android.remote.cv_state.CvState;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCvStatePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/cv_state/d;", "Lcom/avito/android/advert/item/cv_state/c;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public InterfaceC28130g0 f75065b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDateFormat f75066c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f75067d;

    /* compiled from: AdvertCvStatePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/cv_state/d$a;", "", "<init>", "()V", "", "DATE_PATTERN", "Ljava/lang/String;", "UTC_TIMEZONE_ID", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(context.getString(R.string.advert_details_cv_state_updated_at_text, "d MMMM yyyy"), new Locale("ru", "RU"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f75066c = simpleDateFormat;
        this.f75067d = context.getString(R.string.advert_details_cv_state_change_button);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        CvStateType currentState;
        String title;
        String subtitle;
        String updatedAt;
        CvStateType currentState2;
        g gVar = (g) eVar;
        AdvertCvStateItem advertCvStateItem = (AdvertCvStateItem) aVar;
        InterfaceC28130g0 interfaceC28130g0 = this.f75065b;
        if (interfaceC28130g0 == null) {
            return;
        }
        boolean z12 = advertCvStateItem.f75057e;
        CvState cvState = advertCvStateItem.f75056d;
        if (z12 || (currentState = cvState.getCurrentState()) == null || (title = currentState.getTitle()) == null) {
            title = cvState.getTitle();
        }
        if (z12) {
            CvStateType currentState3 = cvState.getCurrentState();
            if (currentState3 == null || (subtitle = currentState3.getSubtitleOnChange()) == null) {
                subtitle = cvState.getSubtitle();
            }
        } else {
            CvStateType currentState4 = cvState.getCurrentState();
            subtitle = (currentState4 == null || (updatedAt = currentState4.getUpdatedAt()) == null) ? null : this.f75066c.format(Long.valueOf(TimeUnit.SECONDS.toMillis(Long.parseLong(updatedAt))));
            if (subtitle == null) {
                subtitle = cvState.getSubtitle();
            }
        }
        List<CvStateType> listD = (z12 || (currentState2 = cvState.getCurrentState()) == null) ? cvState.d() : Collections.singletonList(new CvStateType(DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME, currentState2.getSlug(), currentState2.getUpdatedAt(), this.f75067d, currentState2.getSubtitleOnChange()));
        gVar.rW(title, subtitle, listD, new e(interfaceC28130g0));
    }

    @Override // com.avito.android.advert.item.cv_state.c
    public final void l3(@l InterfaceC28130g0 interfaceC28130g0) {
        this.f75065b = interfaceC28130g0;
    }
}
