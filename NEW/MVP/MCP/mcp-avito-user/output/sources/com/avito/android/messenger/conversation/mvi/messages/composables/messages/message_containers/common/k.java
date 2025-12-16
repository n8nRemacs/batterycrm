package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NonOutgoingMessage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f192364l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f192365m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f192366n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T1.c f192367o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f192368p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f192369q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f192370r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k f192371s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ T1.d.a f192372t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192373u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C22096n f192374v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f192375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Image image, String str, String str2, T1.c cVar, v vVar, String str3, String str4, com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, T1.d.a aVar, Y41.a aVar2, C22096n c22096n, int i12) {
        super(2);
        this.f192364l = image;
        this.f192365m = str;
        this.f192366n = str2;
        this.f192367o = cVar;
        this.f192368p = vVar;
        this.f192369q = str3;
        this.f192370r = str4;
        this.f192371s = kVar;
        this.f192372t = aVar;
        this.f192373u = aVar2;
        this.f192374v = c22096n;
        this.f192375w = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f192375w | 1);
        C22096n c22096n = this.f192374v;
        com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar = this.f192371s;
        T1.d.a aVar = this.f192372t;
        m.a(this.f192364l, this.f192365m, this.f192366n, this.f192367o, this.f192368p, this.f192369q, this.f192370r, kVar, aVar, this.f192373u, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
