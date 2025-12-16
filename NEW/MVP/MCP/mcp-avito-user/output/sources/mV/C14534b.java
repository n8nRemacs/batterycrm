package Mv;

import androidx.appcompat.app.r;
import com.avito.android.util.C35755b0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EventErrorTextMapper.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LMv/b;", "LMv/a;", "<init>", "()V", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: Mv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14534b implements InterfaceC14533a {

    /* compiled from: EventErrorTextMapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"LMv/b$a;", "", "<init>", "()V", "", "CUSTOM_TARIFF_ID_KEY", "Ljava/lang/String;", "ERROR_CODE_KEY", "LOCATION_ID_KEY", "PRICE_KEY", "TERMS_TYPE_KEY", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mv.b$a */
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
    public C14534b() {
    }

    @Override // Mv.InterfaceC14533a
    @Y61.k
    public final String a(int i12, @Y61.l String str, @Y61.l Long l12, @Y61.l Long l13, @Y61.l String str2, @Y61.l Long l14) {
        String strConcat = str != null ? str.toUpperCase(Locale.ROOT).concat(":") : null;
        String str3 = "";
        if (strConcat == null) {
            strConcat = "";
        }
        LinkedHashMap linkedHashMapC = C35755b0.c(P0.g(new Q("code", Integer.valueOf(i12)), new Q("l_id", l12), new Q("c_id", l13), new Q("terms", str2), new Q("price", l14)));
        if (!linkedHashMapC.isEmpty()) {
            str3 = ";" + linkedHashMapC;
        }
        return r.q(strConcat, str3);
    }
}
