package vb1;

import Y61.k;
import Y61.l;
import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoginManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lvb1/b;", "", "a", "library_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: vb1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49297b {

    /* renamed from: a, reason: collision with root package name */
    public final wb1.b f440874a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f440875b;

    /* renamed from: c, reason: collision with root package name */
    public final long f440876c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<String> f440877d;

    /* renamed from: e, reason: collision with root package name */
    public final String f440878e;

    /* renamed from: f, reason: collision with root package name */
    public final String f440879f;

    /* renamed from: g, reason: collision with root package name */
    public final String f440880g;

    /* compiled from: LoginManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvb1/b$a;", "", "library_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: vb1.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public Set<String> f440881a = B0.f406639b;

        /* renamed from: b, reason: collision with root package name */
        public long f440882b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f440883c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f440884d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f440885e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final Context f440886f;

        public a(@k Context context) {
            this.f440886f = context;
        }
    }

    public C49297b() {
        throw null;
    }

    public C49297b(a aVar, C42822w c42822w) {
        Context context = aVar.f440886f;
        long j12 = aVar.f440882b;
        Set<String> set = aVar.f440881a;
        String str = aVar.f440883c;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        String str2 = aVar.f440884d;
        if (str2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        String str3 = aVar.f440885e;
        if (str3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
        this.f440875b = context;
        this.f440876c = j12;
        this.f440877d = set;
        this.f440878e = str;
        this.f440879f = str2;
        this.f440880g = str3;
        this.f440874a = new wb1.b();
    }
}
