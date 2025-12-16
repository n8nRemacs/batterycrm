package androidx.view;

import AK.c;
import X41.n;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.view.AbstractC23301M0;
import j.InterfaceC42153i;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NavigatorProvider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/N0;", "", "<init>", "()V", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.N0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23303N0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f52846b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final LinkedHashMap f52847c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f52848a = new LinkedHashMap();

    /* compiled from: NavigatorProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/navigation/N0$a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static String a(@k Class cls) {
            LinkedHashMap linkedHashMap = C23303N0.f52847c;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                AbstractC23301M0.b bVar = (AbstractC23301M0.b) cls.getAnnotation(AbstractC23301M0.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            return strValue;
        }

        public a() {
        }
    }

    @l
    public final void a(@k AbstractC23301M0 abstractC23301M0) {
        Class<?> cls = abstractC23301M0.getClass();
        f52846b.getClass();
        String strA = a.a(cls);
        if (strA.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f52848a;
        AbstractC23301M0 abstractC23301M02 = (AbstractC23301M0) linkedHashMap.get(strA);
        if (L.f(abstractC23301M02, abstractC23301M0)) {
            return;
        }
        boolean z12 = false;
        if (abstractC23301M02 != null && abstractC23301M02.f52808b) {
            z12 = true;
        }
        if (z12) {
            throw new IllegalStateException(("Navigator " + abstractC23301M0 + " is replacing an already attached " + abstractC23301M02).toString());
        }
        if (!abstractC23301M0.f52808b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + abstractC23301M0 + " is already attached to another NavController").toString());
    }

    @InterfaceC42153i
    @k
    public <T extends AbstractC23301M0<?>> T b(@k String str) {
        f52846b.getClass();
        if (str == null || str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        T t12 = (T) this.f52848a.get(str);
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException(c.k("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
