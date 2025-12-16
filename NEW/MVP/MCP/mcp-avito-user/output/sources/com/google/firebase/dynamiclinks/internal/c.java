package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36703g;

/* compiled from: DynamicLinksApi.java */
/* loaded from: classes5.dex */
public class c extends com.google.android.gms.common.api.h<C36616a.d.C10620d> {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a<C36616a.d.C10620d> f361531k = new C36616a<>("DynamicLinks.API", new a(), new C36616a.g());

    /* compiled from: DynamicLinksApi.java */
    public class a extends C36616a.AbstractC10618a<d, C36616a.d.C10620d> {
        @Override // com.google.android.gms.common.api.C36616a.AbstractC10618a
        public final C36616a.f buildClient(Context context, Looper looper, C36703g c36703g, C36616a.d.C10620d c10620d, i.b bVar, i.c cVar) {
            return new d(context, looper, 131, c36703g, bVar, cVar);
        }
    }
}
