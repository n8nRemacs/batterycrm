package com.airbnb.lottie;

import android.content.Context;
import arrow.core.Z0;
import com.avito.android.messenger.conversation.mvi.data.d0;
import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.remote.model.SerpDisplayType;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.C42784z0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.airbnb.lottie.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class CallableC27295o implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59912c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f59913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f59914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f59915f;

    public /* synthetic */ CallableC27295o(int i12, Object obj, int i13, Object obj2, Object obj3) {
        this.f59911b = i13;
        this.f59914e = obj;
        this.f59915f = obj2;
        this.f59912c = obj3;
        this.f59913d = i12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i12 = this.f59913d;
        Object obj = this.f59912c;
        Object obj2 = this.f59915f;
        Object obj3 = this.f59914e;
        switch (this.f59911b) {
            case 0:
                HashMap map = C27296p.f59916a;
                Context context = (Context) ((WeakReference) obj3).get();
                if (context == null) {
                    context = (Context) obj2;
                }
                return C27296p.g(context, i12, (String) obj);
            case 1:
                MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj2;
                UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
                return Z0.b(((d0) obj3).f190454a.F(messengerUserHashInfo.f430682d, (String) obj, i12, userEntityTypeG));
            default:
                com.avito.android.serp.j jVar = (com.avito.android.serp.j) obj3;
                List listA = jVar.f273953c.a(i12, jVar.f273952b.a(i12, jVar.f273951a.a((List) obj2, (SerpDisplayType) obj, null, null, false, C42784z0.f406748b)));
                jVar.f273954d.b(listA);
                jVar.f273955e.b(listA);
                return listA;
        }
    }

    public /* synthetic */ CallableC27295o(WeakReference weakReference, Context context, int i12, String str) {
        this.f59911b = 0;
        this.f59914e = weakReference;
        this.f59915f = context;
        this.f59913d = i12;
        this.f59912c = str;
    }
}
