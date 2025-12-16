package ru.cyberity.cbr.core.common;

import java.util.regex.Pattern;
import kotlin.Metadata;

/* compiled from: HTMLHelper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/common/d0;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "f", "Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;", "htmlPattern", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d0 f432657a = new d0();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private static final Pattern htmlPattern = Pattern.compile("(<\\w+((\\s+\\w+(\\s*=\\s*(?:\".*?\"|'.*?'|[^'\">\\s]+))?)+\\s*|\\s*)>.*</\\w+>)|(<\\w+((\\s+\\w+(\\s*=\\s*(?:\".*?\"|'.*?'|[^'\">\\s]+))?)+\\s*|\\s*)/>)|(&[a-zA-Z][a-zA-Z0-9]+;)", 32);

    private d0() {
    }

    @Y61.k
    public final Pattern a() {
        return htmlPattern;
    }
}
