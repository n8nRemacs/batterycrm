package shark;

import kotlin.Metadata;

/* compiled from: AndroidServices.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lshark/X1;", "heapValue", "", "invoke", "(ILshark/X1;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.l1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48313l1 extends kotlin.jvm.internal.N implements Y41.p<Integer, X1, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48313l1 f438649l = new C48313l1();

    public C48313l1() {
        super(2);
    }

    @Override // Y41.p
    public final Boolean invoke(Integer num, X1 x12) {
        return Boolean.valueOf(num.intValue() % 2 == 1 && x12.g());
    }
}
