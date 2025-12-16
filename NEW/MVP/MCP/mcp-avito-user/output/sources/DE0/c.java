package DE0;

import Y61.k;
import Y61.l;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImmutableFeature.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LDE0/c;", "T", "LDE0/a;", "_common_features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c<T> implements a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f3106a;

    /* renamed from: b, reason: collision with root package name */
    public final T f3107b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f3108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3109d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f3110e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3111f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Owners f3112g;

    /* renamed from: h, reason: collision with root package name */
    public final T f3113h;

    public c(@k String str, T t12, @k String str2, int i12, @l String str3, boolean z12, @l Owners owners) {
        this.f3106a = str;
        this.f3107b = t12;
        this.f3108c = str2;
        this.f3109d = i12;
        this.f3110e = str3;
        this.f3111f = z12;
        this.f3112g = owners;
        this.f3113h = t12;
    }

    @Override // DE0.a
    @l
    /* renamed from: getApiToggleId, reason: from getter */
    public final String getF3110e() {
        return this.f3110e;
    }

    @Override // DE0.a
    @k
    /* renamed from: getDescription, reason: from getter */
    public final String getF3106a() {
        return this.f3106a;
    }

    @Override // DE0.a
    @k
    /* renamed from: getKey, reason: from getter */
    public final String getF3108c() {
        return this.f3108c;
    }

    @Override // DE0.a
    public final T getOriginalValue() {
        return this.f3113h;
    }

    @Override // DE0.a
    @l
    /* renamed from: getOwner, reason: from getter */
    public final Owners getF3112g() {
        return this.f3112g;
    }

    @Override // DE0.a
    /* renamed from: getPriority, reason: from getter */
    public final int getF3109d() {
        return this.f3109d;
    }

    @Override // DE0.a
    public final T getValue() {
        return this.f3107b;
    }

    @Override // DE0.a
    public final T invoke() {
        return getValue();
    }

    @Override // DE0.a
    /* renamed from: isRemote, reason: from getter */
    public final boolean getF3111f() {
        return this.f3111f;
    }

    public /* synthetic */ c(String str, Object obj, String str2, int i12, String str3, boolean z12, Owners owners, int i13, C42822w c42822w) {
        this(str, obj, str2, i12, (i13 & 16) != 0 ? null : str3, z12, (i13 & 64) != 0 ? null : owners);
    }
}
