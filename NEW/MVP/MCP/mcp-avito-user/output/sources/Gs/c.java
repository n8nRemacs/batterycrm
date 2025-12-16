package Gs;

import Y61.k;
import com.avito.android.util.C35743a3;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: CriticalSections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGs/c;", "", "<init>", "()V", "_common_critical-sections_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f6754a = new c();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashSet f6755b = new LinkedHashSet();

    public static void a(@k String str) {
        if (!C35743a3.a()) {
            throw new IllegalStateException("Check failed.");
        }
        f6755b.remove(C13912a.a(str));
    }

    public static void b(@k String str) {
        if (!C35743a3.a()) {
            throw new IllegalStateException("Check failed.");
        }
        f6755b.add(C13912a.a(str));
    }
}
