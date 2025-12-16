package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.text_message;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f192612l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<e> f192613m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f192614n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f192615o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f192616p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f192617q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f192618r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, List list, Y41.l lVar, Y41.l lVar2, v vVar, Y41.a aVar, boolean z12, int i12) {
        super(2);
        this.f192612l = str;
        this.f192613m = list;
        this.f192614n = lVar;
        this.f192615o = lVar2;
        this.f192616p = vVar;
        this.f192617q = aVar;
        this.f192618r = z12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        Y41.a<G0> aVar = this.f192617q;
        List<e> list = this.f192613m;
        Y41.l<String, G0> lVar = this.f192614n;
        Y41.l<String, G0> lVar2 = this.f192615o;
        p.c(this.f192612l, list, lVar, lVar2, aVar, this.f192618r, a12, iA2);
        return G0.f406611a;
    }
}
