package vw;

import Y41.l;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: GenerateApplyFiltersButtonTextUseCase.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lvw/a;", "Lkotlin/Function1;", "", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49387a implements l<Integer, String> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f441047b;

    @Inject
    public C49387a(@k Context context) {
        this.f441047b = context;
    }

    @k
    public final String a(int i12) {
        Context context = this.f441047b;
        return context.getResources().getQuantityString(R.plurals.developments_agency_search_big_filters_apply_button_third_part, Math.min(1000, i12), i12 < 1000 ? String.valueOf(i12) : i12 < 1000000 ? context.getString(R.string.developments_agency_search_x_thousands_short, Integer.valueOf(i12 / 1000)) : i12 < 1000000000 ? context.getString(R.string.developments_agency_search_x_millions_short, Integer.valueOf(i12 / 1000000)) : context.getString(R.string.developments_agency_search_x_billions_short, Integer.valueOf(i12 / Http2Connection.DEGRADED_PONG_TIMEOUT_NS)));
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ String invoke(Integer num) {
        return a(num.intValue());
    }
}
