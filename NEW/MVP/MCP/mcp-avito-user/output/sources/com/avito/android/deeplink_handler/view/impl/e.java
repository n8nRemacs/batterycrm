package com.avito.android.deeplink_handler.view.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.result.ActivityResult;
import com.avito.android.deeplink_handler.view.impl.f;
import com.avito.android.user_address.deeplink.sx_new_address.SxAddAddressPayload;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import rv.C47920c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class e implements androidx.view.result.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f134610b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f134611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f134612d;

    public /* synthetic */ e(Context context, com.avito.android.user_address.deeplink.sx_new_address.a aVar) {
        this.f134611c = context;
        this.f134612d = aVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.view.result.a
    public final void a(Object obj) {
        Bundle extras;
        Object obj2 = this.f134611c;
        Object obj3 = this.f134612d;
        switch (this.f134610b) {
            case 0:
                Map map = (Map) obj;
                f.a aVar = f.f134613f;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    arrayList.add(new Q(str, new C47920c(((Boolean) entry.getValue()).booleanValue(), ((Boolean) ((N) obj3).invoke(str)).booleanValue())));
                }
                ((f) obj2).f134615c.onNext(P0.p(arrayList));
                break;
            default:
                Intent intent = ((ActivityResult) obj).f21243c;
                SxAddAddressPayload sxAddAddressPayload = (intent == null || (extras = intent.getExtras()) == null) ? null : (SxAddAddressPayload) extras.getParcelable("result.user_address");
                SxAddAddressPayload sxAddAddressPayload2 = sxAddAddressPayload != null ? sxAddAddressPayload : null;
                System.out.println(sxAddAddressPayload2);
                if (sxAddAddressPayload2 != null) {
                    com.avito.android.user_address.deeplink.sx_new_address.a aVar2 = (com.avito.android.user_address.deeplink.sx_new_address.a) obj3;
                    Intent intentC = aVar2.f307278h.c((Context) obj2, sxAddAddressPayload2.f307268b, sxAddAddressPayload2.f307269c, sxAddAddressPayload2.f307270d, sxAddAddressPayload2.f307271e, sxAddAddressPayload2.f307272f, sxAddAddressPayload2.f307273g, sxAddAddressPayload2.f307274h, sxAddAddressPayload2.f307275i);
                    intentC.addFlags(1073741824);
                    androidx.view.result.h<Intent> hVar = aVar2.f307280j;
                    if (hVar != null) {
                        hVar.b(intentC);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e(f fVar, Y41.l lVar) {
        this.f134611c = fVar;
        this.f134612d = (N) lVar;
    }
}
