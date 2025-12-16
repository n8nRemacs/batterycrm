package e11;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class F1<T> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f394350a;

    /* renamed from: b, reason: collision with root package name */
    public int f394351b = -1;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public T f394352c;

    @j.P
    public abstract Object a(@j.N String str, @j.P String str2, @j.P HashMap map, @j.N Context context);

    @j.P
    public final Object b(@j.N String str, @j.P String str2, @j.P HashMap map, @j.N Context context) {
        this.f394350a = true;
        this.f394351b = -1;
        this.f394352c = null;
        return a(str, str2, map, context);
    }
}
