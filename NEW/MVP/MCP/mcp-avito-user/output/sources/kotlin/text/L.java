package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Strings.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lkotlin/Q;", "invoke", "(Ljava/lang/CharSequence;I)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class L extends kotlin.jvm.internal.N implements Y41.p<CharSequence, Integer, kotlin.Q<? extends Integer, ? extends Integer>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ char[] f410578l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(char[] cArr) {
        super(2);
        this.f410578l = cArr;
    }

    @Override // Y41.p
    public final kotlin.Q<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        int iC2 = P.c(charSequence, this.f410578l, num.intValue(), false);
        if (iC2 < 0) {
            return null;
        }
        return new kotlin.Q<>(Integer.valueOf(iC2), 1);
    }
}
