package org.threeten.bp.format;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.format.l;

/* compiled from: DateTimeFormatterBuilder.java */
/* loaded from: classes8.dex */
class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.b f422038b;

    public e(l.b bVar) {
        this.f422038b = bVar;
    }

    @Override // org.threeten.bp.format.i
    public final String a(org.threeten.bp.temporal.h hVar, long j12, TextStyle textStyle, Locale locale) {
        Map<Long, String> map = this.f422038b.f422065a.get(textStyle);
        if (map != null) {
            return map.get(Long.valueOf(j12));
        }
        return null;
    }

    @Override // org.threeten.bp.format.i
    public final Iterator<Map.Entry<String, Long>> b(org.threeten.bp.temporal.h hVar, TextStyle textStyle, Locale locale) {
        List list = (List) this.f422038b.f422066b.get(textStyle);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
