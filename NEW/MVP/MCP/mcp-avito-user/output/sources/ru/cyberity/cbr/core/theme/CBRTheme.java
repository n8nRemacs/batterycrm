package ru.cyberity.cbr.core.theme;

import Y61.k;
import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRTheme.kt */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRTheme;", "", "getColors", "", "Lru/cyberity/cbr/core/theme/CBRColorElement;", "Lru/cyberity/cbr/core/theme/CBRThemeColor;", "getFonts", "Lru/cyberity/cbr/core/theme/CBRTypographyElement;", "Lru/cyberity/cbr/core/theme/CBRThemeFont;", "getMetrics", "Lru/cyberity/cbr/core/theme/CBRMetricElement;", "Ljava/lang/Object;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface CBRTheme {
    @k
    Map<CBRColorElement, CBRThemeColor> getColors();

    @k
    Map<CBRTypographyElement, CBRThemeFont> getFonts();

    @k
    Map<CBRMetricElement, Object> getMetrics();
}
