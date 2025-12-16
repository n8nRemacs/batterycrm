package LY;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35945t1;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessageTimeFormatter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LLY/d;", "Lcom/avito/android/util/t1;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements InterfaceC35945t1<Long> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleDateFormat f9982a;

    public d(@k String str, @k Locale locale) {
        this.f9982a = new SimpleDateFormat(str, locale);
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(Long l12) {
        Long l13 = l12;
        String str = l13 != null ? this.f9982a.format(Long.valueOf(l13.longValue())) : null;
        return str == null ? "" : str;
    }
}
