package Nr0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.vertical_main.analytics.WidgetPageSource;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: VerticalMainAnyActionWidgetEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNr0/e;", "LNr0/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends d {

    /* renamed from: c, reason: collision with root package name */
    public final int f11765c;

    public e(int i12, @Y61.k WidgetPageSource widgetPageSource, @l Integer num, @l Integer num2, @l Long l12, @l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @Y61.k LinkedHashMap linkedHashMap) {
        super(widgetPageSource, num, num2, l12, str, str2, str3, str4, str5, str6, linkedHashMap);
        this.f11765c = i12;
    }

    @Override // Nr0.d, com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF11770c() {
        return this.f11765c;
    }
}
