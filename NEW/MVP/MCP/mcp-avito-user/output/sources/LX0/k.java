package Lx0;

import Sx0.Q;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SellerInfoConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLx0/k;", "", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final k f10300a = new k();

    public static UniversalColor a(Q q12) {
        String valueName = q12.getValueName();
        String valueDark = q12.getValueDark();
        return new UniversalColor(valueName, valueDark != null ? new Color(android.graphics.Color.parseColor(valueDark)) : null, new Color(android.graphics.Color.parseColor(q12.getValue())));
    }
}
