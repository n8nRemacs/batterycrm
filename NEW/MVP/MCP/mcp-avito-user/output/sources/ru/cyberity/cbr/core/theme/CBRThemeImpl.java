package ru.cyberity.cbr.core.theme;

import Y61.k;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CBRTheme.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/cyberity/cbr/core/theme/CBRThemeImpl;", "Lru/cyberity/cbr/core/theme/CBRThemeHolder;", "<init>", "()V", "", "Lru/cyberity/cbr/core/theme/CBRMetricElement;", "Ljava/lang/Object;", "getMetrics", "()Ljava/util/Map;", "Lru/cyberity/cbr/core/theme/CBRTypographyElement;", "Lru/cyberity/cbr/core/theme/CBRThemeFont;", "getFonts", "Lru/cyberity/cbr/core/theme/CBRColorElement;", "Lru/cyberity/cbr/core/theme/CBRThemeColor;", "getColors", "Ljava/util/HashMap;", "metrics", "Ljava/util/HashMap;", "Lru/cyberity/cbr/core/theme/MetricsScopeImpl;", "MetricsScope", "Lru/cyberity/cbr/core/theme/MetricsScopeImpl;", "getMetricsScope$cyberity_mobile_sdk_publicapi_release", "()Lru/cyberity/cbr/core/theme/MetricsScopeImpl;", "fonts", "Lru/cyberity/cbr/core/theme/FontsScopeImpl;", "FontsScope", "Lru/cyberity/cbr/core/theme/FontsScopeImpl;", "getFontsScope$cyberity_mobile_sdk_publicapi_release", "()Lru/cyberity/cbr/core/theme/FontsScopeImpl;", "colors", "Lru/cyberity/cbr/core/theme/ColorsScopeImpl;", "ColorsScope", "Lru/cyberity/cbr/core/theme/ColorsScopeImpl;", "getColorsScope$cyberity_mobile_sdk_publicapi_release", "()Lru/cyberity/cbr/core/theme/ColorsScopeImpl;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRThemeImpl implements CBRThemeHolder {

    @k
    private final ColorsScopeImpl ColorsScope;

    @k
    private final FontsScopeImpl FontsScope;

    @k
    private final MetricsScopeImpl MetricsScope;

    @k
    private final HashMap<CBRColorElement, CBRThemeColor> colors;

    @k
    private final HashMap<CBRTypographyElement, CBRThemeFont> fonts;

    @k
    private final HashMap<CBRMetricElement, Object> metrics;

    public CBRThemeImpl() {
        HashMap<CBRMetricElement, Object> map = new HashMap<>();
        this.metrics = map;
        this.MetricsScope = new MetricsScopeImpl(map);
        HashMap<CBRTypographyElement, CBRThemeFont> map2 = new HashMap<>();
        this.fonts = map2;
        this.FontsScope = new FontsScopeImpl(map2);
        HashMap<CBRColorElement, CBRThemeColor> map3 = new HashMap<>();
        this.colors = map3;
        this.ColorsScope = new ColorsScopeImpl(map3);
    }

    @Override // ru.cyberity.cbr.core.theme.CBRTheme
    @k
    public Map<CBRColorElement, CBRThemeColor> getColors() {
        return this.colors;
    }

    @Override // ru.cyberity.cbr.core.theme.CBRTheme
    @k
    public Map<CBRTypographyElement, CBRThemeFont> getFonts() {
        return this.fonts;
    }

    @Override // ru.cyberity.cbr.core.theme.CBRTheme
    @k
    public Map<CBRMetricElement, Object> getMetrics() {
        return this.metrics;
    }
}
