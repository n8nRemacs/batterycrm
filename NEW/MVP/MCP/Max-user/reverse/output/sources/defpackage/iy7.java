package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface iy7 extends hy7 {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    bz7 getReturnType();

    List getTypeParameters();

    cz7 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
