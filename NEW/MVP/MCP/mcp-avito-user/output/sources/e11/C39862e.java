package e11;

import android.util.LruCache;
import java.util.ArrayList;

/* renamed from: e11.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39862e extends AbstractC39858c1 {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public static final LruCache<String, String> f394574c = new LruCache<>(10);

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final ArrayList<Q0> f394575b = new ArrayList<>();

    @Override // e11.AbstractC39858c1
    public final int a() {
        return this.f394575b.size();
    }
}
