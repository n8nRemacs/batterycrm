package androidx.view;

import Y61.k;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: Lifecycling.jvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/X;", "", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* renamed from: androidx.lifecycle.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22990X {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C22990X f46717a = new C22990X();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final HashMap f46718b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final HashMap f46719c = new HashMap();

    public static InterfaceC23075z a(Constructor constructor, InterfaceC22982O interfaceC22982O) {
        try {
            return (InterfaceC23075z) constructor.newInstance(interfaceC22982O);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException(e12);
        } catch (InstantiationException e13) {
            throw new RuntimeException(e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(e14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C22990X.b(java.lang.Class):int");
    }
}
