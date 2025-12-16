package com.avito.android.ux.feedback.impl;

import Cb1.j;
import Fc1.C13611f5;
import Fc1.C13641j;
import Fc1.C13650k;
import Fc1.C13651k0;
import Fc1.C13682n4;
import Fc1.C13683n5;
import Fc1.C13729s7;
import Fc1.E1;
import Fc1.U1;
import android.app.Activity;
import com.avito.android.InterfaceC32900o;
import com.avito.android.account.G;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.util.V2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import xyz.n.a.j2;

/* compiled from: AvitoUxFeedbackImpl.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ux/feedback/impl/d;", "LSK0/b;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements SK0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f319143a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f319144b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final VK0.a f319145c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32900o f319146d;

    /* compiled from: AvitoUxFeedbackImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/ux/feedback/impl/d$a;", "", "<init>", "()V", "", "ATTR_APP_VERSION", "Ljava/lang/String;", "ATTR_HASH_USER_ID", "ATTR_USER_ID", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k b bVar, @Y61.k G g12, @Y61.k VK0.a aVar, @Y61.k InterfaceC32900o interfaceC32900o) {
        this.f319143a = bVar;
        this.f319144b = g12;
        this.f319145c = aVar;
        this.f319146d = interfaceC32900o;
    }

    @Override // SK0.b
    public final void a(@Y61.k SK0.c cVar, @Y61.l SK0.a aVar, @Y61.l SK0.f fVar, @Y61.l SK0.d dVar) {
        C13651k0 c13651k0;
        q qVar;
        C13651k0 c13651k02;
        LinkedHashMap linkedHashMap;
        VK0.a aVar2 = this.f319145c;
        aVar2.getClass();
        kotlin.reflect.n<Object>[] nVarArr = VK0.a.f17075f;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        if (!((Boolean) aVar2.f17077c.a().invoke()).booleanValue()) {
            if (dVar != null) {
                dVar.W2(cVar.getF393827a());
                return;
            }
            return;
        }
        kotlin.reflect.n<Object> nVar2 = nVarArr[3];
        if (((Boolean) aVar2.f17079e.a().invoke()).booleanValue()) {
            V2.f318762a.c("AvitoUxFeedbackLog", "Call startCampaign: eventName = " + cVar.getF393827a() + ", attributes = " + aVar + ", properties = " + fVar, null);
        }
        ProfileInfo profileInfoE = this.f319144b.e();
        String userId = profileInfoE.getUserId();
        String userHashId = profileInfoE.getUserHashId();
        String value = this.f319146d.f().getValue();
        if (this.f319143a.f319136a) {
            Cb1.j.f2347a.getClass();
            c13651k0 = j.a.f2349b;
        } else {
            c13651k0 = null;
        }
        if (c13651k0 != null) {
            C13729s7 c13729s7 = c13651k0.f5622c;
            if (c13729s7 == null) {
                c13729s7 = null;
            }
            qVar = c13729s7.f5825a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            qVar = null;
        }
        if (qVar != null) {
            String f393827a = cVar.getF393827a();
            qVar.f319169d = dVar;
            qVar.f319168c.put(f393827a, new r(fVar, userId, userHashId, value));
        }
        if (this.f319143a.f319136a) {
            Cb1.j.f2347a.getClass();
            c13651k02 = j.a.f2349b;
        } else {
            c13651k02 = null;
        }
        if (c13651k02 != null) {
            String f393827a2 = cVar.getF393827a();
            Cb1.a aVar3 = new Cb1.a();
            if (aVar != null) {
                Iterator it = aVar.f14900a.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashMap = aVar3.f2291a;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put((String) entry.getKey(), (Date) entry.getValue());
                }
                for (Map.Entry entry2 : aVar.f14901b.entrySet()) {
                    String str = (String) entry2.getKey();
                    Boolean bool = (Boolean) entry2.getValue();
                    bool.getClass();
                    linkedHashMap.put(str, bool);
                }
                for (Map.Entry entry3 : aVar.f14902c.entrySet()) {
                    aVar3.f2291a.put((String) entry3.getKey(), Double.valueOf(((Number) entry3.getValue()).doubleValue()));
                }
                for (Map.Entry entry4 : aVar.f14903d.entrySet()) {
                    linkedHashMap.put((String) entry4.getKey(), Float.valueOf(((Number) entry4.getValue()).floatValue()));
                }
                for (Map.Entry entry5 : aVar.f14904e.entrySet()) {
                    linkedHashMap.put((String) entry5.getKey(), Integer.valueOf(((Number) entry5.getValue()).intValue()));
                }
                for (Map.Entry entry6 : aVar.f14905f.entrySet()) {
                    aVar3.f2291a.put((String) entry6.getKey(), (String) entry6.getValue());
                }
            }
            kotlin.reflect.n<Object> nVar3 = VK0.a.f17075f[2];
            if (((Boolean) aVar2.f17078d.a().invoke()).booleanValue() && userId != null) {
                aVar3.f2291a.put("user_id", userId);
            }
            if (userHashId != null) {
                aVar3.f2291a.put("hash_user_id", userHashId);
            }
            Double dW02 = C43066x.w0(value);
            if (dW02 != null) {
                aVar3.f2291a.put("app_version", Double.valueOf(dW02.doubleValue()));
            }
            C13641j c13641j = c13651k02.f5621b;
            if (c13641j == null) {
                c13641j = null;
            }
            C13682n4 c13682n4 = new C13682n4(aVar3);
            C13611f5 c13611f5 = c13641j.f5585b;
            if (c13611f5 == null) {
                c13611f5 = null;
            }
            c13611f5.c(j2.CAMPAIGN_STARTING, f393827a2);
            if (!aVar3.f2291a.isEmpty()) {
                C13611f5 c13611f52 = c13641j.f5585b;
                if (c13611f52 == null) {
                    c13611f52 = null;
                }
                j2 j2Var = j2.CAMPAIGN_ATTRIBUTES;
                LinkedHashMap linkedHashMap2 = aVar3.f2291a;
                ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry7 : linkedHashMap2.entrySet()) {
                    arrayList.add(entry7.getValue() instanceof Date ? new Q(entry7.getKey(), new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format((Date) entry7.getValue())) : new Q(entry7.getKey(), entry7.getValue()));
                }
                c13611f52.c(j2Var, P0.p(arrayList).toString());
            }
            C13683n5 c13683n5 = c13641j.f5589f;
            if (c13683n5 == null) {
                c13683n5 = null;
            }
            Activity activityD = c13683n5.f5701a.d();
            if (!(activityD != null ? activityD.getWindow().getDecorView().getRootView().isShown() : false)) {
                C13611f5 c13611f53 = c13641j.f5585b;
                (c13611f53 != null ? c13611f53 : null).b(j2.ACTIVITY_IS_NOT_PRESENT);
                return;
            }
            U1 u12 = c13641j.f5588e;
            if (u12 == null) {
                u12 = null;
            }
            C13650k c13650k = new C13650k(c13641j, f393827a2, c13682n4, null);
            u12.getClass();
            u12.f5212d.put(f393827a2, C43259k.d(u12.f5213e, null, null, new E1(u12, f393827a2, c13650k, null), 3));
        }
    }
}
