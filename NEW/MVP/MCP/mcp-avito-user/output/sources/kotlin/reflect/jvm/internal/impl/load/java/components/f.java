package kotlin.reflect.jvm.internal.impl.load.java.components;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import k51.m;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42939b;

/* compiled from: JavaAnnotationMapper.kt */
@s0
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final f f408022a = new f();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Object f408023b = P0.g(new Q("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Q(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(KotlinTarget.f407503s, KotlinTarget.f407476E)), new Q("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.f407504t)), new Q("TYPE_PARAMETER", EnumSet.of(KotlinTarget.f407505u)), new Q("FIELD", EnumSet.of(KotlinTarget.f407507w)), new Q("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.f407508x)), new Q("PARAMETER", EnumSet.of(KotlinTarget.f407509y)), new Q("CONSTRUCTOR", EnumSet.of(KotlinTarget.f407510z)), new Q("METHOD", EnumSet.of(KotlinTarget.f407472A, KotlinTarget.f407473B, KotlinTarget.f407474C)), new Q("TYPE_USE", EnumSet.of(KotlinTarget.f407475D)));

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Object f408024c = P0.g(new Q("RUNTIME", KotlinRetention.f407467b), new Q("CLASS", KotlinRetention.f407468c), new Q("SOURCE", KotlinRetention.f407469d));

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Y61.k
    public static C42939b a(@Y61.k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof m) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strB = ((m) it.next()).e().b();
            f408022a.getClass();
            Iterable iterable = (EnumSet) f408023b.get(strB);
            if (iterable == null) {
                iterable = B0.f406639b;
            }
            C42745f0.h(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.k(kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407396v), kotlin.reflect.jvm.internal.impl.name.f.e(((KotlinTarget) it2.next()).name())));
        }
        return new C42939b(e.f408021l, arrayList3);
    }
}
