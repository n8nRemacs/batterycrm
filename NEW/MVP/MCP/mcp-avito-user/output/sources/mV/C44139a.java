package mv;

import Y61.k;
import android.app.Application;
import com.avito.android.di.C29972i;
import cv.InterfaceC39417a;
import gv.C40740b;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lv.C43834a;

/* compiled from: AppDeeplinkMappingExtractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmv/a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C44139a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f414796a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C40740b f414797b = new C40740b();

    @Inject
    public C44139a(@k Application application) {
        this.f414796a = application;
    }

    @k
    public final Set<C43834a> a() {
        InterfaceC39417a.InterfaceC10999a interfaceC10999aOl = ((InterfaceC39417a.b) C29972i.a(C29972i.b(this.f414796a), InterfaceC39417a.b.class)).ol();
        C40740b c40740b = this.f414797b;
        Set<C43834a> setA = interfaceC10999aOl.a(c40740b).a();
        c40740b.f396941a.a();
        return setA;
    }
}
