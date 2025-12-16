package kotlin.reflect.full;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: exceptions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/full/NoSuchPropertyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class NoSuchPropertyException extends Exception {
    public NoSuchPropertyException() {
        this(null, 1, null);
    }

    public NoSuchPropertyException(Exception exc, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? null : exc);
    }
}
