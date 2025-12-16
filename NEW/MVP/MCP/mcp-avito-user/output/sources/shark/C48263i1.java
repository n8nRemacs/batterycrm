package shark;

import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AndroidReferenceMatchers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lshark/b;", "", "invoke", "(Lshark/b;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48263i1 extends kotlin.jvm.internal.N implements Y41.l<C48233b, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48263i1 f438289l = new C48263i1();

    public C48263i1() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(C48233b c48233b) {
        C48233b c48233b2 = c48233b;
        return Boolean.valueOf(C42745f0.U("HMD Global", "INFINIX", "LENOVO", "Xiaomi", "TES", "realme").contains(c48233b2.f438238a) && c48233b2.f438239b >= 30);
    }
}
