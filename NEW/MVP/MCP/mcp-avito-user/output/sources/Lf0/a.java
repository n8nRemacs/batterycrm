package LF0;

import JF0.e;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: TrxPromoGoodsConfigureMapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLF0/a;", "", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @k
    LocalDate a(@k e.b bVar, boolean z12);

    @l
    String b(@k LocalDate localDate);

    @k
    Q<ButtonAction, ButtonAction> c(@k e.b bVar, boolean z12);

    float d(@k e.b bVar, boolean z12);

    int e(@k e.b bVar, float f12);

    @l
    AttributedText f(@k e.b bVar, boolean z12);

    @k
    ArrayList g(@k e.b bVar, boolean z12, @l Float f12, @l LocalDate localDate);
}
