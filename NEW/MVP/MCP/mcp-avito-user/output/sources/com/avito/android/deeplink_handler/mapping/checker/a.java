package com.avito.android.deeplink_handler.mapping.checker;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lv.C43834a;
import mv.C44139a;

/* compiled from: AppDeeplinkMappingRegistrationChecker.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/mapping/checker/a;", "Lcom/avito/android/deeplink_handler/mapping/checker/c;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44139a f134583a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f134584b = C42727D.c(new C4052a());

    /* compiled from: AppDeeplinkMappingRegistrationChecker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.mapping.checker.a$a, reason: collision with other inner class name */
    public static final class C4052a extends N implements Y41.a<Set<Class<DeepLink>>> {
        public C4052a() {
            super(0);
        }

        @Override // Y41.a
        public final Set<Class<DeepLink>> invoke() {
            Set<C43834a> setA = a.this.f134583a.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setA) {
                if (((C43834a) obj).f414238c != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((C43834a) it.next()).f414236a);
            }
            return linkedHashSet;
        }
    }

    @Inject
    public a(@k C44139a c44139a) {
        this.f134583a = c44139a;
    }

    @Override // com.avito.android.deeplink_handler.mapping.checker.c
    public final boolean a(@k DeepLink deepLink) {
        return C42745f0.r((Set) this.f134584b.getValue(), deepLink.getClass());
    }
}
