package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Caller.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Member;", "M", "", "", "args", "Lkotlin/G0;", "checkArguments", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface e<M extends Member> {

    /* compiled from: Caller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <M extends Member> void a(@Y61.k e<? extends M> eVar, @Y61.k Object[] objArr) {
            if (eVar.a().size() == objArr.length) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("Callable expects ");
            sb2.append(eVar.a().size());
            sb2.append(" arguments, but ");
            throw new IllegalArgumentException(AK.c.i(objArr.length, " were provided.", sb2));
        }
    }

    @Y61.k
    List<Type> a();

    M b();

    @Y61.l
    Object call(@Y61.k Object[] objArr);

    @Y61.k
    Type getReturnType();
}
