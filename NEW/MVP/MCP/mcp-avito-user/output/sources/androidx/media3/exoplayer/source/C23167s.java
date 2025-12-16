package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23167s {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f49826b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f49827a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C23167s(long j12, androidx.media3.datasource.o oVar) {
        this(j12, Collections.emptyMap());
        Uri uri = oVar.f48245a;
    }

    public C23167s(long j12, Map map) {
        this.f49827a = map;
    }
}
