package kotlinx.datetime.internal.format.parser;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Parser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/datetime/internal/format/parser/l;", "it", "", "invoke", "(Lkotlinx/datetime/internal/format/parser/l;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class q extends N implements Y41.l<l, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final q f412580l = new q();

    public q() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final CharSequence invoke(l lVar) {
        l lVar2 = lVar;
        StringBuilder sb2 = new StringBuilder("position ");
        sb2.append(lVar2.f412571a);
        sb2.append(": '");
        return C22026a.c(sb2, (String) lVar2.f412572b.invoke(), '\'');
    }
}
