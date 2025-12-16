package cv;

import androidx.fragment.app.Fragment;
import com.avito.android.di.C29972i;
import cv.InterfaceC39417a;
import gv.C40739a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkHandlerDependenciesExtension.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_deeplink-handler"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {
    @Y61.k
    public static final InterfaceC39417a a(@Y61.k androidx.appcompat.app.m mVar) {
        InterfaceC39417a.b bVar = (InterfaceC39417a.b) C29972i.a(C29972i.b(mVar), InterfaceC39417a.b.class);
        return bVar.ol().a(new C40739a(mVar));
    }

    @Y61.k
    public static final InterfaceC39417a b(@Y61.k Fragment fragment) {
        InterfaceC39417a.b bVar = (InterfaceC39417a.b) C29972i.a(C29972i.b(fragment), InterfaceC39417a.b.class);
        return bVar.ol().a(new gv.d(fragment));
    }

    @Y61.k
    public static final d c(@Y61.k androidx.appcompat.app.m mVar) {
        return new d(a(mVar));
    }

    @Y61.k
    public static final d d(@Y61.k Fragment fragment) {
        return new d(b(fragment));
    }
}
