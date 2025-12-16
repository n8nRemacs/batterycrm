package com.avito.android.developments_agency_search.screen.deal_room;

import android.content.Context;
import android.text.SpannableString;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DealRoomFormatter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/i;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f137560a;

    /* compiled from: DealRoomFormatter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/j$a;", "", "<init>", "()V", "", "MAIN_INFO_ITEMS_SEPARATOR", "Ljava/lang/String;", "REVENUE_AMOUNT_PREFIX", "REWARDS_ITEMS_SEPARATOR", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public j(@Y61.k Context context) {
        this.f137560a = context;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.i
    @Y61.k
    public final String a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        return C42745f0.O(C42745f0.U(str, str2, str3, str4), " · ", null, null, null, 62);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.i
    @Y61.l
    public final SpannableString b(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, boolean z12) {
        if (z12) {
            return null;
        }
        SpannableString spannableString = new SpannableString(C42745f0.O(C42756l.B(new String[]{str, str2}), "  ·  ", null, null, null, 62));
        if (str != null) {
            spannableString.setSpan(Ow.c.a(this.f137560a, R.attr.textH50, str3, R.attr.green700, null, 16), 0, str.length(), 17);
        }
        return spannableString;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.i
    @Y61.k
    public final String c(@Y61.l String str) {
        return str == null ? "" : "+".concat(str);
    }
}
