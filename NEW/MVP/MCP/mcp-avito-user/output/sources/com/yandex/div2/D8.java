package com.yandex.div2;

import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.service_booking_calendar.view.day.DayItemContent;
import com.google.firebase.datatransport.TransportRegistrar;
import com.huawei.hms.support.log.HMSLog;
import com.yandex.div2.F8;
import com.yandex.div2.H8;
import com.yandex.div2.J8;
import com.yandex.mobile.ads.exo.drm.g;
import com.yandex.mobile.ads.exo.drm.m;
import ft0.InterfaceC40478a;
import i81.InterfaceC41245e;
import java.util.List;
import java.util.UUID;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.type.TypeDescription;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class D8 implements com.yandex.div.internal.parser.F, g.b, m.c, InterfaceC40478a.InterfaceC11180a, InterfaceC40478a.b, JK.j, com.google.firebase.components.f, InterfaceC41245e.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f371174b;

    public /* synthetic */ D8(int i12) {
        this.f371174b = i12;
    }

    public static int h(net.bytebuddy.description.method.a aVar, int i12, int i13) {
        return (aVar.hashCode() + i12) * i13;
    }

    public static int i(TypeDescription.Generic generic, int i12, int i13) {
        return (generic.hashCode() + i12) * i13;
    }

    public static int j(TypeDescription typeDescription, int i12, int i13) {
        return (typeDescription.hashCode() + i12) * i13;
    }

    public static OptimalRuntimeTypeAdapterFactory k(Class cls, Class cls2, String str, Class cls3, String str2) {
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(cls);
        optimalRuntimeTypeAdapterFactory.b(cls2, str);
        optimalRuntimeTypeAdapterFactory.b(cls3, str2);
        return optimalRuntimeTypeAdapterFactory;
    }

    public static Object l(Class cls, AnnotationValue annotationValue, Class cls2) {
        return annotationValue.r(cls.getClassLoader()).b(cls2);
    }

    public static String m(String str, net.bytebuddy.description.method.a aVar) {
        return str + aVar;
    }

    public static String n(String str, TypeDescription.Generic.f fVar) {
        return str + fVar;
    }

    public static String o(String str, TypeDescription typeDescription) {
        return str + typeDescription;
    }

    public static String p(String str, org.threeten.bp.temporal.h hVar) {
        return str + hVar;
    }

    public static void q(Exception exc, StringBuilder sb2, String str) {
        sb2.append(exc.getMessage());
        HMSLog.e(str, sb2.toString());
    }

    public static void r(List list, StringBuilder sb2, String str) {
        sb2.append(list.size());
        sb2.append(str);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m.c
    public com.yandex.mobile.ads.exo.drm.m a(UUID uuid) {
        return com.yandex.mobile.ads.exo.drm.n.b(uuid);
    }

    @Override // JK.j
    public Object b(Object obj) {
        switch (this.f371174b) {
            case 18:
                break;
            default:
                break;
        }
        return kotlin.G0.f406611a;
    }

    @Override // i81.InterfaceC41245e.b
    public Object d(InterfaceC41245e.a aVar) {
        return aVar.newInstance();
    }

    @Override // ft0.InterfaceC40478a.b
    public String e(org.threeten.bp.e eVar) {
        fu0.d.f396183a.getClass();
        return fu0.d.f396184b.getMonths()[eVar.f421942c - 1];
    }

    @Override // ft0.InterfaceC40478a.InterfaceC11180a
    public DayItemContent f(org.threeten.bp.e eVar) {
        return new com.avito.android.service_booking_calendar.view.day.k(String.valueOf((int) eVar.f421943d), null, null, null, false, 30, null);
    }

    @Override // com.yandex.div.internal.parser.F
    public boolean g(Object obj) {
        String str = (String) obj;
        switch (this.f371174b) {
            case 0:
                D8 d82 = E8.f372252c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 1:
                D8 d83 = E8.f372252c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 2:
                F8.b bVar = F8.f372303c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 3:
                D8 d84 = G8.f372492c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 4:
                D8 d85 = G8.f372492c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 5:
                H8.b bVar2 = H8.f372534c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 6:
                D8 d86 = I8.f372602c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 7:
                D8 d87 = I8.f372602c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 8:
                J8.b bVar3 = J8.f372630c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            case 9:
                D8 d88 = K8.f372718c;
                if (str.length() >= 1) {
                    break;
                }
                break;
            default:
                D8 d89 = K8.f372718c;
                if (str.length() >= 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.exo.drm.g.b
    public void release() {
        g.b.lambda$static$0();
    }

    @Override // com.google.firebase.components.f
    public Object a(com.google.firebase.components.c cVar) {
        return TransportRegistrar.lambda$getComponents$0(cVar);
    }
}
