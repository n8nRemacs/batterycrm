package coil.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.request.C27245b;
import coil.view.C27250d;
import coil.view.InterfaceC27254h;
import coil.view.InterfaceC27256j;
import coil.view.Precision;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m.C43852a;

/* compiled from: Requests.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C27245b f58780a = new C27245b(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    /* compiled from: Requests.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Precision.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Precision precision = Precision.f58750b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Precision precision2 = Precision.f58750b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final boolean a(@Y61.k coil.request.p pVar) {
        int iOrdinal = pVar.f58667i.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC27254h interfaceC27254h = pVar.f58657L.f58637a;
            InterfaceC27254h interfaceC27254h2 = pVar.f58647B;
            if (interfaceC27254h != null || !(interfaceC27254h2 instanceof C27250d)) {
                K2.c cVar = pVar.f58661c;
                if (!(cVar instanceof K2.d) || !(interfaceC27254h2 instanceof InterfaceC27256j)) {
                    return false;
                }
                K2.d dVar = (K2.d) cVar;
                if (!(dVar.getView() instanceof ImageView) || dVar.getView() != ((InterfaceC27256j) interfaceC27254h2).getView()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Y61.l
    public static final Drawable b(@Y61.k coil.request.p pVar, @Y61.l Drawable drawable, @InterfaceC42165v @Y61.l Integer num, @Y61.l Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context context = pVar.f58659a;
        int iIntValue = num.intValue();
        Drawable drawableA = C43852a.a(context, iIntValue);
        if (drawableA != null) {
            return drawableA;
        }
        throw new IllegalStateException(AK.c.g(iIntValue, "Invalid resource ID: ").toString());
    }
}
