package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "needle", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class p0 extends kotlin.jvm.internal.N implements Y41.l<Object, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20736o0 f29518l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(C20736o0 c20736o0) {
        super(1);
        this.f29518l = c20736o0;
    }

    @Override // Y41.l
    public final Integer invoke(Object obj) {
        F f12 = (F) this.f29518l.f29468p.invoke();
        int iP2 = f12.P();
        int i12 = 0;
        while (true) {
            if (i12 >= iP2) {
                i12 = -1;
                break;
            }
            if (f12.getKey(i12).equals(obj)) {
                break;
            }
            i12++;
        }
        return Integer.valueOf(i12);
    }
}
