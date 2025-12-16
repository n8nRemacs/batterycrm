package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: KCallable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/c;", "R", "Lkotlin/reflect/b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface c<R> extends b {

    /* compiled from: KCallable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    R call(@Y61.k Object... objArr);

    R callBy(@Y61.k Map<KParameter, ? extends Object> map);

    @Y61.k
    String getName();

    @Y61.k
    List<KParameter> getParameters();

    @Y61.k
    r getReturnType();

    @Y61.k
    List<s> getTypeParameters();

    @Y61.l
    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
