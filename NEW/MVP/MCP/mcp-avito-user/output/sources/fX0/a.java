package FX0;

import Y41.p;
import android.content.Context;
import android.text.Layout;
import android.widget.TextView;
import androidx.camera.core.F;
import androidx.camera.core.processing.k;
import androidx.camera.core.processing.s;
import androidx.concurrent.futures.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.C23538b;
import androidx.work.impl.C23612w;
import androidx.work.impl.InterfaceC23590u;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C23580w;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.I5;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.y;
import com.my.tracker.obfuscated.C37828b0;
import com.my.tracker.obfuscated.C37848w;
import com.my.tracker.obfuscated.f2;
import com.my.tracker.obfuscated.g1;
import com.my.tracker.obfuscated.k0;
import com.my.tracker.personalize.PersonalizeApiClient;
import com.my.tracker.personalize.PersonalizeRequest;
import com.my.tracker.personalize.PersonalizeResponse;
import com.my.tracker.recsys.OfferRequest;
import com.vk.id.captcha.okhttp.api.HitmanChallengeHandlingInterceptor;
import e11.K1;
import e11.X1;
import e11.k2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4732f;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i12) {
        this.f4728b = i12;
        this.f4729c = obj;
        this.f4730d = obj2;
        this.f4731e = obj3;
        this.f4732f = obj4;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.source.A, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f4732f;
        Object obj2 = this.f4731e;
        ?? r42 = this.f4730d;
        Object obj3 = this.f4729c;
        switch (this.f4728b) {
            case 0:
                r rVar = (r) r42;
                com.google.android.datatransport.i iVar = (com.google.android.datatransport.i) obj2;
                j jVar = (j) obj;
                Logger logger = c.f4737f;
                c cVar = (c) obj3;
                cVar.getClass();
                Logger logger2 = c.f4737f;
                try {
                    m mVar = cVar.f4740c.get(rVar.b());
                    if (mVar == null) {
                        String str = "Transport backend '" + rVar.b() + "' is not registered";
                        logger2.warning(str);
                        iVar.b(new IllegalArgumentException(str));
                    } else {
                        cVar.f4742e.b(new b(cVar, rVar, mVar.b(jVar), i));
                        iVar.b(null);
                    }
                    break;
                } catch (Exception e12) {
                    logger2.warning("Error scheduling event " + e12.getMessage());
                    iVar.b(e12);
                    return;
                }
            case 1:
                F f12 = (F) r42;
                s sVar = (s) obj2;
                b.a aVar = (b.a) obj;
                k kVar = (k) obj3;
                kVar.getClass();
                try {
                    kVar.f24443b.l(f12, sVar);
                    aVar.b(null);
                    break;
                } catch (RuntimeException e13) {
                    aVar.d(e13);
                    return;
                }
            case 2:
                int i12 = C23612w.f56044a;
                List list = (List) obj3;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC23590u) it.next()).h(((C23580w) r42).f55889a);
                }
                C23612w.b((C23538b) obj2, (WorkDatabase) obj, list);
                break;
            case 3:
                int i13 = com.avito.android.profile.pro.impl.screen.item.avito_finance.item.k.f223015h;
                TextView textView = (TextView) r42;
                ((com.avito.android.profile.pro.impl.screen.item.avito_finance.item.k) obj3).getClass();
                Layout layout = textView.getLayout();
                boolean z12 = layout != null && layout.getEllipsisCount(textView.getLineCount() - 1) > 0;
                TextView textView2 = (TextView) obj2;
                Layout layout2 = textView2.getLayout();
                ((SimpleDraweeView) obj).setVisibility((z12 || (layout2 != null && layout2.getEllipsisCount(textView2.getLineCount() - 1) > 0)) ? 8 : 0);
                break;
            case 4:
                com.avito.android.service_booking_common.blueprints.date.s sVar2 = (com.avito.android.service_booking_common.blueprints.date.s) obj3;
                RecyclerView recyclerView = sVar2.f276377h;
                String strD80 = sVar2.D80((Calendar) r42, recyclerView, (LinkedHashMap) obj2);
                if (strD80 == null) {
                    strD80 = "";
                }
                I5.a(sVar2.f276376g, strD80, false);
                com.avito.android.service_booking_common.blueprints.date.s.B80(recyclerView, (p) obj);
                break;
            case 5:
                r42.d(((A.a) obj3).f345902a, (y.b) obj2, (C36557u) obj);
                break;
            case 6:
                C37828b0.a((List) ((ArrayList) obj3), (String) r42, (C37828b0.b) obj2, (Context) obj);
                break;
            case 7:
                k0.a((Context) obj3, (f2) r42, (C37848w) obj2, (g1) obj);
                break;
            case 8:
                ((PersonalizeApiClient) obj3).a((PersonalizeApiClient.OnCompleteListener) r42, (PersonalizeRequest) obj2, (String) obj);
                break;
            case 9:
                ((PersonalizeApiClient) obj3).a((PersonalizeApiClient.OnCompleteListener) r42, (PersonalizeRequest) obj2, (PersonalizeResponse) obj);
                break;
            case 10:
                ((OfferRequest.OnCompleteListener) obj3).onComplete((OfferRequest) r42, (List) obj2, (String) obj);
                break;
            case 11:
                HitmanChallengeHandlingInterceptor.passCaptchaAndGetToken$lambda$2$lambda$0((String) obj3, (String) r42, (AtomicReference) obj2, (HitmanChallengeHandlingInterceptor) obj);
                break;
            default:
                k2 k2Var = k2.f394669a;
                ((k2) obj3).getClass();
                K1 k12 = new K1();
                Iterator it2 = ((ArrayList) r42).iterator();
                while (it2.hasNext()) {
                    k2.b((X1) it2.next(), (HashMap) obj2, k12, (Context) obj);
                }
                break;
        }
    }
}
