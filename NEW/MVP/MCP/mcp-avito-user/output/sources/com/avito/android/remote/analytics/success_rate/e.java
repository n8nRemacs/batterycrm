package com.avito.android.remote.analytics.success_rate;

import Y41.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UrlsCountMaps.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
final class e extends N implements l<Map.Entry<? extends String, ? extends Integer>, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f253259l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Map.Entry<? extends String, ? extends Integer> entry) {
        Map.Entry<? extends String, ? extends Integer> entry2 = entry;
        return "\"" + entry2.getKey() + "\":\"" + entry2.getValue().intValue() + '\"';
    }
}
